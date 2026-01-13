/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DbMulticloudGCPProvider service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class DbMulticloudGCPProviderAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DbMulticloudGCPProviderAsync {
    /** Service instance for DbMulticloudGCPProvider. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DbMulticloudGCPProviderClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbMulticloudGCPProviderAsyncClient.class);

    DbMulticloudGCPProviderAsyncClient(
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
                    Builder, DbMulticloudGCPProviderAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dbmulticloud";
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
        public DbMulticloudGCPProviderAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbMulticloudGCPProviderAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOracleDbGcpIdentityConnectorCompartmentResponse>
            changeOracleDbGcpIdentityConnectorCompartment(
                    ChangeOracleDbGcpIdentityConnectorCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbGcpIdentityConnectorCompartmentRequest,
                                    ChangeOracleDbGcpIdentityConnectorCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbGcpIdentityConnectorId(),
                "oracleDbGcpIdentityConnectorId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbGcpIdentityConnectorCompartmentDetails(),
                "changeOracleDbGcpIdentityConnectorCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbGcpIdentityConnectorCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbGcpIdentityConnectorCompartment")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "ChangeOracleDbGcpIdentityConnectorCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/ChangeOracleDbGcpIdentityConnectorCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbGcpIdentityConnectorCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendPathParam(request.getOracleDbGcpIdentityConnectorId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOracleDbGcpIdentityConnectorCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbGcpIdentityConnectorCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeOracleDbGcpKeyRingCompartmentResponse>
            changeOracleDbGcpKeyRingCompartment(
                    ChangeOracleDbGcpKeyRingCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbGcpKeyRingCompartmentRequest,
                                    ChangeOracleDbGcpKeyRingCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbGcpKeyRingId(), "oracleDbGcpKeyRingId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbGcpKeyRingCompartmentDetails(),
                "changeOracleDbGcpKeyRingCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbGcpKeyRingCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbGcpKeyRingCompartment")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "ChangeOracleDbGcpKeyRingCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/ChangeOracleDbGcpKeyRingCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbGcpKeyRingCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendPathParam(request.getOracleDbGcpKeyRingId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOracleDbGcpKeyRingCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbGcpKeyRingCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOracleDbGcpIdentityConnectorResponse>
            createOracleDbGcpIdentityConnector(
                    CreateOracleDbGcpIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOracleDbGcpIdentityConnectorRequest,
                                    CreateOracleDbGcpIdentityConnectorResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateOracleDbGcpIdentityConnectorDetails(),
                "createOracleDbGcpIdentityConnectorDetails is required");

        return clientCall(request, CreateOracleDbGcpIdentityConnectorResponse::builder)
                .logger(LOG, "createOracleDbGcpIdentityConnector")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "CreateOracleDbGcpIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/CreateOracleDbGcpIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbGcpIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpIdentityConnector.class,
                        CreateOracleDbGcpIdentityConnectorResponse.Builder
                                ::oracleDbGcpIdentityConnector)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbGcpIdentityConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbGcpIdentityConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbGcpIdentityConnectorResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbGcpIdentityConnectorResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbGcpIdentityConnectorResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOracleDbGcpKeyRingResponse> createOracleDbGcpKeyRing(
            CreateOracleDbGcpKeyRingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOracleDbGcpKeyRingRequest, CreateOracleDbGcpKeyRingResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOracleDbGcpKeyRingDetails(),
                "createOracleDbGcpKeyRingDetails is required");

        return clientCall(request, CreateOracleDbGcpKeyRingResponse::builder)
                .logger(LOG, "createOracleDbGcpKeyRing")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "CreateOracleDbGcpKeyRing",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/CreateOracleDbGcpKeyRing")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbGcpKeyRingRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRing.class,
                        CreateOracleDbGcpKeyRingResponse.Builder::oracleDbGcpKeyRing)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbGcpKeyRingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOracleDbGcpKeyRingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbGcpKeyRingResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbGcpKeyRingResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateOracleDbGcpKeyRingResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOracleDbGcpIdentityConnectorResponse>
            deleteOracleDbGcpIdentityConnector(
                    DeleteOracleDbGcpIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOracleDbGcpIdentityConnectorRequest,
                                    DeleteOracleDbGcpIdentityConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbGcpIdentityConnectorId(),
                "oracleDbGcpIdentityConnectorId must not be blank");

        return clientCall(request, DeleteOracleDbGcpIdentityConnectorResponse::builder)
                .logger(LOG, "deleteOracleDbGcpIdentityConnector")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "DeleteOracleDbGcpIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/DeleteOracleDbGcpIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbGcpIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendPathParam(request.getOracleDbGcpIdentityConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbGcpIdentityConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbGcpIdentityConnectorResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOracleDbGcpKeyRingResponse> deleteOracleDbGcpKeyRing(
            DeleteOracleDbGcpKeyRingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOracleDbGcpKeyRingRequest, DeleteOracleDbGcpKeyRingResponse>
                    handler) {

        Validate.notBlank(
                request.getOracleDbGcpKeyRingId(), "oracleDbGcpKeyRingId must not be blank");

        return clientCall(request, DeleteOracleDbGcpKeyRingResponse::builder)
                .logger(LOG, "deleteOracleDbGcpKeyRing")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "DeleteOracleDbGcpKeyRing",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/DeleteOracleDbGcpKeyRing")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbGcpKeyRingRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendPathParam(request.getOracleDbGcpKeyRingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOracleDbGcpKeyRingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbGcpKeyRingResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbGcpIdentityConnectorResponse>
            getOracleDbGcpIdentityConnector(
                    GetOracleDbGcpIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOracleDbGcpIdentityConnectorRequest,
                                    GetOracleDbGcpIdentityConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbGcpIdentityConnectorId(),
                "oracleDbGcpIdentityConnectorId must not be blank");

        return clientCall(request, GetOracleDbGcpIdentityConnectorResponse::builder)
                .logger(LOG, "getOracleDbGcpIdentityConnector")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "GetOracleDbGcpIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/GetOracleDbGcpIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbGcpIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendPathParam(request.getOracleDbGcpIdentityConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpIdentityConnector.class,
                        GetOracleDbGcpIdentityConnectorResponse.Builder
                                ::oracleDbGcpIdentityConnector)
                .handleResponseHeaderString(
                        "etag", GetOracleDbGcpIdentityConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOracleDbGcpIdentityConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbGcpKeyResponse> getOracleDbGcpKey(
            GetOracleDbGcpKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOracleDbGcpKeyRequest, GetOracleDbGcpKeyResponse>
                    handler) {

        Validate.notBlank(request.getOracleDbGcpKeyId(), "oracleDbGcpKeyId must not be blank");

        return clientCall(request, GetOracleDbGcpKeyResponse::builder)
                .logger(LOG, "getOracleDbGcpKey")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "GetOracleDbGcpKey",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKey/GetOracleDbGcpKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbGcpKeyRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKey")
                .appendPathParam(request.getOracleDbGcpKeyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpKey.class,
                        GetOracleDbGcpKeyResponse.Builder::oracleDbGcpKey)
                .handleResponseHeaderString("etag", GetOracleDbGcpKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOracleDbGcpKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbGcpKeyRingResponse> getOracleDbGcpKeyRing(
            GetOracleDbGcpKeyRingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOracleDbGcpKeyRingRequest, GetOracleDbGcpKeyRingResponse>
                    handler) {

        Validate.notBlank(
                request.getOracleDbGcpKeyRingId(), "oracleDbGcpKeyRingId must not be blank");

        return clientCall(request, GetOracleDbGcpKeyRingResponse::builder)
                .logger(LOG, "getOracleDbGcpKeyRing")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "GetOracleDbGcpKeyRing",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/GetOracleDbGcpKeyRing")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbGcpKeyRingRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendPathParam(request.getOracleDbGcpKeyRingId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRing.class,
                        GetOracleDbGcpKeyRingResponse.Builder::oracleDbGcpKeyRing)
                .handleResponseHeaderString("etag", GetOracleDbGcpKeyRingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOracleDbGcpKeyRingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbGcpIdentityConnectorsResponse>
            listOracleDbGcpIdentityConnectors(
                    ListOracleDbGcpIdentityConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOracleDbGcpIdentityConnectorsRequest,
                                    ListOracleDbGcpIdentityConnectorsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbGcpIdentityConnectorsResponse::builder)
                .logger(LOG, "listOracleDbGcpIdentityConnectors")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "ListOracleDbGcpIdentityConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/ListOracleDbGcpIdentityConnectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbGcpIdentityConnectorsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model
                                .OracleDbGcpIdentityConnectorSummaryCollection.class,
                        ListOracleDbGcpIdentityConnectorsResponse.Builder
                                ::oracleDbGcpIdentityConnectorSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOracleDbGcpIdentityConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOracleDbGcpIdentityConnectorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbGcpKeyRingsResponse> listOracleDbGcpKeyRings(
            ListOracleDbGcpKeyRingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOracleDbGcpKeyRingsRequest, ListOracleDbGcpKeyRingsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbGcpKeyRingsResponse::builder)
                .logger(LOG, "listOracleDbGcpKeyRings")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "ListOracleDbGcpKeyRings",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/ListOracleDbGcpKeyRings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbGcpKeyRingsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("oracleDbGcpKeyRingId", request.getOracleDbGcpKeyRingId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("oracleDbGcpConnectorId", request.getOracleDbGcpConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRingSummaryCollection.class,
                        ListOracleDbGcpKeyRingsResponse.Builder
                                ::oracleDbGcpKeyRingSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOracleDbGcpKeyRingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOracleDbGcpKeyRingsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbGcpKeysResponse> listOracleDbGcpKeys(
            ListOracleDbGcpKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOracleDbGcpKeysRequest, ListOracleDbGcpKeysResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbGcpKeysResponse::builder)
                .logger(LOG, "listOracleDbGcpKeys")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "ListOracleDbGcpKeys",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKey/ListOracleDbGcpKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbGcpKeysRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKey")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("oracleDbGcpKeyRingId", request.getOracleDbGcpKeyRingId())
                .appendQueryParam("oracleDbGcpKeyId", request.getOracleDbGcpKeyId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeySummaryCollection.class,
                        ListOracleDbGcpKeysResponse.Builder::oracleDbGcpKeySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOracleDbGcpKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOracleDbGcpKeysResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshOracleDbGcpIdentityConnectorResponse>
            refreshOracleDbGcpIdentityConnector(
                    RefreshOracleDbGcpIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshOracleDbGcpIdentityConnectorRequest,
                                    RefreshOracleDbGcpIdentityConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbGcpIdentityConnectorId(),
                "oracleDbGcpIdentityConnectorId must not be blank");

        return clientCall(request, RefreshOracleDbGcpIdentityConnectorResponse::builder)
                .logger(LOG, "refreshOracleDbGcpIdentityConnector")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "RefreshOracleDbGcpIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/RefreshOracleDbGcpIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshOracleDbGcpIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendPathParam(request.getOracleDbGcpIdentityConnectorId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshOracleDbGcpIdentityConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshOracleDbGcpIdentityConnectorResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshOracleDbGcpKeyRingResponse> refreshOracleDbGcpKeyRing(
            RefreshOracleDbGcpKeyRingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshOracleDbGcpKeyRingRequest, RefreshOracleDbGcpKeyRingResponse>
                    handler) {

        Validate.notBlank(
                request.getOracleDbGcpKeyRingId(), "oracleDbGcpKeyRingId must not be blank");
        Objects.requireNonNull(
                request.getRefreshOracleDbGcpKeyRingDetails(),
                "refreshOracleDbGcpKeyRingDetails is required");

        return clientCall(request, RefreshOracleDbGcpKeyRingResponse::builder)
                .logger(LOG, "refreshOracleDbGcpKeyRing")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "RefreshOracleDbGcpKeyRing",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/RefreshOracleDbGcpKeyRing")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshOracleDbGcpKeyRingRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendPathParam(request.getOracleDbGcpKeyRingId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RefreshOracleDbGcpKeyRingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshOracleDbGcpKeyRingResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOracleDbGcpIdentityConnectorResponse>
            updateOracleDbGcpIdentityConnector(
                    UpdateOracleDbGcpIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOracleDbGcpIdentityConnectorRequest,
                                    UpdateOracleDbGcpIdentityConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbGcpIdentityConnectorId(),
                "oracleDbGcpIdentityConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbGcpIdentityConnectorDetails(),
                "updateOracleDbGcpIdentityConnectorDetails is required");

        return clientCall(request, UpdateOracleDbGcpIdentityConnectorResponse::builder)
                .logger(LOG, "updateOracleDbGcpIdentityConnector")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "UpdateOracleDbGcpIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/UpdateOracleDbGcpIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbGcpIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendPathParam(request.getOracleDbGcpIdentityConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbGcpIdentityConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbGcpIdentityConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOracleDbGcpKeyRingResponse> updateOracleDbGcpKeyRing(
            UpdateOracleDbGcpKeyRingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOracleDbGcpKeyRingRequest, UpdateOracleDbGcpKeyRingResponse>
                    handler) {

        Validate.notBlank(
                request.getOracleDbGcpKeyRingId(), "oracleDbGcpKeyRingId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbGcpKeyRingDetails(),
                "updateOracleDbGcpKeyRingDetails is required");

        return clientCall(request, UpdateOracleDbGcpKeyRingResponse::builder)
                .logger(LOG, "updateOracleDbGcpKeyRing")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "UpdateOracleDbGcpKeyRing",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/UpdateOracleDbGcpKeyRing")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbGcpKeyRingRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendPathParam(request.getOracleDbGcpKeyRingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbGcpKeyRingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOracleDbGcpKeyRingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
