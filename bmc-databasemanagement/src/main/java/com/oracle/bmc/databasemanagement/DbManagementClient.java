/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class DbManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DbManagement {
    /** Service instance for DbManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbmgmt.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbManagementAsyncClient.class);

    private final DbManagementWaiters waiters;

    private final DbManagementPaginators paginators;

    private DbManagementClient(
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
                                    .nameFormat("DbManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DbManagementWaiters(executorService, this);

        this.paginators = new DbManagementPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbManagementClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public DbManagementClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbManagementClient(this, authenticationDetailsProvider, executorService);
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
    public AddDataFilesResponse addDataFiles(AddDataFilesRequest request) {

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
                .callSync();
    }

    @Override
    public AddManagedDatabaseToManagedDatabaseGroupResponse
            addManagedDatabaseToManagedDatabaseGroup(
                    AddManagedDatabaseToManagedDatabaseGroupRequest request) {

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
                .callSync();
    }

    @Override
    public AddmTasksResponse addmTasks(AddmTasksRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeDatabaseParametersResponse changeDatabaseParameters(
            ChangeDatabaseParametersRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeDbManagementPrivateEndpointCompartmentResponse
            changeDbManagementPrivateEndpointCompartment(
                    ChangeDbManagementPrivateEndpointCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeJobCompartmentResponse changeJobCompartment(ChangeJobCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeManagedDatabaseGroupCompartmentResponse changeManagedDatabaseGroupCompartment(
            ChangeManagedDatabaseGroupCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public CreateDbManagementPrivateEndpointResponse createDbManagementPrivateEndpoint(
            CreateDbManagementPrivateEndpointRequest request) {
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
                .callSync();
    }

    @Override
    public CreateJobResponse createJob(CreateJobRequest request) {
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
                .callSync();
    }

    @Override
    public CreateManagedDatabaseGroupResponse createManagedDatabaseGroup(
            CreateManagedDatabaseGroupRequest request) {
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
                .callSync();
    }

    @Override
    public CreateTablespaceResponse createTablespace(CreateTablespaceRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteDbManagementPrivateEndpointResponse deleteDbManagementPrivateEndpoint(
            DeleteDbManagementPrivateEndpointRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteManagedDatabaseGroupResponse deleteManagedDatabaseGroup(
            DeleteManagedDatabaseGroupRequest request) {

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
                .callSync();
    }

    @Override
    public DeletePreferredCredentialResponse deletePreferredCredential(
            DeletePreferredCredentialRequest request) {

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
                .callSync();
    }

    @Override
    public DropTablespaceResponse dropTablespace(DropTablespaceRequest request) {

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
                .callSync();
    }

    @Override
    public GenerateAwrSnapshotResponse generateAwrSnapshot(GenerateAwrSnapshotRequest request) {

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
                .callSync();
    }

    @Override
    public GetAwrDbReportResponse getAwrDbReport(GetAwrDbReportRequest request) {

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
                .callSync();
    }

    @Override
    public GetAwrDbSqlReportResponse getAwrDbSqlReport(GetAwrDbSqlReportRequest request) {

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
                .callSync();
    }

    @Override
    public GetClusterCacheMetricResponse getClusterCacheMetric(
            GetClusterCacheMetricRequest request) {

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
                .callSync();
    }

    @Override
    public GetDatabaseFleetHealthMetricsResponse getDatabaseFleetHealthMetrics(
            GetDatabaseFleetHealthMetricsRequest request) {
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
                .callSync();
    }

    @Override
    public GetDatabaseHomeMetricsResponse getDatabaseHomeMetrics(
            GetDatabaseHomeMetricsRequest request) {
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
                .callSync();
    }

    @Override
    public GetDbManagementPrivateEndpointResponse getDbManagementPrivateEndpoint(
            GetDbManagementPrivateEndpointRequest request) {

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
                .callSync();
    }

    @Override
    public GetJobResponse getJob(GetJobRequest request) {

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
                .callSync();
    }

    @Override
    public GetJobExecutionResponse getJobExecution(GetJobExecutionRequest request) {

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
                .callSync();
    }

    @Override
    public GetJobRunResponse getJobRun(GetJobRunRequest request) {

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
                .callSync();
    }

    @Override
    public GetManagedDatabaseResponse getManagedDatabase(GetManagedDatabaseRequest request) {

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
                .callSync();
    }

    @Override
    public GetManagedDatabaseGroupResponse getManagedDatabaseGroup(
            GetManagedDatabaseGroupRequest request) {

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
                .callSync();
    }

    @Override
    public GetOptimizerStatisticsAdvisorExecutionResponse getOptimizerStatisticsAdvisorExecution(
            GetOptimizerStatisticsAdvisorExecutionRequest request) {

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
                .callSync();
    }

    @Override
    public GetOptimizerStatisticsAdvisorExecutionScriptResponse
            getOptimizerStatisticsAdvisorExecutionScript(
                    GetOptimizerStatisticsAdvisorExecutionScriptRequest request) {

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
                .callSync();
    }

    @Override
    public GetOptimizerStatisticsCollectionOperationResponse
            getOptimizerStatisticsCollectionOperation(
                    GetOptimizerStatisticsCollectionOperationRequest request) {

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
                .callSync();
    }

    @Override
    public GetPdbMetricsResponse getPdbMetrics(GetPdbMetricsRequest request) {

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
                .callSync();
    }

    @Override
    public GetPreferredCredentialResponse getPreferredCredential(
            GetPreferredCredentialRequest request) {

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
                .callSync();
    }

    @Override
    public GetTablespaceResponse getTablespace(GetTablespaceRequest request) {

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
                .callSync();
    }

    @Override
    public GetUserResponse getUser(GetUserRequest request) {

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
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .callSync();
    }

    @Override
    public ImplementOptimizerStatisticsAdvisorRecommendationsResponse
            implementOptimizerStatisticsAdvisorRecommendations(
                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest request) {

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
                .callSync();
    }

    @Override
    public ListAsmPropertiesResponse listAsmProperties(ListAsmPropertiesRequest request) {

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
                .callSync();
    }

    @Override
    public ListAssociatedDatabasesResponse listAssociatedDatabases(
            ListAssociatedDatabasesRequest request) {

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
                .callSync();
    }

    @Override
    public ListAwrDbSnapshotsResponse listAwrDbSnapshots(ListAwrDbSnapshotsRequest request) {

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
                .callSync();
    }

    @Override
    public ListAwrDbsResponse listAwrDbs(ListAwrDbsRequest request) {

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
                .callSync();
    }

    @Override
    public ListConsumerGroupPrivilegesResponse listConsumerGroupPrivileges(
            ListConsumerGroupPrivilegesRequest request) {

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
                .callSync();
    }

    @Override
    public ListDataAccessContainersResponse listDataAccessContainers(
            ListDataAccessContainersRequest request) {

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
                .callSync();
    }

    @Override
    public ListDatabaseParametersResponse listDatabaseParameters(
            ListDatabaseParametersRequest request) {

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
                .callSync();
    }

    @Override
    public ListDbManagementPrivateEndpointsResponse listDbManagementPrivateEndpoints(
            ListDbManagementPrivateEndpointsRequest request) {
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
                .callSync();
    }

    @Override
    public ListJobExecutionsResponse listJobExecutions(ListJobExecutionsRequest request) {
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
                .callSync();
    }

    @Override
    public ListJobRunsResponse listJobRuns(ListJobRunsRequest request) {
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
                .callSync();
    }

    @Override
    public ListJobsResponse listJobs(ListJobsRequest request) {
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
                .callSync();
    }

    @Override
    public ListManagedDatabaseGroupsResponse listManagedDatabaseGroups(
            ListManagedDatabaseGroupsRequest request) {
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
                .callSync();
    }

    @Override
    public ListManagedDatabasesResponse listManagedDatabases(ListManagedDatabasesRequest request) {
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
                .callSync();
    }

    @Override
    public ListObjectPrivilegesResponse listObjectPrivileges(ListObjectPrivilegesRequest request) {

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
                .callSync();
    }

    @Override
    public ListOptimizerStatisticsAdvisorExecutionsResponse
            listOptimizerStatisticsAdvisorExecutions(
                    ListOptimizerStatisticsAdvisorExecutionsRequest request) {

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
                .callSync();
    }

    @Override
    public ListOptimizerStatisticsCollectionAggregationsResponse
            listOptimizerStatisticsCollectionAggregations(
                    ListOptimizerStatisticsCollectionAggregationsRequest request) {

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
                .callSync();
    }

    @Override
    public ListOptimizerStatisticsCollectionOperationsResponse
            listOptimizerStatisticsCollectionOperations(
                    ListOptimizerStatisticsCollectionOperationsRequest request) {

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
                .callSync();
    }

    @Override
    public ListPreferredCredentialsResponse listPreferredCredentials(
            ListPreferredCredentialsRequest request) {

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
                .callSync();
    }

    @Override
    public ListProxiedForUsersResponse listProxiedForUsers(ListProxiedForUsersRequest request) {

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
                .callSync();
    }

    @Override
    public ListProxyUsersResponse listProxyUsers(ListProxyUsersRequest request) {

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
                .callSync();
    }

    @Override
    public ListRolesResponse listRoles(ListRolesRequest request) {

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
                .callSync();
    }

    @Override
    public ListSystemPrivilegesResponse listSystemPrivileges(ListSystemPrivilegesRequest request) {

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
                .callSync();
    }

    @Override
    public ListTableStatisticsResponse listTableStatistics(ListTableStatisticsRequest request) {

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
                .callSync();
    }

    @Override
    public ListTablespacesResponse listTablespaces(ListTablespacesRequest request) {

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
                .callSync();
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest request) {

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
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

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
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
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
                .callSync();
    }

    @Override
    public RemoveDataFileResponse removeDataFile(RemoveDataFileRequest request) {

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
                .callSync();
    }

    @Override
    public RemoveManagedDatabaseFromManagedDatabaseGroupResponse
            removeManagedDatabaseFromManagedDatabaseGroup(
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest request) {

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
                .callSync();
    }

    @Override
    public ResetDatabaseParametersResponse resetDatabaseParameters(
            ResetDatabaseParametersRequest request) {

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
                .callSync();
    }

    @Override
    public ResizeDataFileResponse resizeDataFile(ResizeDataFileRequest request) {

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
                .callSync();
    }

    @Override
    public RunHistoricAddmResponse runHistoricAddm(RunHistoricAddmRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeAwrDbCpuUsagesResponse summarizeAwrDbCpuUsages(
            SummarizeAwrDbCpuUsagesRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeAwrDbMetricsResponse summarizeAwrDbMetrics(
            SummarizeAwrDbMetricsRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeAwrDbParameterChangesResponse summarizeAwrDbParameterChanges(
            SummarizeAwrDbParameterChangesRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeAwrDbParametersResponse summarizeAwrDbParameters(
            SummarizeAwrDbParametersRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeAwrDbSnapshotRangesResponse summarizeAwrDbSnapshotRanges(
            SummarizeAwrDbSnapshotRangesRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeAwrDbSysstatsResponse summarizeAwrDbSysstats(
            SummarizeAwrDbSysstatsRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeAwrDbTopWaitEventsResponse summarizeAwrDbTopWaitEvents(
            SummarizeAwrDbTopWaitEventsRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeAwrDbWaitEventBucketsResponse summarizeAwrDbWaitEventBuckets(
            SummarizeAwrDbWaitEventBucketsRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeAwrDbWaitEventsResponse summarizeAwrDbWaitEvents(
            SummarizeAwrDbWaitEventsRequest request) {

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
                .callSync();
    }

    @Override
    public SummarizeJobExecutionsStatusesResponse summarizeJobExecutionsStatuses(
            SummarizeJobExecutionsStatusesRequest request) {
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
                .callSync();
    }

    @Override
    public TestPreferredCredentialResponse testPreferredCredential(
            TestPreferredCredentialRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateDbManagementPrivateEndpointResponse updateDbManagementPrivateEndpoint(
            UpdateDbManagementPrivateEndpointRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateJobResponse updateJob(UpdateJobRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateManagedDatabaseGroupResponse updateManagedDatabaseGroup(
            UpdateManagedDatabaseGroupRequest request) {

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
                .callSync();
    }

    @Override
    public UpdatePreferredCredentialResponse updatePreferredCredential(
            UpdatePreferredCredentialRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateTablespaceResponse updateTablespace(UpdateTablespaceRequest request) {

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
                .callSync();
    }

    @Override
    public DbManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DbManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
