/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.auth.X509CertificateSupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.ResponseConversionFunctionFactory;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.WithHeaders;
import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.concurrent.Immutable;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.Refreshable;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.security.KeyPair;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashSet;
import java.util.Set;

/**
 * This class gets a security token from the auth service by signing the request with a PKI issued leaf certificate,
 * passing along a temporary public key that is bounded to the the security token, and the leaf certificate.
 */
@Slf4j
public class X509FederationClient implements FederationClient {
    private static final Function<Response, WithHeaders<SecurityToken>> SECURITY_TOKEN_FN =
            new ResponseConversionFunctionFactory().create(SecurityToken.class);
    private static final String DEFAULT_PURPOSE = "DEFAULT";
    private static final String DEFAULT_FINGERPRINT = "SHA256";

    @Getter private final X509CertificateSupplier leafCertificateSupplier;
    @Getter private String tenancyId;
    private final Set<X509CertificateSupplier> intermediateCertificateSuppliers;
    private final SessionKeySupplier sessionKeySupplier;
    private final String purpose;

    private final RestClient federationHttpClient;

    // needs to be volatile to make double-checked locking work
    // see https://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
    private volatile SecurityTokenAdapter securityTokenAdapter = null;

    /**
     * Same as {@link #X509FederationClient(String, String, X509CertificateSupplier, SessionKeySupplier, Set, ClientConfigurator, List, String)}
     * but with 'purpose' set to {@link #DEFAULT_PURPOSE}.
     */
    public X509FederationClient(
            String federationEndpoint,
            String tenancyId,
            X509CertificateSupplier leafCertificateSupplier,
            SessionKeySupplier sessionKeySupplier,
            Set<X509CertificateSupplier> intermediateCertificateSuppliers,
            ClientConfigurator clientConfigurator,
            List<ClientConfigurator> additionalClientConfigurators,
            CircuitBreakerConfiguration circuitBreakerConfig) {
        this(
                federationEndpoint,
                tenancyId,
                leafCertificateSupplier,
                sessionKeySupplier,
                intermediateCertificateSuppliers,
                clientConfigurator,
                additionalClientConfigurators,
                circuitBreakerConfig,
                DEFAULT_PURPOSE);
    }

    /**
     * The constructor.
     * @param federationEndpoint the auth service endpoint.
     * @param tenancyId the tenancy id, to construct the key id
     * @param leafCertificateSupplier the leaf certificate, used to identify the caller
     * @param sessionKeySupplier the temporary public key, whose corresponding private key will be used to sign actual API calls
     * @param intermediateCertificateSuppliers intermediate certificates, if there is any
     * @param clientConfigurator client configurator used to configure the federation rest client, if any (else null)
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param purpose The purpose that will be configured for each request.
     */
    public X509FederationClient(
            String federationEndpoint,
            String tenancyId,
            X509CertificateSupplier leafCertificateSupplier,
            SessionKeySupplier sessionKeySupplier,
            Set<X509CertificateSupplier> intermediateCertificateSuppliers,
            ClientConfigurator clientConfigurator,
            List<ClientConfigurator> additionalClientConfigurators,
            CircuitBreakerConfiguration circuitBreakerConfig,
            String purpose) {
        this.leafCertificateSupplier = Preconditions.checkNotNull(leafCertificateSupplier);
        this.sessionKeySupplier = Preconditions.checkNotNull(sessionKeySupplier);
        this.intermediateCertificateSuppliers = intermediateCertificateSuppliers;
        this.tenancyId = Preconditions.checkNotNull(tenancyId);
        this.federationHttpClient =
                RestClientUtils.createRestClient(
                        federationEndpoint,
                        clientConfigurator,
                        additionalClientConfigurators,
                        this,
                        circuitBreakerConfig);
        this.securityTokenAdapter = new SecurityTokenAdapter(null, sessionKeySupplier);
        this.purpose = Preconditions.checkNotNull(purpose);
    }

    /**
     * Gets a security token. If there is already a valid token cached, it will be returned. Else this will make a call
     * to the auth service to get a new token, using the provided suppliers.
     *
     * This method is thread-safe.
     * @return the security token
     * @throws BmcException If there is any issue with getting a token from the auth server
     * @throws IllegalArgumentException if there is a problem with the key/certificate suppliers
     */
    @Override
    public String getSecurityToken() {
        if (securityTokenAdapter.isValid()) {
            return securityTokenAdapter.getSecurityToken();
        }

        return refreshAndGetSecurityTokenInner(true);
    }

    /**
     * Return a claim embedded in the security token
     * @param key the name of the claim
     * @return the value of the claim
     */
    @Override
    public String getStringClaim(String key) {
        refreshAndGetSecurityTokenInner(true);
        return securityTokenAdapter.getStringClaim(key);
    }

    @Override
    public String refreshAndGetSecurityToken() {
        return refreshAndGetSecurityTokenInner(false);
    }

    private String refreshAndGetSecurityTokenInner(final boolean doFinalTokenValidityCheck) {
        // Since this client will be used in a multi-threaded environment (from within a service API),
        // this needs to be synchronized to make sure multiple calls are not updating the security token at the same time.
        // This should not be a blocking/dead-locked call. The worst I can see at this point is that the auth service does
        // not respond and this call times out, throwing exception
        synchronized (this) {
            // Check again to see if the JWT is still invalid, unless we want to skip that check
            if (!doFinalTokenValidityCheck || !securityTokenAdapter.isValid()) {
                LOG.info("Refreshing session keys.");
                sessionKeySupplier.refreshKeys();

                if (leafCertificateSupplier instanceof Refreshable) {
                    try {
                        ((Refreshable) leafCertificateSupplier).refresh();
                    } catch (RefreshFailedException ex) {
                        throw new BmcException(
                                false, "Can't refresh the leaf certification!", ex, null);
                    }
                    // When using default purpose (ex, instance principals), the token request should always be signed with the same tenant id as the certificate.
                    // For other purposes, the tenant id can be different.
                    if (this.purpose.equals(DEFAULT_PURPOSE)) {
                        String newTenancyId =
                                AuthUtils.getTenantIdFromCertificate(
                                        leafCertificateSupplier
                                                .getCertificateAndKeyPair()
                                                .getCertificate());

                        if (!this.tenancyId.equals(newTenancyId)) {
                            throw new IllegalArgumentException(
                                    "The tenancy id should never be changed in cert file!");
                        }
                    }
                }

                for (X509CertificateSupplier supplier : intermediateCertificateSuppliers) {
                    if (supplier instanceof Refreshable) {
                        try {
                            ((Refreshable) supplier).refresh();
                        } catch (RefreshFailedException ex) {
                            throw new BmcException(
                                    false,
                                    "Can't refresh the intermediate certification!",
                                    ex,
                                    null);
                        }
                    }
                }

                securityTokenAdapter = getSecurityTokenFromServer();
                return securityTokenAdapter.getSecurityToken();
            }

            return securityTokenAdapter.getSecurityToken();
        }
    }

    /**
     * Gets a security token from the federation server
     * @return the security token, which is basically a JWT token string
     */
    private SecurityTokenAdapter getSecurityTokenFromServer() {
        LOG.info("Getting security token from the auth server");

        KeyPair keyPair = sessionKeySupplier.getKeyPair();
        if (keyPair == null) {
            throw new IllegalStateException("Keypair for session was not provided");
        }

        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        if (publicKey == null) {
            throw new IllegalArgumentException("Public key is not present");
        }

        X509CertificateSupplier.CertificateAndPrivateKeyPair certificateAndKeyPair =
                leafCertificateSupplier.getCertificateAndKeyPair();
        if (certificateAndKeyPair == null) {
            throw new IllegalArgumentException("Certificate and key pair are not present");
        }

        X509Certificate leafCertificate = certificateAndKeyPair.getCertificate();
        if (leafCertificate == null) {
            throw new IllegalArgumentException("Leaf certificate is not present");
        }

        if (certificateAndKeyPair.getPrivateKey() == null) {
            throw new IllegalArgumentException("Leaf certificate's private key is not present");
        }

        try {

            Set<String> intermediateStrings = null;
            if (intermediateCertificateSuppliers != null
                    && intermediateCertificateSuppliers.size() > 0) {
                LOG.debug("Intermediate certificate(s) were supplied");

                intermediateStrings = new HashSet<>();
                for (X509CertificateSupplier supplier : intermediateCertificateSuppliers) {
                    X509CertificateSupplier.CertificateAndPrivateKeyPair
                            supplierCertificateAndKeyPair = supplier.getCertificateAndKeyPair();
                    if (supplierCertificateAndKeyPair != null
                            && supplierCertificateAndKeyPair.getCertificate() != null) {
                        intermediateStrings.add(
                                AuthUtils.base64EncodeNoChunking(
                                        supplierCertificateAndKeyPair.getCertificate()));
                    }
                }
            }

            // Create the request body to be sent to the auth service
            X509FederationRequest federationRequest =
                    new X509FederationRequest(
                            AuthUtils.base64EncodeNoChunking(publicKey),
                            AuthUtils.base64EncodeNoChunking(leafCertificate),
                            intermediateStrings,
                            purpose,
                            DEFAULT_FINGERPRINT);

            WebTarget target = federationHttpClient.getBaseTarget().path("v1").path("x509");
            Builder ib = target.request();
            URI requestUri = target.getUri();

            // Make a call and get back the security token
            Response response = makeCall(ib, requestUri, federationRequest);
            SecurityToken securityToken = SECURITY_TOKEN_FN.apply(response).getItem();
            return new SecurityTokenAdapter(securityToken.getToken(), sessionKeySupplier);
        } catch (BmcException e) {
            throw e;
        } catch (CertificateException e) {
            LOG.info("Failed to get encoded x509 certificate");
            throw new IllegalArgumentException("Failed to get encoded x509 certificate", e);
        }
    }

    // really simple retry until the SDK supports internal retries
    @VisibleForTesting
    Response makeCall(Builder ib, URI requestUri, X509FederationRequest federationRequest) {
        BmcException lastException = null;
        // Keeping one instance of the WrappedInvocationBuilder in order to preserve the request ID on retries.
        final WrappedInvocationBuilder wrappedIb = new WrappedInvocationBuilder(ib, requestUri);
        for (int retry = 0; retry < 5; retry++) {
            try {
                return federationHttpClient.post(wrappedIb, federationRequest, new BmcRequest());
            } catch (BmcException e) {
                // retry in all cases right now
                lastException = e;
                try {
                    Thread.sleep(250L);
                } catch (InterruptedException e1) {
                    LOG.debug(
                            "Thread interrupted while waiting to make next call to federation service",
                            e1);
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
        throw lastException;
    }

    @EqualsAndHashCode(callSuper = false)
    @Immutable
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Getter
    public static class X509FederationRequest {
        private final Set<String> intermediateCertificates;
        private final String certificate;
        private final String publicKey;
        private final String purpose;
        private final String fingerprintAlgorithm;

        public X509FederationRequest(
                String publicKey,
                String certificate,
                Set<String> intermediateCertificates,
                String purpose,
                String fingerprintAlgorithm) {
            this.certificate = Preconditions.checkNotNull(certificate);
            this.publicKey = Preconditions.checkNotNull(publicKey);
            this.intermediateCertificates = intermediateCertificates;
            this.purpose = purpose;
            this.fingerprintAlgorithm = fingerprintAlgorithm;
        }
    }

    public static class SecurityToken {
        public SecurityToken(@JsonProperty("token") String token) {
            this.token = token;
        }

        private String token;

        public String getToken() {
            return token;
        }
    }
}
