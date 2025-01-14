/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.internal.DefaultRptPathProvider;
import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.auth.internal.FileBasedKeySupplier;
import com.oracle.bmc.auth.internal.FileBasedResourcePrincipalFederationClient;
import com.oracle.bmc.auth.internal.FixedContentKeySupplier;
import com.oracle.bmc.auth.internal.FixedContentResourcePrincipalFederationClient;
import com.oracle.bmc.auth.internal.KeyPairAuthenticationDetailProvider;
import com.oracle.bmc.auth.internal.ResourcePrincipalV2FederationClient;
import com.oracle.bmc.auth.internal.ResourcePrincipalsFederationClient;
import com.oracle.bmc.auth.internal.RptPathProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;
import com.oracle.bmc.util.internal.NameUtils;
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.util.internal.Validate;
import org.slf4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Optional;

/**
 * This constructs a default implementation of the {@link
 * ResourcePrincipalAuthenticationDetailsProvider}, constructed in accordance with the following
 * environment variable settings:
 *
 * <ul>
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_VERSION}:
 *       <p>This is required. Permitted values are "1.1", "2.1", "2.1.1", "2.1.2", "2.2" and "3.0"
 *       <p><b>For OCI_RESOURCE_PRINCIPAL_VERSION = "1.1"</b>
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT}:
 *       <p>This is required. The endpoint for retrieving the Resource Principal Token.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT}:
 *       <p>If set, the value from environment variable is used.
 *       <p>Otherwise, it uses the default resource principal token path provider.
 *       <p><b>For OCI_RESOURCE_PRINCIPAL_VERSION = "2.1"</b>
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT}
 *       <p>This is required. The endpoint for retrieving the Resource Principal Token.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT}
 *       <p>This is required. The endpoint for retrieving the Resource Principal Session Token.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RESOURCE_ID}
 *       <p>This is required. The RPv2.1 resource id.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM}
 *       <p>This is required. If this points to existing file path, then the filesystem-supplied
 *       private key will be retrieved from that location.
 *       <p>Otherwise, the value is interpreted as the direct injection of a private key.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE}
 *       <p>This is optional. The passphrase for the private key.
 *       <p><b>For OCI_RESOURCE_PRINCIPAL_VERSION = "2.1.1"</b>
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT}
 *       <p>This is required. The endpoint for retrieving the Resource Principal Token.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT}
 *       <p>This is required. The endpoint for retrieving the Resource Principal Session Token.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RESOURCE_ID}
 *       <p>This is required. The RPv2.1.1 resource id.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_TENANCY_ID}
 *       <p>This is required. The RPv2.1.1 tenancy id.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM}
 *       <p>This is required. If this points to existing file path, then the filesystem-supplied
 *       private key will be retrieved from that location.
 *       <p>Otherwise, the value is interpreted as the direct injection of a private key.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE}
 *       <p>This is optional. The passphrase for the private key.
 *       <p><b>For OCI_RESOURCE_PRINCIPAL_VERSION = "2.1.2"</b>
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT}
 *       <p>This is required. The endpoint for retrieving the Resource Principal Token.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT}
 *       <p>This is required. The endpoint for retrieving the Resource Principal Session Token.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RESOURCE_ID}
 *       <p>This is required. The RPv2.1.2 resource id.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_TENANCY_ID}
 *       <p>This is required. The RPv2.1.2 tenancy id.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_SECURITY_CONTEXT}
 *       <p>Security context is a must for RPv2.1.2. If set via the environment variable, the value
 *       of RPv2.1.2 security context from environment variable is used.
 *       <p>If set via the builder, security context provided via the builder overrides the value
 *       provided via the environment variable.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RPT_PATH}
 *       <p>If set, the value from environment variable is used.
 *       <p>Otherwise, it uses the default resource principal token path {@code
 *       DEFAULT_OCI_RESOURCE_PRINCIPAL_RPT_PATH_FORV212}.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM}
 *       <p>This is required. If this points to existing file path, then the filesystem-supplied
 *       private key will be retrieved from that location.
 *       <p>Otherwise, the value is interpreted as the direct injection of a private key.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE}
 *       <p>This is optional. The passphrase for the private key.
 *       <p><b>For OCI_RESOURCE_PRINCIPAL_VERSION = "2.2"</b>
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_RPST}:
 *       <p>If this points to an existing file path, then the filesystem-supplied resource principal
 *       session token will be retrieved from that location. This mode supports token refresh (if
 *       the environment replaces the RPST in the filesystem).
 *       <p>Otherwise, the environment variable is taken to hold the raw value of an RPST. Under
 *       these circumstances, the RPST cannot be refreshed; consequently, this mode is only usable
 *       for short-lived executables.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM}:
 *       <p>If this points to an existing file path, then the filesystem-supplied private key will
 *       be retrieved from that location. As with the OCI_RESOURCE_PRINCIPAL_RPST, this mode
 *       supports token refresh if the environment can update the file contents.
 *       <p>Otherwise, the value is interpreted as the direct injection of a private key. The same
 *       considerations as to the lifetime of this value apply when directly injecting a key.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE}:
 *       <p>This is optional. If set, it contains either the location (as an existing file path) or
 *       the value of the passphrase associated with the private key.
 *   <li>{@code OCI_RESOURCE_PRINCIPAL_REGION}:
 *       <p>If set, this holds the canonical form of the local region. This is intended to enable
 *       executables to locate their "local" OCI service endpoints.
 * </ul>
 */
@AuthCachingPolicy(cacheKeyId = false, cachePrivateKey = false)
public class ResourcePrincipalAuthenticationDetailsProvider
        extends AbstractRequestingAuthenticationDetailsProvider
        implements RegionProvider,
                RefreshableOnNotAuthenticatedProvider<String>,
                ConfigurableRefreshOnNotAuthenticatedProvider<String> {

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ResourcePrincipalAuthenticationDetailsProvider.class);
    static final String OCI_RESOURCE_PRINCIPAL_VERSION = "OCI_RESOURCE_PRINCIPAL_VERSION";
    static final String RP_VERSION_2_2 = "2.2";
    static final String OCI_RESOURCE_PRINCIPAL_RPST = "OCI_RESOURCE_PRINCIPAL_RPST";
    private static final String OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT =
            "OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT";
    private static final String OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT =
            "OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT";
    private static final String OCI_RESOURCE_PRINCIPAL_RPT_PATH = "OCI_RESOURCE_PRINCIPAL_RPT_PATH";
    static final String OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM = "OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM";
    static final String OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE =
            "OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE";
    static final String OCI_RESOURCE_PRINCIPAL_REGION_ENV_VAR_NAME =
            "OCI_RESOURCE_PRINCIPAL_REGION";
    private static final String OCI_RESOURCE_PRINCIPAL_RESOURCE_ID =
            "OCI_RESOURCE_PRINCIPAL_RESOURCE_ID";
    private static final String OCI_RESOURCE_PRINCIPAL_TENANCY_ID =
            "OCI_RESOURCE_PRINCIPAL_TENANCY_ID";
    private static final String OCI_RESOURCE_PRINCIPAL_SECURITY_CONTEXT =
            "OCI_RESOURCE_PRINCIPAL_SECURITY_CONTEXT";
    private static final String RP_VERSION_1_1 = "1.1";
    protected static final String RP_VERSION_2_1 = "2.1";
    protected static final String RP_VERSION_2_1_1 = "2.1.1";
    protected static final String RP_VERSION_2_1_2 = "2.1.2";
    protected static final String RP_VERSION_3_0 = "3.0";

    private static final String DEFAULT_OCI_RESOURCE_PRINCIPAL_RPT_PATH_FORV212 =
            "20180711/resourcePrincipalTokenV212";

    private static final String RP_DEBUG_INFORMATION_LOG =
            "\nResource principals authentication can only be used in certain OCI services. Please check that the OCI service you're running this code from supports Resource principals."
                    + "\nSee https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal for more info.";

    /**
     * Returns the region where the java code using resource principal authentication is running at
     *
     * @return Region object.
     */
    protected final Region region;

    /**
     * Constructor of ResourcePrincipalAuthenticationDetailsProvider.
     *
     * @param federationClient federation client implementation.
     * @param sessionKeySupplier session key supplier implementation.
     * @param region the region
     */
    public ResourcePrincipalAuthenticationDetailsProvider(
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
         * COMPARTMENT_ID is the claim name that the RPST holds for the resource compartment. This
         * can be passed to {@link #getStringClaim} to retrieve the resource's compartment OCID.
         */
        public static final String COMPARTMENT_ID_CLAIM_KEY = "res_compartment";

        /**
         * TENANT_ID_CLAIM_KEY is the claim name that the RPST holds for the resource tenancy. This
         * can be passed to {@link #getStringClaim} to retrieve the resource's tenancy OCID.
         */
        public static final String TENANT_ID_CLAIM_KEY = "res_tenant";
    }

    public static ResourcePrincipalAuthenticationDetailsProviderBuilder builder() {
        return new ResourcePrincipalAuthenticationDetailsProviderBuilder();
    }

    /**
     * Session tokens carry JWT-like claims. Permit the retrieval of the value of those claims from
     * the token. At the least, the token should carry claims for {@link
     * ClaimKeys#COMPARTMENT_ID_CLAIM_KEY} and {@link ClaimKeys#TENANT_ID_CLAIM_KEY}
     *
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

    /**
     * Refreshes the authentication data used by the provider
     *
     * @return the refreshed authentication data
     */
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
     * Builder for ResourcePrincipalAuthenticationDetailsProvider that understands the V2.2
     * configuration
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
         * <p>Required.
         */
        protected String resourcePrincipalTokenEndpoint;

        /**
         * The path provider for the resource principal token.
         *
         * <p>Defaults to DefaultRptPathProvider if null
         */
        protected RptPathProvider resourcePrincipalTokenPathProvider;

        /** The configuration for the circuit breaker. */
        protected CircuitBreakerConfiguration circuitBreakerConfig;

        /** The configuration for the security context. */
        protected String securityContext;

        /** Configures the resourcePrincipalTokenPathProvider to use. */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder
                resourcePrincipalTokenPathProvider(
                        RptPathProvider resourcePrincipalTokenPathProvider) {
            this.resourcePrincipalTokenPathProvider = resourcePrincipalTokenPathProvider;
            return this;
        }

        /** Configures the resourcePrincipalTokenEndpoint to use. */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder resourcePrincipalTokenEndpoint(
                String resourcePrincipalTokenEndpoint) {
            this.resourcePrincipalTokenEndpoint = resourcePrincipalTokenEndpoint;
            return this;
        }

        /** Set value for the CircuitBreaker Configuration. */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder circuitBreakerConfig(
                CircuitBreakerConfiguration circuitBreakerConfig) {
            this.circuitBreakerConfig = circuitBreakerConfig;
            return this;
        }

        /** Set value for the security context to use. */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder securityContext(
                String securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /** Configures the resourcePrincipalTokenEndpoint to use. */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder resourcePrincipalTokenEndpoint(
                Service service, Region region) {
            Optional<String> endpoint = region.getEndpoint(service);
            return resourcePrincipalTokenEndpoint(endpoint.orElse(null));
        }

        /**
         * Configures the resourcePrincipalSessionTokenEndpoint to use.
         *
         * @deprecated use {@link #federationEndpoint(String)}
         */
        @Deprecated
        public ResourcePrincipalAuthenticationDetailsProviderBuilder
                resourcePrincipalSessionTokenEndpoint(
                        String resourcePrincipalSessionTokenEndpoint) {
            return super.federationEndpoint(resourcePrincipalSessionTokenEndpoint);
        }

        /** Configures the custom leafCertificateSupplier to use. */
        public ResourcePrincipalAuthenticationDetailsProviderBuilder leafCertificateSupplier(
                X509CertificateSupplier leafCertificateSupplier) {
            // do not remove this method.  due to compile time resolution, older generated
            // clients will bind to this, not the one in the superclass
            return super.leafCertificateSupplier(leafCertificateSupplier);
        }

        /**
         * Examine the environment of the running process; construct a {@link
         * ResourcePrincipalAuthenticationDetailsProvider} accordingly.
         */
        public ResourcePrincipalAuthenticationDetailsProvider build() {
            final String ociResourcePrincipalVersion =
                    System.getenv(OCI_RESOURCE_PRINCIPAL_VERSION);
            if (ociResourcePrincipalVersion == null) {
                throw new IllegalArgumentException(
                        OCI_RESOURCE_PRINCIPAL_VERSION + " environment variable missing");
            }

            switch (ociResourcePrincipalVersion) {
                case RP_VERSION_1_1:
                    final String ociResourcePrincipalRptEndpoint =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT);
                    final String ociResourcePrincipalRpstEndpoint =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT);

                    return build_1_1(
                            ociResourcePrincipalRptEndpoint, ociResourcePrincipalRpstEndpoint);
                case RP_VERSION_2_1:
                case RP_VERSION_2_1_1:
                    final String ociResourcePrincipalRptEndpointFor2_1_or_2_1_1 =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT);
                    final String ociResourcePrincipalRpstEndpointForLeafResourceFor2_1_or_2_1_1 =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT);
                    final String ociResourcePrincipalResourceIdForLeafResource =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RESOURCE_ID);
                    final String ociResourcePrincipalTenancyIdForLeafResource =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_TENANCY_ID);
                    final String ociResourcePrincipalPrivateKeyForLeafResource =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM);
                    final String ociResourcePrincipalPassphraseForLeafResource =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE);
                    return build_2_1_or_2_1_1(
                            ociResourcePrincipalRptEndpointFor2_1_or_2_1_1,
                            ociResourcePrincipalRpstEndpointForLeafResourceFor2_1_or_2_1_1,
                            ociResourcePrincipalResourceIdForLeafResource,
                            ociResourcePrincipalTenancyIdForLeafResource,
                            ociResourcePrincipalPrivateKeyForLeafResource,
                            ociResourcePrincipalPassphraseForLeafResource,
                            ociResourcePrincipalVersion);
                case RP_VERSION_2_1_2:
                    final String ociResourcePrincipalRptEndpointFor2_1_2 =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT);
                    final String ociResourcePrincipalRpstEndpointForLeafResourceFor2_1_2 =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT);
                    final String ociResourcePrincipalResourceIdForLeafResourceFor2_1_2 =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RESOURCE_ID);
                    final String ociResourcePrincipalTenancyIdForLeafResourceFor2_1_2 =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_TENANCY_ID);
                    final String ociResourcePrincipalSecurityContext =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_SECURITY_CONTEXT);
                    final String ociResourcePrincipalPrivateKeyForLeafResourceFor2_1_2 =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM);
                    final String ociResourcePrincipalPassphraseForLeafResourceFor2_1_2 =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE);
                    final String ociResourcePrincipalTokenPath =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_PATH);
                    return build_2_1_2(
                            ociResourcePrincipalRptEndpointFor2_1_2,
                            ociResourcePrincipalRpstEndpointForLeafResourceFor2_1_2,
                            ociResourcePrincipalTokenPath,
                            ociResourcePrincipalSecurityContext,
                            ociResourcePrincipalResourceIdForLeafResourceFor2_1_2,
                            ociResourcePrincipalTenancyIdForLeafResourceFor2_1_2,
                            ociResourcePrincipalPrivateKeyForLeafResourceFor2_1_2,
                            ociResourcePrincipalPassphraseForLeafResourceFor2_1_2,
                            ociResourcePrincipalVersion);
                case RP_VERSION_2_2:
                    final String ociResourcePrincipalPrivateKey =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM);
                    final String ociResourcePrincipalPassphrase =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE);
                    final String ociResourcePrincipalRpst =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPST);
                    final String ociResourcePrincipalRegion =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_REGION_ENV_VAR_NAME);
                    final String inputType = "environment variable";

                    return build_2_2(
                            ociResourcePrincipalPrivateKey,
                            ociResourcePrincipalPassphrase,
                            ociResourcePrincipalRpst,
                            ociResourcePrincipalRegion,
                            inputType);
                case RP_VERSION_3_0:
                    return build_3_0();
                default:
                    throw new IllegalArgumentException(
                            OCI_RESOURCE_PRINCIPAL_VERSION
                                    + " has unknown value."
                                    + RP_DEBUG_INFORMATION_LOG);
            }
        }

        /**
         * Helper method that interprets the runtime environment to build a v3.0-configured client
         *
         * @return ResourcePrincipalAuthenticationDetailsProvider
         */
        public ResourcePrincipalAuthenticationDetailsProvider build_3_0() {
            return ResourcePrincipalsV3AuthenticationDetailsProvider.builder().build();
        }

        /**
         * Helper method that interprets the runtime environment to build a v2.2-configured client
         *
         * @return ResourcePrincipalAuthenticationDetailsProvider
         */
        public static ResourcePrincipalAuthenticationDetailsProvider build_2_2(
                String ociResourcePrincipalPrivateKey,
                String ociResourcePrincipalPassphrase,
                String ociResourcePrincipalRpst,
                String ociResourcePrincipalRegion,
                String inputType) {

            final SessionKeySupplier sessionKeySupplier =
                    getSessionKeySupplierFromPemAndPassphrase(
                            ociResourcePrincipalPrivateKey,
                            ociResourcePrincipalPassphrase,
                            inputType);

            final FederationClient federationClient =
                    getFederationClientFromRpst(
                            ociResourcePrincipalRpst, inputType, sessionKeySupplier);

            final Region region =
                    ResourcePrincipalAuthenticationDetailsProvider.getRegion(
                            ociResourcePrincipalRegion, inputType);

            return new ResourcePrincipalAuthenticationDetailsProvider(
                    federationClient, sessionKeySupplier, region);
        }

        /**
         * Helper method that interprets the runtime environment to build a v2.1.2-configured client
         *
         * @return ResourcePrincipalAuthenticationDetailsProvider
         */
        public ResourcePrincipalAuthenticationDetailsProvider build_2_1_2(
                String ociResourcePrincipalRptEndpoint,
                String ociResourcePrincipalRpstEndpoint,
                String ociResourcePrincipalTokenPath,
                String ociSecurityContext,
                String ociResourcePrincipalResourceId,
                String ociResourcePrincipalTenancyId,
                String ociResourcePrincipalPrivateKey,
                String ociResourcePrincipalPassphrase,
                String ociResourcePrincipalVersion) {

            if (StringUtils.isNotBlank(securityContext)) {
                ociSecurityContext = securityContext;
                LOG.debug(
                        "Security context provided via the builder overrides the value provided via environment variable");
            }

            Validate.isTrue(
                    StringUtils.isNotBlank(ociResourcePrincipalRptEndpoint),
                    "required: StringUtils.isNotBlank(resourcePrincipalTokenEndpoint)");
            Validate.isTrue(
                    StringUtils.isNotBlank(ociResourcePrincipalRpstEndpoint),
                    "required: StringUtils.isNotBlank(resourcePrincipalSessionTokenEndpoint)");
            Validate.isTrue(
                    StringUtils.isNotBlank(ociSecurityContext),
                    "required: StringUtils.isNotBlank(securityContext)");
            Validate.isTrue(
                    StringUtils.isNotBlank(ociResourcePrincipalResourceId),
                    "required: StringUtils.isNotBlank(resourceId)");
            Validate.isTrue(
                    StringUtils.isNotBlank(ociResourcePrincipalTenancyId),
                    "required: StringUtils.isNotBlank(tenancyId)");
            Validate.isTrue(
                    StringUtils.isNotBlank(ociResourcePrincipalPrivateKey),
                    "required: StringUtils.isNotBlank(ociResourcePrincipalPrivateKey)");

            if (StringUtils.isBlank(ociResourcePrincipalTokenPath)) {
                ociResourcePrincipalTokenPath = DEFAULT_OCI_RESOURCE_PRINCIPAL_RPT_PATH_FORV212;
            }

            final String inputType = "environment variable";

            sessionKeySupplier =
                    getSessionKeySupplierFromPemAndPassphrase(
                            ociResourcePrincipalPrivateKey,
                            ociResourcePrincipalPassphrase,
                            inputType);

            KeyPairAuthenticationDetailProvider provider =
                    getKeyPairAuthenticationDetailProvider(
                            ociResourcePrincipalResourceId,
                            ociResourcePrincipalPrivateKey,
                            ociResourcePrincipalPassphrase,
                            ociResourcePrincipalTenancyId,
                            ociResourcePrincipalVersion);

            federationClient =
                    new ResourcePrincipalV2FederationClient(
                            ociResourcePrincipalRptEndpoint,
                            ociResourcePrincipalRpstEndpoint,
                            ociResourcePrincipalTokenPath,
                            ociSecurityContext,
                            sessionKeySupplier,
                            provider,
                            federationClientConfigurator,
                            circuitBreakerConfig);

            // auto detect region
            autoDetectEndpointUsingMetadataUrl();

            return new ResourcePrincipalAuthenticationDetailsProvider(
                    federationClient, sessionKeySupplier, region);
        }

        /**
         * Helper method that interprets the runtime environment to build a v2.1 or 2.1.1-configured
         * client
         *
         * @return ResourcePrincipalAuthenticationDetailsProvider
         */
        public ResourcePrincipalAuthenticationDetailsProvider build_2_1_or_2_1_1(
                String ociResourcePrincipalRptEndpoint,
                String ociResourcePrincipalRpstEndpoint,
                String ociResourcePrincipalResourceId,
                String ociResourcePrincipalTenancyId,
                String ociResourcePrincipalPrivateKey,
                String ociResourcePrincipalPassphrase,
                String ociResourcePrincipalVersion) {

            Validate.isTrue(
                    StringUtils.isNotBlank(ociResourcePrincipalRptEndpoint),
                    "required: StringUtils.isNotBlank(resourcePrincipalTokenEndpoint)");
            Validate.isTrue(
                    StringUtils.isNotBlank(ociResourcePrincipalRpstEndpoint),
                    "required: StringUtils.isNotBlank(resourcePrincipalSessionTokenEndpoint)");
            Validate.isTrue(
                    StringUtils.isNotBlank(ociResourcePrincipalResourceId),
                    "required: StringUtils.isNotBlank(resourceId)");

            if (ociResourcePrincipalVersion.equals("2.1.1")) {
                Validate.isTrue(
                        StringUtils.isNotBlank(ociResourcePrincipalTenancyId),
                        "required: StringUtils.isNotBlank(tenancyId)");
            }

            Validate.isTrue(
                    StringUtils.isNotBlank(ociResourcePrincipalPrivateKey),
                    "required: StringUtils.isNotBlank(ociResourcePrincipalPrivateKey)");

            final String inputType = "environment variable";

            sessionKeySupplier =
                    getSessionKeySupplierFromPemAndPassphrase(
                            ociResourcePrincipalPrivateKey,
                            ociResourcePrincipalPassphrase,
                            inputType);

            KeyPairAuthenticationDetailProvider provider =
                    getKeyPairAuthenticationDetailProvider(
                            ociResourcePrincipalResourceId,
                            ociResourcePrincipalPrivateKey,
                            ociResourcePrincipalPassphrase,
                            ociResourcePrincipalTenancyId,
                            ociResourcePrincipalVersion);

            federationClient =
                    new ResourcePrincipalV2FederationClient(
                            ociResourcePrincipalRptEndpoint,
                            ociResourcePrincipalRpstEndpoint,
                            sessionKeySupplier,
                            provider,
                            federationClientConfigurator,
                            circuitBreakerConfig);

            // auto detect region
            autoDetectEndpointUsingMetadataUrl();

            return new ResourcePrincipalAuthenticationDetailsProvider(
                    federationClient, sessionKeySupplier, region);
        }

        /**
         * Helper method that interprets the runtime environment to build a v1.1-configured client
         *
         * @return ResourcePrincipalAuthenticationDetailsProvider
         */
        @InternalSdk
        public ResourcePrincipalAuthenticationDetailsProvider build_1_1(
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

        private KeyPairAuthenticationDetailProvider getKeyPairAuthenticationDetailProvider(
                String ociResourcePrincipalResourceId,
                String ociResourcePrincipalPrivateKey,
                String ociResourcePrincipalPassphrase,
                String tenancyId,
                String ociResourcePrincipalVersion) {
            final InputStream privateKeyStream;
            final String passphrase;
            if (new File(ociResourcePrincipalPrivateKey).exists()) {
                if (ociResourcePrincipalPassphrase != null
                        && !new File(ociResourcePrincipalPassphrase).exists()) {
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
                try {
                    privateKeyStream = new FileInputStream(ociResourcePrincipalPrivateKey);
                    Path passphrasePath =
                            (ociResourcePrincipalPassphrase != null)
                                    ? new File(ociResourcePrincipalPassphrase).toPath()
                                    : null;
                    if (passphrasePath != null) {
                        passphrase = new String(Files.readAllBytes(passphrasePath));
                    } else passphrase = null;
                } catch (FileNotFoundException e) {
                    throw new IllegalArgumentException("Can't find file for private key", e);
                } catch (IOException e) {
                    throw new RuntimeException("cannot read the passphrase", e);
                }

            } else {
                passphrase = ociResourcePrincipalPassphrase;
                privateKeyStream =
                        new ByteArrayInputStream(ociResourcePrincipalPrivateKey.getBytes());
            }

            return new KeyPairAuthenticationDetailProvider(
                    ociResourcePrincipalResourceId,
                    privateKeyStream,
                    (passphrase != null) ? passphrase.toCharArray() : null,
                    tenancyId,
                    ociResourcePrincipalVersion);
        }

        @Override
        protected FederationClient createFederationClient(SessionKeySupplier sessionKeySupplier) {
            createRptPathProvider();

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
                            .federationClientConfigurator(federationClientConfigurator)
                            // InstancePrincipalsAuthenticationDetailsProvider and
                            // ResourcePrincipalsFederationClient's
                            // sessionKeysSupplier must be different. BTW
                            // ResourcePrincipalsFederationClient and
                            // ResourcePrincipalAuthenticationDetailsProvider's sessionKeysSupplier
                            // must be same.
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

        protected void createRptPathProvider() {
            Validate.notNull(
                    resourcePrincipalTokenEndpoint,
                    "resourcePrincipalTokenEndpoint must not be null");
            if (resourcePrincipalTokenPathProvider == null) {
                resourcePrincipalTokenPathProvider = new DefaultRptPathProvider();
            }
        }

        @Override
        protected ResourcePrincipalAuthenticationDetailsProvider buildProvider(
                SessionKeySupplier sessionKeySupplierToUse) {
            return new ResourcePrincipalAuthenticationDetailsProvider(
                    federationClient, sessionKeySupplierToUse, region);
        }
    }

    protected static Region getRegion(String ociResourcePrincipalRegion, String inputType) {
        if (ociResourcePrincipalRegion == null) {
            throw new IllegalArgumentException(
                    OCI_RESOURCE_PRINCIPAL_REGION_ENV_VAR_NAME
                            + " "
                            + inputType
                            + " missing."
                            + RP_DEBUG_INFORMATION_LOG);
        }
        return Region.valueOf(NameUtils.canonicalizeForEnumTypes(ociResourcePrincipalRegion));
    }

    protected static FederationClient getFederationClientFromRpst(
            String ociResourcePrincipalRpst,
            String inputType,
            SessionKeySupplier sessionKeySupplier) {
        FederationClient federationClient;
        if (ociResourcePrincipalRpst == null) {
            throw new IllegalArgumentException(
                    OCI_RESOURCE_PRINCIPAL_RPST
                            + " "
                            + inputType
                            + " missing."
                            + RP_DEBUG_INFORMATION_LOG);
        }
        String ociResourcePrincipalRpstPath = ociResourcePrincipalRpst;
        if (new File(ociResourcePrincipalRpstPath).exists()) {
            LOG.debug(
                    "Valid file for RPST. Creating instance of FileBasedResourcePrincipalFederationClient");
            federationClient =
                    new FileBasedResourcePrincipalFederationClient(
                            sessionKeySupplier, ociResourcePrincipalRpstPath);
        } else {
            LOG.debug(
                    "Loading RPST from content provided. Creating instance of FixedContentResourcePrincipalFederationClient");
            federationClient =
                    new FixedContentResourcePrincipalFederationClient(
                            ociResourcePrincipalRpst, sessionKeySupplier);
        }
        return federationClient;
    }

    protected static SessionKeySupplier getSessionKeySupplierFromPemAndPassphrase(
            String ociResourcePrincipalPrivateKey,
            String ociResourcePrincipalPassphrase,
            String inputType) {
        SessionKeySupplier sessionKeySupplier;
        if (ociResourcePrincipalPrivateKey == null) {
            throw new IllegalArgumentException(
                    OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM
                            + " "
                            + inputType
                            + " missing."
                            + RP_DEBUG_INFORMATION_LOG);
        }
        String ociResourcePrincipalPrivateKeyPath = ociResourcePrincipalPrivateKey;
        if (new File(ociResourcePrincipalPrivateKeyPath).exists()) {
            if (ociResourcePrincipalPassphrase != null
                    && !new File(ociResourcePrincipalPassphrase).exists()) {
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
            LOG.debug("Valid file for private key. Creating instance of FileBasedKeySupplier");
            sessionKeySupplier =
                    new FileBasedKeySupplier(
                            ociResourcePrincipalPrivateKeyPath, ociResourcePrincipalPassphrase);
        } else {
            final char[] passPhraseChars;
            if (ociResourcePrincipalPassphrase != null) {
                passPhraseChars = ociResourcePrincipalPassphrase.toCharArray();
            } else {
                passPhraseChars = null;
            }
            LOG.debug(
                    "Invalid file for private key, using the content provided."
                            + " Creating instance of FixedContentKeySupplier");
            sessionKeySupplier =
                    new FixedContentKeySupplier(ociResourcePrincipalPrivateKey, passPhraseChars);
        }
        return sessionKeySupplier;
    }
}
