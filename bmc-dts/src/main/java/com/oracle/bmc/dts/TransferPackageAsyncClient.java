/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;

import java.util.Objects;

/**
 * Async client implementation for TransferPackage service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class TransferPackageAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements TransferPackageAsync {
    /** Service instance for TransferPackage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("TRANSFERPACKAGE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datatransfer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TransferPackageAsyncClient.class);

    TransferPackageAsyncClient(
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
                    Builder, TransferPackageAsyncClient> {
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
        public TransferPackageAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new TransferPackageAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AttachDevicesToTransferPackageResponse>
            attachDevicesToTransferPackage(
                    AttachDevicesToTransferPackageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachDevicesToTransferPackageRequest,
                                    AttachDevicesToTransferPackageResponse>
                            handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferPackageLabel(), "transferPackageLabel must not be blank");
        Objects.requireNonNull(
                request.getAttachDevicesDetails(), "attachDevicesDetails is required");

        return clientCall(request, AttachDevicesToTransferPackageResponse::builder)
                .logger(LOG, "attachDevicesToTransferPackage")
                .serviceDetails("TransferPackage", "AttachDevicesToTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachDevicesToTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendPathParam(request.getTransferPackageLabel())
                .appendPathParam("actions")
                .appendPathParam("attachDevices")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachDevicesToTransferPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", AttachDevicesToTransferPackageResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTransferPackageResponse> createTransferPackage(
            CreateTransferPackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTransferPackageRequest, CreateTransferPackageResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        return clientCall(request, CreateTransferPackageResponse::builder)
                .logger(LOG, "createTransferPackage")
                .serviceDetails("TransferPackage", "CreateTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.TransferPackage.class,
                        CreateTransferPackageResponse.Builder::transferPackage)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTransferPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTransferPackageResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransferPackageResponse> deleteTransferPackage(
            DeleteTransferPackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTransferPackageRequest, DeleteTransferPackageResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferPackageLabel(), "transferPackageLabel must not be blank");

        return clientCall(request, DeleteTransferPackageResponse::builder)
                .logger(LOG, "deleteTransferPackage")
                .serviceDetails("TransferPackage", "DeleteTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendPathParam(request.getTransferPackageLabel())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTransferPackageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachDevicesFromTransferPackageResponse>
            detachDevicesFromTransferPackage(
                    DetachDevicesFromTransferPackageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachDevicesFromTransferPackageRequest,
                                    DetachDevicesFromTransferPackageResponse>
                            handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferPackageLabel(), "transferPackageLabel must not be blank");
        Objects.requireNonNull(
                request.getDetachDevicesDetails(), "detachDevicesDetails is required");

        return clientCall(request, DetachDevicesFromTransferPackageResponse::builder)
                .logger(LOG, "detachDevicesFromTransferPackage")
                .serviceDetails("TransferPackage", "DetachDevicesFromTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachDevicesFromTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendPathParam(request.getTransferPackageLabel())
                .appendPathParam("actions")
                .appendPathParam("detachDevices")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachDevicesFromTransferPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", DetachDevicesFromTransferPackageResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTransferPackageResponse> getTransferPackage(
            GetTransferPackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTransferPackageRequest, GetTransferPackageResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferPackageLabel(), "transferPackageLabel must not be blank");

        return clientCall(request, GetTransferPackageResponse::builder)
                .logger(LOG, "getTransferPackage")
                .serviceDetails("TransferPackage", "GetTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendPathParam(request.getTransferPackageLabel())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.TransferPackage.class,
                        GetTransferPackageResponse.Builder::transferPackage)
                .handleResponseHeaderString(
                        "opc-request-id", GetTransferPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetTransferPackageResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTransferPackagesResponse> listTransferPackages(
            ListTransferPackagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTransferPackagesRequest, ListTransferPackagesResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        return clientCall(request, ListTransferPackagesResponse::builder)
                .logger(LOG, "listTransferPackages")
                .serviceDetails("TransferPackage", "ListTransferPackages", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTransferPackagesRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.MultipleTransferPackages.class,
                        ListTransferPackagesResponse.Builder::multipleTransferPackages)
                .handleResponseHeaderString(
                        "opc-request-id", ListTransferPackagesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTransferPackageResponse> updateTransferPackage(
            UpdateTransferPackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTransferPackageRequest, UpdateTransferPackageResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferPackageLabel(), "transferPackageLabel must not be blank");
        Objects.requireNonNull(
                request.getUpdateTransferPackageDetails(),
                "updateTransferPackageDetails is required");

        return clientCall(request, UpdateTransferPackageResponse::builder)
                .logger(LOG, "updateTransferPackage")
                .serviceDetails("TransferPackage", "UpdateTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendPathParam(request.getTransferPackageLabel())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.TransferPackage.class,
                        UpdateTransferPackageResponse.Builder::transferPackage)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTransferPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTransferPackageResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public TransferPackageAsyncClient(
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
    public TransferPackageAsyncClient(
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
    public TransferPackageAsyncClient(
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
    public TransferPackageAsyncClient(
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
    public TransferPackageAsyncClient(
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
    public TransferPackageAsyncClient(
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
    public TransferPackageAsyncClient(
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
