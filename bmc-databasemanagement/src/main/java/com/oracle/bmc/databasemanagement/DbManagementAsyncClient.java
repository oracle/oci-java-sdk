/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DbManagement service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class DbManagementAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DbManagementAsync {
    /** Service instance for DbManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbmgmt.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbManagementAsyncClient.class);

    DbManagementAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbManagementAsyncClient> {
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
        public DbManagementAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbManagementAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddDataFilesResponse> addDataFiles(
            AddDataFilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddDataFilesRequest, AddDataFilesResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getTablespaceName(), "tablespaceName must not be blank");
        Objects.requireNonNull(request.getAddDataFilesDetails(), "addDataFilesDetails is required");

        return clientCall(request, AddDataFilesResponse::builder)
                .logger(LOG, "addDataFiles")
                .serviceDetails(
                        "DbManagement",
                        "AddDataFiles",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/AddDataFiles")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDataFilesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("tablespaces")
                .appendPathParam(request.getTablespaceName())
                .appendPathParam("actions")
                .appendPathParam("addDataFiles")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.TablespaceAdminStatus.class,
                        AddDataFilesResponse.Builder::tablespaceAdminStatus)
                .handleResponseHeaderString(
                        "opc-request-id", AddDataFilesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddManagedDatabaseToManagedDatabaseGroupResponse>
            addManagedDatabaseToManagedDatabaseGroup(
                    AddManagedDatabaseToManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddManagedDatabaseToManagedDatabaseGroupRequest,
                                    AddManagedDatabaseToManagedDatabaseGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedDatabaseGroupId(), "managedDatabaseGroupId must not be blank");
        Objects.requireNonNull(
                request.getAddManagedDatabaseToManagedDatabaseGroupDetails(),
                "addManagedDatabaseToManagedDatabaseGroupDetails is required");

        return clientCall(request, AddManagedDatabaseToManagedDatabaseGroupResponse::builder)
                .logger(LOG, "addManagedDatabaseToManagedDatabaseGroup")
                .serviceDetails(
                        "DbManagement",
                        "AddManagedDatabaseToManagedDatabaseGroup",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/AddManagedDatabaseToManagedDatabaseGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddManagedDatabaseToManagedDatabaseGroupRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabaseGroups")
                .appendPathParam(request.getManagedDatabaseGroupId())
                .appendPathParam("actions")
                .appendPathParam("addManagedDatabase")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddManagedDatabaseToManagedDatabaseGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddmTasksResponse> addmTasks(
            AddmTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddmTasksRequest, AddmTasksResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(request.getTimeStart(), "timeStart is required");

        Objects.requireNonNull(request.getTimeEnd(), "timeEnd is required");

        return clientCall(request, AddmTasksResponse::builder)
                .logger(LOG, "addmTasks")
                .serviceDetails(
                        "DbManagement",
                        "AddmTasks",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/AddmTasksCollection/AddmTasks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(AddmTasksRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("addmTasks")
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AddmTasksCollection.class,
                        AddmTasksResponse.Builder::addmTasksCollection)
                .handleResponseHeaderString(
                        "opc-request-id", AddmTasksResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", AddmTasksResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseParametersResponse> changeDatabaseParameters(
            ChangeDatabaseParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatabaseParametersDetails(),
                "changeDatabaseParametersDetails is required");

        return clientCall(request, ChangeDatabaseParametersResponse::builder)
                .logger(LOG, "changeDatabaseParameters")
                .serviceDetails(
                        "DbManagement",
                        "ChangeDatabaseParameters",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangeDatabaseParameters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatabaseParametersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeDatabaseParameters")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.UpdateDatabaseParametersResult
                                .class,
                        ChangeDatabaseParametersResponse.Builder::updateDatabaseParametersResult)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDatabaseParametersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDbManagementPrivateEndpointCompartmentResponse>
            changeDbManagementPrivateEndpointCompartment(
                    ChangeDbManagementPrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDbManagementPrivateEndpointCompartmentRequest,
                                    ChangeDbManagementPrivateEndpointCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getDbManagementPrivateEndpointId(),
                "dbManagementPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeDbManagementPrivateEndpointCompartmentDetails(),
                "changeDbManagementPrivateEndpointCompartmentDetails is required");

        return clientCall(request, ChangeDbManagementPrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeDbManagementPrivateEndpointCompartment")
                .serviceDetails(
                        "DbManagement",
                        "ChangeDbManagementPrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/ChangeDbManagementPrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDbManagementPrivateEndpointCompartmentRequest::builder)
                .basePath("/20201101")
                .appendPathParam("dbManagementPrivateEndpoints")
                .appendPathParam(request.getDbManagementPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDbManagementPrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeExternalDbSystemCompartmentResponse>
            changeExternalDbSystemCompartment(
                    ChangeExternalDbSystemCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalDbSystemCompartmentRequest,
                                    ChangeExternalDbSystemCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getExternalDbSystemId(), "externalDbSystemId must not be blank");
        Objects.requireNonNull(
                request.getChangeExternalDbSystemCompartmentDetails(),
                "changeExternalDbSystemCompartmentDetails is required");

        return clientCall(request, ChangeExternalDbSystemCompartmentResponse::builder)
                .logger(LOG, "changeExternalDbSystemCompartment")
                .serviceDetails(
                        "DbManagement",
                        "ChangeExternalDbSystemCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/ChangeExternalDbSystemCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExternalDbSystemCompartmentRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .appendPathParam(request.getExternalDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExternalDbSystemCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExternalDbSystemCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeExternalExadataInfrastructureCompartmentResponse>
            changeExternalExadataInfrastructureCompartment(
                    ChangeExternalExadataInfrastructureCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalExadataInfrastructureCompartmentRequest,
                                    ChangeExternalExadataInfrastructureCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataInfrastructureId(),
                "externalExadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getChangeExternalExadataInfrastructureCompartmentDetails(),
                "changeExternalExadataInfrastructureCompartmentDetails is required");

        return clientCall(request, ChangeExternalExadataInfrastructureCompartmentResponse::builder)
                .logger(LOG, "changeExternalExadataInfrastructureCompartment")
                .serviceDetails(
                        "DbManagement",
                        "ChangeExternalExadataInfrastructureCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/ChangeExternalExadataInfrastructureCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExternalExadataInfrastructureCompartmentRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataInfrastructures")
                .appendPathParam(request.getExternalExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExternalExadataInfrastructureCompartmentResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExternalExadataInfrastructureCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeJobCompartmentResponse> changeJobCompartment(
            ChangeJobCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");
        Objects.requireNonNull(
                request.getChangeJobCompartmentDetails(),
                "changeJobCompartmentDetails is required");

        return clientCall(request, ChangeJobCompartmentResponse::builder)
                .logger(LOG, "changeJobCompartment")
                .serviceDetails(
                        "DbManagement",
                        "ChangeJobCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/ChangeJobCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeJobCompartmentRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeJobCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeManagedDatabaseGroupCompartmentResponse>
            changeManagedDatabaseGroupCompartment(
                    ChangeManagedDatabaseGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedDatabaseGroupCompartmentRequest,
                                    ChangeManagedDatabaseGroupCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedDatabaseGroupId(), "managedDatabaseGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeManagedDatabaseGroupCompartmentDetails(),
                "changeManagedDatabaseGroupCompartmentDetails is required");

        return clientCall(request, ChangeManagedDatabaseGroupCompartmentResponse::builder)
                .logger(LOG, "changeManagedDatabaseGroupCompartment")
                .serviceDetails(
                        "DbManagement",
                        "ChangeManagedDatabaseGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/ChangeManagedDatabaseGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeManagedDatabaseGroupCompartmentRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabaseGroups")
                .appendPathParam(request.getManagedDatabaseGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeManagedDatabaseGroupCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangePlanRetentionResponse> changePlanRetention(
            ChangePlanRetentionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangePlanRetentionRequest, ChangePlanRetentionResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getChangePlanRetentionDetails(), "changePlanRetentionDetails is required");

        return clientCall(request, ChangePlanRetentionResponse::builder)
                .logger(LOG, "changePlanRetention")
                .serviceDetails(
                        "DbManagement",
                        "ChangePlanRetention",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangePlanRetention")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePlanRetentionRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("changePlanRetention")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangePlanRetentionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSpaceBudgetResponse> changeSpaceBudget(
            ChangeSpaceBudgetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeSpaceBudgetRequest, ChangeSpaceBudgetResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeSpaceBudgetDetails(), "changeSpaceBudgetDetails is required");

        return clientCall(request, ChangeSpaceBudgetResponse::builder)
                .logger(LOG, "changeSpaceBudget")
                .serviceDetails(
                        "DbManagement",
                        "ChangeSpaceBudget",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangeSpaceBudget")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSpaceBudgetRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("changeSpaceBudget")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeSpaceBudgetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSqlPlanBaselinesAttributesResponse>
            changeSqlPlanBaselinesAttributes(
                    ChangeSqlPlanBaselinesAttributesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSqlPlanBaselinesAttributesRequest,
                                    ChangeSqlPlanBaselinesAttributesResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeSqlPlanBaselinesAttributesDetails(),
                "changeSqlPlanBaselinesAttributesDetails is required");

        return clientCall(request, ChangeSqlPlanBaselinesAttributesResponse::builder)
                .logger(LOG, "changeSqlPlanBaselinesAttributes")
                .serviceDetails(
                        "DbManagement",
                        "ChangeSqlPlanBaselinesAttributes",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangeSqlPlanBaselinesAttributes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSqlPlanBaselinesAttributesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("changeSqlPlanBaselinesAttributes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSqlPlanBaselinesAttributesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CheckExternalDbSystemConnectorConnectionStatusResponse>
            checkExternalDbSystemConnectorConnectionStatus(
                    CheckExternalDbSystemConnectorConnectionStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalDbSystemConnectorConnectionStatusRequest,
                                    CheckExternalDbSystemConnectorConnectionStatusResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDbSystemConnectorId(),
                "externalDbSystemConnectorId must not be blank");

        return clientCall(request, CheckExternalDbSystemConnectorConnectionStatusResponse::builder)
                .logger(LOG, "checkExternalDbSystemConnectorConnectionStatus")
                .serviceDetails(
                        "DbManagement",
                        "CheckExternalDbSystemConnectorConnectionStatus",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/CheckExternalDbSystemConnectorConnectionStatus")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CheckExternalDbSystemConnectorConnectionStatusRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemConnectors")
                .appendPathParam(request.getExternalDbSystemConnectorId())
                .appendPathParam("actions")
                .appendPathParam("checkConnectionStatus")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector.class,
                        CheckExternalDbSystemConnectorConnectionStatusResponse.Builder
                                ::externalDbSystemConnector)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CheckExternalDbSystemConnectorConnectionStatusResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "content-location",
                        CheckExternalDbSystemConnectorConnectionStatusResponse.Builder
                                ::contentLocation)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CheckExternalExadataStorageConnectorResponse>
            checkExternalExadataStorageConnector(
                    CheckExternalExadataStorageConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalExadataStorageConnectorRequest,
                                    CheckExternalExadataStorageConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataStorageConnectorId(),
                "externalExadataStorageConnectorId must not be blank");

        return clientCall(request, CheckExternalExadataStorageConnectorResponse::builder)
                .logger(LOG, "checkExternalExadataStorageConnector")
                .serviceDetails(
                        "DbManagement",
                        "CheckExternalExadataStorageConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/CheckExternalExadataStorageConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CheckExternalExadataStorageConnectorRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageConnectors")
                .appendPathParam(request.getExternalExadataStorageConnectorId())
                .appendPathParam("actions")
                .appendPathParam("checkStatus")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .ExternalExadataStorageConnectorStatus.class,
                        CheckExternalExadataStorageConnectorResponse.Builder
                                ::externalExadataStorageConnectorStatus)
                .handleResponseHeaderString(
                        "etag", CheckExternalExadataStorageConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CheckExternalExadataStorageConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureAutomaticCaptureFiltersResponse>
            configureAutomaticCaptureFilters(
                    ConfigureAutomaticCaptureFiltersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureAutomaticCaptureFiltersRequest,
                                    ConfigureAutomaticCaptureFiltersResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getConfigureAutomaticCaptureFiltersDetails(),
                "configureAutomaticCaptureFiltersDetails is required");

        return clientCall(request, ConfigureAutomaticCaptureFiltersResponse::builder)
                .logger(LOG, "configureAutomaticCaptureFilters")
                .serviceDetails(
                        "DbManagement",
                        "ConfigureAutomaticCaptureFilters",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ConfigureAutomaticCaptureFilters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureAutomaticCaptureFiltersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("configureAutomaticCaptureFilters")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureAutomaticCaptureFiltersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureAutomaticSpmEvolveAdvisorTaskResponse>
            configureAutomaticSpmEvolveAdvisorTask(
                    ConfigureAutomaticSpmEvolveAdvisorTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureAutomaticSpmEvolveAdvisorTaskRequest,
                                    ConfigureAutomaticSpmEvolveAdvisorTaskResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getConfigureAutomaticSpmEvolveAdvisorTaskDetails(),
                "configureAutomaticSpmEvolveAdvisorTaskDetails is required");

        return clientCall(request, ConfigureAutomaticSpmEvolveAdvisorTaskResponse::builder)
                .logger(LOG, "configureAutomaticSpmEvolveAdvisorTask")
                .serviceDetails(
                        "DbManagement",
                        "ConfigureAutomaticSpmEvolveAdvisorTask",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ConfigureAutomaticSpmEvolveAdvisorTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureAutomaticSpmEvolveAdvisorTaskRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("configureAutomaticSpmEvolveAdvisorTask")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureAutomaticSpmEvolveAdvisorTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDbManagementPrivateEndpointResponse>
            createDbManagementPrivateEndpoint(
                    CreateDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDbManagementPrivateEndpointRequest,
                                    CreateDbManagementPrivateEndpointResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateDbManagementPrivateEndpointDetails(),
                "createDbManagementPrivateEndpointDetails is required");

        return clientCall(request, CreateDbManagementPrivateEndpointResponse::builder)
                .logger(LOG, "createDbManagementPrivateEndpoint")
                .serviceDetails(
                        "DbManagement",
                        "CreateDbManagementPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/CreateDbManagementPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDbManagementPrivateEndpointRequest::builder)
                .basePath("/20201101")
                .appendPathParam("dbManagementPrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.DbManagementPrivateEndpoint.class,
                        CreateDbManagementPrivateEndpointResponse.Builder
                                ::dbManagementPrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", CreateDbManagementPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDbManagementPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDbManagementPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateDbManagementPrivateEndpointResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalDbSystemResponse> createExternalDbSystem(
            CreateExternalDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateExternalDbSystemRequest, CreateExternalDbSystemResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateExternalDbSystemDetails(),
                "createExternalDbSystemDetails is required");

        return clientCall(request, CreateExternalDbSystemResponse::builder)
                .logger(LOG, "createExternalDbSystem")
                .serviceDetails(
                        "DbManagement",
                        "CreateExternalDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/CreateExternalDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalDbSystemRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystem.class,
                        CreateExternalDbSystemResponse.Builder::externalDbSystem)
                .handleResponseHeaderString("etag", CreateExternalDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateExternalDbSystemResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", CreateExternalDbSystemResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateExternalDbSystemResponse.Builder::contentLocation)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalDbSystemConnectorResponse>
            createExternalDbSystemConnector(
                    CreateExternalDbSystemConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalDbSystemConnectorRequest,
                                    CreateExternalDbSystemConnectorResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateExternalDbSystemConnectorDetails(),
                "createExternalDbSystemConnectorDetails is required");

        return clientCall(request, CreateExternalDbSystemConnectorResponse::builder)
                .logger(LOG, "createExternalDbSystemConnector")
                .serviceDetails(
                        "DbManagement",
                        "CreateExternalDbSystemConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/CreateExternalDbSystemConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalDbSystemConnectorRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemConnectors")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector.class,
                        CreateExternalDbSystemConnectorResponse.Builder::externalDbSystemConnector)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalDbSystemConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalDbSystemConnectorResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalDbSystemDiscoveryResponse>
            createExternalDbSystemDiscovery(
                    CreateExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalDbSystemDiscoveryRequest,
                                    CreateExternalDbSystemDiscoveryResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateExternalDbSystemDiscoveryDetails(),
                "createExternalDbSystemDiscoveryDetails is required");

        return clientCall(request, CreateExternalDbSystemDiscoveryResponse::builder)
                .logger(LOG, "createExternalDbSystemDiscovery")
                .serviceDetails(
                        "DbManagement",
                        "CreateExternalDbSystemDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/CreateExternalDbSystemDiscovery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalDbSystemDiscoveryRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemDiscoveries")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery.class,
                        CreateExternalDbSystemDiscoveryResponse.Builder::externalDbSystemDiscovery)
                .handleResponseHeaderString(
                        "etag", CreateExternalDbSystemDiscoveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalDbSystemDiscoveryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalDbSystemDiscoveryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", CreateExternalDbSystemDiscoveryResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateExternalDbSystemDiscoveryResponse.Builder::contentLocation)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalExadataInfrastructureResponse>
            createExternalExadataInfrastructure(
                    CreateExternalExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalExadataInfrastructureRequest,
                                    CreateExternalExadataInfrastructureResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateExternalExadataInfrastructureDetails(),
                "createExternalExadataInfrastructureDetails is required");

        return clientCall(request, CreateExternalExadataInfrastructureResponse::builder)
                .logger(LOG, "createExternalExadataInfrastructure")
                .serviceDetails(
                        "DbManagement",
                        "CreateExternalExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/CreateExternalExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalExadataInfrastructureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataInfrastructures")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataInfrastructure.class,
                        CreateExternalExadataInfrastructureResponse.Builder
                                ::externalExadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalExadataInfrastructureResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalExadataStorageConnectorResponse>
            createExternalExadataStorageConnector(
                    CreateExternalExadataStorageConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalExadataStorageConnectorRequest,
                                    CreateExternalExadataStorageConnectorResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateExternalExadataStorageConnectorDetails(),
                "createExternalExadataStorageConnectorDetails is required");

        return clientCall(request, CreateExternalExadataStorageConnectorResponse::builder)
                .logger(LOG, "createExternalExadataStorageConnector")
                .serviceDetails(
                        "DbManagement",
                        "CreateExternalExadataStorageConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/CreateExternalExadataStorageConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalExadataStorageConnectorRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageConnectors")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataStorageConnector
                                .class,
                        CreateExternalExadataStorageConnectorResponse.Builder
                                ::externalExadataStorageConnector)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalExadataStorageConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalExadataStorageConnectorResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateJobDetails(), "createJobDetails is required");

        return clientCall(request, CreateJobResponse::builder)
                .logger(LOG, "createJob")
                .serviceDetails(
                        "DbManagement",
                        "CreateJob",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/CreateJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJobRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.Job.class,
                        CreateJobResponse.Builder::job)
                .handleResponseHeaderString("location", CreateJobResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateManagedDatabaseGroupResponse>
            createManagedDatabaseGroup(
                    CreateManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateManagedDatabaseGroupRequest,
                                    CreateManagedDatabaseGroupResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateManagedDatabaseGroupDetails(),
                "createManagedDatabaseGroupDetails is required");

        return clientCall(request, CreateManagedDatabaseGroupResponse::builder)
                .logger(LOG, "createManagedDatabaseGroup")
                .serviceDetails(
                        "DbManagement",
                        "CreateManagedDatabaseGroup",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/CreateManagedDatabaseGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateManagedDatabaseGroupRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabaseGroups")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroup.class,
                        CreateManagedDatabaseGroupResponse.Builder::managedDatabaseGroup)
                .handleResponseHeaderString(
                        "location", CreateManagedDatabaseGroupResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateManagedDatabaseGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateManagedDatabaseGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTablespaceResponse> createTablespace(
            CreateTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTablespaceRequest, CreateTablespaceResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getCreateTablespaceDetails(), "createTablespaceDetails is required");

        return clientCall(request, CreateTablespaceResponse::builder)
                .logger(LOG, "createTablespace")
                .serviceDetails(
                        "DbManagement",
                        "CreateTablespace",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/CreateTablespace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTablespaceRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("tablespaces")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.Tablespace.class,
                        CreateTablespaceResponse.Builder::tablespace)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTablespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDbManagementPrivateEndpointResponse>
            deleteDbManagementPrivateEndpoint(
                    DeleteDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDbManagementPrivateEndpointRequest,
                                    DeleteDbManagementPrivateEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getDbManagementPrivateEndpointId(),
                "dbManagementPrivateEndpointId must not be blank");

        return clientCall(request, DeleteDbManagementPrivateEndpointResponse::builder)
                .logger(LOG, "deleteDbManagementPrivateEndpoint")
                .serviceDetails(
                        "DbManagement",
                        "DeleteDbManagementPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/DeleteDbManagementPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDbManagementPrivateEndpointRequest::builder)
                .basePath("/20201101")
                .appendPathParam("dbManagementPrivateEndpoints")
                .appendPathParam(request.getDbManagementPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDbManagementPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDbManagementPrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalDbSystemResponse> deleteExternalDbSystem(
            DeleteExternalDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteExternalDbSystemRequest, DeleteExternalDbSystemResponse>
                    handler) {

        Validate.notBlank(request.getExternalDbSystemId(), "externalDbSystemId must not be blank");

        return clientCall(request, DeleteExternalDbSystemResponse::builder)
                .logger(LOG, "deleteExternalDbSystem")
                .serviceDetails(
                        "DbManagement",
                        "DeleteExternalDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/DeleteExternalDbSystem")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalDbSystemRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .appendPathParam(request.getExternalDbSystemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteExternalDbSystemResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExternalDbSystemResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalDbSystemConnectorResponse>
            deleteExternalDbSystemConnector(
                    DeleteExternalDbSystemConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalDbSystemConnectorRequest,
                                    DeleteExternalDbSystemConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDbSystemConnectorId(),
                "externalDbSystemConnectorId must not be blank");

        return clientCall(request, DeleteExternalDbSystemConnectorResponse::builder)
                .logger(LOG, "deleteExternalDbSystemConnector")
                .serviceDetails(
                        "DbManagement",
                        "DeleteExternalDbSystemConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/DeleteExternalDbSystemConnector")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalDbSystemConnectorRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemConnectors")
                .appendPathParam(request.getExternalDbSystemConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalDbSystemConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalDbSystemDiscoveryResponse>
            deleteExternalDbSystemDiscovery(
                    DeleteExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalDbSystemDiscoveryRequest,
                                    DeleteExternalDbSystemDiscoveryResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDbSystemDiscoveryId(),
                "externalDbSystemDiscoveryId must not be blank");

        return clientCall(request, DeleteExternalDbSystemDiscoveryResponse::builder)
                .logger(LOG, "deleteExternalDbSystemDiscovery")
                .serviceDetails(
                        "DbManagement",
                        "DeleteExternalDbSystemDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/DeleteExternalDbSystemDiscovery")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalDbSystemDiscoveryRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemDiscoveries")
                .appendPathParam(request.getExternalDbSystemDiscoveryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalDbSystemDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalExadataInfrastructureResponse>
            deleteExternalExadataInfrastructure(
                    DeleteExternalExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalExadataInfrastructureRequest,
                                    DeleteExternalExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataInfrastructureId(),
                "externalExadataInfrastructureId must not be blank");

        return clientCall(request, DeleteExternalExadataInfrastructureResponse::builder)
                .logger(LOG, "deleteExternalExadataInfrastructure")
                .serviceDetails(
                        "DbManagement",
                        "DeleteExternalExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/DeleteExternalExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalExadataInfrastructureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataInfrastructures")
                .appendPathParam(request.getExternalExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExternalExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalExadataStorageConnectorResponse>
            deleteExternalExadataStorageConnector(
                    DeleteExternalExadataStorageConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalExadataStorageConnectorRequest,
                                    DeleteExternalExadataStorageConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataStorageConnectorId(),
                "externalExadataStorageConnectorId must not be blank");

        return clientCall(request, DeleteExternalExadataStorageConnectorResponse::builder)
                .logger(LOG, "deleteExternalExadataStorageConnector")
                .serviceDetails(
                        "DbManagement",
                        "DeleteExternalExadataStorageConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/DeleteExternalExadataStorageConnector")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalExadataStorageConnectorRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageConnectors")
                .appendPathParam(request.getExternalExadataStorageConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalExadataStorageConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, DeleteJobResponse::builder)
                .logger(LOG, "deleteJob")
                .serviceDetails(
                        "DbManagement",
                        "DeleteJob",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/DeleteJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJobRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteManagedDatabaseGroupResponse>
            deleteManagedDatabaseGroup(
                    DeleteManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteManagedDatabaseGroupRequest,
                                    DeleteManagedDatabaseGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedDatabaseGroupId(), "managedDatabaseGroupId must not be blank");

        return clientCall(request, DeleteManagedDatabaseGroupResponse::builder)
                .logger(LOG, "deleteManagedDatabaseGroup")
                .serviceDetails(
                        "DbManagement",
                        "DeleteManagedDatabaseGroup",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/DeleteManagedDatabaseGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteManagedDatabaseGroupRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabaseGroups")
                .appendPathParam(request.getManagedDatabaseGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteManagedDatabaseGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePreferredCredentialResponse> deletePreferredCredential(
            DeletePreferredCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePreferredCredentialRequest, DeletePreferredCredentialResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getCredentialName(), "credentialName must not be blank");

        return clientCall(request, DeletePreferredCredentialResponse::builder)
                .logger(LOG, "deletePreferredCredential")
                .serviceDetails(
                        "DbManagement",
                        "DeletePreferredCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/DeletePreferredCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePreferredCredentialRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("preferredCredentials")
                .appendPathParam(request.getCredentialName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePreferredCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableAutomaticInitialPlanCaptureResponse>
            disableAutomaticInitialPlanCapture(
                    DisableAutomaticInitialPlanCaptureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutomaticInitialPlanCaptureRequest,
                                    DisableAutomaticInitialPlanCaptureResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDisableAutomaticInitialPlanCaptureDetails(),
                "disableAutomaticInitialPlanCaptureDetails is required");

        return clientCall(request, DisableAutomaticInitialPlanCaptureResponse::builder)
                .logger(LOG, "disableAutomaticInitialPlanCapture")
                .serviceDetails(
                        "DbManagement",
                        "DisableAutomaticInitialPlanCapture",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableAutomaticInitialPlanCapture")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableAutomaticInitialPlanCaptureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("disableAutomaticInitialPlanCapture")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableAutomaticInitialPlanCaptureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableAutomaticSpmEvolveAdvisorTaskResponse>
            disableAutomaticSpmEvolveAdvisorTask(
                    DisableAutomaticSpmEvolveAdvisorTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutomaticSpmEvolveAdvisorTaskRequest,
                                    DisableAutomaticSpmEvolveAdvisorTaskResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDisableAutomaticSpmEvolveAdvisorTaskDetails(),
                "disableAutomaticSpmEvolveAdvisorTaskDetails is required");

        return clientCall(request, DisableAutomaticSpmEvolveAdvisorTaskResponse::builder)
                .logger(LOG, "disableAutomaticSpmEvolveAdvisorTask")
                .serviceDetails(
                        "DbManagement",
                        "DisableAutomaticSpmEvolveAdvisorTask",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableAutomaticSpmEvolveAdvisorTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableAutomaticSpmEvolveAdvisorTaskRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("disableAutomaticSpmEvolveAdvisorTask")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableAutomaticSpmEvolveAdvisorTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExternalDbSystemDatabaseManagementResponse>
            disableExternalDbSystemDatabaseManagement(
                    DisableExternalDbSystemDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalDbSystemDatabaseManagementRequest,
                                    DisableExternalDbSystemDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(request.getExternalDbSystemId(), "externalDbSystemId must not be blank");

        return clientCall(request, DisableExternalDbSystemDatabaseManagementResponse::builder)
                .logger(LOG, "disableExternalDbSystemDatabaseManagement")
                .serviceDetails(
                        "DbManagement",
                        "DisableExternalDbSystemDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/DisableExternalDbSystemDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalDbSystemDatabaseManagementRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .appendPathParam(request.getExternalDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalDbSystemDatabaseManagementResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalDbSystemDatabaseManagementResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExternalDbSystemStackMonitoringResponse>
            disableExternalDbSystemStackMonitoring(
                    DisableExternalDbSystemStackMonitoringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalDbSystemStackMonitoringRequest,
                                    DisableExternalDbSystemStackMonitoringResponse>
                            handler) {

        Validate.notBlank(request.getExternalDbSystemId(), "externalDbSystemId must not be blank");

        return clientCall(request, DisableExternalDbSystemStackMonitoringResponse::builder)
                .logger(LOG, "disableExternalDbSystemStackMonitoring")
                .serviceDetails(
                        "DbManagement",
                        "DisableExternalDbSystemStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/DisableExternalDbSystemStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalDbSystemStackMonitoringRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .appendPathParam(request.getExternalDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("disableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalDbSystemStackMonitoringResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalDbSystemStackMonitoringResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExternalExadataInfrastructureManagementResponse>
            disableExternalExadataInfrastructureManagement(
                    DisableExternalExadataInfrastructureManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalExadataInfrastructureManagementRequest,
                                    DisableExternalExadataInfrastructureManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataInfrastructureId(),
                "externalExadataInfrastructureId must not be blank");

        return clientCall(request, DisableExternalExadataInfrastructureManagementResponse::builder)
                .logger(LOG, "disableExternalExadataInfrastructureManagement")
                .serviceDetails(
                        "DbManagement",
                        "DisableExternalExadataInfrastructureManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/DisableExternalExadataInfrastructureManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalExadataInfrastructureManagementRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataInfrastructures")
                .appendPathParam(request.getExternalExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalExadataInfrastructureManagementResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalExadataInfrastructureManagementResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
            disableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDisableHighFrequencyAutomaticSpmEvolveAdvisorTaskDetails(),
                "disableHighFrequencyAutomaticSpmEvolveAdvisorTaskDetails is required");

        return clientCall(
                        request, DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse::builder)
                .logger(LOG, "disableHighFrequencyAutomaticSpmEvolveAdvisorTask")
                .serviceDetails(
                        "DbManagement",
                        "DisableHighFrequencyAutomaticSpmEvolveAdvisorTask",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableHighFrequencyAutomaticSpmEvolveAdvisorTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("disableHighFrequencyAutomaticSpmEvolveAdvisorTask")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableSqlPlanBaselinesUsageResponse>
            disableSqlPlanBaselinesUsage(
                    DisableSqlPlanBaselinesUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableSqlPlanBaselinesUsageRequest,
                                    DisableSqlPlanBaselinesUsageResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDisableSqlPlanBaselinesUsageDetails(),
                "disableSqlPlanBaselinesUsageDetails is required");

        return clientCall(request, DisableSqlPlanBaselinesUsageResponse::builder)
                .logger(LOG, "disableSqlPlanBaselinesUsage")
                .serviceDetails(
                        "DbManagement",
                        "DisableSqlPlanBaselinesUsage",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableSqlPlanBaselinesUsage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableSqlPlanBaselinesUsageRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("disableSqlPlanBaselinesUsage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableSqlPlanBaselinesUsageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DiscoverExternalExadataInfrastructureResponse>
            discoverExternalExadataInfrastructure(
                    DiscoverExternalExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DiscoverExternalExadataInfrastructureRequest,
                                    DiscoverExternalExadataInfrastructureResponse>
                            handler) {
        Objects.requireNonNull(
                request.getDiscoverExternalExadataInfrastructureDetails(),
                "discoverExternalExadataInfrastructureDetails is required");

        return clientCall(request, DiscoverExternalExadataInfrastructureResponse::builder)
                .logger(LOG, "discoverExternalExadataInfrastructure")
                .serviceDetails(
                        "DbManagement",
                        "DiscoverExternalExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/DiscoverExternalExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DiscoverExternalExadataInfrastructureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataInfrastructures")
                .appendPathParam("actions")
                .appendPathParam("discoverExadataInfrastructure")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .ExternalExadataInfrastructureDiscovery.class,
                        DiscoverExternalExadataInfrastructureResponse.Builder
                                ::externalExadataInfrastructureDiscovery)
                .handleResponseHeaderString(
                        "etag", DiscoverExternalExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DiscoverExternalExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DropSqlPlanBaselinesResponse> dropSqlPlanBaselines(
            DropSqlPlanBaselinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DropSqlPlanBaselinesRequest, DropSqlPlanBaselinesResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDropSqlPlanBaselinesDetails(),
                "dropSqlPlanBaselinesDetails is required");

        return clientCall(request, DropSqlPlanBaselinesResponse::builder)
                .logger(LOG, "dropSqlPlanBaselines")
                .serviceDetails(
                        "DbManagement",
                        "DropSqlPlanBaselines",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DropSqlPlanBaselines")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DropSqlPlanBaselinesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("dropSqlPlanBaselines")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", DropSqlPlanBaselinesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DropTablespaceResponse> dropTablespace(
            DropTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DropTablespaceRequest, DropTablespaceResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getTablespaceName(), "tablespaceName must not be blank");
        Objects.requireNonNull(
                request.getDropTablespaceDetails(), "dropTablespaceDetails is required");

        return clientCall(request, DropTablespaceResponse::builder)
                .logger(LOG, "dropTablespace")
                .serviceDetails(
                        "DbManagement",
                        "DropTablespace",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/DropTablespace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DropTablespaceRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("tablespaces")
                .appendPathParam(request.getTablespaceName())
                .appendPathParam("actions")
                .appendPathParam("dropTablespace")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.TablespaceAdminStatus.class,
                        DropTablespaceResponse.Builder::tablespaceAdminStatus)
                .handleResponseHeaderString(
                        "opc-request-id", DropTablespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableAutomaticInitialPlanCaptureResponse>
            enableAutomaticInitialPlanCapture(
                    EnableAutomaticInitialPlanCaptureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutomaticInitialPlanCaptureRequest,
                                    EnableAutomaticInitialPlanCaptureResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableAutomaticInitialPlanCaptureDetails(),
                "enableAutomaticInitialPlanCaptureDetails is required");

        return clientCall(request, EnableAutomaticInitialPlanCaptureResponse::builder)
                .logger(LOG, "enableAutomaticInitialPlanCapture")
                .serviceDetails(
                        "DbManagement",
                        "EnableAutomaticInitialPlanCapture",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableAutomaticInitialPlanCapture")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableAutomaticInitialPlanCaptureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("enableAutomaticInitialPlanCapture")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableAutomaticInitialPlanCaptureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableAutomaticSpmEvolveAdvisorTaskResponse>
            enableAutomaticSpmEvolveAdvisorTask(
                    EnableAutomaticSpmEvolveAdvisorTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutomaticSpmEvolveAdvisorTaskRequest,
                                    EnableAutomaticSpmEvolveAdvisorTaskResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableAutomaticSpmEvolveAdvisorTaskDetails(),
                "enableAutomaticSpmEvolveAdvisorTaskDetails is required");

        return clientCall(request, EnableAutomaticSpmEvolveAdvisorTaskResponse::builder)
                .logger(LOG, "enableAutomaticSpmEvolveAdvisorTask")
                .serviceDetails(
                        "DbManagement",
                        "EnableAutomaticSpmEvolveAdvisorTask",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableAutomaticSpmEvolveAdvisorTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableAutomaticSpmEvolveAdvisorTaskRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("enableAutomaticSpmEvolveAdvisorTask")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableAutomaticSpmEvolveAdvisorTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalDbSystemDatabaseManagementResponse>
            enableExternalDbSystemDatabaseManagement(
                    EnableExternalDbSystemDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalDbSystemDatabaseManagementRequest,
                                    EnableExternalDbSystemDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(request.getExternalDbSystemId(), "externalDbSystemId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalDbSystemDatabaseManagementDetails(),
                "enableExternalDbSystemDatabaseManagementDetails is required");

        return clientCall(request, EnableExternalDbSystemDatabaseManagementResponse::builder)
                .logger(LOG, "enableExternalDbSystemDatabaseManagement")
                .serviceDetails(
                        "DbManagement",
                        "EnableExternalDbSystemDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/EnableExternalDbSystemDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalDbSystemDatabaseManagementRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .appendPathParam(request.getExternalDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalDbSystemDatabaseManagementResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalDbSystemDatabaseManagementResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalDbSystemStackMonitoringResponse>
            enableExternalDbSystemStackMonitoring(
                    EnableExternalDbSystemStackMonitoringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalDbSystemStackMonitoringRequest,
                                    EnableExternalDbSystemStackMonitoringResponse>
                            handler) {

        Validate.notBlank(request.getExternalDbSystemId(), "externalDbSystemId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalDbSystemStackMonitoringDetails(),
                "enableExternalDbSystemStackMonitoringDetails is required");

        return clientCall(request, EnableExternalDbSystemStackMonitoringResponse::builder)
                .logger(LOG, "enableExternalDbSystemStackMonitoring")
                .serviceDetails(
                        "DbManagement",
                        "EnableExternalDbSystemStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/EnableExternalDbSystemStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalDbSystemStackMonitoringRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .appendPathParam(request.getExternalDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("enableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalDbSystemStackMonitoringResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalDbSystemStackMonitoringResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalExadataInfrastructureManagementResponse>
            enableExternalExadataInfrastructureManagement(
                    EnableExternalExadataInfrastructureManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalExadataInfrastructureManagementRequest,
                                    EnableExternalExadataInfrastructureManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataInfrastructureId(),
                "externalExadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalExadataInfrastructureManagementDetails(),
                "enableExternalExadataInfrastructureManagementDetails is required");

        return clientCall(request, EnableExternalExadataInfrastructureManagementResponse::builder)
                .logger(LOG, "enableExternalExadataInfrastructureManagement")
                .serviceDetails(
                        "DbManagement",
                        "EnableExternalExadataInfrastructureManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/EnableExternalExadataInfrastructureManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalExadataInfrastructureManagementRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataInfrastructures")
                .appendPathParam(request.getExternalExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalExadataInfrastructureManagementResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalExadataInfrastructureManagementResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
            enableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableHighFrequencyAutomaticSpmEvolveAdvisorTaskDetails(),
                "enableHighFrequencyAutomaticSpmEvolveAdvisorTaskDetails is required");

        return clientCall(
                        request, EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse::builder)
                .logger(LOG, "enableHighFrequencyAutomaticSpmEvolveAdvisorTask")
                .serviceDetails(
                        "DbManagement",
                        "EnableHighFrequencyAutomaticSpmEvolveAdvisorTask",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableHighFrequencyAutomaticSpmEvolveAdvisorTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("enableHighFrequencyAutomaticSpmEvolveAdvisorTask")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableSqlPlanBaselinesUsageResponse>
            enableSqlPlanBaselinesUsage(
                    EnableSqlPlanBaselinesUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableSqlPlanBaselinesUsageRequest,
                                    EnableSqlPlanBaselinesUsageResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableSqlPlanBaselinesUsageDetails(),
                "enableSqlPlanBaselinesUsageDetails is required");

        return clientCall(request, EnableSqlPlanBaselinesUsageResponse::builder)
                .logger(LOG, "enableSqlPlanBaselinesUsage")
                .serviceDetails(
                        "DbManagement",
                        "EnableSqlPlanBaselinesUsage",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableSqlPlanBaselinesUsage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableSqlPlanBaselinesUsageRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("enableSqlPlanBaselinesUsage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", EnableSqlPlanBaselinesUsageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateAwrSnapshotResponse> generateAwrSnapshot(
            GenerateAwrSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateAwrSnapshotRequest, GenerateAwrSnapshotResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, GenerateAwrSnapshotResponse::builder)
                .logger(LOG, "generateAwrSnapshot")
                .serviceDetails(
                        "DbManagement",
                        "GenerateAwrSnapshot",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/SnapshotDetails/GenerateAwrSnapshot")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateAwrSnapshotRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("generateAwrSnapshot")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SnapshotDetails.class,
                        GenerateAwrSnapshotResponse.Builder::snapshotDetails)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateAwrSnapshotResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAwrDbReportResponse> getAwrDbReport(
            GetAwrDbReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDbReportRequest, GetAwrDbReportResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");

        return clientCall(request, GetAwrDbReportResponse::builder)
                .logger(LOG, "getAwrDbReport")
                .serviceDetails(
                        "DbManagement",
                        "GetAwrDbReport",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetAwrDbReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAwrDbReportRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbReport")
                .appendListQueryParam(
                        "instNums",
                        request.getInstNums(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated)
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendEnumQueryParam("reportType", request.getReportType())
                .appendQueryParam("containerId", request.getContainerId())
                .appendEnumQueryParam("reportFormat", request.getReportFormat())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbReport.class,
                        GetAwrDbReportResponse.Builder::awrDbReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetAwrDbReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAwrDbSqlReportResponse> getAwrDbSqlReport(
            GetAwrDbSqlReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDbSqlReportRequest, GetAwrDbSqlReportResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");
        Objects.requireNonNull(request.getSqlId(), "sqlId is required");

        return clientCall(request, GetAwrDbSqlReportResponse::builder)
                .logger(LOG, "getAwrDbSqlReport")
                .serviceDetails(
                        "DbManagement",
                        "GetAwrDbSqlReport",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetAwrDbSqlReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAwrDbSqlReportRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbSqlReport")
                .appendQueryParam("instNum", request.getInstNum())
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("sqlId", request.getSqlId())
                .appendEnumQueryParam("reportFormat", request.getReportFormat())
                .appendQueryParam("containerId", request.getContainerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbSqlReport.class,
                        GetAwrDbSqlReportResponse.Builder::awrDbSqlReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetAwrDbSqlReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetClusterCacheMetricResponse> getClusterCacheMetric(
            GetClusterCacheMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetClusterCacheMetricRequest, GetClusterCacheMetricResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, GetClusterCacheMetricResponse::builder)
                .logger(LOG, "getClusterCacheMetric")
                .serviceDetails(
                        "DbManagement",
                        "GetClusterCacheMetric",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ClusterCacheMetric/GetClusterCacheMetric")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetClusterCacheMetricRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("clusterCacheMetrics")
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ClusterCacheMetric.class,
                        GetClusterCacheMetricResponse.Builder::clusterCacheMetric)
                .handleResponseHeaderString(
                        "opc-request-id", GetClusterCacheMetricResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseFleetHealthMetricsResponse>
            getDatabaseFleetHealthMetrics(
                    GetDatabaseFleetHealthMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetHealthMetricsRequest,
                                    GetDatabaseFleetHealthMetricsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompareBaselineTime(), "compareBaselineTime is required");

        Objects.requireNonNull(request.getCompareTargetTime(), "compareTargetTime is required");

        return clientCall(request, GetDatabaseFleetHealthMetricsResponse::builder)
                .logger(LOG, "getDatabaseFleetHealthMetrics")
                .serviceDetails(
                        "DbManagement",
                        "GetDatabaseFleetHealthMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseFleetHealthMetrics/GetDatabaseFleetHealthMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseFleetHealthMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("fleetMetrics")
                .appendQueryParam("managedDatabaseGroupId", request.getManagedDatabaseGroupId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compareBaselineTime", request.getCompareBaselineTime())
                .appendQueryParam("compareTargetTime", request.getCompareTargetTime())
                .appendEnumQueryParam("compareType", request.getCompareType())
                .appendQueryParam("filterByMetricNames", request.getFilterByMetricNames())
                .appendQueryParam("filterByDatabaseType", request.getFilterByDatabaseType())
                .appendQueryParam("filterByDatabaseSubType", request.getFilterByDatabaseSubType())
                .appendQueryParam(
                        "filterByDatabaseDeploymentType",
                        request.getFilterByDatabaseDeploymentType())
                .appendQueryParam("filterByDatabaseVersion", request.getFilterByDatabaseVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.DatabaseFleetHealthMetrics.class,
                        GetDatabaseFleetHealthMetricsResponse.Builder::databaseFleetHealthMetrics)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseFleetHealthMetricsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseHomeMetricsResponse> getDatabaseHomeMetrics(
            GetDatabaseHomeMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>
                    handler) {
        Objects.requireNonNull(request.getManagedDatabaseId(), "managedDatabaseId is required");

        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, GetDatabaseHomeMetricsResponse::builder)
                .logger(LOG, "getDatabaseHomeMetrics")
                .serviceDetails(
                        "DbManagement",
                        "GetDatabaseHomeMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseHomeMetrics/GetDatabaseHomeMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseHomeMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("databaseHomeMetrics")
                .appendQueryParam("managedDatabaseId", request.getManagedDatabaseId())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.DatabaseHomeMetrics.class,
                        GetDatabaseHomeMetricsResponse.Builder::databaseHomeMetrics)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseHomeMetricsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbManagementPrivateEndpointResponse>
            getDbManagementPrivateEndpoint(
                    GetDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDbManagementPrivateEndpointRequest,
                                    GetDbManagementPrivateEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getDbManagementPrivateEndpointId(),
                "dbManagementPrivateEndpointId must not be blank");

        return clientCall(request, GetDbManagementPrivateEndpointResponse::builder)
                .logger(LOG, "getDbManagementPrivateEndpoint")
                .serviceDetails(
                        "DbManagement",
                        "GetDbManagementPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/GetDbManagementPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbManagementPrivateEndpointRequest::builder)
                .basePath("/20201101")
                .appendPathParam("dbManagementPrivateEndpoints")
                .appendPathParam(request.getDbManagementPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.DbManagementPrivateEndpoint.class,
                        GetDbManagementPrivateEndpointResponse.Builder::dbManagementPrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", GetDbManagementPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDbManagementPrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalAsmResponse> getExternalAsm(
            GetExternalAsmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalAsmRequest, GetExternalAsmResponse>
                    handler) {

        Validate.notBlank(request.getExternalAsmId(), "externalAsmId must not be blank");

        return clientCall(request, GetExternalAsmResponse::builder)
                .logger(LOG, "getExternalAsm")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalAsm",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/GetExternalAsm")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalAsmRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalAsms")
                .appendPathParam(request.getExternalAsmId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsm.class,
                        GetExternalAsmResponse.Builder::externalAsm)
                .handleResponseHeaderString("etag", GetExternalAsmResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalAsmResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalAsmConfigurationResponse>
            getExternalAsmConfiguration(
                    GetExternalAsmConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalAsmConfigurationRequest,
                                    GetExternalAsmConfigurationResponse>
                            handler) {

        Validate.notBlank(request.getExternalAsmId(), "externalAsmId must not be blank");

        return clientCall(request, GetExternalAsmConfigurationResponse::builder)
                .logger(LOG, "getExternalAsmConfiguration")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalAsmConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/GetExternalAsmConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalAsmConfigurationRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalAsms")
                .appendPathParam(request.getExternalAsmId())
                .appendPathParam("configuration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmConfiguration.class,
                        GetExternalAsmConfigurationResponse.Builder::externalAsmConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalAsmConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalAsmInstanceResponse> getExternalAsmInstance(
            GetExternalAsmInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getExternalAsmInstanceId(), "externalAsmInstanceId must not be blank");

        return clientCall(request, GetExternalAsmInstanceResponse::builder)
                .logger(LOG, "getExternalAsmInstance")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalAsmInstance",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsmInstance/GetExternalAsmInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalAsmInstanceRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalAsmInstances")
                .appendPathParam(request.getExternalAsmInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmInstance.class,
                        GetExternalAsmInstanceResponse.Builder::externalAsmInstance)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalAsmInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalClusterResponse> getExternalCluster(
            GetExternalClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalClusterRequest, GetExternalClusterResponse>
                    handler) {

        Validate.notBlank(request.getExternalClusterId(), "externalClusterId must not be blank");

        return clientCall(request, GetExternalClusterResponse::builder)
                .logger(LOG, "getExternalCluster")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/GetExternalCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalClusterRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalClusters")
                .appendPathParam(request.getExternalClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalCluster.class,
                        GetExternalClusterResponse.Builder::externalCluster)
                .handleResponseHeaderString("etag", GetExternalClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalClusterInstanceResponse>
            getExternalClusterInstance(
                    GetExternalClusterInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalClusterInstanceRequest,
                                    GetExternalClusterInstanceResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalClusterInstanceId(),
                "externalClusterInstanceId must not be blank");

        return clientCall(request, GetExternalClusterInstanceResponse::builder)
                .logger(LOG, "getExternalClusterInstance")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalClusterInstance",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalClusterInstance/GetExternalClusterInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalClusterInstanceRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalClusterInstances")
                .appendPathParam(request.getExternalClusterInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalClusterInstance.class,
                        GetExternalClusterInstanceResponse.Builder::externalClusterInstance)
                .handleResponseHeaderString(
                        "etag", GetExternalClusterInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalClusterInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalDbHomeResponse> getExternalDbHome(
            GetExternalDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbHomeRequest, GetExternalDbHomeResponse>
                    handler) {

        Validate.notBlank(request.getExternalDbHomeId(), "externalDbHomeId must not be blank");

        return clientCall(request, GetExternalDbHomeResponse::builder)
                .logger(LOG, "getExternalDbHome")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalDbHome",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbHome/GetExternalDbHome")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalDbHomeRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbHomes")
                .appendPathParam(request.getExternalDbHomeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbHome.class,
                        GetExternalDbHomeResponse.Builder::externalDbHome)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalDbHomeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalDbNodeResponse> getExternalDbNode(
            GetExternalDbNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbNodeRequest, GetExternalDbNodeResponse>
                    handler) {

        Validate.notBlank(request.getExternalDbNodeId(), "externalDbNodeId must not be blank");

        return clientCall(request, GetExternalDbNodeResponse::builder)
                .logger(LOG, "getExternalDbNode")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalDbNode",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/GetExternalDbNode")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalDbNodeRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbNodes")
                .appendPathParam(request.getExternalDbNodeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbNode.class,
                        GetExternalDbNodeResponse.Builder::externalDbNode)
                .handleResponseHeaderString("etag", GetExternalDbNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalDbNodeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalDbSystemResponse> getExternalDbSystem(
            GetExternalDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbSystemRequest, GetExternalDbSystemResponse>
                    handler) {

        Validate.notBlank(request.getExternalDbSystemId(), "externalDbSystemId must not be blank");

        return clientCall(request, GetExternalDbSystemResponse::builder)
                .logger(LOG, "getExternalDbSystem")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/GetExternalDbSystem")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalDbSystemRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .appendPathParam(request.getExternalDbSystemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystem.class,
                        GetExternalDbSystemResponse.Builder::externalDbSystem)
                .handleResponseHeaderString("etag", GetExternalDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalDbSystemConnectorResponse>
            getExternalDbSystemConnector(
                    GetExternalDbSystemConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalDbSystemConnectorRequest,
                                    GetExternalDbSystemConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDbSystemConnectorId(),
                "externalDbSystemConnectorId must not be blank");

        return clientCall(request, GetExternalDbSystemConnectorResponse::builder)
                .logger(LOG, "getExternalDbSystemConnector")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalDbSystemConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/GetExternalDbSystemConnector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalDbSystemConnectorRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemConnectors")
                .appendPathParam(request.getExternalDbSystemConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector.class,
                        GetExternalDbSystemConnectorResponse.Builder::externalDbSystemConnector)
                .handleResponseHeaderString(
                        "etag", GetExternalDbSystemConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalDbSystemConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalDbSystemDiscoveryResponse>
            getExternalDbSystemDiscovery(
                    GetExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalDbSystemDiscoveryRequest,
                                    GetExternalDbSystemDiscoveryResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDbSystemDiscoveryId(),
                "externalDbSystemDiscoveryId must not be blank");

        return clientCall(request, GetExternalDbSystemDiscoveryResponse::builder)
                .logger(LOG, "getExternalDbSystemDiscovery")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalDbSystemDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/GetExternalDbSystemDiscovery")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalDbSystemDiscoveryRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemDiscoveries")
                .appendPathParam(request.getExternalDbSystemDiscoveryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery.class,
                        GetExternalDbSystemDiscoveryResponse.Builder::externalDbSystemDiscovery)
                .handleResponseHeaderString(
                        "etag", GetExternalDbSystemDiscoveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalDbSystemDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalExadataInfrastructureResponse>
            getExternalExadataInfrastructure(
                    GetExternalExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataInfrastructureRequest,
                                    GetExternalExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataInfrastructureId(),
                "externalExadataInfrastructureId must not be blank");

        return clientCall(request, GetExternalExadataInfrastructureResponse::builder)
                .logger(LOG, "getExternalExadataInfrastructure")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/GetExternalExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalExadataInfrastructureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataInfrastructures")
                .appendPathParam(request.getExternalExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataInfrastructure.class,
                        GetExternalExadataInfrastructureResponse.Builder
                                ::externalExadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetExternalExadataInfrastructureResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalExadataStorageConnectorResponse>
            getExternalExadataStorageConnector(
                    GetExternalExadataStorageConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataStorageConnectorRequest,
                                    GetExternalExadataStorageConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataStorageConnectorId(),
                "externalExadataStorageConnectorId must not be blank");

        return clientCall(request, GetExternalExadataStorageConnectorResponse::builder)
                .logger(LOG, "getExternalExadataStorageConnector")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalExadataStorageConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/GetExternalExadataStorageConnector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalExadataStorageConnectorRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageConnectors")
                .appendPathParam(request.getExternalExadataStorageConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataStorageConnector
                                .class,
                        GetExternalExadataStorageConnectorResponse.Builder
                                ::externalExadataStorageConnector)
                .handleResponseHeaderString(
                        "etag", GetExternalExadataStorageConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalExadataStorageConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalExadataStorageGridResponse>
            getExternalExadataStorageGrid(
                    GetExternalExadataStorageGridRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataStorageGridRequest,
                                    GetExternalExadataStorageGridResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataStorageGridId(),
                "externalExadataStorageGridId must not be blank");

        return clientCall(request, GetExternalExadataStorageGridResponse::builder)
                .logger(LOG, "getExternalExadataStorageGrid")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalExadataStorageGrid",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageGrid/GetExternalExadataStorageGrid")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalExadataStorageGridRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageGrids")
                .appendPathParam(request.getExternalExadataStorageGridId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataStorageGrid.class,
                        GetExternalExadataStorageGridResponse.Builder::externalExadataStorageGrid)
                .handleResponseHeaderString(
                        "etag", GetExternalExadataStorageGridResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalExadataStorageGridResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalExadataStorageServerResponse>
            getExternalExadataStorageServer(
                    GetExternalExadataStorageServerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataStorageServerRequest,
                                    GetExternalExadataStorageServerResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataStorageServerId(),
                "externalExadataStorageServerId must not be blank");

        return clientCall(request, GetExternalExadataStorageServerResponse::builder)
                .logger(LOG, "getExternalExadataStorageServer")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalExadataStorageServer",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetExternalExadataStorageServer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalExadataStorageServerRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageServers")
                .appendPathParam(request.getExternalExadataStorageServerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataStorageServer.class,
                        GetExternalExadataStorageServerResponse.Builder
                                ::externalExadataStorageServer)
                .handleResponseHeaderString(
                        "etag", GetExternalExadataStorageServerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalExadataStorageServerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalListenerResponse> getExternalListener(
            GetExternalListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalListenerRequest, GetExternalListenerResponse>
                    handler) {

        Validate.notBlank(request.getExternalListenerId(), "externalListenerId must not be blank");

        return clientCall(request, GetExternalListenerResponse::builder)
                .logger(LOG, "getExternalListener")
                .serviceDetails(
                        "DbManagement",
                        "GetExternalListener",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/GetExternalListener")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalListenerRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalListeners")
                .appendPathParam(request.getExternalListenerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalListener.class,
                        GetExternalListenerResponse.Builder::externalListener)
                .handleResponseHeaderString("etag", GetExternalListenerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalListenerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIormPlanResponse> getIormPlan(
            GetIormPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetIormPlanRequest, GetIormPlanResponse>
                    handler) {

        Validate.notBlank(
                request.getExternalExadataStorageServerId(),
                "externalExadataStorageServerId must not be blank");

        return clientCall(request, GetIormPlanResponse::builder)
                .logger(LOG, "getIormPlan")
                .serviceDetails(
                        "DbManagement",
                        "GetIormPlan",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetIormPlan")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIormPlanRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageServers")
                .appendPathParam(request.getExternalExadataStorageServerId())
                .appendPathParam("iormPlan")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.IormPlan.class,
                        GetIormPlanResponse.Builder::iormPlan)
                .handleResponseHeaderString(
                        "opc-request-id", GetIormPlanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobResponse::builder)
                .logger(LOG, "getJob")
                .serviceDetails(
                        "DbManagement",
                        "GetJob",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/GetJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.Job.class,
                        GetJobResponse.Builder::job)
                .handleResponseHeaderString("location", GetJobResponse.Builder::location)
                .handleResponseHeaderString("opc-request-id", GetJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobExecutionResponse> getJobExecution(
            GetJobExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobExecutionRequest, GetJobExecutionResponse>
                    handler) {

        Validate.notBlank(request.getJobExecutionId(), "jobExecutionId must not be blank");

        return clientCall(request, GetJobExecutionResponse::builder)
                .logger(LOG, "getJobExecution")
                .serviceDetails(
                        "DbManagement",
                        "GetJobExecution",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecution/GetJobExecution")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobExecutionRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobExecutions")
                .appendPathParam(request.getJobExecutionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.JobExecution.class,
                        GetJobExecutionResponse.Builder::jobExecution)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobRunResponse> getJobRun(
            GetJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse>
                    handler) {

        Validate.notBlank(request.getJobRunId(), "jobRunId must not be blank");

        return clientCall(request, GetJobRunResponse::builder)
                .logger(LOG, "getJobRun")
                .serviceDetails(
                        "DbManagement",
                        "GetJobRun",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobRun/GetJobRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobRunRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobRuns")
                .appendPathParam(request.getJobRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.JobRun.class,
                        GetJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagedDatabaseResponse> getManagedDatabase(
            GetManagedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedDatabaseRequest, GetManagedDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, GetManagedDatabaseResponse::builder)
                .logger(LOG, "getManagedDatabase")
                .serviceDetails(
                        "DbManagement",
                        "GetManagedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetManagedDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedDatabaseRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ManagedDatabase.class,
                        GetManagedDatabaseResponse.Builder::managedDatabase)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagedDatabaseGroupResponse> getManagedDatabaseGroup(
            GetManagedDatabaseGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getManagedDatabaseGroupId(), "managedDatabaseGroupId must not be blank");

        return clientCall(request, GetManagedDatabaseGroupResponse::builder)
                .logger(LOG, "getManagedDatabaseGroup")
                .serviceDetails(
                        "DbManagement",
                        "GetManagedDatabaseGroup",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/GetManagedDatabaseGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedDatabaseGroupRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabaseGroups")
                .appendPathParam(request.getManagedDatabaseGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroup.class,
                        GetManagedDatabaseGroupResponse.Builder::managedDatabaseGroup)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedDatabaseGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetManagedDatabaseGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOpenAlertHistoryResponse> getOpenAlertHistory(
            GetOpenAlertHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOpenAlertHistoryRequest, GetOpenAlertHistoryResponse>
                    handler) {

        Validate.notBlank(
                request.getExternalExadataStorageServerId(),
                "externalExadataStorageServerId must not be blank");

        return clientCall(request, GetOpenAlertHistoryResponse::builder)
                .logger(LOG, "getOpenAlertHistory")
                .serviceDetails(
                        "DbManagement",
                        "GetOpenAlertHistory",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetOpenAlertHistory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOpenAlertHistoryRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageServers")
                .appendPathParam(request.getExternalExadataStorageServerId())
                .appendPathParam("openAlertHistory")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.OpenAlertHistory.class,
                        GetOpenAlertHistoryResponse.Builder::openAlertHistory)
                .handleResponseHeaderString(
                        "opc-request-id", GetOpenAlertHistoryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOptimizerStatisticsAdvisorExecutionResponse>
            getOptimizerStatisticsAdvisorExecution(
                    GetOptimizerStatisticsAdvisorExecutionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOptimizerStatisticsAdvisorExecutionRequest,
                                    GetOptimizerStatisticsAdvisorExecutionResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getExecutionName(), "executionName must not be blank");
        Objects.requireNonNull(request.getTaskName(), "taskName is required");

        return clientCall(request, GetOptimizerStatisticsAdvisorExecutionResponse::builder)
                .logger(LOG, "getOptimizerStatisticsAdvisorExecution")
                .serviceDetails(
                        "DbManagement",
                        "GetOptimizerStatisticsAdvisorExecution",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetOptimizerStatisticsAdvisorExecution")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOptimizerStatisticsAdvisorExecutionRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("optimizerStatisticsAdvisorExecutions")
                .appendPathParam(request.getExecutionName())
                .appendQueryParam("taskName", request.getTaskName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.OptimizerStatisticsAdvisorExecution
                                .class,
                        GetOptimizerStatisticsAdvisorExecutionResponse.Builder
                                ::optimizerStatisticsAdvisorExecution)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOptimizerStatisticsAdvisorExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOptimizerStatisticsAdvisorExecutionScriptResponse>
            getOptimizerStatisticsAdvisorExecutionScript(
                    GetOptimizerStatisticsAdvisorExecutionScriptRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOptimizerStatisticsAdvisorExecutionScriptRequest,
                                    GetOptimizerStatisticsAdvisorExecutionScriptResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getExecutionName(), "executionName must not be blank");
        Objects.requireNonNull(request.getTaskName(), "taskName is required");

        return clientCall(request, GetOptimizerStatisticsAdvisorExecutionScriptResponse::builder)
                .logger(LOG, "getOptimizerStatisticsAdvisorExecutionScript")
                .serviceDetails(
                        "DbManagement",
                        "GetOptimizerStatisticsAdvisorExecutionScript",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetOptimizerStatisticsAdvisorExecutionScript")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOptimizerStatisticsAdvisorExecutionScriptRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("optimizerStatisticsAdvisorExecutions")
                .appendPathParam(request.getExecutionName())
                .appendPathParam("script")
                .appendQueryParam("taskName", request.getTaskName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .OptimizerStatisticsAdvisorExecutionScript.class,
                        GetOptimizerStatisticsAdvisorExecutionScriptResponse.Builder
                                ::optimizerStatisticsAdvisorExecutionScript)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOptimizerStatisticsAdvisorExecutionScriptResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOptimizerStatisticsCollectionOperationResponse>
            getOptimizerStatisticsCollectionOperation(
                    GetOptimizerStatisticsCollectionOperationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOptimizerStatisticsCollectionOperationRequest,
                                    GetOptimizerStatisticsCollectionOperationResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, GetOptimizerStatisticsCollectionOperationResponse::builder)
                .logger(LOG, "getOptimizerStatisticsCollectionOperation")
                .serviceDetails(
                        "DbManagement",
                        "GetOptimizerStatisticsCollectionOperation",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetOptimizerStatisticsCollectionOperation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOptimizerStatisticsCollectionOperationRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("optimizerStatisticsCollectionOperations")
                .appendPathParam(request.getOptimizerStatisticsCollectionOperationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .OptimizerStatisticsCollectionOperation.class,
                        GetOptimizerStatisticsCollectionOperationResponse.Builder
                                ::optimizerStatisticsCollectionOperation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOptimizerStatisticsCollectionOperationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPdbMetricsResponse> getPdbMetrics(
            GetPdbMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPdbMetricsRequest, GetPdbMetricsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, GetPdbMetricsResponse::builder)
                .logger(LOG, "getPdbMetrics")
                .serviceDetails(
                        "DbManagement",
                        "GetPdbMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PdbMetrics/GetPdbMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPdbMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("pdbMetrics")
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("compareType", request.getCompareType())
                .appendQueryParam("filterByMetricNames", request.getFilterByMetricNames())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.PdbMetrics.class,
                        GetPdbMetricsResponse.Builder::pdbMetrics)
                .handleResponseHeaderString(
                        "opc-request-id", GetPdbMetricsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPreferredCredentialResponse> getPreferredCredential(
            GetPreferredCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPreferredCredentialRequest, GetPreferredCredentialResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getCredentialName(), "credentialName must not be blank");

        return clientCall(request, GetPreferredCredentialResponse::builder)
                .logger(LOG, "getPreferredCredential")
                .serviceDetails(
                        "DbManagement",
                        "GetPreferredCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/GetPreferredCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPreferredCredentialRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("preferredCredentials")
                .appendPathParam(request.getCredentialName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.PreferredCredential.class,
                        GetPreferredCredentialResponse.Builder::preferredCredential)
                .handleResponseHeaderString(
                        "opc-request-id", GetPreferredCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetPreferredCredentialResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSqlPlanBaselineResponse> getSqlPlanBaseline(
            GetSqlPlanBaselineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSqlPlanBaselineRequest, GetSqlPlanBaselineResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getPlanName(), "planName must not be blank");

        return clientCall(request, GetSqlPlanBaselineResponse::builder)
                .logger(LOG, "getSqlPlanBaseline")
                .serviceDetails(
                        "DbManagement",
                        "GetSqlPlanBaseline",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetSqlPlanBaseline")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSqlPlanBaselineRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam(request.getPlanName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaseline.class,
                        GetSqlPlanBaselineResponse.Builder::sqlPlanBaseline)
                .handleResponseHeaderString(
                        "opc-request-id", GetSqlPlanBaselineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSqlPlanBaselineConfigurationResponse>
            getSqlPlanBaselineConfiguration(
                    GetSqlPlanBaselineConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSqlPlanBaselineConfigurationRequest,
                                    GetSqlPlanBaselineConfigurationResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, GetSqlPlanBaselineConfigurationResponse::builder)
                .logger(LOG, "getSqlPlanBaselineConfiguration")
                .serviceDetails(
                        "DbManagement",
                        "GetSqlPlanBaselineConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetSqlPlanBaselineConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSqlPlanBaselineConfigurationRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselineConfiguration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineConfiguration.class,
                        GetSqlPlanBaselineConfigurationResponse.Builder
                                ::sqlPlanBaselineConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetSqlPlanBaselineConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTablespaceResponse> getTablespace(
            GetTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTablespaceRequest, GetTablespaceResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getTablespaceName(), "tablespaceName must not be blank");

        return clientCall(request, GetTablespaceResponse::builder)
                .logger(LOG, "getTablespace")
                .serviceDetails(
                        "DbManagement",
                        "GetTablespace",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/GetTablespace")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTablespaceRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("tablespaces")
                .appendPathParam(request.getTablespaceName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.Tablespace.class,
                        GetTablespaceResponse.Builder::tablespace)
                .handleResponseHeaderString(
                        "opc-request-id", GetTablespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTopSqlCpuActivityResponse> getTopSqlCpuActivity(
            GetTopSqlCpuActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTopSqlCpuActivityRequest, GetTopSqlCpuActivityResponse>
                    handler) {

        Validate.notBlank(
                request.getExternalExadataStorageServerId(),
                "externalExadataStorageServerId must not be blank");

        return clientCall(request, GetTopSqlCpuActivityResponse::builder)
                .logger(LOG, "getTopSqlCpuActivity")
                .serviceDetails(
                        "DbManagement",
                        "GetTopSqlCpuActivity",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetTopSqlCpuActivity")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTopSqlCpuActivityRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageServers")
                .appendPathParam(request.getExternalExadataStorageServerId())
                .appendPathParam("topSqlCpuActivity")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.TopSqlCpuActivity.class,
                        GetTopSqlCpuActivityResponse.Builder::topSqlCpuActivity)
                .handleResponseHeaderString(
                        "opc-request-id", GetTopSqlCpuActivityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getUserName(), "userName must not be blank");

        return clientCall(request, GetUserResponse::builder)
                .logger(LOG, "getUser")
                .serviceDetails(
                        "DbManagement",
                        "GetUser",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetUser")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("users")
                .appendPathParam(request.getUserName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.User.class,
                        GetUserResponse.Builder::user)
                .handleResponseHeaderString("opc-request-id", GetUserResponse.Builder::opcRequestId)
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
                        "DbManagement",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20201101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ImplementOptimizerStatisticsAdvisorRecommendationsResponse>
            implementOptimizerStatisticsAdvisorRecommendations(
                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest,
                                    ImplementOptimizerStatisticsAdvisorRecommendationsResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getExecutionName(), "executionName must not be blank");
        Objects.requireNonNull(
                request.getImplementOptimizerStatisticsAdvisorRecommendationsDetails(),
                "implementOptimizerStatisticsAdvisorRecommendationsDetails is required");

        return clientCall(
                        request,
                        ImplementOptimizerStatisticsAdvisorRecommendationsResponse::builder)
                .logger(LOG, "implementOptimizerStatisticsAdvisorRecommendations")
                .serviceDetails(
                        "DbManagement",
                        "ImplementOptimizerStatisticsAdvisorRecommendations",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ImplementOptimizerStatisticsAdvisorRecommendations")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImplementOptimizerStatisticsAdvisorRecommendationsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("optimizerStatisticsAdvisorExecutions")
                .appendPathParam(request.getExecutionName())
                .appendPathParam("actions")
                .appendPathParam("implementRecommendations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.Job.class,
                        ImplementOptimizerStatisticsAdvisorRecommendationsResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ImplementOptimizerStatisticsAdvisorRecommendationsResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAsmPropertiesResponse> listAsmProperties(
            ListAsmPropertiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAsmPropertiesRequest, ListAsmPropertiesResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListAsmPropertiesResponse::builder)
                .logger(LOG, "listAsmProperties")
                .serviceDetails(
                        "DbManagement",
                        "ListAsmProperties",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAsmProperties")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAsmPropertiesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("asmProperties")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AsmPropertyCollection.class,
                        ListAsmPropertiesResponse.Builder::asmPropertyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAsmPropertiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAsmPropertiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedDatabasesResponse> listAssociatedDatabases(
            ListAssociatedDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>
                    handler) {

        Validate.notBlank(
                request.getDbManagementPrivateEndpointId(),
                "dbManagementPrivateEndpointId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAssociatedDatabasesResponse::builder)
                .logger(LOG, "listAssociatedDatabases")
                .serviceDetails(
                        "DbManagement",
                        "ListAssociatedDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/AssociatedDatabaseSummary/ListAssociatedDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAssociatedDatabasesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("dbManagementPrivateEndpoints")
                .appendPathParam(request.getDbManagementPrivateEndpointId())
                .appendPathParam("associatedDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AssociatedDatabaseCollection.class,
                        ListAssociatedDatabasesResponse.Builder::associatedDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssociatedDatabasesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssociatedDatabasesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAwrDbSnapshotsResponse> listAwrDbSnapshots(
            ListAwrDbSnapshotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAwrDbSnapshotsRequest, ListAwrDbSnapshotsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");

        return clientCall(request, ListAwrDbSnapshotsResponse::builder)
                .logger(LOG, "listAwrDbSnapshots")
                .serviceDetails(
                        "DbManagement",
                        "ListAwrDbSnapshots",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAwrDbSnapshots")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAwrDbSnapshotsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbSnapshots")
                .appendQueryParam("instNum", request.getInstNum())
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("containerId", request.getContainerId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbSnapshotCollection.class,
                        ListAwrDbSnapshotsResponse.Builder::awrDbSnapshotCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAwrDbSnapshotsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAwrDbSnapshotsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAwrDbsResponse> listAwrDbs(
            ListAwrDbsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAwrDbsRequest, ListAwrDbsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListAwrDbsResponse::builder)
                .logger(LOG, "listAwrDbs")
                .serviceDetails(
                        "DbManagement",
                        "ListAwrDbs",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAwrDbs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAwrDbsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbCollection.class,
                        ListAwrDbsResponse.Builder::awrDbCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAwrDbsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAwrDbsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConsumerGroupPrivilegesResponse>
            listConsumerGroupPrivileges(
                    ListConsumerGroupPrivilegesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListConsumerGroupPrivilegesRequest,
                                    ListConsumerGroupPrivilegesResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getUserName(), "userName must not be blank");

        return clientCall(request, ListConsumerGroupPrivilegesResponse::builder)
                .logger(LOG, "listConsumerGroupPrivileges")
                .serviceDetails(
                        "DbManagement",
                        "ListConsumerGroupPrivileges",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListConsumerGroupPrivileges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConsumerGroupPrivilegesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("users")
                .appendPathParam(request.getUserName())
                .appendPathParam("consumerGroupPrivileges")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ConsumerGroupPrivilegeCollection
                                .class,
                        ListConsumerGroupPrivilegesResponse.Builder
                                ::consumerGroupPrivilegeCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListConsumerGroupPrivilegesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListConsumerGroupPrivilegesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCursorCacheStatementsResponse> listCursorCacheStatements(
            ListCursorCacheStatementsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCursorCacheStatementsRequest, ListCursorCacheStatementsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListCursorCacheStatementsResponse::builder)
                .logger(LOG, "listCursorCacheStatements")
                .serviceDetails(
                        "DbManagement",
                        "ListCursorCacheStatements",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListCursorCacheStatements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCursorCacheStatementsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("cursorCacheStatements")
                .appendQueryParam("sqlText", request.getSqlText())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.CursorCacheStatementCollection
                                .class,
                        ListCursorCacheStatementsResponse.Builder::cursorCacheStatementCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCursorCacheStatementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCursorCacheStatementsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataAccessContainersResponse> listDataAccessContainers(
            ListDataAccessContainersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataAccessContainersRequest, ListDataAccessContainersResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getUserName(), "userName must not be blank");

        return clientCall(request, ListDataAccessContainersResponse::builder)
                .logger(LOG, "listDataAccessContainers")
                .serviceDetails(
                        "DbManagement",
                        "ListDataAccessContainers",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListDataAccessContainers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataAccessContainersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("users")
                .appendPathParam(request.getUserName())
                .appendPathParam("dataAccessContainers")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.DataAccessContainerCollection.class,
                        ListDataAccessContainersResponse.Builder::dataAccessContainerCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataAccessContainersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataAccessContainersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseParametersResponse> listDatabaseParameters(
            ListDatabaseParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseParametersRequest, ListDatabaseParametersResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListDatabaseParametersResponse::builder)
                .logger(LOG, "listDatabaseParameters")
                .serviceDetails(
                        "DbManagement",
                        "ListDatabaseParameters",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListDatabaseParameters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseParametersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("databaseParameters")
                .appendEnumQueryParam("source", request.getSource())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("isAllowedValuesIncluded", request.getIsAllowedValuesIncluded())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.DatabaseParametersCollection.class,
                        ListDatabaseParametersResponse.Builder::databaseParametersCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabaseParametersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbManagementPrivateEndpointsResponse>
            listDbManagementPrivateEndpoints(
                    ListDbManagementPrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbManagementPrivateEndpointsRequest,
                                    ListDbManagementPrivateEndpointsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbManagementPrivateEndpointsResponse::builder)
                .logger(LOG, "listDbManagementPrivateEndpoints")
                .serviceDetails(
                        "DbManagement",
                        "ListDbManagementPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/ListDbManagementPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbManagementPrivateEndpointsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("dbManagementPrivateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("isCluster", request.getIsCluster())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .DbManagementPrivateEndpointCollection.class,
                        ListDbManagementPrivateEndpointsResponse.Builder
                                ::dbManagementPrivateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbManagementPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDbManagementPrivateEndpointsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalAsmDiskGroupsResponse> listExternalAsmDiskGroups(
            ListExternalAsmDiskGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmDiskGroupsRequest, ListExternalAsmDiskGroupsResponse>
                    handler) {

        Validate.notBlank(request.getExternalAsmId(), "externalAsmId must not be blank");

        return clientCall(request, ListExternalAsmDiskGroupsResponse::builder)
                .logger(LOG, "listExternalAsmDiskGroups")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalAsmDiskGroups",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/ListExternalAsmDiskGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalAsmDiskGroupsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalAsms")
                .appendPathParam(request.getExternalAsmId())
                .appendPathParam("diskGroups")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmDiskGroupCollection
                                .class,
                        ListExternalAsmDiskGroupsResponse.Builder::externalAsmDiskGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalAsmDiskGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalAsmDiskGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalAsmInstancesResponse> listExternalAsmInstances(
            ListExternalAsmInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmInstancesRequest, ListExternalAsmInstancesResponse>
                    handler) {

        return clientCall(request, ListExternalAsmInstancesResponse::builder)
                .logger(LOG, "listExternalAsmInstances")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalAsmInstances",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsmInstance/ListExternalAsmInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalAsmInstancesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalAsmInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalAsmId", request.getExternalAsmId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmInstanceCollection.class,
                        ListExternalAsmInstancesResponse.Builder::externalAsmInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalAsmInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalAsmInstancesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalAsmUsersResponse> listExternalAsmUsers(
            ListExternalAsmUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmUsersRequest, ListExternalAsmUsersResponse>
                    handler) {

        Validate.notBlank(request.getExternalAsmId(), "externalAsmId must not be blank");

        return clientCall(request, ListExternalAsmUsersResponse::builder)
                .logger(LOG, "listExternalAsmUsers")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalAsmUsers",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/ListExternalAsmUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalAsmUsersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalAsms")
                .appendPathParam(request.getExternalAsmId())
                .appendPathParam("users")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmUserCollection.class,
                        ListExternalAsmUsersResponse.Builder::externalAsmUserCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalAsmUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalAsmUsersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalAsmsResponse> listExternalAsms(
            ListExternalAsmsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmsRequest, ListExternalAsmsResponse>
                    handler) {

        return clientCall(request, ListExternalAsmsResponse::builder)
                .logger(LOG, "listExternalAsms")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalAsms",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/ListExternalAsms")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalAsmsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalAsms")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalDbSystemId", request.getExternalDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmCollection.class,
                        ListExternalAsmsResponse.Builder::externalAsmCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalAsmsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalAsmsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalClusterInstancesResponse>
            listExternalClusterInstances(
                    ListExternalClusterInstancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalClusterInstancesRequest,
                                    ListExternalClusterInstancesResponse>
                            handler) {

        return clientCall(request, ListExternalClusterInstancesResponse::builder)
                .logger(LOG, "listExternalClusterInstances")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalClusterInstances",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalClusterInstance/ListExternalClusterInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalClusterInstancesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalClusterInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalClusterId", request.getExternalClusterId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalClusterInstanceCollection
                                .class,
                        ListExternalClusterInstancesResponse.Builder
                                ::externalClusterInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalClusterInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalClusterInstancesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalClustersResponse> listExternalClusters(
            ListExternalClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalClustersRequest, ListExternalClustersResponse>
                    handler) {

        return clientCall(request, ListExternalClustersResponse::builder)
                .logger(LOG, "listExternalClusters")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalClusters",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/ListExternalClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalClustersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalDbSystemId", request.getExternalDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalClusterCollection.class,
                        ListExternalClustersResponse.Builder::externalClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalClustersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalDatabasesResponse> listExternalDatabases(
            ListExternalDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDatabasesRequest, ListExternalDatabasesResponse>
                    handler) {

        return clientCall(request, ListExternalDatabasesResponse::builder)
                .logger(LOG, "listExternalDatabases")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDatabaseCollection/ListExternalDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalDatabasesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalDbSystemId", request.getExternalDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDatabaseCollection.class,
                        ListExternalDatabasesResponse.Builder::externalDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalDbHomesResponse> listExternalDbHomes(
            ListExternalDbHomesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDbHomesRequest, ListExternalDbHomesResponse>
                    handler) {

        return clientCall(request, ListExternalDbHomesResponse::builder)
                .logger(LOG, "listExternalDbHomes")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalDbHomes",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbHome/ListExternalDbHomes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalDbHomesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbHomes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalDbSystemId", request.getExternalDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbHomeCollection.class,
                        ListExternalDbHomesResponse.Builder::externalDbHomeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalDbHomesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalDbHomesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalDbNodesResponse> listExternalDbNodes(
            ListExternalDbNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDbNodesRequest, ListExternalDbNodesResponse>
                    handler) {

        return clientCall(request, ListExternalDbNodesResponse::builder)
                .logger(LOG, "listExternalDbNodes")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalDbNodes",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/ListExternalDbNodes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalDbNodesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbNodes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalDbSystemId", request.getExternalDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbNodeCollection.class,
                        ListExternalDbNodesResponse.Builder::externalDbNodeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalDbNodesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalDbNodesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalDbSystemConnectorsResponse>
            listExternalDbSystemConnectors(
                    ListExternalDbSystemConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalDbSystemConnectorsRequest,
                                    ListExternalDbSystemConnectorsResponse>
                            handler) {

        return clientCall(request, ListExternalDbSystemConnectorsResponse::builder)
                .logger(LOG, "listExternalDbSystemConnectors")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalDbSystemConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/ListExternalDbSystemConnectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalDbSystemConnectorsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemConnectors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalDbSystemId", request.getExternalDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnectorCollection
                                .class,
                        ListExternalDbSystemConnectorsResponse.Builder
                                ::externalDbSystemConnectorCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalDbSystemConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalDbSystemConnectorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalDbSystemDiscoveriesResponse>
            listExternalDbSystemDiscoveries(
                    ListExternalDbSystemDiscoveriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalDbSystemDiscoveriesRequest,
                                    ListExternalDbSystemDiscoveriesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalDbSystemDiscoveriesResponse::builder)
                .logger(LOG, "listExternalDbSystemDiscoveries")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalDbSystemDiscoveries",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/ListExternalDbSystemDiscoveries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalDbSystemDiscoveriesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemDiscoveries")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscoveryCollection
                                .class,
                        ListExternalDbSystemDiscoveriesResponse.Builder
                                ::externalDbSystemDiscoveryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalDbSystemDiscoveriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalDbSystemDiscoveriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalDbSystemsResponse> listExternalDbSystems(
            ListExternalDbSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDbSystemsRequest, ListExternalDbSystemsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalDbSystemsResponse::builder)
                .logger(LOG, "listExternalDbSystems")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalDbSystems",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/ListExternalDbSystems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalDbSystemsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemCollection.class,
                        ListExternalDbSystemsResponse.Builder::externalDbSystemCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalDbSystemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalDbSystemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalExadataInfrastructuresResponse>
            listExternalExadataInfrastructures(
                    ListExternalExadataInfrastructuresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalExadataInfrastructuresRequest,
                                    ListExternalExadataInfrastructuresResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalExadataInfrastructuresResponse::builder)
                .logger(LOG, "listExternalExadataInfrastructures")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalExadataInfrastructures",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/ListExternalExadataInfrastructures")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalExadataInfrastructuresRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataInfrastructures")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .ExternalExadataInfrastructureCollection.class,
                        ListExternalExadataInfrastructuresResponse.Builder
                                ::externalExadataInfrastructureCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalExadataInfrastructuresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalExadataInfrastructuresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalExadataStorageConnectorsResponse>
            listExternalExadataStorageConnectors(
                    ListExternalExadataStorageConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalExadataStorageConnectorsRequest,
                                    ListExternalExadataStorageConnectorsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getExternalExadataInfrastructureId(),
                "externalExadataInfrastructureId is required");

        return clientCall(request, ListExternalExadataStorageConnectorsResponse::builder)
                .logger(LOG, "listExternalExadataStorageConnectors")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalExadataStorageConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/ListExternalExadataStorageConnectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalExadataStorageConnectorsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageConnectors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "externalExadataInfrastructureId",
                        request.getExternalExadataInfrastructureId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .ExternalExadataStorageConnectorCollection.class,
                        ListExternalExadataStorageConnectorsResponse.Builder
                                ::externalExadataStorageConnectorCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalExadataStorageConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalExadataStorageConnectorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalExadataStorageServersResponse>
            listExternalExadataStorageServers(
                    ListExternalExadataStorageServersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalExadataStorageServersRequest,
                                    ListExternalExadataStorageServersResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getExternalExadataInfrastructureId(),
                "externalExadataInfrastructureId is required");

        return clientCall(request, ListExternalExadataStorageServersResponse::builder)
                .logger(LOG, "listExternalExadataStorageServers")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalExadataStorageServers",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/ListExternalExadataStorageServers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalExadataStorageServersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageServers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "externalExadataInfrastructureId",
                        request.getExternalExadataInfrastructureId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .ExternalExadataStorageServerCollection.class,
                        ListExternalExadataStorageServersResponse.Builder
                                ::externalExadataStorageServerCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalExadataStorageServersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalExadataStorageServersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalListenerServicesResponse>
            listExternalListenerServices(
                    ListExternalListenerServicesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalListenerServicesRequest,
                                    ListExternalListenerServicesResponse>
                            handler) {

        Validate.notBlank(request.getExternalListenerId(), "externalListenerId must not be blank");
        Objects.requireNonNull(request.getManagedDatabaseId(), "managedDatabaseId is required");

        return clientCall(request, ListExternalListenerServicesResponse::builder)
                .logger(LOG, "listExternalListenerServices")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalListenerServices",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/ListExternalListenerServices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalListenerServicesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalListeners")
                .appendPathParam(request.getExternalListenerId())
                .appendPathParam("services")
                .appendQueryParam("managedDatabaseId", request.getManagedDatabaseId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalListenerServiceCollection
                                .class,
                        ListExternalListenerServicesResponse.Builder
                                ::externalListenerServiceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalListenerServicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalListenerServicesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalListenersResponse> listExternalListeners(
            ListExternalListenersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalListenersRequest, ListExternalListenersResponse>
                    handler) {

        return clientCall(request, ListExternalListenersResponse::builder)
                .logger(LOG, "listExternalListeners")
                .serviceDetails(
                        "DbManagement",
                        "ListExternalListeners",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/ListExternalListeners")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalListenersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalListeners")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalDbSystemId", request.getExternalDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalListenerCollection.class,
                        ListExternalListenersResponse.Builder::externalListenerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalListenersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalListenersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobExecutionsResponse> listJobExecutions(
            ListJobExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJobExecutionsRequest, ListJobExecutionsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJobExecutionsResponse::builder)
                .logger(LOG, "listJobExecutions")
                .serviceDetails(
                        "DbManagement",
                        "ListJobExecutions",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecution/ListJobExecutions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobExecutionsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobExecutions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("jobId", request.getJobId())
                .appendQueryParam("managedDatabaseId", request.getManagedDatabaseId())
                .appendQueryParam("managedDatabaseGroupId", request.getManagedDatabaseGroupId())
                .appendQueryParam("status", request.getStatus())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("jobRunId", request.getJobRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.JobExecutionCollection.class,
                        ListJobExecutionsResponse.Builder::jobExecutionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobExecutionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobExecutionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResponse> listJobRuns(
            ListJobRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJobRunsResponse::builder)
                .logger(LOG, "listJobRuns")
                .serviceDetails(
                        "DbManagement",
                        "ListJobRuns",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobRun/ListJobRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobRunsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobRuns")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("jobId", request.getJobId())
                .appendQueryParam("managedDatabaseId", request.getManagedDatabaseId())
                .appendQueryParam("managedDatabaseGroupId", request.getManagedDatabaseGroupId())
                .appendQueryParam("runStatus", request.getRunStatus())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.JobRunCollection.class,
                        ListJobRunsResponse.Builder::jobRunCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobRunsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJobsResponse::builder)
                .logger(LOG, "listJobs")
                .serviceDetails(
                        "DbManagement",
                        "ListJobs",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/ListJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("managedDatabaseGroupId", request.getManagedDatabaseGroupId())
                .appendQueryParam("managedDatabaseId", request.getManagedDatabaseId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.JobCollection.class,
                        ListJobsResponse.Builder::jobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedDatabaseGroupsResponse> listManagedDatabaseGroups(
            ListManagedDatabaseGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagedDatabaseGroupsResponse::builder)
                .logger(LOG, "listManagedDatabaseGroups")
                .serviceDetails(
                        "DbManagement",
                        "ListManagedDatabaseGroups",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/ListManagedDatabaseGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedDatabaseGroupsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabaseGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupCollection
                                .class,
                        ListManagedDatabaseGroupsResponse.Builder::managedDatabaseGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedDatabaseGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedDatabaseGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedDatabasesResponse> listManagedDatabases(
            ListManagedDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedDatabasesRequest, ListManagedDatabasesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagedDatabasesResponse::builder)
                .logger(LOG, "listManagedDatabases")
                .serviceDetails(
                        "DbManagement",
                        "ListManagedDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListManagedDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedDatabasesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("managementOption", request.getManagementOption())
                .appendEnumQueryParam("deploymentType", request.getDeploymentType())
                .appendQueryParam(
                        "externalExadataInfrastructureId",
                        request.getExternalExadataInfrastructureId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ManagedDatabaseCollection.class,
                        ListManagedDatabasesResponse.Builder::managedDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListObjectPrivilegesResponse> listObjectPrivileges(
            ListObjectPrivilegesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getUserName(), "userName must not be blank");

        return clientCall(request, ListObjectPrivilegesResponse::builder)
                .logger(LOG, "listObjectPrivileges")
                .serviceDetails(
                        "DbManagement",
                        "ListObjectPrivileges",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListObjectPrivileges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListObjectPrivilegesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("users")
                .appendPathParam(request.getUserName())
                .appendPathParam("objectPrivileges")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ObjectPrivilegeCollection.class,
                        ListObjectPrivilegesResponse.Builder::objectPrivilegeCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListObjectPrivilegesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListObjectPrivilegesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOptimizerStatisticsAdvisorExecutionsResponse>
            listOptimizerStatisticsAdvisorExecutions(
                    ListOptimizerStatisticsAdvisorExecutionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOptimizerStatisticsAdvisorExecutionsRequest,
                                    ListOptimizerStatisticsAdvisorExecutionsResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListOptimizerStatisticsAdvisorExecutionsResponse::builder)
                .logger(LOG, "listOptimizerStatisticsAdvisorExecutions")
                .serviceDetails(
                        "DbManagement",
                        "ListOptimizerStatisticsAdvisorExecutions",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListOptimizerStatisticsAdvisorExecutions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOptimizerStatisticsAdvisorExecutionsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("optimizerStatisticsAdvisorExecutions")
                .appendQueryParam(
                        "startTimeGreaterThanOrEqualTo", request.getStartTimeGreaterThanOrEqualTo())
                .appendQueryParam("endTimeLessThanOrEqualTo", request.getEndTimeLessThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .OptimizerStatisticsAdvisorExecutionsCollection.class,
                        ListOptimizerStatisticsAdvisorExecutionsResponse.Builder
                                ::optimizerStatisticsAdvisorExecutionsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOptimizerStatisticsAdvisorExecutionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOptimizerStatisticsCollectionAggregationsResponse>
            listOptimizerStatisticsCollectionAggregations(
                    ListOptimizerStatisticsCollectionAggregationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOptimizerStatisticsCollectionAggregationsRequest,
                                    ListOptimizerStatisticsCollectionAggregationsResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(request.getGroupType(), "groupType is required");

        return clientCall(request, ListOptimizerStatisticsCollectionAggregationsResponse::builder)
                .logger(LOG, "listOptimizerStatisticsCollectionAggregations")
                .serviceDetails(
                        "DbManagement",
                        "ListOptimizerStatisticsCollectionAggregations",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListOptimizerStatisticsCollectionAggregations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOptimizerStatisticsCollectionAggregationsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("optimizerStatisticsCollectionAggregations")
                .appendQueryParam(
                        "startTimeGreaterThanOrEqualTo", request.getStartTimeGreaterThanOrEqualTo())
                .appendQueryParam("endTimeLessThanOrEqualTo", request.getEndTimeLessThanOrEqualTo())
                .appendEnumQueryParam("taskType", request.getTaskType())
                .appendEnumQueryParam("groupType", request.getGroupType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .OptimizerStatisticsCollectionAggregationsCollection.class,
                        ListOptimizerStatisticsCollectionAggregationsResponse.Builder
                                ::optimizerStatisticsCollectionAggregationsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOptimizerStatisticsCollectionAggregationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOptimizerStatisticsCollectionAggregationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOptimizerStatisticsCollectionOperationsResponse>
            listOptimizerStatisticsCollectionOperations(
                    ListOptimizerStatisticsCollectionOperationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOptimizerStatisticsCollectionOperationsRequest,
                                    ListOptimizerStatisticsCollectionOperationsResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListOptimizerStatisticsCollectionOperationsResponse::builder)
                .logger(LOG, "listOptimizerStatisticsCollectionOperations")
                .serviceDetails(
                        "DbManagement",
                        "ListOptimizerStatisticsCollectionOperations",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListOptimizerStatisticsCollectionOperations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOptimizerStatisticsCollectionOperationsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("optimizerStatisticsCollectionOperations")
                .appendQueryParam(
                        "startTimeGreaterThanOrEqualTo", request.getStartTimeGreaterThanOrEqualTo())
                .appendQueryParam("endTimeLessThanOrEqualTo", request.getEndTimeLessThanOrEqualTo())
                .appendEnumQueryParam("taskType", request.getTaskType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("filterBy", request.getFilterBy())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .OptimizerStatisticsCollectionOperationsCollection.class,
                        ListOptimizerStatisticsCollectionOperationsResponse.Builder
                                ::optimizerStatisticsCollectionOperationsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOptimizerStatisticsCollectionOperationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOptimizerStatisticsCollectionOperationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPreferredCredentialsResponse> listPreferredCredentials(
            ListPreferredCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPreferredCredentialsRequest, ListPreferredCredentialsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListPreferredCredentialsResponse::builder)
                .logger(LOG, "listPreferredCredentials")
                .serviceDetails(
                        "DbManagement",
                        "ListPreferredCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/ListPreferredCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPreferredCredentialsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("preferredCredentials")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.PreferredCredentialCollection.class,
                        ListPreferredCredentialsResponse.Builder::preferredCredentialCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPreferredCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPreferredCredentialsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProxiedForUsersResponse> listProxiedForUsers(
            ListProxiedForUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProxiedForUsersRequest, ListProxiedForUsersResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getUserName(), "userName must not be blank");

        return clientCall(request, ListProxiedForUsersResponse::builder)
                .logger(LOG, "listProxiedForUsers")
                .serviceDetails(
                        "DbManagement",
                        "ListProxiedForUsers",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListProxiedForUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProxiedForUsersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("users")
                .appendPathParam(request.getUserName())
                .appendPathParam("proxiedForUsers")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ProxiedForUserCollection.class,
                        ListProxiedForUsersResponse.Builder::proxiedForUserCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListProxiedForUsersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListProxiedForUsersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProxyUsersResponse> listProxyUsers(
            ListProxyUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProxyUsersRequest, ListProxyUsersResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getUserName(), "userName must not be blank");

        return clientCall(request, ListProxyUsersResponse::builder)
                .logger(LOG, "listProxyUsers")
                .serviceDetails(
                        "DbManagement",
                        "ListProxyUsers",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListProxyUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProxyUsersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("users")
                .appendPathParam(request.getUserName())
                .appendPathParam("proxyUsers")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ProxyUserCollection.class,
                        ListProxyUsersResponse.Builder::proxyUserCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListProxyUsersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListProxyUsersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRolesResponse> listRoles(
            ListRolesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getUserName(), "userName must not be blank");

        return clientCall(request, ListRolesResponse::builder)
                .logger(LOG, "listRoles")
                .serviceDetails(
                        "DbManagement",
                        "ListRoles",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListRoles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRolesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("users")
                .appendPathParam(request.getUserName())
                .appendPathParam("roles")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.RoleCollection.class,
                        ListRolesResponse.Builder::roleCollection)
                .handleResponseHeaderString("opc-next-page", ListRolesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListRolesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlPlanBaselineJobsResponse> listSqlPlanBaselineJobs(
            ListSqlPlanBaselineJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlPlanBaselineJobsRequest, ListSqlPlanBaselineJobsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListSqlPlanBaselineJobsResponse::builder)
                .logger(LOG, "listSqlPlanBaselineJobs")
                .serviceDetails(
                        "DbManagement",
                        "ListSqlPlanBaselineJobs",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSqlPlanBaselineJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlPlanBaselineJobsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselineJobs")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineJobCollection.class,
                        ListSqlPlanBaselineJobsResponse.Builder::sqlPlanBaselineJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlPlanBaselineJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlPlanBaselineJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlPlanBaselinesResponse> listSqlPlanBaselines(
            ListSqlPlanBaselinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlPlanBaselinesRequest, ListSqlPlanBaselinesResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListSqlPlanBaselinesResponse::builder)
                .logger(LOG, "listSqlPlanBaselines")
                .serviceDetails(
                        "DbManagement",
                        "ListSqlPlanBaselines",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSqlPlanBaselines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlPlanBaselinesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendQueryParam("planName", request.getPlanName())
                .appendQueryParam("sqlHandle", request.getSqlHandle())
                .appendQueryParam("sqlText", request.getSqlText())
                .appendQueryParam("isEnabled", request.getIsEnabled())
                .appendQueryParam("isAccepted", request.getIsAccepted())
                .appendQueryParam("isReproduced", request.getIsReproduced())
                .appendQueryParam("isFixed", request.getIsFixed())
                .appendQueryParam("isAdaptive", request.getIsAdaptive())
                .appendEnumQueryParam("origin", request.getOrigin())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineCollection.class,
                        ListSqlPlanBaselinesResponse.Builder::sqlPlanBaselineCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlPlanBaselinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlPlanBaselinesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSystemPrivilegesResponse> listSystemPrivileges(
            ListSystemPrivilegesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getUserName(), "userName must not be blank");

        return clientCall(request, ListSystemPrivilegesResponse::builder)
                .logger(LOG, "listSystemPrivileges")
                .serviceDetails(
                        "DbManagement",
                        "ListSystemPrivileges",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSystemPrivileges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSystemPrivilegesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("users")
                .appendPathParam(request.getUserName())
                .appendPathParam("systemPrivileges")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SystemPrivilegeCollection.class,
                        ListSystemPrivilegesResponse.Builder::systemPrivilegeCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSystemPrivilegesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSystemPrivilegesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTableStatisticsResponse> listTableStatistics(
            ListTableStatisticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTableStatisticsRequest, ListTableStatisticsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListTableStatisticsResponse::builder)
                .logger(LOG, "listTableStatistics")
                .serviceDetails(
                        "DbManagement",
                        "ListTableStatistics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListTableStatistics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTableStatisticsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("tableStatistics")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.TableStatisticsCollection.class,
                        ListTableStatisticsResponse.Builder::tableStatisticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTableStatisticsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTablespacesResponse> listTablespaces(
            ListTablespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTablespacesRequest, ListTablespacesResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListTablespacesResponse::builder)
                .logger(LOG, "listTablespaces")
                .serviceDetails(
                        "DbManagement",
                        "ListTablespaces",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/ListTablespaces")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTablespacesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("tablespaces")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.TablespaceCollection.class,
                        ListTablespacesResponse.Builder::tablespaceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTablespacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTablespacesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListUsersResponse::builder)
                .logger(LOG, "listUsers")
                .serviceDetails(
                        "DbManagement",
                        "ListUsers",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUsersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("users")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.UserCollection.class,
                        ListUsersResponse.Builder::userCollection)
                .handleResponseHeaderString("opc-next-page", ListUsersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListUsersResponse.Builder::opcRequestId)
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
                        "DbManagement",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.WorkRequestErrorCollection.class,
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
                        "DbManagement",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.WorkRequestLogEntryCollection.class,
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
                        "DbManagement",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<LoadSqlPlanBaselinesFromAwrResponse>
            loadSqlPlanBaselinesFromAwr(
                    LoadSqlPlanBaselinesFromAwrRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    LoadSqlPlanBaselinesFromAwrRequest,
                                    LoadSqlPlanBaselinesFromAwrResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getLoadSqlPlanBaselinesFromAwrDetails(),
                "loadSqlPlanBaselinesFromAwrDetails is required");

        return clientCall(request, LoadSqlPlanBaselinesFromAwrResponse::builder)
                .logger(LOG, "loadSqlPlanBaselinesFromAwr")
                .serviceDetails(
                        "DbManagement",
                        "LoadSqlPlanBaselinesFromAwr",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/LoadSqlPlanBaselinesFromAwr")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LoadSqlPlanBaselinesFromAwrRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("loadSqlPlanBaselinesFromAwr")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineJob.class,
                        LoadSqlPlanBaselinesFromAwrResponse.Builder::sqlPlanBaselineJob)
                .handleResponseHeaderString(
                        "opc-request-id", LoadSqlPlanBaselinesFromAwrResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<LoadSqlPlanBaselinesFromCursorCacheResponse>
            loadSqlPlanBaselinesFromCursorCache(
                    LoadSqlPlanBaselinesFromCursorCacheRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    LoadSqlPlanBaselinesFromCursorCacheRequest,
                                    LoadSqlPlanBaselinesFromCursorCacheResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getLoadSqlPlanBaselinesFromCursorCacheDetails(),
                "loadSqlPlanBaselinesFromCursorCacheDetails is required");

        return clientCall(request, LoadSqlPlanBaselinesFromCursorCacheResponse::builder)
                .logger(LOG, "loadSqlPlanBaselinesFromCursorCache")
                .serviceDetails(
                        "DbManagement",
                        "LoadSqlPlanBaselinesFromCursorCache",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/LoadSqlPlanBaselinesFromCursorCache")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LoadSqlPlanBaselinesFromCursorCacheRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselines")
                .appendPathParam("actions")
                .appendPathParam("loadSqlPlanBaselinesFromCursorCache")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineJob.class,
                        LoadSqlPlanBaselinesFromCursorCacheResponse.Builder::sqlPlanBaselineJob)
                .handleResponseHeaderString(
                        "opc-request-id",
                        LoadSqlPlanBaselinesFromCursorCacheResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchExternalDbSystemDiscoveryResponse>
            patchExternalDbSystemDiscovery(
                    PatchExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchExternalDbSystemDiscoveryRequest,
                                    PatchExternalDbSystemDiscoveryResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDbSystemDiscoveryId(),
                "externalDbSystemDiscoveryId must not be blank");
        Objects.requireNonNull(
                request.getPatchExternalDbSystemDiscoveryDetails(),
                "patchExternalDbSystemDiscoveryDetails is required");

        return clientCall(request, PatchExternalDbSystemDiscoveryResponse::builder)
                .logger(LOG, "patchExternalDbSystemDiscovery")
                .serviceDetails(
                        "DbManagement",
                        "PatchExternalDbSystemDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/PatchExternalDbSystemDiscovery")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchExternalDbSystemDiscoveryRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemDiscoveries")
                .appendPathParam(request.getExternalDbSystemDiscoveryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery.class,
                        PatchExternalDbSystemDiscoveryResponse.Builder::externalDbSystemDiscovery)
                .handleResponseHeaderString(
                        "etag", PatchExternalDbSystemDiscoveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PatchExternalDbSystemDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveDataFileResponse> removeDataFile(
            RemoveDataFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveDataFileRequest, RemoveDataFileResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getTablespaceName(), "tablespaceName must not be blank");
        Objects.requireNonNull(
                request.getRemoveDataFileDetails(), "removeDataFileDetails is required");

        return clientCall(request, RemoveDataFileResponse::builder)
                .logger(LOG, "removeDataFile")
                .serviceDetails(
                        "DbManagement",
                        "RemoveDataFile",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/RemoveDataFile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDataFileRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("tablespaces")
                .appendPathParam(request.getTablespaceName())
                .appendPathParam("actions")
                .appendPathParam("removeDataFile")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.TablespaceAdminStatus.class,
                        RemoveDataFileResponse.Builder::tablespaceAdminStatus)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveDataFileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
            removeManagedDatabaseFromManagedDatabaseGroup(
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                                    RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedDatabaseGroupId(), "managedDatabaseGroupId must not be blank");
        Objects.requireNonNull(
                request.getRemoveManagedDatabaseFromManagedDatabaseGroupDetails(),
                "removeManagedDatabaseFromManagedDatabaseGroupDetails is required");

        return clientCall(request, RemoveManagedDatabaseFromManagedDatabaseGroupResponse::builder)
                .logger(LOG, "removeManagedDatabaseFromManagedDatabaseGroup")
                .serviceDetails(
                        "DbManagement",
                        "RemoveManagedDatabaseFromManagedDatabaseGroup",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/RemoveManagedDatabaseFromManagedDatabaseGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveManagedDatabaseFromManagedDatabaseGroupRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabaseGroups")
                .appendPathParam(request.getManagedDatabaseGroupId())
                .appendPathParam("actions")
                .appendPathParam("removeManagedDatabase")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveManagedDatabaseFromManagedDatabaseGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResetDatabaseParametersResponse> resetDatabaseParameters(
            ResetDatabaseParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getResetDatabaseParametersDetails(),
                "resetDatabaseParametersDetails is required");

        return clientCall(request, ResetDatabaseParametersResponse::builder)
                .logger(LOG, "resetDatabaseParameters")
                .serviceDetails(
                        "DbManagement",
                        "ResetDatabaseParameters",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ResetDatabaseParameters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResetDatabaseParametersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("resetDatabaseParameters")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.UpdateDatabaseParametersResult
                                .class,
                        ResetDatabaseParametersResponse.Builder::updateDatabaseParametersResult)
                .handleResponseHeaderString(
                        "opc-request-id", ResetDatabaseParametersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResizeDataFileResponse> resizeDataFile(
            ResizeDataFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResizeDataFileRequest, ResizeDataFileResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getTablespaceName(), "tablespaceName must not be blank");
        Objects.requireNonNull(
                request.getResizeDataFileDetails(), "resizeDataFileDetails is required");

        return clientCall(request, ResizeDataFileResponse::builder)
                .logger(LOG, "resizeDataFile")
                .serviceDetails(
                        "DbManagement",
                        "ResizeDataFile",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/ResizeDataFile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResizeDataFileRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("tablespaces")
                .appendPathParam(request.getTablespaceName())
                .appendPathParam("actions")
                .appendPathParam("resizeDataFile")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.TablespaceAdminStatus.class,
                        ResizeDataFileResponse.Builder::tablespaceAdminStatus)
                .handleResponseHeaderString(
                        "opc-request-id", ResizeDataFileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RunHistoricAddmResponse> runHistoricAddm(
            RunHistoricAddmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RunHistoricAddmRequest, RunHistoricAddmResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getRunHistoricAddmDetails(), "runHistoricAddmDetails is required");

        return clientCall(request, RunHistoricAddmResponse::builder)
                .logger(LOG, "runHistoricAddm")
                .serviceDetails(
                        "DbManagement",
                        "RunHistoricAddm",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/HistoricAddmResult/RunHistoricAddm")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RunHistoricAddmRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("runHistoricAddm")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.HistoricAddmResult.class,
                        RunHistoricAddmResponse.Builder::historicAddmResult)
                .handleResponseHeaderString(
                        "opc-request-id", RunHistoricAddmResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbCpuUsagesResponse> summarizeAwrDbCpuUsages(
            SummarizeAwrDbCpuUsagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbCpuUsagesRequest, SummarizeAwrDbCpuUsagesResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");

        return clientCall(request, SummarizeAwrDbCpuUsagesResponse::builder)
                .logger(LOG, "summarizeAwrDbCpuUsages")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeAwrDbCpuUsages",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbCpuUsages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDbCpuUsagesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbCpuUsages")
                .appendQueryParam("instNum", request.getInstNum())
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendEnumQueryParam("sessionType", request.getSessionType())
                .appendQueryParam("containerId", request.getContainerId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbCpuUsageCollection.class,
                        SummarizeAwrDbCpuUsagesResponse.Builder::awrDbCpuUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAwrDbCpuUsagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrDbCpuUsagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbMetricsResponse> summarizeAwrDbMetrics(
            SummarizeAwrDbMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbMetricsRequest, SummarizeAwrDbMetricsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");
        Objects.requireNonNull(request.getName(), "name is required");

        return clientCall(request, SummarizeAwrDbMetricsResponse::builder)
                .logger(LOG, "summarizeAwrDbMetrics")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeAwrDbMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDbMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbMetrics")
                .appendQueryParam("instNum", request.getInstNum())
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("containerId", request.getContainerId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbMetricCollection.class,
                        SummarizeAwrDbMetricsResponse.Builder::awrDbMetricCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAwrDbMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrDbMetricsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbParameterChangesResponse>
            summarizeAwrDbParameterChanges(
                    SummarizeAwrDbParameterChangesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbParameterChangesRequest,
                                    SummarizeAwrDbParameterChangesResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");
        Objects.requireNonNull(request.getName(), "name is required");

        return clientCall(request, SummarizeAwrDbParameterChangesResponse::builder)
                .logger(LOG, "summarizeAwrDbParameterChanges")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeAwrDbParameterChanges",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbParameterChanges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDbParameterChangesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbParameterChanges")
                .appendQueryParam("instNum", request.getInstNum())
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("containerId", request.getContainerId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbParameterChangeCollection
                                .class,
                        SummarizeAwrDbParameterChangesResponse.Builder
                                ::awrDbParameterChangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDbParameterChangesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeAwrDbParameterChangesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbParametersResponse> summarizeAwrDbParameters(
            SummarizeAwrDbParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbParametersRequest, SummarizeAwrDbParametersResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");

        return clientCall(request, SummarizeAwrDbParametersResponse::builder)
                .logger(LOG, "summarizeAwrDbParameters")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeAwrDbParameters",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbParameters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDbParametersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbParameters")
                .appendQueryParam("instNum", request.getInstNum())
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("containerId", request.getContainerId())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("nameContains", request.getNameContains())
                .appendEnumQueryParam("valueChanged", request.getValueChanged())
                .appendEnumQueryParam("valueDefault", request.getValueDefault())
                .appendEnumQueryParam("valueModified", request.getValueModified())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbParameterCollection.class,
                        SummarizeAwrDbParametersResponse.Builder::awrDbParameterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAwrDbParametersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrDbParametersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbSnapshotRangesResponse>
            summarizeAwrDbSnapshotRanges(
                    SummarizeAwrDbSnapshotRangesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbSnapshotRangesRequest,
                                    SummarizeAwrDbSnapshotRangesResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, SummarizeAwrDbSnapshotRangesResponse::builder)
                .logger(LOG, "summarizeAwrDbSnapshotRanges")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeAwrDbSnapshotRanges",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbSnapshotRanges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDbSnapshotRangesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbSnapshotRanges")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbSnapshotRangeCollection.class,
                        SummarizeAwrDbSnapshotRangesResponse.Builder::awrDbSnapshotRangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDbSnapshotRangesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrDbSnapshotRangesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbSysstatsResponse> summarizeAwrDbSysstats(
            SummarizeAwrDbSysstatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbSysstatsRequest, SummarizeAwrDbSysstatsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");
        Objects.requireNonNull(request.getName(), "name is required");

        return clientCall(request, SummarizeAwrDbSysstatsResponse::builder)
                .logger(LOG, "summarizeAwrDbSysstats")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeAwrDbSysstats",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbSysstats")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDbSysstatsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbSysstats")
                .appendQueryParam("instNum", request.getInstNum())
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("containerId", request.getContainerId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbSysstatCollection.class,
                        SummarizeAwrDbSysstatsResponse.Builder::awrDbSysstatCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAwrDbSysstatsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrDbSysstatsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbTopWaitEventsResponse>
            summarizeAwrDbTopWaitEvents(
                    SummarizeAwrDbTopWaitEventsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbTopWaitEventsRequest,
                                    SummarizeAwrDbTopWaitEventsResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");

        return clientCall(request, SummarizeAwrDbTopWaitEventsResponse::builder)
                .logger(LOG, "summarizeAwrDbTopWaitEvents")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeAwrDbTopWaitEvents",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbTopWaitEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDbTopWaitEventsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbTopWaitEvents")
                .appendQueryParam("instNum", request.getInstNum())
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendEnumQueryParam("sessionType", request.getSessionType())
                .appendQueryParam("containerId", request.getContainerId())
                .appendQueryParam("topN", request.getTopN())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbTopWaitEventCollection.class,
                        SummarizeAwrDbTopWaitEventsResponse.Builder::awrDbTopWaitEventCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAwrDbTopWaitEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrDbTopWaitEventsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbWaitEventBucketsResponse>
            summarizeAwrDbWaitEventBuckets(
                    SummarizeAwrDbWaitEventBucketsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbWaitEventBucketsRequest,
                                    SummarizeAwrDbWaitEventBucketsResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");
        Objects.requireNonNull(request.getName(), "name is required");

        return clientCall(request, SummarizeAwrDbWaitEventBucketsResponse::builder)
                .logger(LOG, "summarizeAwrDbWaitEventBuckets")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeAwrDbWaitEventBuckets",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbWaitEventBuckets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDbWaitEventBucketsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbWaitEventBuckets")
                .appendQueryParam("instNum", request.getInstNum())
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("numBucket", request.getNumBucket())
                .appendQueryParam("minValue", request.getMinValue())
                .appendQueryParam("maxValue", request.getMaxValue())
                .appendQueryParam("containerId", request.getContainerId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbWaitEventBucketCollection
                                .class,
                        SummarizeAwrDbWaitEventBucketsResponse.Builder
                                ::awrDbWaitEventBucketCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDbWaitEventBucketsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeAwrDbWaitEventBucketsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbWaitEventsResponse> summarizeAwrDbWaitEvents(
            SummarizeAwrDbWaitEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbWaitEventsRequest, SummarizeAwrDbWaitEventsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getAwrDbId(), "awrDbId must not be blank");

        return clientCall(request, SummarizeAwrDbWaitEventsResponse::builder)
                .logger(LOG, "summarizeAwrDbWaitEvents")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeAwrDbWaitEvents",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbWaitEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDbWaitEventsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("awrDbs")
                .appendPathParam(request.getAwrDbId())
                .appendPathParam("awrDbWaitEvents")
                .appendQueryParam("instNum", request.getInstNum())
                .appendQueryParam(
                        "beginSnIdGreaterThanOrEqualTo", request.getBeginSnIdGreaterThanOrEqualTo())
                .appendQueryParam("endSnIdLessThanOrEqualTo", request.getEndSnIdLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sessionType", request.getSessionType())
                .appendQueryParam("containerId", request.getContainerId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AwrDbWaitEventCollection.class,
                        SummarizeAwrDbWaitEventsResponse.Builder::awrDbWaitEventCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAwrDbWaitEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrDbWaitEventsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExternalAsmMetricsResponse>
            summarizeExternalAsmMetrics(
                    SummarizeExternalAsmMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalAsmMetricsRequest,
                                    SummarizeExternalAsmMetricsResponse>
                            handler) {

        Validate.notBlank(request.getExternalAsmId(), "externalAsmId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, SummarizeExternalAsmMetricsResponse::builder)
                .logger(LOG, "summarizeExternalAsmMetrics")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeExternalAsmMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/SummarizeExternalAsmMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExternalAsmMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalAsms")
                .appendPathParam(request.getExternalAsmId())
                .appendPathParam("metrics")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendQueryParam("filterByMetricNames", request.getFilterByMetricNames())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MetricsAggregationRangeCollection
                                .class,
                        SummarizeExternalAsmMetricsResponse.Builder
                                ::metricsAggregationRangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeExternalAsmMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeExternalAsmMetricsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExternalClusterMetricsResponse>
            summarizeExternalClusterMetrics(
                    SummarizeExternalClusterMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalClusterMetricsRequest,
                                    SummarizeExternalClusterMetricsResponse>
                            handler) {

        Validate.notBlank(request.getExternalClusterId(), "externalClusterId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, SummarizeExternalClusterMetricsResponse::builder)
                .logger(LOG, "summarizeExternalClusterMetrics")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeExternalClusterMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/SummarizeExternalClusterMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExternalClusterMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalClusters")
                .appendPathParam(request.getExternalClusterId())
                .appendPathParam("metrics")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendQueryParam("filterByMetricNames", request.getFilterByMetricNames())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MetricsAggregationRangeCollection
                                .class,
                        SummarizeExternalClusterMetricsResponse.Builder
                                ::metricsAggregationRangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExternalClusterMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExternalClusterMetricsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExternalDbNodeMetricsResponse>
            summarizeExternalDbNodeMetrics(
                    SummarizeExternalDbNodeMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalDbNodeMetricsRequest,
                                    SummarizeExternalDbNodeMetricsResponse>
                            handler) {

        Validate.notBlank(request.getExternalDbNodeId(), "externalDbNodeId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, SummarizeExternalDbNodeMetricsResponse::builder)
                .logger(LOG, "summarizeExternalDbNodeMetrics")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeExternalDbNodeMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/SummarizeExternalDbNodeMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExternalDbNodeMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbNodes")
                .appendPathParam(request.getExternalDbNodeId())
                .appendPathParam("metrics")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendQueryParam("filterByMetricNames", request.getFilterByMetricNames())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MetricsAggregationRangeCollection
                                .class,
                        SummarizeExternalDbNodeMetricsResponse.Builder
                                ::metricsAggregationRangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExternalDbNodeMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExternalDbNodeMetricsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExternalDbSystemAvailabilityMetricsResponse>
            summarizeExternalDbSystemAvailabilityMetrics(
                    SummarizeExternalDbSystemAvailabilityMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalDbSystemAvailabilityMetricsRequest,
                                    SummarizeExternalDbSystemAvailabilityMetricsResponse>
                            handler) {

        Validate.notBlank(request.getExternalDbSystemId(), "externalDbSystemId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, SummarizeExternalDbSystemAvailabilityMetricsResponse::builder)
                .logger(LOG, "summarizeExternalDbSystemAvailabilityMetrics")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeExternalDbSystemAvailabilityMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/SummarizeExternalDbSystemAvailabilityMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExternalDbSystemAvailabilityMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .appendPathParam(request.getExternalDbSystemId())
                .appendPathParam("availabilityMetrics")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("filterByComponentTypes", request.getFilterByComponentTypes())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MetricsAggregationRangeCollection
                                .class,
                        SummarizeExternalDbSystemAvailabilityMetricsResponse.Builder
                                ::metricsAggregationRangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExternalDbSystemAvailabilityMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExternalDbSystemAvailabilityMetricsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExternalListenerMetricsResponse>
            summarizeExternalListenerMetrics(
                    SummarizeExternalListenerMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalListenerMetricsRequest,
                                    SummarizeExternalListenerMetricsResponse>
                            handler) {

        Validate.notBlank(request.getExternalListenerId(), "externalListenerId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, SummarizeExternalListenerMetricsResponse::builder)
                .logger(LOG, "summarizeExternalListenerMetrics")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeExternalListenerMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/SummarizeExternalListenerMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExternalListenerMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalListeners")
                .appendPathParam(request.getExternalListenerId())
                .appendPathParam("metrics")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendQueryParam("filterByMetricNames", request.getFilterByMetricNames())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MetricsAggregationRangeCollection
                                .class,
                        SummarizeExternalListenerMetricsResponse.Builder
                                ::metricsAggregationRangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExternalListenerMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExternalListenerMetricsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeJobExecutionsStatusesResponse>
            summarizeJobExecutionsStatuses(
                    SummarizeJobExecutionsStatusesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeJobExecutionsStatusesRequest,
                                    SummarizeJobExecutionsStatusesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, SummarizeJobExecutionsStatusesResponse::builder)
                .logger(LOG, "summarizeJobExecutionsStatuses")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeJobExecutionsStatuses",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecutionsStatusSummaryCollection/SummarizeJobExecutionsStatuses")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeJobExecutionsStatusesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobExecutionsStatus")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("managedDatabaseGroupId", request.getManagedDatabaseGroupId())
                .appendQueryParam("managedDatabaseId", request.getManagedDatabaseId())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.JobExecutionsStatusSummaryCollection
                                .class,
                        SummarizeJobExecutionsStatusesResponse.Builder
                                ::jobExecutionsStatusSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeJobExecutionsStatusesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeManagedDatabaseAvailabilityMetricsResponse>
            summarizeManagedDatabaseAvailabilityMetrics(
                    SummarizeManagedDatabaseAvailabilityMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagedDatabaseAvailabilityMetricsRequest,
                                    SummarizeManagedDatabaseAvailabilityMetricsResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, SummarizeManagedDatabaseAvailabilityMetricsResponse::builder)
                .logger(LOG, "summarizeManagedDatabaseAvailabilityMetrics")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeManagedDatabaseAvailabilityMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeManagedDatabaseAvailabilityMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeManagedDatabaseAvailabilityMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("availabilityMetrics")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MetricsAggregationRangeCollection
                                .class,
                        SummarizeManagedDatabaseAvailabilityMetricsResponse.Builder
                                ::metricsAggregationRangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeManagedDatabaseAvailabilityMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeManagedDatabaseAvailabilityMetricsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlPlanBaselinesResponse> summarizeSqlPlanBaselines(
            SummarizeSqlPlanBaselinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlPlanBaselinesRequest, SummarizeSqlPlanBaselinesResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, SummarizeSqlPlanBaselinesResponse::builder)
                .logger(LOG, "summarizeSqlPlanBaselines")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeSqlPlanBaselines",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeSqlPlanBaselines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeSqlPlanBaselinesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselineStats")
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineAggregationCollection
                                .class,
                        SummarizeSqlPlanBaselinesResponse.Builder
                                ::sqlPlanBaselineAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeSqlPlanBaselinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeSqlPlanBaselinesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlPlanBaselinesByLastExecutionResponse>
            summarizeSqlPlanBaselinesByLastExecution(
                    SummarizeSqlPlanBaselinesByLastExecutionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlPlanBaselinesByLastExecutionRequest,
                                    SummarizeSqlPlanBaselinesByLastExecutionResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, SummarizeSqlPlanBaselinesByLastExecutionResponse::builder)
                .logger(LOG, "summarizeSqlPlanBaselinesByLastExecution")
                .serviceDetails(
                        "DbManagement",
                        "SummarizeSqlPlanBaselinesByLastExecution",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeSqlPlanBaselinesByLastExecution")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeSqlPlanBaselinesByLastExecutionRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlPlanBaselineExecutionStats")
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineAggregationCollection
                                .class,
                        SummarizeSqlPlanBaselinesByLastExecutionResponse.Builder
                                ::sqlPlanBaselineAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeSqlPlanBaselinesByLastExecutionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeSqlPlanBaselinesByLastExecutionResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TestPreferredCredentialResponse> testPreferredCredential(
            TestPreferredCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TestPreferredCredentialRequest, TestPreferredCredentialResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getCredentialName(), "credentialName must not be blank");

        return clientCall(request, TestPreferredCredentialResponse::builder)
                .logger(LOG, "testPreferredCredential")
                .serviceDetails(
                        "DbManagement",
                        "TestPreferredCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/TestPreferredCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TestPreferredCredentialRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("preferredCredentials")
                .appendPathParam(request.getCredentialName())
                .appendPathParam("actions")
                .appendPathParam("test")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.TestPreferredCredentialStatus.class,
                        TestPreferredCredentialResponse.Builder::testPreferredCredentialStatus)
                .handleResponseHeaderString(
                        "opc-request-id", TestPreferredCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDbManagementPrivateEndpointResponse>
            updateDbManagementPrivateEndpoint(
                    UpdateDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDbManagementPrivateEndpointRequest,
                                    UpdateDbManagementPrivateEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getDbManagementPrivateEndpointId(),
                "dbManagementPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDbManagementPrivateEndpointDetails(),
                "updateDbManagementPrivateEndpointDetails is required");

        return clientCall(request, UpdateDbManagementPrivateEndpointResponse::builder)
                .logger(LOG, "updateDbManagementPrivateEndpoint")
                .serviceDetails(
                        "DbManagement",
                        "UpdateDbManagementPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/UpdateDbManagementPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDbManagementPrivateEndpointRequest::builder)
                .basePath("/20201101")
                .appendPathParam("dbManagementPrivateEndpoints")
                .appendPathParam(request.getDbManagementPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.DbManagementPrivateEndpoint.class,
                        UpdateDbManagementPrivateEndpointResponse.Builder
                                ::dbManagementPrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDbManagementPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateDbManagementPrivateEndpointResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalAsmResponse> updateExternalAsm(
            UpdateExternalAsmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalAsmRequest, UpdateExternalAsmResponse>
                    handler) {

        Validate.notBlank(request.getExternalAsmId(), "externalAsmId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalAsmDetails(), "updateExternalAsmDetails is required");

        return clientCall(request, UpdateExternalAsmResponse::builder)
                .logger(LOG, "updateExternalAsm")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalAsm",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/UpdateExternalAsm")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalAsmRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalAsms")
                .appendPathParam(request.getExternalAsmId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExternalAsmResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateExternalAsmResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalClusterResponse> updateExternalCluster(
            UpdateExternalClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalClusterRequest, UpdateExternalClusterResponse>
                    handler) {

        Validate.notBlank(request.getExternalClusterId(), "externalClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalClusterDetails(),
                "updateExternalClusterDetails is required");

        return clientCall(request, UpdateExternalClusterResponse::builder)
                .logger(LOG, "updateExternalCluster")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/UpdateExternalCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalClusterRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalClusters")
                .appendPathParam(request.getExternalClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExternalClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalClusterResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalClusterInstanceResponse>
            updateExternalClusterInstance(
                    UpdateExternalClusterInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalClusterInstanceRequest,
                                    UpdateExternalClusterInstanceResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalClusterInstanceId(),
                "externalClusterInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalClusterInstanceDetails(),
                "updateExternalClusterInstanceDetails is required");

        return clientCall(request, UpdateExternalClusterInstanceResponse::builder)
                .logger(LOG, "updateExternalClusterInstance")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalClusterInstance",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalClusterInstance/UpdateExternalClusterInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalClusterInstanceRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalClusterInstances")
                .appendPathParam(request.getExternalClusterInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalClusterInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalClusterInstanceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDbNodeResponse> updateExternalDbNode(
            UpdateExternalDbNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalDbNodeRequest, UpdateExternalDbNodeResponse>
                    handler) {

        Validate.notBlank(request.getExternalDbNodeId(), "externalDbNodeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalDbNodeDetails(),
                "updateExternalDbNodeDetails is required");

        return clientCall(request, UpdateExternalDbNodeResponse::builder)
                .logger(LOG, "updateExternalDbNode")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalDbNode",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/UpdateExternalDbNode")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalDbNodeRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbNodes")
                .appendPathParam(request.getExternalDbNodeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExternalDbNodeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalDbNodeResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDbSystemResponse> updateExternalDbSystem(
            UpdateExternalDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalDbSystemRequest, UpdateExternalDbSystemResponse>
                    handler) {

        Validate.notBlank(request.getExternalDbSystemId(), "externalDbSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalDbSystemDetails(),
                "updateExternalDbSystemDetails is required");

        return clientCall(request, UpdateExternalDbSystemResponse::builder)
                .logger(LOG, "updateExternalDbSystem")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/UpdateExternalDbSystem")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalDbSystemRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystems")
                .appendPathParam(request.getExternalDbSystemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystem.class,
                        UpdateExternalDbSystemResponse.Builder::externalDbSystem)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExternalDbSystemResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateExternalDbSystemResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDbSystemConnectorResponse>
            updateExternalDbSystemConnector(
                    UpdateExternalDbSystemConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalDbSystemConnectorRequest,
                                    UpdateExternalDbSystemConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDbSystemConnectorId(),
                "externalDbSystemConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalDbSystemConnectorDetails(),
                "updateExternalDbSystemConnectorDetails is required");

        return clientCall(request, UpdateExternalDbSystemConnectorResponse::builder)
                .logger(LOG, "updateExternalDbSystemConnector")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalDbSystemConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/UpdateExternalDbSystemConnector")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalDbSystemConnectorRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemConnectors")
                .appendPathParam(request.getExternalDbSystemConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalDbSystemConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalDbSystemConnectorResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDbSystemDiscoveryResponse>
            updateExternalDbSystemDiscovery(
                    UpdateExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalDbSystemDiscoveryRequest,
                                    UpdateExternalDbSystemDiscoveryResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDbSystemDiscoveryId(),
                "externalDbSystemDiscoveryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalDbSystemDiscoveryDetails(),
                "updateExternalDbSystemDiscoveryDetails is required");

        return clientCall(request, UpdateExternalDbSystemDiscoveryResponse::builder)
                .logger(LOG, "updateExternalDbSystemDiscovery")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalDbSystemDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/UpdateExternalDbSystemDiscovery")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalDbSystemDiscoveryRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbSystemDiscoveries")
                .appendPathParam(request.getExternalDbSystemDiscoveryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery.class,
                        UpdateExternalDbSystemDiscoveryResponse.Builder::externalDbSystemDiscovery)
                .handleResponseHeaderString(
                        "etag", UpdateExternalDbSystemDiscoveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalDbSystemDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalExadataInfrastructureResponse>
            updateExternalExadataInfrastructure(
                    UpdateExternalExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalExadataInfrastructureRequest,
                                    UpdateExternalExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataInfrastructureId(),
                "externalExadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalExadataInfrastructureDetails(),
                "updateExternalExadataInfrastructureDetails is required");

        return clientCall(request, UpdateExternalExadataInfrastructureResponse::builder)
                .logger(LOG, "updateExternalExadataInfrastructure")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/UpdateExternalExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalExadataInfrastructureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataInfrastructures")
                .appendPathParam(request.getExternalExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataInfrastructure.class,
                        UpdateExternalExadataInfrastructureResponse.Builder
                                ::externalExadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExternalExadataInfrastructureResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalExadataStorageConnectorResponse>
            updateExternalExadataStorageConnector(
                    UpdateExternalExadataStorageConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalExadataStorageConnectorRequest,
                                    UpdateExternalExadataStorageConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalExadataStorageConnectorId(),
                "externalExadataStorageConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalExadataStorageConnectorDetails(),
                "updateExternalExadataStorageConnectorDetails is required");

        return clientCall(request, UpdateExternalExadataStorageConnectorResponse::builder)
                .logger(LOG, "updateExternalExadataStorageConnector")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalExadataStorageConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/UpdateExternalExadataStorageConnector")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalExadataStorageConnectorRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageConnectors")
                .appendPathParam(request.getExternalExadataStorageConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataStorageConnector
                                .class,
                        UpdateExternalExadataStorageConnectorResponse.Builder
                                ::externalExadataStorageConnector)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalExadataStorageConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExternalExadataStorageConnectorResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalListenerResponse> updateExternalListener(
            UpdateExternalListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalListenerRequest, UpdateExternalListenerResponse>
                    handler) {

        Validate.notBlank(request.getExternalListenerId(), "externalListenerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalListenerDetails(),
                "updateExternalListenerDetails is required");

        return clientCall(request, UpdateExternalListenerResponse::builder)
                .logger(LOG, "updateExternalListener")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalListener",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/UpdateExternalListener")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalListenerRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalListeners")
                .appendPathParam(request.getExternalListenerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExternalListenerResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalListenerResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");
        Objects.requireNonNull(request.getUpdateJobDetails(), "updateJobDetails is required");

        return clientCall(request, UpdateJobResponse::builder)
                .logger(LOG, "updateJob")
                .serviceDetails(
                        "DbManagement",
                        "UpdateJob",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/UpdateJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJobRequest::builder)
                .basePath("/20201101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.Job.class,
                        UpdateJobResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateManagedDatabaseGroupResponse>
            updateManagedDatabaseGroup(
                    UpdateManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateManagedDatabaseGroupRequest,
                                    UpdateManagedDatabaseGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedDatabaseGroupId(), "managedDatabaseGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagedDatabaseGroupDetails(),
                "updateManagedDatabaseGroupDetails is required");

        return clientCall(request, UpdateManagedDatabaseGroupResponse::builder)
                .logger(LOG, "updateManagedDatabaseGroup")
                .serviceDetails(
                        "DbManagement",
                        "UpdateManagedDatabaseGroup",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/UpdateManagedDatabaseGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagedDatabaseGroupRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabaseGroups")
                .appendPathParam(request.getManagedDatabaseGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroup.class,
                        UpdateManagedDatabaseGroupResponse.Builder::managedDatabaseGroup)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagedDatabaseGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateManagedDatabaseGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePreferredCredentialResponse> updatePreferredCredential(
            UpdatePreferredCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePreferredCredentialRequest, UpdatePreferredCredentialResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getCredentialName(), "credentialName must not be blank");
        Objects.requireNonNull(
                request.getUpdatePreferredCredentialDetails(),
                "updatePreferredCredentialDetails is required");

        return clientCall(request, UpdatePreferredCredentialResponse::builder)
                .logger(LOG, "updatePreferredCredential")
                .serviceDetails(
                        "DbManagement",
                        "UpdatePreferredCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/UpdatePreferredCredential")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePreferredCredentialRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("preferredCredentials")
                .appendPathParam(request.getCredentialName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.PreferredCredential.class,
                        UpdatePreferredCredentialResponse.Builder::preferredCredential)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePreferredCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdatePreferredCredentialResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTablespaceResponse> updateTablespace(
            UpdateTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTablespaceRequest, UpdateTablespaceResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Validate.notBlank(request.getTablespaceName(), "tablespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpdateTablespaceDetails(), "updateTablespaceDetails is required");

        return clientCall(request, UpdateTablespaceResponse::builder)
                .logger(LOG, "updateTablespace")
                .serviceDetails(
                        "DbManagement",
                        "UpdateTablespace",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/UpdateTablespace")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTablespaceRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("tablespaces")
                .appendPathParam(request.getTablespaceName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.Tablespace.class,
                        UpdateTablespaceResponse.Builder::tablespace)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTablespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
