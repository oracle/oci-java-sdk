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
 * Async client implementation for OracleDbAzureVaultAssociation service. <br>
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
public class OracleDbAzureVaultAssociationAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OracleDbAzureVaultAssociationAsync {
    /** Service instance for OracleDbAzureVaultAssociation. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ORACLEDBAZUREVAULTASSOCIATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OracleDbAzureVaultAssociationAsyncClient.class);

    OracleDbAzureVaultAssociationAsyncClient(
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
                    Builder, OracleDbAzureVaultAssociationAsyncClient> {
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
        public OracleDbAzureVaultAssociationAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OracleDbAzureVaultAssociationAsyncClient(
                    this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CascadingDeleteOracleDbAzureVaultAssociationResponse>
            cascadingDeleteOracleDbAzureVaultAssociation(
                    CascadingDeleteOracleDbAzureVaultAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CascadingDeleteOracleDbAzureVaultAssociationRequest,
                                    CascadingDeleteOracleDbAzureVaultAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureVaultAssociationId(),
                "oracleDbAzureVaultAssociationId must not be blank");

        return clientCall(request, CascadingDeleteOracleDbAzureVaultAssociationResponse::builder)
                .logger(LOG, "cascadingDeleteOracleDbAzureVaultAssociation")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation",
                        "CascadingDeleteOracleDbAzureVaultAssociation",
                        "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CascadingDeleteOracleDbAzureVaultAssociationRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendPathParam(request.getOracleDbAzureVaultAssociationId())
                .appendPathParam("actions")
                .appendPathParam("cascadingDelete")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        CascadingDeleteOracleDbAzureVaultAssociationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CascadingDeleteOracleDbAzureVaultAssociationResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeOracleDbAzureVaultAssociationCompartmentResponse>
            changeOracleDbAzureVaultAssociationCompartment(
                    ChangeOracleDbAzureVaultAssociationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbAzureVaultAssociationCompartmentRequest,
                                    ChangeOracleDbAzureVaultAssociationCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureVaultAssociationId(),
                "oracleDbAzureVaultAssociationId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAzureVaultAssociationCompartmentDetails(),
                "changeOracleDbAzureVaultAssociationCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAzureVaultAssociationCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAzureVaultAssociationCompartment")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation",
                        "ChangeOracleDbAzureVaultAssociationCompartment",
                        "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAzureVaultAssociationCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendPathParam(request.getOracleDbAzureVaultAssociationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOracleDbAzureVaultAssociationCompartmentResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAzureVaultAssociationCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOracleDbAzureVaultAssociationResponse>
            createOracleDbAzureVaultAssociation(
                    CreateOracleDbAzureVaultAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOracleDbAzureVaultAssociationRequest,
                                    CreateOracleDbAzureVaultAssociationResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateOracleDbAzureVaultAssociationDetails(),
                "createOracleDbAzureVaultAssociationDetails is required");

        return clientCall(request, CreateOracleDbAzureVaultAssociationResponse::builder)
                .logger(LOG, "createOracleDbAzureVaultAssociation")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation", "CreateOracleDbAzureVaultAssociation", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAzureVaultAssociationRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociation.class,
                        CreateOracleDbAzureVaultAssociationResponse.Builder
                                ::oracleDbAzureVaultAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAzureVaultAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbAzureVaultAssociationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAzureVaultAssociationResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbAzureVaultAssociationResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbAzureVaultAssociationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOracleDbAzureVaultAssociationResponse>
            deleteOracleDbAzureVaultAssociation(
                    DeleteOracleDbAzureVaultAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOracleDbAzureVaultAssociationRequest,
                                    DeleteOracleDbAzureVaultAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureVaultAssociationId(),
                "oracleDbAzureVaultAssociationId must not be blank");

        return clientCall(request, DeleteOracleDbAzureVaultAssociationResponse::builder)
                .logger(LOG, "deleteOracleDbAzureVaultAssociation")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation", "DeleteOracleDbAzureVaultAssociation", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAzureVaultAssociationRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendPathParam(request.getOracleDbAzureVaultAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbAzureVaultAssociationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAzureVaultAssociationResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbAzureVaultAssociationResponse>
            getOracleDbAzureVaultAssociation(
                    GetOracleDbAzureVaultAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOracleDbAzureVaultAssociationRequest,
                                    GetOracleDbAzureVaultAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureVaultAssociationId(),
                "oracleDbAzureVaultAssociationId must not be blank");

        return clientCall(request, GetOracleDbAzureVaultAssociationResponse::builder)
                .logger(LOG, "getOracleDbAzureVaultAssociation")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation", "GetOracleDbAzureVaultAssociation", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAzureVaultAssociationRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendPathParam(request.getOracleDbAzureVaultAssociationId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociation.class,
                        GetOracleDbAzureVaultAssociationResponse.Builder
                                ::oracleDbAzureVaultAssociation)
                .handleResponseHeaderString(
                        "etag", GetOracleDbAzureVaultAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOracleDbAzureVaultAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbAzureVaultAssociationsResponse>
            listOracleDbAzureVaultAssociations(
                    ListOracleDbAzureVaultAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOracleDbAzureVaultAssociationsRequest,
                                    ListOracleDbAzureVaultAssociationsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAzureVaultAssociationsResponse::builder)
                .logger(LOG, "listOracleDbAzureVaultAssociations")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation", "ListOracleDbAzureVaultAssociations", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAzureVaultAssociationsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("oracleDbAzureVaultId", request.getOracleDbAzureVaultId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "oracleDbAzureVaultAssociationId",
                        request.getOracleDbAzureVaultAssociationId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("oracleDbAzureConnectorId", request.getOracleDbAzureConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model
                                .OracleDbAzureVaultAssociationSummaryCollection.class,
                        ListOracleDbAzureVaultAssociationsResponse.Builder
                                ::oracleDbAzureVaultAssociationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOracleDbAzureVaultAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOracleDbAzureVaultAssociationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOracleDbAzureVaultAssociationResponse>
            updateOracleDbAzureVaultAssociation(
                    UpdateOracleDbAzureVaultAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOracleDbAzureVaultAssociationRequest,
                                    UpdateOracleDbAzureVaultAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getOracleDbAzureVaultAssociationId(),
                "oracleDbAzureVaultAssociationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAzureVaultAssociationDetails(),
                "updateOracleDbAzureVaultAssociationDetails is required");

        return clientCall(request, UpdateOracleDbAzureVaultAssociationResponse::builder)
                .logger(LOG, "updateOracleDbAzureVaultAssociation")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation", "UpdateOracleDbAzureVaultAssociation", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAzureVaultAssociationRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendPathParam(request.getOracleDbAzureVaultAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAzureVaultAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbAzureVaultAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OracleDbAzureVaultAssociationAsyncClient(
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
    public OracleDbAzureVaultAssociationAsyncClient(
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
    public OracleDbAzureVaultAssociationAsyncClient(
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
    public OracleDbAzureVaultAssociationAsyncClient(
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
    public OracleDbAzureVaultAssociationAsyncClient(
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
    public OracleDbAzureVaultAssociationAsyncClient(
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
    public OracleDbAzureVaultAssociationAsyncClient(
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
