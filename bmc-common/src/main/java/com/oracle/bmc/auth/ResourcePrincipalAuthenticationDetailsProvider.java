/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.Region;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.internal.DefaultRptPathProvider;
import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.auth.internal.FileBasedKeySupplier;
import com.oracle.bmc.auth.internal.FileBasedResourcePrincipalFederationClient;
import com.oracle.bmc.auth.internal.FixedContentKeySupplier;
import com.oracle.bmc.auth.internal.FixedContentResourcePrincipalFederationClient;
import com.oracle.bmc.auth.internal.ResourcePrincipalsFederationClient;
import com.oracle.bmc.auth.internal.RptPathProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.internal.GuavaUtils;
import com.oracle.bmc.util.CircuitBreakerUtils;
import com.oracle.bmc.util.internal.NameUtils;
import com.oracle.bmc.util.internal.Validate;

import java.io.File;
import java.time.Duration;
import java.util.Optional;

/**
 * This constructs a default implementation of the {@link ResourcePrincipalAuthenticationDetailsProvider}, constructed
 * in accordance with the following environment variable settings:
 * <ul>
 *
 * <li>{@code OCI_RESOURCE_PRINCIPAL_VERSION}:
 * <p>permitted values are "2.2" and "1.1"</p>
 * </li>
 *
 * For OCI_RESOURCE_PRINCIPAL_VERSION = "2.2",
 * <li>{@code OCI_RESOURCE_PRINCIPAL_RPST}:
 * <p>If this is an absolute path, then the filesystem-supplied resource principal session token will be retrieved from
 *   that location. This mode supports token refresh (if the environment replaces the RPST in the filesystem).</p>
 * <p>Otherwise, the environment variable is taken to hold the raw value of an RPST.
 *   Under these circumstances, the RPST cannot be refreshed; consequently, this mode is only usable for short-lived
 *   executables.</p>
 * </li>
 * <li>{@code OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM}:
 * <p>If this is an absolute path, then the filesystem-supplied private key will be retrieved from that location. As
 *   with the OCI_RESOURCE_PRINCIPAL_RPST, this mode supports token refresh if the environment can update the file
 *   contents.</p>
 * <p>Otherwise, the value is interpreted as the direct injection of a private key. The same considerations as to the
 *   lifetime of this value apply when directly injecting a key.</p>
 * </li>
 * <li>{@code OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE}:
 * <p>This is optional. If set, it contains either the location (as an absolute path) or the value of the passphrase
 *   associated with the private key.</p>
 * </li>
 * <li>{@code OCI_RESOURCE_PRINCIPAL_REGION}:
 * <p>If set, this holds the canonical form of the local region. This is intended to enable executables to locate their
 *   "local" OCI service endpoints.</p>
 * </li>
 *
 * For OCI_RESOURCE_PRINCIPAL_VERSION = "1.1",
 * <li>{@code OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT}:
 * <p>This is required.</p>
 * </li>
 * <li>{@code OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT}:
 * <p>If set, the value from environment variable is used.</p>
 * <p>Otherwise, it uses the default resource principal token path provider.</p>
 * </li>
 *
 * </ul>
 */
@AuthCachingPolicy(cacheKeyId = false, cachePrivateKey = false)
public class ResourcePrincipalAuthenticationDetailsProvider
        extends AbstractRequestingAuthenticationDetailsProvider
        implements RegionProvider, RefreshableOnNotAuthenticatedProvider<String>,
                ConfigurableRefreshOnNotAuthenticatedProvider<String> {

    final static String OCI_RESOURCE_PRINCIPAL_VERSION = "OCI_RESOURCE_PRINCIPAL_VERSION";
    final static String RP_VERSION_2_2 = "2.2";
    final static String OCI_RESOURCE_PRINCIPAL_RPST = "OCI_RESOURCE_PRINCIPAL_RPST";
    final static String OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM = "OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM";
    final static String OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE =
            "OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE";
    final static String OCI_RESOURCE_PRINCIPAL_REGION_ENV_VAR_NAME =
            "OCI_RESOURCE_PRINCIPAL_REGION";
    private static final String RP_VERSION_1_1 = "1.1";
    private static final String OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT =
            "OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT";
    private static final String OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT =
            "OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT";
    private static final String RP_DEBUG_INFORMATION_LOG =
            "\nResource principals authentication can only be used in certain OCI services. Please check that the OCI service you're running this code from supports Resource principals."
                    + "\nSee https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal for more info.";

    /**
     * Returns the region where the java code using resource principal authentication is running at
     *
     * @return Region object.
     */
    private final Region region;

    /**
     * Constructor of ResourcePrincipalAuthenticationDetailsProvider.
     *
     * @param federationClient federation client implementation.
     * @param sessionKeySupplier session key supplier implementation.
     * @param region the region
     */
    ResourcePrincipalAuthenticationDetailsProvider(
            FederationClient federationClient,
            SessionKeySupplier sessionKeySupplier,
            Region region) {
        super(federationClient, sessionKeySupplier);
        this.region = region;
    }

    public Region getRegion() {
        return this.region;
    }

    public static class ClaimKeys {
        /**
         * COMPARTMENT_ID is the claim name that the RPST holds for the resource compartment.
         * This can be passed to {@link #getStringClaim} to retrieve the resource's compartment OCID.
         */
        public final static String COMPARTMENT_ID_CLAIM_KEY = "res_compartment";

        /**
         * TENANT_ID_CLAIM_KEY is the claim name that the RPST holds for the resource tenancy.
         * This can be passed to {@link #getStringClaim} to retrieve the resource's tenancy OCID.
         */
        public final static String TENANT_ID_CLAIM_KEY = "res_tenant";
    }

    public static ResourcePrincipalAuthenticationDetailsProviderBuilder builder() {
        return new ResourcePrincipalAuthenticationDetailsProviderBuilder();
    }

    /**
     * Session tokens carry JWT-like claims. Permit the retrieval of the value of those
     * claims from the token.
     * At the least, the token should carry claims for {@link ClaimKeys#COMPARTMENT_ID_CLAIM_KEY} and {@link ClaimKeys#TENANT_ID_CLAIM_KEY}
     * @param key the name of a claim in the session token
     * @return the claim value.
     */
    public String getStringClaim(String key) {
        return federationClient.getStringClaim(key);
    }

    /**
     * Refreshes the authentication data used by the provider
     *
     * @return the refreshed authentication data
     */
    @Override
    public String refresh() {
        return federationClient.refreshAndGetSecurityToken();
    }

    @Override
    public String refreshIfExpiringWithin(Duration time) {
        return refreshIfExpiringWithin(time, true);
    }

    /**
     * Refreshes the authentication data used by the provider
     *
     * @return the refreshed authentication data
     */
    @Override
    public String refreshIfExpiringWithin(Duration time, boolean refreshKeys) {
        if (federationClient instanceof ProvidesConfigurableRefresh) {
            return ((ProvidesConfigurableRefresh) federationClient)
                    .refreshAndGetSecurityTokenIfExpiringWithin(time, refreshKeys);
        }
        return federationClient.refreshAndGetSecurityToken();
    }

    /**
     * Builder for ResourcePrincipalAuthenticationDetailsProvider that understands the V2.2 configuration
     */
    public static class ResourcePrincipalAuthenticationDetailsProviderBuilder
            extends AbstractFederationClientAuthenticationDetailsProviderBuilder<
                    ResourcePrincipalAuthenticationDetailsProvider
                            .ResourcePrincipalAuthenticationDetailsProviderBuilder,
                    ResourcePrincipalAuthenticationDetailsProvider> {

        ResourcePrincipalAuthenticationDetailsProviderBuilder() {}

        /**
         * The endpoint that can provide the resource principal token.
         *
         * Required.
         */
        private String resourcePrincipalTokenEndpoint;

        /**
         * The path provider for the resource principal token.
         *
         * Defaults to DefaultRptPathProvider if null
         */
        private RptPathProvider resourcePrincipalTokenPathProvider;

        /**
         * The configuration for the circuit breaker.
         */
        private CircuitBreakerConfiguration circuitBreakerConfig;

        /**
         * Configures the resourcePrincipalTokenPathProvider to use.
         */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder
                resourcePrincipalTokenPathProvider(
                        RptPathProvider resourcePrincipalTokenPathProvider) {
            this.resourcePrincipalTokenPathProvider = resourcePrincipalTokenPathProvider;
            return this;
        }

        /**
         * Configures the resourcePrincipalTokenEndpoint to use.
         */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder resourcePrincipalTokenEndpoint(
                String resourcePrincipalTokenEndpoint) {
            this.resourcePrincipalTokenEndpoint = resourcePrincipalTokenEndpoint;
            return this;
        }

        /**
         * Set value for the CircuitBreaker Configuration.
         */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder circuitBreakerConfig(
                CircuitBreakerConfiguration circuitBreakerConfig) {
            this.circuitBreakerConfig = circuitBreakerConfig;
            return this;
        }

        /**
         * Configures the resourcePrincipalTokenEndpoint to use.
         */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder resourcePrincipalTokenEndpoint(
                Service service, Region region) {
            Optional<String> endpoint = GuavaUtils.adaptFromGuava(region.getEndpoint(service));
            return resourcePrincipalTokenEndpoint(endpoint.orElse(null));
        }

        /**
         * Configures the resourcePrincipalSessionTokenEndpoint to use.
         * @deprecated use {@link #federationEndpoint(String)}
         */
        @Deprecated
        public ResourcePrincipalAuthenticationDetailsProviderBuilder
                resourcePrincipalSessionTokenEndpoint(
                        String resourcePrincipalSessionTokenEndpoint) {
            return super.federationEndpoint(resourcePrincipalSessionTokenEndpoint);
        }

        /**
         * Configures the custom leafCertificateSupplier to use.
         */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder leafCertificateSupplier(
                X509CertificateSupplier leafCertificateSupplier) {
            // do not remove this method.  due to compile time resolution, older generated
            // clients will bind to this, not the one in the superclass
            return super.leafCertificateSupplier(leafCertificateSupplier);
        }

        /**
         * Examine the environment of the running process; construct a {@link ResourcePrincipalAuthenticationDetailsProvider}
         * accordingly.
         */
        public ResourcePrincipalAuthenticationDetailsProvider build() {
            final String ociResourcePrincipalVersion =
                    System.getenv(OCI_RESOURCE_PRINCIPAL_VERSION);
            if (ociResourcePrincipalVersion == null) {
                throw new IllegalArgumentException(
                        OCI_RESOURCE_PRINCIPAL_VERSION + " environment variable missing");
            }

            switch (ociResourcePrincipalVersion) {
                case RP_VERSION_2_2:
                    final String ociResourcePrincipalPrivateKey =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM);
                    final String ociResourcePrincipalPassphrase =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE);
                    final String ociResourcePrincipalRPST =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPST);
                    final String ociResourcePrincipalRegion =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_REGION_ENV_VAR_NAME);
                    final String inputType = "environment variable";

                    return build_2_2(
                            ociResourcePrincipalPrivateKey,
                            ociResourcePrincipalPassphrase,
                            ociResourcePrincipalRPST,
                            ociResourcePrincipalRegion,
                            inputType);
                case RP_VERSION_1_1:
                    final String ociResourcePrincipalRptEndpoint =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT);
                    final String ociResourcePrincipalRpstEndpoint =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT);

                    return build_1_1(
                            ociResourcePrincipalRptEndpoint, ociResourcePrincipalRpstEndpoint);
                default:
                    throw new IllegalArgumentException(
                            OCI_RESOURCE_PRINCIPAL_VERSION
                                    + " has unknown value."
                                    + RP_DEBUG_INFORMATION_LOG);
            }
        }

        /**
         * Helper method that interprets the runtime environment to build a v2.2-configured client
         * @return ResourcePrincipalAuthenticationDetailsProvider
         */
        public static ResourcePrincipalAuthenticationDetailsProvider build_2_2(
                String ociResourcePrincipalPrivateKey,
                String ociResourcePrincipalPassphrase,
                String ociResourcePrincipalRPST,
                String ociResourcePrincipalRegion,
                String inputType) {
            final FederationClient federationClient;
            final SessionKeySupplier sessionKeySupplier;
            final Region region;

            if (ociResourcePrincipalPrivateKey == null) {
                throw new IllegalArgumentException(
                        OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM
                                + " "
                                + inputType
                                + " missing."
                                + RP_DEBUG_INFORMATION_LOG);
            }
            if (new File(ociResourcePrincipalPrivateKey).isAbsolute()) {
                if (ociResourcePrincipalPassphrase != null
                        && !new File(ociResourcePrincipalPassphrase).isAbsolute()) {
                    throw new IllegalArgumentException(
                            "Cannot mix path and constant settings for "
                                    + OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM
                                    + " "
                                    + ociResourcePrincipalPrivateKey
                                    + " and "
                                    + OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE
                                    + " "
                                    + ociResourcePrincipalPassphrase
                                    + RP_DEBUG_INFORMATION_LOG);
                }
                sessionKeySupplier =
                        new FileBasedKeySupplier(
                                ociResourcePrincipalPrivateKey, ociResourcePrincipalPassphrase);
            } else {
                final char[] passPhraseChars;
                if (ociResourcePrincipalPassphrase != null) {
                    passPhraseChars = ociResourcePrincipalPassphrase.toCharArray();
                } else {
                    passPhraseChars = null;
                }
                sessionKeySupplier =
                        new FixedContentKeySupplier(
                                ociResourcePrincipalPrivateKey, passPhraseChars);
            }

            if (ociResourcePrincipalRPST == null) {
                throw new IllegalArgumentException(
                        OCI_RESOURCE_PRINCIPAL_RPST
                                + " "
                                + inputType
                                + " missing."
                                + RP_DEBUG_INFORMATION_LOG);
            }
            if (new File(ociResourcePrincipalRPST).isAbsolute()) {
                federationClient =
                        new FileBasedResourcePrincipalFederationClient(
                                sessionKeySupplier, ociResourcePrincipalRPST);
            } else {
                federationClient =
                        new FixedContentResourcePrincipalFederationClient(
                                ociResourcePrincipalRPST, sessionKeySupplier);
            }

            if (ociResourcePrincipalRegion == null) {
                throw new IllegalArgumentException(
                        OCI_RESOURCE_PRINCIPAL_REGION_ENV_VAR_NAME
                                + " "
                                + inputType
                                + " missing."
                                + RP_DEBUG_INFORMATION_LOG);
            } else {
                region =
                        Region.valueOf(
                                NameUtils.canonicalizeForEnumTypes(ociResourcePrincipalRegion));
            }

            return new ResourcePrincipalAuthenticationDetailsProvider(
                    federationClient, sessionKeySupplier, region);
        }

        /**
         * Helper method that interprets the runtime environment to build a v1.1-configured client
         * @return ResourcePrincipalAuthenticationDetailsProvider
         */
        private ResourcePrincipalAuthenticationDetailsProvider build_1_1(
                String ociResourcePrincipalRptEndpoint, String ociResourcePrincipalRpstEndpoint) {
            resourcePrincipalTokenEndpoint = ociResourcePrincipalRptEndpoint;
            if (ociResourcePrincipalRpstEndpoint != null) {
                federationEndpoint = ociResourcePrincipalRpstEndpoint;
            } else {
                federationEndpoint = autoDetectEndpointUsingMetadataUrl();
            }
            sessionKeySupplier = new SessionKeySupplierImpl();
            federationClient = createFederationClient(sessionKeySupplier);
            return buildProvider(sessionKeySupplier);
        }

        @Override
        protected FederationClient createFederationClient(SessionKeySupplier sessionKeySupplier) {
            Validate.notNull(
                    resourcePrincipalTokenEndpoint,
                    "resourcePrincipalTokenEndpoint must not be null");
            if (resourcePrincipalTokenPathProvider == null)
                resourcePrincipalTokenPathProvider = new DefaultRptPathProvider();

            InstancePrincipalsAuthenticationDetailsProvider provider =
                    InstancePrincipalsAuthenticationDetailsProvider.builder()
                            .metadataBaseUrl(getMetadataBaseUrl())
                            .federationEndpoint(federationEndpoint)
                            .leafCertificateSupplier(leafCertificateSupplier)
                            .intermediateCertificateSuppliers(intermediateCertificateSuppliers)
                            .circuitBreakerConfigurator(
                                    circuitBreakerConfig != null
                                            ? circuitBreakerConfig
                                            : CircuitBreakerUtils
                                                    .getDefaultCircuitBreakerConfiguration())
                            // InstancePrincipalsAuthenticationDetailsProvider and ResourcePrincipalsFederationClient's
                            // sessionKeysSupplier must be different. BTW ResourcePrincipalsFederationClient and
                            // ResourcePrincipalAuthenticationDetailsProvider's sessionKeysSupplier must be same.
                            .build();

            return new ResourcePrincipalsFederationClient(
                    resourcePrincipalTokenEndpoint,
                    resourcePrincipalTokenPathProvider,
                    federationEndpoint,
                    sessionKeySupplier,
                    provider,
                    federationClientConfigurator,
                    circuitBreakerConfig);
        }

        @Override
        protected ResourcePrincipalAuthenticationDetailsProvider buildProvider(
                SessionKeySupplier sessionKeySupplierToUse) {
            return new ResourcePrincipalAuthenticationDetailsProvider(
                    federationClient, sessionKeySupplierToUse, region);
        }
    }
}
