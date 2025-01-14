/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
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
            org.slf4j.LoggerFactory.getLogger(DbManagementClient.class);

    private final DbManagementWaiters waiters;

    private final DbManagementPaginators paginators;

    DbManagementClient(
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
            final String packageName = "databasemanagement";
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
        public DbManagementClient build(
                @jakarta.annotation.Nonnull
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
    public ChangeExternalDbSystemCompartmentResponse changeExternalDbSystemCompartment(
            ChangeExternalDbSystemCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExternalDbSystemCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExternalDbSystemCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeExternalExadataInfrastructureCompartmentResponse
            changeExternalExadataInfrastructureCompartment(
                    ChangeExternalExadataInfrastructureCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExternalExadataInfrastructureCompartmentResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExternalExadataInfrastructureCompartmentResponse.Builder
                                ::opcWorkRequestId)
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
    public ChangeNamedCredentialCompartmentResponse changeNamedCredentialCompartment(
            ChangeNamedCredentialCompartmentRequest request) {

        Validate.notBlank(request.getNamedCredentialId(), "namedCredentialId must not be blank");
        Objects.requireNonNull(
                request.getChangeNamedCredentialCompartmentDetails(),
                "changeNamedCredentialCompartmentDetails is required");

        return clientCall(request, ChangeNamedCredentialCompartmentResponse::builder)
                .logger(LOG, "changeNamedCredentialCompartment")
                .serviceDetails(
                        "DbManagement",
                        "ChangeNamedCredentialCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/ChangeNamedCredentialCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNamedCredentialCompartmentRequest::builder)
                .basePath("/20201101")
                .appendPathParam("namedCredentials")
                .appendPathParam(request.getNamedCredentialId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeNamedCredentialCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePlanRetentionResponse changePlanRetention(ChangePlanRetentionRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeSpaceBudgetResponse changeSpaceBudget(ChangeSpaceBudgetRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeSqlPlanBaselinesAttributesResponse changeSqlPlanBaselinesAttributes(
            ChangeSqlPlanBaselinesAttributesRequest request) {

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
                .callSync();
    }

    @Override
    public CheckExternalDbSystemConnectorConnectionStatusResponse
            checkExternalDbSystemConnectorConnectionStatus(
                    CheckExternalDbSystemConnectorConnectionStatusRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CheckExternalExadataStorageConnectorResponse checkExternalExadataStorageConnector(
            CheckExternalExadataStorageConnectorRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ConfigureAutomaticCaptureFiltersResponse configureAutomaticCaptureFilters(
            ConfigureAutomaticCaptureFiltersRequest request) {

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
                .callSync();
    }

    @Override
    public ConfigureAutomaticSpmEvolveAdvisorTaskResponse configureAutomaticSpmEvolveAdvisorTask(
            ConfigureAutomaticSpmEvolveAdvisorTaskRequest request) {

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
    public CreateExternalDbSystemResponse createExternalDbSystem(
            CreateExternalDbSystemRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateExternalDbSystemConnectorResponse createExternalDbSystemConnector(
            CreateExternalDbSystemConnectorRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector.class,
                        CreateExternalDbSystemConnectorResponse.Builder::externalDbSystemConnector)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalDbSystemConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalDbSystemConnectorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateExternalDbSystemDiscoveryResponse createExternalDbSystemDiscovery(
            CreateExternalDbSystemDiscoveryRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateExternalExadataInfrastructureResponse createExternalExadataInfrastructure(
            CreateExternalExadataInfrastructureRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateExternalExadataStorageConnectorResponse createExternalExadataStorageConnector(
            CreateExternalExadataStorageConnectorRequest request) {
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
                .operationUsesDefaultRetries()
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
    public CreateNamedCredentialResponse createNamedCredential(
            CreateNamedCredentialRequest request) {
        Objects.requireNonNull(
                request.getCreateNamedCredentialDetails(),
                "createNamedCredentialDetails is required");

        return clientCall(request, CreateNamedCredentialResponse::builder)
                .logger(LOG, "createNamedCredential")
                .serviceDetails(
                        "DbManagement",
                        "CreateNamedCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/CreateNamedCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNamedCredentialRequest::builder)
                .basePath("/20201101")
                .appendPathParam("namedCredentials")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.NamedCredential.class,
                        CreateNamedCredentialResponse.Builder::namedCredential)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNamedCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateNamedCredentialResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", CreateNamedCredentialResponse.Builder::location)
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
    public DeleteExternalDbSystemResponse deleteExternalDbSystem(
            DeleteExternalDbSystemRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteExternalDbSystemConnectorResponse deleteExternalDbSystemConnector(
            DeleteExternalDbSystemConnectorRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteExternalDbSystemDiscoveryResponse deleteExternalDbSystemDiscovery(
            DeleteExternalDbSystemDiscoveryRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteExternalExadataInfrastructureResponse deleteExternalExadataInfrastructure(
            DeleteExternalExadataInfrastructureRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteExternalExadataStorageConnectorResponse deleteExternalExadataStorageConnector(
            DeleteExternalExadataStorageConnectorRequest request) {

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
    public DeleteNamedCredentialResponse deleteNamedCredential(
            DeleteNamedCredentialRequest request) {

        Validate.notBlank(request.getNamedCredentialId(), "namedCredentialId must not be blank");

        return clientCall(request, DeleteNamedCredentialResponse::builder)
                .logger(LOG, "deleteNamedCredential")
                .serviceDetails(
                        "DbManagement",
                        "DeleteNamedCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/DeleteNamedCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNamedCredentialRequest::builder)
                .basePath("/20201101")
                .appendPathParam("namedCredentials")
                .appendPathParam(request.getNamedCredentialId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNamedCredentialResponse.Builder::opcRequestId)
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
    public DisableAutomaticInitialPlanCaptureResponse disableAutomaticInitialPlanCapture(
            DisableAutomaticInitialPlanCaptureRequest request) {

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
                .callSync();
    }

    @Override
    public DisableAutomaticSpmEvolveAdvisorTaskResponse disableAutomaticSpmEvolveAdvisorTask(
            DisableAutomaticSpmEvolveAdvisorTaskRequest request) {

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
                .callSync();
    }

    @Override
    public DisableAutonomousDatabaseManagementFeatureResponse
            disableAutonomousDatabaseManagementFeature(
                    DisableAutonomousDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDisableAutonomousDatabaseManagementFeatureDetails(),
                "disableAutonomousDatabaseManagementFeatureDetails is required");

        return clientCall(request, DisableAutonomousDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "disableAutonomousDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "DisableAutonomousDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableAutonomousDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableAutonomousDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableAutonomousDatabaseManagementFeatureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableAutonomousDatabaseManagementFeatureResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DisableDatabaseManagementFeatureResponse disableDatabaseManagementFeature(
            DisableDatabaseManagementFeatureRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getDisableDatabaseManagementFeatureDetails(),
                "disableDatabaseManagementFeatureDetails is required");

        return clientCall(request, DisableDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "disableDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "DisableDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableDatabaseManagementFeatureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableDatabaseManagementFeatureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DisableExternalContainerDatabaseManagementFeatureResponse
            disableExternalContainerDatabaseManagementFeature(
                    DisableExternalContainerDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDisableExternalContainerDatabaseManagementFeatureDetails(),
                "disableExternalContainerDatabaseManagementFeatureDetails is required");

        return clientCall(
                        request, DisableExternalContainerDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "disableExternalContainerDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "DisableExternalContainerDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableExternalContainerDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalContainerDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalContainerDatabaseManagementFeatureResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalContainerDatabaseManagementFeatureResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DisableExternalDbSystemDatabaseManagementResponse
            disableExternalDbSystemDatabaseManagement(
                    DisableExternalDbSystemDatabaseManagementRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalDbSystemDatabaseManagementResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalDbSystemDatabaseManagementResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DisableExternalDbSystemStackMonitoringResponse disableExternalDbSystemStackMonitoring(
            DisableExternalDbSystemStackMonitoringRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalDbSystemStackMonitoringResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalDbSystemStackMonitoringResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DisableExternalExadataInfrastructureManagementResponse
            disableExternalExadataInfrastructureManagement(
                    DisableExternalExadataInfrastructureManagementRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalExadataInfrastructureManagementResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalExadataInfrastructureManagementResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DisableExternalNonContainerDatabaseManagementFeatureResponse
            disableExternalNonContainerDatabaseManagementFeature(
                    DisableExternalNonContainerDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDisableExternalNonContainerDatabaseManagementFeatureDetails(),
                "disableExternalNonContainerDatabaseManagementFeatureDetails is required");

        return clientCall(
                        request,
                        DisableExternalNonContainerDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "disableExternalNonContainerDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "DisableExternalNonContainerDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableExternalNonContainerDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        DisableExternalNonContainerDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalNonContainerDatabaseManagementFeatureResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalNonContainerDatabaseManagementFeatureResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DisableExternalPluggableDatabaseManagementFeatureResponse
            disableExternalPluggableDatabaseManagementFeature(
                    DisableExternalPluggableDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDisableExternalPluggableDatabaseManagementFeatureDetails(),
                "disableExternalPluggableDatabaseManagementFeatureDetails is required");

        return clientCall(
                        request, DisableExternalPluggableDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "disableExternalPluggableDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "DisableExternalPluggableDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableExternalPluggableDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalPluggableDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalPluggableDatabaseManagementFeatureResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalPluggableDatabaseManagementFeatureResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse
            disableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request) {

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
                .callSync();
    }

    @Override
    public DisablePluggableDatabaseManagementFeatureResponse
            disablePluggableDatabaseManagementFeature(
                    DisablePluggableDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDisablePluggableDatabaseManagementFeatureDetails(),
                "disablePluggableDatabaseManagementFeatureDetails is required");

        return clientCall(request, DisablePluggableDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "disablePluggableDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "DisablePluggableDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisablePluggableDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisablePluggableDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("pluggabledatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisablePluggableDatabaseManagementFeatureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisablePluggableDatabaseManagementFeatureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DisableSqlPlanBaselinesUsageResponse disableSqlPlanBaselinesUsage(
            DisableSqlPlanBaselinesUsageRequest request) {

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
                .callSync();
    }

    @Override
    public DiscoverExternalExadataInfrastructureResponse discoverExternalExadataInfrastructure(
            DiscoverExternalExadataInfrastructureRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public DropSqlPlanBaselinesResponse dropSqlPlanBaselines(DropSqlPlanBaselinesRequest request) {

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
    public EnableAutomaticInitialPlanCaptureResponse enableAutomaticInitialPlanCapture(
            EnableAutomaticInitialPlanCaptureRequest request) {

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
                .callSync();
    }

    @Override
    public EnableAutomaticSpmEvolveAdvisorTaskResponse enableAutomaticSpmEvolveAdvisorTask(
            EnableAutomaticSpmEvolveAdvisorTaskRequest request) {

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
                .callSync();
    }

    @Override
    public EnableAutonomousDatabaseManagementFeatureResponse
            enableAutonomousDatabaseManagementFeature(
                    EnableAutonomousDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableAutonomousDatabaseManagementFeatureDetails(),
                "enableAutonomousDatabaseManagementFeatureDetails is required");

        return clientCall(request, EnableAutonomousDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "enableAutonomousDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "EnableAutonomousDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableAutonomousDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableAutonomousDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableAutonomousDatabaseManagementFeatureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableAutonomousDatabaseManagementFeatureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public EnableDatabaseManagementFeatureResponse enableDatabaseManagementFeature(
            EnableDatabaseManagementFeatureRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableDatabaseManagementFeatureDetails(),
                "enableDatabaseManagementFeatureDetails is required");

        return clientCall(request, EnableDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "enableDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "EnableDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableDatabaseManagementFeatureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableDatabaseManagementFeatureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public EnableExternalContainerDatabaseManagementFeatureResponse
            enableExternalContainerDatabaseManagementFeature(
                    EnableExternalContainerDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalContainerDatabaseManagementFeatureDetails(),
                "enableExternalContainerDatabaseManagementFeatureDetails is required");

        return clientCall(
                        request, EnableExternalContainerDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "enableExternalContainerDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "EnableExternalContainerDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableExternalContainerDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalContainerDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalContainerDatabaseManagementFeatureResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalContainerDatabaseManagementFeatureResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public EnableExternalDbSystemDatabaseManagementResponse
            enableExternalDbSystemDatabaseManagement(
                    EnableExternalDbSystemDatabaseManagementRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalDbSystemDatabaseManagementResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalDbSystemDatabaseManagementResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public EnableExternalDbSystemStackMonitoringResponse enableExternalDbSystemStackMonitoring(
            EnableExternalDbSystemStackMonitoringRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalDbSystemStackMonitoringResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalDbSystemStackMonitoringResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public EnableExternalExadataInfrastructureManagementResponse
            enableExternalExadataInfrastructureManagement(
                    EnableExternalExadataInfrastructureManagementRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalExadataInfrastructureManagementResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalExadataInfrastructureManagementResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public EnableExternalNonContainerDatabaseManagementFeatureResponse
            enableExternalNonContainerDatabaseManagementFeature(
                    EnableExternalNonContainerDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalNonContainerDatabaseManagementFeatureDetails(),
                "enableExternalNonContainerDatabaseManagementFeatureDetails is required");

        return clientCall(
                        request,
                        EnableExternalNonContainerDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "enableExternalNonContainerDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "EnableExternalNonContainerDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableExternalNonContainerDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalNonContainerDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalNonContainerDatabaseManagementFeatureResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalNonContainerDatabaseManagementFeatureResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public EnableExternalPluggableDatabaseManagementFeatureResponse
            enableExternalPluggableDatabaseManagementFeature(
                    EnableExternalPluggableDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalPluggableDatabaseManagementFeatureDetails(),
                "enableExternalPluggableDatabaseManagementFeatureDetails is required");

        return clientCall(
                        request, EnableExternalPluggableDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "enableExternalPluggableDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "EnableExternalPluggableDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableExternalPluggableDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalPluggableDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalPluggableDatabaseManagementFeatureResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalPluggableDatabaseManagementFeatureResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse
            enableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request) {

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
                .callSync();
    }

    @Override
    public EnablePluggableDatabaseManagementFeatureResponse
            enablePluggableDatabaseManagementFeature(
                    EnablePluggableDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnablePluggableDatabaseManagementFeatureDetails(),
                "enablePluggableDatabaseManagementFeatureDetails is required");

        return clientCall(request, EnablePluggableDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "enablePluggableDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "EnablePluggableDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnablePluggableDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnablePluggableDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("pluggabledatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnablePluggableDatabaseManagementFeatureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnablePluggableDatabaseManagementFeatureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public EnableSqlPlanBaselinesUsageResponse enableSqlPlanBaselinesUsage(
            EnableSqlPlanBaselinesUsageRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam(
                        "filterByDatabaseDeploymentType",
                        request.getFilterByDatabaseDeploymentType())
                .appendQueryParam("filterByDatabaseVersion", request.getFilterByDatabaseVersion())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.DatabaseFleetHealthMetrics.class,
                        GetDatabaseFleetHealthMetricsResponse.Builder::databaseFleetHealthMetrics)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseFleetHealthMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetDatabaseFleetHealthMetricsResponse.Builder::opcNextPage)
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
    public GetDataguardPerformanceMetricsResponse getDataguardPerformanceMetrics(
            GetDataguardPerformanceMetricsRequest request) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, GetDataguardPerformanceMetricsResponse::builder)
                .logger(LOG, "getDataguardPerformanceMetrics")
                .serviceDetails(
                        "DbManagement",
                        "GetDataguardPerformanceMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DataguardPerformanceMetrics/GetDataguardPerformanceMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataguardPerformanceMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("dataguardPerformanceMetrics")
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendQueryParam(
                        "peerDatabaseCompartmentId", request.getPeerDatabaseCompartmentId())
                .appendQueryParam("filterByMetricNames", request.getFilterByMetricNames())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.DataguardPerformanceMetrics.class,
                        GetDataguardPerformanceMetricsResponse.Builder::dataguardPerformanceMetrics)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDataguardPerformanceMetricsResponse.Builder::opcRequestId)
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
    public GetExternalAsmResponse getExternalAsm(GetExternalAsmRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsm.class,
                        GetExternalAsmResponse.Builder::externalAsm)
                .handleResponseHeaderString("etag", GetExternalAsmResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalAsmResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalAsmConfigurationResponse getExternalAsmConfiguration(
            GetExternalAsmConfigurationRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmConfiguration.class,
                        GetExternalAsmConfigurationResponse.Builder::externalAsmConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalAsmConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalAsmInstanceResponse getExternalAsmInstance(
            GetExternalAsmInstanceRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmInstance.class,
                        GetExternalAsmInstanceResponse.Builder::externalAsmInstance)
                .handleResponseHeaderString("etag", GetExternalAsmInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalAsmInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalClusterResponse getExternalCluster(GetExternalClusterRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalCluster.class,
                        GetExternalClusterResponse.Builder::externalCluster)
                .handleResponseHeaderString("etag", GetExternalClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalClusterInstanceResponse getExternalClusterInstance(
            GetExternalClusterInstanceRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalClusterInstance.class,
                        GetExternalClusterInstanceResponse.Builder::externalClusterInstance)
                .handleResponseHeaderString(
                        "etag", GetExternalClusterInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalClusterInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalDbHomeResponse getExternalDbHome(GetExternalDbHomeRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbHome.class,
                        GetExternalDbHomeResponse.Builder::externalDbHome)
                .handleResponseHeaderString("etag", GetExternalDbHomeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalDbHomeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalDbNodeResponse getExternalDbNode(GetExternalDbNodeRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbNode.class,
                        GetExternalDbNodeResponse.Builder::externalDbNode)
                .handleResponseHeaderString("etag", GetExternalDbNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalDbNodeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalDbSystemResponse getExternalDbSystem(GetExternalDbSystemRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystem.class,
                        GetExternalDbSystemResponse.Builder::externalDbSystem)
                .handleResponseHeaderString("etag", GetExternalDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalDbSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalDbSystemConnectorResponse getExternalDbSystemConnector(
            GetExternalDbSystemConnectorRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector.class,
                        GetExternalDbSystemConnectorResponse.Builder::externalDbSystemConnector)
                .handleResponseHeaderString(
                        "etag", GetExternalDbSystemConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalDbSystemConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalDbSystemDiscoveryResponse getExternalDbSystemDiscovery(
            GetExternalDbSystemDiscoveryRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery.class,
                        GetExternalDbSystemDiscoveryResponse.Builder::externalDbSystemDiscovery)
                .handleResponseHeaderString(
                        "etag", GetExternalDbSystemDiscoveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalDbSystemDiscoveryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalExadataInfrastructureResponse getExternalExadataInfrastructure(
            GetExternalExadataInfrastructureRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataInfrastructure.class,
                        GetExternalExadataInfrastructureResponse.Builder
                                ::externalExadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetExternalExadataInfrastructureResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetExternalExadataStorageConnectorResponse getExternalExadataStorageConnector(
            GetExternalExadataStorageConnectorRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public GetExternalExadataStorageGridResponse getExternalExadataStorageGrid(
            GetExternalExadataStorageGridRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataStorageGrid.class,
                        GetExternalExadataStorageGridResponse.Builder::externalExadataStorageGrid)
                .handleResponseHeaderString(
                        "etag", GetExternalExadataStorageGridResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalExadataStorageGridResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalExadataStorageServerResponse getExternalExadataStorageServer(
            GetExternalExadataStorageServerRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataStorageServer.class,
                        GetExternalExadataStorageServerResponse.Builder
                                ::externalExadataStorageServer)
                .handleResponseHeaderString(
                        "etag", GetExternalExadataStorageServerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalExadataStorageServerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalListenerResponse getExternalListener(GetExternalListenerRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalListener.class,
                        GetExternalListenerResponse.Builder::externalListener)
                .handleResponseHeaderString("etag", GetExternalListenerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalListenerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetIormPlanResponse getIormPlan(GetIormPlanRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.IormPlan.class,
                        GetIormPlanResponse.Builder::iormPlan)
                .handleResponseHeaderString(
                        "opc-request-id", GetIormPlanResponse.Builder::opcRequestId)
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
                .handleResponseHeaderString("etag", GetManagedDatabaseResponse.Builder::etag)
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
    public GetNamedCredentialResponse getNamedCredential(GetNamedCredentialRequest request) {

        Validate.notBlank(request.getNamedCredentialId(), "namedCredentialId must not be blank");

        return clientCall(request, GetNamedCredentialResponse::builder)
                .logger(LOG, "getNamedCredential")
                .serviceDetails(
                        "DbManagement",
                        "GetNamedCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/GetNamedCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNamedCredentialRequest::builder)
                .basePath("/20201101")
                .appendPathParam("namedCredentials")
                .appendPathParam(request.getNamedCredentialId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.NamedCredential.class,
                        GetNamedCredentialResponse.Builder::namedCredential)
                .handleResponseHeaderString(
                        "opc-request-id", GetNamedCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetNamedCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetOpenAlertHistoryResponse getOpenAlertHistory(GetOpenAlertHistoryRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.OpenAlertHistory.class,
                        GetOpenAlertHistoryResponse.Builder::openAlertHistory)
                .handleResponseHeaderString(
                        "opc-request-id", GetOpenAlertHistoryResponse.Builder::opcRequestId)
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
    public GetPeerDatabaseMetricsResponse getPeerDatabaseMetrics(
            GetPeerDatabaseMetricsRequest request) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, GetPeerDatabaseMetricsResponse::builder)
                .logger(LOG, "getPeerDatabaseMetrics")
                .serviceDetails(
                        "DbManagement",
                        "GetPeerDatabaseMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PeerDatabaseMetrics/GetPeerDatabaseMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPeerDatabaseMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("peerDatabaseMetrics")
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendQueryParam(
                        "peerDatabaseCompartmentId", request.getPeerDatabaseCompartmentId())
                .appendEnumQueryParam("compareType", request.getCompareType())
                .appendQueryParam("filterByMetricNames", request.getFilterByMetricNames())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.PeerDatabaseMetrics.class,
                        GetPeerDatabaseMetricsResponse.Builder::peerDatabaseMetrics)
                .handleResponseHeaderString(
                        "opc-request-id", GetPeerDatabaseMetricsResponse.Builder::opcRequestId)
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
    public GetSqlPlanBaselineResponse getSqlPlanBaseline(GetSqlPlanBaselineRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaseline.class,
                        GetSqlPlanBaselineResponse.Builder::sqlPlanBaseline)
                .handleResponseHeaderString(
                        "opc-request-id", GetSqlPlanBaselineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSqlPlanBaselineConfigurationResponse getSqlPlanBaselineConfiguration(
            GetSqlPlanBaselineConfigurationRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineConfiguration.class,
                        GetSqlPlanBaselineConfigurationResponse.Builder
                                ::sqlPlanBaselineConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetSqlPlanBaselineConfigurationResponse.Builder::opcRequestId)
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.Tablespace.class,
                        GetTablespaceResponse.Builder::tablespace)
                .handleResponseHeaderString(
                        "opc-request-id", GetTablespaceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTopSqlCpuActivityResponse getTopSqlCpuActivity(GetTopSqlCpuActivityRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.TopSqlCpuActivity.class,
                        GetTopSqlCpuActivityResponse.Builder::topSqlCpuActivity)
                .handleResponseHeaderString(
                        "opc-request-id", GetTopSqlCpuActivityResponse.Builder::opcRequestId)
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
    public ListCursorCacheStatementsResponse listCursorCacheStatements(
            ListCursorCacheStatementsRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.CursorCacheStatementCollection
                                .class,
                        ListCursorCacheStatementsResponse.Builder::cursorCacheStatementCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCursorCacheStatementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCursorCacheStatementsResponse.Builder::opcNextPage)
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendQueryParam("isDnsResolutionEnabled", request.getIsDnsResolutionEnabled())
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
    public ListExternalAsmDiskGroupsResponse listExternalAsmDiskGroups(
            ListExternalAsmDiskGroupsRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmDiskGroupCollection
                                .class,
                        ListExternalAsmDiskGroupsResponse.Builder::externalAsmDiskGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalAsmDiskGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalAsmDiskGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalAsmInstancesResponse listExternalAsmInstances(
            ListExternalAsmInstancesRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmInstanceCollection.class,
                        ListExternalAsmInstancesResponse.Builder::externalAsmInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalAsmInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalAsmInstancesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalAsmUsersResponse listExternalAsmUsers(ListExternalAsmUsersRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmUserCollection.class,
                        ListExternalAsmUsersResponse.Builder::externalAsmUserCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalAsmUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalAsmUsersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalAsmsResponse listExternalAsms(ListExternalAsmsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmCollection.class,
                        ListExternalAsmsResponse.Builder::externalAsmCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalAsmsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalAsmsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalClusterInstancesResponse listExternalClusterInstances(
            ListExternalClusterInstancesRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListExternalClustersResponse listExternalClusters(ListExternalClustersRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalClusterCollection.class,
                        ListExternalClustersResponse.Builder::externalClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalClustersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalDatabasesResponse listExternalDatabases(
            ListExternalDatabasesRequest request) {

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
                .appendQueryParam("externalDatabaseId", request.getExternalDatabaseId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDatabaseCollection.class,
                        ListExternalDatabasesResponse.Builder::externalDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalDatabasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalDbHomesResponse listExternalDbHomes(ListExternalDbHomesRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbHomeCollection.class,
                        ListExternalDbHomesResponse.Builder::externalDbHomeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalDbHomesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalDbHomesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalDbNodesResponse listExternalDbNodes(ListExternalDbNodesRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbNodeCollection.class,
                        ListExternalDbNodesResponse.Builder::externalDbNodeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalDbNodesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalDbNodesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalDbSystemConnectorsResponse listExternalDbSystemConnectors(
            ListExternalDbSystemConnectorsRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListExternalDbSystemDiscoveriesResponse listExternalDbSystemDiscoveries(
            ListExternalDbSystemDiscoveriesRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListExternalDbSystemsResponse listExternalDbSystems(
            ListExternalDbSystemsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemCollection.class,
                        ListExternalDbSystemsResponse.Builder::externalDbSystemCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalDbSystemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalDbSystemsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalExadataInfrastructuresResponse listExternalExadataInfrastructures(
            ListExternalExadataInfrastructuresRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListExternalExadataStorageConnectorsResponse listExternalExadataStorageConnectors(
            ListExternalExadataStorageConnectorsRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListExternalExadataStorageServersResponse listExternalExadataStorageServers(
            ListExternalExadataStorageServersRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListExternalListenerServicesResponse listExternalListenerServices(
            ListExternalListenerServicesRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListExternalListenersResponse listExternalListeners(
            ListExternalListenersRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalListenerCollection.class,
                        ListExternalListenersResponse.Builder::externalListenerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalListenersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalListenersResponse.Builder::opcNextPage)
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
                .callSync();
    }

    @Override
    public ListNamedCredentialsResponse listNamedCredentials(ListNamedCredentialsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNamedCredentialsResponse::builder)
                .logger(LOG, "listNamedCredentials")
                .serviceDetails(
                        "DbManagement",
                        "ListNamedCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/ListNamedCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNamedCredentialsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("namedCredentials")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("associatedResource", request.getAssociatedResource())
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.NamedCredentialCollection.class,
                        ListNamedCredentialsResponse.Builder::namedCredentialCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNamedCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNamedCredentialsResponse.Builder::opcNextPage)
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.RoleCollection.class,
                        ListRolesResponse.Builder::roleCollection)
                .handleResponseHeaderString("opc-next-page", ListRolesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListRolesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSqlPlanBaselineJobsResponse listSqlPlanBaselineJobs(
            ListSqlPlanBaselineJobsRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineJobCollection.class,
                        ListSqlPlanBaselineJobsResponse.Builder::sqlPlanBaselineJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlPlanBaselineJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlPlanBaselineJobsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSqlPlanBaselinesResponse listSqlPlanBaselines(ListSqlPlanBaselinesRequest request) {

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
                .appendQueryParam("isAutoPurged", request.getIsAutoPurged())
                .appendQueryParam(
                        "timeLastExecutedGreaterThan", request.getTimeLastExecutedGreaterThan())
                .appendQueryParam("timeLastExecutedLessThan", request.getTimeLastExecutedLessThan())
                .appendQueryParam("isNeverExecuted", request.getIsNeverExecuted())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineCollection.class,
                        ListSqlPlanBaselinesResponse.Builder::sqlPlanBaselineCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlPlanBaselinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlPlanBaselinesResponse.Builder::opcNextPage)
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
    public LoadSqlPlanBaselinesFromAwrResponse loadSqlPlanBaselinesFromAwr(
            LoadSqlPlanBaselinesFromAwrRequest request) {

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
                .callSync();
    }

    @Override
    public LoadSqlPlanBaselinesFromCursorCacheResponse loadSqlPlanBaselinesFromCursorCache(
            LoadSqlPlanBaselinesFromCursorCacheRequest request) {

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
                .callSync();
    }

    @Override
    public ModifyAutonomousDatabaseManagementFeatureResponse
            modifyAutonomousDatabaseManagementFeature(
                    ModifyAutonomousDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getModifyAutonomousDatabaseManagementFeatureDetails(),
                "modifyAutonomousDatabaseManagementFeatureDetails is required");

        return clientCall(request, ModifyAutonomousDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "modifyAutonomousDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "ModifyAutonomousDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ModifyAutonomousDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ModifyAutonomousDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("modifyDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ModifyAutonomousDatabaseManagementFeatureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ModifyAutonomousDatabaseManagementFeatureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ModifyDatabaseManagementFeatureResponse modifyDatabaseManagementFeature(
            ModifyDatabaseManagementFeatureRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getModifyDatabaseManagementFeatureDetails(),
                "modifyDatabaseManagementFeatureDetails is required");

        return clientCall(request, ModifyDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "modifyDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "ModifyDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ModifyDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ModifyDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("modifyDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ModifyDatabaseManagementFeatureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ModifyDatabaseManagementFeatureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ModifyPluggableDatabaseManagementFeatureResponse
            modifyPluggableDatabaseManagementFeature(
                    ModifyPluggableDatabaseManagementFeatureRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getModifyPluggableDatabaseManagementFeatureDetails(),
                "modifyPluggableDatabaseManagementFeatureDetails is required");

        return clientCall(request, ModifyPluggableDatabaseManagementFeatureResponse::builder)
                .logger(LOG, "modifyPluggableDatabaseManagementFeature")
                .serviceDetails(
                        "DbManagement",
                        "ModifyPluggableDatabaseManagementFeature",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ModifyPluggableDatabaseManagementFeature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ModifyPluggableDatabaseManagementFeatureRequest::builder)
                .basePath("/20201101")
                .appendPathParam("pluggabledatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("modifyDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ModifyPluggableDatabaseManagementFeatureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ModifyPluggableDatabaseManagementFeatureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public PatchExternalDbSystemDiscoveryResponse patchExternalDbSystemDiscovery(
            PatchExternalDbSystemDiscoveryRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
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
    public SummarizeExternalAsmMetricsResponse summarizeExternalAsmMetrics(
            SummarizeExternalAsmMetricsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MetricsAggregationRangeCollection
                                .class,
                        SummarizeExternalAsmMetricsResponse.Builder
                                ::metricsAggregationRangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeExternalAsmMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeExternalAsmMetricsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeExternalClusterMetricsResponse summarizeExternalClusterMetrics(
            SummarizeExternalClusterMetricsRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public SummarizeExternalDbNodeMetricsResponse summarizeExternalDbNodeMetrics(
            SummarizeExternalDbNodeMetricsRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public SummarizeExternalDbSystemAvailabilityMetricsResponse
            summarizeExternalDbSystemAvailabilityMetrics(
                    SummarizeExternalDbSystemAvailabilityMetricsRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public SummarizeExternalListenerMetricsResponse summarizeExternalListenerMetrics(
            SummarizeExternalListenerMetricsRequest request) {

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
                .operationUsesDefaultRetries()
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
    public SummarizeManagedDatabaseAvailabilityMetricsResponse
            summarizeManagedDatabaseAvailabilityMetrics(
                    SummarizeManagedDatabaseAvailabilityMetricsRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public SummarizeSqlPlanBaselinesResponse summarizeSqlPlanBaselines(
            SummarizeSqlPlanBaselinesRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlPlanBaselineAggregationCollection
                                .class,
                        SummarizeSqlPlanBaselinesResponse.Builder
                                ::sqlPlanBaselineAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeSqlPlanBaselinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeSqlPlanBaselinesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeSqlPlanBaselinesByLastExecutionResponse
            summarizeSqlPlanBaselinesByLastExecution(
                    SummarizeSqlPlanBaselinesByLastExecutionRequest request) {

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
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public TestNamedCredentialResponse testNamedCredential(TestNamedCredentialRequest request) {

        Validate.notBlank(request.getNamedCredentialId(), "namedCredentialId must not be blank");
        Objects.requireNonNull(
                request.getTestNamedCredentialDetails(), "testNamedCredentialDetails is required");

        return clientCall(request, TestNamedCredentialResponse::builder)
                .logger(LOG, "testNamedCredential")
                .serviceDetails(
                        "DbManagement",
                        "TestNamedCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/TestNamedCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TestNamedCredentialRequest::builder)
                .basePath("/20201101")
                .appendPathParam("namedCredentials")
                .appendPathParam(request.getNamedCredentialId())
                .appendPathParam("actions")
                .appendPathParam("test")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.TestNamedCredentialStatus.class,
                        TestNamedCredentialResponse.Builder::testNamedCredentialStatus)
                .handleResponseHeaderString(
                        "opc-request-id", TestNamedCredentialResponse.Builder::opcRequestId)
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
    public UpdateExternalAsmResponse updateExternalAsm(UpdateExternalAsmRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateExternalAsmInstanceResponse updateExternalAsmInstance(
            UpdateExternalAsmInstanceRequest request) {

        Validate.notBlank(
                request.getExternalAsmInstanceId(), "externalAsmInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalAsmInstanceDetails(),
                "updateExternalAsmInstanceDetails is required");

        return clientCall(request, UpdateExternalAsmInstanceResponse::builder)
                .logger(LOG, "updateExternalAsmInstance")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalAsmInstance",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsmInstance/UpdateExternalAsmInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalAsmInstanceRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalAsmInstances")
                .appendPathParam(request.getExternalAsmInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalAsmInstance.class,
                        UpdateExternalAsmInstanceResponse.Builder::externalAsmInstance)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExternalAsmInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateExternalAsmInstanceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateExternalClusterResponse updateExternalCluster(
            UpdateExternalClusterRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateExternalClusterInstanceResponse updateExternalClusterInstance(
            UpdateExternalClusterInstanceRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateExternalDbHomeResponse updateExternalDbHome(UpdateExternalDbHomeRequest request) {

        Validate.notBlank(request.getExternalDbHomeId(), "externalDbHomeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalDbHomeDetails(),
                "updateExternalDbHomeDetails is required");

        return clientCall(request, UpdateExternalDbHomeResponse::builder)
                .logger(LOG, "updateExternalDbHome")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalDbHome",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbHome/UpdateExternalDbHome")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalDbHomeRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalDbHomes")
                .appendPathParam(request.getExternalDbHomeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalDbHome.class,
                        UpdateExternalDbHomeResponse.Builder::externalDbHome)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExternalDbHomeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateExternalDbHomeResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateExternalDbNodeResponse updateExternalDbNode(UpdateExternalDbNodeRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateExternalDbSystemResponse updateExternalDbSystem(
            UpdateExternalDbSystemRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateExternalDbSystemConnectorResponse updateExternalDbSystemConnector(
            UpdateExternalDbSystemConnectorRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateExternalDbSystemDiscoveryResponse updateExternalDbSystemDiscovery(
            UpdateExternalDbSystemDiscoveryRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateExternalExadataInfrastructureResponse updateExternalExadataInfrastructure(
            UpdateExternalExadataInfrastructureRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public UpdateExternalExadataStorageConnectorResponse updateExternalExadataStorageConnector(
            UpdateExternalExadataStorageConnectorRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateExternalExadataStorageGridResponse updateExternalExadataStorageGrid(
            UpdateExternalExadataStorageGridRequest request) {

        Validate.notBlank(
                request.getExternalExadataStorageGridId(),
                "externalExadataStorageGridId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalExadataStorageGridDetails(),
                "updateExternalExadataStorageGridDetails is required");

        return clientCall(request, UpdateExternalExadataStorageGridResponse::builder)
                .logger(LOG, "updateExternalExadataStorageGrid")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalExadataStorageGrid",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageGrid/UpdateExternalExadataStorageGrid")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalExadataStorageGridRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageGrids")
                .appendPathParam(request.getExternalExadataStorageGridId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataStorageGrid.class,
                        UpdateExternalExadataStorageGridResponse.Builder
                                ::externalExadataStorageGrid)
                .handleResponseHeaderString(
                        "etag", UpdateExternalExadataStorageGridResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalExadataStorageGridResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateExternalExadataStorageServerResponse updateExternalExadataStorageServer(
            UpdateExternalExadataStorageServerRequest request) {

        Validate.notBlank(
                request.getExternalExadataStorageServerId(),
                "externalExadataStorageServerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalExadataStorageServerDetails(),
                "updateExternalExadataStorageServerDetails is required");

        return clientCall(request, UpdateExternalExadataStorageServerResponse::builder)
                .logger(LOG, "updateExternalExadataStorageServer")
                .serviceDetails(
                        "DbManagement",
                        "UpdateExternalExadataStorageServer",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/UpdateExternalExadataStorageServer")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalExadataStorageServerRequest::builder)
                .basePath("/20201101")
                .appendPathParam("externalExadataStorageServers")
                .appendPathParam(request.getExternalExadataStorageServerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExternalExadataStorageServer.class,
                        UpdateExternalExadataStorageServerResponse.Builder
                                ::externalExadataStorageServer)
                .handleResponseHeaderString(
                        "etag", UpdateExternalExadataStorageServerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalExadataStorageServerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateExternalListenerResponse updateExternalListener(
            UpdateExternalListenerRequest request) {

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
    public UpdateManagedDatabaseResponse updateManagedDatabase(
            UpdateManagedDatabaseRequest request) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagedDatabaseDetails(),
                "updateManagedDatabaseDetails is required");

        return clientCall(request, UpdateManagedDatabaseResponse::builder)
                .logger(LOG, "updateManagedDatabase")
                .serviceDetails(
                        "DbManagement",
                        "UpdateManagedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/UpdateManagedDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagedDatabaseRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ManagedDatabase.class,
                        UpdateManagedDatabaseResponse.Builder::managedDatabase)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagedDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateManagedDatabaseResponse.Builder::etag)
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
    public UpdateNamedCredentialResponse updateNamedCredential(
            UpdateNamedCredentialRequest request) {

        Validate.notBlank(request.getNamedCredentialId(), "namedCredentialId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNamedCredentialDetails(),
                "updateNamedCredentialDetails is required");

        return clientCall(request, UpdateNamedCredentialResponse::builder)
                .logger(LOG, "updateNamedCredential")
                .serviceDetails(
                        "DbManagement",
                        "UpdateNamedCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/UpdateNamedCredential")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNamedCredentialRequest::builder)
                .basePath("/20201101")
                .appendPathParam("namedCredentials")
                .appendPathParam(request.getNamedCredentialId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.NamedCredential.class,
                        UpdateNamedCredentialResponse.Builder::namedCredential)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNamedCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateNamedCredentialResponse.Builder::etag)
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
