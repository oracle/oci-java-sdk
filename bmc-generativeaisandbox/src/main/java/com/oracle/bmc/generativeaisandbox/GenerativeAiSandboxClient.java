/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.generativeaisandbox.requests.*;
import com.oracle.bmc.generativeaisandbox.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
public class GenerativeAiSandboxClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements GenerativeAiSandbox {
    /** Service instance for GenerativeAiSandbox. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(GenerativeAiSandboxClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://inference.generativeai.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenerativeAiSandboxClient.class);

    private final GenerativeAiSandboxWaiters waiters;

    private final GenerativeAiSandboxPaginators paginators;

    GenerativeAiSandboxClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    GenerativeAiSandboxClient(
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
                                    .nameFormat("GenerativeAiSandbox-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new GenerativeAiSandboxWaiters(executorService, this);

        this.paginators = new GenerativeAiSandboxPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "GenerativeAiSandboxClient",
                            "readSandboxFile,runSandboxCommandAndStream,streamSandboxCommandEvents"));
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
                    Builder, GenerativeAiSandboxClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "generativeaisandbox";
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
        public GenerativeAiSandboxClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GenerativeAiSandboxClient(
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
    public CancelSandboxCommandResponse cancelSandboxCommand(CancelSandboxCommandRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");

        Validate.notBlank(request.getCommandId(), "commandId must not be blank");
        Objects.requireNonNull(
                request.getCancelSandboxCommandDetails(),
                "cancelSandboxCommandDetails is required");

        return clientCall(request, CancelSandboxCommandResponse::builder)
                .logger(LOG, "cancelSandboxCommand")
                .serviceDetails("GenerativeAiSandbox", "CancelSandboxCommand", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelSandboxCommandRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("commands")
                .appendPathParam(request.getCommandId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommand.class,
                        CancelSandboxCommandResponse.Builder::sandboxCommand)
                .handleResponseHeaderString(
                        "opc-request-id", CancelSandboxCommandResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSandboxResponse createSandbox(CreateSandboxRequest request) {
        Objects.requireNonNull(request.getProjectId(), "projectId is required");

        Objects.requireNonNull(
                request.getCreateSandboxDetails(), "createSandboxDetails is required");

        return clientCall(request, CreateSandboxResponse::builder)
                .logger(LOG, "createSandbox")
                .serviceDetails("GenerativeAiSandbox", "CreateSandbox", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSandboxRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("project-id", request.getProjectId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        CreateSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", CreateSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSandboxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSandboxSnapshotResponse createSandboxSnapshot(
            CreateSandboxSnapshotRequest request) {
        Objects.requireNonNull(
                request.getCreateSandboxSnapshotDetails(),
                "createSandboxSnapshotDetails is required");

        return clientCall(request, CreateSandboxSnapshotResponse::builder)
                .logger(LOG, "createSandboxSnapshot")
                .serviceDetails("GenerativeAiSandbox", "CreateSandboxSnapshot", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSandboxSnapshotRequest::builder)
                .basePath("/20260422")
                .appendPathParam("snapshots")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxSnapshot.class,
                        CreateSandboxSnapshotResponse.Builder::sandboxSnapshot)
                .handleResponseHeaderString("etag", CreateSandboxSnapshotResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSandboxSnapshotResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSandboxResponse deleteSandbox(DeleteSandboxRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");

        return clientCall(request, DeleteSandboxResponse::builder)
                .logger(LOG, "deleteSandbox")
                .serviceDetails("GenerativeAiSandbox", "DeleteSandbox", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSandboxRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSandboxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSandboxSnapshotResponse deleteSandboxSnapshot(
            DeleteSandboxSnapshotRequest request) {

        Validate.notBlank(request.getSnapshotId(), "snapshotId must not be blank");

        return clientCall(request, DeleteSandboxSnapshotResponse::builder)
                .logger(LOG, "deleteSandboxSnapshot")
                .serviceDetails("GenerativeAiSandbox", "DeleteSandboxSnapshot", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSandboxSnapshotRequest::builder)
                .basePath("/20260422")
                .appendPathParam("snapshots")
                .appendPathParam(request.getSnapshotId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSandboxSnapshotResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ExtendSandboxResponse extendSandbox(ExtendSandboxRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");
        Objects.requireNonNull(
                request.getExtendSandboxDetails(), "extendSandboxDetails is required");

        return clientCall(request, ExtendSandboxResponse::builder)
                .logger(LOG, "extendSandbox")
                .serviceDetails("GenerativeAiSandbox", "ExtendSandbox", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExtendSandboxRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("actions")
                .appendPathParam("extend")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        ExtendSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", ExtendSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ExtendSandboxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSandboxResponse getSandbox(GetSandboxRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");

        return clientCall(request, GetSandboxResponse::builder)
                .logger(LOG, "getSandbox")
                .serviceDetails("GenerativeAiSandbox", "GetSandbox", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSandboxRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        GetSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", GetSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSandboxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSandboxCommandResponse getSandboxCommand(GetSandboxCommandRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");

        Validate.notBlank(request.getCommandId(), "commandId must not be blank");

        return clientCall(request, GetSandboxCommandResponse::builder)
                .logger(LOG, "getSandboxCommand")
                .serviceDetails("GenerativeAiSandbox", "GetSandboxCommand", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSandboxCommandRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("commands")
                .appendPathParam(request.getCommandId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommand.class,
                        GetSandboxCommandResponse.Builder::sandboxCommand)
                .handleResponseHeaderString(
                        "opc-request-id", GetSandboxCommandResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSandboxCommandOutputResponse getSandboxCommandOutput(
            GetSandboxCommandOutputRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");

        Validate.notBlank(request.getCommandId(), "commandId must not be blank");

        return clientCall(request, GetSandboxCommandOutputResponse::builder)
                .logger(LOG, "getSandboxCommandOutput")
                .serviceDetails("GenerativeAiSandbox", "GetSandboxCommandOutput", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSandboxCommandOutputRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("commands")
                .appendPathParam(request.getCommandId())
                .appendPathParam("output")
                .appendQueryParam("fromSeq", request.getFromSeq())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommandOutput.class,
                        GetSandboxCommandOutputResponse.Builder::sandboxCommandOutput)
                .handleResponseHeaderString(
                        "opc-request-id", GetSandboxCommandOutputResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSandboxSnapshotResponse getSandboxSnapshot(GetSandboxSnapshotRequest request) {

        Validate.notBlank(request.getSnapshotId(), "snapshotId must not be blank");

        return clientCall(request, GetSandboxSnapshotResponse::builder)
                .logger(LOG, "getSandboxSnapshot")
                .serviceDetails("GenerativeAiSandbox", "GetSandboxSnapshot", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSandboxSnapshotRequest::builder)
                .basePath("/20260422")
                .appendPathParam("snapshots")
                .appendPathParam(request.getSnapshotId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxSnapshot.class,
                        GetSandboxSnapshotResponse.Builder::sandboxSnapshot)
                .handleResponseHeaderString("etag", GetSandboxSnapshotResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSandboxSnapshotResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSandboxCommandResponse listSandboxCommand(ListSandboxCommandRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");

        return clientCall(request, ListSandboxCommandResponse::builder)
                .logger(LOG, "listSandboxCommand")
                .serviceDetails("GenerativeAiSandbox", "ListSandboxCommand", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSandboxCommandRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("commands")
                .appendQueryParam("commandId", request.getCommandId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommandCollection.class,
                        ListSandboxCommandResponse.Builder::sandboxCommandCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSandboxCommandResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSandboxCommandResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSandboxSnapshotsResponse listSandboxSnapshots(ListSandboxSnapshotsRequest request) {

        return clientCall(request, ListSandboxSnapshotsResponse::builder)
                .logger(LOG, "listSandboxSnapshots")
                .serviceDetails("GenerativeAiSandbox", "ListSandboxSnapshots", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSandboxSnapshotsRequest::builder)
                .basePath("/20260422")
                .appendPathParam("snapshots")
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("sandboxId", request.getSandboxId())
                .appendQueryParam("snapshotId", request.getSnapshotId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxSnapshotCollection.class,
                        ListSandboxSnapshotsResponse.Builder::sandboxSnapshotCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSandboxSnapshotsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSandboxSnapshotsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSandboxesResponse listSandboxes(ListSandboxesRequest request) {

        return clientCall(request, ListSandboxesResponse::builder)
                .logger(LOG, "listSandboxes")
                .serviceDetails("GenerativeAiSandbox", "ListSandboxes", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSandboxesRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("sandboxId", request.getSandboxId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCollection.class,
                        ListSandboxesResponse.Builder::sandboxCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSandboxesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSandboxesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ReadSandboxFileResponse readSandboxFile(ReadSandboxFileRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");
        Objects.requireNonNull(request.getFilePath(), "filePath is required");

        return clientCall(request, ReadSandboxFileResponse::builder)
                .logger(LOG, "readSandboxFile")
                .serviceDetails("GenerativeAiSandbox", "ReadSandboxFile", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ReadSandboxFileRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("files")
                .appendPathParam("read")
                .appendQueryParam("filePath", request.getFilePath())
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(java.io.InputStream.class, ReadSandboxFileResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", ReadSandboxFileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-content-sha256", ReadSandboxFileResponse.Builder::opcContentSha256)
                .callSync();
    }

    @Override
    public ResumeSandboxResponse resumeSandbox(ResumeSandboxRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");
        Objects.requireNonNull(
                request.getResumeSandboxDetails(), "resumeSandboxDetails is required");

        return clientCall(request, ResumeSandboxResponse::builder)
                .logger(LOG, "resumeSandbox")
                .serviceDetails("GenerativeAiSandbox", "ResumeSandbox", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResumeSandboxRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("actions")
                .appendPathParam("resume")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        ResumeSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", ResumeSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ResumeSandboxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RunSandboxCommandResponse runSandboxCommand(RunSandboxCommandRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");
        Objects.requireNonNull(
                request.getRunSandboxCommandDetails(), "runSandboxCommandDetails is required");

        return clientCall(request, RunSandboxCommandResponse::builder)
                .logger(LOG, "runSandboxCommand")
                .serviceDetails("GenerativeAiSandbox", "RunSandboxCommand", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RunSandboxCommandRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("commands")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommandIdentifier.class,
                        RunSandboxCommandResponse.Builder::sandboxCommandIdentifier)
                .handleResponseHeaderString(
                        "opc-request-id", RunSandboxCommandResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RunSandboxCommandAndStreamResponse runSandboxCommandAndStream(
            RunSandboxCommandAndStreamRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");
        Objects.requireNonNull(
                request.getRunSandboxCommandDetails(), "runSandboxCommandDetails is required");

        return clientCall(request, RunSandboxCommandAndStreamResponse::builder)
                .logger(LOG, "runSandboxCommandAndStream")
                .serviceDetails("GenerativeAiSandbox", "RunSandboxCommandAndStream", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RunSandboxCommandAndStreamRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("commands")
                .appendPathParam("actions")
                .appendPathParam("runAndStream")
                .accept("application/x-ndjson")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        RunSandboxCommandAndStreamResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", RunSandboxCommandAndStreamResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RunSandboxCommandAndWaitResponse runSandboxCommandAndWait(
            RunSandboxCommandAndWaitRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");
        Objects.requireNonNull(
                request.getRunSandboxCommandDetails(), "runSandboxCommandDetails is required");

        return clientCall(request, RunSandboxCommandAndWaitResponse::builder)
                .logger(LOG, "runSandboxCommandAndWait")
                .serviceDetails("GenerativeAiSandbox", "RunSandboxCommandAndWait", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RunSandboxCommandAndWaitRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("commands")
                .appendPathParam("actions")
                .appendPathParam("runAndWait")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommand.class,
                        RunSandboxCommandAndWaitResponse.Builder::sandboxCommand)
                .handleResponseHeaderString(
                        "opc-request-id", RunSandboxCommandAndWaitResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopSandboxResponse stopSandbox(StopSandboxRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");
        Objects.requireNonNull(request.getStopSandboxDetails(), "stopSandboxDetails is required");

        return clientCall(request, StopSandboxResponse::builder)
                .logger(LOG, "stopSandbox")
                .serviceDetails("GenerativeAiSandbox", "StopSandbox", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopSandboxRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        StopSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", StopSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StopSandboxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StreamSandboxCommandEventsResponse streamSandboxCommandEvents(
            StreamSandboxCommandEventsRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");

        Validate.notBlank(request.getCommandId(), "commandId must not be blank");

        return clientCall(request, StreamSandboxCommandEventsResponse::builder)
                .logger(LOG, "streamSandboxCommandEvents")
                .serviceDetails("GenerativeAiSandbox", "StreamSandboxCommandEvents", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(StreamSandboxCommandEventsRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("commands")
                .appendPathParam(request.getCommandId())
                .appendPathParam("events")
                .appendQueryParam("fromSeq", request.getFromSeq())
                .appendQueryParam("untilSeq", request.getUntilSeq())
                .accept("text/event-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        StreamSandboxCommandEventsResponse.Builder::inputStream)
                .handleEventStream(StreamSandboxCommandEventsResponse.Builder::eventStream)
                .handleResponseHeaderString(
                        "opc-request-id", StreamSandboxCommandEventsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SuspendSandboxResponse suspendSandbox(SuspendSandboxRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");
        Objects.requireNonNull(
                request.getSuspendSandboxDetails(), "suspendSandboxDetails is required");

        return clientCall(request, SuspendSandboxResponse::builder)
                .logger(LOG, "suspendSandbox")
                .serviceDetails("GenerativeAiSandbox", "SuspendSandbox", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SuspendSandboxRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("actions")
                .appendPathParam("suspend")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        SuspendSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", SuspendSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SuspendSandboxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateSandboxResponse updateSandbox(UpdateSandboxRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSandboxDetails(), "updateSandboxDetails is required");

        return clientCall(request, UpdateSandboxResponse::builder)
                .logger(LOG, "updateSandbox")
                .serviceDetails("GenerativeAiSandbox", "UpdateSandbox", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSandboxRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        UpdateSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", UpdateSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSandboxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public WriteSandboxFileResponse writeSandboxFile(WriteSandboxFileRequest request) {

        Validate.notBlank(request.getSandboxId(), "sandboxId must not be blank");
        Objects.requireNonNull(request.getFilePath(), "filePath is required");

        Objects.requireNonNull(
                request.getWriteSandboxFileContentDetails(),
                "writeSandboxFileContentDetails is required");

        return clientCall(request, WriteSandboxFileResponse::builder)
                .logger(LOG, "writeSandboxFile")
                .serviceDetails("GenerativeAiSandbox", "WriteSandboxFile", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(WriteSandboxFileRequest::builder)
                .basePath("/20260422")
                .appendPathParam("sandboxes")
                .appendPathParam(request.getSandboxId())
                .appendPathParam("files")
                .appendPathParam("write")
                .appendQueryParam("filePath", request.getFilePath())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-content-sha256", request.getOpcContentSha256())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxFile.class,
                        WriteSandboxFileResponse.Builder::sandboxFile)
                .handleResponseHeaderString(
                        "opc-request-id", WriteSandboxFileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-content-sha256", WriteSandboxFileResponse.Builder::opcContentSha256)
                .callSync();
    }

    @Override
    public GenerativeAiSandboxWaiters getWaiters() {
        return waiters;
    }

    @Override
    public GenerativeAiSandboxPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GenerativeAiSandboxClient(
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
    public GenerativeAiSandboxClient(
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
    public GenerativeAiSandboxClient(
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
    public GenerativeAiSandboxClient(
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
    public GenerativeAiSandboxClient(
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
    public GenerativeAiSandboxClient(
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
    public GenerativeAiSandboxClient(
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
    public GenerativeAiSandboxClient(
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
