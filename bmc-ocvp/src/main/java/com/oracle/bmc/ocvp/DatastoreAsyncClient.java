/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Datastore service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public class DatastoreAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DatastoreAsync {
    /** Service instance for Datastore. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatastoreClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatastoreAsyncClient.class);

    DatastoreAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DatastoreAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ocvp";
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
        public DatastoreAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatastoreAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddBlockVolumeToDatastoreResponse> addBlockVolumeToDatastore(
            AddBlockVolumeToDatastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddBlockVolumeToDatastoreRequest, AddBlockVolumeToDatastoreResponse>
                    handler) {

        Validate.notBlank(request.getDatastoreId(), "datastoreId must not be blank");
        Objects.requireNonNull(
                request.getAddBlockVolumeToDatastoreDetails(),
                "addBlockVolumeToDatastoreDetails is required");

        return clientCall(request, AddBlockVolumeToDatastoreResponse::builder)
                .logger(LOG, "addBlockVolumeToDatastore")
                .serviceDetails(
                        "Datastore",
                        "AddBlockVolumeToDatastore",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/AddBlockVolumeToDatastore")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddBlockVolumeToDatastoreRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendPathParam(request.getDatastoreId())
                .appendPathParam("actions")
                .appendPathParam("addBlockVolume")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddBlockVolumeToDatastoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AddBlockVolumeToDatastoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDatastoreCompartmentResponse>
            changeDatastoreCompartment(
                    ChangeDatastoreCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatastoreCompartmentRequest,
                                    ChangeDatastoreCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getDatastoreId(), "datastoreId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatastoreCompartmentDetails(),
                "changeDatastoreCompartmentDetails is required");

        return clientCall(request, ChangeDatastoreCompartmentResponse::builder)
                .logger(LOG, "changeDatastoreCompartment")
                .serviceDetails(
                        "Datastore",
                        "ChangeDatastoreCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/ChangeDatastoreCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatastoreCompartmentRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendPathParam(request.getDatastoreId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDatastoreCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDatastoreResponse> createDatastore(
            CreateDatastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDatastoreRequest, CreateDatastoreResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDatastoreDetails(), "createDatastoreDetails is required");

        return clientCall(request, CreateDatastoreResponse::builder)
                .logger(LOG, "createDatastore")
                .serviceDetails(
                        "Datastore",
                        "CreateDatastore",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/CreateDatastore")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatastoreRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDatastoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatastoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatastoreResponse> deleteDatastore(
            DeleteDatastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatastoreRequest, DeleteDatastoreResponse>
                    handler) {

        Validate.notBlank(request.getDatastoreId(), "datastoreId must not be blank");

        return clientCall(request, DeleteDatastoreResponse::builder)
                .logger(LOG, "deleteDatastore")
                .serviceDetails(
                        "Datastore",
                        "DeleteDatastore",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/DeleteDatastore")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatastoreRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendPathParam(request.getDatastoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDatastoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatastoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatastoreResponse> getDatastore(
            GetDatastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDatastoreRequest, GetDatastoreResponse>
                    handler) {

        Validate.notBlank(request.getDatastoreId(), "datastoreId must not be blank");

        return clientCall(request, GetDatastoreResponse::builder)
                .logger(LOG, "getDatastore")
                .serviceDetails(
                        "Datastore",
                        "GetDatastore",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/GetDatastore")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatastoreRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendPathParam(request.getDatastoreId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.Datastore.class,
                        GetDatastoreResponse.Builder::datastore)
                .handleResponseHeaderString("etag", GetDatastoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatastoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatastoresResponse> listDatastores(
            ListDatastoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDatastoresRequest, ListDatastoresResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatastoresResponse::builder)
                .logger(LOG, "listDatastores")
                .serviceDetails(
                        "Datastore",
                        "ListDatastores",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/ListDatastores")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatastoresRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("clusterId", request.getClusterId())
                .appendQueryParam("datastoreId", request.getDatastoreId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.DatastoreCollection.class,
                        ListDatastoresResponse.Builder::datastoreCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatastoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatastoresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatastoreResponse> updateDatastore(
            UpdateDatastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatastoreRequest, UpdateDatastoreResponse>
                    handler) {

        Validate.notBlank(request.getDatastoreId(), "datastoreId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatastoreDetails(), "updateDatastoreDetails is required");

        return clientCall(request, UpdateDatastoreResponse::builder)
                .logger(LOG, "updateDatastore")
                .serviceDetails(
                        "Datastore",
                        "UpdateDatastore",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/UpdateDatastore")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatastoreRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendPathParam(request.getDatastoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDatastoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatastoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatastoreAsyncClient(
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
    public DatastoreAsyncClient(
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
    public DatastoreAsyncClient(
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
    public DatastoreAsyncClient(
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
    public DatastoreAsyncClient(
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
    public DatastoreAsyncClient(
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
    public DatastoreAsyncClient(
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
