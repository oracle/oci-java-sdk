/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;

import java.util.Objects;

/**
 * Async client implementation for UsagePlans service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class UsagePlansAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements UsagePlansAsync {
    /** Service instance for UsagePlans. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("USAGEPLANS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apigateway.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UsagePlansAsyncClient.class);

    UsagePlansAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, UsagePlansAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apigateway";
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
        public UsagePlansAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new UsagePlansAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeUsagePlanCompartmentResponse>
            changeUsagePlanCompartment(
                    ChangeUsagePlanCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeUsagePlanCompartmentRequest,
                                    ChangeUsagePlanCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getUsagePlanId(), "usagePlanId must not be blank");
        Objects.requireNonNull(
                request.getChangeUsagePlanCompartmentDetails(),
                "changeUsagePlanCompartmentDetails is required");

        return clientCall(request, ChangeUsagePlanCompartmentResponse::builder)
                .logger(LOG, "changeUsagePlanCompartment")
                .serviceDetails(
                        "UsagePlans",
                        "ChangeUsagePlanCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/UsagePlan/ChangeUsagePlanCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeUsagePlanCompartmentRequest::builder)
                .basePath("/20190501")
                .appendPathParam("usagePlans")
                .appendPathParam(request.getUsagePlanId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeUsagePlanCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeUsagePlanCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateUsagePlanResponse> createUsagePlan(
            CreateUsagePlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateUsagePlanRequest, CreateUsagePlanResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateUsagePlanDetails(), "createUsagePlanDetails is required");

        return clientCall(request, CreateUsagePlanResponse::builder)
                .logger(LOG, "createUsagePlan")
                .serviceDetails("UsagePlans", "CreateUsagePlan", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUsagePlanRequest::builder)
                .basePath("/20190501")
                .appendPathParam("usagePlans")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.UsagePlan.class,
                        CreateUsagePlanResponse.Builder::usagePlan)
                .handleResponseHeaderString("etag", CreateUsagePlanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateUsagePlanResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateUsagePlanResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateUsagePlanResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUsagePlanResponse> deleteUsagePlan(
            DeleteUsagePlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUsagePlanRequest, DeleteUsagePlanResponse>
                    handler) {

        Validate.notBlank(request.getUsagePlanId(), "usagePlanId must not be blank");

        return clientCall(request, DeleteUsagePlanResponse::builder)
                .logger(LOG, "deleteUsagePlan")
                .serviceDetails(
                        "UsagePlans",
                        "DeleteUsagePlan",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/UsagePlan/DeleteUsagePlan")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUsagePlanRequest::builder)
                .basePath("/20190501")
                .appendPathParam("usagePlans")
                .appendPathParam(request.getUsagePlanId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteUsagePlanResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUsagePlanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUsagePlanResponse> getUsagePlan(
            GetUsagePlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUsagePlanRequest, GetUsagePlanResponse>
                    handler) {

        Validate.notBlank(request.getUsagePlanId(), "usagePlanId must not be blank");

        return clientCall(request, GetUsagePlanResponse::builder)
                .logger(LOG, "getUsagePlan")
                .serviceDetails(
                        "UsagePlans",
                        "GetUsagePlan",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/UsagePlan/GetUsagePlan")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUsagePlanRequest::builder)
                .basePath("/20190501")
                .appendPathParam("usagePlans")
                .appendPathParam(request.getUsagePlanId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apigateway.model.UsagePlan.class,
                        GetUsagePlanResponse.Builder::usagePlan)
                .handleResponseHeaderString("etag", GetUsagePlanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetUsagePlanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUsagePlansResponse> listUsagePlans(
            ListUsagePlansRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUsagePlansRequest, ListUsagePlansResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListUsagePlansResponse::builder)
                .logger(LOG, "listUsagePlans")
                .serviceDetails(
                        "UsagePlans",
                        "ListUsagePlans",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/UsagePlan/ListUsagePlans")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUsagePlansRequest::builder)
                .basePath("/20190501")
                .appendPathParam("usagePlans")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apigateway.model.UsagePlanCollection.class,
                        ListUsagePlansResponse.Builder::usagePlanCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListUsagePlansResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUsagePlansResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListUsagePlansResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateUsagePlanResponse> updateUsagePlan(
            UpdateUsagePlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUsagePlanRequest, UpdateUsagePlanResponse>
                    handler) {

        Validate.notBlank(request.getUsagePlanId(), "usagePlanId must not be blank");
        Objects.requireNonNull(
                request.getUpdateUsagePlanDetails(), "updateUsagePlanDetails is required");

        return clientCall(request, UpdateUsagePlanResponse::builder)
                .logger(LOG, "updateUsagePlan")
                .serviceDetails(
                        "UsagePlans",
                        "UpdateUsagePlan",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/UsagePlan/UpdateUsagePlan")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUsagePlanRequest::builder)
                .basePath("/20190501")
                .appendPathParam("usagePlans")
                .appendPathParam(request.getUsagePlanId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateUsagePlanResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateUsagePlanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public UsagePlansAsyncClient(
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
    public UsagePlansAsyncClient(
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
    public UsagePlansAsyncClient(
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
    public UsagePlansAsyncClient(
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
    public UsagePlansAsyncClient(
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
    public UsagePlansAsyncClient(
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
    public UsagePlansAsyncClient(
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
