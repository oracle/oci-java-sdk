/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasetools.requests.*;
import com.oracle.bmc.databasetools.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class DatabaseToolsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DatabaseTools {
    /** Service instance for DatabaseTools. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatabaseToolsClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbtools.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseToolsClient.class);

    private final DatabaseToolsWaiters waiters;

    private final DatabaseToolsPaginators paginators;

    DatabaseToolsClient(
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
                                    .nameFormat("DatabaseTools-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DatabaseToolsWaiters(executorService, this);

        this.paginators = new DatabaseToolsPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DatabaseToolsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "databasetools";
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
        public DatabaseToolsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatabaseToolsClient(this, authenticationDetailsProvider, executorService);
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
    public AddDatabaseToolsConnectionLockResponse addDatabaseToolsConnectionLock(
            AddDatabaseToolsConnectionLockRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddDatabaseToolsConnectionLockResponse::builder)
                .logger(LOG, "addDatabaseToolsConnectionLock")
                .serviceDetails(
                        "DatabaseTools",
                        "AddDatabaseToolsConnectionLock",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsConnection/AddDatabaseToolsConnectionLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDatabaseToolsConnectionLockRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsConnection.class,
                        AddDatabaseToolsConnectionLockResponse.Builder::databaseToolsConnection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddDatabaseToolsConnectionLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", AddDatabaseToolsConnectionLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public AddDatabaseToolsIdentityLockResponse addDatabaseToolsIdentityLock(
            AddDatabaseToolsIdentityLockRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsIdentityId(), "databaseToolsIdentityId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddDatabaseToolsIdentityLockResponse::builder)
                .logger(LOG, "addDatabaseToolsIdentityLock")
                .serviceDetails(
                        "DatabaseTools",
                        "AddDatabaseToolsIdentityLock",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsIdentity/AddDatabaseToolsIdentityLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDatabaseToolsIdentityLockRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsIdentities")
                .appendPathParam(request.getDatabaseToolsIdentityId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsIdentity.class,
                        AddDatabaseToolsIdentityLockResponse.Builder::databaseToolsIdentity)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddDatabaseToolsIdentityLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", AddDatabaseToolsIdentityLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public AddDatabaseToolsPrivateEndpointLockResponse addDatabaseToolsPrivateEndpointLock(
            AddDatabaseToolsPrivateEndpointLockRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsPrivateEndpointId(),
                "databaseToolsPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddDatabaseToolsPrivateEndpointLockResponse::builder)
                .logger(LOG, "addDatabaseToolsPrivateEndpointLock")
                .serviceDetails(
                        "DatabaseTools",
                        "AddDatabaseToolsPrivateEndpointLock",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsPrivateEndpoint/AddDatabaseToolsPrivateEndpointLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDatabaseToolsPrivateEndpointLockRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsPrivateEndpoints")
                .appendPathParam(request.getDatabaseToolsPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpoint.class,
                        AddDatabaseToolsPrivateEndpointLockResponse.Builder
                                ::databaseToolsPrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddDatabaseToolsPrivateEndpointLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", AddDatabaseToolsPrivateEndpointLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ChangeDatabaseToolsConnectionCompartmentResponse
            changeDatabaseToolsConnectionCompartment(
                    ChangeDatabaseToolsConnectionCompartmentRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatabaseToolsConnectionCompartmentDetails(),
                "changeDatabaseToolsConnectionCompartmentDetails is required");

        return clientCall(request, ChangeDatabaseToolsConnectionCompartmentResponse::builder)
                .logger(LOG, "changeDatabaseToolsConnectionCompartment")
                .serviceDetails(
                        "DatabaseTools",
                        "ChangeDatabaseToolsConnectionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsConnection/ChangeDatabaseToolsConnectionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatabaseToolsConnectionCompartmentRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDatabaseToolsConnectionCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDatabaseToolsConnectionCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDatabaseToolsIdentityCompartmentResponse changeDatabaseToolsIdentityCompartment(
            ChangeDatabaseToolsIdentityCompartmentRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsIdentityId(), "databaseToolsIdentityId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatabaseToolsIdentityCompartmentDetails(),
                "changeDatabaseToolsIdentityCompartmentDetails is required");

        return clientCall(request, ChangeDatabaseToolsIdentityCompartmentResponse::builder)
                .logger(LOG, "changeDatabaseToolsIdentityCompartment")
                .serviceDetails(
                        "DatabaseTools",
                        "ChangeDatabaseToolsIdentityCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsIdentity/ChangeDatabaseToolsIdentityCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatabaseToolsIdentityCompartmentRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsIdentities")
                .appendPathParam(request.getDatabaseToolsIdentityId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDatabaseToolsIdentityCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDatabaseToolsIdentityCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDatabaseToolsPrivateEndpointCompartmentResponse
            changeDatabaseToolsPrivateEndpointCompartment(
                    ChangeDatabaseToolsPrivateEndpointCompartmentRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsPrivateEndpointId(),
                "databaseToolsPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatabaseToolsPrivateEndpointCompartmentDetails(),
                "changeDatabaseToolsPrivateEndpointCompartmentDetails is required");

        return clientCall(request, ChangeDatabaseToolsPrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeDatabaseToolsPrivateEndpointCompartment")
                .serviceDetails(
                        "DatabaseTools",
                        "ChangeDatabaseToolsPrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsPrivateEndpoint/ChangeDatabaseToolsPrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatabaseToolsPrivateEndpointCompartmentRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsPrivateEndpoints")
                .appendPathParam(request.getDatabaseToolsPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDatabaseToolsPrivateEndpointCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDatabaseToolsPrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDatabaseToolsConnectionResponse createDatabaseToolsConnection(
            CreateDatabaseToolsConnectionRequest request) {
        Objects.requireNonNull(
                request.getCreateDatabaseToolsConnectionDetails(),
                "createDatabaseToolsConnectionDetails is required");

        return clientCall(request, CreateDatabaseToolsConnectionResponse::builder)
                .logger(LOG, "createDatabaseToolsConnection")
                .serviceDetails("DatabaseTools", "CreateDatabaseToolsConnection", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatabaseToolsConnectionRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsConnections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsConnection.class,
                        CreateDatabaseToolsConnectionResponse.Builder::databaseToolsConnection)
                .handleResponseHeaderString(
                        "location", CreateDatabaseToolsConnectionResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", CreateDatabaseToolsConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDatabaseToolsConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDatabaseToolsConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDatabaseToolsIdentityResponse createDatabaseToolsIdentity(
            CreateDatabaseToolsIdentityRequest request) {
        Objects.requireNonNull(
                request.getCreateDatabaseToolsIdentityDetails(),
                "createDatabaseToolsIdentityDetails is required");

        return clientCall(request, CreateDatabaseToolsIdentityResponse::builder)
                .logger(LOG, "createDatabaseToolsIdentity")
                .serviceDetails("DatabaseTools", "CreateDatabaseToolsIdentity", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatabaseToolsIdentityRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsIdentities")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsIdentity.class,
                        CreateDatabaseToolsIdentityResponse.Builder::databaseToolsIdentity)
                .handleResponseHeaderString(
                        "location", CreateDatabaseToolsIdentityResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", CreateDatabaseToolsIdentityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDatabaseToolsIdentityResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatabaseToolsIdentityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDatabaseToolsPrivateEndpointResponse createDatabaseToolsPrivateEndpoint(
            CreateDatabaseToolsPrivateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreateDatabaseToolsPrivateEndpointDetails(),
                "createDatabaseToolsPrivateEndpointDetails is required");

        return clientCall(request, CreateDatabaseToolsPrivateEndpointResponse::builder)
                .logger(LOG, "createDatabaseToolsPrivateEndpoint")
                .serviceDetails("DatabaseTools", "CreateDatabaseToolsPrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatabaseToolsPrivateEndpointRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsPrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpoint.class,
                        CreateDatabaseToolsPrivateEndpointResponse.Builder
                                ::databaseToolsPrivateEndpoint)
                .handleResponseHeaderString(
                        "location", CreateDatabaseToolsPrivateEndpointResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", CreateDatabaseToolsPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDatabaseToolsPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDatabaseToolsPrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDatabaseToolsConnectionResponse deleteDatabaseToolsConnection(
            DeleteDatabaseToolsConnectionRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        return clientCall(request, DeleteDatabaseToolsConnectionResponse::builder)
                .logger(LOG, "deleteDatabaseToolsConnection")
                .serviceDetails(
                        "DatabaseTools",
                        "DeleteDatabaseToolsConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsConnection/DeleteDatabaseToolsConnection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatabaseToolsConnectionRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDatabaseToolsConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDatabaseToolsConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDatabaseToolsIdentityResponse deleteDatabaseToolsIdentity(
            DeleteDatabaseToolsIdentityRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsIdentityId(), "databaseToolsIdentityId must not be blank");

        return clientCall(request, DeleteDatabaseToolsIdentityResponse::builder)
                .logger(LOG, "deleteDatabaseToolsIdentity")
                .serviceDetails(
                        "DatabaseTools",
                        "DeleteDatabaseToolsIdentity",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsIdentity/DeleteDatabaseToolsIdentity")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatabaseToolsIdentityRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsIdentities")
                .appendPathParam(request.getDatabaseToolsIdentityId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDatabaseToolsIdentityResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatabaseToolsIdentityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDatabaseToolsPrivateEndpointResponse deleteDatabaseToolsPrivateEndpoint(
            DeleteDatabaseToolsPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsPrivateEndpointId(),
                "databaseToolsPrivateEndpointId must not be blank");

        return clientCall(request, DeleteDatabaseToolsPrivateEndpointResponse::builder)
                .logger(LOG, "deleteDatabaseToolsPrivateEndpoint")
                .serviceDetails(
                        "DatabaseTools",
                        "DeleteDatabaseToolsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsPrivateEndpoint/DeleteDatabaseToolsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatabaseToolsPrivateEndpointRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsPrivateEndpoints")
                .appendPathParam(request.getDatabaseToolsPrivateEndpointId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDatabaseToolsPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDatabaseToolsPrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatabaseToolsConnectionResponse getDatabaseToolsConnection(
            GetDatabaseToolsConnectionRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        return clientCall(request, GetDatabaseToolsConnectionResponse::builder)
                .logger(LOG, "getDatabaseToolsConnection")
                .serviceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsConnection/GetDatabaseToolsConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseToolsConnectionRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsConnection.class,
                        GetDatabaseToolsConnectionResponse.Builder::databaseToolsConnection)
                .handleResponseHeaderString(
                        "etag", GetDatabaseToolsConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseToolsConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatabaseToolsEndpointServiceResponse getDatabaseToolsEndpointService(
            GetDatabaseToolsEndpointServiceRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsEndpointServiceId(),
                "databaseToolsEndpointServiceId must not be blank");

        return clientCall(request, GetDatabaseToolsEndpointServiceResponse::builder)
                .logger(LOG, "getDatabaseToolsEndpointService")
                .serviceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsEndpointService",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsEndpointService/GetDatabaseToolsEndpointService")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseToolsEndpointServiceRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsEndpointServices")
                .appendPathParam(request.getDatabaseToolsEndpointServiceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsEndpointService.class,
                        GetDatabaseToolsEndpointServiceResponse.Builder
                                ::databaseToolsEndpointService)
                .handleResponseHeaderString(
                        "etag", GetDatabaseToolsEndpointServiceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseToolsEndpointServiceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatabaseToolsIdentityResponse getDatabaseToolsIdentity(
            GetDatabaseToolsIdentityRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsIdentityId(), "databaseToolsIdentityId must not be blank");

        return clientCall(request, GetDatabaseToolsIdentityResponse::builder)
                .logger(LOG, "getDatabaseToolsIdentity")
                .serviceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsIdentity",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsIdentity/GetDatabaseToolsIdentity")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseToolsIdentityRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsIdentities")
                .appendPathParam(request.getDatabaseToolsIdentityId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsIdentity.class,
                        GetDatabaseToolsIdentityResponse.Builder::databaseToolsIdentity)
                .handleResponseHeaderString("etag", GetDatabaseToolsIdentityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseToolsIdentityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatabaseToolsPrivateEndpointResponse getDatabaseToolsPrivateEndpoint(
            GetDatabaseToolsPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsPrivateEndpointId(),
                "databaseToolsPrivateEndpointId must not be blank");

        return clientCall(request, GetDatabaseToolsPrivateEndpointResponse::builder)
                .logger(LOG, "getDatabaseToolsPrivateEndpoint")
                .serviceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsPrivateEndpoint/GetDatabaseToolsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseToolsPrivateEndpointRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsPrivateEndpoints")
                .appendPathParam(request.getDatabaseToolsPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpoint.class,
                        GetDatabaseToolsPrivateEndpointResponse.Builder
                                ::databaseToolsPrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", GetDatabaseToolsPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseToolsPrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "DatabaseTools",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20201005")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListDatabaseToolsConnectionsResponse listDatabaseToolsConnections(
            ListDatabaseToolsConnectionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatabaseToolsConnectionsResponse::builder)
                .logger(LOG, "listDatabaseToolsConnections")
                .serviceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsConnections",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsConnection/ListDatabaseToolsConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseToolsConnectionsRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsConnections")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "runtimeSupport",
                        request.getRuntimeSupport(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "runtimeIdentity",
                        request.getRuntimeIdentity(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "relatedResourceIdentifier", request.getRelatedResourceIdentifier())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsConnectionCollection.class,
                        ListDatabaseToolsConnectionsResponse.Builder
                                ::databaseToolsConnectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseToolsConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseToolsConnectionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDatabaseToolsEndpointServicesResponse listDatabaseToolsEndpointServices(
            ListDatabaseToolsEndpointServicesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatabaseToolsEndpointServicesResponse::builder)
                .logger(LOG, "listDatabaseToolsEndpointServices")
                .serviceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsEndpointServices",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsEndpointService/ListDatabaseToolsEndpointServices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseToolsEndpointServicesRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsEndpointServices")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsEndpointServiceCollection
                                .class,
                        ListDatabaseToolsEndpointServicesResponse.Builder
                                ::databaseToolsEndpointServiceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseToolsEndpointServicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDatabaseToolsEndpointServicesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDatabaseToolsIdentitiesResponse listDatabaseToolsIdentities(
            ListDatabaseToolsIdentitiesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatabaseToolsIdentitiesResponse::builder)
                .logger(LOG, "listDatabaseToolsIdentities")
                .serviceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsIdentities",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsIdentity/ListDatabaseToolsIdentities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseToolsIdentitiesRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsIdentities")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "databaseToolsConnectionId", request.getDatabaseToolsConnectionId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsIdentityCollection.class,
                        ListDatabaseToolsIdentitiesResponse.Builder
                                ::databaseToolsIdentityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabaseToolsIdentitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseToolsIdentitiesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDatabaseToolsPrivateEndpointsResponse listDatabaseToolsPrivateEndpoints(
            ListDatabaseToolsPrivateEndpointsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatabaseToolsPrivateEndpointsResponse::builder)
                .logger(LOG, "listDatabaseToolsPrivateEndpoints")
                .serviceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsPrivateEndpoint/ListDatabaseToolsPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseToolsPrivateEndpointsRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsPrivateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("subnetId", request.getSubnetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("endpointServiceId", request.getEndpointServiceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpointCollection
                                .class,
                        ListDatabaseToolsPrivateEndpointsResponse.Builder
                                ::databaseToolsPrivateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseToolsPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDatabaseToolsPrivateEndpointsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "DatabaseTools",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20201005")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.WorkRequestErrorCollection.class,
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
                        "DatabaseTools",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20201005")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.WorkRequestLogEntryCollection.class,
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
                        "DatabaseTools",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20201005")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceIdentifier", request.getResourceIdentifier())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetools.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RefreshDatabaseToolsIdentityCredentialResponse refreshDatabaseToolsIdentityCredential(
            RefreshDatabaseToolsIdentityCredentialRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsIdentityId(), "databaseToolsIdentityId must not be blank");
        Objects.requireNonNull(
                request.getRefreshDatabaseToolsIdentityCredentialDetails(),
                "refreshDatabaseToolsIdentityCredentialDetails is required");

        return clientCall(request, RefreshDatabaseToolsIdentityCredentialResponse::builder)
                .logger(LOG, "refreshDatabaseToolsIdentityCredential")
                .serviceDetails(
                        "DatabaseTools",
                        "RefreshDatabaseToolsIdentityCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsIdentity/RefreshDatabaseToolsIdentityCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshDatabaseToolsIdentityCredentialRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsIdentities")
                .appendPathParam(request.getDatabaseToolsIdentityId())
                .appendPathParam("actions")
                .appendPathParam("refreshCredential")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshDatabaseToolsIdentityCredentialResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshDatabaseToolsIdentityCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveDatabaseToolsConnectionLockResponse removeDatabaseToolsConnectionLock(
            RemoveDatabaseToolsConnectionLockRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveDatabaseToolsConnectionLockResponse::builder)
                .logger(LOG, "removeDatabaseToolsConnectionLock")
                .serviceDetails(
                        "DatabaseTools",
                        "RemoveDatabaseToolsConnectionLock",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsConnection/RemoveDatabaseToolsConnectionLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDatabaseToolsConnectionLockRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsConnection.class,
                        RemoveDatabaseToolsConnectionLockResponse.Builder::databaseToolsConnection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveDatabaseToolsConnectionLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", RemoveDatabaseToolsConnectionLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public RemoveDatabaseToolsIdentityLockResponse removeDatabaseToolsIdentityLock(
            RemoveDatabaseToolsIdentityLockRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsIdentityId(), "databaseToolsIdentityId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveDatabaseToolsIdentityLockResponse::builder)
                .logger(LOG, "removeDatabaseToolsIdentityLock")
                .serviceDetails(
                        "DatabaseTools",
                        "RemoveDatabaseToolsIdentityLock",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsIdentity/RemoveDatabaseToolsIdentityLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDatabaseToolsIdentityLockRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsIdentities")
                .appendPathParam(request.getDatabaseToolsIdentityId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsIdentity.class,
                        RemoveDatabaseToolsIdentityLockResponse.Builder::databaseToolsIdentity)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveDatabaseToolsIdentityLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", RemoveDatabaseToolsIdentityLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public RemoveDatabaseToolsPrivateEndpointLockResponse removeDatabaseToolsPrivateEndpointLock(
            RemoveDatabaseToolsPrivateEndpointLockRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsPrivateEndpointId(),
                "databaseToolsPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveDatabaseToolsPrivateEndpointLockResponse::builder)
                .logger(LOG, "removeDatabaseToolsPrivateEndpointLock")
                .serviceDetails(
                        "DatabaseTools",
                        "RemoveDatabaseToolsPrivateEndpointLock",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsPrivateEndpoint/RemoveDatabaseToolsPrivateEndpointLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDatabaseToolsPrivateEndpointLockRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsPrivateEndpoints")
                .appendPathParam(request.getDatabaseToolsPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpoint.class,
                        RemoveDatabaseToolsPrivateEndpointLockResponse.Builder
                                ::databaseToolsPrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveDatabaseToolsPrivateEndpointLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", RemoveDatabaseToolsPrivateEndpointLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateDatabaseToolsConnectionResponse updateDatabaseToolsConnection(
            UpdateDatabaseToolsConnectionRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseToolsConnectionDetails(),
                "updateDatabaseToolsConnectionDetails is required");

        return clientCall(request, UpdateDatabaseToolsConnectionResponse::builder)
                .logger(LOG, "updateDatabaseToolsConnection")
                .serviceDetails(
                        "DatabaseTools",
                        "UpdateDatabaseToolsConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsConnection/UpdateDatabaseToolsConnection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseToolsConnectionRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDatabaseToolsConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDatabaseToolsConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDatabaseToolsIdentityResponse updateDatabaseToolsIdentity(
            UpdateDatabaseToolsIdentityRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsIdentityId(), "databaseToolsIdentityId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseToolsIdentityDetails(),
                "updateDatabaseToolsIdentityDetails is required");

        return clientCall(request, UpdateDatabaseToolsIdentityResponse::builder)
                .logger(LOG, "updateDatabaseToolsIdentity")
                .serviceDetails(
                        "DatabaseTools",
                        "UpdateDatabaseToolsIdentity",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsIdentity/UpdateDatabaseToolsIdentity")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseToolsIdentityRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsIdentities")
                .appendPathParam(request.getDatabaseToolsIdentityId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDatabaseToolsIdentityResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatabaseToolsIdentityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDatabaseToolsPrivateEndpointResponse updateDatabaseToolsPrivateEndpoint(
            UpdateDatabaseToolsPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsPrivateEndpointId(),
                "databaseToolsPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseToolsPrivateEndpointDetails(),
                "updateDatabaseToolsPrivateEndpointDetails is required");

        return clientCall(request, UpdateDatabaseToolsPrivateEndpointResponse::builder)
                .logger(LOG, "updateDatabaseToolsPrivateEndpoint")
                .serviceDetails(
                        "DatabaseTools",
                        "UpdateDatabaseToolsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsPrivateEndpoint/UpdateDatabaseToolsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseToolsPrivateEndpointRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsPrivateEndpoints")
                .appendPathParam(request.getDatabaseToolsPrivateEndpointId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDatabaseToolsPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDatabaseToolsPrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ValidateDatabaseToolsConnectionResponse validateDatabaseToolsConnection(
            ValidateDatabaseToolsConnectionRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");
        Objects.requireNonNull(
                request.getValidateDatabaseToolsConnectionDetails(),
                "validateDatabaseToolsConnectionDetails is required");

        return clientCall(request, ValidateDatabaseToolsConnectionResponse::builder)
                .logger(LOG, "validateDatabaseToolsConnection")
                .serviceDetails(
                        "DatabaseTools",
                        "ValidateDatabaseToolsConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsConnection/ValidateDatabaseToolsConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateDatabaseToolsConnectionRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("actions")
                .appendPathParam("validateConnection")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model.ValidateDatabaseToolsConnectionResult
                                .class,
                        ValidateDatabaseToolsConnectionResponse.Builder
                                ::validateDatabaseToolsConnectionResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateDatabaseToolsConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ValidateDatabaseToolsIdentityCredentialResponse validateDatabaseToolsIdentityCredential(
            ValidateDatabaseToolsIdentityCredentialRequest request) {

        Validate.notBlank(
                request.getDatabaseToolsIdentityId(), "databaseToolsIdentityId must not be blank");
        Objects.requireNonNull(
                request.getValidateDatabaseToolsIdentityCredentialDetails(),
                "validateDatabaseToolsIdentityCredentialDetails is required");

        return clientCall(request, ValidateDatabaseToolsIdentityCredentialResponse::builder)
                .logger(LOG, "validateDatabaseToolsIdentityCredential")
                .serviceDetails(
                        "DatabaseTools",
                        "ValidateDatabaseToolsIdentityCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools/20201005/DatabaseToolsIdentity/ValidateDatabaseToolsIdentityCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateDatabaseToolsIdentityCredentialRequest::builder)
                .basePath("/20201005")
                .appendPathParam("databaseToolsIdentities")
                .appendPathParam(request.getDatabaseToolsIdentityId())
                .appendPathParam("actions")
                .appendPathParam("validateCredential")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetools.model
                                .ValidateDatabaseToolsIdentityCredentialResult.class,
                        ValidateDatabaseToolsIdentityCredentialResponse.Builder
                                ::validateDatabaseToolsIdentityCredentialResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateDatabaseToolsIdentityCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DatabaseToolsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DatabaseToolsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseToolsClient(
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
    public DatabaseToolsClient(
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
    public DatabaseToolsClient(
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
    public DatabaseToolsClient(
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
    public DatabaseToolsClient(
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
    public DatabaseToolsClient(
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
    public DatabaseToolsClient(
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
    public DatabaseToolsClient(
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
