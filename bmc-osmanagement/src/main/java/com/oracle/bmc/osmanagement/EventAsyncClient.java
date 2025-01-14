/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Event service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class EventAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements EventAsync {
    /** Service instance for Event. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("EVENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osms.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EventAsyncClient.class);

    EventAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    EventAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "EventAsyncClient", "getEventContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, EventAsyncClient> {
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
        public EventAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new EventAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<DeleteEventContentResponse> deleteEventContent(
            DeleteEventContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEventContentRequest, DeleteEventContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEventResponse> getEvent(
            GetEventRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetEventRequest, GetEventResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEventContentResponse> getEventContent(
            GetEventContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEventContentRequest, GetEventContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEventReportResponse> getEventReport(
            GetEventReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEventReportRequest, GetEventReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEventsResponse> listEvents(
            ListEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListEventsRequest, ListEventsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRelatedEventsResponse> listRelatedEvents(
            ListRelatedEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRelatedEventsRequest, ListRelatedEventsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventResponse> updateEvent(
            UpdateEventRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateEventRequest, UpdateEventResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadEventContentResponse> uploadEventContent(
            UploadEventContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadEventContentRequest, UploadEventContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EventAsyncClient(
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
    public EventAsyncClient(
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
    public EventAsyncClient(
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
    public EventAsyncClient(
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
    public EventAsyncClient(
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
    public EventAsyncClient(
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
    public EventAsyncClient(
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
