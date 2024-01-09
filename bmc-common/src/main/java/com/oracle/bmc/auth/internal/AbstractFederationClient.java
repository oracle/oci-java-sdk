/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ProvidesConfigurableRefresh;
import com.oracle.bmc.auth.ProvidesCustomRequestSigner;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.internal.AuthnClientFilter;
import com.oracle.bmc.http.internal.CircuitBreakerHelper;
import com.oracle.bmc.http.internal.ClientCall;
import com.oracle.bmc.http.internal.ClientIdFilter;
import com.oracle.bmc.http.internal.LogHeadersFilter;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import com.oracle.bmc.waiter.FixedTimeDelayStrategy;
import org.slf4j.Logger;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * This class gets a security token from the auth service by signing the request with a PKI issued
 * leaf certificate, passing along a temporary public key that is bounded to the the security token,
 * and the leaf certificate.
 */
public abstract class AbstractFederationClient
        implements FederationClient, ProvidesConfigurableRefresh {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AbstractFederationClient.class);

    protected final SessionKeySupplier sessionKeySupplier;

    private volatile SecurityTokenAdapter securityTokenAdapter = null;

    protected final ClientConfigurator clientConfigurator;
    protected final List<ClientConfigurator> additionalClientConfigurator;
    protected final OciCircuitBreaker circuitBreaker;
    protected final HttpClient resourcePrincipalTokenClient;
    protected final HttpClient federationClient;

    /**
     * Constructor of AbstractFederationClient.
     *
     * @param resourcePrincipalTokenEndpoint the endpoint that can provide the resource principal
     *     token.
     * @param federationEndpoint the endpoint that can provide the resource principal session token.
     * @param sessionKeySupplier the session key supplier.
     * @param basicAuthenticationDetailsProvider the instance principals authentication details
     *     provider.
     * @param clientConfigurator the reset client configurator.
     */
    public AbstractFederationClient(
            String resourcePrincipalTokenEndpoint,
            String federationEndpoint,
            SessionKeySupplier sessionKeySupplier,
            BasicAuthenticationDetailsProvider basicAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {
        this(
                resourcePrincipalTokenEndpoint,
                federationEndpoint,
                sessionKeySupplier,
                basicAuthenticationDetailsProvider,
                clientConfigurator,
                circuitBreakerConfiguration,
                new ArrayList<>());
    }

    /**
     * Constructor of AbstractFederationClient.
     *
     * @param resourcePrincipalTokenEndpoint the endpoint that can provide the resource principal
     *     token.
     * @param federationEndpoint the endpoint that can provide the resource principal session token.
     * @param sessionKeySupplier the session key supplier.
     * @param basicAuthenticationDetailsProvider the instance principals authentication details
     *     provider.
     * @param clientConfigurator the reset client configurator.
     */
    public AbstractFederationClient(
            String resourcePrincipalTokenEndpoint,
            String federationEndpoint,
            SessionKeySupplier sessionKeySupplier,
            BasicAuthenticationDetailsProvider basicAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration,
            List<ClientConfigurator> additionalCLientConfigurators) {
        this(
                null,
                resourcePrincipalTokenEndpoint,
                federationEndpoint,
                sessionKeySupplier,
                basicAuthenticationDetailsProvider,
                clientConfigurator,
                circuitBreakerConfiguration,
                new ArrayList<>());
    }

    /**
     * Constructor of AbstractFederationClient.
     *
     * @param resourcePrincipalTokenUrl the complete url that can provide the resource principal
     *     token.
     * @param resourcePrincipalTokenEndpoint the endpoint that can provide the resource principal
     *     token.
     * @param federationEndpoint the endpoint that can provide the resource principal session token.
     * @param sessionKeySupplier the session key supplier.
     * @param basicAuthenticationDetailsProvider the instance principals authentication details
     *     provider.
     * @param clientConfigurator the reset client configurator.
     */
    public AbstractFederationClient(
            String resourcePrincipalTokenUrl,
            String resourcePrincipalTokenEndpoint,
            String federationEndpoint,
            SessionKeySupplier sessionKeySupplier,
            BasicAuthenticationDetailsProvider basicAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration,
            List<ClientConfigurator> additionalCLientConfigurators) {
        if (null == resourcePrincipalTokenUrl && null == resourcePrincipalTokenEndpoint) {
            throw new NullPointerException(
                    "resourcePrincipalTokenUrl and resourcePrincipalTokenEndpoint cannot both be null");
        }
        Objects.requireNonNull(federationEndpoint, "federationEndpoint");
        this.sessionKeySupplier =
                Validate.notNull(sessionKeySupplier, "sessionKeySupplier must not be null");

        RequestSigner requestSigner;
        if (basicAuthenticationDetailsProvider instanceof ProvidesCustomRequestSigner) {
            requestSigner =
                    ((ProvidesCustomRequestSigner) basicAuthenticationDetailsProvider)
                            .getCustomRequestSigner();
        } else {
            requestSigner =
                    DefaultRequestSigner.createRequestSigner(basicAuthenticationDetailsProvider);
        }

        this.clientConfigurator = clientConfigurator;
        this.additionalClientConfigurator =
                Collections.unmodifiableList(additionalCLientConfigurators);
        this.resourcePrincipalTokenClient =
                !StringUtils.isBlank(resourcePrincipalTokenUrl)
                        ? makeClient(resourcePrincipalTokenUrl, requestSigner)
                        : makeClient(resourcePrincipalTokenEndpoint, requestSigner);
        this.federationClient = makeClient(federationEndpoint, requestSigner);
        if (federationClient != null) {
            this.circuitBreaker =
                    CircuitBreakerHelper.makeCircuitBreaker(
                            federationClient, circuitBreakerConfiguration);
        } else {
            this.circuitBreaker = null;
        }

        this.securityTokenAdapter = new SecurityTokenAdapter(null, sessionKeySupplier);
    }

    protected HttpClient makeClient(String endpoint, RequestSigner requestSigner) {
        HttpClientBuilder rptBuilder =
                HttpProvider.getDefault()
                        .newBuilder()
                        .property(StandardClientProperties.ASYNC_POOL_SIZE, 1)
                        .baseUri(URI.create(endpoint))
                        .registerRequestInterceptor(
                                Priorities.AUTHENTICATION,
                                new AuthnClientFilter(requestSigner, Collections.emptyMap()))
                        .registerRequestInterceptor(
                                Priorities.HEADER_DECORATOR, new ClientIdFilter())
                        .registerRequestInterceptor(Priorities.USER, new LogHeadersFilter());
        if (clientConfigurator != null) {
            clientConfigurator.customizeClient(rptBuilder);
        }
        for (ClientConfigurator additionalConfigurator : additionalClientConfigurator) {
            additionalConfigurator.customizeClient(rptBuilder);
        }
        return rptBuilder.build();
    }

    /**
     * Gets a security token from the federation endpoint. May use a cached token if it judged to
     * still be valid.
     *
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String getSecurityToken() {
        if (securityTokenAdapter.isValid()) {
            return securityTokenAdapter.getSecurityToken();
        }

        return refreshAndGetSecurityTokenInner(true, Optional.empty(), true);
    }

    /**
     * Gets a security token from the federation endpoint. This will always retrieve a new token
     * from the federation endpoint and does not use a cached token.
     *
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String refreshAndGetSecurityToken() {
        return refreshAndGetSecurityTokenInner(false, Optional.empty(), true);
    }

    /**
     * Gets a security token from the federation endpoint if the security token expires within the
     * provided duration and allows to enable/disable refresh of keys. This will always retrieve a
     * new token from the federation endpoint and does not use a cached token.
     *
     * @param time the duration to check
     * @param refreshKeys boolean value to enable/disable refresh of keys
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time, boolean refreshKeys) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time), refreshKeys);
    }

    /**
     * Gets a security token from the federation endpoint. This will always retrieve a new token
     * from the federation endpoint and does not use a cached token.
     *
     * @param time the duration to check
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time), true);
    }

    protected String refreshAndGetSecurityTokenInner(
            final boolean doFinalTokenValidityCheck, Optional<Duration> time, boolean refreshKeys) {
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
                if (refreshKeys) {
                    LOG.info("Refreshing session keys.");
                    sessionKeySupplier.refreshKeys();
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
    protected abstract SecurityTokenAdapter getSecurityTokenFromServer();

    /**
     * Get a claim embedded in the security token. May use the cached token if it is judged to still
     * be valid.
     */
    public String getStringClaim(String key) {
        return null;
    }

    protected SecurityTokenAdapter requestSessionToken(
            GetResourcePrincipalSessionTokenRequest getResourcePrincipalSessionTokenRequest) {
        X509FederationClient.SecurityToken securityToken =
                ClientCall.builder(
                                federationClient,
                                new BmcRequest<GetResourcePrincipalSessionTokenRequest>() {
                                    @Override
                                    public GetResourcePrincipalSessionTokenRequest getBody$() {
                                        return getResourcePrincipalSessionTokenRequest;
                                    }
                                },
                                X509FederationClient.FederationResponseWrapper.Builder::new)
                        .method(Method.POST)
                        .logger(LOG, "ResourcePrincipalsFederationClient")
                        .handleBody(X509FederationClient.SecurityToken.class, (w, t) -> w.token = t)
                        .clientConfigurator(clientConfigurator)
                        .appendPathPart("v1")
                        .appendPathPart("resourcePrincipalSessionToken")
                        .circuitBreaker(circuitBreaker)
                        .hasBody()
                        .retryConfiguration(
                                RetryConfiguration.builder()
                                        .terminationStrategy(new MaxAttemptsTerminationStrategy(5))
                                        .delayStrategy(new FixedTimeDelayStrategy(250))
                                        .retryCondition(exception -> true)
                                        .build())
                        .callSync()
                        .token;

        return new SecurityTokenAdapter(securityToken.getToken(), sessionKeySupplier);
    }

    protected ClientCall<?, GetResourcePrincipalTokenResponse.ResponseWrapper, ?> prepareRptCall() {
        return ClientCall.builder(
                        resourcePrincipalTokenClient,
                        new BmcRequest<>(),
                        GetResourcePrincipalTokenResponse.ResponseWrapper.Builder::new)
                .handleBody(GetResourcePrincipalTokenResponse.class, (w, b) -> w.body = b)
                .clientConfigurator(clientConfigurator)
                .circuitBreaker(circuitBreaker);
    }

    /**
     * Get securityTokenAdapter
     *
     * @return securityTokenAdapter
     */
    protected SecurityTokenAdapter getSecurityTokenAdapter() {
        return securityTokenAdapter;
    }
}
