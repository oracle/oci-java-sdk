/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ProvidesClientConfigurators;
import com.oracle.bmc.auth.RegionProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import com.oracle.bmc.common.ClientBuilderBase;
import com.oracle.bmc.common.InternalBuilderAccess;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.CompositeClientConfigurator;
import com.oracle.bmc.http.DefaultConfigurator;
import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.responses.BmcResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

abstract class BaseClient implements AutoCloseable {
    private static final ClientConfigurator DEFAULT_CONFIGURATOR = new DefaultConfigurator();
    private static final ClientIdFilter CLIENT_ID_FILTER = new ClientIdFilter();
    private static final LogHeadersFilter LOG_HEADERS_FILTER = new LogHeadersFilter();

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final Service service;
    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;
    private final CircuitBreakerConfiguration circuitBreakerConfiguration;
    final ClientConfiguration clientConfigurationToUse;
    private final RequestSigner defaultRequestSigner;
    private final Map<SigningStrategy, RequestSigner> requestSigners;
    private final ClientConfigurator clientConfigurator;
    private OciCircuitBreaker circuitBreaker;
    private final HttpProvider httpProvider;

    private volatile String endpoint;
    private volatile HttpClient httpClient;

    protected BaseClient(
            ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {
        this.service = InternalBuilderAccess.getService(builder);
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        this.circuitBreakerConfiguration = circuitBreakerConfiguration;
        HttpProvider httpProvider = InternalBuilderAccess.getHttpProvider(builder);
        if (httpProvider == null) {
            httpProvider = HttpProvider.getDefault();
        }
        this.httpProvider = httpProvider;

        List<ClientConfigurator> authenticationDetailsConfigurators = new ArrayList<>();
        if (this.authenticationDetailsProvider instanceof ProvidesClientConfigurators) {
            authenticationDetailsConfigurators.addAll(
                    ((ProvidesClientConfigurators) this.authenticationDetailsProvider)
                            .getClientConfigurators());
        }

        ClientConfiguration configuration = InternalBuilderAccess.getConfiguration(builder);
        this.clientConfigurationToUse =
                configuration != null ? configuration : ClientConfiguration.builder().build();

        this.defaultRequestSigner =
                InternalBuilderAccess.getRequestSignerFactory(builder)
                        .createRequestSigner(service, this.authenticationDetailsProvider);

        this.requestSigners = new EnumMap<>(SigningStrategy.class);
        if (this.authenticationDetailsProvider instanceof BasicAuthenticationDetailsProvider) {
            for (SigningStrategy s : SigningStrategy.values()) {
                requestSigners.put(
                        s,
                        InternalBuilderAccess.getSigningStrategyRequestSignerFactories(builder)
                                .get(s)
                                .createRequestSigner(service, authenticationDetailsProvider));
            }
        }

        ClientConfigurator preferredClientConfigurator =
                InternalBuilderAccess.getClientConfigurator(builder);
        if (preferredClientConfigurator == null) {
            preferredClientConfigurator = getDefaultConfigurator();
        }
        List<ClientConfigurator> additionalClientConfigurators =
                InternalBuilderAccess.getAdditionalClientConfigurators(builder);
        if (!additionalClientConfigurators.isEmpty()) {
            List<ClientConfigurator> composedList =
                    new ArrayList<>(additionalClientConfigurators.size() + 1);
            composedList.add(preferredClientConfigurator);
            composedList.addAll(additionalClientConfigurators);
            this.clientConfigurator = new CompositeClientConfigurator(composedList);
        } else {
            this.clientConfigurator = preferredClientConfigurator;
        }

        String endpoint = InternalBuilderAccess.getEndpoint(builder);
        if (this.authenticationDetailsProvider instanceof RegionProvider) {
            RegionProvider provider = (RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.setRegion(provider.getRegion());
                if (endpoint != null) {
                    logger.info(
                            "Authentication details provider configured for region '{}', but endpoint specifically set to '{}'. Using endpoint setting instead of region.",
                            provider.getRegion(),
                            endpoint);
                }
            }
        }

        if (endpoint != null) {
            setEndpoint(endpoint);
        }
    }

    protected ClientConfigurator getDefaultConfigurator() {
        return DEFAULT_CONFIGURATOR;
    }

    public final synchronized void setEndpoint(String endpoint) {
        logger.info("Setting endpoint to {}", endpoint);

        this.endpoint = endpoint;

        HttpClientBuilder builder =
                httpProvider
                        .newBuilder()
                        .baseUri(URI.create(endpoint))
                        .property(
                                StandardClientProperties.CONNECT_TIMEOUT,
                                Duration.ofMillis(
                                        clientConfigurationToUse.getConnectionTimeoutMillis()))
                        .property(
                                StandardClientProperties.READ_TIMEOUT,
                                Duration.ofMillis(clientConfigurationToUse.getReadTimeoutMillis()))
                        .property(
                                StandardClientProperties.ASYNC_POOL_SIZE,
                                clientConfigurationToUse.getMaxAsyncThreads())
                        .registerRequestInterceptor(
                                Priorities.AUTHENTICATION,
                                new AuthnClientFilter(defaultRequestSigner, requestSigners))
                        .registerRequestInterceptor(Priorities.HEADER_DECORATOR, CLIENT_ID_FILTER)
                        .registerRequestInterceptor(Priorities.USER, LOG_HEADERS_FILTER);
        clientConfigurator.customizeClient(builder);
        HttpClient oldClient = this.httpClient;
        if (oldClient != null) {
            oldClient.close();
        }
        this.httpClient = builder.build();

        OciCircuitBreaker userDefinedCircuitBreaker = clientConfigurationToUse.getCircuitBreaker();
        circuitBreaker =
                userDefinedCircuitBreaker != null
                        ? userDefinedCircuitBreaker
                        : CircuitBreakerHelper.makeCircuitBreaker(
                                httpClient, circuitBreakerConfiguration);
    }

    public final String getEndpoint() {
        return endpoint;
    }

    /**
     * Rebuild the backing {@link HttpClient}. This will call {@link ClientConfigurator}s again, and
     * can be used to e.g. refresh the SSL certificate.
     */
    public final synchronized void refreshClient() {
        setEndpoint(endpoint);
    }

    // the setRegion methods are exposed by overrides for those clients that are region-specific

    protected void setRegion(com.oracle.bmc.Region region) {
        Optional<String> endpoint = region.getEndpoint(service);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + service + " is not known in region " + region);
        }
    }

    protected void setRegion(String regionId) {
        regionId = regionId.toLowerCase(java.util.Locale.ENGLISH);
        try {
            Region region = Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            logger.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = Region.formatDefaultRegionEndpoint(service, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public final void close() {
        if (httpClient != null) {
            httpClient.close();
        }
    }

    protected <
                    REQ extends BmcRequest<?>,
                    RESP extends BmcResponse,
                    RESP_BUILDER extends BmcResponse.Builder<RESP>>
            ClientCall<REQ, RESP, RESP_BUILDER> clientCall(
                    // for inference, supply these directly
                    REQ request, Supplier<RESP_BUILDER> responseBuilder) {
        return ClientCall.builder(httpClient, request, responseBuilder)
                .clientConfigurator(clientConfigurator)
                .authenticationDetailsProvider(authenticationDetailsProvider)
                .circuitBreaker(circuitBreaker);
    }
}
