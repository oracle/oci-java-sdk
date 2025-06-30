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
 * Async client implementation for OracleDBAzureConnector service. <br>
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
public class OracleDBAzureConnectorAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OracleDBAzureConnectorAsync {
    /** Service instance for OracleDBAzureConnector. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ORACLEDBAZURECONNECTOR")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OracleDBAzureConnectorAsyncClient.class);

    OracleDBAzureConnectorAsyncClient(
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
                    Builder, OracleDBAzureConnectorAsyncClient> {
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
        public OracleDBAzureConnectorAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OracleDBAzureConnectorAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOracleDbAzureConnectorCompartmentResponse>
            changeOracleDbAzureConnectorCompartment(
                    ChangeOracleDbAzureConnectorCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbAzureConnectorCompartmentRequest,
                                    ChangeOracleDbAzureConnectorCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAzureConnectorCompartmentDetails(),
                "changeOracleDbAzureConnectorCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAzureConnectorCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAzureConnectorCompartment")
                .serviceDetails(
                        "OracleDBAzureConnector", "ChangeOracleDbAzureConnectorCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAzureConnectorCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOracleDbAzureConnectorCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAzureConnectorCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOracleDbAzureConnectorResponse>
            createOracleDbAzureConnector(
                    CreateOracleDbAzureConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOracleDbAzureConnectorRequest,
                                    CreateOracleDbAzureConnectorResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateOracleDbAzureConnectorDetails(),
                "createOracleDbAzureConnectorDetails is required");

        return clientCall(request, CreateOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "createOracleDbAzureConnector")
                .serviceDetails("OracleDBAzureConnector", "CreateOracleDbAzureConnector", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureConnector.class,
                        CreateOracleDbAzureConnectorResponse.Builder::oracleDbAzureConnector)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAzureConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAzureConnectorResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbAzureConnectorResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbAzureConnectorResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOracleDbAzureConnectorResponse>
            deleteOracleDbAzureConnector(
                    DeleteOracleDbAzureConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOracleDbAzureConnectorRequest,
                                    DeleteOracleDbAzureConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");

        return clientCall(request, DeleteOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "deleteOracleDbAzureConnector")
                .serviceDetails("OracleDBAzureConnector", "DeleteOracleDbAzureConnector", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAzureConnectorResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbAzureConnectorResponse> getOracleDbAzureConnector(
            GetOracleDbAzureConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOracleDbAzureConnectorRequest, GetOracleDbAzureConnectorResponse>
                    handler) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");

        return clientCall(request, GetOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "getOracleDbAzureConnector")
                .serviceDetails("OracleDBAzureConnector", "GetOracleDbAzureConnector", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureConnector.class,
                        GetOracleDbAzureConnectorResponse.Builder::oracleDbAzureConnector)
                .handleResponseHeaderString("etag", GetOracleDbAzureConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbAzureConnectorsResponse>
            listOracleDbAzureConnectors(
                    ListOracleDbAzureConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOracleDbAzureConnectorsRequest,
                                    ListOracleDbAzureConnectorsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAzureConnectorsResponse::builder)
                .logger(LOG, "listOracleDbAzureConnectors")
                .serviceDetails("OracleDBAzureConnector", "ListOracleDbAzureConnectors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAzureConnectorsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("oracleDbAzureConnectorId", request.getOracleDbAzureConnectorId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("dbClusterResourceId", request.getDbClusterResourceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureConnectorSummaryCollection
                                .class,
                        ListOracleDbAzureConnectorsResponse.Builder
                                ::oracleDbAzureConnectorSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOracleDbAzureConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOracleDbAzureConnectorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchOracleDbAzureConnectorResponse>
            patchOracleDbAzureConnector(
                    PatchOracleDbAzureConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchOracleDbAzureConnectorRequest,
                                    PatchOracleDbAzureConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");
        Objects.requireNonNull(
                request.getPatchOracleDbAzureConnectorDetails(),
                "patchOracleDbAzureConnectorDetails is required");

        return clientCall(request, PatchOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "patchOracleDbAzureConnector")
                .serviceDetails("OracleDBAzureConnector", "PatchOracleDbAzureConnector", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", PatchOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchOracleDbAzureConnectorResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOracleDbAzureConnectorResponse>
            updateOracleDbAzureConnector(
                    UpdateOracleDbAzureConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOracleDbAzureConnectorRequest,
                                    UpdateOracleDbAzureConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAzureConnectorDetails(),
                "updateOracleDbAzureConnectorDetails is required");

        return clientCall(request, UpdateOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "updateOracleDbAzureConnector")
                .serviceDetails("OracleDBAzureConnector", "UpdateOracleDbAzureConnector", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAzureConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OracleDBAzureConnectorAsyncClient(
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
    public OracleDBAzureConnectorAsyncClient(
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
    public OracleDBAzureConnectorAsyncClient(
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
    public OracleDBAzureConnectorAsyncClient(
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
    public OracleDBAzureConnectorAsyncClient(
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
    public OracleDBAzureConnectorAsyncClient(
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
    public OracleDBAzureConnectorAsyncClient(
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
