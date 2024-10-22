/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for FleetAppsManagementRunbooks service. <br>
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
public class FleetAppsManagementRunbooksAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements FleetAppsManagementRunbooksAsync {
    /** Service instance for FleetAppsManagementRunbooks. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETAPPSMANAGEMENTRUNBOOKS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementRunbooksAsyncClient.class);

    FleetAppsManagementRunbooksAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, FleetAppsManagementRunbooksAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "fleetappsmanagement";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public FleetAppsManagementRunbooksAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementRunbooksAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateRunbookResponse> createRunbook(
            CreateRunbookRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateRunbookRequest, CreateRunbookResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateRunbookDetails(), "createRunbookDetails is required");

        return clientCall(request, CreateRunbookResponse::builder)
                .logger(LOG, "createRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "CreateRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Runbook/CreateRunbook")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRunbookRequest::builder)
                .basePath("/20230831")
                .appendPathParam("runbooks")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskRecordResponse> createTaskRecord(
            CreateTaskRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTaskRecordRequest, CreateTaskRecordResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateTaskRecordDetails(), "createTaskRecordDetails is required");

        return clientCall(request, CreateTaskRecordResponse::builder)
                .logger(LOG, "createTaskRecord")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "CreateTaskRecord",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/TaskRecord/CreateTaskRecord")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTaskRecordRequest::builder)
                .basePath("/20230831")
                .appendPathParam("taskRecords")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.TaskRecord.class,
                        CreateTaskRecordResponse.Builder::taskRecord)
                .handleResponseHeaderString("etag", CreateTaskRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTaskRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunbookResponse> deleteRunbook(
            DeleteRunbookRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRunbookRequest, DeleteRunbookResponse>
                    handler) {

        Validate.notBlank(request.getRunbookId(), "runbookId must not be blank");

        return clientCall(request, DeleteRunbookResponse::builder)
                .logger(LOG, "deleteRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "DeleteRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Runbook/DeleteRunbook")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRunbookRequest::builder)
                .basePath("/20230831")
                .appendPathParam("runbooks")
                .appendPathParam(request.getRunbookId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteRunbookResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRunbookResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskRecordResponse> deleteTaskRecord(
            DeleteTaskRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTaskRecordRequest, DeleteTaskRecordResponse>
                    handler) {

        Validate.notBlank(request.getTaskRecordId(), "taskRecordId must not be blank");

        return clientCall(request, DeleteTaskRecordResponse::builder)
                .logger(LOG, "deleteTaskRecord")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "DeleteTaskRecord",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/TaskRecord/DeleteTaskRecord")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTaskRecordRequest::builder)
                .basePath("/20230831")
                .appendPathParam("taskRecords")
                .appendPathParam(request.getTaskRecordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteTaskRecordResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTaskRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRunbookResponse> getRunbook(
            GetRunbookRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRunbookRequest, GetRunbookResponse>
                    handler) {

        Validate.notBlank(request.getRunbookId(), "runbookId must not be blank");

        return clientCall(request, GetRunbookResponse::builder)
                .logger(LOG, "getRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "GetRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Runbook/GetRunbook")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRunbookRequest::builder)
                .basePath("/20230831")
                .appendPathParam("runbooks")
                .appendPathParam(request.getRunbookId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Runbook.class,
                        GetRunbookResponse.Builder::runbook)
                .handleResponseHeaderString("etag", GetRunbookResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRunbookResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTaskRecordResponse> getTaskRecord(
            GetTaskRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTaskRecordRequest, GetTaskRecordResponse>
                    handler) {

        Validate.notBlank(request.getTaskRecordId(), "taskRecordId must not be blank");

        return clientCall(request, GetTaskRecordResponse::builder)
                .logger(LOG, "getTaskRecord")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "GetTaskRecord",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/TaskRecord/GetTaskRecord")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTaskRecordRequest::builder)
                .basePath("/20230831")
                .appendPathParam("taskRecords")
                .appendPathParam(request.getTaskRecordId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.TaskRecord.class,
                        GetTaskRecordResponse.Builder::taskRecord)
                .handleResponseHeaderString("etag", GetTaskRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTaskRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRunbooksResponse> listRunbooks(
            ListRunbooksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRunbooksRequest, ListRunbooksResponse>
                    handler) {

        return clientCall(request, ListRunbooksResponse::builder)
                .logger(LOG, "listRunbooks")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "ListRunbooks",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/RunbookCollection/ListRunbooks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRunbooksRequest::builder)
                .basePath("/20230831")
                .appendPathParam("runbooks")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("runbookRelevance", request.getRunbookRelevance())
                .appendQueryParam("platform", request.getPlatform())
                .appendQueryParam("operation", request.getOperation())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.RunbookCollection.class,
                        ListRunbooksResponse.Builder::runbookCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRunbooksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRunbooksResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTaskRecordsResponse> listTaskRecords(
            ListTaskRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaskRecordsRequest, ListTaskRecordsResponse>
                    handler) {

        return clientCall(request, ListTaskRecordsResponse::builder)
                .logger(LOG, "listTaskRecords")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "ListTaskRecords",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/TaskRecordCollection/ListTaskRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaskRecordsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("taskRecords")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("platform", request.getPlatform())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.TaskRecordCollection.class,
                        ListTaskRecordsResponse.Builder::taskRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaskRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTaskRecordsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PublishRunbookResponse> publishRunbook(
            PublishRunbookRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PublishRunbookRequest, PublishRunbookResponse>
                    handler) {
        Objects.requireNonNull(
                request.getPublishRunbookDetails(), "publishRunbookDetails is required");

        return clientCall(request, PublishRunbookResponse::builder)
                .logger(LOG, "publishRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "PublishRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Runbook/PublishRunbook")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishRunbookRequest::builder)
                .basePath("/20230831")
                .appendPathParam("runbooks")
                .appendPathParam("actions")
                .appendPathParam("publishRunbook")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PublishRunbookResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PublishRunbookResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SetDefaultRunbookResponse> setDefaultRunbook(
            SetDefaultRunbookRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SetDefaultRunbookRequest, SetDefaultRunbookResponse>
                    handler) {
        Objects.requireNonNull(
                request.getSetDefaultRunbookDetails(), "setDefaultRunbookDetails is required");

        return clientCall(request, SetDefaultRunbookResponse::builder)
                .logger(LOG, "setDefaultRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "SetDefaultRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Runbook/SetDefaultRunbook")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SetDefaultRunbookRequest::builder)
                .basePath("/20230831")
                .appendPathParam("runbooks")
                .appendPathParam("actions")
                .appendPathParam("setDefaultRunbook")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Runbook.class,
                        SetDefaultRunbookResponse.Builder::runbook)
                .handleResponseHeaderString("etag", SetDefaultRunbookResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SetDefaultRunbookResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRunbookResponse> updateRunbook(
            UpdateRunbookRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateRunbookRequest, UpdateRunbookResponse>
                    handler) {

        Validate.notBlank(request.getRunbookId(), "runbookId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRunbookDetails(), "updateRunbookDetails is required");

        return clientCall(request, UpdateRunbookResponse::builder)
                .logger(LOG, "updateRunbook")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "UpdateRunbook",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Runbook/UpdateRunbook")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRunbookRequest::builder)
                .basePath("/20230831")
                .appendPathParam("runbooks")
                .appendPathParam(request.getRunbookId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateRunbookResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRunbookResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskRecordResponse> updateTaskRecord(
            UpdateTaskRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTaskRecordRequest, UpdateTaskRecordResponse>
                    handler) {

        Validate.notBlank(request.getTaskRecordId(), "taskRecordId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTaskRecordDetails(), "updateTaskRecordDetails is required");

        return clientCall(request, UpdateTaskRecordResponse::builder)
                .logger(LOG, "updateTaskRecord")
                .serviceDetails(
                        "FleetAppsManagementRunbooks",
                        "UpdateTaskRecord",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/TaskRecord/UpdateTaskRecord")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTaskRecordRequest::builder)
                .basePath("/20230831")
                .appendPathParam("taskRecords")
                .appendPathParam(request.getTaskRecordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateTaskRecordResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTaskRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementRunbooksAsyncClient(
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
    public FleetAppsManagementRunbooksAsyncClient(
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
    public FleetAppsManagementRunbooksAsyncClient(
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
    public FleetAppsManagementRunbooksAsyncClient(
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
    public FleetAppsManagementRunbooksAsyncClient(
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
    public FleetAppsManagementRunbooksAsyncClient(
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
    public FleetAppsManagementRunbooksAsyncClient(
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
