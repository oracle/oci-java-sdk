/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.datacc.requests.*;
import com.oracle.bmc.datacc.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class BaseinfraClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Baseinfra {
    /** Service instance for Baseinfra. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(BaseinfraClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datacc.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BaseinfraClient.class);

    private final BaseinfraWaiters waiters;

    private final BaseinfraPaginators paginators;

    BaseinfraClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    BaseinfraClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
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
                                    .nameFormat("Baseinfra-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new BaseinfraWaiters(executorService, this);

        this.paginators = new BaseinfraPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "BaseinfraClient",
                            "downloadInfrastructureConfigFile,downloadInfrastructureValidationScript"));
        }
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BaseinfraClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "datacc";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public BaseinfraClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BaseinfraClient(
                    this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
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
    public ActivateInfrastructureResponse activateInfrastructure(
            ActivateInfrastructureRequest request) {
        Objects.requireNonNull(
                request.getActivateInfrastructureDetails(),
                "activateInfrastructureDetails is required");

        Validate.notBlank(request.getInfrastructureId(), "infrastructureId must not be blank");

        return clientCall(request, ActivateInfrastructureResponse::builder)
                .logger(LOG, "activateInfrastructure")
                .serviceDetails("Baseinfra", "ActivateInfrastructure", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateInfrastructureRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendPathParam(request.getInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.Infrastructure.class,
                        ActivateInfrastructureResponse.Builder::infrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ActivateInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ActivateInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", ActivateInfrastructureResponse.Builder::location)
                .callSync();
    }

    @Override
    public ChangeInfrastructureCompartmentResponse changeInfrastructureCompartment(
            ChangeInfrastructureCompartmentRequest request) {

        Validate.notBlank(request.getInfrastructureId(), "infrastructureId must not be blank");
        Objects.requireNonNull(
                request.getChangeInfrastructureCompartmentDetails(),
                "changeInfrastructureCompartmentDetails is required");

        return clientCall(request, ChangeInfrastructureCompartmentResponse::builder)
                .logger(LOG, "changeInfrastructureCompartment")
                .serviceDetails("Baseinfra", "ChangeInfrastructureCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeInfrastructureCompartmentRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendPathParam(request.getInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeInfrastructureCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeInfrastructureCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeVmClusterNetworkCompartmentResponse changeVmClusterNetworkCompartment(
            ChangeVmClusterNetworkCompartmentRequest request) {

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");
        Objects.requireNonNull(
                request.getChangeVmClusterNetworkCompartmentDetails(),
                "changeVmClusterNetworkCompartmentDetails is required");

        return clientCall(request, ChangeVmClusterNetworkCompartmentResponse::builder)
                .logger(LOG, "changeVmClusterNetworkCompartment")
                .serviceDetails("Baseinfra", "ChangeVmClusterNetworkCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVmClusterNetworkCompartmentRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVmClusterNetworkCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVmClusterNetworkCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeVmInstanceCompartmentResponse changeVmInstanceCompartment(
            ChangeVmInstanceCompartmentRequest request) {

        Validate.notBlank(request.getVmInstanceId(), "vmInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeVmInstanceCompartmentDetails(),
                "changeVmInstanceCompartmentDetails is required");

        return clientCall(request, ChangeVmInstanceCompartmentResponse::builder)
                .logger(LOG, "changeVmInstanceCompartment")
                .serviceDetails("Baseinfra", "ChangeVmInstanceCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVmInstanceCompartmentRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .appendPathParam(request.getVmInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVmInstanceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeVmInstanceCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateInfrastructureResponse createInfrastructure(CreateInfrastructureRequest request) {
        Objects.requireNonNull(
                request.getCreateInfrastructureDetails(),
                "createInfrastructureDetails is required");

        return clientCall(request, CreateInfrastructureResponse::builder)
                .logger(LOG, "createInfrastructure")
                .serviceDetails("Baseinfra", "CreateInfrastructure", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInfrastructureRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.Infrastructure.class,
                        CreateInfrastructureResponse.Builder::infrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", CreateInfrastructureResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateVmClusterNetworkResponse createVmClusterNetwork(
            CreateVmClusterNetworkRequest request) {
        Objects.requireNonNull(
                request.getCreateVmClusterNetworkDetails(),
                "createVmClusterNetworkDetails is required");

        return clientCall(request, CreateVmClusterNetworkResponse::builder)
                .logger(LOG, "createVmClusterNetwork")
                .serviceDetails("Baseinfra", "CreateVmClusterNetwork", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVmClusterNetworkRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmClusterNetworks")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.VmClusterNetwork.class,
                        CreateVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVmClusterNetworkResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", CreateVmClusterNetworkResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateVmInstanceResponse createVmInstance(CreateVmInstanceRequest request) {
        Objects.requireNonNull(
                request.getCreateVmInstanceDetails(), "createVmInstanceDetails is required");

        return clientCall(request, CreateVmInstanceResponse::builder)
                .logger(LOG, "createVmInstance")
                .serviceDetails("Baseinfra", "CreateVmInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVmInstanceRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.VmInstance.class,
                        CreateVmInstanceResponse.Builder::vmInstance)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateVmInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVmInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateVmInstanceResponse.Builder::etag)
                .handleResponseHeaderString("location", CreateVmInstanceResponse.Builder::location)
                .callSync();
    }

    @Override
    public DeleteInfrastructureResponse deleteInfrastructure(DeleteInfrastructureRequest request) {

        Validate.notBlank(request.getInfrastructureId(), "infrastructureId must not be blank");

        return clientCall(request, DeleteInfrastructureResponse::builder)
                .logger(LOG, "deleteInfrastructure")
                .serviceDetails("Baseinfra", "DeleteInfrastructure", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteInfrastructureRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendPathParam(request.getInfrastructureId())
                .appendQueryParam(
                        "isForceDeleteInfrastructure", request.getIsForceDeleteInfrastructure())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteInfrastructureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteVmClusterNetworkResponse deleteVmClusterNetwork(
            DeleteVmClusterNetworkRequest request) {

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, DeleteVmClusterNetworkResponse::builder)
                .logger(LOG, "deleteVmClusterNetwork")
                .serviceDetails("Baseinfra", "DeleteVmClusterNetwork", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVmClusterNetworkRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVmClusterNetworkResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteVmInstanceResponse deleteVmInstance(DeleteVmInstanceRequest request) {

        Validate.notBlank(request.getVmInstanceId(), "vmInstanceId must not be blank");

        return clientCall(request, DeleteVmInstanceResponse::builder)
                .logger(LOG, "deleteVmInstance")
                .serviceDetails("Baseinfra", "DeleteVmInstance", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVmInstanceRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .appendPathParam(request.getVmInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVmInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteVmInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DownloadInfrastructureConfigFileResponse downloadInfrastructureConfigFile(
            DownloadInfrastructureConfigFileRequest request) {

        Validate.notBlank(request.getInfrastructureId(), "infrastructureId must not be blank");

        return clientCall(request, DownloadInfrastructureConfigFileResponse::builder)
                .logger(LOG, "downloadInfrastructureConfigFile")
                .serviceDetails("Baseinfra", "DownloadInfrastructureConfigFile", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(DownloadInfrastructureConfigFileRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendPathParam(request.getInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("downloadConfigFile")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        DownloadInfrastructureConfigFileResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", DownloadInfrastructureConfigFileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadInfrastructureConfigFileResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadInfrastructureConfigFileResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        DownloadInfrastructureConfigFileResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public DownloadInfrastructureValidationScriptResponse downloadInfrastructureValidationScript(
            DownloadInfrastructureValidationScriptRequest request) {

        Validate.notBlank(request.getInfrastructureId(), "infrastructureId must not be blank");

        return clientCall(request, DownloadInfrastructureValidationScriptResponse::builder)
                .logger(LOG, "downloadInfrastructureValidationScript")
                .serviceDetails("Baseinfra", "DownloadInfrastructureValidationScript", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(DownloadInfrastructureValidationScriptRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendPathParam(request.getInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("downloadValidationScript")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        DownloadInfrastructureValidationScriptResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", DownloadInfrastructureValidationScriptResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadInfrastructureValidationScriptResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadInfrastructureValidationScriptResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        DownloadInfrastructureValidationScriptResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public GenerateRecommendedVmClusterNetworkResponse generateRecommendedVmClusterNetwork(
            GenerateRecommendedVmClusterNetworkRequest request) {
        Objects.requireNonNull(
                request.getGenerateRecommendedVmClusterNetworkDetails(),
                "generateRecommendedVmClusterNetworkDetails is required");

        return clientCall(request, GenerateRecommendedVmClusterNetworkResponse::builder)
                .logger(LOG, "generateRecommendedVmClusterNetwork")
                .serviceDetails("Baseinfra", "GenerateRecommendedVmClusterNetwork", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateRecommendedVmClusterNetworkRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmClusterNetworks")
                .appendPathParam("actions")
                .appendPathParam("generateRecommendedVmClusterNetwork")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.CreateVmClusterNetworkDetails.class,
                        GenerateRecommendedVmClusterNetworkResponse.Builder
                                ::createVmClusterNetworkDetails)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateRecommendedVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateRecommendedVmClusterNetworkResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GenerateRecommendedVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", GenerateRecommendedVmClusterNetworkResponse.Builder::location)
                .callSync();
    }

    @Override
    public GetInfrastructureResponse getInfrastructure(GetInfrastructureRequest request) {

        Validate.notBlank(request.getInfrastructureId(), "infrastructureId must not be blank");

        return clientCall(request, GetInfrastructureResponse::builder)
                .logger(LOG, "getInfrastructure")
                .serviceDetails("Baseinfra", "GetInfrastructure", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInfrastructureRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendPathParam(request.getInfrastructureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.Infrastructure.class,
                        GetInfrastructureResponse.Builder::infrastructure)
                .handleResponseHeaderString(
                        "opc-request-id", GetInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString("location", GetInfrastructureResponse.Builder::location)
                .callSync();
    }

    @Override
    public GetInfrastructureScaleOptionResponse getInfrastructureScaleOption(
            GetInfrastructureScaleOptionRequest request) {

        Validate.notBlank(request.getInfrastructureId(), "infrastructureId must not be blank");

        return clientCall(request, GetInfrastructureScaleOptionResponse::builder)
                .logger(LOG, "getInfrastructureScaleOption")
                .serviceDetails("Baseinfra", "GetInfrastructureScaleOption", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInfrastructureScaleOptionRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendPathParam(request.getInfrastructureId())
                .appendPathParam("scaleOptions")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.InfrastructureScaleOption.class,
                        GetInfrastructureScaleOptionResponse.Builder::infrastructureScaleOption)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetInfrastructureScaleOptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMaintenanceExecutionResponse getMaintenanceExecution(
            GetMaintenanceExecutionRequest request) {

        Validate.notBlank(
                request.getMaintenanceExecutionId(), "maintenanceExecutionId must not be blank");

        return clientCall(request, GetMaintenanceExecutionResponse::builder)
                .logger(LOG, "getMaintenanceExecution")
                .serviceDetails("Baseinfra", "GetMaintenanceExecution", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaintenanceExecutionRequest::builder)
                .basePath("/20251101")
                .appendPathParam("maintenanceExecutions")
                .appendPathParam(request.getMaintenanceExecutionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.MaintenanceExecution.class,
                        GetMaintenanceExecutionResponse.Builder::maintenanceExecution)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaintenanceExecutionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetMaintenanceExecutionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", GetMaintenanceExecutionResponse.Builder::location)
                .callSync();
    }

    @Override
    public GetMaintenanceRunResponse getMaintenanceRun(GetMaintenanceRunRequest request) {

        Validate.notBlank(request.getMaintenanceRunId(), "maintenanceRunId must not be blank");

        return clientCall(request, GetMaintenanceRunResponse::builder)
                .logger(LOG, "getMaintenanceRun")
                .serviceDetails("Baseinfra", "GetMaintenanceRun", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaintenanceRunRequest::builder)
                .basePath("/20251101")
                .appendPathParam("maintenanceRuns")
                .appendPathParam(request.getMaintenanceRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.MaintenanceRun.class,
                        GetMaintenanceRunResponse.Builder::maintenanceRun)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaintenanceRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetMaintenanceRunResponse.Builder::etag)
                .handleResponseHeaderString("location", GetMaintenanceRunResponse.Builder::location)
                .callSync();
    }

    @Override
    public GetVmClusterNetworkResponse getVmClusterNetwork(GetVmClusterNetworkRequest request) {

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, GetVmClusterNetworkResponse::builder)
                .logger(LOG, "getVmClusterNetwork")
                .serviceDetails("Baseinfra", "GetVmClusterNetwork", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterNetworkRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.VmClusterNetwork.class,
                        GetVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-request-id", GetVmClusterNetworkResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", GetVmClusterNetworkResponse.Builder::location)
                .callSync();
    }

    @Override
    public GetVmInstanceResponse getVmInstance(GetVmInstanceRequest request) {

        Validate.notBlank(request.getVmInstanceId(), "vmInstanceId must not be blank");

        return clientCall(request, GetVmInstanceResponse::builder)
                .logger(LOG, "getVmInstance")
                .serviceDetails("Baseinfra", "GetVmInstance", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmInstanceRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .appendPathParam(request.getVmInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.VmInstance.class,
                        GetVmInstanceResponse.Builder::vmInstance)
                .handleResponseHeaderString(
                        "opc-request-id", GetVmInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetVmInstanceResponse.Builder::etag)
                .handleResponseHeaderString("location", GetVmInstanceResponse.Builder::location)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails("Baseinfra", "GetWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListInfrastructuresResponse listInfrastructures(ListInfrastructuresRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInfrastructuresResponse::builder)
                .logger(LOG, "listInfrastructures")
                .serviceDetails("Baseinfra", "ListInfrastructures", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInfrastructuresRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.InfrastructureCollection.class,
                        ListInfrastructuresResponse.Builder::infrastructureCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInfrastructuresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInfrastructuresResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMaintenanceExecutionsResponse listMaintenanceExecutions(
            ListMaintenanceExecutionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaintenanceExecutionsResponse::builder)
                .logger(LOG, "listMaintenanceExecutions")
                .serviceDetails("Baseinfra", "ListMaintenanceExecutions", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaintenanceExecutionsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("maintenanceExecutions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("infrastructureId", request.getInfrastructureId())
                .appendEnumQueryParam("targetResourceType", request.getTargetResourceType())
                .appendEnumQueryParam("maintenanceType", request.getMaintenanceType())
                .appendQueryParam("maintenanceRunId", request.getMaintenanceRunId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("maintenanceSubtype", request.getMaintenanceSubtype())
                .appendQueryParam(
                        "timeAcceptedLessThanOrEqualTo", request.getTimeAcceptedLessThanOrEqualTo())
                .appendQueryParam(
                        "timeAcceptedGreaterThanOrEqualTo",
                        request.getTimeAcceptedGreaterThanOrEqualTo())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.MaintenanceExecutionCollection.class,
                        ListMaintenanceExecutionsResponse.Builder::maintenanceExecutionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaintenanceExecutionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaintenanceExecutionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMaintenanceRunsResponse listMaintenanceRuns(ListMaintenanceRunsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaintenanceRunsResponse::builder)
                .logger(LOG, "listMaintenanceRuns")
                .serviceDetails("Baseinfra", "ListMaintenanceRuns", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaintenanceRunsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("maintenanceRuns")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("infrastructureId", request.getInfrastructureId())
                .appendEnumQueryParam("targetResourceType", request.getTargetResourceType())
                .appendEnumQueryParam("maintenanceType", request.getMaintenanceType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("maintenanceSubtype", request.getMaintenanceSubtype())
                .appendQueryParam(
                        "timeAcceptedLessThanOrEqualTo", request.getTimeAcceptedLessThanOrEqualTo())
                .appendQueryParam(
                        "timeAcceptedGreaterThanOrEqualTo",
                        request.getTimeAcceptedGreaterThanOrEqualTo())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.MaintenanceRunCollection.class,
                        ListMaintenanceRunsResponse.Builder::maintenanceRunCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaintenanceRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaintenanceRunsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVmClusterNetworksResponse listVmClusterNetworks(
            ListVmClusterNetworksRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVmClusterNetworksResponse::builder)
                .logger(LOG, "listVmClusterNetworks")
                .serviceDetails("Baseinfra", "ListVmClusterNetworks", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterNetworksRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmClusterNetworks")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isScanEnabled", request.getIsScanEnabled())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("infrastructureId", request.getInfrastructureId())
                .appendQueryParam("nodeCount", request.getNodeCount())
                .appendEnumQueryParam("vmNetworkConsumerType", request.getVmNetworkConsumerType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.VmClusterNetworkCollection.class,
                        ListVmClusterNetworksResponse.Builder::vmClusterNetworkCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVmClusterNetworksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVmClusterNetworksResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVmInstancesResponse listVmInstances(ListVmInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVmInstancesResponse::builder)
                .logger(LOG, "listVmInstances")
                .serviceDetails("Baseinfra", "ListVmInstances", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmInstancesRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("infrastructureId", request.getInfrastructureId())
                .appendQueryParam("baseServerId", request.getBaseServerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.VmInstanceCollection.class,
                        ListVmInstancesResponse.Builder::vmInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVmInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVmInstancesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails("Baseinfra", "ListWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails("Baseinfra", "ListWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails("Baseinfra", "ListWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datacc.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public MigrateVmInstanceResponse migrateVmInstance(MigrateVmInstanceRequest request) {

        Validate.notBlank(request.getVmInstanceId(), "vmInstanceId must not be blank");

        return clientCall(request, MigrateVmInstanceResponse::builder)
                .logger(LOG, "migrateVmInstance")
                .serviceDetails("Baseinfra", "MigrateVmInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MigrateVmInstanceRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .appendPathParam(request.getVmInstanceId())
                .appendPathParam("actions")
                .appendPathParam("migrate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", MigrateVmInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", MigrateVmInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RescheduleMaintenanceRunResponse rescheduleMaintenanceRun(
            RescheduleMaintenanceRunRequest request) {

        Validate.notBlank(request.getMaintenanceRunId(), "maintenanceRunId must not be blank");
        Objects.requireNonNull(
                request.getRescheduleMaintenanceRunDetails(),
                "rescheduleMaintenanceRunDetails is required");

        return clientCall(request, RescheduleMaintenanceRunResponse::builder)
                .logger(LOG, "rescheduleMaintenanceRun")
                .serviceDetails("Baseinfra", "RescheduleMaintenanceRun", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RescheduleMaintenanceRunRequest::builder)
                .basePath("/20251101")
                .appendPathParam("maintenanceRuns")
                .appendPathParam(request.getMaintenanceRunId())
                .appendPathParam("actions")
                .appendPathParam("reschedule")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.MaintenanceRun.class,
                        RescheduleMaintenanceRunResponse.Builder::maintenanceRun)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RescheduleMaintenanceRunResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RescheduleMaintenanceRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RescheduleMaintenanceRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", RescheduleMaintenanceRunResponse.Builder::location)
                .callSync();
    }

    @Override
    public RestartVmInstanceResponse restartVmInstance(RestartVmInstanceRequest request) {

        Validate.notBlank(request.getVmInstanceId(), "vmInstanceId must not be blank");

        return clientCall(request, RestartVmInstanceResponse::builder)
                .logger(LOG, "restartVmInstance")
                .serviceDetails("Baseinfra", "RestartVmInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartVmInstanceRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .appendPathParam(request.getVmInstanceId())
                .appendPathParam("actions")
                .appendPathParam("restart")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", RestartVmInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RestartVmInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ScaleInfrastructureStorageResponse scaleInfrastructureStorage(
            ScaleInfrastructureStorageRequest request) {
        Objects.requireNonNull(
                request.getScaleInfrastructureStorageDetails(),
                "scaleInfrastructureStorageDetails is required");

        Validate.notBlank(request.getInfrastructureId(), "infrastructureId must not be blank");

        return clientCall(request, ScaleInfrastructureStorageResponse::builder)
                .logger(LOG, "scaleInfrastructureStorage")
                .serviceDetails("Baseinfra", "ScaleInfrastructureStorage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScaleInfrastructureStorageRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendPathParam(request.getInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("scaleStorage")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ScaleInfrastructureStorageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ScaleInfrastructureStorageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", ScaleInfrastructureStorageResponse.Builder::location)
                .callSync();
    }

    @Override
    public ScaleVmInstanceResponse scaleVmInstance(ScaleVmInstanceRequest request) {
        Objects.requireNonNull(
                request.getScaleVmInstanceDetails(), "scaleVmInstanceDetails is required");

        Validate.notBlank(request.getVmInstanceId(), "vmInstanceId must not be blank");

        return clientCall(request, ScaleVmInstanceResponse::builder)
                .logger(LOG, "scaleVmInstance")
                .serviceDetails("Baseinfra", "ScaleVmInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScaleVmInstanceRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .appendPathParam(request.getVmInstanceId())
                .appendPathParam("actions")
                .appendPathParam("scale")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ScaleVmInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ScaleVmInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartVmInstanceResponse startVmInstance(StartVmInstanceRequest request) {

        Validate.notBlank(request.getVmInstanceId(), "vmInstanceId must not be blank");

        return clientCall(request, StartVmInstanceResponse::builder)
                .logger(LOG, "startVmInstance")
                .serviceDetails("Baseinfra", "StartVmInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartVmInstanceRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .appendPathParam(request.getVmInstanceId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartVmInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartVmInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopVmInstanceResponse stopVmInstance(StopVmInstanceRequest request) {

        Validate.notBlank(request.getVmInstanceId(), "vmInstanceId must not be blank");

        return clientCall(request, StopVmInstanceResponse::builder)
                .logger(LOG, "stopVmInstance")
                .serviceDetails("Baseinfra", "StopVmInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopVmInstanceRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .appendPathParam(request.getVmInstanceId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", StopVmInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopVmInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateInfrastructureResponse updateInfrastructure(UpdateInfrastructureRequest request) {
        Objects.requireNonNull(
                request.getUpdateInfrastructureDetails(),
                "updateInfrastructureDetails is required");

        Validate.notBlank(request.getInfrastructureId(), "infrastructureId must not be blank");

        return clientCall(request, UpdateInfrastructureResponse::builder)
                .logger(LOG, "updateInfrastructure")
                .serviceDetails("Baseinfra", "UpdateInfrastructure", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInfrastructureRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendPathParam(request.getInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.Infrastructure.class,
                        UpdateInfrastructureResponse.Builder::infrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", UpdateInfrastructureResponse.Builder::location)
                .callSync();
    }

    @Override
    public UpdateMaintenanceRunResponse updateMaintenanceRun(UpdateMaintenanceRunRequest request) {
        Objects.requireNonNull(
                request.getUpdateMaintenanceRunDetails(),
                "updateMaintenanceRunDetails is required");

        Validate.notBlank(request.getMaintenanceRunId(), "maintenanceRunId must not be blank");

        return clientCall(request, UpdateMaintenanceRunResponse::builder)
                .logger(LOG, "updateMaintenanceRun")
                .serviceDetails("Baseinfra", "UpdateMaintenanceRun", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMaintenanceRunRequest::builder)
                .basePath("/20251101")
                .appendPathParam("maintenanceRuns")
                .appendPathParam(request.getMaintenanceRunId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.MaintenanceRun.class,
                        UpdateMaintenanceRunResponse.Builder::maintenanceRun)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMaintenanceRunResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMaintenanceRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateMaintenanceRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", UpdateMaintenanceRunResponse.Builder::location)
                .callSync();
    }

    @Override
    public UpdateVmClusterNetworkResponse updateVmClusterNetwork(
            UpdateVmClusterNetworkRequest request) {
        Objects.requireNonNull(
                request.getUpdateVmClusterNetworkDetails(),
                "updateVmClusterNetworkDetails is required");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, UpdateVmClusterNetworkResponse::builder)
                .logger(LOG, "updateVmClusterNetwork")
                .serviceDetails("Baseinfra", "UpdateVmClusterNetwork", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVmClusterNetworkRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.VmClusterNetwork.class,
                        UpdateVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVmClusterNetworkResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", UpdateVmClusterNetworkResponse.Builder::location)
                .callSync();
    }

    @Override
    public UpdateVmInstanceResponse updateVmInstance(UpdateVmInstanceRequest request) {
        Objects.requireNonNull(
                request.getUpdateVmInstanceDetails(), "updateVmInstanceDetails is required");

        Validate.notBlank(request.getVmInstanceId(), "vmInstanceId must not be blank");

        return clientCall(request, UpdateVmInstanceResponse::builder)
                .logger(LOG, "updateVmInstance")
                .serviceDetails("Baseinfra", "UpdateVmInstance", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVmInstanceRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmInstances")
                .appendPathParam(request.getVmInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.VmInstance.class,
                        UpdateVmInstanceResponse.Builder::vmInstance)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateVmInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVmInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateVmInstanceResponse.Builder::etag)
                .handleResponseHeaderString("location", UpdateVmInstanceResponse.Builder::location)
                .callSync();
    }

    @Override
    public ValidateInfrastructureResponse validateInfrastructure(
            ValidateInfrastructureRequest request) {
        Objects.requireNonNull(
                request.getValidateInfrastructureDetails(),
                "validateInfrastructureDetails is required");

        Validate.notBlank(request.getInfrastructureId(), "infrastructureId must not be blank");

        return clientCall(request, ValidateInfrastructureResponse::builder)
                .logger(LOG, "validateInfrastructure")
                .serviceDetails("Baseinfra", "ValidateInfrastructure", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateInfrastructureRequest::builder)
                .basePath("/20251101")
                .appendPathParam("infrastructures")
                .appendPathParam(request.getInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("validate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacc.model.Infrastructure.class,
                        ValidateInfrastructureResponse.Builder::infrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ValidateInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ValidateInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", ValidateInfrastructureResponse.Builder::location)
                .callSync();
    }

    @Override
    public ValidateVmClusterNetworkResponse validateVmClusterNetwork(
            ValidateVmClusterNetworkRequest request) {

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, ValidateVmClusterNetworkResponse::builder)
                .logger(LOG, "validateVmClusterNetwork")
                .serviceDetails("Baseinfra", "ValidateVmClusterNetwork", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateVmClusterNetworkRequest::builder)
                .basePath("/20251101")
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("validateVmClusterNetwork")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ValidateVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateVmClusterNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BaseinfraWaiters getWaiters() {
        return waiters;
    }

    @Override
    public BaseinfraPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BaseinfraClient(
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
    public BaseinfraClient(
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
    public BaseinfraClient(
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
    public BaseinfraClient(
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
    public BaseinfraClient(
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
    public BaseinfraClient(
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
    public BaseinfraClient(
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
    public BaseinfraClient(
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
