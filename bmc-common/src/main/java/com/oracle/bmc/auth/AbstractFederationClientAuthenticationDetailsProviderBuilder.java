/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.auth.internal.X509FederationClient;

import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashSet;

/**
 * Abstract builder base class for authentication details provider extending
 * {@link AbstractRequestingAuthenticationDetailsProvider}
 * @param <B> builder class
 * @param <P> provider class
 */
@InternalSdk
@Slf4j
public abstract class AbstractFederationClientAuthenticationDetailsProviderBuilder<
                B extends AbstractFederationClientAuthenticationDetailsProviderBuilder<B, P>,
                P extends AbstractAuthenticationDetailsProvider>
        extends AbstractRequestingAuthenticationDetailsProvider.Builder<B> {

    /**
     * Service instance for auth.
     */
    protected static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("AUTH")
                    .serviceEndpointPrefix("auth")
                    .build();

    /**
     * Default base url of metadata service.
     */
    protected static final String METADATA_SERVICE_BASE_URL = "http://169.254.169.254/opc/v2/";

    /**
     * Fallback url of metadata service.
     */
    protected static final String FALLBACK_METADATA_SERVICE_URL = "http://169.254.169.254/opc/v1/";

    /**
     * The Authorization header value to be sent for requests to the metadata service.
     */
    private static final String AUTHORIZATION_HEADER_VALUE = "Bearer Oracle";

    /**
     * Base url of metadata service.
     */
    @Getter protected volatile String metadataBaseUrl = METADATA_SERVICE_BASE_URL;

    /**
     * The federation endpoint url.
     */
    @Getter protected String federationEndpoint;

    /**
     * Flag to ensure fallback logic executed only once.
     */
    private volatile boolean wasFallbackCheckExecuted = false;

    /**
     * The leaf certificate, or null if detecting from instance metadata.
     */
    @Getter protected X509CertificateSupplier leafCertificateSupplier;

    /**
     * Tenancy OCI, or null if detecting from instance metadata.
     */
    @Getter protected String tenancyId;

    /**
     * The configuration for the circuit breaker.
     */
    private CircuitBreakerConfiguration circuitBreakerConfiguration;

    private String purpose = null;

    /**
     * Detected region.
     */
    @Getter protected Region region = null;

    /**
     * Configure the metadata endpoint to use when retrieving the instance data and principal for federation.
     */
    public B metadataBaseUrl(String metadataBaseUrl) {
        this.metadataBaseUrl = metadataBaseUrl;
        if (!this.metadataBaseUrl.endsWith("/")) {
            this.metadataBaseUrl += "/";
        }
        return (B) this;
    }

    /**
     * Configures the custom federationEndpoint to use.
     */
    public B federationEndpoint(String federationEndpoint) {
        this.federationEndpoint = federationEndpoint;
        return (B) this;
    }

    /**
     * Configures the custom leafCertificateSupplier to use.
     */
    public B leafCertificateSupplier(X509CertificateSupplier leafCertificateSupplier) {
        this.leafCertificateSupplier = leafCertificateSupplier;
        return (B) this;
    }

    public B tenancyId(String tenancyId) {
        this.tenancyId = tenancyId;
        return (B) this;
    }

    protected B purpose(String purpose) {
        this.purpose = purpose;
        return (B) this;
    }

    /**
     * Configures the Circuit Breaker to use, if any.
     */
    public B circuitBreakerConfigurator(CircuitBreakerConfiguration circuitBreakerConfiguration) {
        this.circuitBreakerConfiguration = circuitBreakerConfiguration;
        return (B) this;
    }

    /**
     * Build a new AuthenticationDetailsProvider that uses the FederationClient.
     *
     * @return A new provider instance.
     */
    public P build() {
        SessionKeySupplier sessionKeySupplierToUse =
                sessionKeySupplier != null ? sessionKeySupplier : new SessionKeySupplierImpl();

        this.federationClient = createFederationClient(sessionKeySupplierToUse);

        return buildProvider(sessionKeySupplierToUse);
    }

    protected FederationClient createFederationClient(SessionKeySupplier sessionKeySupplier) {

        CircuitBreakerConfiguration circuitBreakerConfig =
                circuitBreakerConfiguration != null
                        ? circuitBreakerConfiguration
                        : CircuitBreakerUtils.getDefaultCircuitBreakerConfig();

        if (purpose != null) {
            return new X509FederationClient(
                    federationEndpoint,
                    tenancyId,
                    leafCertificateSupplier,
                    sessionKeySupplier,
                    intermediateCertificateSuppliers,
                    federationClientConfigurator,
                    additionalFederationClientConfigurators,
                    circuitBreakerConfig,
                    purpose);
        } else {
            return new X509FederationClient(
                    federationEndpoint,
                    tenancyId,
                    leafCertificateSupplier,
                    sessionKeySupplier,
                    intermediateCertificateSuppliers,
                    federationClientConfigurator,
                    additionalFederationClientConfigurators,
                    circuitBreakerConfig);
        }
    }

    /**
     * Auto-detect endpoint and certificate information using Instance metadata.
     */
    protected void autoDetectUsingMetadataUrl() {
        autoDetectEndpointUsingMetadataUrl();
        autoDetectCertificatesUsingMetadataUrl();
    }

    /**
     * Auto detects the endpoint that should be used when talking to OCI Auth, if no endpoint
     * has been configured already.
     * @return The auto-detected, or currently set, auth endpoint.
     */
    protected String autoDetectEndpointUsingMetadataUrl() {
        if (federationEndpoint == null) {

            executeInstanceFallback();
            Client client = ClientBuilder.newClient();
            WebTarget base = client.target(getMetadataBaseUrl() + "instance/");

            String regionStr =
                    base.path("region")
                            .request(MediaType.TEXT_PLAIN)
                            .header(HttpHeaders.AUTHORIZATION, AUTHORIZATION_HEADER_VALUE)
                            .get(String.class);
            LOG.info("Looking up region for {}", regionStr);

            try {
                // TODO: we should start using 'canonicalRegionName' instead of 'region' and call
                // Region.fromRegionId, and fall back to 'region' only for backwards compat.
                region = Region.fromRegionCodeOrId(regionStr);
                LOG.info("Using region {}", region.getRegionId());
            } catch (IllegalArgumentException e) {
                LOG.warn(
                        "Region not supported by this version of the SDK, registering region '{}' under OC1",
                        regionStr,
                        e);
                // Proceed by assuming the region id belongs to the OC1 realm.
                region = Region.register(regionStr, Realm.OC1);
            }

            Optional<String> endpoint = region.getEndpoint(SERVICE);

            if (!endpoint.isPresent()) {
                throw new IllegalArgumentException(
                        "Endpoint for " + SERVICE + " is not known in region " + region);
            } else {
                federationEndpoint = endpoint.get();
            }
        }
        return federationEndpoint;
    }

    /**
     * Auto detects and configures the certificates needed using Instance metadata.
     *
     */
    protected void autoDetectCertificatesUsingMetadataUrl() {
        try {

            if (!wasFallbackCheckExecuted) {
                LOG.info(
                        " Executing fallback check for certificates as federation endpoint was already set to {}",
                        getFederationEndpoint());
                executeInstanceFallback();
            }

            if (leafCertificateSupplier == null) {
                leafCertificateSupplier =
                        new URLBasedX509CertificateSupplier(
                                getMetadataResourceDetails("identity/cert.pem"),
                                getMetadataResourceDetails("identity/key.pem"),
                                (char[]) null);
            }

            if (tenancyId == null) {
                tenancyId =
                        AuthUtils.getTenantIdFromCertificate(
                                leafCertificateSupplier
                                        .getCertificateAndKeyPair()
                                        .getCertificate());
            }

            if (intermediateCertificateSuppliers == null) {
                intermediateCertificateSuppliers = new HashSet<>();

                intermediateCertificateSuppliers.add(
                        new URLBasedX509CertificateSupplier(
                                getMetadataResourceDetails("identity/intermediate.pem"),
                                null,
                                (char[]) null));
            }
        } catch (MalformedURLException ex) {
            throw new IllegalArgumentException("The metadata service url is invalid.", ex);
        }
    }

    /**
     * Checks and falls back to V1 endpoint for both federation endpoint detection & certificates if necessary.
     */
    private void executeInstanceFallback() {
        Client client = ClientBuilder.newClient();
        WebTarget base = client.target(getMetadataBaseUrl() + "instance/");

        try {
            Response response =
                    base.path("id")
                            .request(MediaType.TEXT_PLAIN)
                            .header(HttpHeaders.AUTHORIZATION, AUTHORIZATION_HEADER_VALUE)
                            .get();
            LOG.info(
                    "Rest call to verify if v2 endpoint exists, response from v2 was {}",
                    response.getStatus());

            //fallback to v1 if v2 endpoint throws resource not found else raise exception
            if (response.getStatus() == 404) {
                LOG.warn("Falling back to v1, response from v2 was {}", response.getStatus());
                this.metadataBaseUrl = FALLBACK_METADATA_SERVICE_URL;
            } else if (!Response.Status.Family.SUCCESSFUL.equals(
                    response.getStatusInfo().getFamily())) {
                throw new RuntimeException(
                        "Rest call to v2 endpoint failed : HTTP error code : "
                                + response.getStatus());
            }
            wasFallbackCheckExecuted = true;
            LOG.info(
                    " Metadata base url on executing instance fallback is {}",
                    getMetadataBaseUrl());
        } catch (RuntimeException e) {
            LOG.warn("Rest call to v2 endpoint failed & cannot fallback as it's not 404 ", e);
        }
    }

    private URLBasedX509CertificateSupplier.ResourceDetails getMetadataResourceDetails(
            final String path) throws MalformedURLException {
        return URLBasedX509CertificateSupplier.ResourceDetails.builder()
                .url(new URL(getMetadataBaseUrl() + path))
                .headers(ImmutableMap.of(HttpHeaders.AUTHORIZATION, AUTHORIZATION_HEADER_VALUE))
                .build();
    }

    /**
     * Build the actual provider.
     * @param sessionKeySupplierToUse
     * @return authentication details provider
     */
    protected abstract P buildProvider(SessionKeySupplier sessionKeySupplierToUse);

    /**
     * This is a helper class to generate in-memory temporary session keys.
     * <p>
     * The thread safety of this class is ensured through the Caching class above
     * which synchronizes on all methods.
     */
    private static class SessionKeySupplierImpl implements SessionKeySupplier {
        private final static KeyPairGenerator GENERATOR;
        private KeyPair keyPair = null;

        static {
            try {
                GENERATOR = KeyPairGenerator.getInstance("RSA");
                GENERATOR.initialize(2048);
            } catch (NoSuchAlgorithmException e) {
                throw new Error(e.getMessage(), e);
            }
        }

        private SessionKeySupplierImpl() {
            this.keyPair = GENERATOR.generateKeyPair();
        }

        @Override
        public KeyPair getKeyPair() {
            return keyPair;
        }

        /**
         * Gets the public key
         * @return the public key, not null
         * @deprecated use getKeyPair() instead
         */
        @Override
        @Deprecated
        public RSAPublicKey getPublicKey() {
            return (RSAPublicKey) keyPair.getPublic();
        }

        /**
         * Gets the private key
         * @return the private key, not null
         * @deprecated use getKeyPair() instead
         */
        @Override
        @Deprecated
        public RSAPrivateKey getPrivateKey() {
            return (RSAPrivateKey) keyPair.getPrivate();
        }

        @Override
        public void refreshKeys() {
            this.keyPair = GENERATOR.generateKeyPair();
        }
    }
}
