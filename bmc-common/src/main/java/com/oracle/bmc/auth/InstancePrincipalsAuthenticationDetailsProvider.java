/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import com.google.common.base.Optional;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.auth.internal.X509FederationClient;
import com.oracle.bmc.http.ClientConfigurator;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link BasicAuthenticationDetailsProvider} that integrates
 * with service-to-service authentication endpoints to generate service tokens
 * used for actual signing.
 * <p>
 * Also uses {@link AuthCachingPolicy} to disable caching (as the values for signing requests
 * may be rotated periodically).
 */
@AuthCachingPolicy(cacheKeyId = false, cachePrivateKey = false)
public class InstancePrincipalsAuthenticationDetailsProvider
        extends AbstractRequestingAuthenticationDetailsProvider implements RegionProvider {

    @Getter private final Region region;

    private InstancePrincipalsAuthenticationDetailsProvider(
            FederationClient federationClient,
            SessionKeySupplier sessionKeySupplier,
            Region region) {
        super(federationClient, sessionKeySupplier);
        this.region = region;
    }

    /**
     * Creates a new S2SAuthenticationDetailsProviderBuilder.
     * @return A new builder instance.
     */
    public static InstancePrincipalsAuthenticationDetailsProviderBuilder builder() {
        return new InstancePrincipalsAuthenticationDetailsProviderBuilder();
    }

    public String refreshSecurityToken() {
        return this.federationClient.refreshAndGetSecurityToken();
    }

    /**
     * Builder for InstancePrincipalsAuthenticationDetailsProviderBuilder.
     */
    public static class InstancePrincipalsAuthenticationDetailsProviderBuilder
            extends Builder<InstancePrincipalsAuthenticationDetailsProviderBuilder> {
        /**
         * Service instance for auth.
         */
        private static final com.oracle.bmc.Service SERVICE =
                com.oracle.bmc.Services.create("AUTH", "auth");

        /**
         * Base url of metadata service.
         */
        private static final String METADATA_SERVICE_BASE_URL = "http://169.254.169.254/opc/v1/";

        private String federationEndpoint;
        private X509CertificateSupplier leafCertificateSupplier;

        /**
         * Configures the custom federationEndpoint to use.
         */
        public InstancePrincipalsAuthenticationDetailsProviderBuilder federationEndpoint(
                String federationEndpoint) {
            this.federationEndpoint = federationEndpoint;
            return this;
        }

        /**
         * Configures the custom leafCertificateSupplier to use.
         */
        public InstancePrincipalsAuthenticationDetailsProviderBuilder leafCertificateSupplier(
                X509CertificateSupplier leafCertificateSupplier) {
            this.leafCertificateSupplier = leafCertificateSupplier;
            return this;
        }

        /**
         * Build a new InstancePrincipalsAuthenticationDetailsProvider.
         *
         * @return A new provider instance.
         */
        public InstancePrincipalsAuthenticationDetailsProvider build() {

            Region region = null;

            if (federationEndpoint == null) {
                Client client = ClientBuilder.newClient();
                WebTarget base = client.target(METADATA_SERVICE_BASE_URL + "instance/");
                String regionStr =
                        base.path("region").request(MediaType.TEXT_PLAIN).get(String.class);

                region = Region.fromRegionCode(regionStr);

                Optional<String> endpoint = region.getEndpoint(SERVICE);

                if (!endpoint.isPresent()) {
                    throw new IllegalArgumentException(
                            "Endpoint for " + SERVICE + " is not known in region " + region);
                } else {
                    federationEndpoint = endpoint.get();
                }
            }

            try {
                if (leafCertificateSupplier == null) {
                    leafCertificateSupplier =
                            new URLBasedX509CertificateSupplier(
                                    new URL(METADATA_SERVICE_BASE_URL + "identity/cert.pem"),
                                    new URL(METADATA_SERVICE_BASE_URL + "identity/key.pem"),
                                    null);
                }

                if (intermediateCertificateSuppliers == null) {
                    intermediateCertificateSuppliers = new HashSet<>();

                    intermediateCertificateSuppliers.add(
                            new URLBasedX509CertificateSupplier(
                                    new URL(
                                            METADATA_SERVICE_BASE_URL
                                                    + "identity/intermediate.pem"),
                                    null,
                                    null));
                }

                SessionKeySupplier sessionKeySupplierToUse =
                        sessionKeySupplier != null
                                ? sessionKeySupplier
                                : new SessionKeySupplierImpl();

                this.federationClient =
                        new X509FederationClient(
                                federationEndpoint,
                                leafCertificateSupplier,
                                sessionKeySupplierToUse,
                                intermediateCertificateSuppliers,
                                federationClientConfigurator);

                return new InstancePrincipalsAuthenticationDetailsProvider(
                        federationClient, sessionKeySupplierToUse, region);

            } catch (MalformedURLException ex) {
                throw new IllegalArgumentException("The metadata service url is invalid.", ex);
            }
        }
    }
}
