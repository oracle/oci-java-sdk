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
 * Async client implementation for ApplianceExportJob service. <br>
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
public class ApplianceExportJobAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ApplianceExportJobAsync {
    /** Service instance for ApplianceExportJob. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("APPLIANCEEXPORTJOB")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datatransfer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApplianceExportJobAsyncClient.class);

    ApplianceExportJobAsyncClient(
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
                    Builder, ApplianceExportJobAsyncClient> {
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
        public ApplianceExportJobAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ApplianceExportJobAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeApplianceExportJobCompartmentResponse>
            changeApplianceExportJobCompartment(
                    ChangeApplianceExportJobCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeApplianceExportJobCompartmentRequest,
                                    ChangeApplianceExportJobCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getApplianceExportJobId(), "applianceExportJobId must not be blank");
        Objects.requireNonNull(
                request.getChangeApplianceExportJobCompartmentDetails(),
                "changeApplianceExportJobCompartmentDetails is required");

        return clientCall(request, ChangeApplianceExportJobCompartmentResponse::builder)
                .logger(LOG, "changeApplianceExportJobCompartment")
                .serviceDetails("ApplianceExportJob", "ChangeApplianceExportJobCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeApplianceExportJobCompartmentRequest::builder)
                .basePath("/20171001")
                .appendPathParam("applianceExportJobs")
                .appendPathParam(request.getApplianceExportJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeApplianceExportJobCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateApplianceExportJobResponse> createApplianceExportJob(
            CreateApplianceExportJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateApplianceExportJobRequest, CreateApplianceExportJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateApplianceExportJobDetails(),
                "createApplianceExportJobDetails is required");

        return clientCall(request, CreateApplianceExportJobResponse::builder)
                .logger(LOG, "createApplianceExportJob")
                .serviceDetails("ApplianceExportJob", "CreateApplianceExportJob", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApplianceExportJobRequest::builder)
                .basePath("/20171001")
                .appendPathParam("applianceExportJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.ApplianceExportJob.class,
                        CreateApplianceExportJobResponse.Builder::applianceExportJob)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApplianceExportJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateApplianceExportJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplianceExportJobResponse> deleteApplianceExportJob(
            DeleteApplianceExportJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteApplianceExportJobRequest, DeleteApplianceExportJobResponse>
                    handler) {

        Validate.notBlank(
                request.getApplianceExportJobId(), "applianceExportJobId must not be blank");

        return clientCall(request, DeleteApplianceExportJobResponse::builder)
                .logger(LOG, "deleteApplianceExportJob")
                .serviceDetails("ApplianceExportJob", "DeleteApplianceExportJob", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApplianceExportJobRequest::builder)
                .basePath("/20171001")
                .appendPathParam("applianceExportJobs")
                .appendPathParam(request.getApplianceExportJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApplianceExportJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApplianceExportJobResponse> getApplianceExportJob(
            GetApplianceExportJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetApplianceExportJobRequest, GetApplianceExportJobResponse>
                    handler) {

        Validate.notBlank(
                request.getApplianceExportJobId(), "applianceExportJobId must not be blank");

        return clientCall(request, GetApplianceExportJobResponse::builder)
                .logger(LOG, "getApplianceExportJob")
                .serviceDetails("ApplianceExportJob", "GetApplianceExportJob", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApplianceExportJobRequest::builder)
                .basePath("/20171001")
                .appendPathParam("applianceExportJobs")
                .appendPathParam(request.getApplianceExportJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dts.model.ApplianceExportJob.class,
                        GetApplianceExportJobResponse.Builder::applianceExportJob)
                .handleResponseHeaderString(
                        "opc-request-id", GetApplianceExportJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetApplianceExportJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApplianceExportJobsResponse> listApplianceExportJobs(
            ListApplianceExportJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApplianceExportJobsRequest, ListApplianceExportJobsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListApplianceExportJobsResponse::builder)
                .logger(LOG, "listApplianceExportJobs")
                .serviceDetails("ApplianceExportJob", "ListApplianceExportJobs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplianceExportJobsRequest::builder)
                .basePath("/20171001")
                .appendPathParam("applianceExportJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dts.model.ApplianceExportJobSummary.class,
                        ListApplianceExportJobsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplianceExportJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplianceExportJobsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplianceExportJobResponse> updateApplianceExportJob(
            UpdateApplianceExportJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateApplianceExportJobRequest, UpdateApplianceExportJobResponse>
                    handler) {

        Validate.notBlank(
                request.getApplianceExportJobId(), "applianceExportJobId must not be blank");
        Objects.requireNonNull(
                request.getUpdateApplianceExportJobDetails(),
                "updateApplianceExportJobDetails is required");

        return clientCall(request, UpdateApplianceExportJobResponse::builder)
                .logger(LOG, "updateApplianceExportJob")
                .serviceDetails("ApplianceExportJob", "UpdateApplianceExportJob", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApplianceExportJobRequest::builder)
                .basePath("/20171001")
                .appendPathParam("applianceExportJobs")
                .appendPathParam(request.getApplianceExportJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.ApplianceExportJob.class,
                        UpdateApplianceExportJobResponse.Builder::applianceExportJob)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApplianceExportJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateApplianceExportJobResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApplianceExportJobAsyncClient(
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
    public ApplianceExportJobAsyncClient(
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
    public ApplianceExportJobAsyncClient(
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
    public ApplianceExportJobAsyncClient(
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
    public ApplianceExportJobAsyncClient(
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
    public ApplianceExportJobAsyncClient(
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
    public ApplianceExportJobAsyncClient(
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
