/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class EventClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Event {
    /** Service instance for Event. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("EVENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osms.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EventClient.class);

    private final EventPaginators paginators;

    EventClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    EventClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

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

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "osmanagement";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
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
            return new EventClient(this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public DeleteEventContentResponse deleteEventContent(DeleteEventContentRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        Validate.notBlank(request.getEventId(), "eventId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, DeleteEventContentResponse::builder)
                .logger(LOG, "deleteEventContent")
                .serviceDetails(
                        "Event",
                        "DeleteEventContent",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/EventContent/DeleteEventContent")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEventContentRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .appendPathParam("content")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEventContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetEventResponse getEvent(GetEventRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        Validate.notBlank(request.getEventId(), "eventId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetEventResponse::builder)
                .logger(LOG, "getEvent")
                .serviceDetails(
                        "Event",
                        "GetEvent",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/Event/GetEvent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEventRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.Event.class,
                        GetEventResponse.Builder::event)
                .handleResponseHeaderString("etag", GetEventResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEventResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetEventContentResponse getEventContent(GetEventContentRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        Validate.notBlank(request.getEventId(), "eventId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetEventContentResponse::builder)
                .logger(LOG, "getEventContent")
                .serviceDetails("Event", "GetEventContent", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEventContentRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .appendPathParam("content")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(java.io.InputStream.class, GetEventContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetEventContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEventContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetEventReportResponse getEventReport(GetEventReportRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetEventReportResponse::builder)
                .logger(LOG, "getEventReport")
                .serviceDetails(
                        "Event",
                        "GetEventReport",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/EventReport/GetEventReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEventReportRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("events")
                .appendPathParam("report")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("latestTimestampLessThan", request.getLatestTimestampLessThan())
                .appendQueryParam(
                        "latestTimestampGreaterThanOrEqualTo",
                        request.getLatestTimestampGreaterThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.EventReport.class,
                        GetEventReportResponse.Builder::eventReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetEventReportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListEventsResponse listEvents(ListEventsRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEventsResponse::builder)
                .logger(LOG, "listEvents")
                .serviceDetails(
                        "Event",
                        "ListEvents",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/EventCollection/ListEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEventsRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("events")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("eventId", request.getEventId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("eventType", request.getEventType())
                .appendQueryParam("latestTimestampLessThan", request.getLatestTimestampLessThan())
                .appendQueryParam(
                        "latestTimestampGreaterThanOrEqualTo",
                        request.getLatestTimestampGreaterThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.EventCollection.class,
                        ListEventsResponse.Builder::eventCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEventsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRelatedEventsResponse listRelatedEvents(ListRelatedEventsRequest request) {
        Objects.requireNonNull(request.getEventFingerprint(), "eventFingerprint is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRelatedEventsResponse::builder)
                .logger(LOG, "listRelatedEvents")
                .serviceDetails(
                        "Event",
                        "ListRelatedEvents",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/RelatedEventCollection/ListRelatedEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRelatedEventsRequest::builder)
                .basePath("/20190801")
                .appendPathParam("relatedEvents")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("latestTimestampLessThan", request.getLatestTimestampLessThan())
                .appendQueryParam(
                        "latestTimestampGreaterThanOrEqualTo",
                        request.getLatestTimestampGreaterThanOrEqualTo())
                .appendQueryParam("eventFingerprint", request.getEventFingerprint())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.RelatedEventCollection.class,
                        ListRelatedEventsResponse.Builder::relatedEventCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRelatedEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRelatedEventsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateEventResponse updateEvent(UpdateEventRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        Validate.notBlank(request.getEventId(), "eventId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getUpdateEventDetails(), "updateEventDetails is required");

        return clientCall(request, UpdateEventResponse::builder)
                .logger(LOG, "updateEvent")
                .serviceDetails(
                        "Event",
                        "UpdateEvent",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/Event/UpdateEvent")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEventRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagement.model.Event.class,
                        UpdateEventResponse.Builder::event)
                .handleResponseHeaderString("etag", UpdateEventResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEventResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UploadEventContentResponse uploadEventContent(UploadEventContentRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        Validate.notBlank(request.getEventId(), "eventId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, UploadEventContentResponse::builder)
                .logger(LOG, "uploadEventContent")
                .serviceDetails(
                        "Event",
                        "UploadEventContent",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/EventContent/UploadEventContent")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UploadEventContentRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("events")
                .appendPathParam(request.getEventId())
                .appendPathParam("content")
                .appendPathParam("actions")
                .appendPathParam("upload")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", UploadEventContentResponse.Builder::opcRequestId)
                .callSync();
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
        this(builder(), authenticationDetailsProvider);
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
        this(builder().configuration(configuration), authenticationDetailsProvider);
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
                authenticationDetailsProvider);
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
                authenticationDetailsProvider);
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
                authenticationDetailsProvider);
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
                authenticationDetailsProvider);
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
                authenticationDetailsProvider);
    }
}
