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
 * Async client implementation for DatastoreCluster service. <br>
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
public class DatastoreClusterAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DatastoreClusterAsync {
    /** Service instance for DatastoreCluster. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatastoreClusterClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatastoreClusterAsyncClient.class);

    DatastoreClusterAsyncClient(
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
                    Builder, DatastoreClusterAsyncClient> {
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
        public DatastoreClusterAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatastoreClusterAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddDatastoreToDatastoreClusterResponse>
            addDatastoreToDatastoreCluster(
                    AddDatastoreToDatastoreClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatastoreToDatastoreClusterRequest,
                                    AddDatastoreToDatastoreClusterResponse>
                            handler) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getAddDatastoreToDatastoreClusterDetails(),
                "addDatastoreToDatastoreClusterDetails is required");

        return clientCall(request, AddDatastoreToDatastoreClusterResponse::builder)
                .logger(LOG, "addDatastoreToDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "AddDatastoreToDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/AddDatastoreToDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDatastoreToDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("addDatastore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddDatastoreToDatastoreClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddDatastoreToDatastoreClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AttachDatastoreClusterToClusterResponse>
            attachDatastoreClusterToCluster(
                    AttachDatastoreClusterToClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachDatastoreClusterToClusterRequest,
                                    AttachDatastoreClusterToClusterResponse>
                            handler) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getAttachDatastoreClusterToClusterDetails(),
                "attachDatastoreClusterToClusterDetails is required");

        return clientCall(request, AttachDatastoreClusterToClusterResponse::builder)
                .logger(LOG, "attachDatastoreClusterToCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "AttachDatastoreClusterToCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/AttachDatastoreClusterToCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachDatastoreClusterToClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("attachToCluster")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachDatastoreClusterToClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachDatastoreClusterToClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AttachDatastoreClusterToEsxiHostResponse>
            attachDatastoreClusterToEsxiHost(
                    AttachDatastoreClusterToEsxiHostRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachDatastoreClusterToEsxiHostRequest,
                                    AttachDatastoreClusterToEsxiHostResponse>
                            handler) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getAttachDatastoreClusterToEsxiHostDetails(),
                "attachDatastoreClusterToEsxiHostDetails is required");

        return clientCall(request, AttachDatastoreClusterToEsxiHostResponse::builder)
                .logger(LOG, "attachDatastoreClusterToEsxiHost")
                .serviceDetails(
                        "DatastoreCluster",
                        "AttachDatastoreClusterToEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/AttachDatastoreClusterToEsxiHost")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachDatastoreClusterToEsxiHostRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("attachToEsxiHost")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachDatastoreClusterToEsxiHostResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachDatastoreClusterToEsxiHostResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDatastoreClusterCompartmentResponse>
            changeDatastoreClusterCompartment(
                    ChangeDatastoreClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatastoreClusterCompartmentRequest,
                                    ChangeDatastoreClusterCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatastoreClusterCompartmentDetails(),
                "changeDatastoreClusterCompartmentDetails is required");

        return clientCall(request, ChangeDatastoreClusterCompartmentResponse::builder)
                .logger(LOG, "changeDatastoreClusterCompartment")
                .serviceDetails(
                        "DatastoreCluster",
                        "ChangeDatastoreClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/ChangeDatastoreClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatastoreClusterCompartmentRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDatastoreClusterCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDatastoreClusterResponse> createDatastoreCluster(
            CreateDatastoreClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDatastoreClusterRequest, CreateDatastoreClusterResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDatastoreClusterDetails(),
                "createDatastoreClusterDetails is required");

        return clientCall(request, CreateDatastoreClusterResponse::builder)
                .logger(LOG, "createDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "CreateDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/CreateDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDatastoreClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatastoreClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatastoreClusterResponse> deleteDatastoreCluster(
            DeleteDatastoreClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatastoreClusterRequest, DeleteDatastoreClusterResponse>
                    handler) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");

        return clientCall(request, DeleteDatastoreClusterResponse::builder)
                .logger(LOG, "deleteDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "DeleteDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/DeleteDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDatastoreClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatastoreClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachDatastoreClusterFromClusterResponse>
            detachDatastoreClusterFromCluster(
                    DetachDatastoreClusterFromClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachDatastoreClusterFromClusterRequest,
                                    DetachDatastoreClusterFromClusterResponse>
                            handler) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");

        return clientCall(request, DetachDatastoreClusterFromClusterResponse::builder)
                .logger(LOG, "detachDatastoreClusterFromCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "DetachDatastoreClusterFromCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/DetachDatastoreClusterFromCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachDatastoreClusterFromClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("detachFromCluster")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DetachDatastoreClusterFromClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachDatastoreClusterFromClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachDatastoreClusterFromEsxiHostResponse>
            detachDatastoreClusterFromEsxiHost(
                    DetachDatastoreClusterFromEsxiHostRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachDatastoreClusterFromEsxiHostRequest,
                                    DetachDatastoreClusterFromEsxiHostResponse>
                            handler) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getDetachDatastoreClusterFromEsxiHostDetails(),
                "detachDatastoreClusterFromEsxiHostDetails is required");

        return clientCall(request, DetachDatastoreClusterFromEsxiHostResponse::builder)
                .logger(LOG, "detachDatastoreClusterFromEsxiHost")
                .serviceDetails(
                        "DatastoreCluster",
                        "DetachDatastoreClusterFromEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/DetachDatastoreClusterFromEsxiHost")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachDatastoreClusterFromEsxiHostRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("detachFromEsxiHost")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DetachDatastoreClusterFromEsxiHostResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachDatastoreClusterFromEsxiHostResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatastoreClusterResponse> getDatastoreCluster(
            GetDatastoreClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatastoreClusterRequest, GetDatastoreClusterResponse>
                    handler) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");

        return clientCall(request, GetDatastoreClusterResponse::builder)
                .logger(LOG, "getDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "GetDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/GetDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.DatastoreCluster.class,
                        GetDatastoreClusterResponse.Builder::datastoreCluster)
                .handleResponseHeaderString("etag", GetDatastoreClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatastoreClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatastoreClustersResponse> listDatastoreClusters(
            ListDatastoreClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDatastoreClustersRequest, ListDatastoreClustersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatastoreClustersResponse::builder)
                .logger(LOG, "listDatastoreClusters")
                .serviceDetails(
                        "DatastoreCluster",
                        "ListDatastoreClusters",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/ListDatastoreClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatastoreClustersRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("datastoreClusterId", request.getDatastoreClusterId())
                .appendQueryParam("clusterId", request.getClusterId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.DatastoreClusterCollection.class,
                        ListDatastoreClustersResponse.Builder::datastoreClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatastoreClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatastoreClustersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveDatastoreFromDatastoreClusterResponse>
            removeDatastoreFromDatastoreCluster(
                    RemoveDatastoreFromDatastoreClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatastoreFromDatastoreClusterRequest,
                                    RemoveDatastoreFromDatastoreClusterResponse>
                            handler) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getRemoveDatastoreFromDatastoreClusterDetails(),
                "removeDatastoreFromDatastoreClusterDetails is required");

        return clientCall(request, RemoveDatastoreFromDatastoreClusterResponse::builder)
                .logger(LOG, "removeDatastoreFromDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "RemoveDatastoreFromDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/RemoveDatastoreFromDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDatastoreFromDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("removeDatastore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveDatastoreFromDatastoreClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveDatastoreFromDatastoreClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatastoreClusterResponse> updateDatastoreCluster(
            UpdateDatastoreClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatastoreClusterRequest, UpdateDatastoreClusterResponse>
                    handler) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatastoreClusterDetails(),
                "updateDatastoreClusterDetails is required");

        return clientCall(request, UpdateDatastoreClusterResponse::builder)
                .logger(LOG, "updateDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "UpdateDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/UpdateDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDatastoreClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatastoreClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatastoreClusterAsyncClient(
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
    public DatastoreClusterAsyncClient(
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
    public DatastoreClusterAsyncClient(
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
    public DatastoreClusterAsyncClient(
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
    public DatastoreClusterAsyncClient(
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
    public DatastoreClusterAsyncClient(
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
    public DatastoreClusterAsyncClient(
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
