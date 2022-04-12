/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ProvidesConfigurableRefresh;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.ResponseConversionFunctionFactory;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.RestClientFactoryBuilder;
import com.oracle.bmc.http.internal.WithHeaders;
import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.time.Duration;
import java.util.Collections;
import java.util.Optional;

/**
 * This class gets a security token from the auth service by signing the request with a PKI issued leaf certificate,
 * passing along a temporary public key that is bounded to the the security token, and the leaf certificate.
 */
@Slf4j
public abstract class AbstractFederationClient
        implements FederationClient, ProvidesConfigurableRefresh {
    protected static final Function<Response, WithHeaders<X509FederationClient.SecurityToken>>
            SECURITY_TOKEN_FN =
                    new ResponseConversionFunctionFactory()
                            .create(X509FederationClient.SecurityToken.class);

    protected final SessionKeySupplier sessionKeySupplier;
    protected final String resourcePrincipalTokenEndpoint;
    protected final String federationEndpoint;

    private ClientConfiguration clientConfiguration = null;
    private volatile SecurityTokenAdapter securityTokenAdapter = null;
    protected final RestClient restClient;

    /**
     * Constructor of AbstractFederationClient.
     *
     * @param resourcePrincipalTokenEndpoint        the endpoint that can provide the resource principal token.
     * @param federationEndpoint                    the endpoint that can provide the resource principal session token.
     * @param sessionKeySupplier                    the session key supplier.
     * @param basicAuthenticationDetailsProvider    the instance principals authentication details provider.
     * @param clientConfigurator                    the reset client configurator.
     */
    public AbstractFederationClient(
            String resourcePrincipalTokenEndpoint,
            String federationEndpoint,
            SessionKeySupplier sessionKeySupplier,
            BasicAuthenticationDetailsProvider basicAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {
        this.resourcePrincipalTokenEndpoint =
                Preconditions.checkNotNull(resourcePrincipalTokenEndpoint);
        this.federationEndpoint = Preconditions.checkNotNull(federationEndpoint);
        this.sessionKeySupplier = Preconditions.checkNotNull(sessionKeySupplier);

        RequestSigner requestSigner =
                DefaultRequestSigner.createRequestSigner(basicAuthenticationDetailsProvider);

        if (circuitBreakerConfiguration != null) {
            clientConfiguration =
                    ClientConfiguration.builder()
                            .circuitBreakerConfiguration(circuitBreakerConfiguration)
                            .build();
        }

        RestClientFactory restClientFactory =
                RestClientFactoryBuilder.builder().clientConfigurator(clientConfigurator).build();
        this.restClient =
                restClientFactory.create(
                        requestSigner, Collections.emptyMap(), clientConfiguration);

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

        return refreshAndGetSecurityTokenInner(true, Optional.empty());
    }

    /**
     * Gets a security token from the federation endpoint. This will always retrieve
     * a new token from the federation endpoint and does not use a cached token.
     *
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String refreshAndGetSecurityToken() {
        return refreshAndGetSecurityTokenInner(false, Optional.empty());
    }

    /**
     * Gets a security token from the federation endpoint. This will always retrieve
     * a new token from the federation endpoint and does not use a cached token.
     *
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time) {
        return refreshAndGetSecurityTokenInner(false, Optional.of(time));
    }

    protected Response makeCall(
            Invocation.Builder ib,
            URI requestUri,
            GetResourcePrincipalSessionTokenRequest request) {
        // Keeping one instance of the WrappedInvocationBuilder in order to preserve the request ID on retries.
        // Note: This step seems not necessary because identity data plane does not support request id in request object
        final WrappedInvocationBuilder wrappedIb = new WrappedInvocationBuilder(ib, requestUri);

        return makeCallInner(wrappedIb, request);
    }

    protected Response makeCall(Invocation.Builder ib, URI requestUri) {
        // Keeping one instance of the WrappedInvocationBuilder in order to preserve the request ID on retries.
        final WrappedInvocationBuilder wrappedIb = new WrappedInvocationBuilder(ib, requestUri);

        return makeCallInner(wrappedIb, null);
    }

    private String refreshAndGetSecurityTokenInner(
            final boolean doFinalTokenValidityCheck, Optional<Duration> time) {
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
                LOG.info("Refreshing session keys.");
                sessionKeySupplier.refreshKeys();

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
    protected abstract SecurityTokenAdapter getSecurityTokenFromServer();

    protected Response makeCallInner(final WrappedInvocationBuilder wrappedIb, Object request) {
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

    /**
     * Get a claim embedded in the security token. May use the cached token if it is
     * judged to still be valid.
     */
    public String getStringClaim(String key) {
        return null;
    }
}
