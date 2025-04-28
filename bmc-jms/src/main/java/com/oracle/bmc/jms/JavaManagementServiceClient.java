/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.jms.requests.*;
import com.oracle.bmc.jms.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class JavaManagementServiceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements JavaManagementService {
    /** Service instance for JavaManagementService. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("JAVAMANAGEMENTSERVICE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://javamanagement.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JavaManagementServiceClient.class);

    private final JavaManagementServiceWaiters waiters;

    private final JavaManagementServicePaginators paginators;

    JavaManagementServiceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    JavaManagementServiceClient(
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
                                    .nameFormat("JavaManagementService-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new JavaManagementServiceWaiters(executorService, this);

        this.paginators = new JavaManagementServicePaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "JavaManagementServiceClient",
                            "generateAgentDeployScript,generateAgentInstallerConfiguration,generateLoadPipelineScript"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, JavaManagementServiceClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "jms";
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
        public JavaManagementServiceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new JavaManagementServiceClient(
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
    public AddFleetInstallationSitesResponse addFleetInstallationSites(
            AddFleetInstallationSitesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getAddFleetInstallationSitesDetails(),
                "addFleetInstallationSitesDetails is required");

        return clientCall(request, AddFleetInstallationSitesResponse::builder)
                .logger(LOG, "addFleetInstallationSites")
                .serviceDetails(
                        "JavaManagementService",
                        "AddFleetInstallationSites",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/InstallationSiteSummary/AddFleetInstallationSites")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddFleetInstallationSitesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("addInstallationSites")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddFleetInstallationSitesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AddFleetInstallationSitesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "JavaManagementService",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20210610")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeFleetCompartmentResponse changeFleetCompartment(
            ChangeFleetCompartmentRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getChangeFleetCompartmentDetails(),
                "changeFleetCompartmentDetails is required");

        return clientCall(request, ChangeFleetCompartmentResponse::builder)
                .logger(LOG, "changeFleetCompartment")
                .serviceDetails(
                        "JavaManagementService",
                        "ChangeFleetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/ChangeFleetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeFleetCompartmentRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
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
                        ChangeFleetCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeFleetCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBlocklistResponse createBlocklist(CreateBlocklistRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getCreateBlocklistDetails(), "createBlocklistDetails is required");

        return clientCall(request, CreateBlocklistResponse::builder)
                .logger(LOG, "createBlocklist")
                .serviceDetails(
                        "JavaManagementService",
                        "CreateBlocklist",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Blocklist/CreateBlocklist")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBlocklistRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("blocklists")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jms.model.Blocklist.class,
                        CreateBlocklistResponse.Builder::blocklist)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBlocklistResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateBlocklistResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateDrsFileResponse createDrsFile(CreateDrsFileRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getCreateDrsFileDetails(), "createDrsFileDetails is required");

        return clientCall(request, CreateDrsFileResponse::builder)
                .logger(LOG, "createDrsFile")
                .serviceDetails(
                        "JavaManagementService",
                        "CreateDrsFile",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/CreateDrsFile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDrsFileRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("drsFiles")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDrsFileResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDrsFileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateFleetResponse createFleet(CreateFleetRequest request) {
        Objects.requireNonNull(request.getCreateFleetDetails(), "createFleetDetails is required");

        return clientCall(request, CreateFleetResponse::builder)
                .logger(LOG, "createFleet")
                .serviceDetails(
                        "JavaManagementService",
                        "CreateFleet",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/CreateFleet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFleetRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateFleetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFleetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateJmsPluginResponse createJmsPlugin(CreateJmsPluginRequest request) {
        Objects.requireNonNull(
                request.getCreateJmsPluginDetails(), "createJmsPluginDetails is required");

        return clientCall(request, CreateJmsPluginResponse::builder)
                .logger(LOG, "createJmsPlugin")
                .serviceDetails(
                        "JavaManagementService",
                        "CreateJmsPlugin",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JmsPlugin/CreateJmsPlugin")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJmsPluginRequest::builder)
                .basePath("/20210610")
                .appendPathParam("jmsPlugins")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jms.model.JmsPlugin.class,
                        CreateJmsPluginResponse.Builder::jmsPlugin)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJmsPluginResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateJmsPluginResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteBlocklistResponse deleteBlocklist(DeleteBlocklistRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(request.getBlocklistKey(), "blocklistKey must not be blank");

        return clientCall(request, DeleteBlocklistResponse::builder)
                .logger(LOG, "deleteBlocklist")
                .serviceDetails(
                        "JavaManagementService",
                        "DeleteBlocklist",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Blocklist/DeleteBlocklist")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBlocklistRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("blocklists")
                .appendPathParam(request.getBlocklistKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBlocklistResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCryptoAnalysisResultResponse deleteCryptoAnalysisResult(
            DeleteCryptoAnalysisResultRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(
                request.getCryptoAnalysisResultId(), "cryptoAnalysisResultId must not be blank");

        return clientCall(request, DeleteCryptoAnalysisResultResponse::builder)
                .logger(LOG, "deleteCryptoAnalysisResult")
                .serviceDetails(
                        "JavaManagementService",
                        "DeleteCryptoAnalysisResult",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/CryptoAnalysisResult/DeleteCryptoAnalysisResult")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCryptoAnalysisResultRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("cryptoAnalysisResults")
                .appendPathParam(request.getCryptoAnalysisResultId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteCryptoAnalysisResultResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCryptoAnalysisResultResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDrsFileResponse deleteDrsFile(DeleteDrsFileRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(request.getDrsFileKey(), "drsFileKey must not be blank");

        return clientCall(request, DeleteDrsFileResponse::builder)
                .logger(LOG, "deleteDrsFile")
                .serviceDetails(
                        "JavaManagementService",
                        "DeleteDrsFile",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/DrsFile/DeleteDrsFile")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDrsFileRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("drsFiles")
                .appendPathParam(request.getDrsFileKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDrsFileResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDrsFileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFleetResponse deleteFleet(DeleteFleetRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, DeleteFleetResponse::builder)
                .logger(LOG, "deleteFleet")
                .serviceDetails(
                        "JavaManagementService",
                        "DeleteFleet",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/DeleteFleet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFleetRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteFleetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFleetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteJavaMigrationAnalysisResultResponse deleteJavaMigrationAnalysisResult(
            DeleteJavaMigrationAnalysisResultRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(
                request.getJavaMigrationAnalysisResultId(),
                "javaMigrationAnalysisResultId must not be blank");

        return clientCall(request, DeleteJavaMigrationAnalysisResultResponse::builder)
                .logger(LOG, "deleteJavaMigrationAnalysisResult")
                .serviceDetails(
                        "JavaManagementService",
                        "DeleteJavaMigrationAnalysisResult",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaMigrationAnalysisResult/DeleteJavaMigrationAnalysisResult")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJavaMigrationAnalysisResultRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("javaMigrationAnalysisResults")
                .appendPathParam(request.getJavaMigrationAnalysisResultId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteJavaMigrationAnalysisResultResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteJavaMigrationAnalysisResultResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteJmsPluginResponse deleteJmsPlugin(DeleteJmsPluginRequest request) {

        Validate.notBlank(request.getJmsPluginId(), "jmsPluginId must not be blank");

        return clientCall(request, DeleteJmsPluginResponse::builder)
                .logger(LOG, "deleteJmsPlugin")
                .serviceDetails(
                        "JavaManagementService",
                        "DeleteJmsPlugin",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JmsPlugin/DeleteJmsPlugin")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJmsPluginRequest::builder)
                .basePath("/20210610")
                .appendPathParam("jmsPlugins")
                .appendPathParam(request.getJmsPluginId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJmsPluginResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePerformanceTuningAnalysisResultResponse deletePerformanceTuningAnalysisResult(
            DeletePerformanceTuningAnalysisResultRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(
                request.getPerformanceTuningAnalysisResultId(),
                "performanceTuningAnalysisResultId must not be blank");

        return clientCall(request, DeletePerformanceTuningAnalysisResultResponse::builder)
                .logger(LOG, "deletePerformanceTuningAnalysisResult")
                .serviceDetails(
                        "JavaManagementService",
                        "DeletePerformanceTuningAnalysisResult",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/PerformanceTuningAnalysisResult/DeletePerformanceTuningAnalysisResult")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePerformanceTuningAnalysisResultRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("performanceTuningAnalysisResults")
                .appendPathParam(request.getPerformanceTuningAnalysisResultId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePerformanceTuningAnalysisResultResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeletePerformanceTuningAnalysisResultResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableDrsResponse disableDrs(DisableDrsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(request.getDisableDrsDetails(), "disableDrsDetails is required");

        return clientCall(request, DisableDrsResponse::builder)
                .logger(LOG, "disableDrs")
                .serviceDetails(
                        "JavaManagementService",
                        "DisableDrs",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/DisableDrs")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableDrsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("disableDrs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", DisableDrsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableDrsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableDrsResponse enableDrs(EnableDrsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(request.getEnableDrsDetails(), "enableDrsDetails is required");

        return clientCall(request, EnableDrsResponse::builder)
                .logger(LOG, "enableDrs")
                .serviceDetails(
                        "JavaManagementService",
                        "EnableDrs",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/EnableDrs")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableDrsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("enableDrs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", EnableDrsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableDrsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GenerateAgentDeployScriptResponse generateAgentDeployScript(
            GenerateAgentDeployScriptRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getGenerateAgentDeployScriptDetails(),
                "generateAgentDeployScriptDetails is required");

        return clientCall(request, GenerateAgentDeployScriptResponse::builder)
                .logger(LOG, "generateAgentDeployScript")
                .serviceDetails(
                        "JavaManagementService",
                        "GenerateAgentDeployScript",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/GenerateAgentDeployScript")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateAgentDeployScriptRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("generateAgentDeployScript")
                .accept("text/plain")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        GenerateAgentDeployScriptResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateAgentDeployScriptResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", GenerateAgentDeployScriptResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-type", GenerateAgentDeployScriptResponse.Builder::contentType)
                .callSync();
    }

    @Override
    public GenerateAgentInstallerConfigurationResponse generateAgentInstallerConfiguration(
            GenerateAgentInstallerConfigurationRequest request) {
        Objects.requireNonNull(
                request.getGenerateAgentInstallerConfigurationDetails(),
                "generateAgentInstallerConfigurationDetails is required");

        return clientCall(request, GenerateAgentInstallerConfigurationResponse::builder)
                .logger(LOG, "generateAgentInstallerConfiguration")
                .serviceDetails(
                        "JavaManagementService",
                        "GenerateAgentInstallerConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/AgentInstallerSummary/GenerateAgentInstallerConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateAgentInstallerConfigurationRequest::builder)
                .basePath("/20210610")
                .appendPathParam("agentInstallers")
                .appendPathParam("actions")
                .appendPathParam("generateAgentInstallerConfiguration")
                .accept("text/plain")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        GenerateAgentInstallerConfigurationResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateAgentInstallerConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        GenerateAgentInstallerConfigurationResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-type",
                        GenerateAgentInstallerConfigurationResponse.Builder::contentType)
                .callSync();
    }

    @Override
    public GenerateLoadPipelineScriptResponse generateLoadPipelineScript(
            GenerateLoadPipelineScriptRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getGenerateLoadPipelineScriptDetails(),
                "generateLoadPipelineScriptDetails is required");

        return clientCall(request, GenerateLoadPipelineScriptResponse::builder)
                .logger(LOG, "generateLoadPipelineScript")
                .serviceDetails(
                        "JavaManagementService",
                        "GenerateLoadPipelineScript",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/GenerateLoadPipelineScript")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateLoadPipelineScriptRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("generateLoadPipelineScript")
                .accept("text/plain")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        GenerateLoadPipelineScriptResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateLoadPipelineScriptResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", GenerateLoadPipelineScriptResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-type", GenerateLoadPipelineScriptResponse.Builder::contentType)
                .callSync();
    }

    @Override
    public GetCryptoAnalysisResultResponse getCryptoAnalysisResult(
            GetCryptoAnalysisResultRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(
                request.getCryptoAnalysisResultId(), "cryptoAnalysisResultId must not be blank");

        return clientCall(request, GetCryptoAnalysisResultResponse::builder)
                .logger(LOG, "getCryptoAnalysisResult")
                .serviceDetails(
                        "JavaManagementService",
                        "GetCryptoAnalysisResult",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/CryptoAnalysisResult/GetCryptoAnalysisResult")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCryptoAnalysisResultRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("cryptoAnalysisResults")
                .appendPathParam(request.getCryptoAnalysisResultId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.CryptoAnalysisResult.class,
                        GetCryptoAnalysisResultResponse.Builder::cryptoAnalysisResult)
                .handleResponseHeaderString("etag", GetCryptoAnalysisResultResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCryptoAnalysisResultResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDrsFileResponse getDrsFile(GetDrsFileRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(request.getDrsFileKey(), "drsFileKey must not be blank");

        return clientCall(request, GetDrsFileResponse::builder)
                .logger(LOG, "getDrsFile")
                .serviceDetails(
                        "JavaManagementService",
                        "GetDrsFile",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/DrsFile/GetDrsFile")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDrsFileRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("drsFiles")
                .appendPathParam(request.getDrsFileKey())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.DrsFile.class, GetDrsFileResponse.Builder::drsFile)
                .handleResponseHeaderString("etag", GetDrsFileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDrsFileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExportSettingResponse getExportSetting(GetExportSettingRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetExportSettingResponse::builder)
                .logger(LOG, "getExportSetting")
                .serviceDetails(
                        "JavaManagementService",
                        "GetExportSetting",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/ExportSetting/GetExportSetting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExportSettingRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("exportSetting")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.ExportSetting.class,
                        GetExportSettingResponse.Builder::exportSetting)
                .handleResponseHeaderString("etag", GetExportSettingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExportSettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExportStatusResponse getExportStatus(GetExportStatusRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetExportStatusResponse::builder)
                .logger(LOG, "getExportStatus")
                .serviceDetails(
                        "JavaManagementService",
                        "GetExportStatus",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/ExportStatus/GetExportStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExportStatusRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("exportStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.ExportStatus.class,
                        GetExportStatusResponse.Builder::exportStatus)
                .handleResponseHeaderString("etag", GetExportStatusResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExportStatusResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFleetResponse getFleet(GetFleetRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetResponse::builder)
                .logger(LOG, "getFleet")
                .serviceDetails(
                        "JavaManagementService",
                        "GetFleet",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/GetFleet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(com.oracle.bmc.jms.model.Fleet.class, GetFleetResponse.Builder::fleet)
                .handleResponseHeaderString("etag", GetFleetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFleetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFleetAdvancedFeatureConfigurationResponse getFleetAdvancedFeatureConfiguration(
            GetFleetAdvancedFeatureConfigurationRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetAdvancedFeatureConfigurationResponse::builder)
                .logger(LOG, "getFleetAdvancedFeatureConfiguration")
                .serviceDetails(
                        "JavaManagementService",
                        "GetFleetAdvancedFeatureConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetAdvancedFeatureConfiguration/GetFleetAdvancedFeatureConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetAdvancedFeatureConfigurationRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("advancedFeatureConfiguration")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.FleetAdvancedFeatureConfiguration.class,
                        GetFleetAdvancedFeatureConfigurationResponse.Builder
                                ::fleetAdvancedFeatureConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetFleetAdvancedFeatureConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetFleetAdvancedFeatureConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetFleetAgentConfigurationResponse getFleetAgentConfiguration(
            GetFleetAgentConfigurationRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetAgentConfigurationResponse::builder)
                .logger(LOG, "getFleetAgentConfiguration")
                .serviceDetails(
                        "JavaManagementService",
                        "GetFleetAgentConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetAgentConfiguration/GetFleetAgentConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetAgentConfigurationRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("agentConfiguration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.FleetAgentConfiguration.class,
                        GetFleetAgentConfigurationResponse.Builder::fleetAgentConfiguration)
                .handleResponseHeaderString(
                        "etag", GetFleetAgentConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFleetAgentConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJavaFamilyResponse getJavaFamily(GetJavaFamilyRequest request) {

        Validate.notBlank(request.getFamilyVersion(), "familyVersion must not be blank");

        return clientCall(request, GetJavaFamilyResponse::builder)
                .logger(LOG, "getJavaFamily")
                .serviceDetails(
                        "JavaManagementService",
                        "GetJavaFamily",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaFamily/GetJavaFamily")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJavaFamilyRequest::builder)
                .basePath("/20210610")
                .appendPathParam("javaFamilies")
                .appendPathParam(request.getFamilyVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JavaFamily.class,
                        GetJavaFamilyResponse.Builder::javaFamily)
                .handleResponseHeaderString(
                        "opc-request-id", GetJavaFamilyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJavaMigrationAnalysisResultResponse getJavaMigrationAnalysisResult(
            GetJavaMigrationAnalysisResultRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(
                request.getJavaMigrationAnalysisResultId(),
                "javaMigrationAnalysisResultId must not be blank");

        return clientCall(request, GetJavaMigrationAnalysisResultResponse::builder)
                .logger(LOG, "getJavaMigrationAnalysisResult")
                .serviceDetails(
                        "JavaManagementService",
                        "GetJavaMigrationAnalysisResult",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaMigrationAnalysisResult/GetJavaMigrationAnalysisResult")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJavaMigrationAnalysisResultRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("javaMigrationAnalysisResults")
                .appendPathParam(request.getJavaMigrationAnalysisResultId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JavaMigrationAnalysisResult.class,
                        GetJavaMigrationAnalysisResultResponse.Builder::javaMigrationAnalysisResult)
                .handleResponseHeaderString(
                        "etag", GetJavaMigrationAnalysisResultResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetJavaMigrationAnalysisResultResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJavaReleaseResponse getJavaRelease(GetJavaReleaseRequest request) {

        Validate.notBlank(request.getReleaseVersion(), "releaseVersion must not be blank");

        return clientCall(request, GetJavaReleaseResponse::builder)
                .logger(LOG, "getJavaRelease")
                .serviceDetails(
                        "JavaManagementService",
                        "GetJavaRelease",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaRelease/GetJavaRelease")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJavaReleaseRequest::builder)
                .basePath("/20210610")
                .appendPathParam("javaReleases")
                .appendPathParam(request.getReleaseVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JavaRelease.class,
                        GetJavaReleaseResponse.Builder::javaRelease)
                .handleResponseHeaderString(
                        "opc-request-id", GetJavaReleaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJmsPluginResponse getJmsPlugin(GetJmsPluginRequest request) {

        Validate.notBlank(request.getJmsPluginId(), "jmsPluginId must not be blank");

        return clientCall(request, GetJmsPluginResponse::builder)
                .logger(LOG, "getJmsPlugin")
                .serviceDetails(
                        "JavaManagementService",
                        "GetJmsPlugin",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JmsPlugin/GetJmsPlugin")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJmsPluginRequest::builder)
                .basePath("/20210610")
                .appendPathParam("jmsPlugins")
                .appendPathParam(request.getJmsPluginId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JmsPlugin.class,
                        GetJmsPluginResponse.Builder::jmsPlugin)
                .handleResponseHeaderString(
                        "opc-request-id", GetJmsPluginResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat("retry-after", GetJmsPluginResponse.Builder::retryAfter)
                .handleResponseHeaderString("etag", GetJmsPluginResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetPerformanceTuningAnalysisResultResponse getPerformanceTuningAnalysisResult(
            GetPerformanceTuningAnalysisResultRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(
                request.getPerformanceTuningAnalysisResultId(),
                "performanceTuningAnalysisResultId must not be blank");

        return clientCall(request, GetPerformanceTuningAnalysisResultResponse::builder)
                .logger(LOG, "getPerformanceTuningAnalysisResult")
                .serviceDetails(
                        "JavaManagementService",
                        "GetPerformanceTuningAnalysisResult",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/PerformanceTuningAnalysisResult/GetPerformanceTuningAnalysisResult")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPerformanceTuningAnalysisResultRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("performanceTuningAnalysisResults")
                .appendPathParam(request.getPerformanceTuningAnalysisResultId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.PerformanceTuningAnalysisResult.class,
                        GetPerformanceTuningAnalysisResultResponse.Builder
                                ::performanceTuningAnalysisResult)
                .handleResponseHeaderString(
                        "etag", GetPerformanceTuningAnalysisResultResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetPerformanceTuningAnalysisResultResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "JavaManagementService",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210610")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListAgentInstallersResponse listAgentInstallers(ListAgentInstallersRequest request) {

        return clientCall(request, ListAgentInstallersResponse::builder)
                .logger(LOG, "listAgentInstallers")
                .serviceDetails(
                        "JavaManagementService",
                        "ListAgentInstallers",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/AgentInstallerSummary/ListAgentInstallers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAgentInstallersRequest::builder)
                .basePath("/20210610")
                .appendPathParam("agentInstallers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("fleetId", request.getFleetId())
                .appendEnumQueryParam("platformArchitecture", request.getPlatformArchitecture())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.AgentInstallerCollection.class,
                        ListAgentInstallersResponse.Builder::agentInstallerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAgentInstallersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAgentInstallersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAnnouncementsResponse listAnnouncements(ListAnnouncementsRequest request) {

        return clientCall(request, ListAnnouncementsResponse::builder)
                .logger(LOG, "listAnnouncements")
                .serviceDetails(
                        "JavaManagementService",
                        "ListAnnouncements",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/AnnouncementCollection/ListAnnouncements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAnnouncementsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("announcements")
                .appendQueryParam("summaryContains", request.getSummaryContains())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.AnnouncementCollection.class,
                        ListAnnouncementsResponse.Builder::announcementCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAnnouncementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAnnouncementsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBlocklistsResponse listBlocklists(ListBlocklistsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListBlocklistsResponse::builder)
                .logger(LOG, "listBlocklists")
                .serviceDetails(
                        "JavaManagementService",
                        "ListBlocklists",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Blocklist/ListBlocklists")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBlocklistsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("blocklists")
                .appendEnumQueryParam("operation", request.getOperation())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.BlocklistCollection.class,
                        ListBlocklistsResponse.Builder::blocklistCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBlocklistsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBlocklistsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCryptoAnalysisResultsResponse listCryptoAnalysisResults(
            ListCryptoAnalysisResultsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListCryptoAnalysisResultsResponse::builder)
                .logger(LOG, "listCryptoAnalysisResults")
                .serviceDetails(
                        "JavaManagementService",
                        "ListCryptoAnalysisResults",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/CryptoAnalysisResult/ListCryptoAnalysisResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCryptoAnalysisResultsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("cryptoAnalysisResults")
                .appendEnumQueryParam("aggregationMode", request.getAggregationMode())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("hostName", request.getHostName())
                .appendQueryParam("nonCompliantFindingCount", request.getNonCompliantFindingCount())
                .appendQueryParam(
                        "nonCompliantFindingCountGreaterThan",
                        request.getNonCompliantFindingCountGreaterThan())
                .appendQueryParam("findingCount", request.getFindingCount())
                .appendQueryParam("findingCountGreaterThan", request.getFindingCountGreaterThan())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.CryptoAnalysisResultCollection.class,
                        ListCryptoAnalysisResultsResponse.Builder::cryptoAnalysisResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCryptoAnalysisResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCryptoAnalysisResultsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDrsFilesResponse listDrsFiles(ListDrsFilesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListDrsFilesResponse::builder)
                .logger(LOG, "listDrsFiles")
                .serviceDetails(
                        "JavaManagementService",
                        "ListDrsFiles",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/DrsFileCollection/ListDrsFiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDrsFilesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("drsFiles")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.DrsFileCollection.class,
                        ListDrsFilesResponse.Builder::drsFileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDrsFilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDrsFilesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFleetDiagnosesResponse listFleetDiagnoses(ListFleetDiagnosesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetDiagnosesResponse::builder)
                .logger(LOG, "listFleetDiagnoses")
                .serviceDetails(
                        "JavaManagementService",
                        "ListFleetDiagnoses",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetDiagnosisSummary/ListFleetDiagnoses")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetDiagnosesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("diagnoses")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.FleetDiagnosisCollection.class,
                        ListFleetDiagnosesResponse.Builder::fleetDiagnosisCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetDiagnosesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetDiagnosesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFleetErrorsResponse listFleetErrors(ListFleetErrorsRequest request) {

        return clientCall(request, ListFleetErrorsResponse::builder)
                .logger(LOG, "listFleetErrors")
                .serviceDetails(
                        "JavaManagementService",
                        "ListFleetErrors",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetErrorSummary/ListFleetErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetErrorsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleetErrors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("fleetId", request.getFleetId())
                .appendQueryParam(
                        "timeFirstSeenLessThanOrEqualTo",
                        request.getTimeFirstSeenLessThanOrEqualTo())
                .appendQueryParam(
                        "timeFirstSeenGreaterThanOrEqualTo",
                        request.getTimeFirstSeenGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeLastSeenLessThanOrEqualTo", request.getTimeLastSeenLessThanOrEqualTo())
                .appendQueryParam(
                        "timeLastSeenGreaterThanOrEqualTo",
                        request.getTimeLastSeenGreaterThanOrEqualTo())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.FleetErrorCollection.class,
                        ListFleetErrorsResponse.Builder::fleetErrorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetErrorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFleetsResponse listFleets(ListFleetsRequest request) {

        return clientCall(request, ListFleetsResponse::builder)
                .logger(LOG, "listFleets")
                .serviceDetails(
                        "JavaManagementService",
                        "ListFleets",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/ListFleets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.FleetCollection.class,
                        ListFleetsResponse.Builder::fleetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListInstallationSitesResponse listInstallationSites(
            ListInstallationSitesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListInstallationSitesResponse::builder)
                .logger(LOG, "listInstallationSites")
                .serviceDetails(
                        "JavaManagementService",
                        "ListInstallationSites",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/InstallationSiteSummary/ListInstallationSites")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInstallationSitesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("installationSites")
                .appendQueryParam("jreVendor", request.getJreVendor())
                .appendQueryParam("jreDistribution", request.getJreDistribution())
                .appendQueryParam("jreVersion", request.getJreVersion())
                .appendQueryParam("installationPath", request.getInstallationPath())
                .appendQueryParam("applicationId", request.getApplicationId())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "osFamily",
                        request.getOsFamily(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("jreSecurityStatus", request.getJreSecurityStatus())
                .appendQueryParam("pathContains", request.getPathContains())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.InstallationSiteCollection.class,
                        ListInstallationSitesResponse.Builder::installationSiteCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInstallationSitesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInstallationSitesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListJavaFamiliesResponse listJavaFamilies(ListJavaFamiliesRequest request) {

        return clientCall(request, ListJavaFamiliesResponse::builder)
                .logger(LOG, "listJavaFamilies")
                .serviceDetails(
                        "JavaManagementService",
                        "ListJavaFamilies",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaFamily/ListJavaFamilies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJavaFamiliesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("javaFamilies")
                .appendQueryParam("familyVersion", request.getFamilyVersion())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("isSupportedVersion", request.getIsSupportedVersion())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JavaFamilyCollection.class,
                        ListJavaFamiliesResponse.Builder::javaFamilyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJavaFamiliesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJavaFamiliesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListJavaMigrationAnalysisResultsResponse listJavaMigrationAnalysisResults(
            ListJavaMigrationAnalysisResultsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListJavaMigrationAnalysisResultsResponse::builder)
                .logger(LOG, "listJavaMigrationAnalysisResults")
                .serviceDetails(
                        "JavaManagementService",
                        "ListJavaMigrationAnalysisResults",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaMigrationAnalysisResult/ListJavaMigrationAnalysisResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJavaMigrationAnalysisResultsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("javaMigrationAnalysisResults")
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("hostName", request.getHostName())
                .appendQueryParam("applicationName", request.getApplicationName())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JavaMigrationAnalysisResultCollection.class,
                        ListJavaMigrationAnalysisResultsResponse.Builder
                                ::javaMigrationAnalysisResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListJavaMigrationAnalysisResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListJavaMigrationAnalysisResultsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListJavaReleasesResponse listJavaReleases(ListJavaReleasesRequest request) {

        return clientCall(request, ListJavaReleasesResponse::builder)
                .logger(LOG, "listJavaReleases")
                .serviceDetails(
                        "JavaManagementService",
                        "ListJavaReleases",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaRelease/ListJavaReleases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJavaReleasesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("javaReleases")
                .appendQueryParam("releaseVersion", request.getReleaseVersion())
                .appendQueryParam("familyVersion", request.getFamilyVersion())
                .appendEnumQueryParam("releaseType", request.getReleaseType())
                .appendEnumQueryParam("jreSecurityStatus", request.getJreSecurityStatus())
                .appendEnumQueryParam("licenseType", request.getLicenseType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JavaReleaseCollection.class,
                        ListJavaReleasesResponse.Builder::javaReleaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJavaReleasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJavaReleasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListJmsPluginsResponse listJmsPlugins(ListJmsPluginsRequest request) {

        return clientCall(request, ListJmsPluginsResponse::builder)
                .logger(LOG, "listJmsPlugins")
                .serviceDetails(
                        "JavaManagementService",
                        "ListJmsPlugins",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JmsPlugin/ListJmsPlugins")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJmsPluginsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("jmsPlugins")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("fleetId", request.getFleetId())
                .appendQueryParam("agentId", request.getAgentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("availabilityStatus", request.getAvailabilityStatus())
                .appendEnumQueryParam("agentType", request.getAgentType())
                .appendQueryParam(
                        "timeRegisteredLessThanOrEqualTo",
                        request.getTimeRegisteredLessThanOrEqualTo())
                .appendQueryParam(
                        "timeLastSeenLessThanOrEqualTo", request.getTimeLastSeenLessThanOrEqualTo())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("hostnameContains", request.getHostnameContains())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JmsPluginCollection.class,
                        ListJmsPluginsResponse.Builder::jmsPluginCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJmsPluginsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJmsPluginsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListJreUsageResponse listJreUsage(ListJreUsageRequest request) {

        return clientCall(request, ListJreUsageResponse::builder)
                .logger(LOG, "listJreUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "ListJreUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JreUsage/ListJreUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJreUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("listJreUsage")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("hostId", request.getHostId())
                .appendQueryParam("applicationId", request.getApplicationId())
                .appendQueryParam("applicationName", request.getApplicationName())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JreUsageCollection.class,
                        ListJreUsageResponse.Builder::jreUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJreUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJreUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPerformanceTuningAnalysisResultsResponse listPerformanceTuningAnalysisResults(
            ListPerformanceTuningAnalysisResultsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListPerformanceTuningAnalysisResultsResponse::builder)
                .logger(LOG, "listPerformanceTuningAnalysisResults")
                .serviceDetails(
                        "JavaManagementService",
                        "ListPerformanceTuningAnalysisResults",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/PerformanceTuningAnalysisResult/ListPerformanceTuningAnalysisResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPerformanceTuningAnalysisResultsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("performanceTuningAnalysisResults")
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("applicationId", request.getApplicationId())
                .appendQueryParam("applicationName", request.getApplicationName())
                .appendQueryParam("hostName", request.getHostName())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.PerformanceTuningAnalysisResultCollection.class,
                        ListPerformanceTuningAnalysisResultsResponse.Builder
                                ::performanceTuningAnalysisResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListPerformanceTuningAnalysisResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListPerformanceTuningAnalysisResultsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPluginErrorsResponse listPluginErrors(ListPluginErrorsRequest request) {

        return clientCall(request, ListPluginErrorsResponse::builder)
                .logger(LOG, "listPluginErrors")
                .serviceDetails(
                        "JavaManagementService",
                        "ListPluginErrors",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/PluginErrorSummary/ListPluginErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPluginErrorsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("pluginErrors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam(
                        "timeFirstSeenLessThanOrEqualTo",
                        request.getTimeFirstSeenLessThanOrEqualTo())
                .appendQueryParam(
                        "timeFirstSeenGreaterThanOrEqualTo",
                        request.getTimeFirstSeenGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeLastSeenLessThanOrEqualTo", request.getTimeLastSeenLessThanOrEqualTo())
                .appendQueryParam(
                        "timeLastSeenGreaterThanOrEqualTo",
                        request.getTimeLastSeenGreaterThanOrEqualTo())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.PluginErrorCollection.class,
                        ListPluginErrorsResponse.Builder::pluginErrorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPluginErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPluginErrorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkItemsResponse listWorkItems(ListWorkItemsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkItemsResponse::builder)
                .logger(LOG, "listWorkItems")
                .serviceDetails(
                        "JavaManagementService",
                        "ListWorkItems",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkItemSummary/ListWorkItems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkItemsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("workItems")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.WorkItemCollection.class,
                        ListWorkItemsResponse.Builder::workItemCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkItemsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkItemsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "JavaManagementService",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.WorkRequestErrorCollection.class,
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
                .serviceDetails(
                        "JavaManagementService",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.WorkRequestLogEntryCollection.class,
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
                .serviceDetails(
                        "JavaManagementService",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("fleetId", request.getFleetId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendEnumQueryParam("operationType", request.getOperationType())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RemoveFleetInstallationSitesResponse removeFleetInstallationSites(
            RemoveFleetInstallationSitesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getRemoveFleetInstallationSitesDetails(),
                "removeFleetInstallationSitesDetails is required");

        return clientCall(request, RemoveFleetInstallationSitesResponse::builder)
                .logger(LOG, "removeFleetInstallationSites")
                .serviceDetails(
                        "JavaManagementService",
                        "RemoveFleetInstallationSites",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/InstallationSiteSummary/RemoveFleetInstallationSites")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveFleetInstallationSitesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("removeInstallationSites")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveFleetInstallationSitesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveFleetInstallationSitesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RequestCryptoAnalysesResponse requestCryptoAnalyses(
            RequestCryptoAnalysesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getRequestCryptoAnalysesDetails(),
                "requestCryptoAnalysesDetails is required");

        return clientCall(request, RequestCryptoAnalysesResponse::builder)
                .logger(LOG, "requestCryptoAnalyses")
                .serviceDetails(
                        "JavaManagementService",
                        "RequestCryptoAnalyses",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/RequestCryptoAnalyses")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestCryptoAnalysesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("requestCryptoAnalyses")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestCryptoAnalysesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RequestCryptoAnalysesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RequestDeployedApplicationMigrationAnalysesResponse
            requestDeployedApplicationMigrationAnalyses(
                    RequestDeployedApplicationMigrationAnalysesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getRequestDeployedApplicationMigrationAnalysesDetails(),
                "requestDeployedApplicationMigrationAnalysesDetails is required");

        return clientCall(request, RequestDeployedApplicationMigrationAnalysesResponse::builder)
                .logger(LOG, "requestDeployedApplicationMigrationAnalyses")
                .serviceDetails(
                        "JavaManagementService",
                        "RequestDeployedApplicationMigrationAnalyses",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/RequestDeployedApplicationMigrationAnalyses")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestDeployedApplicationMigrationAnalysesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("requestDeployedApplicationMigrationAnalyses")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestDeployedApplicationMigrationAnalysesResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestDeployedApplicationMigrationAnalysesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RequestJavaMigrationAnalysesResponse requestJavaMigrationAnalyses(
            RequestJavaMigrationAnalysesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getRequestJavaMigrationAnalysesDetails(),
                "requestJavaMigrationAnalysesDetails is required");

        return clientCall(request, RequestJavaMigrationAnalysesResponse::builder)
                .logger(LOG, "requestJavaMigrationAnalyses")
                .serviceDetails(
                        "JavaManagementService",
                        "RequestJavaMigrationAnalyses",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/RequestJavaMigrationAnalyses")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestJavaMigrationAnalysesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("requestJavaMigrationAnalyses")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestJavaMigrationAnalysesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestJavaMigrationAnalysesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RequestJfrRecordingsResponse requestJfrRecordings(RequestJfrRecordingsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getRequestJfrRecordingsDetails(),
                "requestJfrRecordingsDetails is required");

        return clientCall(request, RequestJfrRecordingsResponse::builder)
                .logger(LOG, "requestJfrRecordings")
                .serviceDetails(
                        "JavaManagementService",
                        "RequestJfrRecordings",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/RequestJfrRecordings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestJfrRecordingsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("requestJfrRecordings")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestJfrRecordingsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RequestJfrRecordingsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RequestPerformanceTuningAnalysesResponse requestPerformanceTuningAnalyses(
            RequestPerformanceTuningAnalysesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getRequestPerformanceTuningAnalysesDetails(),
                "requestPerformanceTuningAnalysesDetails is required");

        return clientCall(request, RequestPerformanceTuningAnalysesResponse::builder)
                .logger(LOG, "requestPerformanceTuningAnalyses")
                .serviceDetails(
                        "JavaManagementService",
                        "RequestPerformanceTuningAnalyses",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/RequestPerformanceTuningAnalyses")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestPerformanceTuningAnalysesRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("requestPerformanceTuningAnalyses")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestPerformanceTuningAnalysesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestPerformanceTuningAnalysesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ScanJavaServerUsageResponse scanJavaServerUsage(ScanJavaServerUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getScanJavaServerUsageDetails(), "scanJavaServerUsageDetails is required");

        return clientCall(request, ScanJavaServerUsageResponse::builder)
                .logger(LOG, "scanJavaServerUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "ScanJavaServerUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaServerUsage/ScanJavaServerUsage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScanJavaServerUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("scanJavaServerUsage")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ScanJavaServerUsageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ScanJavaServerUsageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ScanLibraryUsageResponse scanLibraryUsage(ScanLibraryUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getScanLibraryUsageDetails(), "scanLibraryUsageDetails is required");

        return clientCall(request, ScanLibraryUsageResponse::builder)
                .logger(LOG, "scanLibraryUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "ScanLibraryUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/LibraryUsage/ScanLibraryUsage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScanLibraryUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("scanLibraryUsage")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ScanLibraryUsageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ScanLibraryUsageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SummarizeApplicationInstallationUsageResponse summarizeApplicationInstallationUsage(
            SummarizeApplicationInstallationUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, SummarizeApplicationInstallationUsageResponse::builder)
                .logger(LOG, "summarizeApplicationInstallationUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeApplicationInstallationUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/ApplicationInstallationUsageSummary/SummarizeApplicationInstallationUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeApplicationInstallationUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("summarizeApplicationInstallationUsage")
                .appendQueryParam(
                        "applicationInstallationKey", request.getApplicationInstallationKey())
                .appendQueryParam("applicationId", request.getApplicationId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("applicationType", request.getApplicationType())
                .appendQueryParam(
                        "appInstallationPathContains", request.getAppInstallationPathContains())
                .appendQueryParam("jreVendor", request.getJreVendor())
                .appendQueryParam("jreDistribution", request.getJreDistribution())
                .appendQueryParam("jreVersion", request.getJreVersion())
                .appendQueryParam("installationPath", request.getInstallationPath())
                .appendQueryParam("libraryKey", request.getLibraryKey())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendListQueryParam(
                        "osFamily",
                        request.getOsFamily(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.ApplicationInstallationUsageSummaryCollection
                                .class,
                        SummarizeApplicationInstallationUsageResponse.Builder
                                ::applicationInstallationUsageSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeApplicationInstallationUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeApplicationInstallationUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeApplicationUsageResponse summarizeApplicationUsage(
            SummarizeApplicationUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, SummarizeApplicationUsageResponse::builder)
                .logger(LOG, "summarizeApplicationUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeApplicationUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/ApplicationUsage/SummarizeApplicationUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeApplicationUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("summarizeApplicationUsage")
                .appendQueryParam("applicationId", request.getApplicationId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("applicationType", request.getApplicationType())
                .appendQueryParam("jreVendor", request.getJreVendor())
                .appendQueryParam("jreDistribution", request.getJreDistribution())
                .appendQueryParam("jreVersion", request.getJreVersion())
                .appendQueryParam("installationPath", request.getInstallationPath())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "osFamily",
                        request.getOsFamily(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("libraryKey", request.getLibraryKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.ApplicationUsageCollection.class,
                        SummarizeApplicationUsageResponse.Builder::applicationUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeApplicationUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeApplicationUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeDeployedApplicationInstallationUsageResponse
            summarizeDeployedApplicationInstallationUsage(
                    SummarizeDeployedApplicationInstallationUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, SummarizeDeployedApplicationInstallationUsageResponse::builder)
                .logger(LOG, "summarizeDeployedApplicationInstallationUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeDeployedApplicationInstallationUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/DeployedApplicationInstallationUsageSummary/SummarizeDeployedApplicationInstallationUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeDeployedApplicationInstallationUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("summarizeDeployedApplicationInstallationUsage")
                .appendQueryParam("serverKey", request.getServerKey())
                .appendQueryParam("serverInstanceKey", request.getServerInstanceKey())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam(
                        "applicationInstallationKey", request.getApplicationInstallationKey())
                .appendQueryParam("applicationKey", request.getApplicationKey())
                .appendQueryParam("applicationNameContains", request.getApplicationNameContains())
                .appendQueryParam("applicationName", request.getApplicationName())
                .appendQueryParam(
                        "applicationSourcePathContains", request.getApplicationSourcePathContains())
                .appendQueryParam("libraryKey", request.getLibraryKey())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model
                                .DeployedApplicationInstallationUsageSummaryCollection.class,
                        SummarizeDeployedApplicationInstallationUsageResponse.Builder
                                ::deployedApplicationInstallationUsageSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeDeployedApplicationInstallationUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeDeployedApplicationInstallationUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeDeployedApplicationUsageResponse summarizeDeployedApplicationUsage(
            SummarizeDeployedApplicationUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, SummarizeDeployedApplicationUsageResponse::builder)
                .logger(LOG, "summarizeDeployedApplicationUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeDeployedApplicationUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/DeployedApplicationUsage/SummarizeDeployedApplicationUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeDeployedApplicationUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("summarizeDeployedApplicationUsage")
                .appendQueryParam("serverKey", request.getServerKey())
                .appendQueryParam("serverInstanceKey", request.getServerInstanceKey())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("libraryKey", request.getLibraryKey())
                .appendQueryParam("applicationKey", request.getApplicationKey())
                .appendQueryParam("applicationNameContains", request.getApplicationNameContains())
                .appendQueryParam("applicationName", request.getApplicationName())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.DeployedApplicationUsageCollection.class,
                        SummarizeDeployedApplicationUsageResponse.Builder
                                ::deployedApplicationUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeDeployedApplicationUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeDeployedApplicationUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeFleetErrorsResponse summarizeFleetErrors(SummarizeFleetErrorsRequest request) {

        return clientCall(request, SummarizeFleetErrorsResponse::builder)
                .logger(LOG, "summarizeFleetErrors")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeFleetErrors",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetErrorAggregation/SummarizeFleetErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeFleetErrorsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleetErrorAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.FleetErrorAggregationCollection.class,
                        SummarizeFleetErrorsResponse.Builder::fleetErrorAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeFleetErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeFleetErrorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeInstallationUsageResponse summarizeInstallationUsage(
            SummarizeInstallationUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, SummarizeInstallationUsageResponse::builder)
                .logger(LOG, "summarizeInstallationUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeInstallationUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/InstallationUsage/SummarizeInstallationUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeInstallationUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("summarizeInstallationUsage")
                .appendQueryParam("jreVendor", request.getJreVendor())
                .appendQueryParam("jreDistribution", request.getJreDistribution())
                .appendQueryParam("jreVersion", request.getJreVersion())
                .appendQueryParam("installationPath", request.getInstallationPath())
                .appendQueryParam("applicationId", request.getApplicationId())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "osFamily",
                        request.getOsFamily(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("pathContains", request.getPathContains())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.InstallationUsageCollection.class,
                        SummarizeInstallationUsageResponse.Builder::installationUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeInstallationUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeInstallationUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeJavaServerInstanceUsageResponse summarizeJavaServerInstanceUsage(
            SummarizeJavaServerInstanceUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, SummarizeJavaServerInstanceUsageResponse::builder)
                .logger(LOG, "summarizeJavaServerInstanceUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeJavaServerInstanceUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaServerInstanceUsage/SummarizeJavaServerInstanceUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeJavaServerInstanceUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("summarizeJavaServerInstanceUsage")
                .appendQueryParam("serverKey", request.getServerKey())
                .appendQueryParam("serverInstanceKey", request.getServerInstanceKey())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("applicationKey", request.getApplicationKey())
                .appendQueryParam("libraryKey", request.getLibraryKey())
                .appendQueryParam(
                        "serverInstanceNameContains", request.getServerInstanceNameContains())
                .appendQueryParam("serverInstanceName", request.getServerInstanceName())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JavaServerInstanceUsageCollection.class,
                        SummarizeJavaServerInstanceUsageResponse.Builder
                                ::javaServerInstanceUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeJavaServerInstanceUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeJavaServerInstanceUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeJavaServerUsageResponse summarizeJavaServerUsage(
            SummarizeJavaServerUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, SummarizeJavaServerUsageResponse::builder)
                .logger(LOG, "summarizeJavaServerUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeJavaServerUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaServerUsage/SummarizeJavaServerUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeJavaServerUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("summarizeJavaServerUsage")
                .appendQueryParam("serverKey", request.getServerKey())
                .appendQueryParam("serverNameContains", request.getServerNameContains())
                .appendQueryParam("serverName", request.getServerName())
                .appendQueryParam("serverVersion", request.getServerVersion())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JavaServerUsageCollection.class,
                        SummarizeJavaServerUsageResponse.Builder::javaServerUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeJavaServerUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeJavaServerUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeJreUsageResponse summarizeJreUsage(SummarizeJreUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, SummarizeJreUsageResponse::builder)
                .logger(LOG, "summarizeJreUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeJreUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JreUsage/SummarizeJreUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeJreUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("summarizeJreUsage")
                .appendQueryParam("jreId", request.getJreId())
                .appendQueryParam("jreVendor", request.getJreVendor())
                .appendQueryParam("jreDistribution", request.getJreDistribution())
                .appendQueryParam("jreVersion", request.getJreVersion())
                .appendQueryParam("applicationId", request.getApplicationId())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "osFamily",
                        request.getOsFamily(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("jreSecurityStatus", request.getJreSecurityStatus())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.JreUsageCollection.class,
                        SummarizeJreUsageResponse.Builder::jreUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeJreUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeJreUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeLibraryUsageResponse summarizeLibraryUsage(
            SummarizeLibraryUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, SummarizeLibraryUsageResponse::builder)
                .logger(LOG, "summarizeLibraryUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeLibraryUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/LibraryUsage/SummarizeLibraryUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeLibraryUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("summarizeLibraryUsage")
                .appendQueryParam("serverInstanceKey", request.getServerInstanceKey())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("applicationKey", request.getApplicationKey())
                .appendQueryParam("libraryKey", request.getLibraryKey())
                .appendQueryParam("libraryNameContains", request.getLibraryNameContains())
                .appendQueryParam("libraryName", request.getLibraryName())
                .appendQueryParam("cvssScoreGreaterThan", request.getCvssScoreGreaterThan())
                .appendQueryParam("cvssScoreLessThan", request.getCvssScoreLessThan())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.LibraryUsageCollection.class,
                        SummarizeLibraryUsageResponse.Builder::libraryUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeLibraryUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeLibraryUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeManagedInstanceUsageResponse summarizeManagedInstanceUsage(
            SummarizeManagedInstanceUsageRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, SummarizeManagedInstanceUsageResponse::builder)
                .logger(LOG, "summarizeManagedInstanceUsage")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeManagedInstanceUsage",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/ManagedInstanceUsage/SummarizeManagedInstanceUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeManagedInstanceUsageRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("summarizeManagedInstanceUsage")
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendEnumQueryParam("managedInstanceType", request.getManagedInstanceType())
                .appendQueryParam("jreVendor", request.getJreVendor())
                .appendQueryParam("jreDistribution", request.getJreDistribution())
                .appendQueryParam("jreVersion", request.getJreVersion())
                .appendQueryParam("installationPath", request.getInstallationPath())
                .appendQueryParam("applicationId", request.getApplicationId())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "osFamily",
                        request.getOsFamily(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostnameContains", request.getHostnameContains())
                .appendQueryParam("libraryKey", request.getLibraryKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.ManagedInstanceUsageCollection.class,
                        SummarizeManagedInstanceUsageResponse.Builder
                                ::managedInstanceUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeManagedInstanceUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeManagedInstanceUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizePluginErrorsResponse summarizePluginErrors(
            SummarizePluginErrorsRequest request) {

        return clientCall(request, SummarizePluginErrorsResponse::builder)
                .logger(LOG, "summarizePluginErrors")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizePluginErrors",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/PluginErrorAggregation/SummarizePluginErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizePluginErrorsRequest::builder)
                .basePath("/20210610")
                .appendPathParam("pluginErrorAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.PluginErrorAggregationCollection.class,
                        SummarizePluginErrorsResponse.Builder::pluginErrorAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizePluginErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizePluginErrorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeResourceInventoryResponse summarizeResourceInventory(
            SummarizeResourceInventoryRequest request) {

        return clientCall(request, SummarizeResourceInventoryResponse::builder)
                .logger(LOG, "summarizeResourceInventory")
                .serviceDetails(
                        "JavaManagementService",
                        "SummarizeResourceInventory",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/SummarizeResourceInventory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeResourceInventoryRequest::builder)
                .basePath("/20210610")
                .appendPathParam("summarizeResourceInventory")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jms.model.ResourceInventory.class,
                        SummarizeResourceInventoryResponse.Builder::resourceInventory)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeResourceInventoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDrsFileResponse updateDrsFile(UpdateDrsFileRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDrsFileDetails(), "updateDrsFileDetails is required");

        Validate.notBlank(request.getDrsFileKey(), "drsFileKey must not be blank");

        return clientCall(request, UpdateDrsFileResponse::builder)
                .logger(LOG, "updateDrsFile")
                .serviceDetails(
                        "JavaManagementService",
                        "UpdateDrsFile",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/UpdateDrsFile")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDrsFileRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("drsFiles")
                .appendPathParam(request.getDrsFileKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDrsFileResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDrsFileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateExportSettingResponse updateExportSetting(UpdateExportSettingRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExportSettingDetails(), "updateExportSettingDetails is required");

        return clientCall(request, UpdateExportSettingResponse::builder)
                .logger(LOG, "updateExportSetting")
                .serviceDetails(
                        "JavaManagementService",
                        "UpdateExportSetting",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/ExportSetting/UpdateExportSetting")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExportSettingRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("exportSetting")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jms.model.ExportSetting.class,
                        UpdateExportSettingResponse.Builder::exportSetting)
                .handleResponseHeaderString("etag", UpdateExportSettingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExportSettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFleetResponse updateFleet(UpdateFleetRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(request.getUpdateFleetDetails(), "updateFleetDetails is required");

        return clientCall(request, UpdateFleetResponse::builder)
                .logger(LOG, "updateFleet")
                .serviceDetails(
                        "JavaManagementService",
                        "UpdateFleet",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/UpdateFleet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateFleetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFleetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFleetAdvancedFeatureConfigurationResponse updateFleetAdvancedFeatureConfiguration(
            UpdateFleetAdvancedFeatureConfigurationRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFleetAdvancedFeatureConfigurationDetails(),
                "updateFleetAdvancedFeatureConfigurationDetails is required");

        return clientCall(request, UpdateFleetAdvancedFeatureConfigurationResponse::builder)
                .logger(LOG, "updateFleetAdvancedFeatureConfiguration")
                .serviceDetails(
                        "JavaManagementService",
                        "UpdateFleetAdvancedFeatureConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetAdvancedFeatureConfiguration/UpdateFleetAdvancedFeatureConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetAdvancedFeatureConfigurationRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("advancedFeatureConfiguration")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jms.model.FleetAdvancedFeatureConfiguration.class,
                        UpdateFleetAdvancedFeatureConfigurationResponse.Builder
                                ::fleetAdvancedFeatureConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateFleetAdvancedFeatureConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateFleetAdvancedFeatureConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateFleetAgentConfigurationResponse updateFleetAgentConfiguration(
            UpdateFleetAgentConfigurationRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFleetAgentConfigurationDetails(),
                "updateFleetAgentConfigurationDetails is required");

        return clientCall(request, UpdateFleetAgentConfigurationResponse::builder)
                .logger(LOG, "updateFleetAgentConfiguration")
                .serviceDetails(
                        "JavaManagementService",
                        "UpdateFleetAgentConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetAgentConfiguration/UpdateFleetAgentConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetAgentConfigurationRequest::builder)
                .basePath("/20210610")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("agentConfiguration")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateFleetAgentConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateFleetAgentConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateJmsPluginResponse updateJmsPlugin(UpdateJmsPluginRequest request) {

        Validate.notBlank(request.getJmsPluginId(), "jmsPluginId must not be blank");
        Objects.requireNonNull(
                request.getUpdateJmsPluginDetails(), "updateJmsPluginDetails is required");

        return clientCall(request, UpdateJmsPluginResponse::builder)
                .logger(LOG, "updateJmsPlugin")
                .serviceDetails(
                        "JavaManagementService",
                        "UpdateJmsPlugin",
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JmsPlugin/UpdateJmsPlugin")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJmsPluginRequest::builder)
                .basePath("/20210610")
                .appendPathParam("jmsPlugins")
                .appendPathParam(request.getJmsPluginId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jms.model.JmsPlugin.class,
                        UpdateJmsPluginResponse.Builder::jmsPlugin)
                .handleResponseHeaderString("etag", UpdateJmsPluginResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJmsPluginResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public JavaManagementServiceWaiters getWaiters() {
        return waiters;
    }

    @Override
    public JavaManagementServicePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public JavaManagementServiceClient(
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
    public JavaManagementServiceClient(
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
    public JavaManagementServiceClient(
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
    public JavaManagementServiceClient(
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
    public JavaManagementServiceClient(
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
    public JavaManagementServiceClient(
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
    public JavaManagementServiceClient(
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
    public JavaManagementServiceClient(
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
