/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.generativeaisandbox.requests.*;
import com.oracle.bmc.generativeaisandbox.responses.*;

import java.util.Objects;

/**
 * Async client implementation for GenerativeAiSandbox service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
public class GenerativeAiSandboxAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements GenerativeAiSandboxAsync {
    /** Service instance for GenerativeAiSandbox. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(GenerativeAiSandboxClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://inference.generativeai.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenerativeAiSandboxAsyncClient.class);

    GenerativeAiSandboxAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    GenerativeAiSandboxAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "GenerativeAiSandboxAsyncClient",
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
                    Builder, GenerativeAiSandboxAsyncClient> {
        private boolean isStreamWarningEnabled = true;

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
        public GenerativeAiSandboxAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GenerativeAiSandboxAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<CancelSandboxCommandResponse> cancelSandboxCommand(
            CancelSandboxCommandRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelSandboxCommandRequest, CancelSandboxCommandResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommand.class,
                        CancelSandboxCommandResponse.Builder::sandboxCommand)
                .handleResponseHeaderString(
                        "opc-request-id", CancelSandboxCommandResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSandboxResponse> createSandbox(
            CreateSandboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateSandboxRequest, CreateSandboxResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        CreateSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", CreateSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSandboxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSandboxSnapshotResponse> createSandboxSnapshot(
            CreateSandboxSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSandboxSnapshotRequest, CreateSandboxSnapshotResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxSnapshot.class,
                        CreateSandboxSnapshotResponse.Builder::sandboxSnapshot)
                .handleResponseHeaderString("etag", CreateSandboxSnapshotResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSandboxSnapshotResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSandboxResponse> deleteSandbox(
            DeleteSandboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteSandboxRequest, DeleteSandboxResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSandboxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSandboxSnapshotResponse> deleteSandboxSnapshot(
            DeleteSandboxSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSandboxSnapshotRequest, DeleteSandboxSnapshotResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSandboxSnapshotResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExtendSandboxResponse> extendSandbox(
            ExtendSandboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ExtendSandboxRequest, ExtendSandboxResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        ExtendSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", ExtendSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ExtendSandboxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSandboxResponse> getSandbox(
            GetSandboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSandboxRequest, GetSandboxResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        GetSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", GetSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSandboxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSandboxCommandResponse> getSandboxCommand(
            GetSandboxCommandRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSandboxCommandRequest, GetSandboxCommandResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommand.class,
                        GetSandboxCommandResponse.Builder::sandboxCommand)
                .handleResponseHeaderString(
                        "opc-request-id", GetSandboxCommandResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSandboxCommandOutputResponse> getSandboxCommandOutput(
            GetSandboxCommandOutputRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSandboxCommandOutputRequest, GetSandboxCommandOutputResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommandOutput.class,
                        GetSandboxCommandOutputResponse.Builder::sandboxCommandOutput)
                .handleResponseHeaderString(
                        "opc-request-id", GetSandboxCommandOutputResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSandboxSnapshotResponse> getSandboxSnapshot(
            GetSandboxSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSandboxSnapshotRequest, GetSandboxSnapshotResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxSnapshot.class,
                        GetSandboxSnapshotResponse.Builder::sandboxSnapshot)
                .handleResponseHeaderString("etag", GetSandboxSnapshotResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSandboxSnapshotResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSandboxCommandResponse> listSandboxCommand(
            ListSandboxCommandRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSandboxCommandRequest, ListSandboxCommandResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommandCollection.class,
                        ListSandboxCommandResponse.Builder::sandboxCommandCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSandboxCommandResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSandboxCommandResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSandboxSnapshotsResponse> listSandboxSnapshots(
            ListSandboxSnapshotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSandboxSnapshotsRequest, ListSandboxSnapshotsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxSnapshotCollection.class,
                        ListSandboxSnapshotsResponse.Builder::sandboxSnapshotCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSandboxSnapshotsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSandboxSnapshotsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSandboxesResponse> listSandboxes(
            ListSandboxesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSandboxesRequest, ListSandboxesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCollection.class,
                        ListSandboxesResponse.Builder::sandboxCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSandboxesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSandboxesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReadSandboxFileResponse> readSandboxFile(
            ReadSandboxFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReadSandboxFileRequest, ReadSandboxFileResponse>
                    handler) {

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
                .handleBody(java.io.InputStream.class, ReadSandboxFileResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", ReadSandboxFileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-content-sha256", ReadSandboxFileResponse.Builder::opcContentSha256)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResumeSandboxResponse> resumeSandbox(
            ResumeSandboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ResumeSandboxRequest, ResumeSandboxResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        ResumeSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", ResumeSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ResumeSandboxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RunSandboxCommandResponse> runSandboxCommand(
            RunSandboxCommandRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RunSandboxCommandRequest, RunSandboxCommandResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommandIdentifier.class,
                        RunSandboxCommandResponse.Builder::sandboxCommandIdentifier)
                .handleResponseHeaderString(
                        "opc-request-id", RunSandboxCommandResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RunSandboxCommandAndStreamResponse>
            runSandboxCommandAndStream(
                    RunSandboxCommandAndStreamRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RunSandboxCommandAndStreamRequest,
                                    RunSandboxCommandAndStreamResponse>
                            handler) {

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
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        RunSandboxCommandAndStreamResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", RunSandboxCommandAndStreamResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RunSandboxCommandAndWaitResponse> runSandboxCommandAndWait(
            RunSandboxCommandAndWaitRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RunSandboxCommandAndWaitRequest, RunSandboxCommandAndWaitResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxCommand.class,
                        RunSandboxCommandAndWaitResponse.Builder::sandboxCommand)
                .handleResponseHeaderString(
                        "opc-request-id", RunSandboxCommandAndWaitResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopSandboxResponse> stopSandbox(
            StopSandboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StopSandboxRequest, StopSandboxResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        StopSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", StopSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StopSandboxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StreamSandboxCommandEventsResponse>
            streamSandboxCommandEvents(
                    StreamSandboxCommandEventsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    StreamSandboxCommandEventsRequest,
                                    StreamSandboxCommandEventsResponse>
                            handler) {

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
                .handleBody(
                        java.io.InputStream.class,
                        StreamSandboxCommandEventsResponse.Builder::inputStream)
                .handleEventStream(StreamSandboxCommandEventsResponse.Builder::eventStream)
                .handleResponseHeaderString(
                        "opc-request-id", StreamSandboxCommandEventsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SuspendSandboxResponse> suspendSandbox(
            SuspendSandboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SuspendSandboxRequest, SuspendSandboxResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        SuspendSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", SuspendSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SuspendSandboxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSandboxResponse> updateSandbox(
            UpdateSandboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateSandboxRequest, UpdateSandboxResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.Sandbox.class,
                        UpdateSandboxResponse.Builder::sandbox)
                .handleResponseHeaderString("etag", UpdateSandboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSandboxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<WriteSandboxFileResponse> writeSandboxFile(
            WriteSandboxFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            WriteSandboxFileRequest, WriteSandboxFileResponse>
                    handler) {

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
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaisandbox.model.SandboxFile.class,
                        WriteSandboxFileResponse.Builder::sandboxFile)
                .handleResponseHeaderString(
                        "opc-request-id", WriteSandboxFileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-content-sha256", WriteSandboxFileResponse.Builder::opcContentSha256)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GenerativeAiSandboxAsyncClient(
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
    public GenerativeAiSandboxAsyncClient(
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
    public GenerativeAiSandboxAsyncClient(
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
    public GenerativeAiSandboxAsyncClient(
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
    public GenerativeAiSandboxAsyncClient(
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
    public GenerativeAiSandboxAsyncClient(
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
    public GenerativeAiSandboxAsyncClient(
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
