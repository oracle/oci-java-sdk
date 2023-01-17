/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class FileStorageClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements FileStorage {
    /** Service instance for FileStorage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FILESTORAGE")
                    .serviceEndpointPrefix("filestorage")
                    .serviceEndpointTemplate("https://filestorage.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FileStorageAsyncClient.class);

    private final FileStorageWaiters waiters;

    private final FileStoragePaginators paginators;

    private FileStorageClient(
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
                                    .nameFormat("FileStorage-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new FileStorageWaiters(executorService, this);

        this.paginators = new FileStoragePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, FileStorageClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public FileStorageClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FileStorageClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeFileSystemCompartmentResponse changeFileSystemCompartment(
            ChangeFileSystemCompartmentRequest request) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");
        Objects.requireNonNull(
                request.getChangeFileSystemCompartmentDetails(),
                "changeFileSystemCompartmentDetails is required");

        return clientCall(request, ChangeFileSystemCompartmentResponse::builder)
                .logger(LOG, "changeFileSystemCompartment")
                .serviceDetails(
                        "FileStorage",
                        "ChangeFileSystemCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/ChangeFileSystemCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeFileSystemCompartmentRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeFileSystemCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeMountTargetCompartmentResponse changeMountTargetCompartment(
            ChangeMountTargetCompartmentRequest request) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");
        Objects.requireNonNull(
                request.getChangeMountTargetCompartmentDetails(),
                "changeMountTargetCompartmentDetails is required");

        return clientCall(request, ChangeMountTargetCompartmentResponse::builder)
                .logger(LOG, "changeMountTargetCompartment")
                .serviceDetails(
                        "FileStorage",
                        "ChangeMountTargetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/ChangeMountTargetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMountTargetCompartmentRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendPathParam(request.getMountTargetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMountTargetCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeReplicationCompartmentResponse changeReplicationCompartment(
            ChangeReplicationCompartmentRequest request) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");
        Objects.requireNonNull(
                request.getChangeReplicationCompartmentDetails(),
                "changeReplicationCompartmentDetails is required");

        return clientCall(request, ChangeReplicationCompartmentResponse::builder)
                .logger(LOG, "changeReplicationCompartment")
                .serviceDetails(
                        "FileStorage",
                        "ChangeReplicationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/ChangeReplicationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeReplicationCompartmentRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replications")
                .appendPathParam(request.getReplicationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeReplicationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateExportResponse createExport(CreateExportRequest request) {
        Objects.requireNonNull(request.getCreateExportDetails(), "createExportDetails is required");

        return clientCall(request, CreateExportResponse::builder)
                .logger(LOG, "createExport")
                .serviceDetails(
                        "FileStorage",
                        "CreateExport",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Export/CreateExport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExportRequest::builder)
                .basePath("/20171215")
                .appendPathParam("exports")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Export.class,
                        CreateExportResponse.Builder::export)
                .handleResponseHeaderString("etag", CreateExportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateExportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request) {
        Objects.requireNonNull(
                request.getCreateFileSystemDetails(), "createFileSystemDetails is required");

        return clientCall(request, CreateFileSystemResponse::builder)
                .logger(LOG, "createFileSystem")
                .serviceDetails(
                        "FileStorage",
                        "CreateFileSystem",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/CreateFileSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFileSystemRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.FileSystem.class,
                        CreateFileSystemResponse.Builder::fileSystem)
                .handleResponseHeaderString("etag", CreateFileSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFileSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateMountTargetResponse createMountTarget(CreateMountTargetRequest request) {
        Objects.requireNonNull(
                request.getCreateMountTargetDetails(), "createMountTargetDetails is required");

        return clientCall(request, CreateMountTargetResponse::builder)
                .logger(LOG, "createMountTarget")
                .serviceDetails(
                        "FileStorage",
                        "CreateMountTarget",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/CreateMountTarget")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMountTargetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.MountTarget.class,
                        CreateMountTargetResponse.Builder::mountTarget)
                .handleResponseHeaderString("etag", CreateMountTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMountTargetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateReplicationResponse createReplication(CreateReplicationRequest request) {
        Objects.requireNonNull(
                request.getCreateReplicationDetails(), "createReplicationDetails is required");

        return clientCall(request, CreateReplicationResponse::builder)
                .logger(LOG, "createReplication")
                .serviceDetails(
                        "FileStorage",
                        "CreateReplication",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/CreateReplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateReplicationRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replications")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Replication.class,
                        CreateReplicationResponse.Builder::replication)
                .handleResponseHeaderString("etag", CreateReplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateReplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        Objects.requireNonNull(
                request.getCreateSnapshotDetails(), "createSnapshotDetails is required");

        return clientCall(request, CreateSnapshotResponse::builder)
                .logger(LOG, "createSnapshot")
                .serviceDetails(
                        "FileStorage",
                        "CreateSnapshot",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Snapshot/CreateSnapshot")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSnapshotRequest::builder)
                .basePath("/20171215")
                .appendPathParam("snapshots")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Snapshot.class,
                        CreateSnapshotResponse.Builder::snapshot)
                .handleResponseHeaderString("etag", CreateSnapshotResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSnapshotResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteExportResponse deleteExport(DeleteExportRequest request) {

        Validate.notBlank(request.getExportId(), "exportId must not be blank");

        return clientCall(request, DeleteExportResponse::builder)
                .logger(LOG, "deleteExport")
                .serviceDetails(
                        "FileStorage",
                        "DeleteExport",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Export/DeleteExport")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExportRequest::builder)
                .basePath("/20171215")
                .appendPathParam("exports")
                .appendPathParam(request.getExportId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteExportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFileSystemResponse deleteFileSystem(DeleteFileSystemRequest request) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        return clientCall(request, DeleteFileSystemResponse::builder)
                .logger(LOG, "deleteFileSystem")
                .serviceDetails(
                        "FileStorage",
                        "DeleteFileSystem",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/DeleteFileSystem")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFileSystemRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFileSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMountTargetResponse deleteMountTarget(DeleteMountTargetRequest request) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");

        return clientCall(request, DeleteMountTargetResponse::builder)
                .logger(LOG, "deleteMountTarget")
                .serviceDetails(
                        "FileStorage",
                        "DeleteMountTarget",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/DeleteMountTarget")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMountTargetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendPathParam(request.getMountTargetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMountTargetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteReplicationResponse deleteReplication(DeleteReplicationRequest request) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");

        return clientCall(request, DeleteReplicationResponse::builder)
                .logger(LOG, "deleteReplication")
                .serviceDetails(
                        "FileStorage",
                        "DeleteReplication",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/DeleteReplication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteReplicationRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replications")
                .appendPathParam(request.getReplicationId())
                .appendEnumQueryParam("deleteMode", request.getDeleteMode())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteReplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteReplicationTargetResponse deleteReplicationTarget(
            DeleteReplicationTargetRequest request) {

        Validate.notBlank(
                request.getReplicationTargetId(), "replicationTargetId must not be blank");

        return clientCall(request, DeleteReplicationTargetResponse::builder)
                .logger(LOG, "deleteReplicationTarget")
                .serviceDetails(
                        "FileStorage",
                        "DeleteReplicationTarget",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ReplicationTarget/DeleteReplicationTarget")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteReplicationTargetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replicationTargets")
                .appendPathParam(request.getReplicationTargetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteReplicationTargetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) {

        Validate.notBlank(request.getSnapshotId(), "snapshotId must not be blank");

        return clientCall(request, DeleteSnapshotResponse::builder)
                .logger(LOG, "deleteSnapshot")
                .serviceDetails(
                        "FileStorage",
                        "DeleteSnapshot",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Snapshot/DeleteSnapshot")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSnapshotRequest::builder)
                .basePath("/20171215")
                .appendPathParam("snapshots")
                .appendPathParam(request.getSnapshotId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSnapshotResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EstimateReplicationResponse estimateReplication(EstimateReplicationRequest request) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        return clientCall(request, EstimateReplicationResponse::builder)
                .logger(LOG, "estimateReplication")
                .serviceDetails(
                        "FileStorage",
                        "EstimateReplication",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/EstimateReplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EstimateReplicationRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("actions")
                .appendPathParam("estimateReplication")
                .appendQueryParam("changeRateInMBps", request.getChangeRateInMBps())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.ReplicationEstimate.class,
                        EstimateReplicationResponse.Builder::replicationEstimate)
                .handleResponseHeaderString("etag", EstimateReplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", EstimateReplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExportResponse getExport(GetExportRequest request) {

        Validate.notBlank(request.getExportId(), "exportId must not be blank");

        return clientCall(request, GetExportResponse::builder)
                .logger(LOG, "getExport")
                .serviceDetails(
                        "FileStorage",
                        "GetExport",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Export/GetExport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExportRequest::builder)
                .basePath("/20171215")
                .appendPathParam("exports")
                .appendPathParam(request.getExportId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.Export.class,
                        GetExportResponse.Builder::export)
                .handleResponseHeaderString("etag", GetExportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExportSetResponse getExportSet(GetExportSetRequest request) {

        Validate.notBlank(request.getExportSetId(), "exportSetId must not be blank");

        return clientCall(request, GetExportSetResponse::builder)
                .logger(LOG, "getExportSet")
                .serviceDetails(
                        "FileStorage",
                        "GetExportSet",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ExportSet/GetExportSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExportSetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("exportSets")
                .appendPathParam(request.getExportSetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.ExportSet.class,
                        GetExportSetResponse.Builder::exportSet)
                .handleResponseHeaderString("etag", GetExportSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExportSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFileSystemResponse getFileSystem(GetFileSystemRequest request) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        return clientCall(request, GetFileSystemResponse::builder)
                .logger(LOG, "getFileSystem")
                .serviceDetails(
                        "FileStorage",
                        "GetFileSystem",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/GetFileSystem")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFileSystemRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.FileSystem.class,
                        GetFileSystemResponse.Builder::fileSystem)
                .handleResponseHeaderString("etag", GetFileSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFileSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMountTargetResponse getMountTarget(GetMountTargetRequest request) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");

        return clientCall(request, GetMountTargetResponse::builder)
                .logger(LOG, "getMountTarget")
                .serviceDetails(
                        "FileStorage",
                        "GetMountTarget",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/GetMountTarget")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMountTargetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendPathParam(request.getMountTargetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.MountTarget.class,
                        GetMountTargetResponse.Builder::mountTarget)
                .handleResponseHeaderString("etag", GetMountTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMountTargetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetReplicationResponse getReplication(GetReplicationRequest request) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");

        return clientCall(request, GetReplicationResponse::builder)
                .logger(LOG, "getReplication")
                .serviceDetails(
                        "FileStorage",
                        "GetReplication",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/GetReplication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReplicationRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replications")
                .appendPathParam(request.getReplicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.Replication.class,
                        GetReplicationResponse.Builder::replication)
                .handleResponseHeaderString("etag", GetReplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetReplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetReplicationTargetResponse getReplicationTarget(GetReplicationTargetRequest request) {

        Validate.notBlank(
                request.getReplicationTargetId(), "replicationTargetId must not be blank");

        return clientCall(request, GetReplicationTargetResponse::builder)
                .logger(LOG, "getReplicationTarget")
                .serviceDetails(
                        "FileStorage",
                        "GetReplicationTarget",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ReplicationTarget/GetReplicationTarget")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReplicationTargetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replicationTargets")
                .appendPathParam(request.getReplicationTargetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.ReplicationTarget.class,
                        GetReplicationTargetResponse.Builder::replicationTarget)
                .handleResponseHeaderString("etag", GetReplicationTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetReplicationTargetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSnapshotResponse getSnapshot(GetSnapshotRequest request) {

        Validate.notBlank(request.getSnapshotId(), "snapshotId must not be blank");

        return clientCall(request, GetSnapshotResponse::builder)
                .logger(LOG, "getSnapshot")
                .serviceDetails(
                        "FileStorage",
                        "GetSnapshot",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Snapshot/GetSnapshot")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSnapshotRequest::builder)
                .basePath("/20171215")
                .appendPathParam("snapshots")
                .appendPathParam(request.getSnapshotId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.Snapshot.class,
                        GetSnapshotResponse.Builder::snapshot)
                .handleResponseHeaderString("etag", GetSnapshotResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSnapshotResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListExportSetsResponse listExportSets(ListExportSetsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        return clientCall(request, ListExportSetsResponse::builder)
                .logger(LOG, "listExportSets")
                .serviceDetails(
                        "FileStorage",
                        "ListExportSets",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ExportSetSummary/ListExportSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExportSetsRequest::builder)
                .basePath("/20171215")
                .appendPathParam("exportSets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.filestorage.model.ExportSetSummary.class,
                        ListExportSetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListExportSetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListExportSetsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListExportsResponse listExports(ListExportsRequest request) {

        return clientCall(request, ListExportsResponse::builder)
                .logger(LOG, "listExports")
                .serviceDetails(
                        "FileStorage",
                        "ListExports",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ExportSummary/ListExports")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExportsRequest::builder)
                .basePath("/20171215")
                .appendPathParam("exports")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("exportSetId", request.getExportSetId())
                .appendQueryParam("fileSystemId", request.getFileSystemId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.filestorage.model.ExportSummary.class,
                        ListExportsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListExportsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListExportsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListFileSystemsResponse listFileSystems(ListFileSystemsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        return clientCall(request, ListFileSystemsResponse::builder)
                .logger(LOG, "listFileSystems")
                .serviceDetails(
                        "FileStorage",
                        "ListFileSystems",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystemSummary/ListFileSystems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFileSystemsRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("sourceSnapshotId", request.getSourceSnapshotId())
                .appendQueryParam("parentFileSystemId", request.getParentFileSystemId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.filestorage.model.FileSystemSummary.class,
                        ListFileSystemsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListFileSystemsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListFileSystemsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListMountTargetsResponse listMountTargets(ListMountTargetsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        return clientCall(request, ListMountTargetsResponse::builder)
                .logger(LOG, "listMountTargets")
                .serviceDetails(
                        "FileStorage",
                        "ListMountTargets",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTargetSummary/ListMountTargets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMountTargetsRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("exportSetId", request.getExportSetId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.filestorage.model.MountTargetSummary.class,
                        ListMountTargetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListMountTargetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListMountTargetsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListReplicationTargetsResponse listReplicationTargets(
            ListReplicationTargetsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        return clientCall(request, ListReplicationTargetsResponse::builder)
                .logger(LOG, "listReplicationTargets")
                .serviceDetails(
                        "FileStorage",
                        "ListReplicationTargets",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ReplicationTargetSummary/ListReplicationTargets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReplicationTargetsRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replicationTargets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.filestorage.model.ReplicationTargetSummary.class,
                        ListReplicationTargetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListReplicationTargetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListReplicationTargetsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListReplicationsResponse listReplications(ListReplicationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        return clientCall(request, ListReplicationsResponse::builder)
                .logger(LOG, "listReplications")
                .serviceDetails(
                        "FileStorage",
                        "ListReplications",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ReplicationSummary/ListReplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReplicationsRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replications")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("fileSystemId", request.getFileSystemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.filestorage.model.ReplicationSummary.class,
                        ListReplicationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListReplicationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListReplicationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        Objects.requireNonNull(request.getFileSystemId(), "fileSystemId is required");

        return clientCall(request, ListSnapshotsResponse::builder)
                .logger(LOG, "listSnapshots")
                .serviceDetails(
                        "FileStorage",
                        "ListSnapshots",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/SnapshotSummary/ListSnapshots")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSnapshotsRequest::builder)
                .basePath("/20171215")
                .appendPathParam("snapshots")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("fileSystemId", request.getFileSystemId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.filestorage.model.SnapshotSummary.class,
                        ListSnapshotsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListSnapshotsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSnapshotsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateExportResponse updateExport(UpdateExportRequest request) {

        Validate.notBlank(request.getExportId(), "exportId must not be blank");
        Objects.requireNonNull(request.getUpdateExportDetails(), "updateExportDetails is required");

        return clientCall(request, UpdateExportResponse::builder)
                .logger(LOG, "updateExport")
                .serviceDetails(
                        "FileStorage",
                        "UpdateExport",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Export/UpdateExport")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExportRequest::builder)
                .basePath("/20171215")
                .appendPathParam("exports")
                .appendPathParam(request.getExportId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Export.class,
                        UpdateExportResponse.Builder::export)
                .handleResponseHeaderString("etag", UpdateExportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateExportSetResponse updateExportSet(UpdateExportSetRequest request) {

        Validate.notBlank(request.getExportSetId(), "exportSetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExportSetDetails(), "updateExportSetDetails is required");

        return clientCall(request, UpdateExportSetResponse::builder)
                .logger(LOG, "updateExportSet")
                .serviceDetails(
                        "FileStorage",
                        "UpdateExportSet",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ExportSet/UpdateExportSet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExportSetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("exportSets")
                .appendPathParam(request.getExportSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.ExportSet.class,
                        UpdateExportSetResponse.Builder::exportSet)
                .handleResponseHeaderString("etag", UpdateExportSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExportSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFileSystemResponse updateFileSystem(UpdateFileSystemRequest request) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFileSystemDetails(), "updateFileSystemDetails is required");

        return clientCall(request, UpdateFileSystemResponse::builder)
                .logger(LOG, "updateFileSystem")
                .serviceDetails(
                        "FileStorage",
                        "UpdateFileSystem",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/UpdateFileSystem")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFileSystemRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.FileSystem.class,
                        UpdateFileSystemResponse.Builder::fileSystem)
                .handleResponseHeaderString("etag", UpdateFileSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFileSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateMountTargetResponse updateMountTarget(UpdateMountTargetRequest request) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMountTargetDetails(), "updateMountTargetDetails is required");

        return clientCall(request, UpdateMountTargetResponse::builder)
                .logger(LOG, "updateMountTarget")
                .serviceDetails(
                        "FileStorage",
                        "UpdateMountTarget",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/UpdateMountTarget")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMountTargetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendPathParam(request.getMountTargetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.MountTarget.class,
                        UpdateMountTargetResponse.Builder::mountTarget)
                .handleResponseHeaderString("etag", UpdateMountTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMountTargetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateReplicationResponse updateReplication(UpdateReplicationRequest request) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateReplicationDetails(), "updateReplicationDetails is required");

        return clientCall(request, UpdateReplicationResponse::builder)
                .logger(LOG, "updateReplication")
                .serviceDetails(
                        "FileStorage",
                        "UpdateReplication",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/UpdateReplication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateReplicationRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replications")
                .appendPathParam(request.getReplicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Replication.class,
                        UpdateReplicationResponse.Builder::replication)
                .handleResponseHeaderString("etag", UpdateReplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateReplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateSnapshotResponse updateSnapshot(UpdateSnapshotRequest request) {

        Validate.notBlank(request.getSnapshotId(), "snapshotId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSnapshotDetails(), "updateSnapshotDetails is required");

        return clientCall(request, UpdateSnapshotResponse::builder)
                .logger(LOG, "updateSnapshot")
                .serviceDetails(
                        "FileStorage",
                        "UpdateSnapshot",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Snapshot/UpdateSnapshot")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSnapshotRequest::builder)
                .basePath("/20171215")
                .appendPathParam("snapshots")
                .appendPathParam(request.getSnapshotId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Snapshot.class,
                        UpdateSnapshotResponse.Builder::snapshot)
                .handleResponseHeaderString("etag", UpdateSnapshotResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSnapshotResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public FileStorageWaiters getWaiters() {
        return waiters;
    }

    @Override
    public FileStoragePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FileStorageClient(
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
    public FileStorageClient(
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
    public FileStorageClient(
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
    public FileStorageClient(
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
    public FileStorageClient(
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
    public FileStorageClient(
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
    public FileStorageClient(
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
    public FileStorageClient(
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
