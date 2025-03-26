/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.FederationClient;
import org.slf4j.Logger;

import java.time.Duration;

/**
 * Implementation of {@link BasicAuthenticationDetailsProvider} that integrates
 * with instance principal authentication endpoints to generate service tokens
 * used for actual signing.
 * <p>
 * Also uses {@link AuthCachingPolicy} to disable caching (as the values for signing requests
 * may be rotated periodically).
 */
@AuthCachingPolicy(cacheKeyId = false, cachePrivateKey = false)
public class InstancePrincipalsAuthenticationDetailsProvider
        extends AbstractRequestingAuthenticationDetailsProvider
        implements RegionProvider, RefreshableOnNotAuthenticatedProvider<String>,
                ConfigurableRefreshOnNotAuthenticatedProvider<String> {

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    InstancePrincipalsAuthenticationDetailsProvider.class);
    private final Region region;

    private InstancePrincipalsAuthenticationDetailsProvider(
            FederationClient federationClient,
            SessionKeySupplier sessionKeySupplier,
            Region region) {
        super(federationClient, sessionKeySupplier);
        this.region = region;
    }

    /**
     * Creates a new InstancePrincipalsAuthenticationDetailsProviderBuilder.
     * @return A new builder instance.
     */
    public static InstancePrincipalsAuthenticationDetailsProviderBuilder builder() {
        return new InstancePrincipalsAuthenticationDetailsProviderBuilder();
    }

    /**
     * Refreshes the authentication data used by the provider
     *
     * @return the refreshed authentication data
     *
     * @deprecated use {@link #refresh()} instead
     */
    @Deprecated
    public String refreshSecurityToken() {
        return this.federationClient.refreshAndGetSecurityToken();
    }

    @Override
    public String refresh() {
        return this.federationClient.refreshAndGetSecurityToken();
    }

    @Override
    public String refreshIfExpiringWithin(Duration time) {
        return refreshIfExpiringWithin(time, true);
    }

    @Override
    public String refreshIfExpiringWithin(Duration time, boolean refreshKeys) {
        if (this.federationClient instanceof ProvidesConfigurableRefresh) {
            return ((ProvidesConfigurableRefresh) this.federationClient)
                    .refreshAndGetSecurityTokenIfExpiringWithin(time, refreshKeys);
        }
        return this.federationClient.refreshAndGetSecurityToken();
    }

    @Override
    public Region getRegion() {
        return this.region;
    }

    /**
     * Builder for InstancePrincipalsAuthenticationDetailsProviderBuilder.
     */
    public static class InstancePrincipalsAuthenticationDetailsProviderBuilder
            extends AbstractFederationClientAuthenticationDetailsProviderBuilder<
                    InstancePrincipalsAuthenticationDetailsProviderBuilder,
                    InstancePrincipalsAuthenticationDetailsProvider> {

        @Override
        protected InstancePrincipalsAuthenticationDetailsProvider buildProvider(
                SessionKeySupplier sessionKeySupplierToUse) {
            return new InstancePrincipalsAuthenticationDetailsProvider(
                    federationClient, sessionKeySupplierToUse, region);
        }

        @Override
        public InstancePrincipalsAuthenticationDetailsProvider build() {
            LOG.info(
                    "Instance principals authentication can only be used on OCI compute instances. Please confirm this code is running on an OCI compute instance.\n"
                            + "See https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/callingservicesfrominstances.htm for more info.");
            autoDetectUsingMetadataUrl();

            return super.build();
        }

        @Override
        public InstancePrincipalsAuthenticationDetailsProviderBuilder federationEndpoint(
                String federationEndpoint) {
            // Do not remove this method. Due to compile time resolution, older generated
            // clients will bind to this, not the one in the superclass
            return super.federationEndpoint(federationEndpoint);
        }

        @Override
        public InstancePrincipalsAuthenticationDetailsProviderBuilder leafCertificateSupplier(
                X509CertificateSupplier leafCertificateSupplier) {
            // Do not remove this method. Due to compile time resolution, older generated
            // clients will bind to this, not the one in the superclass
            return super.leafCertificateSupplier(leafCertificateSupplier);
        }
    }
}
