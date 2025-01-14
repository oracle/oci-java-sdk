/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.auth.internal.DefaultLeafRptPathProvider;
import com.oracle.bmc.auth.internal.ResourcePrincipalsV3FederationClient;
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.FederationClient;

/**
 * This constructs a default implementation of the {@link
 * ResourcePrincipalAuthenticationDetailsProvider}, integrates principal authentication services to
 * generate resource principal session token used for actual signing.
 *
 * <p>Also uses {@link AuthCachingPolicy} to disable caching (as the values for signing requests may
 * be rotated periodically).
 */
@AuthCachingPolicy(cacheKeyId = false, cachePrivateKey = false)
public class ResourcePrincipalsV3AuthenticationDetailsProvider
        extends ResourcePrincipalAuthenticationDetailsProvider {

    private static final String OCI_RESOURCE_PRINCIPAL_VERSION_FOR_LEAF_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_VERSION_FOR_LEAF_RESOURCE";
    private static final String OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT_FOR_LEAF_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT_FOR_LEAF_RESOURCE";
    private static final String OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT_FOR_LEAF_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT_FOR_LEAF_RESOURCE";
    private static final String RP_VERSION_1_1 = "1.1";
    private static final String OCI_RESOURCE_PRINCIPAL_RESOURCE_ID_FOR_LEAF_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_RESOURCE_ID_FOR_LEAF_RESOURCE";
    private static final String OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_FOR_LEAF_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_FOR_LEAF_RESOURCE";
    private static final String OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE_FOR_LEAF_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE_FOR_LEAF_RESOURCE";
    private static final String OCI_RESOURCE_PRINCIPAL_RPST_FOR_LEAF_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_RPST_FOR_LEAF_RESOURCE";
    private static final String OCI_RESOURCE_PRINCIPAL_REGION_FOR_LEAF_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_REGION_FOR_LEAF_RESOURCE";
    private static final String OCI_RESOURCE_PRINCIPAL_RPT_URL_FOR_PARENT_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_RPT_URL_FOR_PARENT_RESOURCE";
    private static final String OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT_FOR_PARENT_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT_FOR_PARENT_RESOURCE";
    private static final String OCI_RESOURCE_PRINCIPAL_TENANCY_ID_FOR_LEAF_RESOURCE =
            "OCI_RESOURCE_PRINCIPAL_TENANCY_ID_FOR_LEAF_RESOURCE";
    private static final String RP_DEBUG_INFORMATION_LOG =
            "\nResource principals authentication can only be used in certain OCI services. Please check that the OCI service you're running this code from supports Resource principals."
                    + "\nSee https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal for more info.";

    /**
     * Constructor of ResourcePrincipalAuthenticationDetailsProvider.
     *
     * @param federationClient federation client implementation.
     * @param sessionKeySupplier session key supplier implementation.
     * @param region the region
     */
    ResourcePrincipalsV3AuthenticationDetailsProvider(
            FederationClient federationClient,
            SessionKeySupplier sessionKeySupplier,
            Region region) {
        super(federationClient, sessionKeySupplier, region);
    }

    /**
     * Creates a new ResourcePrincipalsAuthenticationDetailsProvider.
     *
     * @return A new builder instance.
     */
    public static ResourcePrincipalsV3AuthenticationDetailsProviderBuilder builder() {
        return new ResourcePrincipalsV3AuthenticationDetailsProviderBuilder();
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

    /** Builder for ResourcePrincipalsAuthenticationDetailsProviderBuilder. */
    public static class ResourcePrincipalsV3AuthenticationDetailsProviderBuilder
            extends ResourcePrincipalAuthenticationDetailsProvider
                    .ResourcePrincipalAuthenticationDetailsProviderBuilder {

        /**
         * The endpoint that can provide the parent resource principal token.
         *
         * <p>Required.
         */
        private String resourcePrincipalTokenUrlForParentResource;

        /** The federation endpoint/RPST endpoint for parent resource */
        private String federationEndpointForParentResource;

        /** Configures the resourcePrincipalTokenUrlForParentResource to use. */
        public ResourcePrincipalsV3AuthenticationDetailsProviderBuilder
                resourcePrincipalTokenUrlForParentResource(
                        String resourcePrincipalTokenUrlForParentResource) {
            this.resourcePrincipalTokenUrlForParentResource =
                    resourcePrincipalTokenUrlForParentResource;
            return this;
        }

        /** Configures the resourcePrincipalTokenUrlForParentResource to use. */
        public ResourcePrincipalsV3AuthenticationDetailsProviderBuilder
                federationEndpointForParentResource(String federationEndpointForParentResource) {
            this.federationEndpointForParentResource = federationEndpointForParentResource;
            return this;
        }

        /**
         * Build a new ResourcePrincipalsV3AuthenticationDetailsProvider.
         *
         * @return A new provider instance.
         */
        public ResourcePrincipalsV3AuthenticationDetailsProvider build() {
            final String ociResourcePrincipalVersionForLeafResource =
                    System.getenv(OCI_RESOURCE_PRINCIPAL_VERSION_FOR_LEAF_RESOURCE);
            if (StringUtils.isBlank(ociResourcePrincipalVersionForLeafResource)) {
                throw new IllegalArgumentException(
                        OCI_RESOURCE_PRINCIPAL_VERSION_FOR_LEAF_RESOURCE
                                + " environment variable missing");
            }
            ResourcePrincipalAuthenticationDetailsProvider leafResourceAuthProvider = null;
            switch (ociResourcePrincipalVersionForLeafResource) {
                case RP_VERSION_1_1:
                    final String ociResourcePrincipalRptEndpointForLeafResource =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT_FOR_LEAF_RESOURCE);
                    final String ociResourcePrincipalRpstEndpointForLeafResource =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT_FOR_LEAF_RESOURCE);
                    leafResourceAuthProvider =
                            build_1_1(
                                    ociResourcePrincipalRptEndpointForLeafResource,
                                    ociResourcePrincipalRpstEndpointForLeafResource);
                    break;
                case RP_VERSION_2_1:
                case RP_VERSION_2_1_1:
                    final String ociResourcePrincipalRptEndpointForLeafResourceFor2_1_or_2_1_1 =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT_FOR_LEAF_RESOURCE);
                    final String ociResourcePrincipalRpstEndpointForLeafResourceFor2_1_or_2_1_1 =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT_FOR_LEAF_RESOURCE);
                    final String ociResourcePrincipalResourceIdForLeafResource =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RESOURCE_ID_FOR_LEAF_RESOURCE);
                    final String ociResourcePrincipalTenancyIdForLeafResource =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_TENANCY_ID_FOR_LEAF_RESOURCE);
                    final String ociResourcePrincipalPrivateKeyForLeafResource =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_FOR_LEAF_RESOURCE);
                    final String ociResourcePrincipalPassphraseForLeafResource =
                            System.getenv(
                                    OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE_FOR_LEAF_RESOURCE);
                    leafResourceAuthProvider =
                            build_2_1_or_2_1_1(
                                    ociResourcePrincipalRptEndpointForLeafResourceFor2_1_or_2_1_1,
                                    ociResourcePrincipalRpstEndpointForLeafResourceFor2_1_or_2_1_1,
                                    ociResourcePrincipalResourceIdForLeafResource,
                                    ociResourcePrincipalTenancyIdForLeafResource,
                                    ociResourcePrincipalPrivateKeyForLeafResource,
                                    ociResourcePrincipalPassphraseForLeafResource,
                                    ociResourcePrincipalVersionForLeafResource);
                    break;
                case RP_VERSION_2_2:
                    final String ociResourcePrincipalPrivateKey =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_FOR_LEAF_RESOURCE);
                    final String ociResourcePrincipalPassphrase =
                            System.getenv(
                                    OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE_FOR_LEAF_RESOURCE);
                    final String ociResourcePrincipalRpst =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_RPST_FOR_LEAF_RESOURCE);
                    final String ociResourcePrincipalRegion =
                            System.getenv(OCI_RESOURCE_PRINCIPAL_REGION_FOR_LEAF_RESOURCE);
                    final String inputType = "environment variable";
                    leafResourceAuthProvider =
                            build_2_2_leaf(
                                    ociResourcePrincipalPrivateKey,
                                    ociResourcePrincipalPassphrase,
                                    ociResourcePrincipalRpst,
                                    ociResourcePrincipalRegion,
                                    inputType);
                    break;
                default:
                    throw new IllegalArgumentException(
                            OCI_RESOURCE_PRINCIPAL_VERSION_FOR_LEAF_RESOURCE
                                    + " has unknown value."
                                    + RP_DEBUG_INFORMATION_LOG);
            }
            return build(leafResourceAuthProvider);
        }

        /**
         * Helper method that interprets the runtime environment to build a v2.2-configured leaf
         * client
         *
         * @return ResourcePrincipalAuthenticationDetailsProvider
         */
        public ResourcePrincipalAuthenticationDetailsProvider build_2_2_leaf(
                String ociResourcePrincipalPrivateKey,
                String ociResourcePrincipalPassphrase,
                String ociResourcePrincipalRpst,
                String ociResourcePrincipalRegion,
                String inputType) {

            sessionKeySupplier =
                    getSessionKeySupplierFromPemAndPassphrase(
                            ociResourcePrincipalPrivateKey,
                            ociResourcePrincipalPassphrase,
                            inputType);

            federationClient =
                    getFederationClientFromRpst(
                            ociResourcePrincipalRpst, inputType, sessionKeySupplier);

            region =
                    ResourcePrincipalsV3AuthenticationDetailsProvider.getRegion(
                            ociResourcePrincipalRegion, inputType);

            return new ResourcePrincipalAuthenticationDetailsProvider(
                    federationClient, sessionKeySupplier, region);
        }

        /**
         * Builds a new instance of ResourcePrincipalsV3AuthenticationDetailsProvider
         *
         * @param leafResourceAuthProvider instance of
         *     ResourcePrincipalAuthenticationDetailsProvider for leaf resource
         */
        public ResourcePrincipalsV3AuthenticationDetailsProvider build(
                ResourcePrincipalAuthenticationDetailsProvider leafResourceAuthProvider) {
            final String ociResourcePrincipalRptUrlForParentResource =
                    System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_URL_FOR_PARENT_RESOURCE);

            resourcePrincipalTokenUrlForParentResource =
                    resourcePrincipalTokenUrlForParentResource != null
                            ? resourcePrincipalTokenUrlForParentResource
                            : ociResourcePrincipalRptUrlForParentResource;

            Validate.notNull(
                    resourcePrincipalTokenUrlForParentResource,
                    "resourcePrincipalTokenUrlForParentResource must not be null");

            final String ociResourcePrincipalRpstEndpointForParentResource =
                    System.getenv(OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT_FOR_PARENT_RESOURCE);

            federationEndpointForParentResource =
                    federationEndpointForParentResource != null
                            ? federationEndpointForParentResource
                            : ociResourcePrincipalRpstEndpointForParentResource;

            if (federationEndpointForParentResource == null) {
                federationEndpointForParentResource = autoDetectEndpointUsingMetadataUrl();
            }

            FederationClient federationClientForParentResource =
                    createFederationClientForParentResource(leafResourceAuthProvider);

            return new ResourcePrincipalsV3AuthenticationDetailsProvider(
                    federationClientForParentResource, sessionKeySupplier, region);
        }

        private FederationClient createFederationClientForParentResource(
                ResourcePrincipalAuthenticationDetailsProvider leafResourceAuthProvider) {
            return new ResourcePrincipalsV3FederationClient(
                    resourcePrincipalTokenUrlForParentResource,
                    federationEndpointForParentResource,
                    sessionKeySupplier,
                    leafResourceAuthProvider,
                    federationClientConfigurator,
                    circuitBreakerConfig);
        }

        @Override
        protected void createRptPathProvider() {
            Validate.notNull(
                    resourcePrincipalTokenEndpoint,
                    "resourcePrincipalTokenEndpoint for leaf-resource must not be null");
            if (resourcePrincipalTokenPathProvider == null) {
                resourcePrincipalTokenPathProvider = new DefaultLeafRptPathProvider();
            }
        }
    }
}
