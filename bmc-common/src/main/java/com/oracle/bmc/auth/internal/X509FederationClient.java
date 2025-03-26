/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.net.URI;
import java.security.KeyPair;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashSet;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import javax.annotation.concurrent.Immutable;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.Refreshable;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import com.oracle.bmc.retrier.DefaultRetryCondition;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategyWithJitter;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.oracle.bmc.auth.ProvidesConfigurableRefresh;
import com.oracle.bmc.util.VisibleForTesting;
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
import com.oracle.bmc.util.internal.Validate;

import javax.annotation.concurrent.Immutable;
import javax.annotation.Nonnull;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.Refreshable;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.security.KeyPair;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;

/**
 * This class gets a security token from the auth service by signing the request with a PKI issued leaf certificate,
 * passing along a temporary public key that is bounded to the the security token, and the leaf certificate.
 */
public class X509FederationClient implements FederationClient, ProvidesConfigurableRefresh {
    private static final RetryConfiguration RETRY_CONFIGURATION =
            RetryConfiguration.builder()
                    .delayStrategy(new ExponentialBackoffDelayStrategyWithJitter(1000))
                    .terminationStrategy(new MaxAttemptsTerminationStrategy(3))
                    .retryCondition(
                            new DefaultRetryCondition() {
                                @Override
                                public boolean shouldBeRetried(@Nonnull BmcException e) {
                                    if (e == null) {
                                        throw new java.lang.NullPointerException(
                                                "e is marked non-null but is null");
                                    }
                                    // We should not retry on 4xx
                                    return e.getStatusCode() < 400 || e.getStatusCode() >= 500;
                                }
                            })
                    .build();
    private static final Function<Response, WithHeaders<SecurityToken>> SECURITY_TOKEN_FN =
            new ResponseConversionFunctionFactory().create(SecurityToken.class);
    private static final String DEFAULT_PURPOSE = "DEFAULT";
    private static final String DEFAULT_FINGERPRINT = "SHA256";
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(X509FederationClient.class);

    private final X509CertificateSupplier leafCertificateSupplier;
    private String tenancyId;
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
     * @param intermediateCertificateSuppliers intermediate certificates, if there are any (else null)
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
        this.leafCertificateSupplier =
                Validate.notNull(
                        leafCertificateSupplier, "leafCertificateSupplier must not be null");
        this.sessionKeySupplier =
                Validate.notNull(sessionKeySupplier, "sessionKeySupplier must not be null");
        this.intermediateCertificateSuppliers = intermediateCertificateSuppliers;
        this.tenancyId = Validate.notNull(tenancyId, "tenancyId must not be null");
        this.federationHttpClient =
                RestClientUtils.createRestClient(
                        federationEndpoint,
                        clientConfigurator,
                        additionalClientConfigurators,
                        this,
                        circuitBreakerConfig);
        this.securityTokenAdapter = new SecurityTokenAdapter(null, sessionKeySupplier);
        this.purpose = Validate.notNull(purpose, "purpose must not be null");
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

        return refreshAndGetSecurityTokenInner(true, Optional.empty(), true);
    }

    /**
     * Return a claim embedded in the security token
     * @param key the name of the claim
     * @return the value of the claim
     */
    @Override
    public String getStringClaim(String key) {
        refreshAndGetSecurityTokenInner(true, Optional.empty(), true);
        return securityTokenAdapter.getStringClaim(key);
    }

    @Override
    public String refreshAndGetSecurityToken() {
        return refreshAndGetSecurityTokenInner(false, Optional.empty(), true);
    }

    private String refreshAndGetSecurityTokenInner(
            final boolean doFinalTokenValidityCheck, Optional<Duration> time, boolean refreshKeys) {
        // Since this client will be used in a multi-threaded environment (from within a service API),
        // this needs to be synchronized to make sure multiple calls are not updating the security token at the same time.
        // This should not be a blocking/dead-locked call. The worst I can see at this point is that the auth service does
        // not respond and this call times out, throwing exception
        synchronized (this) {
            // Check again to see if the JWT is still invalid, unless we want to skip that check
            if (!doFinalTokenValidityCheck
                    || (time.isPresent()
                            ? (!securityTokenAdapter.isValid(time))
                            : (!securityTokenAdapter.isValid()))) {
                if (refreshKeys) {
                    LOG.info("Refreshing session keys.");
                    sessionKeySupplier.refreshKeys();
                }
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
            // TODO: authorizedTenancyIds will eventually be added to the payload
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

    @VisibleForTesting
    Response makeCall(Builder ib, URI requestUri, X509FederationRequest federationRequest) {
        final WrappedInvocationBuilder wrappedIb = new WrappedInvocationBuilder(ib, requestUri);
        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(RETRY_CONFIGURATION, null);
        return retrier.execute(
                federationRequest,
                retryRequest -> {
                    return federationHttpClient.post(
                            wrappedIb, federationRequest, new BmcRequest());
                });
    }

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time) {
        return refreshAndGetSecurityTokenIfExpiringWithin(time, true);
    }

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time, boolean refreshKeys) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time), refreshKeys);
    }

    public X509CertificateSupplier getLeafCertificateSupplier() {
        return this.leafCertificateSupplier;
    }

    public String getTenancyId() {
        return this.tenancyId;
    }

    @Immutable
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
            this.certificate = Validate.notNull(certificate, "certificate must not be null");
            this.publicKey = Validate.notNull(publicKey, "publicKey must not be null");
            this.intermediateCertificates = intermediateCertificates;
            this.purpose = purpose;
            this.fingerprintAlgorithm = fingerprintAlgorithm;
        }

        public Set<String> getIntermediateCertificates() {
            return this.intermediateCertificates;
        }

        public String getCertificate() {
            return this.certificate;
        }

        public String getPublicKey() {
            return this.publicKey;
        }

        public String getPurpose() {
            return this.purpose;
        }

        public String getFingerprintAlgorithm() {
            return this.fingerprintAlgorithm;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof X509FederationRequest)) return false;
            final X509FederationRequest other = (X509FederationRequest) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$intermediateCertificates = this.getIntermediateCertificates();
            final Object other$intermediateCertificates = other.getIntermediateCertificates();
            if (this$intermediateCertificates == null
                    ? other$intermediateCertificates != null
                    : !this$intermediateCertificates.equals(other$intermediateCertificates))
                return false;
            final Object this$certificate = this.getCertificate();
            final Object other$certificate = other.getCertificate();
            if (this$certificate == null
                    ? other$certificate != null
                    : !this$certificate.equals(other$certificate)) return false;
            final Object this$publicKey = this.getPublicKey();
            final Object other$publicKey = other.getPublicKey();
            if (this$publicKey == null
                    ? other$publicKey != null
                    : !this$publicKey.equals(other$publicKey)) return false;
            final Object this$purpose = this.getPurpose();
            final Object other$purpose = other.getPurpose();
            if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose))
                return false;
            final Object this$fingerprintAlgorithm = this.getFingerprintAlgorithm();
            final Object other$fingerprintAlgorithm = other.getFingerprintAlgorithm();
            if (this$fingerprintAlgorithm == null
                    ? other$fingerprintAlgorithm != null
                    : !this$fingerprintAlgorithm.equals(other$fingerprintAlgorithm)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof X509FederationRequest;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $intermediateCertificates = this.getIntermediateCertificates();
            result =
                    result * PRIME
                            + ($intermediateCertificates == null
                                    ? 43
                                    : $intermediateCertificates.hashCode());
            final Object $certificate = this.getCertificate();
            result = result * PRIME + ($certificate == null ? 43 : $certificate.hashCode());
            final Object $publicKey = this.getPublicKey();
            result = result * PRIME + ($publicKey == null ? 43 : $publicKey.hashCode());
            final Object $purpose = this.getPurpose();
            result = result * PRIME + ($purpose == null ? 43 : $purpose.hashCode());
            final Object $fingerprintAlgorithm = this.getFingerprintAlgorithm();
            result =
                    result * PRIME
                            + ($fingerprintAlgorithm == null
                                    ? 43
                                    : $fingerprintAlgorithm.hashCode());
            return result;
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
