/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OracleDBAzureBlobMount service. <br>
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
public class OracleDBAzureBlobMountAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OracleDBAzureBlobMountAsync {
    /** Service instance for OracleDBAzureBlobMount. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ORACLEDBAZUREBLOBMOUNT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OracleDBAzureBlobMountAsyncClient.class);

    OracleDBAzureBlobMountAsyncClient(
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
                    Builder, OracleDBAzureBlobMountAsyncClient> {
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
        public OracleDBAzureBlobMountAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OracleDBAzureBlobMountAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOracleDbAzureBlobMountCompartmentResponse>
            changeOracleDbAzureBlobMountCompartment(
                    ChangeOracleDbAzureBlobMountCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbAzureBlobMountCompartmentRequest,
                                    ChangeOracleDbAzureBlobMountCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureBlobMountId(),
                "oracleDbAzureBlobMountId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAzureBlobMountCompartmentDetails(),
                "changeOracleDbAzureBlobMountCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAzureBlobMountCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAzureBlobMountCompartment")
                .serviceDetails(
                        "OracleDBAzureBlobMount",
                        "ChangeOracleDbAzureBlobMountCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobMount/ChangeOracleDbAzureBlobMountCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAzureBlobMountCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .appendPathParam(request.getOracleDbAzureBlobMountId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOracleDbAzureBlobMountCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAzureBlobMountCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOracleDbAzureBlobMountResponse>
            createOracleDbAzureBlobMount(
                    CreateOracleDbAzureBlobMountRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOracleDbAzureBlobMountRequest,
                                    CreateOracleDbAzureBlobMountResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateOracleDbAzureBlobMountDetails(),
                "createOracleDbAzureBlobMountDetails is required");

        return clientCall(request, CreateOracleDbAzureBlobMountResponse::builder)
                .logger(LOG, "createOracleDbAzureBlobMount")
                .serviceDetails(
                        "OracleDBAzureBlobMount",
                        "CreateOracleDbAzureBlobMount",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobMount/CreateOracleDbAzureBlobMount")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAzureBlobMountRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureBlobMount.class,
                        CreateOracleDbAzureBlobMountResponse.Builder::oracleDbAzureBlobMount)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAzureBlobMountResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbAzureBlobMountResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAzureBlobMountResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbAzureBlobMountResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbAzureBlobMountResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOracleDbAzureBlobMountResponse>
            deleteOracleDbAzureBlobMount(
                    DeleteOracleDbAzureBlobMountRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOracleDbAzureBlobMountRequest,
                                    DeleteOracleDbAzureBlobMountResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureBlobMountId(),
                "oracleDbAzureBlobMountId must not be blank");

        return clientCall(request, DeleteOracleDbAzureBlobMountResponse::builder)
                .logger(LOG, "deleteOracleDbAzureBlobMount")
                .serviceDetails(
                        "OracleDBAzureBlobMount",
                        "DeleteOracleDbAzureBlobMount",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobMount/DeleteOracleDbAzureBlobMount")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAzureBlobMountRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .appendPathParam(request.getOracleDbAzureBlobMountId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbAzureBlobMountResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAzureBlobMountResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbAzureBlobMountResponse> getOracleDbAzureBlobMount(
            GetOracleDbAzureBlobMountRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOracleDbAzureBlobMountRequest, GetOracleDbAzureBlobMountResponse>
                    handler) {

        Validate.notBlank(
                request.getOracleDbAzureBlobMountId(),
                "oracleDbAzureBlobMountId must not be blank");

        return clientCall(request, GetOracleDbAzureBlobMountResponse::builder)
                .logger(LOG, "getOracleDbAzureBlobMount")
                .serviceDetails(
                        "OracleDBAzureBlobMount",
                        "GetOracleDbAzureBlobMount",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobMount/GetOracleDbAzureBlobMount")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAzureBlobMountRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .appendPathParam(request.getOracleDbAzureBlobMountId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureBlobMount.class,
                        GetOracleDbAzureBlobMountResponse.Builder::oracleDbAzureBlobMount)
                .handleResponseHeaderString("etag", GetOracleDbAzureBlobMountResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOracleDbAzureBlobMountResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbAzureBlobMountsResponse>
            listOracleDbAzureBlobMounts(
                    ListOracleDbAzureBlobMountsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOracleDbAzureBlobMountsRequest,
                                    ListOracleDbAzureBlobMountsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAzureBlobMountsResponse::builder)
                .logger(LOG, "listOracleDbAzureBlobMounts")
                .serviceDetails(
                        "OracleDBAzureBlobMount",
                        "ListOracleDbAzureBlobMounts",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobMount/ListOracleDbAzureBlobMounts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAzureBlobMountsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("oracleDbAzureBlobMountId", request.getOracleDbAzureBlobMountId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam(
                        "oracleDbAzureBlobContainerId", request.getOracleDbAzureBlobContainerId())
                .appendQueryParam("oracleDbAzureConnectorId", request.getOracleDbAzureConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureBlobMountSummaryCollection
                                .class,
                        ListOracleDbAzureBlobMountsResponse.Builder
                                ::oracleDbAzureBlobMountSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOracleDbAzureBlobMountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOracleDbAzureBlobMountsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOracleDbAzureBlobMountResponse>
            updateOracleDbAzureBlobMount(
                    UpdateOracleDbAzureBlobMountRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOracleDbAzureBlobMountRequest,
                                    UpdateOracleDbAzureBlobMountResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureBlobMountId(),
                "oracleDbAzureBlobMountId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAzureBlobMountDetails(),
                "updateOracleDbAzureBlobMountDetails is required");

        return clientCall(request, UpdateOracleDbAzureBlobMountResponse::builder)
                .logger(LOG, "updateOracleDbAzureBlobMount")
                .serviceDetails(
                        "OracleDBAzureBlobMount",
                        "UpdateOracleDbAzureBlobMount",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobMount/UpdateOracleDbAzureBlobMount")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAzureBlobMountRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .appendPathParam(request.getOracleDbAzureBlobMountId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAzureBlobMountResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbAzureBlobMountResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OracleDBAzureBlobMountAsyncClient(
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
    public OracleDBAzureBlobMountAsyncClient(
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
    public OracleDBAzureBlobMountAsyncClient(
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
    public OracleDBAzureBlobMountAsyncClient(
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
    public OracleDBAzureBlobMountAsyncClient(
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
    public OracleDBAzureBlobMountAsyncClient(
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
    public OracleDBAzureBlobMountAsyncClient(
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
