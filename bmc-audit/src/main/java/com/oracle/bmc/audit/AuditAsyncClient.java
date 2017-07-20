/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.audit;

import com.oracle.bmc.audit.internal.http.*;
import com.oracle.bmc.audit.requests.*;
import com.oracle.bmc.audit.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class AuditAsyncClient implements AuditAsync {
    /**
     * Service instance for Audit.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("AUDIT", "audit");

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public AuditAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public AuditAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public AuditAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param requestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public AuditAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .build();
        com.oracle.bmc.http.signing.RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(SERVICE, authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        com.google.common.base.Optional<String> endpoint = region.getEndpoint(SERVICE);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase();
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<ListEventsResponse> listEvents(
            ListEventsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListEventsRequest, ListEventsResponse> handler) {
        LOG.trace("Called async listEvents");
        request = ListEventsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = ListEventsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListEventsResponse> transformer =
                ListEventsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }
}
