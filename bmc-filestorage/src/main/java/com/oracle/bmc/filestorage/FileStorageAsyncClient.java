/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;

import java.util.Objects;

/**
 * Async client implementation for FileStorage service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class FileStorageAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements FileStorageAsync {
    /** Service instance for FileStorage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FILESTORAGE")
                    .serviceEndpointPrefix("filestorage")
                    .serviceEndpointTemplate(
                            "https://filestorage.{region}.{dualStack?ds.:}oci.{secondLevelDomain}")
                    .endpointServiceName("filestorage")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FileStorageAsyncClient.class);

    FileStorageAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, FileStorageAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "filestorage";
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
        public FileStorageAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FileStorageAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddExportLockResponse> addExportLock(
            AddExportLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddExportLockRequest, AddExportLockResponse>
                    handler) {

        Validate.notBlank(request.getExportId(), "exportId must not be blank");
        Objects.requireNonNull(
                request.getAddExportLockDetails(), "addExportLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("exportId", request.getExportId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, AddExportLockResponse::builder)
                .logger(LOG, "addExportLock")
                .serviceDetails(
                        "FileStorage",
                        "AddExportLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Export/AddExportLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddExportLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("exports")
                .appendPathParam(request.getExportId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Export.class,
                        AddExportLockResponse.Builder::export)
                .handleResponseHeaderString("etag", AddExportLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddExportLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddFileSystemLockResponse> addFileSystemLock(
            AddFileSystemLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddFileSystemLockRequest, AddFileSystemLockResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");
        Objects.requireNonNull(
                request.getAddFileSystemLockDetails(), "addFileSystemLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, AddFileSystemLockResponse::builder)
                .logger(LOG, "addFileSystemLock")
                .serviceDetails(
                        "FileStorage",
                        "AddFileSystemLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/AddFileSystemLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddFileSystemLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.FileSystem.class,
                        AddFileSystemLockResponse.Builder::fileSystem)
                .handleResponseHeaderString("etag", AddFileSystemLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddFileSystemLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddFilesystemSnapshotPolicyLockResponse>
            addFilesystemSnapshotPolicyLock(
                    AddFilesystemSnapshotPolicyLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddFilesystemSnapshotPolicyLockRequest,
                                    AddFilesystemSnapshotPolicyLockResponse>
                            handler) {

        Validate.notBlank(
                request.getFilesystemSnapshotPolicyId(),
                "filesystemSnapshotPolicyId must not be blank");
        Objects.requireNonNull(
                request.getAddFilesystemSnapshotPolicyLockDetails(),
                "addFilesystemSnapshotPolicyLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "filesystemSnapshotPolicyId", request.getFilesystemSnapshotPolicyId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, AddFilesystemSnapshotPolicyLockResponse::builder)
                .logger(LOG, "addFilesystemSnapshotPolicyLock")
                .serviceDetails(
                        "FileStorage",
                        "AddFilesystemSnapshotPolicyLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/AddFilesystemSnapshotPolicyLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddFilesystemSnapshotPolicyLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("filesystemSnapshotPolicies")
                .appendPathParam(request.getFilesystemSnapshotPolicyId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy.class,
                        AddFilesystemSnapshotPolicyLockResponse.Builder::filesystemSnapshotPolicy)
                .handleResponseHeaderString(
                        "etag", AddFilesystemSnapshotPolicyLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddFilesystemSnapshotPolicyLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddMountTargetLockResponse> addMountTargetLock(
            AddMountTargetLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMountTargetLockRequest, AddMountTargetLockResponse>
                    handler) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");
        Objects.requireNonNull(
                request.getAddMountTargetLockDetails(), "addMountTargetLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("mountTargetId", request.getMountTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, AddMountTargetLockResponse::builder)
                .logger(LOG, "addMountTargetLock")
                .serviceDetails(
                        "FileStorage",
                        "AddMountTargetLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/AddMountTargetLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddMountTargetLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendPathParam(request.getMountTargetId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.MountTarget.class,
                        AddMountTargetLockResponse.Builder::mountTarget)
                .handleResponseHeaderString("etag", AddMountTargetLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddMountTargetLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddOutboundConnectorLockResponse> addOutboundConnectorLock(
            AddOutboundConnectorLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddOutboundConnectorLockRequest, AddOutboundConnectorLockResponse>
                    handler) {

        Validate.notBlank(
                request.getOutboundConnectorId(), "outboundConnectorId must not be blank");
        Objects.requireNonNull(
                request.getAddOutboundConnectorLockDetails(),
                "addOutboundConnectorLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("outboundConnectorId", request.getOutboundConnectorId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, AddOutboundConnectorLockResponse::builder)
                .logger(LOG, "addOutboundConnectorLock")
                .serviceDetails(
                        "FileStorage",
                        "AddOutboundConnectorLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/OutboundConnector/AddOutboundConnectorLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddOutboundConnectorLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("outboundConnectors")
                .appendPathParam(request.getOutboundConnectorId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.OutboundConnector.class,
                        AddOutboundConnectorLockResponse.Builder::outboundConnector)
                .handleResponseHeaderString("etag", AddOutboundConnectorLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddOutboundConnectorLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddReplicationLockResponse> addReplicationLock(
            AddReplicationLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddReplicationLockRequest, AddReplicationLockResponse>
                    handler) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");
        Objects.requireNonNull(
                request.getAddReplicationLockDetails(), "addReplicationLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("replicationId", request.getReplicationId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, AddReplicationLockResponse::builder)
                .logger(LOG, "addReplicationLock")
                .serviceDetails(
                        "FileStorage",
                        "AddReplicationLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/AddReplicationLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddReplicationLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replications")
                .appendPathParam(request.getReplicationId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Replication.class,
                        AddReplicationLockResponse.Builder::replication)
                .handleResponseHeaderString("etag", AddReplicationLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddReplicationLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddSnapshotLockResponse> addSnapshotLock(
            AddSnapshotLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddSnapshotLockRequest, AddSnapshotLockResponse>
                    handler) {

        Validate.notBlank(request.getSnapshotId(), "snapshotId must not be blank");
        Objects.requireNonNull(
                request.getAddSnapshotLockDetails(), "addSnapshotLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("snapshotId", request.getSnapshotId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, AddSnapshotLockResponse::builder)
                .logger(LOG, "addSnapshotLock")
                .serviceDetails(
                        "FileStorage",
                        "AddSnapshotLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Snapshot/AddSnapshotLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddSnapshotLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("snapshots")
                .appendPathParam(request.getSnapshotId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Snapshot.class,
                        AddSnapshotLockResponse.Builder::snapshot)
                .handleResponseHeaderString("etag", AddSnapshotLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddSnapshotLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelDowngradeShapeMountTargetResponse>
            cancelDowngradeShapeMountTarget(
                    CancelDowngradeShapeMountTargetRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelDowngradeShapeMountTargetRequest,
                                    CancelDowngradeShapeMountTargetResponse>
                            handler) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("mountTargetId", request.getMountTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CancelDowngradeShapeMountTargetResponse::builder)
                .logger(LOG, "cancelDowngradeShapeMountTarget")
                .serviceDetails(
                        "FileStorage",
                        "CancelDowngradeShapeMountTarget",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/CancelDowngradeShapeMountTarget")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelDowngradeShapeMountTargetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendPathParam(request.getMountTargetId())
                .appendPathParam("actions")
                .appendPathParam("cancelShapeDowngrade")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.MountTarget.class,
                        CancelDowngradeShapeMountTargetResponse.Builder::mountTarget)
                .handleResponseHeaderString(
                        "etag", CancelDowngradeShapeMountTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelDowngradeShapeMountTargetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeFileSystemCompartmentResponse>
            changeFileSystemCompartment(
                    ChangeFileSystemCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFileSystemCompartmentRequest,
                                    ChangeFileSystemCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");
        Objects.requireNonNull(
                request.getChangeFileSystemCompartmentDetails(),
                "changeFileSystemCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeFileSystemCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeFilesystemSnapshotPolicyCompartmentResponse>
            changeFilesystemSnapshotPolicyCompartment(
                    ChangeFilesystemSnapshotPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFilesystemSnapshotPolicyCompartmentRequest,
                                    ChangeFilesystemSnapshotPolicyCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getFilesystemSnapshotPolicyId(),
                "filesystemSnapshotPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeFilesystemSnapshotPolicyCompartmentDetails(),
                "changeFilesystemSnapshotPolicyCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "filesystemSnapshotPolicyId", request.getFilesystemSnapshotPolicyId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ChangeFilesystemSnapshotPolicyCompartmentResponse::builder)
                .logger(LOG, "changeFilesystemSnapshotPolicyCompartment")
                .serviceDetails(
                        "FileStorage",
                        "ChangeFilesystemSnapshotPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/ChangeFilesystemSnapshotPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeFilesystemSnapshotPolicyCompartmentRequest::builder)
                .basePath("/20171215")
                .appendPathParam("filesystemSnapshotPolicies")
                .appendPathParam(request.getFilesystemSnapshotPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeFilesystemSnapshotPolicyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMountTargetCompartmentResponse>
            changeMountTargetCompartment(
                    ChangeMountTargetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMountTargetCompartmentRequest,
                                    ChangeMountTargetCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");
        Objects.requireNonNull(
                request.getChangeMountTargetCompartmentDetails(),
                "changeMountTargetCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("mountTargetId", request.getMountTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMountTargetCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeOutboundConnectorCompartmentResponse>
            changeOutboundConnectorCompartment(
                    ChangeOutboundConnectorCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOutboundConnectorCompartmentRequest,
                                    ChangeOutboundConnectorCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOutboundConnectorId(), "outboundConnectorId must not be blank");
        Objects.requireNonNull(
                request.getChangeOutboundConnectorCompartmentDetails(),
                "changeOutboundConnectorCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("outboundConnectorId", request.getOutboundConnectorId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ChangeOutboundConnectorCompartmentResponse::builder)
                .logger(LOG, "changeOutboundConnectorCompartment")
                .serviceDetails(
                        "FileStorage",
                        "ChangeOutboundConnectorCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/OutboundConnector/ChangeOutboundConnectorCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOutboundConnectorCompartmentRequest::builder)
                .basePath("/20171215")
                .appendPathParam("outboundConnectors")
                .appendPathParam(request.getOutboundConnectorId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOutboundConnectorCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeReplicationCompartmentResponse>
            changeReplicationCompartment(
                    ChangeReplicationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeReplicationCompartmentRequest,
                                    ChangeReplicationCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");
        Objects.requireNonNull(
                request.getChangeReplicationCompartmentDetails(),
                "changeReplicationCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("replicationId", request.getReplicationId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeReplicationCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExportResponse> createExport(
            CreateExportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateExportRequest, CreateExportResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateExportDetails(), "createExportDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResponse> createFileSystem(
            CreateFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFileSystemRequest, CreateFileSystemResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateFileSystemDetails(), "createFileSystemDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFilesystemSnapshotPolicyResponse>
            createFilesystemSnapshotPolicy(
                    CreateFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateFilesystemSnapshotPolicyRequest,
                                    CreateFilesystemSnapshotPolicyResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateFilesystemSnapshotPolicyDetails(),
                "createFilesystemSnapshotPolicyDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CreateFilesystemSnapshotPolicyResponse::builder)
                .logger(LOG, "createFilesystemSnapshotPolicy")
                .serviceDetails(
                        "FileStorage",
                        "CreateFilesystemSnapshotPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/CreateFilesystemSnapshotPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFilesystemSnapshotPolicyRequest::builder)
                .basePath("/20171215")
                .appendPathParam("filesystemSnapshotPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy.class,
                        CreateFilesystemSnapshotPolicyResponse.Builder::filesystemSnapshotPolicy)
                .handleResponseHeaderString(
                        "etag", CreateFilesystemSnapshotPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateFilesystemSnapshotPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMountTargetResponse> createMountTarget(
            CreateMountTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMountTargetRequest, CreateMountTargetResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateMountTargetDetails(), "createMountTargetDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOutboundConnectorResponse> createOutboundConnector(
            CreateOutboundConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOutboundConnectorRequest, CreateOutboundConnectorResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOutboundConnectorDetails(),
                "createOutboundConnectorDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CreateOutboundConnectorResponse::builder)
                .logger(LOG, "createOutboundConnector")
                .serviceDetails(
                        "FileStorage",
                        "CreateOutboundConnector",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/OutboundConnector/CreateOutboundConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOutboundConnectorRequest::builder)
                .basePath("/20171215")
                .appendPathParam("outboundConnectors")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.OutboundConnector.class,
                        CreateOutboundConnectorResponse.Builder::outboundConnector)
                .handleResponseHeaderString("etag", CreateOutboundConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOutboundConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateQuotaRuleResponse> createQuotaRule(
            CreateQuotaRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateQuotaRuleRequest, CreateQuotaRuleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateQuotaRuleDetails(), "createQuotaRuleDetails is required");

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CreateQuotaRuleResponse::builder)
                .logger(LOG, "createQuotaRule")
                .serviceDetails(
                        "FileStorage",
                        "CreateQuotaRule",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/CreateQuotaRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateQuotaRuleRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("quotaRules")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.QuotaRule.class,
                        CreateQuotaRuleResponse.Builder::quotaRule)
                .handleResponseHeaderString("etag", CreateQuotaRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateQuotaRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationResponse> createReplication(
            CreateReplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateReplicationRequest, CreateReplicationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateReplicationDetails(), "createReplicationDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResponse> createSnapshot(
            CreateSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSnapshotRequest, CreateSnapshotResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSnapshotDetails(), "createSnapshotDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExportResponse> deleteExport(
            DeleteExportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteExportRequest, DeleteExportResponse>
                    handler) {

        Validate.notBlank(request.getExportId(), "exportId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("exportId", request.getExportId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteExportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemResponse> deleteFileSystem(
            DeleteFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFileSystemRequest, DeleteFileSystemResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .appendQueryParam("canDetachChildFileSystem", request.getCanDetachChildFileSystem())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFileSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFilesystemSnapshotPolicyResponse>
            deleteFilesystemSnapshotPolicy(
                    DeleteFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteFilesystemSnapshotPolicyRequest,
                                    DeleteFilesystemSnapshotPolicyResponse>
                            handler) {

        Validate.notBlank(
                request.getFilesystemSnapshotPolicyId(),
                "filesystemSnapshotPolicyId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "filesystemSnapshotPolicyId", request.getFilesystemSnapshotPolicyId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, DeleteFilesystemSnapshotPolicyResponse::builder)
                .logger(LOG, "deleteFilesystemSnapshotPolicy")
                .serviceDetails(
                        "FileStorage",
                        "DeleteFilesystemSnapshotPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/DeleteFilesystemSnapshotPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFilesystemSnapshotPolicyRequest::builder)
                .basePath("/20171215")
                .appendPathParam("filesystemSnapshotPolicies")
                .appendPathParam(request.getFilesystemSnapshotPolicyId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteFilesystemSnapshotPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMountTargetResponse> deleteMountTarget(
            DeleteMountTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMountTargetRequest, DeleteMountTargetResponse>
                    handler) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("mountTargetId", request.getMountTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMountTargetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOutboundConnectorResponse> deleteOutboundConnector(
            DeleteOutboundConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOutboundConnectorRequest, DeleteOutboundConnectorResponse>
                    handler) {

        Validate.notBlank(
                request.getOutboundConnectorId(), "outboundConnectorId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("outboundConnectorId", request.getOutboundConnectorId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, DeleteOutboundConnectorResponse::builder)
                .logger(LOG, "deleteOutboundConnector")
                .serviceDetails(
                        "FileStorage",
                        "DeleteOutboundConnector",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/OutboundConnector/DeleteOutboundConnector")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOutboundConnectorRequest::builder)
                .basePath("/20171215")
                .appendPathParam("outboundConnectors")
                .appendPathParam(request.getOutboundConnectorId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOutboundConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteQuotaRuleResponse> deleteQuotaRule(
            DeleteQuotaRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteQuotaRuleRequest, DeleteQuotaRuleResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        Validate.notBlank(request.getQuotaRuleId(), "quotaRuleId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        requiredParametersMap.put("quotaRuleId", request.getQuotaRuleId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, DeleteQuotaRuleResponse::builder)
                .logger(LOG, "deleteQuotaRule")
                .serviceDetails(
                        "FileStorage",
                        "DeleteQuotaRule",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/DeleteQuotaRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteQuotaRuleRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("quotaRules")
                .appendPathParam(request.getQuotaRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteQuotaRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationResponse> deleteReplication(
            DeleteReplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteReplicationRequest, DeleteReplicationResponse>
                    handler) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("replicationId", request.getReplicationId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteReplicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationTargetResponse> deleteReplicationTarget(
            DeleteReplicationTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteReplicationTargetRequest, DeleteReplicationTargetResponse>
                    handler) {

        Validate.notBlank(
                request.getReplicationTargetId(), "replicationTargetId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("replicationTargetId", request.getReplicationTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteReplicationTargetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResponse> deleteSnapshot(
            DeleteSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSnapshotRequest, DeleteSnapshotResponse>
                    handler) {

        Validate.notBlank(request.getSnapshotId(), "snapshotId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("snapshotId", request.getSnapshotId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSnapshotResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachCloneResponse> detachClone(
            DetachCloneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DetachCloneRequest, DetachCloneResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, DetachCloneResponse::builder)
                .logger(LOG, "detachClone")
                .serviceDetails(
                        "FileStorage",
                        "DetachClone",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/DetachClone")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachCloneRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("actions")
                .appendPathParam("detachClone")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DetachCloneResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EstimateReplicationResponse> estimateReplication(
            EstimateReplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EstimateReplicationRequest, EstimateReplicationResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExportResponse> getExport(
            GetExportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetExportRequest, GetExportResponse>
                    handler) {

        Validate.notBlank(request.getExportId(), "exportId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("exportId", request.getExportId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExportSetResponse> getExportSet(
            GetExportSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetExportSetRequest, GetExportSetResponse>
                    handler) {

        Validate.notBlank(request.getExportSetId(), "exportSetId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("exportSetId", request.getExportSetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFileSystemResponse> getFileSystem(
            GetFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFileSystemRequest, GetFileSystemResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFilesystemSnapshotPolicyResponse>
            getFilesystemSnapshotPolicy(
                    GetFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFilesystemSnapshotPolicyRequest,
                                    GetFilesystemSnapshotPolicyResponse>
                            handler) {

        Validate.notBlank(
                request.getFilesystemSnapshotPolicyId(),
                "filesystemSnapshotPolicyId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "filesystemSnapshotPolicyId", request.getFilesystemSnapshotPolicyId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetFilesystemSnapshotPolicyResponse::builder)
                .logger(LOG, "getFilesystemSnapshotPolicy")
                .serviceDetails(
                        "FileStorage",
                        "GetFilesystemSnapshotPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/GetFilesystemSnapshotPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFilesystemSnapshotPolicyRequest::builder)
                .basePath("/20171215")
                .appendPathParam("filesystemSnapshotPolicies")
                .appendPathParam(request.getFilesystemSnapshotPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy.class,
                        GetFilesystemSnapshotPolicyResponse.Builder::filesystemSnapshotPolicy)
                .handleResponseHeaderString(
                        "etag", GetFilesystemSnapshotPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFilesystemSnapshotPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMountTargetResponse> getMountTarget(
            GetMountTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMountTargetRequest, GetMountTargetResponse>
                    handler) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("mountTargetId", request.getMountTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOutboundConnectorResponse> getOutboundConnector(
            GetOutboundConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOutboundConnectorRequest, GetOutboundConnectorResponse>
                    handler) {

        Validate.notBlank(
                request.getOutboundConnectorId(), "outboundConnectorId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("outboundConnectorId", request.getOutboundConnectorId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetOutboundConnectorResponse::builder)
                .logger(LOG, "getOutboundConnector")
                .serviceDetails(
                        "FileStorage",
                        "GetOutboundConnector",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/OutboundConnector/GetOutboundConnector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOutboundConnectorRequest::builder)
                .basePath("/20171215")
                .appendPathParam("outboundConnectors")
                .appendPathParam(request.getOutboundConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.OutboundConnector.class,
                        GetOutboundConnectorResponse.Builder::outboundConnector)
                .handleResponseHeaderString("etag", GetOutboundConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOutboundConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetQuotaRuleResponse> getQuotaRule(
            GetQuotaRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetQuotaRuleRequest, GetQuotaRuleResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        Validate.notBlank(request.getQuotaRuleId(), "quotaRuleId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        requiredParametersMap.put("quotaRuleId", request.getQuotaRuleId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetQuotaRuleResponse::builder)
                .logger(LOG, "getQuotaRule")
                .serviceDetails(
                        "FileStorage",
                        "GetQuotaRule",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/GetQuotaRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetQuotaRuleRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("quotaRules")
                .appendPathParam(request.getQuotaRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.QuotaRule.class,
                        GetQuotaRuleResponse.Builder::quotaRule)
                .handleResponseHeaderString("etag", GetQuotaRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetQuotaRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationResponse> getReplication(
            GetReplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationRequest, GetReplicationResponse>
                    handler) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("replicationId", request.getReplicationId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationTargetResponse> getReplicationTarget(
            GetReplicationTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationTargetRequest, GetReplicationTargetResponse>
                    handler) {

        Validate.notBlank(
                request.getReplicationTargetId(), "replicationTargetId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("replicationTargetId", request.getReplicationTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotResponse> getSnapshot(
            GetSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSnapshotRequest, GetSnapshotResponse>
                    handler) {

        Validate.notBlank(request.getSnapshotId(), "snapshotId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("snapshotId", request.getSnapshotId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExportSetsResponse> listExportSets(
            ListExportSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExportSetsRequest, ListExportSetsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());
        requiredParametersMap.put("availabilityDomain", request.getAvailabilityDomain());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExportsResponse> listExports(
            ListExportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListExportsRequest, ListExportsResponse>
                    handler) {

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFileSystemsResponse> listFileSystems(
            ListFileSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFileSystemsRequest, ListFileSystemsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());
        requiredParametersMap.put("availabilityDomain", request.getAvailabilityDomain());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam(
                        "filesystemSnapshotPolicyId", request.getFilesystemSnapshotPolicyId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFilesystemSnapshotPoliciesResponse>
            listFilesystemSnapshotPolicies(
                    ListFilesystemSnapshotPoliciesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListFilesystemSnapshotPoliciesRequest,
                                    ListFilesystemSnapshotPoliciesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());
        requiredParametersMap.put("availabilityDomain", request.getAvailabilityDomain());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListFilesystemSnapshotPoliciesResponse::builder)
                .logger(LOG, "listFilesystemSnapshotPolicies")
                .serviceDetails(
                        "FileStorage",
                        "ListFilesystemSnapshotPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicySummary/ListFilesystemSnapshotPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFilesystemSnapshotPoliciesRequest::builder)
                .basePath("/20171215")
                .appendPathParam("filesystemSnapshotPolicies")
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
                        com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicySummary.class,
                        ListFilesystemSnapshotPoliciesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListFilesystemSnapshotPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListFilesystemSnapshotPoliciesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMountTargetsResponse> listMountTargets(
            ListMountTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMountTargetsRequest, ListMountTargetsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());
        requiredParametersMap.put("availabilityDomain", request.getAvailabilityDomain());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOutboundConnectorsResponse> listOutboundConnectors(
            ListOutboundConnectorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOutboundConnectorsRequest, ListOutboundConnectorsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());
        requiredParametersMap.put("availabilityDomain", request.getAvailabilityDomain());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListOutboundConnectorsResponse::builder)
                .logger(LOG, "listOutboundConnectors")
                .serviceDetails(
                        "FileStorage",
                        "ListOutboundConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/OutboundConnectorSummary/ListOutboundConnectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOutboundConnectorsRequest::builder)
                .basePath("/20171215")
                .appendPathParam("outboundConnectors")
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
                        com.oracle.bmc.filestorage.model.OutboundConnectorSummary.class,
                        ListOutboundConnectorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListOutboundConnectorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListOutboundConnectorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListQuotaRulesResponse> listQuotaRules(
            ListQuotaRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListQuotaRulesRequest, ListQuotaRulesResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");
        Objects.requireNonNull(request.getPrincipalType(), "principalType is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        requiredParametersMap.put("principalType", request.getPrincipalType());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListQuotaRulesResponse::builder)
                .logger(LOG, "listQuotaRules")
                .serviceDetails(
                        "FileStorage",
                        "ListQuotaRules",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/ListQuotaRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListQuotaRulesRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("quotaRules")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("principalType", request.getPrincipalType())
                .appendQueryParam("principalId", request.getPrincipalId())
                .appendQueryParam("areViolatorsOnly", request.getAreViolatorsOnly())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.filestorage.model.QuotaRuleSummary.class,
                        ListQuotaRulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListQuotaRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListQuotaRulesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListReplicationTargetsResponse> listReplicationTargets(
            ListReplicationTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationTargetsRequest, ListReplicationTargetsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());
        requiredParametersMap.put("availabilityDomain", request.getAvailabilityDomain());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListReplicationsResponse> listReplications(
            ListReplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationsRequest, ListReplicationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());
        requiredParametersMap.put("availabilityDomain", request.getAvailabilityDomain());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSnapshotsResponse> listSnapshots(
            ListSnapshotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSnapshotsRequest, ListSnapshotsResponse>
                    handler) {

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam(
                        "filesystemSnapshotPolicyId", request.getFilesystemSnapshotPolicyId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PauseFilesystemSnapshotPolicyResponse>
            pauseFilesystemSnapshotPolicy(
                    PauseFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PauseFilesystemSnapshotPolicyRequest,
                                    PauseFilesystemSnapshotPolicyResponse>
                            handler) {

        Validate.notBlank(
                request.getFilesystemSnapshotPolicyId(),
                "filesystemSnapshotPolicyId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "filesystemSnapshotPolicyId", request.getFilesystemSnapshotPolicyId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, PauseFilesystemSnapshotPolicyResponse::builder)
                .logger(LOG, "pauseFilesystemSnapshotPolicy")
                .serviceDetails(
                        "FileStorage",
                        "PauseFilesystemSnapshotPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/PauseFilesystemSnapshotPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PauseFilesystemSnapshotPolicyRequest::builder)
                .basePath("/20171215")
                .appendPathParam("filesystemSnapshotPolicies")
                .appendPathParam(request.getFilesystemSnapshotPolicyId())
                .appendPathParam("actions")
                .appendPathParam("pause")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy.class,
                        PauseFilesystemSnapshotPolicyResponse.Builder::filesystemSnapshotPolicy)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PauseFilesystemSnapshotPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PauseFilesystemSnapshotPolicyResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveExportLockResponse> removeExportLock(
            RemoveExportLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveExportLockRequest, RemoveExportLockResponse>
                    handler) {

        Validate.notBlank(request.getExportId(), "exportId must not be blank");
        Objects.requireNonNull(
                request.getRemoveExportLockDetails(), "removeExportLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("exportId", request.getExportId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, RemoveExportLockResponse::builder)
                .logger(LOG, "removeExportLock")
                .serviceDetails(
                        "FileStorage",
                        "RemoveExportLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Export/RemoveExportLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveExportLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("exports")
                .appendPathParam(request.getExportId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Export.class,
                        RemoveExportLockResponse.Builder::export)
                .handleResponseHeaderString("etag", RemoveExportLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveExportLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveFileSystemLockResponse> removeFileSystemLock(
            RemoveFileSystemLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveFileSystemLockRequest, RemoveFileSystemLockResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");
        Objects.requireNonNull(
                request.getRemoveFileSystemLockDetails(),
                "removeFileSystemLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, RemoveFileSystemLockResponse::builder)
                .logger(LOG, "removeFileSystemLock")
                .serviceDetails(
                        "FileStorage",
                        "RemoveFileSystemLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/RemoveFileSystemLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveFileSystemLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.FileSystem.class,
                        RemoveFileSystemLockResponse.Builder::fileSystem)
                .handleResponseHeaderString("etag", RemoveFileSystemLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveFileSystemLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveFilesystemSnapshotPolicyLockResponse>
            removeFilesystemSnapshotPolicyLock(
                    RemoveFilesystemSnapshotPolicyLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveFilesystemSnapshotPolicyLockRequest,
                                    RemoveFilesystemSnapshotPolicyLockResponse>
                            handler) {

        Validate.notBlank(
                request.getFilesystemSnapshotPolicyId(),
                "filesystemSnapshotPolicyId must not be blank");
        Objects.requireNonNull(
                request.getRemoveFilesystemSnapshotPolicyLockDetails(),
                "removeFilesystemSnapshotPolicyLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "filesystemSnapshotPolicyId", request.getFilesystemSnapshotPolicyId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, RemoveFilesystemSnapshotPolicyLockResponse::builder)
                .logger(LOG, "removeFilesystemSnapshotPolicyLock")
                .serviceDetails(
                        "FileStorage",
                        "RemoveFilesystemSnapshotPolicyLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/RemoveFilesystemSnapshotPolicyLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveFilesystemSnapshotPolicyLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("filesystemSnapshotPolicies")
                .appendPathParam(request.getFilesystemSnapshotPolicyId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy.class,
                        RemoveFilesystemSnapshotPolicyLockResponse.Builder
                                ::filesystemSnapshotPolicy)
                .handleResponseHeaderString(
                        "etag", RemoveFilesystemSnapshotPolicyLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveFilesystemSnapshotPolicyLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveMountTargetLockResponse> removeMountTargetLock(
            RemoveMountTargetLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveMountTargetLockRequest, RemoveMountTargetLockResponse>
                    handler) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");
        Objects.requireNonNull(
                request.getRemoveMountTargetLockDetails(),
                "removeMountTargetLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("mountTargetId", request.getMountTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, RemoveMountTargetLockResponse::builder)
                .logger(LOG, "removeMountTargetLock")
                .serviceDetails(
                        "FileStorage",
                        "RemoveMountTargetLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/RemoveMountTargetLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveMountTargetLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendPathParam(request.getMountTargetId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.MountTarget.class,
                        RemoveMountTargetLockResponse.Builder::mountTarget)
                .handleResponseHeaderString("etag", RemoveMountTargetLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveMountTargetLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveOutboundConnectorLockResponse>
            removeOutboundConnectorLock(
                    RemoveOutboundConnectorLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveOutboundConnectorLockRequest,
                                    RemoveOutboundConnectorLockResponse>
                            handler) {

        Validate.notBlank(
                request.getOutboundConnectorId(), "outboundConnectorId must not be blank");
        Objects.requireNonNull(
                request.getRemoveOutboundConnectorLockDetails(),
                "removeOutboundConnectorLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("outboundConnectorId", request.getOutboundConnectorId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, RemoveOutboundConnectorLockResponse::builder)
                .logger(LOG, "removeOutboundConnectorLock")
                .serviceDetails(
                        "FileStorage",
                        "RemoveOutboundConnectorLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/OutboundConnector/RemoveOutboundConnectorLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveOutboundConnectorLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("outboundConnectors")
                .appendPathParam(request.getOutboundConnectorId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.OutboundConnector.class,
                        RemoveOutboundConnectorLockResponse.Builder::outboundConnector)
                .handleResponseHeaderString(
                        "etag", RemoveOutboundConnectorLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveOutboundConnectorLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveReplicationLockResponse> removeReplicationLock(
            RemoveReplicationLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveReplicationLockRequest, RemoveReplicationLockResponse>
                    handler) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");
        Objects.requireNonNull(
                request.getRemoveReplicationLockDetails(),
                "removeReplicationLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("replicationId", request.getReplicationId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, RemoveReplicationLockResponse::builder)
                .logger(LOG, "removeReplicationLock")
                .serviceDetails(
                        "FileStorage",
                        "RemoveReplicationLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/RemoveReplicationLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveReplicationLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("replications")
                .appendPathParam(request.getReplicationId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Replication.class,
                        RemoveReplicationLockResponse.Builder::replication)
                .handleResponseHeaderString("etag", RemoveReplicationLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveReplicationLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveSnapshotLockResponse> removeSnapshotLock(
            RemoveSnapshotLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveSnapshotLockRequest, RemoveSnapshotLockResponse>
                    handler) {

        Validate.notBlank(request.getSnapshotId(), "snapshotId must not be blank");
        Objects.requireNonNull(
                request.getRemoveSnapshotLockDetails(), "removeSnapshotLockDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("snapshotId", request.getSnapshotId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, RemoveSnapshotLockResponse::builder)
                .logger(LOG, "removeSnapshotLock")
                .serviceDetails(
                        "FileStorage",
                        "RemoveSnapshotLock",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Snapshot/RemoveSnapshotLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveSnapshotLockRequest::builder)
                .basePath("/20171215")
                .appendPathParam("snapshots")
                .appendPathParam(request.getSnapshotId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.Snapshot.class,
                        RemoveSnapshotLockResponse.Builder::snapshot)
                .handleResponseHeaderString("etag", RemoveSnapshotLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveSnapshotLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleDowngradeShapeMountTargetResponse>
            scheduleDowngradeShapeMountTarget(
                    ScheduleDowngradeShapeMountTargetRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleDowngradeShapeMountTargetRequest,
                                    ScheduleDowngradeShapeMountTargetResponse>
                            handler) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");
        Objects.requireNonNull(
                request.getScheduleDowngradeShapeMountTargetDetails(),
                "scheduleDowngradeShapeMountTargetDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("mountTargetId", request.getMountTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ScheduleDowngradeShapeMountTargetResponse::builder)
                .logger(LOG, "scheduleDowngradeShapeMountTarget")
                .serviceDetails(
                        "FileStorage",
                        "ScheduleDowngradeShapeMountTarget",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/ScheduleDowngradeShapeMountTarget")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleDowngradeShapeMountTargetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendPathParam(request.getMountTargetId())
                .appendPathParam("actions")
                .appendPathParam("scheduleShapeDowngrade")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.MountTarget.class,
                        ScheduleDowngradeShapeMountTargetResponse.Builder::mountTarget)
                .handleResponseHeaderString(
                        "etag", ScheduleDowngradeShapeMountTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScheduleDowngradeShapeMountTargetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ToggleQuotaRulesResponse> toggleQuotaRules(
            ToggleQuotaRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ToggleQuotaRulesRequest, ToggleQuotaRulesResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");
        Objects.requireNonNull(
                request.getToggleQuotaRulesDetails(), "toggleQuotaRulesDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ToggleQuotaRulesResponse::builder)
                .logger(LOG, "toggleQuotaRules")
                .serviceDetails(
                        "FileStorage",
                        "ToggleQuotaRules",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/ToggleQuotaRules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ToggleQuotaRulesRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("actions")
                .appendPathParam("toggleQuotaRules")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ToggleQuotaRulesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UnpauseFilesystemSnapshotPolicyResponse>
            unpauseFilesystemSnapshotPolicy(
                    UnpauseFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UnpauseFilesystemSnapshotPolicyRequest,
                                    UnpauseFilesystemSnapshotPolicyResponse>
                            handler) {

        Validate.notBlank(
                request.getFilesystemSnapshotPolicyId(),
                "filesystemSnapshotPolicyId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "filesystemSnapshotPolicyId", request.getFilesystemSnapshotPolicyId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, UnpauseFilesystemSnapshotPolicyResponse::builder)
                .logger(LOG, "unpauseFilesystemSnapshotPolicy")
                .serviceDetails(
                        "FileStorage",
                        "UnpauseFilesystemSnapshotPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/UnpauseFilesystemSnapshotPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UnpauseFilesystemSnapshotPolicyRequest::builder)
                .basePath("/20171215")
                .appendPathParam("filesystemSnapshotPolicies")
                .appendPathParam(request.getFilesystemSnapshotPolicyId())
                .appendPathParam("actions")
                .appendPathParam("unpause")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy.class,
                        UnpauseFilesystemSnapshotPolicyResponse.Builder::filesystemSnapshotPolicy)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UnpauseFilesystemSnapshotPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UnpauseFilesystemSnapshotPolicyResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExportResponse> updateExport(
            UpdateExportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateExportRequest, UpdateExportResponse>
                    handler) {

        Validate.notBlank(request.getExportId(), "exportId must not be blank");
        Objects.requireNonNull(request.getUpdateExportDetails(), "updateExportDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("exportId", request.getExportId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExportSetResponse> updateExportSet(
            UpdateExportSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExportSetRequest, UpdateExportSetResponse>
                    handler) {

        Validate.notBlank(request.getExportSetId(), "exportSetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExportSetDetails(), "updateExportSetDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("exportSetId", request.getExportSetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFileSystemResponse> updateFileSystem(
            UpdateFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFileSystemRequest, UpdateFileSystemResponse>
                    handler) {

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFileSystemDetails(), "updateFileSystemDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFilesystemSnapshotPolicyResponse>
            updateFilesystemSnapshotPolicy(
                    UpdateFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFilesystemSnapshotPolicyRequest,
                                    UpdateFilesystemSnapshotPolicyResponse>
                            handler) {

        Validate.notBlank(
                request.getFilesystemSnapshotPolicyId(),
                "filesystemSnapshotPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFilesystemSnapshotPolicyDetails(),
                "updateFilesystemSnapshotPolicyDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "filesystemSnapshotPolicyId", request.getFilesystemSnapshotPolicyId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, UpdateFilesystemSnapshotPolicyResponse::builder)
                .logger(LOG, "updateFilesystemSnapshotPolicy")
                .serviceDetails(
                        "FileStorage",
                        "UpdateFilesystemSnapshotPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/UpdateFilesystemSnapshotPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFilesystemSnapshotPolicyRequest::builder)
                .basePath("/20171215")
                .appendPathParam("filesystemSnapshotPolicies")
                .appendPathParam(request.getFilesystemSnapshotPolicyId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy.class,
                        UpdateFilesystemSnapshotPolicyResponse.Builder::filesystemSnapshotPolicy)
                .handleResponseHeaderString(
                        "etag", UpdateFilesystemSnapshotPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateFilesystemSnapshotPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMountTargetResponse> updateMountTarget(
            UpdateMountTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMountTargetRequest, UpdateMountTargetResponse>
                    handler) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMountTargetDetails(), "updateMountTargetDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("mountTargetId", request.getMountTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOutboundConnectorResponse> updateOutboundConnector(
            UpdateOutboundConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOutboundConnectorRequest, UpdateOutboundConnectorResponse>
                    handler) {

        Validate.notBlank(
                request.getOutboundConnectorId(), "outboundConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOutboundConnectorDetails(),
                "updateOutboundConnectorDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("outboundConnectorId", request.getOutboundConnectorId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, UpdateOutboundConnectorResponse::builder)
                .logger(LOG, "updateOutboundConnector")
                .serviceDetails(
                        "FileStorage",
                        "UpdateOutboundConnector",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/OutboundConnector/UpdateOutboundConnector")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOutboundConnectorRequest::builder)
                .basePath("/20171215")
                .appendPathParam("outboundConnectors")
                .appendPathParam(request.getOutboundConnectorId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.OutboundConnector.class,
                        UpdateOutboundConnectorResponse.Builder::outboundConnector)
                .handleResponseHeaderString("etag", UpdateOutboundConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOutboundConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateQuotaRuleResponse> updateQuotaRule(
            UpdateQuotaRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateQuotaRuleRequest, UpdateQuotaRuleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateQuotaRuleDetails(), "updateQuotaRuleDetails is required");

        Validate.notBlank(request.getFileSystemId(), "fileSystemId must not be blank");

        Validate.notBlank(request.getQuotaRuleId(), "quotaRuleId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("fileSystemId", request.getFileSystemId());
        requiredParametersMap.put("quotaRuleId", request.getQuotaRuleId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, UpdateQuotaRuleResponse::builder)
                .logger(LOG, "updateQuotaRule")
                .serviceDetails(
                        "FileStorage",
                        "UpdateQuotaRule",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/UpdateQuotaRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateQuotaRuleRequest::builder)
                .basePath("/20171215")
                .appendPathParam("fileSystems")
                .appendPathParam(request.getFileSystemId())
                .appendPathParam("quotaRules")
                .appendPathParam(request.getQuotaRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.QuotaRule.class,
                        UpdateQuotaRuleResponse.Builder::quotaRule)
                .handleResponseHeaderString("etag", UpdateQuotaRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateQuotaRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationResponse> updateReplication(
            UpdateReplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateReplicationRequest, UpdateReplicationResponse>
                    handler) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateReplicationDetails(), "updateReplicationDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("replicationId", request.getReplicationId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSnapshotResponse> updateSnapshot(
            UpdateSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSnapshotRequest, UpdateSnapshotResponse>
                    handler) {

        Validate.notBlank(request.getSnapshotId(), "snapshotId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSnapshotDetails(), "updateSnapshotDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("snapshotId", request.getSnapshotId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpgradeShapeMountTargetResponse> upgradeShapeMountTarget(
            UpgradeShapeMountTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpgradeShapeMountTargetRequest, UpgradeShapeMountTargetResponse>
                    handler) {

        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");
        Objects.requireNonNull(
                request.getUpgradeShapeMountTargetDetails(),
                "upgradeShapeMountTargetDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("mountTargetId", request.getMountTargetId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, UpgradeShapeMountTargetResponse::builder)
                .logger(LOG, "upgradeShapeMountTarget")
                .serviceDetails(
                        "FileStorage",
                        "UpgradeShapeMountTarget",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/UpgradeShapeMountTarget")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeShapeMountTargetRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendPathParam(request.getMountTargetId())
                .appendPathParam("actions")
                .appendPathParam("upgradeShape")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.MountTarget.class,
                        UpgradeShapeMountTargetResponse.Builder::mountTarget)
                .handleResponseHeaderString("etag", UpgradeShapeMountTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeShapeMountTargetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateKeyTabsResponse> validateKeyTabs(
            ValidateKeyTabsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateKeyTabsRequest, ValidateKeyTabsResponse>
                    handler) {
        Objects.requireNonNull(
                request.getValidateKeyTabsDetails(), "validateKeyTabsDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ValidateKeyTabsResponse::builder)
                .logger(LOG, "validateKeyTabs")
                .serviceDetails(
                        "FileStorage",
                        "ValidateKeyTabs",
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/ValidateKeyTabs")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateKeyTabsRequest::builder)
                .basePath("/20171215")
                .appendPathParam("mountTargets")
                .appendPathParam("actions")
                .appendPathParam("validateKeyTabs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.filestorage.model.ValidateKeyTabsResponseDetails.class,
                        ValidateKeyTabsResponse.Builder::validateKeyTabsResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateKeyTabsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
