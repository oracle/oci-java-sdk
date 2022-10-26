/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
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

    private DbManagementAsyncClient(
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
                @javax.annotation.Nonnull
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
