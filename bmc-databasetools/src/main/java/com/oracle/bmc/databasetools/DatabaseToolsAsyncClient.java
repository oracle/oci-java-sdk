/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasetools.requests.*;
import com.oracle.bmc.databasetools.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DatabaseTools service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class DatabaseToolsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DatabaseToolsAsync {
    /** Service instance for DatabaseTools. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatabaseToolsClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbtools.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseToolsAsyncClient.class);

    DatabaseToolsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DatabaseToolsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "databasetools";
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
        public DatabaseToolsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatabaseToolsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddDatabaseToolsConnectionLockResponse>
            addDatabaseToolsConnectionLock(
                    AddDatabaseToolsConnectionLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsConnectionLockRequest,
                                    AddDatabaseToolsConnectionLockResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddDatabaseToolsIdentityLockResponse>
            addDatabaseToolsIdentityLock(
                    AddDatabaseToolsIdentityLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsIdentityLockRequest,
                                    AddDatabaseToolsIdentityLockResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddDatabaseToolsPrivateEndpointLockResponse>
            addDatabaseToolsPrivateEndpointLock(
                    AddDatabaseToolsPrivateEndpointLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsPrivateEndpointLockRequest,
                                    AddDatabaseToolsPrivateEndpointLockResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseToolsConnectionCompartmentResponse>
            changeDatabaseToolsConnectionCompartment(
                    ChangeDatabaseToolsConnectionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsConnectionCompartmentRequest,
                                    ChangeDatabaseToolsConnectionCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseToolsIdentityCompartmentResponse>
            changeDatabaseToolsIdentityCompartment(
                    ChangeDatabaseToolsIdentityCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsIdentityCompartmentRequest,
                                    ChangeDatabaseToolsIdentityCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseToolsPrivateEndpointCompartmentResponse>
            changeDatabaseToolsPrivateEndpointCompartment(
                    ChangeDatabaseToolsPrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsPrivateEndpointCompartmentRequest,
                                    ChangeDatabaseToolsPrivateEndpointCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsConnectionResponse>
            createDatabaseToolsConnection(
                    CreateDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsConnectionRequest,
                                    CreateDatabaseToolsConnectionResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsIdentityResponse>
            createDatabaseToolsIdentity(
                    CreateDatabaseToolsIdentityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsIdentityRequest,
                                    CreateDatabaseToolsIdentityResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsPrivateEndpointResponse>
            createDatabaseToolsPrivateEndpoint(
                    CreateDatabaseToolsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsPrivateEndpointRequest,
                                    CreateDatabaseToolsPrivateEndpointResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsConnectionResponse>
            deleteDatabaseToolsConnection(
                    DeleteDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsConnectionRequest,
                                    DeleteDatabaseToolsConnectionResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsIdentityResponse>
            deleteDatabaseToolsIdentity(
                    DeleteDatabaseToolsIdentityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsIdentityRequest,
                                    DeleteDatabaseToolsIdentityResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsPrivateEndpointResponse>
            deleteDatabaseToolsPrivateEndpoint(
                    DeleteDatabaseToolsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsPrivateEndpointRequest,
                                    DeleteDatabaseToolsPrivateEndpointResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsConnectionResponse>
            getDatabaseToolsConnection(
                    GetDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsConnectionRequest,
                                    GetDatabaseToolsConnectionResponse>
                            handler) {

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
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsConnection.class,
                        GetDatabaseToolsConnectionResponse.Builder::databaseToolsConnection)
                .handleResponseHeaderString(
                        "etag", GetDatabaseToolsConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseToolsConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsEndpointServiceResponse>
            getDatabaseToolsEndpointService(
                    GetDatabaseToolsEndpointServiceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsEndpointServiceRequest,
                                    GetDatabaseToolsEndpointServiceResponse>
                            handler) {

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
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsEndpointService.class,
                        GetDatabaseToolsEndpointServiceResponse.Builder
                                ::databaseToolsEndpointService)
                .handleResponseHeaderString(
                        "etag", GetDatabaseToolsEndpointServiceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseToolsEndpointServiceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsIdentityResponse> getDatabaseToolsIdentity(
            GetDatabaseToolsIdentityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseToolsIdentityRequest, GetDatabaseToolsIdentityResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsIdentity.class,
                        GetDatabaseToolsIdentityResponse.Builder::databaseToolsIdentity)
                .handleResponseHeaderString("etag", GetDatabaseToolsIdentityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseToolsIdentityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsPrivateEndpointResponse>
            getDatabaseToolsPrivateEndpoint(
                    GetDatabaseToolsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsPrivateEndpointRequest,
                                    GetDatabaseToolsPrivateEndpointResponse>
                            handler) {

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
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpoint.class,
                        GetDatabaseToolsPrivateEndpointResponse.Builder
                                ::databaseToolsPrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", GetDatabaseToolsPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseToolsPrivateEndpointResponse.Builder::opcRequestId)
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
                .handleBody(
                        com.oracle.bmc.databasetools.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsConnectionsResponse>
            listDatabaseToolsConnections(
                    ListDatabaseToolsConnectionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsConnectionsRequest,
                                    ListDatabaseToolsConnectionsResponse>
                            handler) {
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
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsConnectionCollection.class,
                        ListDatabaseToolsConnectionsResponse.Builder
                                ::databaseToolsConnectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseToolsConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseToolsConnectionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsEndpointServicesResponse>
            listDatabaseToolsEndpointServices(
                    ListDatabaseToolsEndpointServicesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsEndpointServicesRequest,
                                    ListDatabaseToolsEndpointServicesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsIdentitiesResponse>
            listDatabaseToolsIdentities(
                    ListDatabaseToolsIdentitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsIdentitiesRequest,
                                    ListDatabaseToolsIdentitiesResponse>
                            handler) {
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
                .handleBody(
                        com.oracle.bmc.databasetools.model.DatabaseToolsIdentityCollection.class,
                        ListDatabaseToolsIdentitiesResponse.Builder
                                ::databaseToolsIdentityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabaseToolsIdentitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseToolsIdentitiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsPrivateEndpointsResponse>
            listDatabaseToolsPrivateEndpoints(
                    ListDatabaseToolsPrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsPrivateEndpointsRequest,
                                    ListDatabaseToolsPrivateEndpointsResponse>
                            handler) {
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
                .handleBody(
                        com.oracle.bmc.databasetools.model.WorkRequestErrorCollection.class,
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
                .handleBody(
                        com.oracle.bmc.databasetools.model.WorkRequestLogEntryCollection.class,
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
                .handleBody(
                        com.oracle.bmc.databasetools.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshDatabaseToolsIdentityCredentialResponse>
            refreshDatabaseToolsIdentityCredential(
                    RefreshDatabaseToolsIdentityCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshDatabaseToolsIdentityCredentialRequest,
                                    RefreshDatabaseToolsIdentityCredentialResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveDatabaseToolsConnectionLockResponse>
            removeDatabaseToolsConnectionLock(
                    RemoveDatabaseToolsConnectionLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsConnectionLockRequest,
                                    RemoveDatabaseToolsConnectionLockResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveDatabaseToolsIdentityLockResponse>
            removeDatabaseToolsIdentityLock(
                    RemoveDatabaseToolsIdentityLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsIdentityLockRequest,
                                    RemoveDatabaseToolsIdentityLockResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveDatabaseToolsPrivateEndpointLockResponse>
            removeDatabaseToolsPrivateEndpointLock(
                    RemoveDatabaseToolsPrivateEndpointLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsPrivateEndpointLockRequest,
                                    RemoveDatabaseToolsPrivateEndpointLockResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsConnectionResponse>
            updateDatabaseToolsConnection(
                    UpdateDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsConnectionRequest,
                                    UpdateDatabaseToolsConnectionResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsIdentityResponse>
            updateDatabaseToolsIdentity(
                    UpdateDatabaseToolsIdentityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsIdentityRequest,
                                    UpdateDatabaseToolsIdentityResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsPrivateEndpointResponse>
            updateDatabaseToolsPrivateEndpoint(
                    UpdateDatabaseToolsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsPrivateEndpointRequest,
                                    UpdateDatabaseToolsPrivateEndpointResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateDatabaseToolsConnectionResponse>
            validateDatabaseToolsConnection(
                    ValidateDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDatabaseToolsConnectionRequest,
                                    ValidateDatabaseToolsConnectionResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateDatabaseToolsIdentityCredentialResponse>
            validateDatabaseToolsIdentityCredential(
                    ValidateDatabaseToolsIdentityCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDatabaseToolsIdentityCredentialRequest,
                                    ValidateDatabaseToolsIdentityCredentialResponse>
                            handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
