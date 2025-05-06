/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class FleetAppsManagementRunbooksClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements FleetAppsManagementRunbooks {
    /** Service instance for FleetAppsManagementRunbooks. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETAPPSMANAGEMENTRUNBOOKS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementRunbooksClient.class);

    private final FleetAppsManagementRunbooksWaiters waiters;

    private final FleetAppsManagementRunbooksPaginators paginators;

    FleetAppsManagementRunbooksClient(
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
                                    .nameFormat("FleetAppsManagementRunbooks-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new FleetAppsManagementRunbooksWaiters(executorService, this);

        this.paginators = new FleetAppsManagementRunbooksPaginators(this);
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
                    Builder, FleetAppsManagementRunbooksClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "fleetappsmanagement";
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
        public FleetAppsManagementRunbooksClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementRunbooksClient(
                    this, authenticationDetailsProvider, executorService);
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
    public ChangeRunbookCompartmentResponse changeRunbookCompartment(
            ChangeRunbookCompartmentRequest request) {

        Validate.notBlank(request.getRunbookId(), "runbookId must not be blank");
        Objects.requireNonNull(
                request.getChangeRunbookCompartmentDetails(),
                "changeRunbookCompartmentDetails is required");

        return clientCall(request, ChangeRunbookCompartmentResponse::builder)
                .logger(LOG, "changeRunbookCompartment")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "ChangeRunbookCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Runbook/ChangeRunbookCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRunbookCompartmentRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbooks")
                .appendPathParam(request.getRunbookId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeRunbookCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeRunbookCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeTaskRecordCompartmentResponse changeTaskRecordCompartment(
            ChangeTaskRecordCompartmentRequest request) {

        Validate.notBlank(request.getTaskRecordId(), "taskRecordId must not be blank");
        Objects.requireNonNull(
                request.getChangeTaskRecordCompartmentDetails(),
                "changeTaskRecordCompartmentDetails is required");

        return clientCall(request, ChangeTaskRecordCompartmentResponse::builder)
                .logger(LOG, "changeTaskRecordCompartment")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "ChangeTaskRecordCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/TaskRecord/ChangeTaskRecordCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTaskRecordCompartmentRequest::builder)
                .basePath("/20250228")
                .appendPathParam("taskRecords")
                .appendPathParam(request.getTaskRecordId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeTaskRecordCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeTaskRecordCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRunbookResponse createRunbook(CreateRunbookRequest request) {
        Objects.requireNonNull(
                request.getCreateRunbookDetails(), "createRunbookDetails is required");

        return clientCall(request, CreateRunbookResponse::builder)
                .logger(LOG, "createRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "CreateRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Runbook/CreateRunbook")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRunbookRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbooks")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Runbook.class,
                        CreateRunbookResponse.Builder::runbook)
                .handleResponseHeaderString("location", CreateRunbookResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateRunbookResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateRunbookResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateRunbookResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRunbookResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRunbookVersionResponse createRunbookVersion(CreateRunbookVersionRequest request) {
        Objects.requireNonNull(
                request.getCreateRunbookVersionDetails(),
                "createRunbookVersionDetails is required");

        return clientCall(request, CreateRunbookVersionResponse::builder)
                .logger(LOG, "createRunbookVersion")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "CreateRunbookVersion",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/RunbookVersion/CreateRunbookVersion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRunbookVersionRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbookVersions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.RunbookVersion.class,
                        CreateRunbookVersionResponse.Builder::runbookVersion)
                .handleResponseHeaderString(
                        "location", CreateRunbookVersionResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateRunbookVersionResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateRunbookVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateRunbookVersionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRunbookVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateTaskRecordResponse createTaskRecord(CreateTaskRecordRequest request) {
        Objects.requireNonNull(
                request.getCreateTaskRecordDetails(), "createTaskRecordDetails is required");

        return clientCall(request, CreateTaskRecordResponse::builder)
                .logger(LOG, "createTaskRecord")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "CreateTaskRecord",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/TaskRecord/CreateTaskRecord")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTaskRecordRequest::builder)
                .basePath("/20250228")
                .appendPathParam("taskRecords")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.TaskRecord.class,
                        CreateTaskRecordResponse.Builder::taskRecord)
                .handleResponseHeaderString("etag", CreateTaskRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTaskRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRunbookResponse deleteRunbook(DeleteRunbookRequest request) {

        Validate.notBlank(request.getRunbookId(), "runbookId must not be blank");

        return clientCall(request, DeleteRunbookResponse::builder)
                .logger(LOG, "deleteRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "DeleteRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Runbook/DeleteRunbook")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRunbookRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbooks")
                .appendPathParam(request.getRunbookId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteRunbookResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRunbookResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRunbookVersionResponse deleteRunbookVersion(DeleteRunbookVersionRequest request) {

        Validate.notBlank(request.getRunbookVersionId(), "runbookVersionId must not be blank");

        return clientCall(request, DeleteRunbookVersionResponse::builder)
                .logger(LOG, "deleteRunbookVersion")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "DeleteRunbookVersion",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/RunbookVersion/DeleteRunbookVersion")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRunbookVersionRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbookVersions")
                .appendPathParam(request.getRunbookVersionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteRunbookVersionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRunbookVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteTaskRecordResponse deleteTaskRecord(DeleteTaskRecordRequest request) {

        Validate.notBlank(request.getTaskRecordId(), "taskRecordId must not be blank");

        return clientCall(request, DeleteTaskRecordResponse::builder)
                .logger(LOG, "deleteTaskRecord")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "DeleteTaskRecord",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/TaskRecord/DeleteTaskRecord")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTaskRecordRequest::builder)
                .basePath("/20250228")
                .appendPathParam("taskRecords")
                .appendPathParam(request.getTaskRecordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteTaskRecordResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTaskRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRunbookResponse getRunbook(GetRunbookRequest request) {

        Validate.notBlank(request.getRunbookId(), "runbookId must not be blank");

        return clientCall(request, GetRunbookResponse::builder)
                .logger(LOG, "getRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "GetRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Runbook/GetRunbook")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRunbookRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbooks")
                .appendPathParam(request.getRunbookId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Runbook.class,
                        GetRunbookResponse.Builder::runbook)
                .handleResponseHeaderString("etag", GetRunbookResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRunbookResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRunbookVersionResponse getRunbookVersion(GetRunbookVersionRequest request) {

        Validate.notBlank(request.getRunbookVersionId(), "runbookVersionId must not be blank");

        return clientCall(request, GetRunbookVersionResponse::builder)
                .logger(LOG, "getRunbookVersion")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "GetRunbookVersion",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/RunbookVersion/GetRunbookVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRunbookVersionRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbookVersions")
                .appendPathParam(request.getRunbookVersionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.RunbookVersion.class,
                        GetRunbookVersionResponse.Builder::runbookVersion)
                .handleResponseHeaderString("etag", GetRunbookVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRunbookVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTaskRecordResponse getTaskRecord(GetTaskRecordRequest request) {

        Validate.notBlank(request.getTaskRecordId(), "taskRecordId must not be blank");

        return clientCall(request, GetTaskRecordResponse::builder)
                .logger(LOG, "getTaskRecord")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "GetTaskRecord",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/TaskRecord/GetTaskRecord")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTaskRecordRequest::builder)
                .basePath("/20250228")
                .appendPathParam("taskRecords")
                .appendPathParam(request.getTaskRecordId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.TaskRecord.class,
                        GetTaskRecordResponse.Builder::taskRecord)
                .handleResponseHeaderString("etag", GetTaskRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTaskRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListRunbookVersionsResponse listRunbookVersions(ListRunbookVersionsRequest request) {

        return clientCall(request, ListRunbookVersionsResponse::builder)
                .logger(LOG, "listRunbookVersions")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "ListRunbookVersions",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/RunbookVersionCollection/ListRunbookVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRunbookVersionsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbookVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("runbookId", request.getRunbookId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.RunbookVersionCollection.class,
                        ListRunbookVersionsResponse.Builder::runbookVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRunbookVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRunbookVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRunbooksResponse listRunbooks(ListRunbooksRequest request) {

        return clientCall(request, ListRunbooksResponse::builder)
                .logger(LOG, "listRunbooks")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "ListRunbooks",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/RunbookCollection/ListRunbooks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRunbooksRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbooks")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("platform", request.getPlatform())
                .appendQueryParam("operation", request.getOperation())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.RunbookCollection.class,
                        ListRunbooksResponse.Builder::runbookCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRunbooksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRunbooksResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListTaskRecordsResponse listTaskRecords(ListTaskRecordsRequest request) {

        return clientCall(request, ListTaskRecordsResponse::builder)
                .logger(LOG, "listTaskRecords")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "ListTaskRecords",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/TaskRecordCollection/ListTaskRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaskRecordsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("taskRecords")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("platform", request.getPlatform())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("operation", request.getOperation())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.TaskRecordCollection.class,
                        ListTaskRecordsResponse.Builder::taskRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaskRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTaskRecordsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PublishRunbookResponse publishRunbook(PublishRunbookRequest request) {
        Objects.requireNonNull(
                request.getPublishRunbookDetails(), "publishRunbookDetails is required");

        return clientCall(request, PublishRunbookResponse::builder)
                .logger(LOG, "publishRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "PublishRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Runbook/PublishRunbook")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishRunbookRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbooks")
                .appendPathParam("actions")
                .appendPathParam("publishRunbook")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PublishRunbookResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PublishRunbookResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SetDefaultRunbookResponse setDefaultRunbook(SetDefaultRunbookRequest request) {
        Objects.requireNonNull(
                request.getSetDefaultRunbookDetails(), "setDefaultRunbookDetails is required");

        return clientCall(request, SetDefaultRunbookResponse::builder)
                .logger(LOG, "setDefaultRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "SetDefaultRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Runbook/SetDefaultRunbook")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SetDefaultRunbookRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbooks")
                .appendPathParam("actions")
                .appendPathParam("setDefaultRunbook")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Runbook.class,
                        SetDefaultRunbookResponse.Builder::runbook)
                .handleResponseHeaderString("etag", SetDefaultRunbookResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SetDefaultRunbookResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRunbookResponse updateRunbook(UpdateRunbookRequest request) {

        Validate.notBlank(request.getRunbookId(), "runbookId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRunbookDetails(), "updateRunbookDetails is required");

        return clientCall(request, UpdateRunbookResponse::builder)
                .logger(LOG, "updateRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "UpdateRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Runbook/UpdateRunbook")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRunbookRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbooks")
                .appendPathParam(request.getRunbookId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateRunbookResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRunbookResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRunbookVersionResponse updateRunbookVersion(UpdateRunbookVersionRequest request) {

        Validate.notBlank(request.getRunbookVersionId(), "runbookVersionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRunbookVersionDetails(),
                "updateRunbookVersionDetails is required");

        return clientCall(request, UpdateRunbookVersionResponse::builder)
                .logger(LOG, "updateRunbookVersion")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "UpdateRunbookVersion",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/RunbookVersion/UpdateRunbookVersion")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRunbookVersionRequest::builder)
                .basePath("/20250228")
                .appendPathParam("runbookVersions")
                .appendPathParam(request.getRunbookVersionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateRunbookVersionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRunbookVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateTaskRecordResponse updateTaskRecord(UpdateTaskRecordRequest request) {

        Validate.notBlank(request.getTaskRecordId(), "taskRecordId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTaskRecordDetails(), "updateTaskRecordDetails is required");

        return clientCall(request, UpdateTaskRecordResponse::builder)
                .logger(LOG, "updateTaskRecord")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "UpdateTaskRecord",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/TaskRecord/UpdateTaskRecord")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTaskRecordRequest::builder)
                .basePath("/20250228")
                .appendPathParam("taskRecords")
                .appendPathParam(request.getTaskRecordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateTaskRecordResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTaskRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public FleetAppsManagementRunbooksWaiters getWaiters() {
        return waiters;
    }

    @Override
    public FleetAppsManagementRunbooksPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementRunbooksClient(
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
    public FleetAppsManagementRunbooksClient(
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
    public FleetAppsManagementRunbooksClient(
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
    public FleetAppsManagementRunbooksClient(
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
    public FleetAppsManagementRunbooksClient(
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
    public FleetAppsManagementRunbooksClient(
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
    public FleetAppsManagementRunbooksClient(
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
    public FleetAppsManagementRunbooksClient(
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
