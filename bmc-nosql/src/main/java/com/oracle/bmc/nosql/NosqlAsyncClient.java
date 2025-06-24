/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.nosql.requests.*;
import com.oracle.bmc.nosql.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Nosql service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
public class NosqlAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements NosqlAsync {
    /** Service instance for Nosql. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NOSQL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://nosql.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NosqlAsyncClient.class);

    NosqlAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, NosqlAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "nosql";
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
        public NosqlAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new NosqlAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeTableCompartmentResponse> changeTableCompartment(
            ChangeTableCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeTableCompartmentRequest, ChangeTableCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");
        Objects.requireNonNull(
                request.getChangeTableCompartmentDetails(),
                "changeTableCompartmentDetails is required");

        return clientCall(request, ChangeTableCompartmentResponse::builder)
                .logger(LOG, "changeTableCompartment")
                .serviceDetails(
                        "Nosql",
                        "ChangeTableCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/ChangeTableCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTableCompartmentRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeTableCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeTableCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIndexResponse> createIndex(
            CreateIndexRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateIndexRequest, CreateIndexResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");
        Objects.requireNonNull(request.getCreateIndexDetails(), "createIndexDetails is required");

        return clientCall(request, CreateIndexResponse::builder)
                .logger(LOG, "createIndex")
                .serviceDetails(
                        "Nosql",
                        "CreateIndex",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Index/CreateIndex")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIndexRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("indexes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateIndexResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIndexResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicaResponse> createReplica(
            CreateReplicaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateReplicaRequest, CreateReplicaResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");
        Objects.requireNonNull(
                request.getCreateReplicaDetails(), "createReplicaDetails is required");

        return clientCall(request, CreateReplicaResponse::builder)
                .logger(LOG, "createReplica")
                .serviceDetails(
                        "Nosql",
                        "CreateReplica",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/CreateReplica")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateReplicaRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("replicas")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateReplicaResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateReplicaResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTableResponse> createTable(
            CreateTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTableRequest, CreateTableResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateTableDetails(), "createTableDetails is required");

        return clientCall(request, CreateTableResponse::builder)
                .logger(LOG, "createTable")
                .serviceDetails(
                        "Nosql",
                        "CreateTable",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/CreateTable")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTableRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTableResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIndexResponse> deleteIndex(
            DeleteIndexRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteIndexRequest, DeleteIndexResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");

        Validate.notBlank(request.getIndexName(), "indexName must not be blank");

        return clientCall(request, DeleteIndexResponse::builder)
                .logger(LOG, "deleteIndex")
                .serviceDetails(
                        "Nosql",
                        "DeleteIndex",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Index/DeleteIndex")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIndexRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("indexes")
                .appendPathParam(request.getIndexName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("isIfExists", request.getIsIfExists())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteIndexResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIndexResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicaResponse> deleteReplica(
            DeleteReplicaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteReplicaRequest, DeleteReplicaResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");

        Validate.notBlank(request.getRegion(), "region must not be blank");

        return clientCall(request, DeleteReplicaResponse::builder)
                .logger(LOG, "deleteReplica")
                .serviceDetails(
                        "Nosql",
                        "DeleteReplica",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/DeleteReplica")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteReplicaRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("replicas")
                .appendPathParam(request.getRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteReplicaResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteReplicaResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRowResponse> deleteRow(
            DeleteRowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRowRequest, DeleteRowResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");
        Objects.requireNonNull(request.getKey(), "key is required");

        return clientCall(request, DeleteRowResponse::builder)
                .logger(LOG, "deleteRow")
                .serviceDetails(
                        "Nosql",
                        "DeleteRow",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Row/DeleteRow")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRowRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("rows")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "key",
                        request.getKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isGetReturnRow", request.getIsGetReturnRow())
                .appendQueryParam("timeoutInMs", request.getTimeoutInMs())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.DeleteRowResult.class,
                        DeleteRowResponse.Builder::deleteRowResult)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResponse> deleteTable(
            DeleteTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTableRequest, DeleteTableResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");

        return clientCall(request, DeleteTableResponse::builder)
                .logger(LOG, "deleteTable")
                .serviceDetails(
                        "Nosql",
                        "DeleteTable",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/DeleteTable")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTableRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("isIfExists", request.getIsIfExists())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTableResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkRequestResponse> deleteWorkRequest(
            DeleteWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkRequestRequest, DeleteWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, DeleteWorkRequestResponse::builder)
                .logger(LOG, "deleteWorkRequest")
                .serviceDetails(
                        "Nosql",
                        "DeleteWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/WorkRequest/DeleteWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWorkRequestRequest::builder)
                .basePath("/20190828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteWorkRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfigurationRequest, GetConfigurationResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetConfigurationResponse::builder)
                .logger(LOG, "getConfiguration")
                .serviceDetails(
                        "Nosql",
                        "GetConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Configuration/GetConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigurationRequest::builder)
                .basePath("/20190828")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.Configuration.class,
                        GetConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString("etag", GetConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIndexResponse> getIndex(
            GetIndexRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetIndexRequest, GetIndexResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");

        Validate.notBlank(request.getIndexName(), "indexName must not be blank");

        return clientCall(request, GetIndexResponse::builder)
                .logger(LOG, "getIndex")
                .serviceDetails(
                        "Nosql",
                        "GetIndex",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Index/GetIndex")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIndexRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("indexes")
                .appendPathParam(request.getIndexName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.nosql.model.Index.class, GetIndexResponse.Builder::index)
                .handleResponseHeaderString("etag", GetIndexResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIndexResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRowResponse> getRow(
            GetRowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRowRequest, GetRowResponse> handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");
        Objects.requireNonNull(request.getKey(), "key is required");

        return clientCall(request, GetRowResponse::builder)
                .logger(LOG, "getRow")
                .serviceDetails(
                        "Nosql",
                        "GetRow",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Row/GetRow")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRowRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("rows")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "key",
                        request.getKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("consistency", request.getConsistency())
                .appendQueryParam("timeoutInMs", request.getTimeoutInMs())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.nosql.model.Row.class, GetRowResponse.Builder::row)
                .handleResponseHeaderString("etag", GetRowResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetRowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTableResponse> getTable(
            GetTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTableRequest, GetTableResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");

        return clientCall(request, GetTableResponse::builder)
                .logger(LOG, "getTable")
                .serviceDetails(
                        "Nosql",
                        "GetTable",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/GetTable")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTableRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.nosql.model.Table.class, GetTableResponse.Builder::table)
                .handleResponseHeaderString("etag", GetTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTableResponse.Builder::opcRequestId)
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
                        "Nosql",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20190828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIndexesResponse> listIndexes(
            ListIndexesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListIndexesRequest, ListIndexesResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");

        return clientCall(request, ListIndexesResponse::builder)
                .logger(LOG, "listIndexes")
                .serviceDetails(
                        "Nosql",
                        "ListIndexes",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Index/ListIndexes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIndexesRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("indexes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.IndexCollection.class,
                        ListIndexesResponse.Builder::indexCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListIndexesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListIndexesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTableUsageResponse> listTableUsage(
            ListTableUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTableUsageRequest, ListTableUsageResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");

        return clientCall(request, ListTableUsageResponse::builder)
                .logger(LOG, "listTableUsage")
                .serviceDetails(
                        "Nosql",
                        "ListTableUsage",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/ListTableUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTableUsageRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("usage")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.TableUsageCollection.class,
                        ListTableUsageResponse.Builder::tableUsageCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListTableUsageResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListTableUsageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTablesResponse> listTables(
            ListTablesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTablesRequest, ListTablesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTablesResponse::builder)
                .logger(LOG, "listTables")
                .serviceDetails(
                        "Nosql",
                        "ListTables",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/ListTables")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTablesRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.TableCollection.class,
                        ListTablesResponse.Builder::tableCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListTablesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListTablesResponse.Builder::opcRequestId)
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
                        "Nosql",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/WorkRequest/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20190828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.WorkRequestErrorCollection.class,
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
                        "Nosql",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/WorkRequest/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20190828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.WorkRequestLogEntryCollection.class,
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
                        "Nosql",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20190828")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PrepareStatementResponse> prepareStatement(
            PrepareStatementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PrepareStatementRequest, PrepareStatementResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getStatement(), "statement is required");

        return clientCall(request, PrepareStatementResponse::builder)
                .logger(LOG, "prepareStatement")
                .serviceDetails(
                        "Nosql",
                        "PrepareStatement",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/QueryResultCollection/PrepareStatement")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(PrepareStatementRequest::builder)
                .basePath("/20190828")
                .appendPathParam("query")
                .appendPathParam("prepare")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("statement", request.getStatement())
                .appendQueryParam("isGetQueryPlan", request.getIsGetQueryPlan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.PreparedStatement.class,
                        PrepareStatementResponse.Builder::preparedStatement)
                .handleResponseHeaderString(
                        "opc-request-id", PrepareStatementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<QueryResponse> query(
            QueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<QueryRequest, QueryResponse> handler) {
        Objects.requireNonNull(request.getQueryDetails(), "queryDetails is required");

        return clientCall(request, QueryResponse::builder)
                .logger(LOG, "query")
                .serviceDetails(
                        "Nosql",
                        "Query",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/QueryResultCollection/Query")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(QueryRequest::builder)
                .basePath("/20190828")
                .appendPathParam("query")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.nosql.model.QueryResultCollection.class,
                        QueryResponse.Builder::queryResultCollection)
                .handleResponseHeaderString("opc-next-page", QueryResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-request-id", QueryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeStatementResponse> summarizeStatement(
            SummarizeStatementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeStatementRequest, SummarizeStatementResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getStatement(), "statement is required");

        return clientCall(request, SummarizeStatementResponse::builder)
                .logger(LOG, "summarizeStatement")
                .serviceDetails(
                        "Nosql",
                        "SummarizeStatement",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/QueryResultCollection/SummarizeStatement")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeStatementRequest::builder)
                .basePath("/20190828")
                .appendPathParam("query")
                .appendPathParam("summarize")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("statement", request.getStatement())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.nosql.model.StatementSummary.class,
                        SummarizeStatementResponse.Builder::statementSummary)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeStatementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UnassignKmsKeyResponse> unassignKmsKey(
            UnassignKmsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UnassignKmsKeyRequest, UnassignKmsKeyResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, UnassignKmsKeyResponse::builder)
                .logger(LOG, "unassignKmsKey")
                .serviceDetails(
                        "Nosql",
                        "UnassignKmsKey",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Configuration/UnassignKmsKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UnassignKmsKeyRequest::builder)
                .basePath("/20190828")
                .appendPathParam("configuration")
                .appendPathParam("actions")
                .appendPathParam("unassignkmskey")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("is-opc-dry-run", request.getIsOpcDryRun())
                .handleResponseHeaderString(
                        "opc-work-request-id", UnassignKmsKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UnassignKmsKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResponse> updateConfiguration(
            UpdateConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConfigurationRequest, UpdateConfigurationResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getUpdateConfigurationDetails(), "updateConfigurationDetails is required");

        return clientCall(request, UpdateConfigurationResponse::builder)
                .logger(LOG, "updateConfiguration")
                .serviceDetails(
                        "Nosql",
                        "UpdateConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Configuration/UpdateConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConfigurationRequest::builder)
                .basePath("/20190828")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("is-opc-dry-run", request.getIsOpcDryRun())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRowResponse> updateRow(
            UpdateRowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateRowRequest, UpdateRowResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");
        Objects.requireNonNull(request.getUpdateRowDetails(), "updateRowDetails is required");

        return clientCall(request, UpdateRowResponse::builder)
                .logger(LOG, "updateRow")
                .serviceDetails(
                        "Nosql",
                        "UpdateRow",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Row/UpdateRow")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRowRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .appendPathParam("rows")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.nosql.model.UpdateRowResult.class,
                        UpdateRowResponse.Builder::updateRowResult)
                .handleResponseHeaderString("etag", UpdateRowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResponse> updateTable(
            UpdateTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTableRequest, UpdateTableResponse>
                    handler) {

        Validate.notBlank(request.getTableNameOrId(), "tableNameOrId must not be blank");
        Objects.requireNonNull(request.getUpdateTableDetails(), "updateTableDetails is required");

        return clientCall(request, UpdateTableResponse::builder)
                .logger(LOG, "updateTable")
                .serviceDetails(
                        "Nosql",
                        "UpdateTable",
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/UpdateTable")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTableRequest::builder)
                .basePath("/20190828")
                .appendPathParam("tables")
                .appendPathParam(request.getTableNameOrId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTableResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
