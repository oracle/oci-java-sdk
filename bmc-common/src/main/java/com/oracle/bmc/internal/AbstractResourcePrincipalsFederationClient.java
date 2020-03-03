/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.ResponseConversionFunctionFactory;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.RestClientFactoryBuilder;
import com.oracle.bmc.http.internal.WithHeaders;
import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.concurrent.Immutable;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import java.net.URI;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.util.Collections;

/**
 * This class gets a security token from the auth service by signing the request with a PKI issued leaf certificate,
 * passing along a temporary public key that is bounded to the the security token, and the leaf certificate.
 */
@Slf4j
abstract class AbstractResourcePrincipalsFederationClient<
                T extends AbstractAuthenticationDetailsProvider>
        implements FederationClient {
    protected static final Function<Response, WithHeaders<X509FederationClient.SecurityToken>>
            SECURITY_TOKEN_FN =
                    new ResponseConversionFunctionFactory()
                            .create(X509FederationClient.SecurityToken.class);

    private final T provider;
    private final SessionKeySupplier sessionKeySupplier;

    // create different clients so that the endpoint is immutable (else the clients are not threadsafe)
    private final RestClient federationRestClient;
    private final RestClient resourcePrincipalsRestClient;

    private volatile SecurityTokenAdapter securityTokenAdapter = null;

    /**
     * Constructor of ResourcePrincipalsFederationClient.
     *
     * @param resourcePrincipalTokenEndpoint        the endpoint that can provide the resource principal token.
     * @param federationEndpoint                    the endpoint that can provide the resource principal session token.
     * @param sessionKeySupplier                    the session key supplier.
     * @param basicAuthenticationDetailsProvider    the instance principals authentication details provider.
     * @param clientConfigurator                    the reset client configurator.
     */
    public AbstractResourcePrincipalsFederationClient(
            T provider,
            String resourcePrincipalTokenEndpoint,
            String federationEndpoint,
            SessionKeySupplier sessionKeySupplier,
            BasicAuthenticationDetailsProvider basicAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator) {
        Preconditions.checkNotNull(resourcePrincipalTokenEndpoint);
        this.provider = Preconditions.checkNotNull(provider);
        this.sessionKeySupplier = Preconditions.checkNotNull(sessionKeySupplier);

        RequestSigner requestSigner =
                DefaultRequestSigner.createRequestSigner(basicAuthenticationDetailsProvider);

        RestClientFactory restClientFactory =
                RestClientFactoryBuilder.builder().clientConfigurator(clientConfigurator).build();
        this.federationRestClient = restClientFactory.create(requestSigner, Collections.emptyMap());
        this.federationRestClient.setEndpoint(resourcePrincipalTokenEndpoint);

        this.resourcePrincipalsRestClient =
                restClientFactory.create(requestSigner, Collections.emptyMap());
        // Get resource principal token with SecretsVault or DBAAS
        this.resourcePrincipalsRestClient.setEndpoint(resourcePrincipalTokenEndpoint);

        this.securityTokenAdapter = new SecurityTokenAdapter(null, sessionKeySupplier);
    }

    /**
     * Gets a security token from the federation endpoint. May use a cached token if
     * it judged to still be valid.
     *
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String getSecurityToken() {
        if (securityTokenAdapter.isValid()) {
            return securityTokenAdapter.getSecurityToken();
        }

        return refreshAndGetSecurityTokenInner(true);
    }

    /**
     * Return a claim from the security token
     * @param key the claim to retrieve
     * @return the string value of the claim in the security token, or null.
     */
    @Override
    public String getStringClaim(String key) {
        refreshAndGetSecurityToken();
        return securityTokenAdapter.getStringClaim(key);
    }

    /**
     * Gets a security token from the federation endpoint. This will always retrieve
     * a new token from the federation endpoint and does not use a cached token.
     *
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String refreshAndGetSecurityToken() {
        return refreshAndGetSecurityTokenInner(false);
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

        try {
            // Get resource principal token from service cp, like SecretsVault or DBAAS
            WebTarget target = getResourcePrincipalsTarget(resourcePrincipalsRestClient, provider);
            Invocation.Builder ib = target.request();
            URI requestUri = target.getUri();

            Response response = makeCall(resourcePrincipalsRestClient, ib, requestUri);
            ResponseHelper.throwIfNotSuccessful(response);

            GetResourcePrincipalTokenResponse getResourcePrincipalTokenResponse =
                    ResponseHelper.readEntity(response, GetResourcePrincipalTokenResponse.class);

            String servicePrincipalSessionToken =
                    getResourcePrincipalTokenResponse.getServicePrincipalSessionToken();
            String resourcePrincipalToken =
                    getResourcePrincipalTokenResponse.getResourcePrincipalToken();

            GetResourcePrincipalSessionTokenRequest getResourcePrincipalSessionTokenRequest =
                    new GetResourcePrincipalSessionTokenRequest(
                            resourcePrincipalToken,
                            servicePrincipalSessionToken,
                            AuthUtils.base64EncodeNoChunking(publicKey));

            target = getFederationClientTarget(federationRestClient);
            ib = target.request();

            // Make a call and get back the security token
            response =
                    makeCall(
                            federationRestClient,
                            ib,
                            getResourcePrincipalSessionTokenRequest,
                            requestUri);
            ResponseHelper.throwIfNotSuccessful(response);

            X509FederationClient.SecurityToken securityToken =
                    SECURITY_TOKEN_FN.apply(response).getItem();
            return new SecurityTokenAdapter(securityToken.getToken(), sessionKeySupplier);

        } catch (BmcException ex) {
            throw ex;
        }
    }

    protected abstract WebTarget getResourcePrincipalsTarget(RestClient client, T provider);

    protected abstract WebTarget getFederationClientTarget(RestClient client);

    protected static Response makeCall(
            RestClient restClient,
            Invocation.Builder ib,
            GetResourcePrincipalSessionTokenRequest request,
            URI requestUri) {
        // Keeping one instance of the WrappedInvocationBuilder in order to preserve the request ID on retries.
        // Note: This step seems not necessary because identity data plane does not support request id in request object
        final WrappedInvocationBuilder wrappedIb = new WrappedInvocationBuilder(ib, requestUri);

        return makeCallInner(restClient, wrappedIb, request);
    }

    protected static Response makeCall(
            RestClient restClient, Invocation.Builder ib, URI requestUri) {
        // Keeping one instance of the WrappedInvocationBuilder in order to preserve the request ID on retries.
        final WrappedInvocationBuilder wrappedIb = new WrappedInvocationBuilder(ib, requestUri);

        return makeCallInner(restClient, wrappedIb, null);
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

                securityTokenAdapter = getSecurityTokenFromServer();
                return securityTokenAdapter.getSecurityToken();
            }

            return securityTokenAdapter.getSecurityToken();
        }
    }

    private static Response makeCallInner(
            RestClient restClient, final WrappedInvocationBuilder wrappedIb, Object request) {
        final int MAX_RETRIES = 5;

        BmcException lastException = null;

        for (int retry = 0; retry < MAX_RETRIES; retry++) {
            try {
                if (request != null) {
                    return restClient.post(wrappedIb, request, new BmcRequest());
                } else {
                    return restClient.get(wrappedIb, new BmcRequest());
                }

            } catch (BmcException ex) {
                // retry in all cases right now
                lastException = ex;
                try {
                    Thread.sleep(250L);
                } catch (InterruptedException iex) {
                    LOG.debug(
                            "Thread interrupted while waiting to make next call to federation service",
                            iex);
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
    @AllArgsConstructor
    @Getter
    private static class GetResourcePrincipalSessionTokenRequest {
        private final String resourcePrincipalToken;
        private final String servicePrincipalSessionToken;
        private final String sessionPublicKey;
    }

    @Setter
    @Getter
    private static class GetResourcePrincipalTokenResponse {
        @JsonProperty("resourcePrincipalToken")
        private String resourcePrincipalToken;

        @JsonProperty("servicePrincipalSessionToken")
        private String servicePrincipalSessionToken;
    }
}
