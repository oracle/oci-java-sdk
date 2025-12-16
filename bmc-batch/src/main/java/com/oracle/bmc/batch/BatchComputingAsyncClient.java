/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.batch.requests.*;
import com.oracle.bmc.batch.responses.*;

import java.util.Objects;

/**
 * Async client implementation for BatchComputing service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public class BatchComputingAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements BatchComputingAsync {
    /** Service instance for BatchComputing. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(BatchComputingClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://batch.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BatchComputingAsyncClient.class);

    BatchComputingAsyncClient(
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
                    Builder, BatchComputingAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "batch";
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
        public BatchComputingAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BatchComputingAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelBatchJobResponse> cancelBatchJob(
            CancelBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelBatchJobRequest, CancelBatchJobResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobId(), "batchJobId must not be blank");

        return clientCall(request, CancelBatchJobResponse::builder)
                .logger(LOG, "cancelBatchJob")
                .serviceDetails("BatchComputing", "CancelBatchJob", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelBatchJobRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .appendPathParam(request.getBatchJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", CancelBatchJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CancelBatchJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeBatchContextCompartmentResponse>
            changeBatchContextCompartment(
                    ChangeBatchContextCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchContextCompartmentRequest,
                                    ChangeBatchContextCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getBatchContextId(), "batchContextId must not be blank");
        Objects.requireNonNull(
                request.getChangeBatchContextCompartmentDetails(),
                "changeBatchContextCompartmentDetails is required");

        return clientCall(request, ChangeBatchContextCompartmentResponse::builder)
                .logger(LOG, "changeBatchContextCompartment")
                .serviceDetails("BatchComputing", "ChangeBatchContextCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBatchContextCompartmentRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchContexts")
                .appendPathParam(request.getBatchContextId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBatchContextCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBatchContextCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeBatchJobCompartmentResponse> changeBatchJobCompartment(
            ChangeBatchJobCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeBatchJobCompartmentRequest, ChangeBatchJobCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobId(), "batchJobId must not be blank");
        Objects.requireNonNull(
                request.getChangeBatchJobCompartmentDetails(),
                "changeBatchJobCompartmentDetails is required");

        return clientCall(request, ChangeBatchJobCompartmentResponse::builder)
                .logger(LOG, "changeBatchJobCompartment")
                .serviceDetails("BatchComputing", "ChangeBatchJobCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBatchJobCompartmentRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .appendPathParam(request.getBatchJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBatchJobCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeBatchJobCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeBatchJobPoolCompartmentResponse>
            changeBatchJobPoolCompartment(
                    ChangeBatchJobPoolCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchJobPoolCompartmentRequest,
                                    ChangeBatchJobPoolCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getBatchJobPoolId(), "batchJobPoolId must not be blank");
        Objects.requireNonNull(
                request.getChangeBatchJobPoolCompartmentDetails(),
                "changeBatchJobPoolCompartmentDetails is required");

        return clientCall(request, ChangeBatchJobPoolCompartmentResponse::builder)
                .logger(LOG, "changeBatchJobPoolCompartment")
                .serviceDetails("BatchComputing", "ChangeBatchJobPoolCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBatchJobPoolCompartmentRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobPools")
                .appendPathParam(request.getBatchJobPoolId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBatchJobPoolCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBatchJobPoolCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeBatchTaskEnvironmentCompartmentResponse>
            changeBatchTaskEnvironmentCompartment(
                    ChangeBatchTaskEnvironmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchTaskEnvironmentCompartmentRequest,
                                    ChangeBatchTaskEnvironmentCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getBatchTaskEnvironmentId(), "batchTaskEnvironmentId must not be blank");
        Objects.requireNonNull(
                request.getChangeBatchTaskEnvironmentCompartmentDetails(),
                "changeBatchTaskEnvironmentCompartmentDetails is required");

        return clientCall(request, ChangeBatchTaskEnvironmentCompartmentResponse::builder)
                .logger(LOG, "changeBatchTaskEnvironmentCompartment")
                .serviceDetails("BatchComputing", "ChangeBatchTaskEnvironmentCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBatchTaskEnvironmentCompartmentRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskEnvironments")
                .appendPathParam(request.getBatchTaskEnvironmentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBatchTaskEnvironmentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBatchTaskEnvironmentCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeBatchTaskProfileCompartmentResponse>
            changeBatchTaskProfileCompartment(
                    ChangeBatchTaskProfileCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchTaskProfileCompartmentRequest,
                                    ChangeBatchTaskProfileCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getBatchTaskProfileId(), "batchTaskProfileId must not be blank");
        Objects.requireNonNull(
                request.getChangeBatchTaskProfileCompartmentDetails(),
                "changeBatchTaskProfileCompartmentDetails is required");

        return clientCall(request, ChangeBatchTaskProfileCompartmentResponse::builder)
                .logger(LOG, "changeBatchTaskProfileCompartment")
                .serviceDetails("BatchComputing", "ChangeBatchTaskProfileCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBatchTaskProfileCompartmentRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskProfiles")
                .appendPathParam(request.getBatchTaskProfileId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBatchTaskProfileCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBatchTaskProfileCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchContextResponse> createBatchContext(
            CreateBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchContextRequest, CreateBatchContextResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateBatchContextDetails(), "createBatchContextDetails is required");

        return clientCall(request, CreateBatchContextResponse::builder)
                .logger(LOG, "createBatchContext")
                .serviceDetails("BatchComputing", "CreateBatchContext", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBatchContextRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchContexts")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchContext.class,
                        CreateBatchContextResponse.Builder::batchContext)
                .handleResponseHeaderString(
                        "location", CreateBatchContextResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateBatchContextResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateBatchContextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBatchContextResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBatchContextResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchJobResponse> createBatchJob(
            CreateBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchJobRequest, CreateBatchJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateBatchJobDetails(), "createBatchJobDetails is required");

        return clientCall(request, CreateBatchJobResponse::builder)
                .logger(LOG, "createBatchJob")
                .serviceDetails("BatchComputing", "CreateBatchJob", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBatchJobRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJob.class,
                        CreateBatchJobResponse.Builder::batchJob)
                .handleResponseHeaderString("location", CreateBatchJobResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateBatchJobResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateBatchJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBatchJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBatchJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchJobPoolResponse> createBatchJobPool(
            CreateBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchJobPoolRequest, CreateBatchJobPoolResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateBatchJobPoolDetails(), "createBatchJobPoolDetails is required");

        return clientCall(request, CreateBatchJobPoolResponse::builder)
                .logger(LOG, "createBatchJobPool")
                .serviceDetails("BatchComputing", "CreateBatchJobPool", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBatchJobPoolRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobPools")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJobPool.class,
                        CreateBatchJobPoolResponse.Builder::batchJobPool)
                .handleResponseHeaderString("etag", CreateBatchJobPoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBatchJobPoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchTaskEnvironmentResponse>
            createBatchTaskEnvironment(
                    CreateBatchTaskEnvironmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateBatchTaskEnvironmentRequest,
                                    CreateBatchTaskEnvironmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateBatchTaskEnvironmentDetails(),
                "createBatchTaskEnvironmentDetails is required");

        return clientCall(request, CreateBatchTaskEnvironmentResponse::builder)
                .logger(LOG, "createBatchTaskEnvironment")
                .serviceDetails("BatchComputing", "CreateBatchTaskEnvironment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBatchTaskEnvironmentRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskEnvironments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskEnvironment.class,
                        CreateBatchTaskEnvironmentResponse.Builder::batchTaskEnvironment)
                .handleResponseHeaderString(
                        "etag", CreateBatchTaskEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBatchTaskEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchTaskProfileResponse> createBatchTaskProfile(
            CreateBatchTaskProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchTaskProfileRequest, CreateBatchTaskProfileResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateBatchTaskProfileDetails(),
                "createBatchTaskProfileDetails is required");

        return clientCall(request, CreateBatchTaskProfileResponse::builder)
                .logger(LOG, "createBatchTaskProfile")
                .serviceDetails("BatchComputing", "CreateBatchTaskProfile", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBatchTaskProfileRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskProfiles")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskProfile.class,
                        CreateBatchTaskProfileResponse.Builder::batchTaskProfile)
                .handleResponseHeaderString("etag", CreateBatchTaskProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBatchTaskProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchContextResponse> deleteBatchContext(
            DeleteBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBatchContextRequest, DeleteBatchContextResponse>
                    handler) {

        Validate.notBlank(request.getBatchContextId(), "batchContextId must not be blank");

        return clientCall(request, DeleteBatchContextResponse::builder)
                .logger(LOG, "deleteBatchContext")
                .serviceDetails("BatchComputing", "DeleteBatchContext", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBatchContextRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchContexts")
                .appendPathParam(request.getBatchContextId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBatchContextResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBatchContextResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchJobPoolResponse> deleteBatchJobPool(
            DeleteBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBatchJobPoolRequest, DeleteBatchJobPoolResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobPoolId(), "batchJobPoolId must not be blank");

        return clientCall(request, DeleteBatchJobPoolResponse::builder)
                .logger(LOG, "deleteBatchJobPool")
                .serviceDetails("BatchComputing", "DeleteBatchJobPool", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBatchJobPoolRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobPools")
                .appendPathParam(request.getBatchJobPoolId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBatchJobPoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchTaskEnvironmentResponse>
            deleteBatchTaskEnvironment(
                    DeleteBatchTaskEnvironmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteBatchTaskEnvironmentRequest,
                                    DeleteBatchTaskEnvironmentResponse>
                            handler) {

        Validate.notBlank(
                request.getBatchTaskEnvironmentId(), "batchTaskEnvironmentId must not be blank");

        return clientCall(request, DeleteBatchTaskEnvironmentResponse::builder)
                .logger(LOG, "deleteBatchTaskEnvironment")
                .serviceDetails("BatchComputing", "DeleteBatchTaskEnvironment", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBatchTaskEnvironmentRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskEnvironments")
                .appendPathParam(request.getBatchTaskEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBatchTaskEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchTaskProfileResponse> deleteBatchTaskProfile(
            DeleteBatchTaskProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBatchTaskProfileRequest, DeleteBatchTaskProfileResponse>
                    handler) {

        Validate.notBlank(request.getBatchTaskProfileId(), "batchTaskProfileId must not be blank");

        return clientCall(request, DeleteBatchTaskProfileResponse::builder)
                .logger(LOG, "deleteBatchTaskProfile")
                .serviceDetails("BatchComputing", "DeleteBatchTaskProfile", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBatchTaskProfileRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskProfiles")
                .appendPathParam(request.getBatchTaskProfileId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBatchTaskProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBatchContextResponse> getBatchContext(
            GetBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBatchContextRequest, GetBatchContextResponse>
                    handler) {

        Validate.notBlank(request.getBatchContextId(), "batchContextId must not be blank");

        return clientCall(request, GetBatchContextResponse::builder)
                .logger(LOG, "getBatchContext")
                .serviceDetails("BatchComputing", "GetBatchContext", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBatchContextRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchContexts")
                .appendPathParam(request.getBatchContextId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchContext.class,
                        GetBatchContextResponse.Builder::batchContext)
                .handleResponseHeaderString("etag", GetBatchContextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchContextResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBatchJobResponse> getBatchJob(
            GetBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBatchJobRequest, GetBatchJobResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobId(), "batchJobId must not be blank");

        return clientCall(request, GetBatchJobResponse::builder)
                .logger(LOG, "getBatchJob")
                .serviceDetails("BatchComputing", "GetBatchJob", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBatchJobRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .appendPathParam(request.getBatchJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJob.class,
                        GetBatchJobResponse.Builder::batchJob)
                .handleResponseHeaderString("etag", GetBatchJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBatchJobPoolResponse> getBatchJobPool(
            GetBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBatchJobPoolRequest, GetBatchJobPoolResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobPoolId(), "batchJobPoolId must not be blank");

        return clientCall(request, GetBatchJobPoolResponse::builder)
                .logger(LOG, "getBatchJobPool")
                .serviceDetails("BatchComputing", "GetBatchJobPool", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBatchJobPoolRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobPools")
                .appendPathParam(request.getBatchJobPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJobPool.class,
                        GetBatchJobPoolResponse.Builder::batchJobPool)
                .handleResponseHeaderString("etag", GetBatchJobPoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchJobPoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBatchTaskResponse> getBatchTask(
            GetBatchTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBatchTaskRequest, GetBatchTaskResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobId(), "batchJobId must not be blank");

        Validate.notBlank(request.getTaskName(), "taskName must not be blank");

        return clientCall(request, GetBatchTaskResponse::builder)
                .logger(LOG, "getBatchTask")
                .serviceDetails("BatchComputing", "GetBatchTask", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBatchTaskRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .appendPathParam(request.getBatchJobId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTask.class,
                        GetBatchTaskResponse.Builder::batchTask)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBatchTaskEnvironmentResponse> getBatchTaskEnvironment(
            GetBatchTaskEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBatchTaskEnvironmentRequest, GetBatchTaskEnvironmentResponse>
                    handler) {

        Validate.notBlank(
                request.getBatchTaskEnvironmentId(), "batchTaskEnvironmentId must not be blank");

        return clientCall(request, GetBatchTaskEnvironmentResponse::builder)
                .logger(LOG, "getBatchTaskEnvironment")
                .serviceDetails("BatchComputing", "GetBatchTaskEnvironment", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBatchTaskEnvironmentRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskEnvironments")
                .appendPathParam(request.getBatchTaskEnvironmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskEnvironment.class,
                        GetBatchTaskEnvironmentResponse.Builder::batchTaskEnvironment)
                .handleResponseHeaderString("etag", GetBatchTaskEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchTaskEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBatchTaskProfileResponse> getBatchTaskProfile(
            GetBatchTaskProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBatchTaskProfileRequest, GetBatchTaskProfileResponse>
                    handler) {

        Validate.notBlank(request.getBatchTaskProfileId(), "batchTaskProfileId must not be blank");

        return clientCall(request, GetBatchTaskProfileResponse::builder)
                .logger(LOG, "getBatchTaskProfile")
                .serviceDetails("BatchComputing", "GetBatchTaskProfile", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBatchTaskProfileRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskProfiles")
                .appendPathParam(request.getBatchTaskProfileId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskProfile.class,
                        GetBatchTaskProfileResponse.Builder::batchTaskProfile)
                .handleResponseHeaderString("etag", GetBatchTaskProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchTaskProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails("BatchComputing", "GetWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20251031")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBatchContextShapesResponse> listBatchContextShapes(
            ListBatchContextShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchContextShapesRequest, ListBatchContextShapesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBatchContextShapesResponse::builder)
                .logger(LOG, "listBatchContextShapes")
                .serviceDetails("BatchComputing", "ListBatchContextShapes", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBatchContextShapesRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchContextShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchContextShapeCollection.class,
                        ListBatchContextShapesResponse.Builder::batchContextShapeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchContextShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchContextShapesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBatchContextsResponse> listBatchContexts(
            ListBatchContextsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchContextsRequest, ListBatchContextsResponse>
                    handler) {

        return clientCall(request, ListBatchContextsResponse::builder)
                .logger(LOG, "listBatchContexts")
                .serviceDetails("BatchComputing", "ListBatchContexts", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBatchContextsRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchContexts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchContextCollection.class,
                        ListBatchContextsResponse.Builder::batchContextCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchContextsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchContextsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBatchJobPoolsResponse> listBatchJobPools(
            ListBatchJobPoolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchJobPoolsRequest, ListBatchJobPoolsResponse>
                    handler) {

        return clientCall(request, ListBatchJobPoolsResponse::builder)
                .logger(LOG, "listBatchJobPools")
                .serviceDetails("BatchComputing", "ListBatchJobPools", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBatchJobPoolsRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobPools")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("batchContextId", request.getBatchContextId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJobPoolCollection.class,
                        ListBatchJobPoolsResponse.Builder::batchJobPoolCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchJobPoolsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchJobPoolsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBatchJobTasksResponse> listBatchJobTasks(
            ListBatchJobTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchJobTasksRequest, ListBatchJobTasksResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobId(), "batchJobId must not be blank");

        return clientCall(request, ListBatchJobTasksResponse::builder)
                .logger(LOG, "listBatchJobTasks")
                .serviceDetails("BatchComputing", "ListBatchJobTasks", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBatchJobTasksRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .appendPathParam(request.getBatchJobId())
                .appendPathParam("tasks")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskCollection.class,
                        ListBatchJobTasksResponse.Builder::batchTaskCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchJobTasksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchJobTasksResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBatchJobsResponse> listBatchJobs(
            ListBatchJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBatchJobsRequest, ListBatchJobsResponse>
                    handler) {

        return clientCall(request, ListBatchJobsResponse::builder)
                .logger(LOG, "listBatchJobs")
                .serviceDetails("BatchComputing", "ListBatchJobs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBatchJobsRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("batchJobPoolId", request.getBatchJobPoolId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJobCollection.class,
                        ListBatchJobsResponse.Builder::batchJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBatchTaskEnvironmentsResponse> listBatchTaskEnvironments(
            ListBatchTaskEnvironmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchTaskEnvironmentsRequest, ListBatchTaskEnvironmentsResponse>
                    handler) {

        return clientCall(request, ListBatchTaskEnvironmentsResponse::builder)
                .logger(LOG, "listBatchTaskEnvironments")
                .serviceDetails("BatchComputing", "ListBatchTaskEnvironments", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBatchTaskEnvironmentsRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskEnvironments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskEnvironmentCollection.class,
                        ListBatchTaskEnvironmentsResponse.Builder::batchTaskEnvironmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchTaskEnvironmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchTaskEnvironmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBatchTaskProfilesResponse> listBatchTaskProfiles(
            ListBatchTaskProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchTaskProfilesRequest, ListBatchTaskProfilesResponse>
                    handler) {

        return clientCall(request, ListBatchTaskProfilesResponse::builder)
                .logger(LOG, "listBatchTaskProfiles")
                .serviceDetails("BatchComputing", "ListBatchTaskProfiles", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBatchTaskProfilesRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskProfiles")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskProfileCollection.class,
                        ListBatchTaskProfilesResponse.Builder::batchTaskProfileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchTaskProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchTaskProfilesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBatchTasksResponse> listBatchTasks(
            ListBatchTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchTasksRequest, ListBatchTasksResponse>
                    handler) {

        return clientCall(request, ListBatchTasksResponse::builder)
                .logger(LOG, "listBatchTasks")
                .serviceDetails("BatchComputing", "ListBatchTasks", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBatchTasksRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .appendPathParam("tasks")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("batchJobId", request.getBatchJobId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskCollection.class,
                        ListBatchTasksResponse.Builder::batchTaskCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchTasksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchTasksResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails("BatchComputing", "ListWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20251031")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails("BatchComputing", "ListWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20251031")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails("BatchComputing", "ListWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20251031")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.batch.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PauseBatchJobResponse> pauseBatchJob(
            PauseBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PauseBatchJobRequest, PauseBatchJobResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobId(), "batchJobId must not be blank");
        Objects.requireNonNull(
                request.getPauseBatchJobDetails(), "pauseBatchJobDetails is required");

        return clientCall(request, PauseBatchJobResponse::builder)
                .logger(LOG, "pauseBatchJob")
                .serviceDetails("BatchComputing", "PauseBatchJob", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PauseBatchJobRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .appendPathParam(request.getBatchJobId())
                .appendPathParam("actions")
                .appendPathParam("pause")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PauseBatchJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PauseBatchJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartBatchContextResponse> startBatchContext(
            StartBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartBatchContextRequest, StartBatchContextResponse>
                    handler) {

        Validate.notBlank(request.getBatchContextId(), "batchContextId must not be blank");
        Objects.requireNonNull(
                request.getStartBatchContextDetails(), "startBatchContextDetails is required");

        return clientCall(request, StartBatchContextResponse::builder)
                .logger(LOG, "startBatchContext")
                .serviceDetails("BatchComputing", "StartBatchContext", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartBatchContextRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchContexts")
                .appendPathParam(request.getBatchContextId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartBatchContextResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartBatchContextResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartBatchJobPoolResponse> startBatchJobPool(
            StartBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartBatchJobPoolRequest, StartBatchJobPoolResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobPoolId(), "batchJobPoolId must not be blank");
        Objects.requireNonNull(
                request.getStartBatchJobPoolDetails(), "startBatchJobPoolDetails is required");

        return clientCall(request, StartBatchJobPoolResponse::builder)
                .logger(LOG, "startBatchJobPool")
                .serviceDetails("BatchComputing", "StartBatchJobPool", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartBatchJobPoolRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobPools")
                .appendPathParam(request.getBatchJobPoolId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartBatchJobPoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartBatchJobPoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopBatchContextResponse> stopBatchContext(
            StopBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopBatchContextRequest, StopBatchContextResponse>
                    handler) {

        Validate.notBlank(request.getBatchContextId(), "batchContextId must not be blank");
        Objects.requireNonNull(
                request.getStopBatchContextDetails(), "stopBatchContextDetails is required");

        return clientCall(request, StopBatchContextResponse::builder)
                .logger(LOG, "stopBatchContext")
                .serviceDetails("BatchComputing", "StopBatchContext", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopBatchContextRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchContexts")
                .appendPathParam(request.getBatchContextId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StopBatchContextResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopBatchContextResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopBatchJobPoolResponse> stopBatchJobPool(
            StopBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopBatchJobPoolRequest, StopBatchJobPoolResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobPoolId(), "batchJobPoolId must not be blank");
        Objects.requireNonNull(
                request.getStopBatchJobPoolDetails(), "stopBatchJobPoolDetails is required");

        return clientCall(request, StopBatchJobPoolResponse::builder)
                .logger(LOG, "stopBatchJobPool")
                .serviceDetails("BatchComputing", "StopBatchJobPool", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopBatchJobPoolRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobPools")
                .appendPathParam(request.getBatchJobPoolId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StopBatchJobPoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopBatchJobPoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UnpauseBatchJobResponse> unpauseBatchJob(
            UnpauseBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UnpauseBatchJobRequest, UnpauseBatchJobResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobId(), "batchJobId must not be blank");
        Objects.requireNonNull(
                request.getUnpauseBatchJobDetails(), "unpauseBatchJobDetails is required");

        return clientCall(request, UnpauseBatchJobResponse::builder)
                .logger(LOG, "unpauseBatchJob")
                .serviceDetails("BatchComputing", "UnpauseBatchJob", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UnpauseBatchJobRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .appendPathParam(request.getBatchJobId())
                .appendPathParam("actions")
                .appendPathParam("unpause")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UnpauseBatchJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UnpauseBatchJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchContextResponse> updateBatchContext(
            UpdateBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchContextRequest, UpdateBatchContextResponse>
                    handler) {

        Validate.notBlank(request.getBatchContextId(), "batchContextId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBatchContextDetails(), "updateBatchContextDetails is required");

        return clientCall(request, UpdateBatchContextResponse::builder)
                .logger(LOG, "updateBatchContext")
                .serviceDetails("BatchComputing", "UpdateBatchContext", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBatchContextRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchContexts")
                .appendPathParam(request.getBatchContextId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBatchContextResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBatchContextResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchJobResponse> updateBatchJob(
            UpdateBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchJobRequest, UpdateBatchJobResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobId(), "batchJobId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBatchJobDetails(), "updateBatchJobDetails is required");

        return clientCall(request, UpdateBatchJobResponse::builder)
                .logger(LOG, "updateBatchJob")
                .serviceDetails("BatchComputing", "UpdateBatchJob", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBatchJobRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobs")
                .appendPathParam(request.getBatchJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBatchJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBatchJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchJobPoolResponse> updateBatchJobPool(
            UpdateBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchJobPoolRequest, UpdateBatchJobPoolResponse>
                    handler) {

        Validate.notBlank(request.getBatchJobPoolId(), "batchJobPoolId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBatchJobPoolDetails(), "updateBatchJobPoolDetails is required");

        return clientCall(request, UpdateBatchJobPoolResponse::builder)
                .logger(LOG, "updateBatchJobPool")
                .serviceDetails("BatchComputing", "UpdateBatchJobPool", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBatchJobPoolRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchJobPools")
                .appendPathParam(request.getBatchJobPoolId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBatchJobPoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBatchJobPoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchTaskEnvironmentResponse>
            updateBatchTaskEnvironment(
                    UpdateBatchTaskEnvironmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateBatchTaskEnvironmentRequest,
                                    UpdateBatchTaskEnvironmentResponse>
                            handler) {

        Validate.notBlank(
                request.getBatchTaskEnvironmentId(), "batchTaskEnvironmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBatchTaskEnvironmentDetails(),
                "updateBatchTaskEnvironmentDetails is required");

        return clientCall(request, UpdateBatchTaskEnvironmentResponse::builder)
                .logger(LOG, "updateBatchTaskEnvironment")
                .serviceDetails("BatchComputing", "UpdateBatchTaskEnvironment", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBatchTaskEnvironmentRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskEnvironments")
                .appendPathParam(request.getBatchTaskEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskEnvironment.class,
                        UpdateBatchTaskEnvironmentResponse.Builder::batchTaskEnvironment)
                .handleResponseHeaderString(
                        "etag", UpdateBatchTaskEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBatchTaskEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchTaskProfileResponse> updateBatchTaskProfile(
            UpdateBatchTaskProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchTaskProfileRequest, UpdateBatchTaskProfileResponse>
                    handler) {

        Validate.notBlank(request.getBatchTaskProfileId(), "batchTaskProfileId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBatchTaskProfileDetails(),
                "updateBatchTaskProfileDetails is required");

        return clientCall(request, UpdateBatchTaskProfileResponse::builder)
                .logger(LOG, "updateBatchTaskProfile")
                .serviceDetails("BatchComputing", "UpdateBatchTaskProfile", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBatchTaskProfileRequest::builder)
                .basePath("/20251031")
                .appendPathParam("batchTaskProfiles")
                .appendPathParam(request.getBatchTaskProfileId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskProfile.class,
                        UpdateBatchTaskProfileResponse.Builder::batchTaskProfile)
                .handleResponseHeaderString("etag", UpdateBatchTaskProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBatchTaskProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
