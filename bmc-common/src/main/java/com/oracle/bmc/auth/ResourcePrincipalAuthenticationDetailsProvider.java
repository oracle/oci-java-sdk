/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.auth.internal.FileBasedKeySupplier;
import com.oracle.bmc.auth.internal.FileBasedResourcePrincipalFederationClient;
import com.oracle.bmc.auth.internal.FixedContentKeySupplier;
import com.oracle.bmc.auth.internal.FixedContentResourcePrincipalFederationClient;
import com.oracle.bmc.util.internal.NameUtils;
import lombok.Getter;

import java.io.File;

/**
 * This constructs a default implementation of the {@link ResourcePrincipalAuthenticationDetailsProvider}, constructed
 * in accordance with the following environment variable settings:
 * <ul>
 *
 * <li>{@code OCI_RESOURCE_PRINCIPAL_VERSION}:
 * <p>permitted values are "2.2"</p>
 * </li>
 *
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
 * </ul>
 */
@AuthCachingPolicy(cacheKeyId = false, cachePrivateKey = false)
public class ResourcePrincipalAuthenticationDetailsProvider
        extends AbstractRequestingAuthenticationDetailsProvider
        implements RegionProvider, RefreshableOnNotAuthenticatedProvider<String> {

    final static String OCI_RESOURCE_PRINCIPAL_VERSION = "OCI_RESOURCE_PRINCIPAL_VERSION";
    final static String RP_VERSION_2_2 = "2.2";
    final static String OCI_RESOURCE_PRINCIPAL_RPST = "OCI_RESOURCE_PRINCIPAL_RPST";
    final static String OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM = "OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM";
    final static String OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE =
            "OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE";
    final static String OCI_RESOURCE_PRINCIPAL_REGION_ENV_VAR_NAME =
            "OCI_RESOURCE_PRINCIPAL_REGION";

    /**
     * Returns the region where the java code using resource principal authentication is running at
     *
     * @return Region object.
     */
    @Getter private final Region region;

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

    /**
     * Builder for ResourcePrincipalAuthenticationDetailsProvider that understands the V2.2 configuration
     */
    public static class ResourcePrincipalAuthenticationDetailsProviderBuilder {

        ResourcePrincipalAuthenticationDetailsProviderBuilder() {}

        /**
         * Examine the environment of the running process; construct a {@link ResourcePrincipalAuthenticationDetailsProvider}
         * accordingly.
         */
        public ResourcePrincipalAuthenticationDetailsProvider build() {
            final String OciResourcePrincipalVersion =
                    System.getenv(OCI_RESOURCE_PRINCIPAL_VERSION);
            if (OciResourcePrincipalVersion == null) {
                throw new IllegalArgumentException(
                        OCI_RESOURCE_PRINCIPAL_VERSION + " environment variable missing");
            }

            switch (OciResourcePrincipalVersion) {
                case RP_VERSION_2_2:
                    return build_2_2();
                default:
                    throw new IllegalArgumentException(
                            OCI_RESOURCE_PRINCIPAL_VERSION + " has unknown value");
            }
        }

        /**
         * Helper method that interprets the runtime environment to build a v2.2-configured client
         * @return ResourcePrincipalAuthenticationDetailsProvider
         */
        private static ResourcePrincipalAuthenticationDetailsProvider build_2_2() {
            final FederationClient federationClient;
            final SessionKeySupplier sessionKeySupplier;
            final Region region;

            final String ociResourcePrincipalPrivateKey =
                    System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM);
            final String ociResourcePrincipalPassphrase =
                    System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE);

            if (ociResourcePrincipalPrivateKey == null) {
                throw new IllegalArgumentException(
                        OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM + " environment variable missing");
            }
            if (new File(ociResourcePrincipalPrivateKey).isAbsolute()) {
                if (ociResourcePrincipalPassphrase != null
                        && !new File(ociResourcePrincipalPassphrase).isAbsolute()) {
                    throw new IllegalArgumentException(
                            "cannot mix path and constant settings for "
                                    + OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM
                                    + " and "
                                    + OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE);
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

            final String ociResourcePrincipalRPST = System.getenv(OCI_RESOURCE_PRINCIPAL_RPST);
            if (ociResourcePrincipalRPST == null) {
                throw new IllegalArgumentException(
                        OCI_RESOURCE_PRINCIPAL_RPST + " environment variable missing");
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

            final String ociResourcePrincipalRegion =
                    System.getenv(OCI_RESOURCE_PRINCIPAL_REGION_ENV_VAR_NAME);
            if (ociResourcePrincipalRegion == null) {
                throw new IllegalArgumentException(
                        OCI_RESOURCE_PRINCIPAL_REGION_ENV_VAR_NAME
                                + " environment variable missing");
            } else {
                region =
                        Region.valueOf(
                                NameUtils.canonicalizeForEnumTypes(ociResourcePrincipalRegion));
            }

            return new ResourcePrincipalAuthenticationDetailsProvider(
                    federationClient, sessionKeySupplier, region);
        }
    }
}
