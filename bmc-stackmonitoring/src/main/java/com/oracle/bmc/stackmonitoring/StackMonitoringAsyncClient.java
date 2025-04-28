/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.stackmonitoring.requests.*;
import com.oracle.bmc.stackmonitoring.responses.*;

import java.util.Objects;

/**
 * Async client implementation for StackMonitoring service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class StackMonitoringAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements StackMonitoringAsync {
    /** Service instance for StackMonitoring. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("STACKMONITORING")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://stack-monitoring.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StackMonitoringAsyncClient.class);

    StackMonitoringAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    StackMonitoringAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "StackMonitoringAsyncClient",
                            "exportMetricExtension,exportMonitoringTemplate"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, StackMonitoringAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "stackmonitoring";
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
        public StackMonitoringAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new StackMonitoringAsyncClient(
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
    public java.util.concurrent.Future<ApplyMonitoringTemplateResponse> applyMonitoringTemplate(
            ApplyMonitoringTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ApplyMonitoringTemplateRequest, ApplyMonitoringTemplateResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");

        return clientCall(request, ApplyMonitoringTemplateResponse::builder)
                .logger(LOG, "applyMonitoringTemplate")
                .serviceDetails(
                        "StackMonitoring",
                        "ApplyMonitoringTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoringTemplate/ApplyMonitoringTemplate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApplyMonitoringTemplateRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .appendPathParam("actions")
                .appendPathParam("apply")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ApplyMonitoringTemplateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ApplyMonitoringTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AssociateMonitoredResourcesResponse>
            associateMonitoredResources(
                    AssociateMonitoredResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AssociateMonitoredResourcesRequest,
                                    AssociateMonitoredResourcesResponse>
                            handler) {
        Objects.requireNonNull(
                request.getAssociateMonitoredResourcesDetails(),
                "associateMonitoredResourcesDetails is required");

        return clientCall(request, AssociateMonitoredResourcesResponse::builder)
                .logger(LOG, "associateMonitoredResources")
                .serviceDetails(
                        "StackMonitoring",
                        "AssociateMonitoredResources",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/AssociateMonitoredResources")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AssociateMonitoredResourcesRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam("actions")
                .appendPathParam("associateMonitoredResources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceAssociation.class,
                        AssociateMonitoredResourcesResponse.Builder::monitoredResourceAssociation)
                .handleResponseHeaderString(
                        "etag", AssociateMonitoredResourcesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AssociateMonitoredResourcesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeConfigCompartmentResponse> changeConfigCompartment(
            ChangeConfigCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeConfigCompartmentRequest, ChangeConfigCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getConfigId(), "configId must not be blank");
        Objects.requireNonNull(
                request.getChangeConfigCompartmentDetails(),
                "changeConfigCompartmentDetails is required");

        return clientCall(request, ChangeConfigCompartmentResponse::builder)
                .logger(LOG, "changeConfigCompartment")
                .serviceDetails(
                        "StackMonitoring",
                        "ChangeConfigCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/Config/ChangeConfigCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeConfigCompartmentRequest::builder)
                .basePath("/20210330")
                .appendPathParam("configs")
                .appendPathParam(request.getConfigId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeConfigCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMetricExtensionCompartmentResponse>
            changeMetricExtensionCompartment(
                    ChangeMetricExtensionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMetricExtensionCompartmentRequest,
                                    ChangeMetricExtensionCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getMetricExtensionId(), "metricExtensionId must not be blank");
        Objects.requireNonNull(
                request.getChangeMetricExtensionCompartmentDetails(),
                "changeMetricExtensionCompartmentDetails is required");

        return clientCall(request, ChangeMetricExtensionCompartmentResponse::builder)
                .logger(LOG, "changeMetricExtensionCompartment")
                .serviceDetails(
                        "StackMonitoring",
                        "ChangeMetricExtensionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/ChangeMetricExtensionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMetricExtensionCompartmentRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam(request.getMetricExtensionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMetricExtensionCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMonitoredResourceCompartmentResponse>
            changeMonitoredResourceCompartment(
                    ChangeMonitoredResourceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMonitoredResourceCompartmentRequest,
                                    ChangeMonitoredResourceCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getMonitoredResourceId(), "monitoredResourceId must not be blank");
        Objects.requireNonNull(
                request.getChangeMonitoredResourceCompartmentDetails(),
                "changeMonitoredResourceCompartmentDetails is required");

        return clientCall(request, ChangeMonitoredResourceCompartmentResponse::builder)
                .logger(LOG, "changeMonitoredResourceCompartment")
                .serviceDetails(
                        "StackMonitoring",
                        "ChangeMonitoredResourceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/ChangeMonitoredResourceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMonitoredResourceCompartmentRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam(request.getMonitoredResourceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMonitoredResourceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMonitoredResourceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMonitoredResourceTaskCompartmentResponse>
            changeMonitoredResourceTaskCompartment(
                    ChangeMonitoredResourceTaskCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMonitoredResourceTaskCompartmentRequest,
                                    ChangeMonitoredResourceTaskCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getMonitoredResourceTaskId(), "monitoredResourceTaskId must not be blank");
        Objects.requireNonNull(
                request.getChangeMonitoredResourceTaskCompartmentDetails(),
                "changeMonitoredResourceTaskCompartmentDetails is required");

        return clientCall(request, ChangeMonitoredResourceTaskCompartmentResponse::builder)
                .logger(LOG, "changeMonitoredResourceTaskCompartment")
                .serviceDetails(
                        "StackMonitoring",
                        "ChangeMonitoredResourceTaskCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceTask/ChangeMonitoredResourceTaskCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMonitoredResourceTaskCompartmentRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResourceTasks")
                .appendPathParam(request.getMonitoredResourceTaskId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMonitoredResourceTaskCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeProcessSetCompartmentResponse>
            changeProcessSetCompartment(
                    ChangeProcessSetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeProcessSetCompartmentRequest,
                                    ChangeProcessSetCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getProcessSetId(), "processSetId must not be blank");
        Objects.requireNonNull(
                request.getChangeProcessSetCompartmentDetails(),
                "changeProcessSetCompartmentDetails is required");

        return clientCall(request, ChangeProcessSetCompartmentResponse::builder)
                .logger(LOG, "changeProcessSetCompartment")
                .serviceDetails(
                        "StackMonitoring",
                        "ChangeProcessSetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSet/ChangeProcessSetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeProcessSetCompartmentRequest::builder)
                .basePath("/20210330")
                .appendPathParam("processSets")
                .appendPathParam(request.getProcessSetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeProcessSetCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAlarmConditionResponse> createAlarmCondition(
            CreateAlarmConditionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAlarmConditionRequest, CreateAlarmConditionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAlarmConditionDetails(),
                "createAlarmConditionDetails is required");

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");

        return clientCall(request, CreateAlarmConditionResponse::builder)
                .logger(LOG, "createAlarmCondition")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateAlarmCondition",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/AlarmCondition/CreateAlarmCondition")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAlarmConditionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .appendPathParam("alarmConditions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.AlarmCondition.class,
                        CreateAlarmConditionResponse.Builder::alarmCondition)
                .handleResponseHeaderString("etag", CreateAlarmConditionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAlarmConditionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBaselineableMetricResponse> createBaselineableMetric(
            CreateBaselineableMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBaselineableMetricRequest, CreateBaselineableMetricResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateBaselineableMetricDetails(),
                "createBaselineableMetricDetails is required");

        return clientCall(request, CreateBaselineableMetricResponse::builder)
                .logger(LOG, "createBaselineableMetric")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateBaselineableMetric",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/CreateBaselineableMetric")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBaselineableMetricRequest::builder)
                .basePath("/20210330")
                .appendPathParam("baselineableMetrics")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.BaselineableMetric.class,
                        CreateBaselineableMetricResponse.Builder::baselineableMetric)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBaselineableMetricResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateBaselineableMetricResponse.Builder::etag)
                .handleResponseHeaderInteger(
                        "retry-after", CreateBaselineableMetricResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigResponse> createConfig(
            CreateConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateConfigRequest, CreateConfigResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateConfigDetails(), "createConfigDetails is required");

        return clientCall(request, CreateConfigResponse::builder)
                .logger(LOG, "createConfig")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateConfig",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/Config/CreateConfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConfigRequest::builder)
                .basePath("/20210330")
                .appendPathParam("configs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.Config.class,
                        CreateConfigResponse.Builder::config)
                .handleResponseHeaderString("etag", CreateConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDiscoveryJobResponse> createDiscoveryJob(
            CreateDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDiscoveryJobDetails(), "createDiscoveryJobDetails is required");

        return clientCall(request, CreateDiscoveryJobResponse::builder)
                .logger(LOG, "createDiscoveryJob")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateDiscoveryJob",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DiscoveryJob/CreateDiscoveryJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDiscoveryJobRequest::builder)
                .basePath("/20210330")
                .appendPathParam("discoveryJobs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.DiscoveryJob.class,
                        CreateDiscoveryJobResponse.Builder::discoveryJob)
                .handleResponseHeaderString("etag", CreateDiscoveryJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDiscoveryJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMaintenanceWindowResponse> createMaintenanceWindow(
            CreateMaintenanceWindowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMaintenanceWindowRequest, CreateMaintenanceWindowResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateMaintenanceWindowDetails(),
                "createMaintenanceWindowDetails is required");

        return clientCall(request, CreateMaintenanceWindowResponse::builder)
                .logger(LOG, "createMaintenanceWindow")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateMaintenanceWindow",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MaintenanceWindow/CreateMaintenanceWindow")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMaintenanceWindowRequest::builder)
                .basePath("/20210330")
                .appendPathParam("maintenanceWindows")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MaintenanceWindow.class,
                        CreateMaintenanceWindowResponse.Builder::maintenanceWindow)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMaintenanceWindowResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMaintenanceWindowResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMaintenanceWindowResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMetricExtensionResponse> createMetricExtension(
            CreateMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMetricExtensionRequest, CreateMetricExtensionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateMetricExtensionDetails(),
                "createMetricExtensionDetails is required");

        return clientCall(request, CreateMetricExtensionResponse::builder)
                .logger(LOG, "createMetricExtension")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateMetricExtension",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/CreateMetricExtension")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMetricExtensionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MetricExtension.class,
                        CreateMetricExtensionResponse.Builder::metricExtension)
                .handleResponseHeaderString("etag", CreateMetricExtensionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMetricExtensionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "content-location", CreateMetricExtensionResponse.Builder::contentLocation)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoredResourceResponse> createMonitoredResource(
            CreateMonitoredResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMonitoredResourceRequest, CreateMonitoredResourceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateMonitoredResourceDetails(),
                "createMonitoredResourceDetails is required");

        return clientCall(request, CreateMonitoredResourceResponse::builder)
                .logger(LOG, "createMonitoredResource")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateMonitoredResource",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/CreateMonitoredResource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMonitoredResourceRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("external-resource-id", request.getExternalResourceId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResource.class,
                        CreateMonitoredResourceResponse.Builder::monitoredResource)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMonitoredResourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMonitoredResourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-monitored-resource-id",
                        CreateMonitoredResourceResponse.Builder::opcMonitoredResourceId)
                .handleResponseHeaderString(
                        "location", CreateMonitoredResourceResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateMonitoredResourceResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateMonitoredResourceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoredResourceTaskResponse>
            createMonitoredResourceTask(
                    CreateMonitoredResourceTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMonitoredResourceTaskRequest,
                                    CreateMonitoredResourceTaskResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateMonitoredResourceTaskDetails(),
                "createMonitoredResourceTaskDetails is required");

        return clientCall(request, CreateMonitoredResourceTaskResponse::builder)
                .logger(LOG, "createMonitoredResourceTask")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateMonitoredResourceTask",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceTask/CreateMonitoredResourceTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMonitoredResourceTaskRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResourceTasks")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceTask.class,
                        CreateMonitoredResourceTaskResponse.Builder::monitoredResourceTask)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMonitoredResourceTaskResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateMonitoredResourceTaskResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMonitoredResourceTaskResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoredResourceTypeResponse>
            createMonitoredResourceType(
                    CreateMonitoredResourceTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMonitoredResourceTypeRequest,
                                    CreateMonitoredResourceTypeResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateMonitoredResourceTypeDetails(),
                "createMonitoredResourceTypeDetails is required");

        return clientCall(request, CreateMonitoredResourceTypeResponse::builder)
                .logger(LOG, "createMonitoredResourceType")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateMonitoredResourceType",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceType/CreateMonitoredResourceType")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMonitoredResourceTypeRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResourceTypes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceType.class,
                        CreateMonitoredResourceTypeResponse.Builder::monitoredResourceType)
                .handleResponseHeaderString(
                        "etag", CreateMonitoredResourceTypeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMonitoredResourceTypeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoringTemplateResponse> createMonitoringTemplate(
            CreateMonitoringTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMonitoringTemplateRequest, CreateMonitoringTemplateResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateMonitoringTemplateDetails(),
                "createMonitoringTemplateDetails is required");

        return clientCall(request, CreateMonitoringTemplateResponse::builder)
                .logger(LOG, "createMonitoringTemplate")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateMonitoringTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoringTemplate/CreateMonitoringTemplate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMonitoringTemplateRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoringTemplate.class,
                        CreateMonitoringTemplateResponse.Builder::monitoringTemplate)
                .handleResponseHeaderString("etag", CreateMonitoringTemplateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMonitoringTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateProcessSetResponse> createProcessSet(
            CreateProcessSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateProcessSetRequest, CreateProcessSetResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateProcessSetDetails(), "createProcessSetDetails is required");

        return clientCall(request, CreateProcessSetResponse::builder)
                .logger(LOG, "createProcessSet")
                .serviceDetails(
                        "StackMonitoring",
                        "CreateProcessSet",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSet/CreateProcessSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProcessSetRequest::builder)
                .basePath("/20210330")
                .appendPathParam("processSets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.ProcessSet.class,
                        CreateProcessSetResponse.Builder::processSet)
                .handleResponseHeaderString("etag", CreateProcessSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProcessSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlarmConditionResponse> deleteAlarmCondition(
            DeleteAlarmConditionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAlarmConditionRequest, DeleteAlarmConditionResponse>
                    handler) {

        Validate.notBlank(request.getAlarmConditionId(), "alarmConditionId must not be blank");

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");

        return clientCall(request, DeleteAlarmConditionResponse::builder)
                .logger(LOG, "deleteAlarmCondition")
                .serviceDetails(
                        "StackMonitoring",
                        "DeleteAlarmCondition",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/AlarmCondition/DeleteAlarmCondition")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAlarmConditionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .appendPathParam("alarmConditions")
                .appendPathParam(request.getAlarmConditionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAlarmConditionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBaselineableMetricResponse> deleteBaselineableMetric(
            DeleteBaselineableMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBaselineableMetricRequest, DeleteBaselineableMetricResponse>
                    handler) {

        Validate.notBlank(
                request.getBaselineableMetricId(), "baselineableMetricId must not be blank");

        return clientCall(request, DeleteBaselineableMetricResponse::builder)
                .logger(LOG, "deleteBaselineableMetric")
                .serviceDetails(
                        "StackMonitoring",
                        "DeleteBaselineableMetric",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/DeleteBaselineableMetric")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBaselineableMetricRequest::builder)
                .basePath("/20210330")
                .appendPathParam("baselineableMetrics")
                .appendPathParam(request.getBaselineableMetricId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBaselineableMetricResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", DeleteBaselineableMetricResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigResponse> deleteConfig(
            DeleteConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteConfigRequest, DeleteConfigResponse>
                    handler) {

        Validate.notBlank(request.getConfigId(), "configId must not be blank");

        return clientCall(request, DeleteConfigResponse::builder)
                .logger(LOG, "deleteConfig")
                .serviceDetails(
                        "StackMonitoring",
                        "DeleteConfig",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/Config/DeleteConfig")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConfigRequest::builder)
                .basePath("/20210330")
                .appendPathParam("configs")
                .appendPathParam(request.getConfigId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDiscoveryJobResponse> deleteDiscoveryJob(
            DeleteDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>
                    handler) {

        Validate.notBlank(request.getDiscoveryJobId(), "discoveryJobId must not be blank");

        return clientCall(request, DeleteDiscoveryJobResponse::builder)
                .logger(LOG, "deleteDiscoveryJob")
                .serviceDetails(
                        "StackMonitoring",
                        "DeleteDiscoveryJob",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DiscoveryJob/DeleteDiscoveryJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDiscoveryJobRequest::builder)
                .basePath("/20210330")
                .appendPathParam("discoveryJobs")
                .appendPathParam(request.getDiscoveryJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDiscoveryJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMaintenanceWindowResponse> deleteMaintenanceWindow(
            DeleteMaintenanceWindowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaintenanceWindowRequest, DeleteMaintenanceWindowResponse>
                    handler) {

        Validate.notBlank(
                request.getMaintenanceWindowId(), "maintenanceWindowId must not be blank");

        return clientCall(request, DeleteMaintenanceWindowResponse::builder)
                .logger(LOG, "deleteMaintenanceWindow")
                .serviceDetails(
                        "StackMonitoring",
                        "DeleteMaintenanceWindow",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MaintenanceWindow/DeleteMaintenanceWindow")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMaintenanceWindowRequest::builder)
                .basePath("/20210330")
                .appendPathParam("maintenanceWindows")
                .appendPathParam(request.getMaintenanceWindowId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMaintenanceWindowResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMaintenanceWindowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMetricExtensionResponse> deleteMetricExtension(
            DeleteMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMetricExtensionRequest, DeleteMetricExtensionResponse>
                    handler) {

        Validate.notBlank(request.getMetricExtensionId(), "metricExtensionId must not be blank");

        return clientCall(request, DeleteMetricExtensionResponse::builder)
                .logger(LOG, "deleteMetricExtension")
                .serviceDetails(
                        "StackMonitoring",
                        "DeleteMetricExtension",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/DeleteMetricExtension")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMetricExtensionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam(request.getMetricExtensionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMetricExtensionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoredResourceResponse> deleteMonitoredResource(
            DeleteMonitoredResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMonitoredResourceRequest, DeleteMonitoredResourceResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoredResourceId(), "monitoredResourceId must not be blank");

        return clientCall(request, DeleteMonitoredResourceResponse::builder)
                .logger(LOG, "deleteMonitoredResource")
                .serviceDetails(
                        "StackMonitoring",
                        "DeleteMonitoredResource",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/DeleteMonitoredResource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMonitoredResourceRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam(request.getMonitoredResourceId())
                .appendQueryParam("isDeleteMembers", request.getIsDeleteMembers())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMonitoredResourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMonitoredResourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoredResourceTypeResponse>
            deleteMonitoredResourceType(
                    DeleteMonitoredResourceTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMonitoredResourceTypeRequest,
                                    DeleteMonitoredResourceTypeResponse>
                            handler) {

        Validate.notBlank(
                request.getMonitoredResourceTypeId(), "monitoredResourceTypeId must not be blank");

        return clientCall(request, DeleteMonitoredResourceTypeResponse::builder)
                .logger(LOG, "deleteMonitoredResourceType")
                .serviceDetails(
                        "StackMonitoring",
                        "DeleteMonitoredResourceType",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceType/DeleteMonitoredResourceType")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMonitoredResourceTypeRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResourceTypes")
                .appendPathParam(request.getMonitoredResourceTypeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMonitoredResourceTypeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoringTemplateResponse> deleteMonitoringTemplate(
            DeleteMonitoringTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMonitoringTemplateRequest, DeleteMonitoringTemplateResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");

        return clientCall(request, DeleteMonitoringTemplateResponse::builder)
                .logger(LOG, "deleteMonitoringTemplate")
                .serviceDetails(
                        "StackMonitoring",
                        "DeleteMonitoringTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoringTemplate/DeleteMonitoringTemplate")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMonitoringTemplateRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMonitoringTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteProcessSetResponse> deleteProcessSet(
            DeleteProcessSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteProcessSetRequest, DeleteProcessSetResponse>
                    handler) {

        Validate.notBlank(request.getProcessSetId(), "processSetId must not be blank");

        return clientCall(request, DeleteProcessSetResponse::builder)
                .logger(LOG, "deleteProcessSet")
                .serviceDetails(
                        "StackMonitoring",
                        "DeleteProcessSet",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSet/DeleteProcessSet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProcessSetRequest::builder)
                .basePath("/20210330")
                .appendPathParam("processSets")
                .appendPathParam(request.getProcessSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProcessSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExternalDatabaseResponse> disableExternalDatabase(
            DisableExternalDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableExternalDatabaseRequest, DisableExternalDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoredResourceId(), "monitoredResourceId must not be blank");

        return clientCall(request, DisableExternalDatabaseResponse::builder)
                .logger(LOG, "disableExternalDatabase")
                .serviceDetails(
                        "StackMonitoring",
                        "DisableExternalDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/DisableExternalDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalDatabaseRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam(request.getMonitoredResourceId())
                .appendPathParam("actions")
                .appendPathParam("disableExternalDatabase")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableExternalDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableMetricExtensionResponse> disableMetricExtension(
            DisableMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableMetricExtensionRequest, DisableMetricExtensionResponse>
                    handler) {

        Validate.notBlank(request.getMetricExtensionId(), "metricExtensionId must not be blank");
        Objects.requireNonNull(
                request.getDisableMetricExtensionDetails(),
                "disableMetricExtensionDetails is required");

        return clientCall(request, DisableMetricExtensionResponse::builder)
                .logger(LOG, "disableMetricExtension")
                .serviceDetails(
                        "StackMonitoring",
                        "DisableMetricExtension",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/DisableMetricExtension")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableMetricExtensionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam(request.getMetricExtensionId())
                .appendPathParam("actions")
                .appendPathParam("disable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableMetricExtensionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableMetricExtensionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMonitoredResourcesResponse>
            disassociateMonitoredResources(
                    DisassociateMonitoredResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisassociateMonitoredResourcesRequest,
                                    DisassociateMonitoredResourcesResponse>
                            handler) {
        Objects.requireNonNull(
                request.getDisassociateMonitoredResourcesDetails(),
                "disassociateMonitoredResourcesDetails is required");

        return clientCall(request, DisassociateMonitoredResourcesResponse::builder)
                .logger(LOG, "disassociateMonitoredResources")
                .serviceDetails(
                        "StackMonitoring",
                        "DisassociateMonitoredResources",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/DisassociateMonitoredResources")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisassociateMonitoredResourcesRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam("actions")
                .appendPathParam("disassociateMonitoredResources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisassociateMonitoredResourcesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableMetricExtensionResponse> enableMetricExtension(
            EnableMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableMetricExtensionRequest, EnableMetricExtensionResponse>
                    handler) {

        Validate.notBlank(request.getMetricExtensionId(), "metricExtensionId must not be blank");
        Objects.requireNonNull(
                request.getEnableMetricExtensionDetails(),
                "enableMetricExtensionDetails is required");

        return clientCall(request, EnableMetricExtensionResponse::builder)
                .logger(LOG, "enableMetricExtension")
                .serviceDetails(
                        "StackMonitoring",
                        "EnableMetricExtension",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/EnableMetricExtension")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableMetricExtensionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam(request.getMetricExtensionId())
                .appendPathParam("actions")
                .appendPathParam("enable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableMetricExtensionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableMetricExtensionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EvaluateBaselineableMetricResponse>
            evaluateBaselineableMetric(
                    EvaluateBaselineableMetricRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EvaluateBaselineableMetricRequest,
                                    EvaluateBaselineableMetricResponse>
                            handler) {
        Objects.requireNonNull(
                request.getEvaluateBaselineableMetricDetails(),
                "evaluateBaselineableMetricDetails is required");

        Validate.notBlank(
                request.getBaselineableMetricId(), "baselineableMetricId must not be blank");

        return clientCall(request, EvaluateBaselineableMetricResponse::builder)
                .logger(LOG, "evaluateBaselineableMetric")
                .serviceDetails(
                        "StackMonitoring",
                        "EvaluateBaselineableMetric",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/EvaluateBaselineableMetric")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EvaluateBaselineableMetricRequest::builder)
                .basePath("/20210330")
                .appendPathParam("baselineableMetrics")
                .appendPathParam(request.getBaselineableMetricId())
                .appendPathParam("actions")
                .appendPathParam("evaluate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.EvaluateBaselineableMetricResult.class,
                        EvaluateBaselineableMetricResponse.Builder
                                ::evaluateBaselineableMetricResult)
                .handleResponseHeaderString(
                        "opc-request-id", EvaluateBaselineableMetricResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", EvaluateBaselineableMetricResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportMetricExtensionResponse> exportMetricExtension(
            ExportMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportMetricExtensionRequest, ExportMetricExtensionResponse>
                    handler) {

        Validate.notBlank(request.getMetricExtensionId(), "metricExtensionId must not be blank");

        return clientCall(request, ExportMetricExtensionResponse::builder)
                .logger(LOG, "exportMetricExtension")
                .serviceDetails(
                        "StackMonitoring",
                        "ExportMetricExtension",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/ExportMetricExtension")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportMetricExtensionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam(request.getMetricExtensionId())
                .appendPathParam("actions")
                .appendPathParam("export")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        java.io.InputStream.class,
                        ExportMetricExtensionResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", ExportMetricExtensionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ExportMetricExtensionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportMonitoringTemplateResponse> exportMonitoringTemplate(
            ExportMonitoringTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportMonitoringTemplateRequest, ExportMonitoringTemplateResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");

        return clientCall(request, ExportMonitoringTemplateResponse::builder)
                .logger(LOG, "exportMonitoringTemplate")
                .serviceDetails(
                        "StackMonitoring",
                        "ExportMonitoringTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoringTemplate/ExportMonitoringTemplate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportMonitoringTemplateRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .appendPathParam("actions")
                .appendPathParam("export")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        java.io.InputStream.class,
                        ExportMonitoringTemplateResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", ExportMonitoringTemplateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ExportMonitoringTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAlarmConditionResponse> getAlarmCondition(
            GetAlarmConditionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAlarmConditionRequest, GetAlarmConditionResponse>
                    handler) {

        Validate.notBlank(request.getAlarmConditionId(), "alarmConditionId must not be blank");

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");

        return clientCall(request, GetAlarmConditionResponse::builder)
                .logger(LOG, "getAlarmCondition")
                .serviceDetails(
                        "StackMonitoring",
                        "GetAlarmCondition",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/AlarmCondition/GetAlarmCondition")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAlarmConditionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .appendPathParam("alarmConditions")
                .appendPathParam(request.getAlarmConditionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.AlarmCondition.class,
                        GetAlarmConditionResponse.Builder::alarmCondition)
                .handleResponseHeaderString(
                        "opc-request-id", GetAlarmConditionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAlarmConditionResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBaselineableMetricResponse> getBaselineableMetric(
            GetBaselineableMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBaselineableMetricRequest, GetBaselineableMetricResponse>
                    handler) {

        Validate.notBlank(
                request.getBaselineableMetricId(), "baselineableMetricId must not be blank");

        return clientCall(request, GetBaselineableMetricResponse::builder)
                .logger(LOG, "getBaselineableMetric")
                .serviceDetails(
                        "StackMonitoring",
                        "GetBaselineableMetric",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/GetBaselineableMetric")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBaselineableMetricRequest::builder)
                .basePath("/20210330")
                .appendPathParam("baselineableMetrics")
                .appendPathParam(request.getBaselineableMetricId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.BaselineableMetric.class,
                        GetBaselineableMetricResponse.Builder::baselineableMetric)
                .handleResponseHeaderString(
                        "opc-request-id", GetBaselineableMetricResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetBaselineableMetricResponse.Builder::etag)
                .handleResponseHeaderInteger(
                        "retry-after", GetBaselineableMetricResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigResponse> getConfig(
            GetConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConfigRequest, GetConfigResponse>
                    handler) {

        Validate.notBlank(request.getConfigId(), "configId must not be blank");

        return clientCall(request, GetConfigResponse::builder)
                .logger(LOG, "getConfig")
                .serviceDetails(
                        "StackMonitoring",
                        "GetConfig",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/Config/GetConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigRequest::builder)
                .basePath("/20210330")
                .appendPathParam("configs")
                .appendPathParam(request.getConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.Config.class,
                        GetConfigResponse.Builder::config)
                .handleResponseHeaderString("etag", GetConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveryJobResponse> getDiscoveryJob(
            GetDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryJobRequest, GetDiscoveryJobResponse>
                    handler) {

        Validate.notBlank(request.getDiscoveryJobId(), "discoveryJobId must not be blank");

        return clientCall(request, GetDiscoveryJobResponse::builder)
                .logger(LOG, "getDiscoveryJob")
                .serviceDetails(
                        "StackMonitoring",
                        "GetDiscoveryJob",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DiscoveryJob/GetDiscoveryJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDiscoveryJobRequest::builder)
                .basePath("/20210330")
                .appendPathParam("discoveryJobs")
                .appendPathParam(request.getDiscoveryJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.DiscoveryJob.class,
                        GetDiscoveryJobResponse.Builder::discoveryJob)
                .handleResponseHeaderString("etag", GetDiscoveryJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDiscoveryJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceWindowResponse> getMaintenanceWindow(
            GetMaintenanceWindowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaintenanceWindowRequest, GetMaintenanceWindowResponse>
                    handler) {

        Validate.notBlank(
                request.getMaintenanceWindowId(), "maintenanceWindowId must not be blank");

        return clientCall(request, GetMaintenanceWindowResponse::builder)
                .logger(LOG, "getMaintenanceWindow")
                .serviceDetails(
                        "StackMonitoring",
                        "GetMaintenanceWindow",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MaintenanceWindow/GetMaintenanceWindow")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaintenanceWindowRequest::builder)
                .basePath("/20210330")
                .appendPathParam("maintenanceWindows")
                .appendPathParam(request.getMaintenanceWindowId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MaintenanceWindow.class,
                        GetMaintenanceWindowResponse.Builder::maintenanceWindow)
                .handleResponseHeaderString("etag", GetMaintenanceWindowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaintenanceWindowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMetricExtensionResponse> getMetricExtension(
            GetMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMetricExtensionRequest, GetMetricExtensionResponse>
                    handler) {

        Validate.notBlank(request.getMetricExtensionId(), "metricExtensionId must not be blank");

        return clientCall(request, GetMetricExtensionResponse::builder)
                .logger(LOG, "getMetricExtension")
                .serviceDetails(
                        "StackMonitoring",
                        "GetMetricExtension",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/GetMetricExtension")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMetricExtensionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam(request.getMetricExtensionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MetricExtension.class,
                        GetMetricExtensionResponse.Builder::metricExtension)
                .handleResponseHeaderString(
                        "opc-request-id", GetMetricExtensionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetMetricExtensionResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMonitoredResourceResponse> getMonitoredResource(
            GetMonitoredResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoredResourceRequest, GetMonitoredResourceResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoredResourceId(), "monitoredResourceId must not be blank");

        return clientCall(request, GetMonitoredResourceResponse::builder)
                .logger(LOG, "getMonitoredResource")
                .serviceDetails(
                        "StackMonitoring",
                        "GetMonitoredResource",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/GetMonitoredResource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMonitoredResourceRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam(request.getMonitoredResourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResource.class,
                        GetMonitoredResourceResponse.Builder::monitoredResource)
                .handleResponseHeaderString("etag", GetMonitoredResourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMonitoredResourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMonitoredResourceTaskResponse> getMonitoredResourceTask(
            GetMonitoredResourceTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoredResourceTaskRequest, GetMonitoredResourceTaskResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoredResourceTaskId(), "monitoredResourceTaskId must not be blank");

        return clientCall(request, GetMonitoredResourceTaskResponse::builder)
                .logger(LOG, "getMonitoredResourceTask")
                .serviceDetails(
                        "StackMonitoring",
                        "GetMonitoredResourceTask",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceTask/GetMonitoredResourceTask")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMonitoredResourceTaskRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResourceTasks")
                .appendPathParam(request.getMonitoredResourceTaskId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceTask.class,
                        GetMonitoredResourceTaskResponse.Builder::monitoredResourceTask)
                .handleResponseHeaderString("etag", GetMonitoredResourceTaskResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMonitoredResourceTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMonitoredResourceTypeResponse> getMonitoredResourceType(
            GetMonitoredResourceTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoredResourceTypeRequest, GetMonitoredResourceTypeResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoredResourceTypeId(), "monitoredResourceTypeId must not be blank");

        return clientCall(request, GetMonitoredResourceTypeResponse::builder)
                .logger(LOG, "getMonitoredResourceType")
                .serviceDetails(
                        "StackMonitoring",
                        "GetMonitoredResourceType",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceType/GetMonitoredResourceType")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMonitoredResourceTypeRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResourceTypes")
                .appendPathParam(request.getMonitoredResourceTypeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceType.class,
                        GetMonitoredResourceTypeResponse.Builder::monitoredResourceType)
                .handleResponseHeaderString("etag", GetMonitoredResourceTypeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMonitoredResourceTypeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMonitoringTemplateResponse> getMonitoringTemplate(
            GetMonitoringTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoringTemplateRequest, GetMonitoringTemplateResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");

        return clientCall(request, GetMonitoringTemplateResponse::builder)
                .logger(LOG, "getMonitoringTemplate")
                .serviceDetails(
                        "StackMonitoring",
                        "GetMonitoringTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoringTemplate/GetMonitoringTemplate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMonitoringTemplateRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoringTemplate.class,
                        GetMonitoringTemplateResponse.Builder::monitoringTemplate)
                .handleResponseHeaderString(
                        "opc-request-id", GetMonitoringTemplateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetMonitoringTemplateResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProcessSetResponse> getProcessSet(
            GetProcessSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProcessSetRequest, GetProcessSetResponse>
                    handler) {

        Validate.notBlank(request.getProcessSetId(), "processSetId must not be blank");

        return clientCall(request, GetProcessSetResponse::builder)
                .logger(LOG, "getProcessSet")
                .serviceDetails(
                        "StackMonitoring",
                        "GetProcessSet",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSet/GetProcessSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProcessSetRequest::builder)
                .basePath("/20210330")
                .appendPathParam("processSets")
                .appendPathParam(request.getProcessSetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.ProcessSet.class,
                        GetProcessSetResponse.Builder::processSet)
                .handleResponseHeaderString("etag", GetProcessSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProcessSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "StackMonitoring",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210330")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAlarmConditionsResponse> listAlarmConditions(
            ListAlarmConditionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlarmConditionsRequest, ListAlarmConditionsResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");

        return clientCall(request, ListAlarmConditionsResponse::builder)
                .logger(LOG, "listAlarmConditions")
                .serviceDetails(
                        "StackMonitoring",
                        "ListAlarmConditions",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/AlarmCondition/ListAlarmConditions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAlarmConditionsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .appendPathParam("alarmConditions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendListQueryParam(
                        "resourceTypes",
                        request.getResourceTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "metricName",
                        request.getMetricName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.AlarmConditionCollection.class,
                        ListAlarmConditionsResponse.Builder::alarmConditionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAlarmConditionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAlarmConditionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBaselineableMetricsResponse> listBaselineableMetrics(
            ListBaselineableMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBaselineableMetricsRequest, ListBaselineableMetricsResponse>
                    handler) {

        return clientCall(request, ListBaselineableMetricsResponse::builder)
                .logger(LOG, "listBaselineableMetrics")
                .serviceDetails(
                        "StackMonitoring",
                        "ListBaselineableMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/ListBaselineableMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBaselineableMetricsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("baselineableMetrics")
                .appendQueryParam("resourceGroup", request.getResourceGroup())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("isOutOfBox", request.getIsOutOfBox())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("metricNamespace", request.getMetricNamespace())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("baselineableMetricId", request.getBaselineableMetricId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummaryCollection
                                .class,
                        ListBaselineableMetricsResponse.Builder
                                ::baselineableMetricSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBaselineableMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBaselineableMetricsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "retry-after", ListBaselineableMetricsResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConfigsResponse> listConfigs(
            ListConfigsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListConfigsRequest, ListConfigsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListConfigsResponse::builder)
                .logger(LOG, "listConfigs")
                .serviceDetails(
                        "StackMonitoring",
                        "ListConfigs",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ConfigCollection/ListConfigs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConfigsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("configs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.ConfigCollection.class,
                        ListConfigsResponse.Builder::configCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConfigsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConfigsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDefinedMonitoringTemplatesResponse>
            listDefinedMonitoringTemplates(
                    ListDefinedMonitoringTemplatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDefinedMonitoringTemplatesRequest,
                                    ListDefinedMonitoringTemplatesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDefinedMonitoringTemplatesResponse::builder)
                .logger(LOG, "listDefinedMonitoringTemplates")
                .serviceDetails(
                        "StackMonitoring",
                        "ListDefinedMonitoringTemplates",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DefinedMonitoringTemplateSummary/ListDefinedMonitoringTemplates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDefinedMonitoringTemplatesRequest::builder)
                .basePath("/20210330")
                .appendPathParam("definedMonitoringTemplates")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendListQueryParam(
                        "resourceTypes",
                        request.getResourceTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.DefinedMonitoringTemplateCollection
                                .class,
                        ListDefinedMonitoringTemplatesResponse.Builder
                                ::definedMonitoringTemplateCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDefinedMonitoringTemplatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDefinedMonitoringTemplatesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryJobLogsResponse> listDiscoveryJobLogs(
            ListDiscoveryJobLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobLogsRequest, ListDiscoveryJobLogsResponse>
                    handler) {

        Validate.notBlank(request.getDiscoveryJobId(), "discoveryJobId must not be blank");

        return clientCall(request, ListDiscoveryJobLogsResponse::builder)
                .logger(LOG, "listDiscoveryJobLogs")
                .serviceDetails(
                        "StackMonitoring",
                        "ListDiscoveryJobLogs",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DiscoveryJobLogCollection/ListDiscoveryJobLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDiscoveryJobLogsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("discoveryJobs")
                .appendPathParam(request.getDiscoveryJobId())
                .appendPathParam("logs")
                .appendEnumQueryParam("logType", request.getLogType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.DiscoveryJobLogCollection.class,
                        ListDiscoveryJobLogsResponse.Builder::discoveryJobLogCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListDiscoveryJobLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDiscoveryJobLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryJobsResponse> listDiscoveryJobs(
            ListDiscoveryJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDiscoveryJobsResponse::builder)
                .logger(LOG, "listDiscoveryJobs")
                .serviceDetails(
                        "StackMonitoring",
                        "ListDiscoveryJobs",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DiscoveryJobCollection/ListDiscoveryJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDiscoveryJobsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("discoveryJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.DiscoveryJobCollection.class,
                        ListDiscoveryJobsResponse.Builder::discoveryJobCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListDiscoveryJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDiscoveryJobsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaintenanceWindowsResponse> listMaintenanceWindows(
            ListMaintenanceWindowsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaintenanceWindowsResponse::builder)
                .logger(LOG, "listMaintenanceWindows")
                .serviceDetails(
                        "StackMonitoring",
                        "ListMaintenanceWindows",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MaintenanceWindow/ListMaintenanceWindows")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaintenanceWindowsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("maintenanceWindows")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleDetails", request.getLifecycleDetails())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MaintenanceWindowCollection.class,
                        ListMaintenanceWindowsResponse.Builder::maintenanceWindowCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaintenanceWindowsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaintenanceWindowsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListMaintenanceWindowsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMetricExtensionsResponse> listMetricExtensions(
            ListMetricExtensionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMetricExtensionsRequest, ListMetricExtensionsResponse>
                    handler) {

        return clientCall(request, ListMetricExtensionsResponse::builder)
                .logger(LOG, "listMetricExtensions")
                .serviceDetails(
                        "StackMonitoring",
                        "ListMetricExtensions",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/ListMetricExtensions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMetricExtensionsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("enabledOnResourceId", request.getEnabledOnResourceId())
                .appendQueryParam("metricExtensionId", request.getMetricExtensionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MetricExtensionCollection.class,
                        ListMetricExtensionsResponse.Builder::metricExtensionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMetricExtensionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMetricExtensionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMonitoredResourceTasksResponse>
            listMonitoredResourceTasks(
                    ListMonitoredResourceTasksRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMonitoredResourceTasksRequest,
                                    ListMonitoredResourceTasksResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMonitoredResourceTasksResponse::builder)
                .logger(LOG, "listMonitoredResourceTasks")
                .serviceDetails(
                        "StackMonitoring",
                        "ListMonitoredResourceTasks",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceTask/ListMonitoredResourceTasks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMonitoredResourceTasksRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResourceTasks")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceTasksCollection.class,
                        ListMonitoredResourceTasksResponse.Builder
                                ::monitoredResourceTasksCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMonitoredResourceTasksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMonitoredResourceTasksResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListMonitoredResourceTasksResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMonitoredResourceTypesResponse>
            listMonitoredResourceTypes(
                    ListMonitoredResourceTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMonitoredResourceTypesRequest,
                                    ListMonitoredResourceTypesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMonitoredResourceTypesResponse::builder)
                .logger(LOG, "listMonitoredResourceTypes")
                .serviceDetails(
                        "StackMonitoring",
                        "ListMonitoredResourceTypes",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceType/ListMonitoredResourceTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMonitoredResourceTypesRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResourceTypes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("isExcludeSystemTypes", request.getIsExcludeSystemTypes())
                .appendQueryParam("metricNamespace", request.getMetricNamespace())
                .appendEnumQueryParam("sourceType", request.getSourceType())
                .appendEnumQueryParam("resourceCategory", request.getResourceCategory())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "excludeFields",
                        request.getExcludeFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceTypesCollection.class,
                        ListMonitoredResourceTypesResponse.Builder
                                ::monitoredResourceTypesCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMonitoredResourceTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMonitoredResourceTypesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListMonitoredResourceTypesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMonitoredResourcesResponse> listMonitoredResources(
            ListMonitoredResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMonitoredResourcesRequest, ListMonitoredResourcesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMonitoredResourcesResponse::builder)
                .logger(LOG, "listMonitoredResources")
                .serviceDetails(
                        "StackMonitoring",
                        "ListMonitoredResources",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/ListMonitoredResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMonitoredResourcesRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceCollection.class,
                        ListMonitoredResourcesResponse.Builder::monitoredResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMonitoredResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMonitoredResourcesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListMonitoredResourcesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMonitoringTemplatesResponse> listMonitoringTemplates(
            ListMonitoringTemplatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMonitoringTemplatesRequest, ListMonitoringTemplatesResponse>
                    handler) {

        return clientCall(request, ListMonitoringTemplatesResponse::builder)
                .logger(LOG, "listMonitoringTemplates")
                .serviceDetails(
                        "StackMonitoring",
                        "ListMonitoringTemplates",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoringTemplate/ListMonitoringTemplates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMonitoringTemplatesRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("monitoringTemplateId", request.getMonitoringTemplateId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendListQueryParam(
                        "resourceTypes",
                        request.getResourceTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "metricName",
                        request.getMetricName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "namespace",
                        request.getNamespace(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoringTemplateCollection.class,
                        ListMonitoringTemplatesResponse.Builder::monitoringTemplateCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMonitoringTemplatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMonitoringTemplatesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProcessSetsResponse> listProcessSets(
            ListProcessSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProcessSetsRequest, ListProcessSetsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProcessSetsResponse::builder)
                .logger(LOG, "listProcessSets")
                .serviceDetails(
                        "StackMonitoring",
                        "ListProcessSets",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSetCollection/ListProcessSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProcessSetsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("processSets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.ProcessSetCollection.class,
                        ListProcessSetsResponse.Builder::processSetCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListProcessSetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListProcessSetsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "StackMonitoring",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/WorkRequestErrorCollection/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "StackMonitoring",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/WorkRequestLogEntryCollection/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "StackMonitoring",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/WorkRequestSummaryCollection/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ManageLicenseResponse> manageLicense(
            ManageLicenseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ManageLicenseRequest, ManageLicenseResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoredResourceId(), "monitoredResourceId must not be blank");
        Objects.requireNonNull(
                request.getManageLicenseDetails(), "manageLicenseDetails is required");

        return clientCall(request, ManageLicenseResponse::builder)
                .logger(LOG, "manageLicense")
                .serviceDetails(
                        "StackMonitoring",
                        "ManageLicense",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/ManageLicense")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ManageLicenseRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam(request.getMonitoredResourceId())
                .appendPathParam("actions")
                .appendPathParam("manageLicense")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ManageLicenseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PublishMetricExtensionResponse> publishMetricExtension(
            PublishMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PublishMetricExtensionRequest, PublishMetricExtensionResponse>
                    handler) {

        Validate.notBlank(request.getMetricExtensionId(), "metricExtensionId must not be blank");

        return clientCall(request, PublishMetricExtensionResponse::builder)
                .logger(LOG, "publishMetricExtension")
                .serviceDetails(
                        "StackMonitoring",
                        "PublishMetricExtension",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/PublishMetricExtension")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishMetricExtensionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam(request.getMetricExtensionId())
                .appendPathParam("actions")
                .appendPathParam("publish")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MetricExtension.class,
                        PublishMetricExtensionResponse.Builder::metricExtension)
                .handleResponseHeaderString(
                        "opc-request-id", PublishMetricExtensionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PublishMetricExtensionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "content-location", PublishMetricExtensionResponse.Builder::contentLocation)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestMonitoredResourcesSummarizedCountResponse>
            requestMonitoredResourcesSummarizedCount(
                    RequestMonitoredResourcesSummarizedCountRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestMonitoredResourcesSummarizedCountRequest,
                                    RequestMonitoredResourcesSummarizedCountResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestMonitoredResourcesSummarizedCountResponse::builder)
                .logger(LOG, "requestMonitoredResourcesSummarizedCount")
                .serviceDetails(
                        "StackMonitoring",
                        "RequestMonitoredResourcesSummarizedCount",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/RequestMonitoredResourcesSummarizedCount")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestMonitoredResourcesSummarizedCountRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam("actions")
                .appendPathParam("summarizeCount")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("groupBy", request.getGroupBy())
                .appendEnumQueryParam("license", request.getLicense())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model
                                .MonitoredResourcesCountAggregationCollection.class,
                        RequestMonitoredResourcesSummarizedCountResponse.Builder
                                ::monitoredResourcesCountAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestMonitoredResourcesSummarizedCountResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestMonitoredResourcesSummarizedCountResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        RequestMonitoredResourcesSummarizedCountResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedMetricExtensionsMetricsResponse>
            requestSummarizedMetricExtensionsMetrics(
                    RequestSummarizedMetricExtensionsMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedMetricExtensionsMetricsRequest,
                                    RequestSummarizedMetricExtensionsMetricsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRequestSummarizedMetricExtensionsMetricsDetails(),
                "requestSummarizedMetricExtensionsMetricsDetails is required");

        return clientCall(request, RequestSummarizedMetricExtensionsMetricsResponse::builder)
                .logger(LOG, "requestSummarizedMetricExtensionsMetrics")
                .serviceDetails(
                        "StackMonitoring",
                        "RequestSummarizedMetricExtensionsMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/RequestSummarizedMetricExtensionsMetrics")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedMetricExtensionsMetricsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam("actions")
                .appendPathParam("summarizeMetrics")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model
                                .MetricExtensionMetricAggregationCollection.class,
                        RequestSummarizedMetricExtensionsMetricsResponse.Builder
                                ::metricExtensionMetricAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedMetricExtensionsMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedMetricExtensionsMetricsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        RequestSummarizedMetricExtensionsMetricsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedMetricExtensionsResourcesResponse>
            requestSummarizedMetricExtensionsResources(
                    RequestSummarizedMetricExtensionsResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedMetricExtensionsResourcesRequest,
                                    RequestSummarizedMetricExtensionsResourcesResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRequestSummarizedMetricExtensionsResourcesDetails(),
                "requestSummarizedMetricExtensionsResourcesDetails is required");

        return clientCall(request, RequestSummarizedMetricExtensionsResourcesResponse::builder)
                .logger(LOG, "requestSummarizedMetricExtensionsResources")
                .serviceDetails(
                        "StackMonitoring",
                        "RequestSummarizedMetricExtensionsResources",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/RequestSummarizedMetricExtensionsResources")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedMetricExtensionsResourcesRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam("actions")
                .appendPathParam("summarizeResources")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model
                                .MetricExtensionResourceAggregationCollection.class,
                        RequestSummarizedMetricExtensionsResourcesResponse.Builder
                                ::metricExtensionResourceAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedMetricExtensionsResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedMetricExtensionsResourcesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        RequestSummarizedMetricExtensionsResourcesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetryFailedMaintenanceWindowOperationResponse>
            retryFailedMaintenanceWindowOperation(
                    RetryFailedMaintenanceWindowOperationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RetryFailedMaintenanceWindowOperationRequest,
                                    RetryFailedMaintenanceWindowOperationResponse>
                            handler) {

        Validate.notBlank(
                request.getMaintenanceWindowId(), "maintenanceWindowId must not be blank");

        return clientCall(request, RetryFailedMaintenanceWindowOperationResponse::builder)
                .logger(LOG, "retryFailedMaintenanceWindowOperation")
                .serviceDetails(
                        "StackMonitoring",
                        "RetryFailedMaintenanceWindowOperation",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MaintenanceWindow/RetryFailedMaintenanceWindowOperation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetryFailedMaintenanceWindowOperationRequest::builder)
                .basePath("/20210330")
                .appendPathParam("maintenanceWindows")
                .appendPathParam(request.getMaintenanceWindowId())
                .appendPathParam("actions")
                .appendPathParam("retryFailedOperation")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RetryFailedMaintenanceWindowOperationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RetryFailedMaintenanceWindowOperationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchAssociatedResourcesResponse> searchAssociatedResources(
            SearchAssociatedResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchAssociatedResourcesRequest, SearchAssociatedResourcesResponse>
                    handler) {
        Objects.requireNonNull(
                request.getSearchAssociatedResourcesDetails(),
                "searchAssociatedResourcesDetails is required");

        return clientCall(request, SearchAssociatedResourcesResponse::builder)
                .logger(LOG, "searchAssociatedResources")
                .serviceDetails(
                        "StackMonitoring",
                        "SearchAssociatedResources",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/SearchAssociatedResources")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchAssociatedResourcesRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam("actions")
                .appendPathParam("searchAssociatedResources")
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "excludeFields",
                        request.getExcludeFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.AssociatedResourcesCollection.class,
                        SearchAssociatedResourcesResponse.Builder::associatedResourcesCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SearchAssociatedResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchAssociatedResourcesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", SearchAssociatedResourcesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchMonitoredResourceAssociationsResponse>
            searchMonitoredResourceAssociations(
                    SearchMonitoredResourceAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchMonitoredResourceAssociationsRequest,
                                    SearchMonitoredResourceAssociationsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getSearchMonitoredResourceAssociationsDetails(),
                "searchMonitoredResourceAssociationsDetails is required");

        return clientCall(request, SearchMonitoredResourceAssociationsResponse::builder)
                .logger(LOG, "searchMonitoredResourceAssociations")
                .serviceDetails(
                        "StackMonitoring",
                        "SearchMonitoredResourceAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/SearchMonitoredResourceAssociations")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchMonitoredResourceAssociationsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam("actions")
                .appendPathParam("searchAssociations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceAssociationsCollection
                                .class,
                        SearchMonitoredResourceAssociationsResponse.Builder
                                ::monitoredResourceAssociationsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchMonitoredResourceAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SearchMonitoredResourceAssociationsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        SearchMonitoredResourceAssociationsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchMonitoredResourceMembersResponse>
            searchMonitoredResourceMembers(
                    SearchMonitoredResourceMembersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchMonitoredResourceMembersRequest,
                                    SearchMonitoredResourceMembersResponse>
                            handler) {

        Validate.notBlank(
                request.getMonitoredResourceId(), "monitoredResourceId must not be blank");
        Objects.requireNonNull(
                request.getSearchMonitoredResourceMembersDetails(),
                "searchMonitoredResourceMembersDetails is required");

        return clientCall(request, SearchMonitoredResourceMembersResponse::builder)
                .logger(LOG, "searchMonitoredResourceMembers")
                .serviceDetails(
                        "StackMonitoring",
                        "SearchMonitoredResourceMembers",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/SearchMonitoredResourceMembers")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchMonitoredResourceMembersRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam(request.getMonitoredResourceId())
                .appendPathParam("actions")
                .appendPathParam("listMembers")
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceMembersCollection
                                .class,
                        SearchMonitoredResourceMembersResponse.Builder
                                ::monitoredResourceMembersCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchMonitoredResourceMembersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SearchMonitoredResourceMembersResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        SearchMonitoredResourceMembersResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchMonitoredResourcesResponse> searchMonitoredResources(
            SearchMonitoredResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchMonitoredResourcesRequest, SearchMonitoredResourcesResponse>
                    handler) {
        Objects.requireNonNull(
                request.getSearchMonitoredResourcesDetails(),
                "searchMonitoredResourcesDetails is required");

        return clientCall(request, SearchMonitoredResourcesResponse::builder)
                .logger(LOG, "searchMonitoredResources")
                .serviceDetails(
                        "StackMonitoring",
                        "SearchMonitoredResources",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/SearchMonitoredResources")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchMonitoredResourcesRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam("actions")
                .appendPathParam("search")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "excludeFields",
                        request.getExcludeFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceCollection.class,
                        SearchMonitoredResourcesResponse.Builder::monitoredResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SearchMonitoredResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchMonitoredResourcesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", SearchMonitoredResourcesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopMaintenanceWindowResponse> stopMaintenanceWindow(
            StopMaintenanceWindowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopMaintenanceWindowRequest, StopMaintenanceWindowResponse>
                    handler) {

        Validate.notBlank(
                request.getMaintenanceWindowId(), "maintenanceWindowId must not be blank");

        return clientCall(request, StopMaintenanceWindowResponse::builder)
                .logger(LOG, "stopMaintenanceWindow")
                .serviceDetails(
                        "StackMonitoring",
                        "StopMaintenanceWindow",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MaintenanceWindow/StopMaintenanceWindow")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopMaintenanceWindowRequest::builder)
                .basePath("/20210330")
                .appendPathParam("maintenanceWindows")
                .appendPathParam(request.getMaintenanceWindowId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopMaintenanceWindowResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopMaintenanceWindowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TestMetricExtensionResponse> testMetricExtension(
            TestMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TestMetricExtensionRequest, TestMetricExtensionResponse>
                    handler) {

        Validate.notBlank(request.getMetricExtensionId(), "metricExtensionId must not be blank");
        Objects.requireNonNull(
                request.getTestMetricExtensionDetails(), "testMetricExtensionDetails is required");

        return clientCall(request, TestMetricExtensionResponse::builder)
                .logger(LOG, "testMetricExtension")
                .serviceDetails(
                        "StackMonitoring",
                        "TestMetricExtension",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/TestMetricExtension")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TestMetricExtensionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam(request.getMetricExtensionId())
                .appendPathParam("actions")
                .appendPathParam("test")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.TestMetricExtensionData.class,
                        TestMetricExtensionResponse.Builder::testMetricExtensionData)
                .handleResponseHeaderString("etag", TestMetricExtensionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        TestMetricExtensionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", TestMetricExtensionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UnapplyMonitoringTemplateResponse> unapplyMonitoringTemplate(
            UnapplyMonitoringTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UnapplyMonitoringTemplateRequest, UnapplyMonitoringTemplateResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");

        return clientCall(request, UnapplyMonitoringTemplateResponse::builder)
                .logger(LOG, "unapplyMonitoringTemplate")
                .serviceDetails(
                        "StackMonitoring",
                        "UnapplyMonitoringTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoringTemplate/UnapplyMonitoringTemplate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UnapplyMonitoringTemplateRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .appendPathParam("actions")
                .appendPathParam("unapply")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UnapplyMonitoringTemplateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UnapplyMonitoringTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAlarmConditionResponse> updateAlarmCondition(
            UpdateAlarmConditionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAlarmConditionRequest, UpdateAlarmConditionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateAlarmConditionDetails(),
                "updateAlarmConditionDetails is required");

        Validate.notBlank(request.getAlarmConditionId(), "alarmConditionId must not be blank");

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");

        return clientCall(request, UpdateAlarmConditionResponse::builder)
                .logger(LOG, "updateAlarmCondition")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateAlarmCondition",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/AlarmCondition/UpdateAlarmCondition")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAlarmConditionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .appendPathParam("alarmConditions")
                .appendPathParam(request.getAlarmConditionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.AlarmCondition.class,
                        UpdateAlarmConditionResponse.Builder::alarmCondition)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAlarmConditionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateAlarmConditionResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAndPropagateTagsResponse> updateAndPropagateTags(
            UpdateAndPropagateTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAndPropagateTagsRequest, UpdateAndPropagateTagsResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoredResourceId(), "monitoredResourceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAndPropagateTagsDetails(),
                "updateAndPropagateTagsDetails is required");

        return clientCall(request, UpdateAndPropagateTagsResponse::builder)
                .logger(LOG, "updateAndPropagateTags")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateAndPropagateTags",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/UpdateAndPropagateTags")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateAndPropagateTagsRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam(request.getMonitoredResourceId())
                .appendPathParam("actions")
                .appendPathParam("updateAndPropagateTags")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAndPropagateTagsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAndPropagateTagsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBaselineableMetricResponse> updateBaselineableMetric(
            UpdateBaselineableMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBaselineableMetricRequest, UpdateBaselineableMetricResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateBaselineableMetricDetails(),
                "updateBaselineableMetricDetails is required");

        Validate.notBlank(
                request.getBaselineableMetricId(), "baselineableMetricId must not be blank");

        return clientCall(request, UpdateBaselineableMetricResponse::builder)
                .logger(LOG, "updateBaselineableMetric")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateBaselineableMetric",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/UpdateBaselineableMetric")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBaselineableMetricRequest::builder)
                .basePath("/20210330")
                .appendPathParam("baselineableMetrics")
                .appendPathParam(request.getBaselineableMetricId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.BaselineableMetric.class,
                        UpdateBaselineableMetricResponse.Builder::baselineableMetric)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBaselineableMetricResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateBaselineableMetricResponse.Builder::etag)
                .handleResponseHeaderInteger(
                        "retry-after", UpdateBaselineableMetricResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigResponse> updateConfig(
            UpdateConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateConfigRequest, UpdateConfigResponse>
                    handler) {

        Validate.notBlank(request.getConfigId(), "configId must not be blank");
        Objects.requireNonNull(request.getUpdateConfigDetails(), "updateConfigDetails is required");

        return clientCall(request, UpdateConfigResponse::builder)
                .logger(LOG, "updateConfig")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateConfig",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/Config/UpdateConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConfigRequest::builder)
                .basePath("/20210330")
                .appendPathParam("configs")
                .appendPathParam(request.getConfigId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.Config.class,
                        UpdateConfigResponse.Builder::config)
                .handleResponseHeaderString("etag", UpdateConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaintenanceWindowResponse> updateMaintenanceWindow(
            UpdateMaintenanceWindowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse>
                    handler) {

        Validate.notBlank(
                request.getMaintenanceWindowId(), "maintenanceWindowId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMaintenanceWindowDetails(),
                "updateMaintenanceWindowDetails is required");

        return clientCall(request, UpdateMaintenanceWindowResponse::builder)
                .logger(LOG, "updateMaintenanceWindow")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateMaintenanceWindow",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MaintenanceWindow/UpdateMaintenanceWindow")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMaintenanceWindowRequest::builder)
                .basePath("/20210330")
                .appendPathParam("maintenanceWindows")
                .appendPathParam(request.getMaintenanceWindowId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMaintenanceWindowResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMaintenanceWindowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMetricExtensionResponse> updateMetricExtension(
            UpdateMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMetricExtensionRequest, UpdateMetricExtensionResponse>
                    handler) {

        Validate.notBlank(request.getMetricExtensionId(), "metricExtensionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMetricExtensionDetails(),
                "updateMetricExtensionDetails is required");

        return clientCall(request, UpdateMetricExtensionResponse::builder)
                .logger(LOG, "updateMetricExtension")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateMetricExtension",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/UpdateMetricExtension")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMetricExtensionRequest::builder)
                .basePath("/20210330")
                .appendPathParam("metricExtensions")
                .appendPathParam(request.getMetricExtensionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MetricExtension.class,
                        UpdateMetricExtensionResponse.Builder::metricExtension)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMetricExtensionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateMetricExtensionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "content-location", UpdateMetricExtensionResponse.Builder::contentLocation)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoredResourceResponse> updateMonitoredResource(
            UpdateMonitoredResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMonitoredResourceRequest, UpdateMonitoredResourceResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoredResourceId(), "monitoredResourceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMonitoredResourceDetails(),
                "updateMonitoredResourceDetails is required");

        return clientCall(request, UpdateMonitoredResourceResponse::builder)
                .logger(LOG, "updateMonitoredResource")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateMonitoredResource",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/UpdateMonitoredResource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMonitoredResourceRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResources")
                .appendPathParam(request.getMonitoredResourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMonitoredResourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMonitoredResourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoredResourceTaskResponse>
            updateMonitoredResourceTask(
                    UpdateMonitoredResourceTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMonitoredResourceTaskRequest,
                                    UpdateMonitoredResourceTaskResponse>
                            handler) {

        Validate.notBlank(
                request.getMonitoredResourceTaskId(), "monitoredResourceTaskId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMonitoredResourceTaskDetails(),
                "updateMonitoredResourceTaskDetails is required");

        return clientCall(request, UpdateMonitoredResourceTaskResponse::builder)
                .logger(LOG, "updateMonitoredResourceTask")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateMonitoredResourceTask",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceTask/UpdateMonitoredResourceTask")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMonitoredResourceTaskRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResourceTasks")
                .appendPathParam(request.getMonitoredResourceTaskId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceTask.class,
                        UpdateMonitoredResourceTaskResponse.Builder::monitoredResourceTask)
                .handleResponseHeaderString(
                        "etag", UpdateMonitoredResourceTaskResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMonitoredResourceTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoredResourceTypeResponse>
            updateMonitoredResourceType(
                    UpdateMonitoredResourceTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMonitoredResourceTypeRequest,
                                    UpdateMonitoredResourceTypeResponse>
                            handler) {

        Validate.notBlank(
                request.getMonitoredResourceTypeId(), "monitoredResourceTypeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMonitoredResourceTypeDetails(),
                "updateMonitoredResourceTypeDetails is required");

        return clientCall(request, UpdateMonitoredResourceTypeResponse::builder)
                .logger(LOG, "updateMonitoredResourceType")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateMonitoredResourceType",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceType/UpdateMonitoredResourceType")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMonitoredResourceTypeRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoredResourceTypes")
                .appendPathParam(request.getMonitoredResourceTypeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceType.class,
                        UpdateMonitoredResourceTypeResponse.Builder::monitoredResourceType)
                .handleResponseHeaderString(
                        "etag", UpdateMonitoredResourceTypeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMonitoredResourceTypeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoringTemplateResponse> updateMonitoringTemplate(
            UpdateMonitoringTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMonitoringTemplateRequest, UpdateMonitoringTemplateResponse>
                    handler) {

        Validate.notBlank(
                request.getMonitoringTemplateId(), "monitoringTemplateId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMonitoringTemplateDetails(),
                "updateMonitoringTemplateDetails is required");

        return clientCall(request, UpdateMonitoringTemplateResponse::builder)
                .logger(LOG, "updateMonitoringTemplate")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateMonitoringTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoringTemplate/UpdateMonitoringTemplate")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMonitoringTemplateRequest::builder)
                .basePath("/20210330")
                .appendPathParam("monitoringTemplates")
                .appendPathParam(request.getMonitoringTemplateId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.MonitoringTemplate.class,
                        UpdateMonitoringTemplateResponse.Builder::monitoringTemplate)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMonitoringTemplateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateMonitoringTemplateResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProcessSetResponse> updateProcessSet(
            UpdateProcessSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateProcessSetRequest, UpdateProcessSetResponse>
                    handler) {

        Validate.notBlank(request.getProcessSetId(), "processSetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProcessSetDetails(), "updateProcessSetDetails is required");

        return clientCall(request, UpdateProcessSetResponse::builder)
                .logger(LOG, "updateProcessSet")
                .serviceDetails(
                        "StackMonitoring",
                        "UpdateProcessSet",
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSet/UpdateProcessSet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProcessSetRequest::builder)
                .basePath("/20210330")
                .appendPathParam("processSets")
                .appendPathParam(request.getProcessSetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.stackmonitoring.model.ProcessSet.class,
                        UpdateProcessSetResponse.Builder::processSet)
                .handleResponseHeaderString("etag", UpdateProcessSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProcessSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
