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
 * Async client implementation for DbMulticloudAwsProvider service. <br>
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
public class DbMulticloudAwsProviderAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DbMulticloudAwsProviderAsync {
    /** Service instance for DbMulticloudAwsProvider. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DbMulticloudAwsProviderClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbMulticloudAwsProviderAsyncClient.class);

    DbMulticloudAwsProviderAsyncClient(
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
                    Builder, DbMulticloudAwsProviderAsyncClient> {
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
        public DbMulticloudAwsProviderAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbMulticloudAwsProviderAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOracleDbAwsIdentityConnectorCompartmentResponse>
            changeOracleDbAwsIdentityConnectorCompartment(
                    ChangeOracleDbAwsIdentityConnectorCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbAwsIdentityConnectorCompartmentRequest,
                                    ChangeOracleDbAwsIdentityConnectorCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAwsIdentityConnectorId(),
                "oracleDbAwsIdentityConnectorId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAwsIdentityConnectorCompartmentDetails(),
                "changeOracleDbAwsIdentityConnectorCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAwsIdentityConnectorCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAwsIdentityConnectorCompartment")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "ChangeOracleDbAwsIdentityConnectorCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsIdentityConnector/ChangeOracleDbAwsIdentityConnectorCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAwsIdentityConnectorCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsIdentityConnector")
                .appendPathParam(request.getOracleDbAwsIdentityConnectorId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOracleDbAwsIdentityConnectorCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAwsIdentityConnectorCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeOracleDbAwsKeyCompartmentResponse>
            changeOracleDbAwsKeyCompartment(
                    ChangeOracleDbAwsKeyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbAwsKeyCompartmentRequest,
                                    ChangeOracleDbAwsKeyCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getOracleDbAwsKeyId(), "oracleDbAwsKeyId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAwsKeyCompartmentDetails(),
                "changeOracleDbAwsKeyCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAwsKeyCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAwsKeyCompartment")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "ChangeOracleDbAwsKeyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsKey/ChangeOracleDbAwsKeyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAwsKeyCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsKey")
                .appendPathParam(request.getOracleDbAwsKeyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOracleDbAwsKeyCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAwsKeyCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOracleDbAwsIdentityConnectorResponse>
            createOracleDbAwsIdentityConnector(
                    CreateOracleDbAwsIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOracleDbAwsIdentityConnectorRequest,
                                    CreateOracleDbAwsIdentityConnectorResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateOracleDbAwsIdentityConnectorDetails(),
                "createOracleDbAwsIdentityConnectorDetails is required");

        return clientCall(request, CreateOracleDbAwsIdentityConnectorResponse::builder)
                .logger(LOG, "createOracleDbAwsIdentityConnector")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "CreateOracleDbAwsIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsIdentityConnector/CreateOracleDbAwsIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAwsIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsIdentityConnector")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAwsIdentityConnector.class,
                        CreateOracleDbAwsIdentityConnectorResponse.Builder
                                ::oracleDbAwsIdentityConnector)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAwsIdentityConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbAwsIdentityConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAwsIdentityConnectorResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbAwsIdentityConnectorResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbAwsIdentityConnectorResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOracleDbAwsKeyResponse> createOracleDbAwsKey(
            CreateOracleDbAwsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOracleDbAwsKeyRequest, CreateOracleDbAwsKeyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOracleDbAwsKeyDetails(),
                "createOracleDbAwsKeyDetails is required");

        return clientCall(request, CreateOracleDbAwsKeyResponse::builder)
                .logger(LOG, "createOracleDbAwsKey")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "CreateOracleDbAwsKey",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsKey/CreateOracleDbAwsKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAwsKeyRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsKey")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAwsKey.class,
                        CreateOracleDbAwsKeyResponse.Builder::oracleDbAwsKey)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAwsKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOracleDbAwsKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAwsKeyResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateOracleDbAwsKeyResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateOracleDbAwsKeyResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOracleDbAwsIdentityConnectorResponse>
            deleteOracleDbAwsIdentityConnector(
                    DeleteOracleDbAwsIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOracleDbAwsIdentityConnectorRequest,
                                    DeleteOracleDbAwsIdentityConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAwsIdentityConnectorId(),
                "oracleDbAwsIdentityConnectorId must not be blank");

        return clientCall(request, DeleteOracleDbAwsIdentityConnectorResponse::builder)
                .logger(LOG, "deleteOracleDbAwsIdentityConnector")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "DeleteOracleDbAwsIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsIdentityConnector/DeleteOracleDbAwsIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAwsIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsIdentityConnector")
                .appendPathParam(request.getOracleDbAwsIdentityConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbAwsIdentityConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAwsIdentityConnectorResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOracleDbAwsKeyResponse> deleteOracleDbAwsKey(
            DeleteOracleDbAwsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOracleDbAwsKeyRequest, DeleteOracleDbAwsKeyResponse>
                    handler) {

        Validate.notBlank(request.getOracleDbAwsKeyId(), "oracleDbAwsKeyId must not be blank");

        return clientCall(request, DeleteOracleDbAwsKeyResponse::builder)
                .logger(LOG, "deleteOracleDbAwsKey")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "DeleteOracleDbAwsKey",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsKey/DeleteOracleDbAwsKey")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAwsKeyRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsKey")
                .appendPathParam(request.getOracleDbAwsKeyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOracleDbAwsKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAwsKeyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbAwsIdentityConnectorResponse>
            getOracleDbAwsIdentityConnector(
                    GetOracleDbAwsIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOracleDbAwsIdentityConnectorRequest,
                                    GetOracleDbAwsIdentityConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAwsIdentityConnectorId(),
                "oracleDbAwsIdentityConnectorId must not be blank");

        return clientCall(request, GetOracleDbAwsIdentityConnectorResponse::builder)
                .logger(LOG, "getOracleDbAwsIdentityConnector")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "GetOracleDbAwsIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsIdentityConnector/GetOracleDbAwsIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAwsIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsIdentityConnector")
                .appendPathParam(request.getOracleDbAwsIdentityConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAwsIdentityConnector.class,
                        GetOracleDbAwsIdentityConnectorResponse.Builder
                                ::oracleDbAwsIdentityConnector)
                .handleResponseHeaderString(
                        "etag", GetOracleDbAwsIdentityConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOracleDbAwsIdentityConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbAwsKeyResponse> getOracleDbAwsKey(
            GetOracleDbAwsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOracleDbAwsKeyRequest, GetOracleDbAwsKeyResponse>
                    handler) {

        Validate.notBlank(request.getOracleDbAwsKeyId(), "oracleDbAwsKeyId must not be blank");

        return clientCall(request, GetOracleDbAwsKeyResponse::builder)
                .logger(LOG, "getOracleDbAwsKey")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "GetOracleDbAwsKey",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsKey/GetOracleDbAwsKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAwsKeyRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsKey")
                .appendPathParam(request.getOracleDbAwsKeyId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAwsKey.class,
                        GetOracleDbAwsKeyResponse.Builder::oracleDbAwsKey)
                .handleResponseHeaderString("etag", GetOracleDbAwsKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOracleDbAwsKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbAwsIdentityConnectorsResponse>
            listOracleDbAwsIdentityConnectors(
                    ListOracleDbAwsIdentityConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOracleDbAwsIdentityConnectorsRequest,
                                    ListOracleDbAwsIdentityConnectorsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAwsIdentityConnectorsResponse::builder)
                .logger(LOG, "listOracleDbAwsIdentityConnectors")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "ListOracleDbAwsIdentityConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsIdentityConnector/ListOracleDbAwsIdentityConnectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAwsIdentityConnectorsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsIdentityConnector")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model
                                .OracleDbAwsIdentityConnectorSummaryCollection.class,
                        ListOracleDbAwsIdentityConnectorsResponse.Builder
                                ::oracleDbAwsIdentityConnectorSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOracleDbAwsIdentityConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOracleDbAwsIdentityConnectorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbAwsKeysResponse> listOracleDbAwsKeys(
            ListOracleDbAwsKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOracleDbAwsKeysRequest, ListOracleDbAwsKeysResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAwsKeysResponse::builder)
                .logger(LOG, "listOracleDbAwsKeys")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "ListOracleDbAwsKeys",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsKey/ListOracleDbAwsKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAwsKeysRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsKey")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("oracleDbAwsKeyId", request.getOracleDbAwsKeyId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("oracleDbAwsConnectorId", request.getOracleDbAwsConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAwsKeySummaryCollection.class,
                        ListOracleDbAwsKeysResponse.Builder::oracleDbAwsKeySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOracleDbAwsKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOracleDbAwsKeysResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshOracleDbAwsIdentityConnectorResponse>
            refreshOracleDbAwsIdentityConnector(
                    RefreshOracleDbAwsIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshOracleDbAwsIdentityConnectorRequest,
                                    RefreshOracleDbAwsIdentityConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAwsIdentityConnectorId(),
                "oracleDbAwsIdentityConnectorId must not be blank");

        return clientCall(request, RefreshOracleDbAwsIdentityConnectorResponse::builder)
                .logger(LOG, "refreshOracleDbAwsIdentityConnector")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "RefreshOracleDbAwsIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsIdentityConnector/RefreshOracleDbAwsIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshOracleDbAwsIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsIdentityConnector")
                .appendPathParam(request.getOracleDbAwsIdentityConnectorId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshOracleDbAwsIdentityConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshOracleDbAwsIdentityConnectorResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshOracleDbAwsKeyResponse> refreshOracleDbAwsKey(
            RefreshOracleDbAwsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshOracleDbAwsKeyRequest, RefreshOracleDbAwsKeyResponse>
                    handler) {

        Validate.notBlank(request.getOracleDbAwsKeyId(), "oracleDbAwsKeyId must not be blank");
        Objects.requireNonNull(
                request.getRefreshOracleDbAwsKeyDetails(),
                "refreshOracleDbAwsKeyDetails is required");

        return clientCall(request, RefreshOracleDbAwsKeyResponse::builder)
                .logger(LOG, "refreshOracleDbAwsKey")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "RefreshOracleDbAwsKey",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsKey/RefreshOracleDbAwsKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshOracleDbAwsKeyRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsKey")
                .appendPathParam(request.getOracleDbAwsKeyId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RefreshOracleDbAwsKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshOracleDbAwsKeyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOracleDbAwsIdentityConnectorResponse>
            updateOracleDbAwsIdentityConnector(
                    UpdateOracleDbAwsIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOracleDbAwsIdentityConnectorRequest,
                                    UpdateOracleDbAwsIdentityConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAwsIdentityConnectorId(),
                "oracleDbAwsIdentityConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAwsIdentityConnectorDetails(),
                "updateOracleDbAwsIdentityConnectorDetails is required");

        return clientCall(request, UpdateOracleDbAwsIdentityConnectorResponse::builder)
                .logger(LOG, "updateOracleDbAwsIdentityConnector")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "UpdateOracleDbAwsIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsIdentityConnector/UpdateOracleDbAwsIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAwsIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsIdentityConnector")
                .appendPathParam(request.getOracleDbAwsIdentityConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAwsIdentityConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbAwsIdentityConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOracleDbAwsKeyResponse> updateOracleDbAwsKey(
            UpdateOracleDbAwsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOracleDbAwsKeyRequest, UpdateOracleDbAwsKeyResponse>
                    handler) {

        Validate.notBlank(request.getOracleDbAwsKeyId(), "oracleDbAwsKeyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAwsKeyDetails(),
                "updateOracleDbAwsKeyDetails is required");

        return clientCall(request, UpdateOracleDbAwsKeyResponse::builder)
                .logger(LOG, "updateOracleDbAwsKey")
                .serviceDetails(
                        "DbMulticloudAwsProvider",
                        "UpdateOracleDbAwsKey",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAwsKey/UpdateOracleDbAwsKey")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAwsKeyRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAwsKey")
                .appendPathParam(request.getOracleDbAwsKeyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAwsKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOracleDbAwsKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbMulticloudAwsProviderAsyncClient(
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
    public DbMulticloudAwsProviderAsyncClient(
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
    public DbMulticloudAwsProviderAsyncClient(
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
    public DbMulticloudAwsProviderAsyncClient(
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
    public DbMulticloudAwsProviderAsyncClient(
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
    public DbMulticloudAwsProviderAsyncClient(
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
    public DbMulticloudAwsProviderAsyncClient(
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
