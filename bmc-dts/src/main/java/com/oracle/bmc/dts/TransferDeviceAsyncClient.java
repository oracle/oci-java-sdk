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
 * Async client implementation for TransferDevice service. <br>
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
public class TransferDeviceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements TransferDeviceAsync {
    /** Service instance for TransferDevice. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("TRANSFERDEVICE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datatransfer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TransferDeviceAsyncClient.class);

    TransferDeviceAsyncClient(
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
                    Builder, TransferDeviceAsyncClient> {
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
        public TransferDeviceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new TransferDeviceAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateTransferDeviceResponse> createTransferDevice(
            CreateTransferDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTransferDeviceRequest, CreateTransferDeviceResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");
        Objects.requireNonNull(
                request.getCreateTransferDeviceDetails(),
                "createTransferDeviceDetails is required");

        return clientCall(request, CreateTransferDeviceResponse::builder)
                .logger(LOG, "createTransferDevice")
                .serviceDetails("TransferDevice", "CreateTransferDevice", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTransferDeviceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferDevices")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.NewTransferDevice.class,
                        CreateTransferDeviceResponse.Builder::newTransferDevice)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTransferDeviceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTransferDeviceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransferDeviceResponse> deleteTransferDevice(
            DeleteTransferDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTransferDeviceRequest, DeleteTransferDeviceResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferDeviceLabel(), "transferDeviceLabel must not be blank");

        return clientCall(request, DeleteTransferDeviceResponse::builder)
                .logger(LOG, "deleteTransferDevice")
                .serviceDetails("TransferDevice", "DeleteTransferDevice", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTransferDeviceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferDevices")
                .appendPathParam(request.getTransferDeviceLabel())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTransferDeviceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTransferDeviceResponse> getTransferDevice(
            GetTransferDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTransferDeviceRequest, GetTransferDeviceResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferDeviceLabel(), "transferDeviceLabel must not be blank");

        return clientCall(request, GetTransferDeviceResponse::builder)
                .logger(LOG, "getTransferDevice")
                .serviceDetails("TransferDevice", "GetTransferDevice", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTransferDeviceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferDevices")
                .appendPathParam(request.getTransferDeviceLabel())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.TransferDevice.class,
                        GetTransferDeviceResponse.Builder::transferDevice)
                .handleResponseHeaderString(
                        "opc-request-id", GetTransferDeviceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetTransferDeviceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTransferDevicesResponse> listTransferDevices(
            ListTransferDevicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTransferDevicesRequest, ListTransferDevicesResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        return clientCall(request, ListTransferDevicesResponse::builder)
                .logger(LOG, "listTransferDevices")
                .serviceDetails("TransferDevice", "ListTransferDevices", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTransferDevicesRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferDevices")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.MultipleTransferDevices.class,
                        ListTransferDevicesResponse.Builder::multipleTransferDevices)
                .handleResponseHeaderString(
                        "opc-request-id", ListTransferDevicesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTransferDeviceResponse> updateTransferDevice(
            UpdateTransferDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTransferDeviceRequest, UpdateTransferDeviceResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferDeviceLabel(), "transferDeviceLabel must not be blank");
        Objects.requireNonNull(
                request.getUpdateTransferDeviceDetails(),
                "updateTransferDeviceDetails is required");

        return clientCall(request, UpdateTransferDeviceResponse::builder)
                .logger(LOG, "updateTransferDevice")
                .serviceDetails("TransferDevice", "UpdateTransferDevice", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTransferDeviceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferDevices")
                .appendPathParam(request.getTransferDeviceLabel())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.TransferDevice.class,
                        UpdateTransferDeviceResponse.Builder::transferDevice)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTransferDeviceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTransferDeviceResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public TransferDeviceAsyncClient(
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
    public TransferDeviceAsyncClient(
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
    public TransferDeviceAsyncClient(
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
    public TransferDeviceAsyncClient(
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
    public TransferDeviceAsyncClient(
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
    public TransferDeviceAsyncClient(
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
    public TransferDeviceAsyncClient(
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
