/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.auth.X509CertificateSupplier;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.ResponseConversionFunctionFactory;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.RestClientFactoryBuilder;
import com.oracle.bmc.http.internal.WithHeaders;
import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.internal.Constants;
import com.oracle.bmc.http.signing.internal.KeySupplier;
import com.oracle.bmc.http.signing.internal.RequestSignerImpl;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.concurrent.Immutable;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.Refreshable;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class gets a security token from the auth service by signing the request with a PKI issued leaf certificate,
 * passing along a temporary public key that is bounded to the the security token, and the leaf certificate.
 */
@Slf4j
public class X509FederationClient implements FederationClient {
    private static final Function<Response, WithHeaders<SecurityToken>> SECURITY_TOKEN_FN =
            new ResponseConversionFunctionFactory().create(SecurityToken.class);

    @Getter private final X509CertificateSupplier leafCertificateSupplier;
    @Getter private String tenancyId;
    private final Set<X509CertificateSupplier> intermediateCertificateSuppliers;
    private final SessionKeySupplier sessionKeySupplier;

    private final RestClient federationHttpClient;

    private SecurityTokenAdapter securityTokenAdapter = null;

    /**
     * The constructor.
     * @param federationEndpoint the auth service endpoint.
     * @param tenancyId the tenancy id, to construct the key id
     * @param leafCertificateSupplier the leaf certificate, used to identify the caller
     * @param sessionKeySupplier the temporary public key, whose corresponding private key will be used to sign actual API calls
     * @param intermediateCertificateSuppliers intermediate certificates, if there is any
     * @param clientConfigurator client configurator used to configure the federation rest client, if any (else null)
     */
    public X509FederationClient(
            String federationEndpoint,
            String tenancyId,
            X509CertificateSupplier leafCertificateSupplier,
            SessionKeySupplier sessionKeySupplier,
            Set<X509CertificateSupplier> intermediateCertificateSuppliers,
            ClientConfigurator clientConfigurator) {

        this.leafCertificateSupplier = Preconditions.checkNotNull(leafCertificateSupplier);
        this.sessionKeySupplier = Preconditions.checkNotNull(sessionKeySupplier);
        this.intermediateCertificateSuppliers = intermediateCertificateSuppliers;
        this.tenancyId = Preconditions.checkNotNull(tenancyId);
        this.federationHttpClient =
                RestClientUtils.createRestClient(federationEndpoint, clientConfigurator, this);
        this.securityTokenAdapter = new SecurityTokenAdapter(null, sessionKeySupplier);
    }

    /**
     * The constructor.
     * @param federationEndpoint the auth service endpoint (i.e., https://auth.r2.oracleiaas.com)
     * @param leafCertificateSupplier the leaf certificate, used to identify the caller
     * @param sessionKeySupplier the temporary public key, whose corresponding private key will be used to sign actual API calls
     * @param intermediateCertificateSuppliers intermediate certificates, if there are any (else null)
     * @param clientConfigurator client configurator used to configure the federation rest client, if any (else null)
     */
    public X509FederationClient(
            String federationEndpoint,
            X509CertificateSupplier leafCertificateSupplier,
            SessionKeySupplier sessionKeySupplier,
            Set<X509CertificateSupplier> intermediateCertificateSuppliers,
            ClientConfigurator clientConfigurator) {
        this(
                federationEndpoint,
                AuthUtils.getTenantIdFromCertificate(
                        leafCertificateSupplier.getCertificateAndKeyPair().getCertificate()),
                leafCertificateSupplier,
                sessionKeySupplier,
                intermediateCertificateSuppliers,
                clientConfigurator);
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

    private RestClient createRestClient(String endpoint) {
        // load the leaf certificate details dynamically on each invocation in case it has changed, ex, rotated
        KeySupplier<RSAPrivateKey> keySupplier =
                new KeySupplier<RSAPrivateKey>() {
                    @Override
                    public Optional<RSAPrivateKey> getKey(String keyId) {
                        return Optional.of(leafCertificateSupplier.getPrivateKey());
                    }
                };
        Supplier<String> keyIdSupplier =
                new Supplier<String>() {
                    @Override
                    public String get() {
                        return keyIdForX509Request(
                                tenancyId, leafCertificateSupplier.getCertificate());
                    }
                };

        // for the federation endpoint, do not sign the HOST header right now
        List<String> genericHeaders = removeHostHeader(Constants.GENERIC_HEADERS);
        List<String> allHeaders = removeHostHeader(Constants.ALL_HEADERS);
        Map<String, List<String>> headersToSign =
                Constants.createHeadersToSignMap(
                        genericHeaders,
                        genericHeaders,
                        genericHeaders,
                        allHeaders,
                        allHeaders,
                        allHeaders);

        RequestSignerImpl.SigningConfiguration signingConfiguration =
                new RequestSignerImpl.SigningConfiguration(headersToSign, false);

        RequestSigner requestSigner =
                new RequestSignerImpl(keySupplier, signingConfiguration, keyIdSupplier);

        RestClientFactory restClientFactory = RestClientFactoryBuilder.builder().build();
        RestClient restClient = restClientFactory.create(requestSigner);
        restClient.setEndpoint(endpoint);
        return restClient;
    }

    private static List<String> removeHostHeader(List<String> headers) {
        List<String> copy = new ArrayList<>();
        for (String header : headers) {
            if (!header.equals(Constants.HOST)) {
                copy.add(header);
            }
        }
        return copy;
    }

    private static String keyIdForX509Request(String tenantId, X509Certificate certificate) {
        return String.format("%s/fed-x509/%s", tenantId, AuthUtils.getFingerPrint(certificate));
    }

    /**
     * Gets a security token from the federation server
     * @return the security token, which is basically a JWT token string
     */
    private SecurityTokenAdapter getSecurityTokenFromServer() {
        LOG.info("Getting security token from the auth server");

        RSAPublicKey publicKey = sessionKeySupplier.getPublicKey();
        if (publicKey == null) {
            throw new IllegalArgumentException("Public key is not present");
        }

        X509Certificate leafCertificate = leafCertificateSupplier.getCertificate();
        if (leafCertificate == null) {
            throw new IllegalArgumentException("Leaf certificate is not present");
        }

        if (leafCertificateSupplier.getPrivateKey() == null) {
            throw new IllegalArgumentException("Leaf certificate's private key is not present");
        }

        try {

            Set<String> intermediateStrings = null;
            if (intermediateCertificateSuppliers != null
                    && intermediateCertificateSuppliers.size() > 0) {
                LOG.debug("Intermediate certificate(s) were supplied");

                intermediateStrings = new HashSet<>();
                for (X509CertificateSupplier supplier : intermediateCertificateSuppliers) {
                    if (supplier.getCertificate() != null) {
                        intermediateStrings.add(
                                AuthUtils.base64EncodeNoChunking(supplier.getCertificate()));
                    }
                }
            }

            // Create the request body to be sent to the auth service
            X509FederationRequest federationRequest =
                    new X509FederationRequest(
                            AuthUtils.base64EncodeNoChunking(publicKey),
                            AuthUtils.base64EncodeNoChunking(leafCertificate),
                            intermediateStrings);

            WebTarget target = federationHttpClient.getBaseTarget().path("v1").path("x509");
            Builder ib = target.request();

            // Make a call and get back the security token
            Response response = makeCall(ib, federationRequest);
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
    private Response makeCall(Builder ib, X509FederationRequest federationRequest) {
        BmcException lastException = null;
        for (int retry = 0; retry < 5; retry++) {
            try {
                // we don't have a wrapper object for the request, just give a new object
                Response response =
                        federationHttpClient.post(
                                new WrappedInvocationBuilder(ib),
                                federationRequest,
                                new BmcRequest());
                return response;
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

        public X509FederationRequest(
                String publicKey, String certificate, Set<String> intermediateCertificates) {
            this.certificate = Preconditions.checkNotNull(certificate);
            this.publicKey = Preconditions.checkNotNull(publicKey);
            this.intermediateCertificates = intermediateCertificates;
        }
    }

    @Getter
    @AllArgsConstructor
    public static class SecurityToken {
        @JsonProperty("token")
        private String token;
    }
}
