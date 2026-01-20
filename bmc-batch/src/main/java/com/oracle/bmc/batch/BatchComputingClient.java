/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.batch.requests.*;
import com.oracle.bmc.batch.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public class BatchComputingClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements BatchComputing {
    /** Service instance for BatchComputing. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(BatchComputingClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://batch.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BatchComputingClient.class);

    private final BatchComputingWaiters waiters;

    private final BatchComputingPaginators paginators;

    BatchComputingClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("BatchComputing-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new BatchComputingWaiters(executorService, this);

        this.paginators = new BatchComputingPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BatchComputingClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "batch";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public BatchComputingClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BatchComputingClient(this, authenticationDetailsProvider, executorService);
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
    public CancelBatchJobResponse cancelBatchJob(CancelBatchJobRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", CancelBatchJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CancelBatchJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeBatchContextCompartmentResponse changeBatchContextCompartment(
            ChangeBatchContextCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBatchContextCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBatchContextCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeBatchJobCompartmentResponse changeBatchJobCompartment(
            ChangeBatchJobCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBatchJobCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeBatchJobCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeBatchJobPoolCompartmentResponse changeBatchJobPoolCompartment(
            ChangeBatchJobPoolCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBatchJobPoolCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBatchJobPoolCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeBatchTaskEnvironmentCompartmentResponse changeBatchTaskEnvironmentCompartment(
            ChangeBatchTaskEnvironmentCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBatchTaskEnvironmentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBatchTaskEnvironmentCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeBatchTaskProfileCompartmentResponse changeBatchTaskProfileCompartment(
            ChangeBatchTaskProfileCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBatchTaskProfileCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBatchTaskProfileCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBatchContextResponse createBatchContext(CreateBatchContextRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateBatchJobResponse createBatchJob(CreateBatchJobRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateBatchJobPoolResponse createBatchJobPool(CreateBatchJobPoolRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJobPool.class,
                        CreateBatchJobPoolResponse.Builder::batchJobPool)
                .handleResponseHeaderString("etag", CreateBatchJobPoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBatchJobPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBatchTaskEnvironmentResponse createBatchTaskEnvironment(
            CreateBatchTaskEnvironmentRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskEnvironment.class,
                        CreateBatchTaskEnvironmentResponse.Builder::batchTaskEnvironment)
                .handleResponseHeaderString(
                        "etag", CreateBatchTaskEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBatchTaskEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBatchTaskProfileResponse createBatchTaskProfile(
            CreateBatchTaskProfileRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskProfile.class,
                        CreateBatchTaskProfileResponse.Builder::batchTaskProfile)
                .handleResponseHeaderString("etag", CreateBatchTaskProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBatchTaskProfileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBatchContextResponse deleteBatchContext(DeleteBatchContextRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBatchContextResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBatchContextResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBatchJobPoolResponse deleteBatchJobPool(DeleteBatchJobPoolRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBatchJobPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBatchTaskEnvironmentResponse deleteBatchTaskEnvironment(
            DeleteBatchTaskEnvironmentRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBatchTaskEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBatchTaskProfileResponse deleteBatchTaskProfile(
            DeleteBatchTaskProfileRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBatchTaskProfileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBatchContextResponse getBatchContext(GetBatchContextRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchContext.class,
                        GetBatchContextResponse.Builder::batchContext)
                .handleResponseHeaderString("etag", GetBatchContextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchContextResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBatchJobResponse getBatchJob(GetBatchJobRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJob.class,
                        GetBatchJobResponse.Builder::batchJob)
                .handleResponseHeaderString("etag", GetBatchJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBatchJobPoolResponse getBatchJobPool(GetBatchJobPoolRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJobPool.class,
                        GetBatchJobPoolResponse.Builder::batchJobPool)
                .handleResponseHeaderString("etag", GetBatchJobPoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchJobPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBatchTaskResponse getBatchTask(GetBatchTaskRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTask.class,
                        GetBatchTaskResponse.Builder::batchTask)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchTaskResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBatchTaskEnvironmentResponse getBatchTaskEnvironment(
            GetBatchTaskEnvironmentRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskEnvironment.class,
                        GetBatchTaskEnvironmentResponse.Builder::batchTaskEnvironment)
                .handleResponseHeaderString("etag", GetBatchTaskEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchTaskEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBatchTaskProfileResponse getBatchTaskProfile(GetBatchTaskProfileRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskProfile.class,
                        GetBatchTaskProfileResponse.Builder::batchTaskProfile)
                .handleResponseHeaderString("etag", GetBatchTaskProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBatchTaskProfileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListBatchContextShapesResponse listBatchContextShapes(
            ListBatchContextShapesRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchContextShapeCollection.class,
                        ListBatchContextShapesResponse.Builder::batchContextShapeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchContextShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchContextShapesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBatchContextsResponse listBatchContexts(ListBatchContextsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchContextCollection.class,
                        ListBatchContextsResponse.Builder::batchContextCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchContextsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchContextsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBatchJobPoolsResponse listBatchJobPools(ListBatchJobPoolsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJobPoolCollection.class,
                        ListBatchJobPoolsResponse.Builder::batchJobPoolCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchJobPoolsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchJobPoolsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBatchJobTasksResponse listBatchJobTasks(ListBatchJobTasksRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskCollection.class,
                        ListBatchJobTasksResponse.Builder::batchTaskCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchJobTasksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchJobTasksResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBatchJobsResponse listBatchJobs(ListBatchJobsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchJobCollection.class,
                        ListBatchJobsResponse.Builder::batchJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchJobsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBatchTaskEnvironmentsResponse listBatchTaskEnvironments(
            ListBatchTaskEnvironmentsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskEnvironmentCollection.class,
                        ListBatchTaskEnvironmentsResponse.Builder::batchTaskEnvironmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchTaskEnvironmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchTaskEnvironmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBatchTaskProfilesResponse listBatchTaskProfiles(
            ListBatchTaskProfilesRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskProfileCollection.class,
                        ListBatchTaskProfilesResponse.Builder::batchTaskProfileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchTaskProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchTaskProfilesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBatchTasksResponse listBatchTasks(ListBatchTasksRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskCollection.class,
                        ListBatchTasksResponse.Builder::batchTaskCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBatchTasksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBatchTasksResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.batch.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PauseBatchJobResponse pauseBatchJob(PauseBatchJobRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PauseBatchJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PauseBatchJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartBatchContextResponse startBatchContext(StartBatchContextRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartBatchContextResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartBatchContextResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartBatchJobPoolResponse startBatchJobPool(StartBatchJobPoolRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartBatchJobPoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartBatchJobPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopBatchContextResponse stopBatchContext(StopBatchContextRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StopBatchContextResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopBatchContextResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopBatchJobPoolResponse stopBatchJobPool(StopBatchJobPoolRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StopBatchJobPoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopBatchJobPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UnpauseBatchJobResponse unpauseBatchJob(UnpauseBatchJobRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UnpauseBatchJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UnpauseBatchJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBatchContextResponse updateBatchContext(UpdateBatchContextRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBatchContextResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBatchContextResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBatchJobResponse updateBatchJob(UpdateBatchJobRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBatchJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBatchJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBatchJobPoolResponse updateBatchJobPool(UpdateBatchJobPoolRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBatchJobPoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBatchJobPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBatchTaskEnvironmentResponse updateBatchTaskEnvironment(
            UpdateBatchTaskEnvironmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskEnvironment.class,
                        UpdateBatchTaskEnvironmentResponse.Builder::batchTaskEnvironment)
                .handleResponseHeaderString(
                        "etag", UpdateBatchTaskEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBatchTaskEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBatchTaskProfileResponse updateBatchTaskProfile(
            UpdateBatchTaskProfileRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.batch.model.BatchTaskProfile.class,
                        UpdateBatchTaskProfileResponse.Builder::batchTaskProfile)
                .handleResponseHeaderString("etag", UpdateBatchTaskProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBatchTaskProfileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BatchComputingWaiters getWaiters() {
        return waiters;
    }

    @Override
    public BatchComputingPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BatchComputingClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BatchComputingClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
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
    public BatchComputingClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
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
    public BatchComputingClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
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
    public BatchComputingClient(
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
                authenticationDetailsProvider,
                null);
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
    public BatchComputingClient(
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
                authenticationDetailsProvider,
                null);
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
    public BatchComputingClient(
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
                authenticationDetailsProvider,
                null);
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BatchComputingClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
