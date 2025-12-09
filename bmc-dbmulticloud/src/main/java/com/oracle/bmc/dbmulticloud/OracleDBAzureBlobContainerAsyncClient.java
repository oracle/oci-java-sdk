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
 * Async client implementation for OracleDBAzureBlobContainer service. <br>
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
public class OracleDBAzureBlobContainerAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OracleDBAzureBlobContainerAsync {
    /** Service instance for OracleDBAzureBlobContainer. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OracleDBAzureBlobContainerClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OracleDBAzureBlobContainerAsyncClient.class);

    OracleDBAzureBlobContainerAsyncClient(
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
                    Builder, OracleDBAzureBlobContainerAsyncClient> {
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
        public OracleDBAzureBlobContainerAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OracleDBAzureBlobContainerAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOracleDbAzureBlobContainerCompartmentResponse>
            changeOracleDbAzureBlobContainerCompartment(
                    ChangeOracleDbAzureBlobContainerCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbAzureBlobContainerCompartmentRequest,
                                    ChangeOracleDbAzureBlobContainerCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureBlobContainerId(),
                "oracleDbAzureBlobContainerId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAzureBlobContainerCompartmentDetails(),
                "changeOracleDbAzureBlobContainerCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAzureBlobContainerCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAzureBlobContainerCompartment")
                .serviceDetails(
                        "OracleDBAzureBlobContainer",
                        "ChangeOracleDbAzureBlobContainerCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobContainer/ChangeOracleDbAzureBlobContainerCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAzureBlobContainerCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .appendPathParam(request.getOracleDbAzureBlobContainerId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOracleDbAzureBlobContainerCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAzureBlobContainerCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOracleDbAzureBlobContainerResponse>
            createOracleDbAzureBlobContainer(
                    CreateOracleDbAzureBlobContainerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOracleDbAzureBlobContainerRequest,
                                    CreateOracleDbAzureBlobContainerResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateOracleDbAzureBlobContainerDetails(),
                "createOracleDbAzureBlobContainerDetails is required");

        return clientCall(request, CreateOracleDbAzureBlobContainerResponse::builder)
                .logger(LOG, "createOracleDbAzureBlobContainer")
                .serviceDetails(
                        "OracleDBAzureBlobContainer",
                        "CreateOracleDbAzureBlobContainer",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobContainer/CreateOracleDbAzureBlobContainer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAzureBlobContainerRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureBlobContainer.class,
                        CreateOracleDbAzureBlobContainerResponse.Builder
                                ::oracleDbAzureBlobContainer)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAzureBlobContainerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbAzureBlobContainerResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAzureBlobContainerResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbAzureBlobContainerResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbAzureBlobContainerResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOracleDbAzureBlobContainerResponse>
            deleteOracleDbAzureBlobContainer(
                    DeleteOracleDbAzureBlobContainerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOracleDbAzureBlobContainerRequest,
                                    DeleteOracleDbAzureBlobContainerResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureBlobContainerId(),
                "oracleDbAzureBlobContainerId must not be blank");

        return clientCall(request, DeleteOracleDbAzureBlobContainerResponse::builder)
                .logger(LOG, "deleteOracleDbAzureBlobContainer")
                .serviceDetails(
                        "OracleDBAzureBlobContainer",
                        "DeleteOracleDbAzureBlobContainer",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobContainer/DeleteOracleDbAzureBlobContainer")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAzureBlobContainerRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .appendPathParam(request.getOracleDbAzureBlobContainerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbAzureBlobContainerResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAzureBlobContainerResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbAzureBlobContainerResponse>
            getOracleDbAzureBlobContainer(
                    GetOracleDbAzureBlobContainerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOracleDbAzureBlobContainerRequest,
                                    GetOracleDbAzureBlobContainerResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureBlobContainerId(),
                "oracleDbAzureBlobContainerId must not be blank");

        return clientCall(request, GetOracleDbAzureBlobContainerResponse::builder)
                .logger(LOG, "getOracleDbAzureBlobContainer")
                .serviceDetails(
                        "OracleDBAzureBlobContainer",
                        "GetOracleDbAzureBlobContainer",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobContainer/GetOracleDbAzureBlobContainer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAzureBlobContainerRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .appendPathParam(request.getOracleDbAzureBlobContainerId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureBlobContainer.class,
                        GetOracleDbAzureBlobContainerResponse.Builder::oracleDbAzureBlobContainer)
                .handleResponseHeaderString(
                        "etag", GetOracleDbAzureBlobContainerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOracleDbAzureBlobContainerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbAzureBlobContainersResponse>
            listOracleDbAzureBlobContainers(
                    ListOracleDbAzureBlobContainersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOracleDbAzureBlobContainersRequest,
                                    ListOracleDbAzureBlobContainersResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAzureBlobContainersResponse::builder)
                .logger(LOG, "listOracleDbAzureBlobContainers")
                .serviceDetails(
                        "OracleDBAzureBlobContainer",
                        "ListOracleDbAzureBlobContainers",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobContainer/ListOracleDbAzureBlobContainers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAzureBlobContainersRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "oracleDbAzureBlobContainerId", request.getOracleDbAzureBlobContainerId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("azureStorageAccountName", request.getAzureStorageAccountName())
                .appendQueryParam(
                        "azureStorageContainerName", request.getAzureStorageContainerName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model
                                .OracleDbAzureBlobContainerSummaryCollection.class,
                        ListOracleDbAzureBlobContainersResponse.Builder
                                ::oracleDbAzureBlobContainerSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOracleDbAzureBlobContainersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOracleDbAzureBlobContainersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOracleDbAzureBlobContainerResponse>
            updateOracleDbAzureBlobContainer(
                    UpdateOracleDbAzureBlobContainerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOracleDbAzureBlobContainerRequest,
                                    UpdateOracleDbAzureBlobContainerResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureBlobContainerId(),
                "oracleDbAzureBlobContainerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAzureBlobContainerDetails(),
                "updateOracleDbAzureBlobContainerDetails is required");

        return clientCall(request, UpdateOracleDbAzureBlobContainerResponse::builder)
                .logger(LOG, "updateOracleDbAzureBlobContainer")
                .serviceDetails(
                        "OracleDBAzureBlobContainer",
                        "UpdateOracleDbAzureBlobContainer",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureBlobContainer/UpdateOracleDbAzureBlobContainer")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAzureBlobContainerRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .appendPathParam(request.getOracleDbAzureBlobContainerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAzureBlobContainerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbAzureBlobContainerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OracleDBAzureBlobContainerAsyncClient(
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
    public OracleDBAzureBlobContainerAsyncClient(
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
    public OracleDBAzureBlobContainerAsyncClient(
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
    public OracleDBAzureBlobContainerAsyncClient(
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
    public OracleDBAzureBlobContainerAsyncClient(
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
    public OracleDBAzureBlobContainerAsyncClient(
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
    public OracleDBAzureBlobContainerAsyncClient(
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
