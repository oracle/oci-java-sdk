/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class EventClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Event {
    /** Service instance for Event. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("EVENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EventClient.class);

    private final EventWaiters waiters;

    private final EventPaginators paginators;

    EventClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    EventClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("Event-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new EventWaiters(executorService, this);

        this.paginators = new EventPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "EventClient", "getEventContent"));
        }
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, EventClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "osmanagementhub";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public EventClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new EventClient(
                    this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public ChangeEventCompartmentResponse changeEventCompartment(
            ChangeEventCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeEventCompartmentDetails(),
                "changeEventCompartmentDetails is required");

        Validate.notBlank(request.getEventId(), "eventId must not be blank");

        return clientCall(request, ChangeEventCompartmentResponse::builder)
                .logger(LOG, "changeEventCompartment")
                .serviceDetails(
                        "Event",
                        "ChangeEventCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Event/ChangeEventCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeEventCompartmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeEventCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteEventResponse deleteEvent(DeleteEventRequest request) {

        Validate.notBlank(request.getEventId(), "eventId must not be blank");

        return clientCall(request, DeleteEventResponse::builder)
                .logger(LOG, "deleteEvent")
                .serviceDetails(
                        "Event",
                        "DeleteEvent",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Event/DeleteEvent")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEventRequest::builder)
                .basePath("/20220901")
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteEventResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEventResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteEventContentResponse deleteEventContent(DeleteEventContentRequest request) {

        Validate.notBlank(request.getEventId(), "eventId must not be blank");

        return clientCall(request, DeleteEventContentResponse::builder)
                .logger(LOG, "deleteEventContent")
                .serviceDetails(
                        "Event",
                        "DeleteEventContent",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Event/DeleteEventContent")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEventContentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEventContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetEventResponse getEvent(GetEventRequest request) {

        Validate.notBlank(request.getEventId(), "eventId must not be blank");

        return clientCall(request, GetEventResponse::builder)
                .logger(LOG, "getEvent")
                .serviceDetails(
                        "Event",
                        "GetEvent",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Event/GetEvent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEventRequest::builder)
                .basePath("/20220901")
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.Event.class,
                        GetEventResponse.Builder::event)
                .handleResponseHeaderString("etag", GetEventResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEventResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetEventContentResponse getEventContent(GetEventContentRequest request) {

        Validate.notBlank(request.getEventId(), "eventId must not be blank");

        return clientCall(request, GetEventContentResponse::builder)
                .logger(LOG, "getEventContent")
                .serviceDetails(
                        "Event",
                        "GetEventContent",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Event/GetEventContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEventContentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(java.io.InputStream.class, GetEventContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetEventContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEventContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ImportEventContentResponse importEventContent(ImportEventContentRequest request) {

        Validate.notBlank(request.getEventId(), "eventId must not be blank");

        return clientCall(request, ImportEventContentResponse::builder)
                .logger(LOG, "importEventContent")
                .serviceDetails(
                        "Event",
                        "ImportEventContent",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Event/ImportEventContent")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportEventContentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .appendPathParam("actions")
                .appendPathParam("importContent")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", ImportEventContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ImportEventContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListEventsResponse listEvents(ListEventsRequest request) {

        return clientCall(request, ListEventsResponse::builder)
                .logger(LOG, "listEvents")
                .serviceDetails(
                        "Event",
                        "ListEvents",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/EventCollection/ListEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEventsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("events")
                .appendQueryParam("eventSummary", request.getEventSummary())
                .appendQueryParam("eventSummaryContains", request.getEventSummaryContains())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("eventFingerprint", request.getEventFingerprint())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam(
                        "isManagedByAutonomousLinux", request.getIsManagedByAutonomousLinux())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.EventCollection.class,
                        ListEventsResponse.Builder::eventCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEventsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateEventResponse updateEvent(UpdateEventRequest request) {

        Validate.notBlank(request.getEventId(), "eventId must not be blank");
        Objects.requireNonNull(request.getUpdateEventDetails(), "updateEventDetails is required");

        return clientCall(request, UpdateEventResponse::builder)
                .logger(LOG, "updateEvent")
                .serviceDetails(
                        "Event",
                        "UpdateEvent",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Event/UpdateEvent")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEventRequest::builder)
                .basePath("/20220901")
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.Event.class,
                        UpdateEventResponse.Builder::event)
                .handleResponseHeaderString("etag", UpdateEventResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEventResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EventWaiters getWaiters() {
        return waiters;
    }

    @Override
    public EventPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EventClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EventClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EventClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EventClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EventClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EventClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EventClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EventClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
