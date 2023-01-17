/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.monitoring.requests.*;
import com.oracle.bmc.monitoring.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Monitoring service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public class MonitoringAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements MonitoringAsync {
    /** Service instance for Monitoring. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MONITORING")
                    .serviceEndpointPrefix("telemetry")
                    .serviceEndpointTemplate("https://telemetry.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MonitoringAsyncClient.class);

    private MonitoringAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MonitoringAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public MonitoringAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MonitoringAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeAlarmCompartmentResponse> changeAlarmCompartment(
            ChangeAlarmCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeAlarmCompartmentRequest, ChangeAlarmCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getAlarmId(), "alarmId must not be blank");
        Objects.requireNonNull(
                request.getChangeAlarmCompartmentDetails(),
                "changeAlarmCompartmentDetails is required");

        return clientCall(request, ChangeAlarmCompartmentResponse::builder)
                .logger(LOG, "changeAlarmCompartment")
                .serviceDetails(
                        "Monitoring",
                        "ChangeAlarmCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/Alarm/ChangeAlarmCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAlarmCompartmentRequest::builder)
                .basePath("/20180401")
                .appendPathParam("alarms")
                .appendPathParam(request.getAlarmId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeAlarmCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAlarmResponse> createAlarm(
            CreateAlarmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateAlarmRequest, CreateAlarmResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateAlarmDetails(), "createAlarmDetails is required");

        return clientCall(request, CreateAlarmResponse::builder)
                .logger(LOG, "createAlarm")
                .serviceDetails(
                        "Monitoring",
                        "CreateAlarm",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/Alarm/CreateAlarm")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAlarmRequest::builder)
                .basePath("/20180401")
                .appendPathParam("alarms")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.monitoring.model.Alarm.class,
                        CreateAlarmResponse.Builder::alarm)
                .handleResponseHeaderString("etag", CreateAlarmResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAlarmResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlarmResponse> deleteAlarm(
            DeleteAlarmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteAlarmRequest, DeleteAlarmResponse>
                    handler) {

        Validate.notBlank(request.getAlarmId(), "alarmId must not be blank");

        return clientCall(request, DeleteAlarmResponse::builder)
                .logger(LOG, "deleteAlarm")
                .serviceDetails(
                        "Monitoring",
                        "DeleteAlarm",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/Alarm/DeleteAlarm")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAlarmRequest::builder)
                .basePath("/20180401")
                .appendPathParam("alarms")
                .appendPathParam(request.getAlarmId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAlarmResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAlarmResponse> getAlarm(
            GetAlarmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAlarmRequest, GetAlarmResponse>
                    handler) {

        Validate.notBlank(request.getAlarmId(), "alarmId must not be blank");

        return clientCall(request, GetAlarmResponse::builder)
                .logger(LOG, "getAlarm")
                .serviceDetails(
                        "Monitoring",
                        "GetAlarm",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/Alarm/GetAlarm")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAlarmRequest::builder)
                .basePath("/20180401")
                .appendPathParam("alarms")
                .appendPathParam(request.getAlarmId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.monitoring.model.Alarm.class,
                        GetAlarmResponse.Builder::alarm)
                .handleResponseHeaderString("etag", GetAlarmResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAlarmResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAlarmHistoryResponse> getAlarmHistory(
            GetAlarmHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAlarmHistoryRequest, GetAlarmHistoryResponse>
                    handler) {

        Validate.notBlank(request.getAlarmId(), "alarmId must not be blank");

        return clientCall(request, GetAlarmHistoryResponse::builder)
                .logger(LOG, "getAlarmHistory")
                .serviceDetails(
                        "Monitoring",
                        "GetAlarmHistory",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/AlarmHistoryCollection/GetAlarmHistory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAlarmHistoryRequest::builder)
                .basePath("/20180401")
                .appendPathParam("alarms")
                .appendPathParam(request.getAlarmId())
                .appendPathParam("history")
                .appendEnumQueryParam("alarmHistorytype", request.getAlarmHistorytype())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam(
                        "timestampGreaterThanOrEqualTo", request.getTimestampGreaterThanOrEqualTo())
                .appendQueryParam("timestampLessThan", request.getTimestampLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.monitoring.model.AlarmHistoryCollection.class,
                        GetAlarmHistoryResponse.Builder::alarmHistoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", GetAlarmHistoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetAlarmHistoryResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAlarmsResponse> listAlarms(
            ListAlarmsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAlarmsRequest, ListAlarmsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAlarmsResponse::builder)
                .logger(LOG, "listAlarms")
                .serviceDetails(
                        "Monitoring",
                        "ListAlarms",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/AlarmSummary/ListAlarms")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAlarmsRequest::builder)
                .basePath("/20180401")
                .appendPathParam("alarms")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.monitoring.model.AlarmSummary.class,
                        ListAlarmsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAlarmsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAlarmsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAlarmsStatusResponse> listAlarmsStatus(
            ListAlarmsStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlarmsStatusRequest, ListAlarmsStatusResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAlarmsStatusResponse::builder)
                .logger(LOG, "listAlarmsStatus")
                .serviceDetails(
                        "Monitoring",
                        "ListAlarmsStatus",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/AlarmStatusSummary/ListAlarmsStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAlarmsStatusRequest::builder)
                .basePath("/20180401")
                .appendPathParam("alarms")
                .appendPathParam("status")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.monitoring.model.AlarmStatusSummary.class,
                        ListAlarmsStatusResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAlarmsStatusResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAlarmsStatusResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMetricsResponse> listMetrics(
            ListMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMetricsRequest, ListMetricsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getListMetricsDetails(), "listMetricsDetails is required");

        return clientCall(request, ListMetricsResponse::builder)
                .logger(LOG, "listMetrics")
                .serviceDetails(
                        "Monitoring",
                        "ListMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/Metric/ListMetrics")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ListMetricsRequest::builder)
                .basePath("/20180401")
                .appendPathParam("metrics")
                .appendPathParam("actions")
                .appendPathParam("listMetrics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.monitoring.model.Metric.class,
                        ListMetricsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListMetricsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListMetricsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PostMetricDataResponse> postMetricData(
            PostMetricDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PostMetricDataRequest, PostMetricDataResponse>
                    handler) {
        Objects.requireNonNull(
                request.getPostMetricDataDetails(), "postMetricDataDetails is required");

        return clientCall(request, PostMetricDataResponse::builder)
                .logger(LOG, "postMetricData")
                .serviceDetails(
                        "Monitoring",
                        "PostMetricData",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/MetricData/PostMetricData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PostMetricDataRequest::builder)
                .basePath("/20180401")
                .appendPathParam("metrics")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("content-encoding", request.getContentEncoding())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.monitoring.model.PostMetricDataResponseDetails.class,
                        PostMetricDataResponse.Builder::postMetricDataResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", PostMetricDataResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveAlarmSuppressionResponse> removeAlarmSuppression(
            RemoveAlarmSuppressionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveAlarmSuppressionRequest, RemoveAlarmSuppressionResponse>
                    handler) {

        Validate.notBlank(request.getAlarmId(), "alarmId must not be blank");

        return clientCall(request, RemoveAlarmSuppressionResponse::builder)
                .logger(LOG, "removeAlarmSuppression")
                .serviceDetails(
                        "Monitoring",
                        "RemoveAlarmSuppression",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/Suppression/RemoveAlarmSuppression")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveAlarmSuppressionRequest::builder)
                .basePath("/20180401")
                .appendPathParam("alarms")
                .appendPathParam(request.getAlarmId())
                .appendPathParam("actions")
                .appendPathParam("removeSuppression")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", RemoveAlarmSuppressionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetrieveDimensionStatesResponse> retrieveDimensionStates(
            RetrieveDimensionStatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetrieveDimensionStatesRequest, RetrieveDimensionStatesResponse>
                    handler) {

        Validate.notBlank(request.getAlarmId(), "alarmId must not be blank");

        return clientCall(request, RetrieveDimensionStatesResponse::builder)
                .logger(LOG, "retrieveDimensionStates")
                .serviceDetails(
                        "Monitoring",
                        "RetrieveDimensionStates",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/AlarmDimensionStatesCollection/RetrieveDimensionStates")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveDimensionStatesRequest::builder)
                .basePath("/20180401")
                .appendPathParam("alarms")
                .appendPathParam(request.getAlarmId())
                .appendPathParam("actions")
                .appendPathParam("retrieveDimensionStates")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.monitoring.model.AlarmDimensionStatesCollection.class,
                        RetrieveDimensionStatesResponse.Builder::alarmDimensionStatesCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RetrieveDimensionStatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", RetrieveDimensionStatesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeMetricsDataResponse> summarizeMetricsData(
            SummarizeMetricsDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeMetricsDataRequest, SummarizeMetricsDataResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getSummarizeMetricsDataDetails(),
                "summarizeMetricsDataDetails is required");

        return clientCall(request, SummarizeMetricsDataResponse::builder)
                .logger(LOG, "summarizeMetricsData")
                .serviceDetails(
                        "Monitoring",
                        "SummarizeMetricsData",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/MetricData/SummarizeMetricsData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SummarizeMetricsDataRequest::builder)
                .basePath("/20180401")
                .appendPathParam("metrics")
                .appendPathParam("actions")
                .appendPathParam("summarizeMetricsData")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.monitoring.model.MetricData.class,
                        SummarizeMetricsDataResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeMetricsDataResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAlarmResponse> updateAlarm(
            UpdateAlarmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateAlarmRequest, UpdateAlarmResponse>
                    handler) {

        Validate.notBlank(request.getAlarmId(), "alarmId must not be blank");
        Objects.requireNonNull(request.getUpdateAlarmDetails(), "updateAlarmDetails is required");

        return clientCall(request, UpdateAlarmResponse::builder)
                .logger(LOG, "updateAlarm")
                .serviceDetails(
                        "Monitoring",
                        "UpdateAlarm",
                        "https://docs.oracle.com/iaas/api/#/en/monitoring/20180401/Alarm/UpdateAlarm")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAlarmRequest::builder)
                .basePath("/20180401")
                .appendPathParam("alarms")
                .appendPathParam(request.getAlarmId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.monitoring.model.Alarm.class,
                        UpdateAlarmResponse.Builder::alarm)
                .handleResponseHeaderString("etag", UpdateAlarmResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAlarmResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MonitoringAsyncClient(
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
    public MonitoringAsyncClient(
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
    public MonitoringAsyncClient(
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
    public MonitoringAsyncClient(
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
    public MonitoringAsyncClient(
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
    public MonitoringAsyncClient(
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
    public MonitoringAsyncClient(
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
