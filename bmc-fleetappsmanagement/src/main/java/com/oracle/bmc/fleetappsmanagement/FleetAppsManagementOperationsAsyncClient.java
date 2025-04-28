/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for FleetAppsManagementOperations service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementOperationsAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements FleetAppsManagementOperationsAsync {
    /** Service instance for FleetAppsManagementOperations. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETAPPSMANAGEMENTOPERATIONS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementOperationsAsyncClient.class);

    FleetAppsManagementOperationsAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    FleetAppsManagementOperationsAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "FleetAppsManagementOperationsAsyncClient", "exportComplianceReport"));
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
                    Builder, FleetAppsManagementOperationsAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "fleetappsmanagement";
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
        public FleetAppsManagementOperationsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementOperationsAsyncClient(
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
    public java.util.concurrent.Future<CreatePatchResponse> createPatch(
            CreatePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePatchRequest, CreatePatchResponse>
                    handler) {
        Objects.requireNonNull(request.getCreatePatchDetails(), "createPatchDetails is required");

        return clientCall(request, CreatePatchResponse::builder)
                .logger(LOG, "createPatch")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "CreatePatch",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Patch/CreatePatch")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePatchRequest::builder)
                .basePath("/20230831")
                .appendPathParam("patches")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Patch.class,
                        CreatePatchResponse.Builder::patch)
                .handleResponseHeaderString("etag", CreatePatchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSchedulerDefinitionResponse> createSchedulerDefinition(
            CreateSchedulerDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSchedulerDefinitionRequest, CreateSchedulerDefinitionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSchedulerDefinitionDetails(),
                "createSchedulerDefinitionDetails is required");

        return clientCall(request, CreateSchedulerDefinitionResponse::builder)
                .logger(LOG, "createSchedulerDefinition")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "CreateSchedulerDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerDefinition/CreateSchedulerDefinition")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSchedulerDefinitionRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerDefinitions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition.class,
                        CreateSchedulerDefinitionResponse.Builder::schedulerDefinition)
                .handleResponseHeaderString(
                        "location", CreateSchedulerDefinitionResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateSchedulerDefinitionResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateSchedulerDefinitionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSchedulerDefinitionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSchedulerDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePatchResponse> deletePatch(
            DeletePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePatchRequest, DeletePatchResponse>
                    handler) {

        Validate.notBlank(request.getPatchId(), "patchId must not be blank");

        return clientCall(request, DeletePatchResponse::builder)
                .logger(LOG, "deletePatch")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "DeletePatch",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Patch/DeletePatch")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePatchRequest::builder)
                .basePath("/20230831")
                .appendPathParam("patches")
                .appendPathParam(request.getPatchId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeletePatchResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchedulerDefinitionResponse> deleteSchedulerDefinition(
            DeleteSchedulerDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSchedulerDefinitionRequest, DeleteSchedulerDefinitionResponse>
                    handler) {

        Validate.notBlank(
                request.getSchedulerDefinitionId(), "schedulerDefinitionId must not be blank");

        return clientCall(request, DeleteSchedulerDefinitionResponse::builder)
                .logger(LOG, "deleteSchedulerDefinition")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "DeleteSchedulerDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerDefinition/DeleteSchedulerDefinition")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSchedulerDefinitionRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerDefinitions")
                .appendPathParam(request.getSchedulerDefinitionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSchedulerDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchedulerJobResponse> deleteSchedulerJob(
            DeleteSchedulerJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSchedulerJobRequest, DeleteSchedulerJobResponse>
                    handler) {

        Validate.notBlank(request.getSchedulerJobId(), "schedulerJobId must not be blank");

        return clientCall(request, DeleteSchedulerJobResponse::builder)
                .logger(LOG, "deleteSchedulerJob")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "DeleteSchedulerJob",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJob/DeleteSchedulerJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSchedulerJobRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobs")
                .appendPathParam(request.getSchedulerJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSchedulerJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportComplianceReportResponse> exportComplianceReport(
            ExportComplianceReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportComplianceReportRequest, ExportComplianceReportResponse>
                    handler) {
        Objects.requireNonNull(
                request.getExportComplianceReportDetails(),
                "exportComplianceReportDetails is required");

        return clientCall(request, ExportComplianceReportResponse::builder)
                .logger(LOG, "exportComplianceReport")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "ExportComplianceReport",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ComplianceRecord/ExportComplianceReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportComplianceReportRequest::builder)
                .basePath("/20230831")
                .appendPathParam("complianceRecords")
                .appendPathParam("actions")
                .appendPathParam("exportComplianceReport")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        ExportComplianceReportResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", ExportComplianceReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ExportComplianceReportResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", ExportComplianceReportResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-type", ExportComplianceReportResponse.Builder::contentType)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExecutionResponse> getExecution(
            GetExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetExecutionRequest, GetExecutionResponse>
                    handler) {

        Validate.notBlank(request.getSchedulerJobId(), "schedulerJobId must not be blank");

        Validate.notBlank(request.getJobActivityId(), "jobActivityId must not be blank");

        Validate.notBlank(request.getResourceId(), "resourceId must not be blank");

        Validate.notBlank(request.getExecutionId(), "executionId must not be blank");

        return clientCall(request, GetExecutionResponse::builder)
                .logger(LOG, "getExecution")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "GetExecution",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Execution/GetExecution")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExecutionRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobs")
                .appendPathParam(request.getSchedulerJobId())
                .appendPathParam("jobActivities")
                .appendPathParam(request.getJobActivityId())
                .appendPathParam("resources")
                .appendPathParam(request.getResourceId())
                .appendPathParam("executions")
                .appendPathParam(request.getExecutionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Execution.class,
                        GetExecutionResponse.Builder::execution)
                .handleResponseHeaderString("etag", GetExecutionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobActivityResponse> getJobActivity(
            GetJobActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobActivityRequest, GetJobActivityResponse>
                    handler) {

        Validate.notBlank(request.getSchedulerJobId(), "schedulerJobId must not be blank");

        Validate.notBlank(request.getJobActivityId(), "jobActivityId must not be blank");

        return clientCall(request, GetJobActivityResponse::builder)
                .logger(LOG, "getJobActivity")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "GetJobActivity",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/JobActivity/GetJobActivity")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobActivityRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobs")
                .appendPathParam(request.getSchedulerJobId())
                .appendPathParam("jobActivities")
                .appendPathParam(request.getJobActivityId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.JobActivity.class,
                        GetJobActivityResponse.Builder::jobActivity)
                .handleResponseHeaderString("etag", GetJobActivityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobActivityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPatchResponse> getPatch(
            GetPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPatchRequest, GetPatchResponse>
                    handler) {

        Validate.notBlank(request.getPatchId(), "patchId must not be blank");

        return clientCall(request, GetPatchResponse::builder)
                .logger(LOG, "getPatch")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "GetPatch",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Patch/GetPatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPatchRequest::builder)
                .basePath("/20230831")
                .appendPathParam("patches")
                .appendPathParam(request.getPatchId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Patch.class,
                        GetPatchResponse.Builder::patch)
                .handleResponseHeaderString("etag", GetPatchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSchedulerDefinitionResponse> getSchedulerDefinition(
            GetSchedulerDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>
                    handler) {

        Validate.notBlank(
                request.getSchedulerDefinitionId(), "schedulerDefinitionId must not be blank");

        return clientCall(request, GetSchedulerDefinitionResponse::builder)
                .logger(LOG, "getSchedulerDefinition")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "GetSchedulerDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerDefinition/GetSchedulerDefinition")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSchedulerDefinitionRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerDefinitions")
                .appendPathParam(request.getSchedulerDefinitionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition.class,
                        GetSchedulerDefinitionResponse.Builder::schedulerDefinition)
                .handleResponseHeaderString("etag", GetSchedulerDefinitionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSchedulerDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSchedulerJobResponse> getSchedulerJob(
            GetSchedulerJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSchedulerJobRequest, GetSchedulerJobResponse>
                    handler) {

        Validate.notBlank(request.getSchedulerJobId(), "schedulerJobId must not be blank");

        return clientCall(request, GetSchedulerJobResponse::builder)
                .logger(LOG, "getSchedulerJob")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "GetSchedulerJob",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJob/GetSchedulerJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSchedulerJobRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobs")
                .appendPathParam(request.getSchedulerJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.class,
                        GetSchedulerJobResponse.Builder::schedulerJob)
                .handleResponseHeaderString("etag", GetSchedulerJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSchedulerJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListComplianceRecordsResponse> listComplianceRecords(
            ListComplianceRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListComplianceRecordsRequest, ListComplianceRecordsResponse>
                    handler) {

        return clientCall(request, ListComplianceRecordsResponse::builder)
                .logger(LOG, "listComplianceRecords")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "ListComplianceRecords",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ComplianceRecordCollection/ListComplianceRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComplianceRecordsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("complianceRecords")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("entityId", request.getEntityId())
                .appendQueryParam("productName", request.getProductName())
                .appendQueryParam("productStack", request.getProductStack())
                .appendQueryParam("targetName", request.getTargetName())
                .appendQueryParam("complianceState", request.getComplianceState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.ComplianceRecordCollection.class,
                        ListComplianceRecordsResponse.Builder::complianceRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListComplianceRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListComplianceRecordsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResponse> listExecutions(
            ListExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExecutionsRequest, ListExecutionsResponse>
                    handler) {

        Validate.notBlank(request.getSchedulerJobId(), "schedulerJobId must not be blank");

        Validate.notBlank(request.getJobActivityId(), "jobActivityId must not be blank");

        Validate.notBlank(request.getResourceId(), "resourceId must not be blank");

        return clientCall(request, ListExecutionsResponse::builder)
                .logger(LOG, "listExecutions")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "ListExecutions",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ExecutionCollection/ListExecutions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExecutionsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobs")
                .appendPathParam(request.getSchedulerJobId())
                .appendPathParam("jobActivities")
                .appendPathParam(request.getJobActivityId())
                .appendPathParam("resources")
                .appendPathParam(request.getResourceId())
                .appendPathParam("executions")
                .appendQueryParam("resourceTaskId", request.getResourceTaskId())
                .appendQueryParam("stepName", request.getStepName())
                .appendQueryParam("targetName", request.getTargetName())
                .appendQueryParam("sequence", request.getSequence())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.ExecutionCollection.class,
                        ListExecutionsResponse.Builder::executionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExecutionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExecutionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPatchesResponse> listPatches(
            ListPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPatchesRequest, ListPatchesResponse>
                    handler) {

        return clientCall(request, ListPatchesResponse::builder)
                .logger(LOG, "listPatches")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "ListPatches",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/PatchCollection/ListPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPatchesRequest::builder)
                .basePath("/20230831")
                .appendPathParam("patches")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("productId", request.getProductId())
                .appendQueryParam("version", request.getVersion())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("patchTypeId", request.getPatchTypeId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam(
                        "timeReleasedGreaterThanOrEqualTo",
                        request.getTimeReleasedGreaterThanOrEqualTo())
                .appendQueryParam("timeReleasedLessThan", request.getTimeReleasedLessThan())
                .appendQueryParam(
                        "shouldCompliancePolicyRulesBeApplied",
                        request.getShouldCompliancePolicyRulesBeApplied())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.PatchCollection.class,
                        ListPatchesResponse.Builder::patchCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPatchesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResponse> listResources(
            ListResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListResourcesRequest, ListResourcesResponse>
                    handler) {

        Validate.notBlank(request.getSchedulerJobId(), "schedulerJobId must not be blank");

        Validate.notBlank(request.getJobActivityId(), "jobActivityId must not be blank");

        return clientCall(request, ListResourcesResponse::builder)
                .logger(LOG, "listResources")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "ListResources",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ResourceCollection/ListResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourcesRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobs")
                .appendPathParam(request.getSchedulerJobId())
                .appendPathParam("jobActivities")
                .appendPathParam(request.getJobActivityId())
                .appendPathParam("resources")
                .appendQueryParam("resourceTaskId", request.getResourceTaskId())
                .appendQueryParam("stepName", request.getStepName())
                .appendQueryParam("targetName", request.getTargetName())
                .appendQueryParam("sequence", request.getSequence())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.ResourceCollection.class,
                        ListResourcesResponse.Builder::resourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListScheduledFleetsResponse> listScheduledFleets(
            ListScheduledFleetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledFleetsRequest, ListScheduledFleetsResponse>
                    handler) {

        Validate.notBlank(
                request.getSchedulerDefinitionId(), "schedulerDefinitionId must not be blank");

        return clientCall(request, ListScheduledFleetsResponse::builder)
                .logger(LOG, "listScheduledFleets")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "ListScheduledFleets",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ScheduledFleetCollection/ListScheduledFleets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScheduledFleetsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerDefinitions")
                .appendPathParam(request.getSchedulerDefinitionId())
                .appendPathParam("scheduledFleets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.ScheduledFleetCollection.class,
                        ListScheduledFleetsResponse.Builder::scheduledFleetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListScheduledFleetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScheduledFleetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSchedulerDefinitionsResponse> listSchedulerDefinitions(
            ListSchedulerDefinitionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSchedulerDefinitionsRequest, ListSchedulerDefinitionsResponse>
                    handler) {

        return clientCall(request, ListSchedulerDefinitionsResponse::builder)
                .logger(LOG, "listSchedulerDefinitions")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "ListSchedulerDefinitions",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerDefinitionCollection/ListSchedulerDefinitions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSchedulerDefinitionsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerDefinitions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("product", request.getProduct())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("maintenanceWindowId", request.getMaintenanceWindowId())
                .appendQueryParam("runbookId", request.getRunbookId())
                .appendQueryParam("fleetId", request.getFleetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinitionCollection
                                .class,
                        ListSchedulerDefinitionsResponse.Builder::schedulerDefinitionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSchedulerDefinitionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSchedulerDefinitionsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSchedulerDefinitionsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSchedulerJobsResponse> listSchedulerJobs(
            ListSchedulerJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSchedulerJobsRequest, ListSchedulerJobsResponse>
                    handler) {

        return clientCall(request, ListSchedulerJobsResponse::builder)
                .logger(LOG, "listSchedulerJobs")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "ListSchedulerJobs",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJobCollection/ListSchedulerJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSchedulerJobsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("fleetId", request.getFleetId())
                .appendQueryParam(
                        "timeScheduledGreaterThanOrEqualTo",
                        request.getTimeScheduledGreaterThanOrEqualTo())
                .appendQueryParam("timeScheduledLessThan", request.getTimeScheduledLessThan())
                .appendQueryParam("isRemediationJobNeeded", request.getIsRemediationJobNeeded())
                .appendQueryParam("subState", request.getSubState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("defintionId", request.getDefintionId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.SchedulerJobCollection.class,
                        ListSchedulerJobsResponse.Builder::schedulerJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSchedulerJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSchedulerJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStepsResponse> listSteps(
            ListStepsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListStepsRequest, ListStepsResponse>
                    handler) {

        Validate.notBlank(request.getSchedulerJobId(), "schedulerJobId must not be blank");

        Validate.notBlank(request.getJobActivityId(), "jobActivityId must not be blank");

        return clientCall(request, ListStepsResponse::builder)
                .logger(LOG, "listSteps")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "ListSteps",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/StepCollection/ListSteps")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStepsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobs")
                .appendPathParam(request.getSchedulerJobId())
                .appendPathParam("jobActivities")
                .appendPathParam(request.getJobActivityId())
                .appendPathParam("steps")
                .appendQueryParam("resourceTaskId", request.getResourceTaskId())
                .appendQueryParam("stepName", request.getStepName())
                .appendQueryParam("targetName", request.getTargetName())
                .appendQueryParam("sequence", request.getSequence())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.StepCollection.class,
                        ListStepsResponse.Builder::stepCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListStepsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListStepsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ManageJobExecutionResponse> manageJobExecution(
            ManageJobExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ManageJobExecutionRequest, ManageJobExecutionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getManageJobExecutionDetails(), "manageJobExecutionDetails is required");

        Validate.notBlank(request.getSchedulerJobId(), "schedulerJobId must not be blank");

        return clientCall(request, ManageJobExecutionResponse::builder)
                .logger(LOG, "manageJobExecution")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "ManageJobExecution",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJob/ManageJobExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ManageJobExecutionRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobs")
                .appendPathParam(request.getSchedulerJobId())
                .appendPathParam("actions")
                .appendPathParam("manageJobExecution")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ManageJobExecutionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ManageJobExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeComplianceRecordCountsResponse>
            summarizeComplianceRecordCounts(
                    SummarizeComplianceRecordCountsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeComplianceRecordCountsRequest,
                                    SummarizeComplianceRecordCountsResponse>
                            handler) {

        return clientCall(request, SummarizeComplianceRecordCountsResponse::builder)
                .logger(LOG, "summarizeComplianceRecordCounts")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "SummarizeComplianceRecordCounts",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ComplianceRecordAggregationCollection/SummarizeComplianceRecordCounts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeComplianceRecordCountsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("complianceRecordCounts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model
                                .ComplianceRecordAggregationCollection.class,
                        SummarizeComplianceRecordCountsResponse.Builder
                                ::complianceRecordAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeComplianceRecordCountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeComplianceRecordCountsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeManagedEntityCountsResponse>
            summarizeManagedEntityCounts(
                    SummarizeManagedEntityCountsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagedEntityCountsRequest,
                                    SummarizeManagedEntityCountsResponse>
                            handler) {

        return clientCall(request, SummarizeManagedEntityCountsResponse::builder)
                .logger(LOG, "summarizeManagedEntityCounts")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "SummarizeManagedEntityCounts",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ManagedEntityAggregationCollection/SummarizeManagedEntityCounts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeManagedEntityCountsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("managedEntityCounts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.ManagedEntityAggregationCollection
                                .class,
                        SummarizeManagedEntityCountsResponse.Builder
                                ::managedEntityAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeManagedEntityCountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeManagedEntityCountsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeSchedulerJobCountsResponse>
            summarizeSchedulerJobCounts(
                    SummarizeSchedulerJobCountsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSchedulerJobCountsRequest,
                                    SummarizeSchedulerJobCountsResponse>
                            handler) {

        return clientCall(request, SummarizeSchedulerJobCountsResponse::builder)
                .logger(LOG, "summarizeSchedulerJobCounts")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "SummarizeSchedulerJobCounts",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJobAggregationCollection/SummarizeSchedulerJobCounts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeSchedulerJobCountsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobCounts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.SchedulerJobAggregationCollection
                                .class,
                        SummarizeSchedulerJobCountsResponse.Builder
                                ::schedulerJobAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeSchedulerJobCountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeSchedulerJobCountsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePatchResponse> updatePatch(
            UpdatePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdatePatchRequest, UpdatePatchResponse>
                    handler) {

        Validate.notBlank(request.getPatchId(), "patchId must not be blank");
        Objects.requireNonNull(request.getUpdatePatchDetails(), "updatePatchDetails is required");

        return clientCall(request, UpdatePatchResponse::builder)
                .logger(LOG, "updatePatch")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "UpdatePatch",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Patch/UpdatePatch")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePatchRequest::builder)
                .basePath("/20230831")
                .appendPathParam("patches")
                .appendPathParam(request.getPatchId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdatePatchResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSchedulerDefinitionResponse> updateSchedulerDefinition(
            UpdateSchedulerDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSchedulerDefinitionRequest, UpdateSchedulerDefinitionResponse>
                    handler) {

        Validate.notBlank(
                request.getSchedulerDefinitionId(), "schedulerDefinitionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSchedulerDefinitionDetails(),
                "updateSchedulerDefinitionDetails is required");

        return clientCall(request, UpdateSchedulerDefinitionResponse::builder)
                .logger(LOG, "updateSchedulerDefinition")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "UpdateSchedulerDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerDefinition/UpdateSchedulerDefinition")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSchedulerDefinitionRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerDefinitions")
                .appendPathParam(request.getSchedulerDefinitionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSchedulerDefinitionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSchedulerDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSchedulerJobResponse> updateSchedulerJob(
            UpdateSchedulerJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSchedulerJobRequest, UpdateSchedulerJobResponse>
                    handler) {

        Validate.notBlank(request.getSchedulerJobId(), "schedulerJobId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSchedulerJobDetails(), "updateSchedulerJobDetails is required");

        return clientCall(request, UpdateSchedulerJobResponse::builder)
                .logger(LOG, "updateSchedulerJob")
                .serviceDetails(
                        "FleetAppsManagementOperations",
                        "UpdateSchedulerJob",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJob/UpdateSchedulerJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSchedulerJobRequest::builder)
                .basePath("/20230831")
                .appendPathParam("schedulerJobs")
                .appendPathParam(request.getSchedulerJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.class,
                        UpdateSchedulerJobResponse.Builder::schedulerJob)
                .handleResponseHeaderString("etag", UpdateSchedulerJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSchedulerJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
