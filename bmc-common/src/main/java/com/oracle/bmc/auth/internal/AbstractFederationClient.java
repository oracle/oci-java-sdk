/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ProvidesConfigurableRefresh;
import com.oracle.bmc.auth.ProvidesCustomRequestSigner;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
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
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.util.internal.Validate;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Function;

import org.slf4j.Logger;

/**
 * This class gets a security token from the auth service by signing the request with a PKI issued leaf certificate,
 * passing along a temporary public key that is bounded to the the security token, and the leaf certificate.
 */
public abstract class AbstractFederationClient
        implements FederationClient, ProvidesConfigurableRefresh {
    protected static final Function<Response, WithHeaders<X509FederationClient.SecurityToken>>
            SECURITY_TOKEN_FN =
                    new ResponseConversionFunctionFactory()
                            .create(X509FederationClient.SecurityToken.class);
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AbstractFederationClient.class);

    protected final SessionKeySupplier sessionKeySupplier;
    protected final String resourcePrincipalTokenEndpoint;
    protected final String resourcePrincipalTokenUrl;
    protected final String federationEndpoint;
    private volatile SecurityTokenAdapter securityTokenAdapter = null;
    ClientConfiguration clientConfiguration = null;
    protected final RestClient restClient;

    /**
     * Constructor of AbstractFederationClient.
     *
     * @param resourcePrincipalTokenUrl             the url that can provide the resource principal token.
     * @param resourcePrincipalTokenEndpoint        the endpoint that can provide the resource principal token.
     * @param federationEndpoint                    the endpoint that can provide the resource principal session token.
     * @param sessionKeySupplier                    the session key supplier.
     * @param basicAuthenticationDetailsProvider    the instance principals authentication details provider.
     * @param clientConfigurator                    the reset client configurator.
     */
    public AbstractFederationClient(
            String resourcePrincipalTokenUrl,
            String resourcePrincipalTokenEndpoint,
            String federationEndpoint,
            SessionKeySupplier sessionKeySupplier,
            BasicAuthenticationDetailsProvider basicAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {
        if (null == resourcePrincipalTokenUrl && null == resourcePrincipalTokenEndpoint) {
            throw new NullPointerException(
                    "resourcePrincipalTokenUrl and resourcePrincipalTokenEndpoint cannot both be null");
        }
        this.resourcePrincipalTokenUrl = resourcePrincipalTokenUrl;
        this.resourcePrincipalTokenEndpoint = resourcePrincipalTokenEndpoint;
        this.federationEndpoint =
                Validate.notNull(federationEndpoint, "federationEndpoint must not be null");
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
        this(
                null,
                resourcePrincipalTokenEndpoint,
                federationEndpoint,
                sessionKeySupplier,
                basicAuthenticationDetailsProvider,
                clientConfigurator,
                circuitBreakerConfiguration);
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

        return refreshAndGetSecurityTokenInner(true, Optional.empty(), true);
    }

    /**
     * Get securityTokenAdapter
     * @return securityTokenAdapter
     */
    protected SecurityTokenAdapter getSecurityTokenAdapter() {
        return securityTokenAdapter;
    }

    /**
     * Gets a security token from the federation endpoint. This will always retrieve
     * a new token from the federation endpoint and does not use a cached token.
     *
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String refreshAndGetSecurityToken() {
        return refreshAndGetSecurityTokenInner(false, Optional.empty(), true);
    }

    /**
     * Gets a security token from the federation endpoint if the security token expires within the provided duration
     * and allows to enable/disable refresh of keys. This will always retrieve a new token from the federation endpoint
     * and does not use a cached token.
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
     * Gets a security token from the federation endpoint if the security token expires within the provided duration.
     * This will always retrieve a new token from the federation endpoint and does not use a cached token.
     *
     * @param time the duration to check
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time), true);
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

    protected String refreshAndGetSecurityTokenInner(
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

    protected SecurityTokenAdapter getSecurityTokenFromServerInner(
            RSAPublicKey publicKey, WebTarget target, String securityContext) {
        Invocation.Builder ib = target.request();
        if (StringUtils.isNotBlank(securityContext)) {
            ib.header("security-context", securityContext);
        }
        URI requestUri = target.getUri();

        Response response = makeCall(ib, requestUri);
        ResponseHelper.throwIfNotSuccessful(response);

        GetResourcePrincipalTokenResponse getResourcePrincipalTokenResponse =
                ResponseHelper.readEntity(response, GetResourcePrincipalTokenResponse.class);

        String servicePrincipalSessionToken =
                getResourcePrincipalTokenResponse.getServicePrincipalSessionToken();
        String resourcePrincipalToken =
                getResourcePrincipalTokenResponse.getResourcePrincipalToken();

        // Get resource principal session token with Identity
        restClient.setEndpoint(federationEndpoint);
        GetResourcePrincipalSessionTokenRequest getResourcePrincipalSessionTokenRequest =
                new GetResourcePrincipalSessionTokenRequest(
                        resourcePrincipalToken,
                        servicePrincipalSessionToken,
                        AuthUtils.base64EncodeNoChunking(publicKey));

        target = restClient.getBaseTarget().path("v1").path("resourcePrincipalSessionToken");
        ib = target.request();
        requestUri = target.getUri();

        // Make a call and get back the security token
        response = makeCall(ib, requestUri, getResourcePrincipalSessionTokenRequest);
        ResponseHelper.throwIfNotSuccessful(response);

        X509FederationClient.SecurityToken securityToken =
                SECURITY_TOKEN_FN.apply(response).getItem();
        return new SecurityTokenAdapter(securityToken.getToken(), sessionKeySupplier);
    }
}
