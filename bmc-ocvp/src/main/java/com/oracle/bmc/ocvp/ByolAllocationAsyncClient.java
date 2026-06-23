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
 * Async client implementation for ByolAllocation service. <br>
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
public class ByolAllocationAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ByolAllocationAsync {
    /** Service instance for ByolAllocation. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ByolAllocationClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ByolAllocationAsyncClient.class);

    ByolAllocationAsyncClient(
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
                    Builder, ByolAllocationAsyncClient> {
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
        public ByolAllocationAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ByolAllocationAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeByolAllocationCompartmentResponse>
            changeByolAllocationCompartment(
                    ChangeByolAllocationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeByolAllocationCompartmentRequest,
                                    ChangeByolAllocationCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getByolAllocationId(), "byolAllocationId must not be blank");
        Objects.requireNonNull(
                request.getChangeByolAllocationCompartmentDetails(),
                "changeByolAllocationCompartmentDetails is required");

        return clientCall(request, ChangeByolAllocationCompartmentResponse::builder)
                .logger(LOG, "changeByolAllocationCompartment")
                .serviceDetails(
                        "ByolAllocation",
                        "ChangeByolAllocationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocation/ChangeByolAllocationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeByolAllocationCompartmentRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .appendPathParam(request.getByolAllocationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeByolAllocationCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateByolAllocationResponse> createByolAllocation(
            CreateByolAllocationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateByolAllocationRequest, CreateByolAllocationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateByolAllocationDetails(),
                "createByolAllocationDetails is required");

        return clientCall(request, CreateByolAllocationResponse::builder)
                .logger(LOG, "createByolAllocation")
                .serviceDetails(
                        "ByolAllocation",
                        "CreateByolAllocation",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocation/CreateByolAllocation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateByolAllocationRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateByolAllocationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateByolAllocationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteByolAllocationResponse> deleteByolAllocation(
            DeleteByolAllocationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteByolAllocationRequest, DeleteByolAllocationResponse>
                    handler) {

        Validate.notBlank(request.getByolAllocationId(), "byolAllocationId must not be blank");

        return clientCall(request, DeleteByolAllocationResponse::builder)
                .logger(LOG, "deleteByolAllocation")
                .serviceDetails(
                        "ByolAllocation",
                        "DeleteByolAllocation",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocation/DeleteByolAllocation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteByolAllocationRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .appendPathParam(request.getByolAllocationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteByolAllocationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteByolAllocationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetByolAllocationResponse> getByolAllocation(
            GetByolAllocationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetByolAllocationRequest, GetByolAllocationResponse>
                    handler) {

        Validate.notBlank(request.getByolAllocationId(), "byolAllocationId must not be blank");

        return clientCall(request, GetByolAllocationResponse::builder)
                .logger(LOG, "getByolAllocation")
                .serviceDetails(
                        "ByolAllocation",
                        "GetByolAllocation",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocation/GetByolAllocation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetByolAllocationRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .appendPathParam(request.getByolAllocationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.ByolAllocation.class,
                        GetByolAllocationResponse.Builder::byolAllocation)
                .handleResponseHeaderString("etag", GetByolAllocationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetByolAllocationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListByolAllocationsResponse> listByolAllocations(
            ListByolAllocationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListByolAllocationsRequest, ListByolAllocationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListByolAllocationsResponse::builder)
                .logger(LOG, "listByolAllocations")
                .serviceDetails(
                        "ByolAllocation",
                        "ListByolAllocations",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocationSummary/ListByolAllocations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListByolAllocationsRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("byolAllocationId", request.getByolAllocationId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("softwareType", request.getSoftwareType())
                .appendQueryParam(
                        "availableUnitsGreaterThanOrEqualTo",
                        request.getAvailableUnitsGreaterThanOrEqualTo())
                .appendQueryParam("byolId", request.getByolId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.ByolAllocationCollection.class,
                        ListByolAllocationsResponse.Builder::byolAllocationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListByolAllocationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListByolAllocationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateByolAllocationResponse> updateByolAllocation(
            UpdateByolAllocationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateByolAllocationRequest, UpdateByolAllocationResponse>
                    handler) {

        Validate.notBlank(request.getByolAllocationId(), "byolAllocationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateByolAllocationDetails(),
                "updateByolAllocationDetails is required");

        return clientCall(request, UpdateByolAllocationResponse::builder)
                .logger(LOG, "updateByolAllocation")
                .serviceDetails(
                        "ByolAllocation",
                        "UpdateByolAllocation",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocation/UpdateByolAllocation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateByolAllocationRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .appendPathParam(request.getByolAllocationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateByolAllocationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateByolAllocationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ByolAllocationAsyncClient(
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
    public ByolAllocationAsyncClient(
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
    public ByolAllocationAsyncClient(
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
    public ByolAllocationAsyncClient(
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
    public ByolAllocationAsyncClient(
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
    public ByolAllocationAsyncClient(
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
    public ByolAllocationAsyncClient(
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
