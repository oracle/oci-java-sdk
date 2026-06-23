/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Byol service. <br>
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
public class ByolAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ByolAsync {
    /** Service instance for Byol. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ByolClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ByolAsyncClient.class);

    ByolAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ByolAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ocvp";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public ByolAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ByolAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeByolCompartmentResponse> changeByolCompartment(
            ChangeByolCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeByolCompartmentRequest, ChangeByolCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getByolId(), "byolId must not be blank");
        Objects.requireNonNull(
                request.getChangeByolCompartmentDetails(),
                "changeByolCompartmentDetails is required");

        return clientCall(request, ChangeByolCompartmentResponse::builder)
                .logger(LOG, "changeByolCompartment")
                .serviceDetails(
                        "Byol",
                        "ChangeByolCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Byol/ChangeByolCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeByolCompartmentRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byols")
                .appendPathParam(request.getByolId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeByolCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateByolResponse> createByol(
            CreateByolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateByolRequest, CreateByolResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateByolDetails(), "createByolDetails is required");

        return clientCall(request, CreateByolResponse::builder)
                .logger(LOG, "createByol")
                .serviceDetails(
                        "Byol",
                        "CreateByol",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Byol/CreateByol")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateByolRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byols")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateByolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateByolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteByolResponse> deleteByol(
            DeleteByolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteByolRequest, DeleteByolResponse>
                    handler) {

        Validate.notBlank(request.getByolId(), "byolId must not be blank");

        return clientCall(request, DeleteByolResponse::builder)
                .logger(LOG, "deleteByol")
                .serviceDetails(
                        "Byol",
                        "DeleteByol",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/BYOL/DeleteByol")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteByolRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byols")
                .appendPathParam(request.getByolId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteByolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteByolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetByolResponse> getByol(
            GetByolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetByolRequest, GetByolResponse> handler) {

        Validate.notBlank(request.getByolId(), "byolId must not be blank");

        return clientCall(request, GetByolResponse::builder)
                .logger(LOG, "getByol")
                .serviceDetails(
                        "Byol",
                        "GetByol",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Byol/GetByol")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetByolRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byols")
                .appendPathParam(request.getByolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.ocvp.model.Byol.class, GetByolResponse.Builder::byol)
                .handleResponseHeaderString("etag", GetByolResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetByolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListByolsResponse> listByols(
            ListByolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListByolsRequest, ListByolsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListByolsResponse::builder)
                .logger(LOG, "listByols")
                .serviceDetails(
                        "Byol",
                        "ListByols",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolSummary/ListByols")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListByolsRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byols")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("byolId", request.getByolId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("softwareType", request.getSoftwareType())
                .appendQueryParam(
                        "availableUnitsGreaterThanOrEqualTo",
                        request.getAvailableUnitsGreaterThanOrEqualTo())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.ByolCollection.class,
                        ListByolsResponse.Builder::byolCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListByolsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListByolsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetrieveByolRealmAllocationsResponse>
            retrieveByolRealmAllocations(
                    RetrieveByolRealmAllocationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RetrieveByolRealmAllocationsRequest,
                                    RetrieveByolRealmAllocationsResponse>
                            handler) {

        Validate.notBlank(request.getByolId(), "byolId must not be blank");

        return clientCall(request, RetrieveByolRealmAllocationsResponse::builder)
                .logger(LOG, "retrieveByolRealmAllocations")
                .serviceDetails(
                        "Byol",
                        "RetrieveByolRealmAllocations",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Byol/RetrieveByolRealmAllocations")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveByolRealmAllocationsRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byols")
                .appendPathParam(request.getByolId())
                .appendPathParam("actions")
                .appendPathParam("retrieveByolRealmAllocations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.ByolRealmAllocationCollection.class,
                        RetrieveByolRealmAllocationsResponse.Builder::byolRealmAllocationCollection)
                .handleResponseHeaderString(
                        "opc-next-page", RetrieveByolRealmAllocationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RetrieveByolRealmAllocationsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateByolResponse> updateByol(
            UpdateByolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateByolRequest, UpdateByolResponse>
                    handler) {

        Validate.notBlank(request.getByolId(), "byolId must not be blank");
        Objects.requireNonNull(request.getUpdateByolDetails(), "updateByolDetails is required");

        return clientCall(request, UpdateByolResponse::builder)
                .logger(LOG, "updateByol")
                .serviceDetails(
                        "Byol",
                        "UpdateByol",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Byol/UpdateByol")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateByolRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byols")
                .appendPathParam(request.getByolId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateByolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateByolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ByolAsyncClient(
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
    public ByolAsyncClient(
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
    public ByolAsyncClient(
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
    public ByolAsyncClient(
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
    public ByolAsyncClient(
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
    public ByolAsyncClient(
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
    public ByolAsyncClient(
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
