/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.monitoring.requests.*;
import com.oracle.bmc.monitoring.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public class MonitoringClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Monitoring {
    /** Service instance for Monitoring. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MONITORING")
                    .serviceEndpointPrefix("telemetry")
                    .serviceEndpointTemplate("https://telemetry.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MonitoringClient.class);

    private final MonitoringWaiters waiters;

    private final MonitoringPaginators paginators;

    MonitoringClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
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
                                    .nameFormat("Monitoring-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new MonitoringWaiters(executorService, this);

        this.paginators = new MonitoringPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MonitoringClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "monitoring";
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
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public MonitoringClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MonitoringClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeAlarmCompartmentResponse changeAlarmCompartment(
            ChangeAlarmCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) {
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
                .callSync();
    }

    @Override
    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) {

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
                .callSync();
    }

    @Override
    public GetAlarmResponse getAlarm(GetAlarmRequest request) {

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
                .callSync();
    }

    @Override
    public GetAlarmHistoryResponse getAlarmHistory(GetAlarmHistoryRequest request) {

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
                .callSync();
    }

    @Override
    public ListAlarmsResponse listAlarms(ListAlarmsRequest request) {
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
                .callSync();
    }

    @Override
    public ListAlarmsStatusResponse listAlarmsStatus(ListAlarmsStatusRequest request) {
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
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("serviceName", request.getServiceName())
                .appendQueryParam("entityId", request.getEntityId())
                .appendEnumQueryParam("status", request.getStatus())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.monitoring.model.AlarmStatusSummary.class,
                        ListAlarmsStatusResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAlarmsStatusResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAlarmsStatusResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMetricsResponse listMetrics(ListMetricsRequest request) {
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
                .callSync();
    }

    @Override
    public PostMetricDataResponse postMetricData(PostMetricDataRequest request) {
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
                .callSync();
    }

    @Override
    public RemoveAlarmSuppressionResponse removeAlarmSuppression(
            RemoveAlarmSuppressionRequest request) {

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
                .callSync();
    }

    @Override
    public RetrieveDimensionStatesResponse retrieveDimensionStates(
            RetrieveDimensionStatesRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeMetricsDataResponse summarizeMetricsData(SummarizeMetricsDataRequest request) {
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
                .callSync();
    }

    @Override
    public UpdateAlarmResponse updateAlarm(UpdateAlarmRequest request) {

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
                .callSync();
    }

    @Override
    public MonitoringWaiters getWaiters() {
        return waiters;
    }

    @Override
    public MonitoringPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MonitoringClient(
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
    public MonitoringClient(
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
    public MonitoringClient(
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
    public MonitoringClient(
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
    public MonitoringClient(
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
    public MonitoringClient(
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
    public MonitoringClient(
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
    public MonitoringClient(
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
