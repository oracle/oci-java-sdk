/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ScheduledJob service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ScheduledJobAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ScheduledJobAsync {
    /** Service instance for ScheduledJob. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SCHEDULEDJOB")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ScheduledJobAsyncClient.class);

    ScheduledJobAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ScheduledJobAsyncClient> {
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
        public ScheduledJobAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ScheduledJobAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateScheduledJobResponse> createScheduledJob(
            CreateScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduledJobRequest, CreateScheduledJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateScheduledJobDetails(), "createScheduledJobDetails is required");

        return clientCall(request, CreateScheduledJobResponse::builder)
                .logger(LOG, "createScheduledJob")
                .serviceDetails("ScheduledJob", "CreateScheduledJob", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScheduledJobRequest::builder)
                .basePath("/20220901")
                .appendPathParam("scheduledJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ScheduledJob.class,
                        CreateScheduledJobResponse.Builder::scheduledJob)
                .handleResponseHeaderString(
                        "Location", CreateScheduledJobResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScheduledJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateScheduledJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledJobResponse> deleteScheduledJob(
            DeleteScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduledJobRequest, DeleteScheduledJobResponse>
                    handler) {

        Validate.notBlank(request.getScheduledJobId(), "scheduledJobId must not be blank");

        return clientCall(request, DeleteScheduledJobResponse::builder)
                .logger(LOG, "deleteScheduledJob")
                .serviceDetails("ScheduledJob", "DeleteScheduledJob", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScheduledJobRequest::builder)
                .basePath("/20220901")
                .appendPathParam("scheduledJobs")
                .appendPathParam(request.getScheduledJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScheduledJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetScheduledJobResponse> getScheduledJob(
            GetScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledJobRequest, GetScheduledJobResponse>
                    handler) {

        Validate.notBlank(request.getScheduledJobId(), "scheduledJobId must not be blank");

        return clientCall(request, GetScheduledJobResponse::builder)
                .logger(LOG, "getScheduledJob")
                .serviceDetails("ScheduledJob", "GetScheduledJob", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduledJobRequest::builder)
                .basePath("/20220901")
                .appendPathParam("scheduledJobs")
                .appendPathParam(request.getScheduledJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ScheduledJob.class,
                        GetScheduledJobResponse.Builder::scheduledJob)
                .handleResponseHeaderString("etag", GetScheduledJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduledJobResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetScheduledJobResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListScheduledJobsResponse> listScheduledJobs(
            ListScheduledJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledJobsRequest, ListScheduledJobsResponse>
                    handler) {

        return clientCall(request, ListScheduledJobsResponse::builder)
                .logger(LOG, "listScheduledJobs")
                .serviceDetails("ScheduledJob", "ListScheduledJobs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScheduledJobsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("scheduledJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("managedInstanceGroupId", request.getManagedInstanceGroupId())
                .appendQueryParam("managedCompartmentId", request.getManagedCompartmentId())
                .appendQueryParam("lifecycleStageId", request.getLifecycleStageId())
                .appendEnumQueryParam("operationType", request.getOperationType())
                .appendEnumQueryParam("scheduleType", request.getScheduleType())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("isRestricted", request.getIsRestricted())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ScheduledJobCollection.class,
                        ListScheduledJobsResponse.Builder::scheduledJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListScheduledJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScheduledJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RunScheduledJobNowResponse> runScheduledJobNow(
            RunScheduledJobNowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RunScheduledJobNowRequest, RunScheduledJobNowResponse>
                    handler) {

        Validate.notBlank(request.getScheduledJobId(), "scheduledJobId must not be blank");

        return clientCall(request, RunScheduledJobNowResponse::builder)
                .logger(LOG, "runScheduledJobNow")
                .serviceDetails("ScheduledJob", "RunScheduledJobNow", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RunScheduledJobNowRequest::builder)
                .basePath("/20220901")
                .appendPathParam("scheduledJobs")
                .appendPathParam(request.getScheduledJobId())
                .appendPathParam("actions")
                .appendPathParam("runNow")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", RunScheduledJobNowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduledJobResponse> updateScheduledJob(
            UpdateScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduledJobRequest, UpdateScheduledJobResponse>
                    handler) {

        Validate.notBlank(request.getScheduledJobId(), "scheduledJobId must not be blank");
        Objects.requireNonNull(
                request.getUpdateScheduledJobDetails(), "updateScheduledJobDetails is required");

        return clientCall(request, UpdateScheduledJobResponse::builder)
                .logger(LOG, "updateScheduledJob")
                .serviceDetails("ScheduledJob", "UpdateScheduledJob", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScheduledJobRequest::builder)
                .basePath("/20220901")
                .appendPathParam("scheduledJobs")
                .appendPathParam(request.getScheduledJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ScheduledJob.class,
                        UpdateScheduledJobResponse.Builder::scheduledJob)
                .handleResponseHeaderString("etag", UpdateScheduledJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScheduledJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ScheduledJobAsyncClient(
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
    public ScheduledJobAsyncClient(
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
    public ScheduledJobAsyncClient(
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
    public ScheduledJobAsyncClient(
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
    public ScheduledJobAsyncClient(
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
    public ScheduledJobAsyncClient(
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
    public ScheduledJobAsyncClient(
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
