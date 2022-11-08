/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.oracle.bmc.auth.ProvidesConfigurableRefresh;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.auth.X509CertificateSupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.internal.AuthnClientFilter;
import com.oracle.bmc.http.internal.CircuitBreakerHelper;
import com.oracle.bmc.http.internal.ClientCall;
import com.oracle.bmc.http.internal.ClientIdFilter;
import com.oracle.bmc.http.internal.LogHeadersFilter;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.http.signing.internal.KeySupplier;
import com.oracle.bmc.http.signing.internal.RequestSignerImpl;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.responses.BmcResponse;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.waiter.FixedTimeDelayStrategy;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import org.slf4j.Logger;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.Refreshable;
import java.net.URI;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

/**
 * This class gets a security token from the auth service by signing the request with a PKI issued
 * leaf certificate, passing along a temporary public key that is bounded to the the security token,
 * and the leaf certificate.
 */
public class X509FederationClient implements FederationClient, ProvidesConfigurableRefresh {
    private static final RetryConfiguration RETRY_CONFIGURATION =
            RetryConfiguration.builder()
                    .delayStrategy(new FixedTimeDelayStrategy(250))
                    .terminationStrategy(new MaxAttemptsTerminationStrategy(5))
                    .build();
    private static final String DEFAULT_PURPOSE = "DEFAULT";
    private static final String DEFAULT_FINGERPRINT = "SHA256";
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(X509FederationClient.class);

    private final X509CertificateSupplier leafCertificateSupplier;
    private String tenancyId;
    private final Set<X509CertificateSupplier> intermediateCertificateSuppliers;
    private final SessionKeySupplier sessionKeySupplier;
    private final String purpose;

    private final HttpClient httpClient;
    private final ClientConfigurator clientConfigurator;
    private final List<ClientConfigurator> additionalClientConfigurators;
    private final OciCircuitBreaker circuitBreaker;

    // needs to be volatile to make double-checked locking work
    // see https://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
    private volatile SecurityTokenAdapter securityTokenAdapter = null;

    /**
     * Same as {@link #X509FederationClient(String, String, X509CertificateSupplier,
     * SessionKeySupplier, Set, ClientConfigurator, List, String)} but with 'purpose' set to {@link
     * #DEFAULT_PURPOSE}.
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
     *
     * @param federationEndpoint the auth service endpoint.
     * @param tenancyId the tenancy id, to construct the key id
     * @param leafCertificateSupplier the leaf certificate, used to identify the caller
     * @param sessionKeySupplier the temporary public key, whose corresponding private key will be
     *     used to sign actual API calls
     * @param intermediateCertificateSuppliers intermediate certificates, if there are any (else
     *     null)
     * @param clientConfigurator client configurator used to configure the federation rest client,
     *     if any (else null)
     * @param additionalClientConfigurators Additional client configurators to be run after the
     *     primary configurator.
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
        this.securityTokenAdapter = new SecurityTokenAdapter(null, sessionKeySupplier);
        this.purpose = Validate.notNull(purpose, "purpose must not be null");
        this.clientConfigurator = clientConfigurator;
        this.additionalClientConfigurators = additionalClientConfigurators;

        // load the leaf certificate details dynamically on each invocation in case it has changed,
        // ex, rotated.
        // NOTE: because the signer calls both of these independently, there is an edge case where
        // the certificate
        // has been rotated and the private key and keyId won't match -- that should be taken care
        // of by a retry
        // of the service call.
        KeySupplier<RSAPrivateKey> keySupplier =
                new KeySupplier<RSAPrivateKey>() {
                    @Nonnull
                    @Override
                    public Optional<RSAPrivateKey> supplyKey(@Nonnull String keyId) {
                        PrivateKey privateKey =
                                leafCertificateSupplier.getCertificateAndKeyPair().getPrivateKey();
                        if (privateKey instanceof RSAPrivateKey) {
                            return Optional.of((RSAPrivateKey) privateKey);
                        } else {
                            throw new IllegalArgumentException(
                                    "Private key was not an RSA private key: "
                                            + privateKey.getClass().getSimpleName());
                        }
                    }
                };

        Supplier<String> keyIdSupplier =
                new Supplier<String>() {
                    @Override
                    public String get() {
                        return keyIdForX509Request(
                                tenancyId,
                                leafCertificateSupplier
                                        .getCertificateAndKeyPair()
                                        .getCertificate());
                    }
                };

        this.httpClient =
                HttpProvider.getDefault()
                        .newBuilder()
                        .baseUri(URI.create(federationEndpoint))
                        .registerRequestInterceptor(
                                Priorities.AUTHENTICATION,
                                new AuthnClientFilter(
                                        new RequestSignerImpl(
                                                keySupplier,
                                                SigningStrategy.STANDARD,
                                                keyIdSupplier),
                                        Collections.emptyMap()))
                        .registerRequestInterceptor(
                                Priorities.HEADER_DECORATOR, new ClientIdFilter())
                        .registerRequestInterceptor(Priorities.USER, new LogHeadersFilter())
                        .build();
        this.circuitBreaker =
                CircuitBreakerHelper.makeCircuitBreaker(this.httpClient, circuitBreakerConfig);
    }

    /**
     * Gets a security token. If there is already a valid token cached, it will be returned. Else
     * this will make a call to the auth service to get a new token, using the provided suppliers.
     *
     * <p>This method is thread-safe.
     *
     * @return the security token
     * @throws BmcException If there is any issue with getting a token from the auth server
     * @throws IllegalArgumentException if there is a problem with the key/certificate suppliers
     */
    @Override
    public String getSecurityToken() {
        if (securityTokenAdapter.isValid()) {
            return securityTokenAdapter.getSecurityToken();
        }

        return refreshAndGetSecurityTokenInner(true, Optional.empty());
    }

    /**
     * Return a claim embedded in the security token
     *
     * @param key the name of the claim
     * @return the value of the claim
     */
    @Override
    public String getStringClaim(String key) {
        refreshAndGetSecurityTokenInner(true, Optional.empty());
        return securityTokenAdapter.getStringClaim(key);
    }

    @Override
    public String refreshAndGetSecurityToken() {
        return refreshAndGetSecurityTokenInner(false, Optional.empty());
    }

    private String refreshAndGetSecurityTokenInner(
            final boolean doFinalTokenValidityCheck, Optional<Duration> time) {
        // Since this client will be used in a multi-threaded environment (from within a service
        // API),
        // this needs to be synchronized to make sure multiple calls are not updating the security
        // token at the same time.
        // This should not be a blocking/dead-locked call. The worst I can see at this point is that
        // the auth service does
        // not respond and this call times out, throwing exception
        synchronized (this) {
            // Check again to see if the JWT is still invalid, unless we want to skip that check
            if (!doFinalTokenValidityCheck
                    || (time.isPresent()
                            ? (!securityTokenAdapter.isValid(time))
                            : (!securityTokenAdapter.isValid()))) {
                LOG.info("Refreshing session keys.");
                sessionKeySupplier.refreshKeys();

                if (leafCertificateSupplier instanceof Refreshable) {
                    try {
                        ((Refreshable) leafCertificateSupplier).refresh();
                    } catch (RefreshFailedException ex) {
                        throw new BmcException(
                                false, "Can't refresh the leaf certification!", ex, null);
                    }
                    // When using default purpose (ex, instance principals), the token request
                    // should always be signed with the same tenant id as the certificate.
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
     *
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

            FederationResponseWrapper resp =
                    ClientCall.builder(
                                    httpClient,
                                    new FederationRequestWrapper(federationRequest),
                                    FederationResponseWrapper.Builder::new)
                            .method(Method.POST)
                            .logger(LOG, "X509FederationClient")
                            .appendPathPart("v1")
                            .appendPathPart("x509")
                            .handleBody(
                                    SecurityToken.class, (builder, token) -> builder.token = token)
                            .retryConfiguration(RETRY_CONFIGURATION)
                            .clientConfigurator(clientConfigurator)
                            .circuitBreaker(circuitBreaker)
                            .accept("*/*")
                            .hasBody()
                            .callSync();
            return new SecurityTokenAdapter(resp.token.getToken(), sessionKeySupplier);
        } catch (BmcException e) {
            throw e;
        } catch (CertificateException e) {
            LOG.info("Failed to get encoded x509 certificate");
            throw new IllegalArgumentException("Failed to get encoded x509 certificate", e);
        }
    }

    // really simple retry until the SDK supports internal retries

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time));
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

    private static class FederationRequestWrapper extends BmcRequest<X509FederationRequest> {
        private final X509FederationRequest request;

        FederationRequestWrapper(X509FederationRequest request) {
            this.request = request;
        }

        @Override
        public X509FederationRequest getBody$() {
            return request;
        }
    }

    static class FederationResponseWrapper extends BmcResponse {
        final SecurityToken token;

        FederationResponseWrapper(int status, SecurityToken token) {
            super(status);
            this.token = token;
        }

        static class Builder implements BmcResponse.Builder<FederationResponseWrapper> {
            private int status;
            private Map<String, List<String>> headers;
            SecurityToken token;

            Builder() {}

            private Builder(FederationResponseWrapper b) {
                this.status = b.get__httpStatusCode__();
                this.token = b.token;
            }

            @Override
            public BmcResponse.Builder<FederationResponseWrapper> __httpStatusCode__(
                    int __httpStatusCode__) {
                this.status = __httpStatusCode__;
                return this;
            }

            @Override
            public BmcResponse.Builder<FederationResponseWrapper> headers(
                    Map<String, List<String>> headers) {
                this.headers = headers;
                return this;
            }

            @Override
            public BmcResponse.Builder<FederationResponseWrapper> copy(
                    FederationResponseWrapper o) {
                return new Builder(o);
            }

            @Override
            public FederationResponseWrapper build() {
                return new FederationResponseWrapper(status, token);
            }
        }
    }

    private static String keyIdForX509Request(String tenancyId, X509Certificate certificate) {
        return String.format(
                "%s/fed-x509-sha256/%s", tenancyId, AuthUtils.getFingerPrint(certificate));
    }
}
