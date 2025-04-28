/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class BlockstorageClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Blockstorage {
    /** Service instance for Blockstorage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("BLOCKSTORAGE")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BlockstorageClient.class);

    protected final java.util.concurrent.ExecutorService executorService;
    private final BlockstorageWaiters waiters;

    private final BlockstoragePaginators paginators;

    BlockstorageClient(
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
                                    .nameFormat("Blockstorage-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.executorService = executorService;
        this.waiters = new BlockstorageWaiters(executorService, this);

        this.paginators = new BlockstoragePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BlockstorageClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "core";
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
        public BlockstorageClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BlockstorageClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeBootVolumeBackupCompartmentResponse changeBootVolumeBackupCompartment(
            ChangeBootVolumeBackupCompartmentRequest request) {

        Validate.notBlank(request.getBootVolumeBackupId(), "bootVolumeBackupId must not be blank");
        Objects.requireNonNull(
                request.getChangeBootVolumeBackupCompartmentDetails(),
                "changeBootVolumeBackupCompartmentDetails is required");

        return clientCall(request, ChangeBootVolumeBackupCompartmentResponse::builder)
                .logger(LOG, "changeBootVolumeBackupCompartment")
                .serviceDetails(
                        "Blockstorage",
                        "ChangeBootVolumeBackupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeBackup/ChangeBootVolumeBackupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBootVolumeBackupCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeBackups")
                .appendPathParam(request.getBootVolumeBackupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeBootVolumeBackupCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBootVolumeBackupCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeBootVolumeCompartmentResponse changeBootVolumeCompartment(
            ChangeBootVolumeCompartmentRequest request) {

        Validate.notBlank(request.getBootVolumeId(), "bootVolumeId must not be blank");
        Objects.requireNonNull(
                request.getChangeBootVolumeCompartmentDetails(),
                "changeBootVolumeCompartmentDetails is required");

        return clientCall(request, ChangeBootVolumeCompartmentResponse::builder)
                .logger(LOG, "changeBootVolumeCompartment")
                .serviceDetails(
                        "Blockstorage",
                        "ChangeBootVolumeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolume/ChangeBootVolumeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBootVolumeCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumes")
                .appendPathParam(request.getBootVolumeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeBootVolumeCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeBootVolumeCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeVolumeBackupCompartmentResponse changeVolumeBackupCompartment(
            ChangeVolumeBackupCompartmentRequest request) {

        Validate.notBlank(request.getVolumeBackupId(), "volumeBackupId must not be blank");
        Objects.requireNonNull(
                request.getChangeVolumeBackupCompartmentDetails(),
                "changeVolumeBackupCompartmentDetails is required");

        return clientCall(request, ChangeVolumeBackupCompartmentResponse::builder)
                .logger(LOG, "changeVolumeBackupCompartment")
                .serviceDetails(
                        "Blockstorage",
                        "ChangeVolumeBackupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackup/ChangeVolumeBackupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVolumeBackupCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackups")
                .appendPathParam(request.getVolumeBackupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeVolumeBackupCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVolumeBackupCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeVolumeCompartmentResponse changeVolumeCompartment(
            ChangeVolumeCompartmentRequest request) {

        Validate.notBlank(request.getVolumeId(), "volumeId must not be blank");
        Objects.requireNonNull(
                request.getChangeVolumeCompartmentDetails(),
                "changeVolumeCompartmentDetails is required");

        return clientCall(request, ChangeVolumeCompartmentResponse::builder)
                .logger(LOG, "changeVolumeCompartment")
                .serviceDetails(
                        "Blockstorage",
                        "ChangeVolumeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Volume/ChangeVolumeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVolumeCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumes")
                .appendPathParam(request.getVolumeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeVolumeCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeVolumeCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeVolumeGroupBackupCompartmentResponse changeVolumeGroupBackupCompartment(
            ChangeVolumeGroupBackupCompartmentRequest request) {

        Validate.notBlank(
                request.getVolumeGroupBackupId(), "volumeGroupBackupId must not be blank");
        Objects.requireNonNull(
                request.getChangeVolumeGroupBackupCompartmentDetails(),
                "changeVolumeGroupBackupCompartmentDetails is required");

        return clientCall(request, ChangeVolumeGroupBackupCompartmentResponse::builder)
                .logger(LOG, "changeVolumeGroupBackupCompartment")
                .serviceDetails(
                        "Blockstorage",
                        "ChangeVolumeGroupBackupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroupBackup/ChangeVolumeGroupBackupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVolumeGroupBackupCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroupBackups")
                .appendPathParam(request.getVolumeGroupBackupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeVolumeGroupBackupCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVolumeGroupBackupCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeVolumeGroupCompartmentResponse changeVolumeGroupCompartment(
            ChangeVolumeGroupCompartmentRequest request) {

        Validate.notBlank(request.getVolumeGroupId(), "volumeGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeVolumeGroupCompartmentDetails(),
                "changeVolumeGroupCompartmentDetails is required");

        return clientCall(request, ChangeVolumeGroupCompartmentResponse::builder)
                .logger(LOG, "changeVolumeGroupCompartment")
                .serviceDetails(
                        "Blockstorage",
                        "ChangeVolumeGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroup/ChangeVolumeGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVolumeGroupCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroups")
                .appendPathParam(request.getVolumeGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeVolumeGroupCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVolumeGroupCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CopyBootVolumeBackupResponse copyBootVolumeBackup(CopyBootVolumeBackupRequest request) {

        Validate.notBlank(request.getBootVolumeBackupId(), "bootVolumeBackupId must not be blank");
        Objects.requireNonNull(
                request.getCopyBootVolumeBackupDetails(),
                "copyBootVolumeBackupDetails is required");

        return clientCall(request, CopyBootVolumeBackupResponse::builder)
                .logger(LOG, "copyBootVolumeBackup")
                .serviceDetails(
                        "Blockstorage",
                        "CopyBootVolumeBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeBackup/CopyBootVolumeBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CopyBootVolumeBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeBackups")
                .appendPathParam(request.getBootVolumeBackupId())
                .appendPathParam("actions")
                .appendPathParam("copy")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.BootVolumeBackup.class,
                        CopyBootVolumeBackupResponse.Builder::bootVolumeBackup)
                .handleResponseHeaderString("etag", CopyBootVolumeBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CopyBootVolumeBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CopyBootVolumeBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", CopyBootVolumeBackupResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CopyBootVolumeBackupResponse.Builder::contentLocation)
                .callSync();
    }

    @Override
    public CopyVolumeBackupResponse copyVolumeBackup(CopyVolumeBackupRequest request) {

        Validate.notBlank(request.getVolumeBackupId(), "volumeBackupId must not be blank");
        Objects.requireNonNull(
                request.getCopyVolumeBackupDetails(), "copyVolumeBackupDetails is required");

        return clientCall(request, CopyVolumeBackupResponse::builder)
                .logger(LOG, "copyVolumeBackup")
                .serviceDetails(
                        "Blockstorage",
                        "CopyVolumeBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackup/CopyVolumeBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CopyVolumeBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackups")
                .appendPathParam(request.getVolumeBackupId())
                .appendPathParam("actions")
                .appendPathParam("copy")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeBackup.class,
                        CopyVolumeBackupResponse.Builder::volumeBackup)
                .handleResponseHeaderString("etag", CopyVolumeBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CopyVolumeBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CopyVolumeBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("location", CopyVolumeBackupResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CopyVolumeBackupResponse.Builder::contentLocation)
                .callSync();
    }

    @Override
    public CopyVolumeGroupBackupResponse copyVolumeGroupBackup(
            CopyVolumeGroupBackupRequest request) {

        Validate.notBlank(
                request.getVolumeGroupBackupId(), "volumeGroupBackupId must not be blank");
        Objects.requireNonNull(
                request.getCopyVolumeGroupBackupDetails(),
                "copyVolumeGroupBackupDetails is required");

        return clientCall(request, CopyVolumeGroupBackupResponse::builder)
                .logger(LOG, "copyVolumeGroupBackup")
                .serviceDetails(
                        "Blockstorage",
                        "CopyVolumeGroupBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroupBackup/CopyVolumeGroupBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CopyVolumeGroupBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroupBackups")
                .appendPathParam(request.getVolumeGroupBackupId())
                .appendPathParam("actions")
                .appendPathParam("copy")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeGroupBackup.class,
                        CopyVolumeGroupBackupResponse.Builder::volumeGroupBackup)
                .handleResponseHeaderString("etag", CopyVolumeGroupBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CopyVolumeGroupBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBootVolumeResponse createBootVolume(CreateBootVolumeRequest request) {
        Objects.requireNonNull(
                request.getCreateBootVolumeDetails(), "createBootVolumeDetails is required");

        return clientCall(request, CreateBootVolumeResponse::builder)
                .logger(LOG, "createBootVolume")
                .serviceDetails(
                        "Blockstorage",
                        "CreateBootVolume",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolume/CreateBootVolume")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBootVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.BootVolume.class,
                        CreateBootVolumeResponse.Builder::bootVolume)
                .handleResponseHeaderString("etag", CreateBootVolumeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBootVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBootVolumeBackupResponse createBootVolumeBackup(
            CreateBootVolumeBackupRequest request) {
        Objects.requireNonNull(
                request.getCreateBootVolumeBackupDetails(),
                "createBootVolumeBackupDetails is required");

        return clientCall(request, CreateBootVolumeBackupResponse::builder)
                .logger(LOG, "createBootVolumeBackup")
                .serviceDetails(
                        "Blockstorage",
                        "CreateBootVolumeBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeBackup/CreateBootVolumeBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBootVolumeBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeBackups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.BootVolumeBackup.class,
                        CreateBootVolumeBackupResponse.Builder::bootVolumeBackup)
                .handleResponseHeaderString("etag", CreateBootVolumeBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBootVolumeBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        Objects.requireNonNull(request.getCreateVolumeDetails(), "createVolumeDetails is required");

        return clientCall(request, CreateVolumeResponse::builder)
                .logger(LOG, "createVolume")
                .serviceDetails(
                        "Blockstorage",
                        "CreateVolume",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Volume/CreateVolume")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Volume.class,
                        CreateVolumeResponse.Builder::volume)
                .handleResponseHeaderString("etag", CreateVolumeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVolumeBackupResponse createVolumeBackup(CreateVolumeBackupRequest request) {
        Objects.requireNonNull(
                request.getCreateVolumeBackupDetails(), "createVolumeBackupDetails is required");

        return clientCall(request, CreateVolumeBackupResponse::builder)
                .logger(LOG, "createVolumeBackup")
                .serviceDetails(
                        "Blockstorage",
                        "CreateVolumeBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackup/CreateVolumeBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVolumeBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeBackup.class,
                        CreateVolumeBackupResponse.Builder::volumeBackup)
                .handleResponseHeaderString("etag", CreateVolumeBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVolumeBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVolumeBackupPolicyResponse createVolumeBackupPolicy(
            CreateVolumeBackupPolicyRequest request) {
        Objects.requireNonNull(
                request.getCreateVolumeBackupPolicyDetails(),
                "createVolumeBackupPolicyDetails is required");

        return clientCall(request, CreateVolumeBackupPolicyResponse::builder)
                .logger(LOG, "createVolumeBackupPolicy")
                .serviceDetails(
                        "Blockstorage",
                        "CreateVolumeBackupPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackupPolicy/CreateVolumeBackupPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVolumeBackupPolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackupPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeBackupPolicy.class,
                        CreateVolumeBackupPolicyResponse.Builder::volumeBackupPolicy)
                .handleResponseHeaderString("etag", CreateVolumeBackupPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVolumeBackupPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVolumeBackupPolicyAssignmentResponse createVolumeBackupPolicyAssignment(
            CreateVolumeBackupPolicyAssignmentRequest request) {
        Objects.requireNonNull(
                request.getCreateVolumeBackupPolicyAssignmentDetails(),
                "createVolumeBackupPolicyAssignmentDetails is required");

        return clientCall(request, CreateVolumeBackupPolicyAssignmentResponse::builder)
                .logger(LOG, "createVolumeBackupPolicyAssignment")
                .serviceDetails(
                        "Blockstorage",
                        "CreateVolumeBackupPolicyAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackupPolicyAssignment/CreateVolumeBackupPolicyAssignment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVolumeBackupPolicyAssignmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackupPolicyAssignments")
                .accept("application/json")
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeBackupPolicyAssignment.class,
                        CreateVolumeBackupPolicyAssignmentResponse.Builder
                                ::volumeBackupPolicyAssignment)
                .handleResponseHeaderString(
                        "etag", CreateVolumeBackupPolicyAssignmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateVolumeBackupPolicyAssignmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVolumeGroupResponse createVolumeGroup(CreateVolumeGroupRequest request) {
        Objects.requireNonNull(
                request.getCreateVolumeGroupDetails(), "createVolumeGroupDetails is required");

        return clientCall(request, CreateVolumeGroupResponse::builder)
                .logger(LOG, "createVolumeGroup")
                .serviceDetails(
                        "Blockstorage",
                        "CreateVolumeGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroup/CreateVolumeGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVolumeGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeGroup.class,
                        CreateVolumeGroupResponse.Builder::volumeGroup)
                .handleResponseHeaderString("etag", CreateVolumeGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVolumeGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVolumeGroupBackupResponse createVolumeGroupBackup(
            CreateVolumeGroupBackupRequest request) {
        Objects.requireNonNull(
                request.getCreateVolumeGroupBackupDetails(),
                "createVolumeGroupBackupDetails is required");

        return clientCall(request, CreateVolumeGroupBackupResponse::builder)
                .logger(LOG, "createVolumeGroupBackup")
                .serviceDetails(
                        "Blockstorage",
                        "CreateVolumeGroupBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroupBackup/CreateVolumeGroupBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVolumeGroupBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroupBackups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeGroupBackup.class,
                        CreateVolumeGroupBackupResponse.Builder::volumeGroupBackup)
                .handleResponseHeaderString("etag", CreateVolumeGroupBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVolumeGroupBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBootVolumeResponse deleteBootVolume(DeleteBootVolumeRequest request) {

        Validate.notBlank(request.getBootVolumeId(), "bootVolumeId must not be blank");

        return clientCall(request, DeleteBootVolumeResponse::builder)
                .logger(LOG, "deleteBootVolume")
                .serviceDetails("Blockstorage", "DeleteBootVolume", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBootVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumes")
                .appendPathParam(request.getBootVolumeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBootVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBootVolumeBackupResponse deleteBootVolumeBackup(
            DeleteBootVolumeBackupRequest request) {

        Validate.notBlank(request.getBootVolumeBackupId(), "bootVolumeBackupId must not be blank");

        return clientCall(request, DeleteBootVolumeBackupResponse::builder)
                .logger(LOG, "deleteBootVolumeBackup")
                .serviceDetails("Blockstorage", "DeleteBootVolumeBackup", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBootVolumeBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeBackups")
                .appendPathParam(request.getBootVolumeBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBootVolumeBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBootVolumeKmsKeyResponse deleteBootVolumeKmsKey(
            DeleteBootVolumeKmsKeyRequest request) {

        Validate.notBlank(request.getBootVolumeId(), "bootVolumeId must not be blank");

        return clientCall(request, DeleteBootVolumeKmsKeyResponse::builder)
                .logger(LOG, "deleteBootVolumeKmsKey")
                .serviceDetails("Blockstorage", "DeleteBootVolumeKmsKey", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBootVolumeKmsKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumes")
                .appendPathParam(request.getBootVolumeId())
                .appendPathParam("kmsKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBootVolumeKmsKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request) {

        Validate.notBlank(request.getVolumeId(), "volumeId must not be blank");

        return clientCall(request, DeleteVolumeResponse::builder)
                .logger(LOG, "deleteVolume")
                .serviceDetails("Blockstorage", "DeleteVolume", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumes")
                .appendPathParam(request.getVolumeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVolumeBackupResponse deleteVolumeBackup(DeleteVolumeBackupRequest request) {

        Validate.notBlank(request.getVolumeBackupId(), "volumeBackupId must not be blank");

        return clientCall(request, DeleteVolumeBackupResponse::builder)
                .logger(LOG, "deleteVolumeBackup")
                .serviceDetails("Blockstorage", "DeleteVolumeBackup", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVolumeBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackups")
                .appendPathParam(request.getVolumeBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVolumeBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVolumeBackupPolicyResponse deleteVolumeBackupPolicy(
            DeleteVolumeBackupPolicyRequest request) {

        Validate.notBlank(request.getPolicyId(), "policyId must not be blank");

        return clientCall(request, DeleteVolumeBackupPolicyResponse::builder)
                .logger(LOG, "deleteVolumeBackupPolicy")
                .serviceDetails("Blockstorage", "DeleteVolumeBackupPolicy", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVolumeBackupPolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackupPolicies")
                .appendPathParam(request.getPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVolumeBackupPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVolumeBackupPolicyAssignmentResponse deleteVolumeBackupPolicyAssignment(
            DeleteVolumeBackupPolicyAssignmentRequest request) {

        Validate.notBlank(request.getPolicyAssignmentId(), "policyAssignmentId must not be blank");

        return clientCall(request, DeleteVolumeBackupPolicyAssignmentResponse::builder)
                .logger(LOG, "deleteVolumeBackupPolicyAssignment")
                .serviceDetails("Blockstorage", "DeleteVolumeBackupPolicyAssignment", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVolumeBackupPolicyAssignmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackupPolicyAssignments")
                .appendPathParam(request.getPolicyAssignmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteVolumeBackupPolicyAssignmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVolumeGroupResponse deleteVolumeGroup(DeleteVolumeGroupRequest request) {

        Validate.notBlank(request.getVolumeGroupId(), "volumeGroupId must not be blank");

        return clientCall(request, DeleteVolumeGroupResponse::builder)
                .logger(LOG, "deleteVolumeGroup")
                .serviceDetails("Blockstorage", "DeleteVolumeGroup", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVolumeGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroups")
                .appendPathParam(request.getVolumeGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVolumeGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVolumeGroupBackupResponse deleteVolumeGroupBackup(
            DeleteVolumeGroupBackupRequest request) {

        Validate.notBlank(
                request.getVolumeGroupBackupId(), "volumeGroupBackupId must not be blank");

        return clientCall(request, DeleteVolumeGroupBackupResponse::builder)
                .logger(LOG, "deleteVolumeGroupBackup")
                .serviceDetails("Blockstorage", "DeleteVolumeGroupBackup", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVolumeGroupBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroupBackups")
                .appendPathParam(request.getVolumeGroupBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVolumeGroupBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVolumeKmsKeyResponse deleteVolumeKmsKey(DeleteVolumeKmsKeyRequest request) {

        Validate.notBlank(request.getVolumeId(), "volumeId must not be blank");

        return clientCall(request, DeleteVolumeKmsKeyResponse::builder)
                .logger(LOG, "deleteVolumeKmsKey")
                .serviceDetails("Blockstorage", "DeleteVolumeKmsKey", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVolumeKmsKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumes")
                .appendPathParam(request.getVolumeId())
                .appendPathParam("kmsKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVolumeKmsKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBlockVolumeReplicaResponse getBlockVolumeReplica(
            GetBlockVolumeReplicaRequest request) {

        Validate.notBlank(
                request.getBlockVolumeReplicaId(), "blockVolumeReplicaId must not be blank");

        return clientCall(request, GetBlockVolumeReplicaResponse::builder)
                .logger(LOG, "getBlockVolumeReplica")
                .serviceDetails(
                        "Blockstorage",
                        "GetBlockVolumeReplica",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BlockVolumeReplica/GetBlockVolumeReplica")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBlockVolumeReplicaRequest::builder)
                .basePath("/20160918")
                .appendPathParam("blockVolumeReplicas")
                .appendPathParam(request.getBlockVolumeReplicaId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.BlockVolumeReplica.class,
                        GetBlockVolumeReplicaResponse.Builder::blockVolumeReplica)
                .handleResponseHeaderString("etag", GetBlockVolumeReplicaResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBlockVolumeReplicaResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBootVolumeResponse getBootVolume(GetBootVolumeRequest request) {

        Validate.notBlank(request.getBootVolumeId(), "bootVolumeId must not be blank");

        return clientCall(request, GetBootVolumeResponse::builder)
                .logger(LOG, "getBootVolume")
                .serviceDetails(
                        "Blockstorage",
                        "GetBootVolume",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolume/GetBootVolume")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBootVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumes")
                .appendPathParam(request.getBootVolumeId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.BootVolume.class,
                        GetBootVolumeResponse.Builder::bootVolume)
                .handleResponseHeaderString("etag", GetBootVolumeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBootVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBootVolumeBackupResponse getBootVolumeBackup(GetBootVolumeBackupRequest request) {

        Validate.notBlank(request.getBootVolumeBackupId(), "bootVolumeBackupId must not be blank");

        return clientCall(request, GetBootVolumeBackupResponse::builder)
                .logger(LOG, "getBootVolumeBackup")
                .serviceDetails(
                        "Blockstorage",
                        "GetBootVolumeBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeBackup/GetBootVolumeBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBootVolumeBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeBackups")
                .appendPathParam(request.getBootVolumeBackupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.BootVolumeBackup.class,
                        GetBootVolumeBackupResponse.Builder::bootVolumeBackup)
                .handleResponseHeaderString("etag", GetBootVolumeBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBootVolumeBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBootVolumeKmsKeyResponse getBootVolumeKmsKey(GetBootVolumeKmsKeyRequest request) {

        Validate.notBlank(request.getBootVolumeId(), "bootVolumeId must not be blank");

        return clientCall(request, GetBootVolumeKmsKeyResponse::builder)
                .logger(LOG, "getBootVolumeKmsKey")
                .serviceDetails(
                        "Blockstorage",
                        "GetBootVolumeKmsKey",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeKmsKey/GetBootVolumeKmsKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBootVolumeKmsKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumes")
                .appendPathParam(request.getBootVolumeId())
                .appendPathParam("kmsKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.core.model.BootVolumeKmsKey.class,
                        GetBootVolumeKmsKeyResponse.Builder::bootVolumeKmsKey)
                .handleResponseHeaderString("etag", GetBootVolumeKmsKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBootVolumeKmsKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBootVolumeReplicaResponse getBootVolumeReplica(GetBootVolumeReplicaRequest request) {

        Validate.notBlank(
                request.getBootVolumeReplicaId(), "bootVolumeReplicaId must not be blank");

        return clientCall(request, GetBootVolumeReplicaResponse::builder)
                .logger(LOG, "getBootVolumeReplica")
                .serviceDetails(
                        "Blockstorage",
                        "GetBootVolumeReplica",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeReplica/GetBootVolumeReplica")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBootVolumeReplicaRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeReplicas")
                .appendPathParam(request.getBootVolumeReplicaId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.BootVolumeReplica.class,
                        GetBootVolumeReplicaResponse.Builder::bootVolumeReplica)
                .handleResponseHeaderString("etag", GetBootVolumeReplicaResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBootVolumeReplicaResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVolumeResponse getVolume(GetVolumeRequest request) {

        Validate.notBlank(request.getVolumeId(), "volumeId must not be blank");

        return clientCall(request, GetVolumeResponse::builder)
                .logger(LOG, "getVolume")
                .serviceDetails(
                        "Blockstorage",
                        "GetVolume",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Volume/GetVolume")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumes")
                .appendPathParam(request.getVolumeId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.Volume.class, GetVolumeResponse.Builder::volume)
                .handleResponseHeaderString("etag", GetVolumeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVolumeBackupResponse getVolumeBackup(GetVolumeBackupRequest request) {

        Validate.notBlank(request.getVolumeBackupId(), "volumeBackupId must not be blank");

        return clientCall(request, GetVolumeBackupResponse::builder)
                .logger(LOG, "getVolumeBackup")
                .serviceDetails(
                        "Blockstorage",
                        "GetVolumeBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackup/GetVolumeBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVolumeBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackups")
                .appendPathParam(request.getVolumeBackupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.VolumeBackup.class,
                        GetVolumeBackupResponse.Builder::volumeBackup)
                .handleResponseHeaderString("etag", GetVolumeBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVolumeBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVolumeBackupPolicyResponse getVolumeBackupPolicy(
            GetVolumeBackupPolicyRequest request) {

        Validate.notBlank(request.getPolicyId(), "policyId must not be blank");

        return clientCall(request, GetVolumeBackupPolicyResponse::builder)
                .logger(LOG, "getVolumeBackupPolicy")
                .serviceDetails(
                        "Blockstorage",
                        "GetVolumeBackupPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackupPolicy/GetVolumeBackupPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVolumeBackupPolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackupPolicies")
                .appendPathParam(request.getPolicyId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.VolumeBackupPolicy.class,
                        GetVolumeBackupPolicyResponse.Builder::volumeBackupPolicy)
                .handleResponseHeaderString("etag", GetVolumeBackupPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVolumeBackupPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVolumeBackupPolicyAssetAssignmentResponse getVolumeBackupPolicyAssetAssignment(
            GetVolumeBackupPolicyAssetAssignmentRequest request) {
        Objects.requireNonNull(request.getAssetId(), "assetId is required");

        return clientCall(request, GetVolumeBackupPolicyAssetAssignmentResponse::builder)
                .logger(LOG, "getVolumeBackupPolicyAssetAssignment")
                .serviceDetails(
                        "Blockstorage",
                        "GetVolumeBackupPolicyAssetAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackupPolicyAssignment/GetVolumeBackupPolicyAssetAssignment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVolumeBackupPolicyAssetAssignmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackupPolicyAssignments")
                .appendQueryParam("assetId", request.getAssetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VolumeBackupPolicyAssignment.class,
                        GetVolumeBackupPolicyAssetAssignmentResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        GetVolumeBackupPolicyAssetAssignmentResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetVolumeBackupPolicyAssetAssignmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVolumeBackupPolicyAssignmentResponse getVolumeBackupPolicyAssignment(
            GetVolumeBackupPolicyAssignmentRequest request) {

        Validate.notBlank(request.getPolicyAssignmentId(), "policyAssignmentId must not be blank");

        return clientCall(request, GetVolumeBackupPolicyAssignmentResponse::builder)
                .logger(LOG, "getVolumeBackupPolicyAssignment")
                .serviceDetails(
                        "Blockstorage",
                        "GetVolumeBackupPolicyAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackupPolicyAssignment/GetVolumeBackupPolicyAssignment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVolumeBackupPolicyAssignmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackupPolicyAssignments")
                .appendPathParam(request.getPolicyAssignmentId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.VolumeBackupPolicyAssignment.class,
                        GetVolumeBackupPolicyAssignmentResponse.Builder
                                ::volumeBackupPolicyAssignment)
                .handleResponseHeaderString(
                        "etag", GetVolumeBackupPolicyAssignmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetVolumeBackupPolicyAssignmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVolumeGroupResponse getVolumeGroup(GetVolumeGroupRequest request) {

        Validate.notBlank(request.getVolumeGroupId(), "volumeGroupId must not be blank");

        return clientCall(request, GetVolumeGroupResponse::builder)
                .logger(LOG, "getVolumeGroup")
                .serviceDetails(
                        "Blockstorage",
                        "GetVolumeGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroup/GetVolumeGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVolumeGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroups")
                .appendPathParam(request.getVolumeGroupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.VolumeGroup.class,
                        GetVolumeGroupResponse.Builder::volumeGroup)
                .handleResponseHeaderString("etag", GetVolumeGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVolumeGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVolumeGroupBackupResponse getVolumeGroupBackup(GetVolumeGroupBackupRequest request) {

        Validate.notBlank(
                request.getVolumeGroupBackupId(), "volumeGroupBackupId must not be blank");

        return clientCall(request, GetVolumeGroupBackupResponse::builder)
                .logger(LOG, "getVolumeGroupBackup")
                .serviceDetails(
                        "Blockstorage",
                        "GetVolumeGroupBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroupBackup/GetVolumeGroupBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVolumeGroupBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroupBackups")
                .appendPathParam(request.getVolumeGroupBackupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.VolumeGroupBackup.class,
                        GetVolumeGroupBackupResponse.Builder::volumeGroupBackup)
                .handleResponseHeaderString("etag", GetVolumeGroupBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVolumeGroupBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVolumeGroupReplicaResponse getVolumeGroupReplica(
            GetVolumeGroupReplicaRequest request) {

        Validate.notBlank(
                request.getVolumeGroupReplicaId(), "volumeGroupReplicaId must not be blank");

        return clientCall(request, GetVolumeGroupReplicaResponse::builder)
                .logger(LOG, "getVolumeGroupReplica")
                .serviceDetails(
                        "Blockstorage",
                        "GetVolumeGroupReplica",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroupReplica/GetVolumeGroupReplica")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVolumeGroupReplicaRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroupReplicas")
                .appendPathParam(request.getVolumeGroupReplicaId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.VolumeGroupReplica.class,
                        GetVolumeGroupReplicaResponse.Builder::volumeGroupReplica)
                .handleResponseHeaderString("etag", GetVolumeGroupReplicaResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVolumeGroupReplicaResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVolumeKmsKeyResponse getVolumeKmsKey(GetVolumeKmsKeyRequest request) {

        Validate.notBlank(request.getVolumeId(), "volumeId must not be blank");

        return clientCall(request, GetVolumeKmsKeyResponse::builder)
                .logger(LOG, "getVolumeKmsKey")
                .serviceDetails(
                        "Blockstorage",
                        "GetVolumeKmsKey",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeKmsKey/GetVolumeKmsKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVolumeKmsKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumes")
                .appendPathParam(request.getVolumeId())
                .appendPathParam("kmsKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.core.model.VolumeKmsKey.class,
                        GetVolumeKmsKeyResponse.Builder::volumeKmsKey)
                .handleResponseHeaderString("etag", GetVolumeKmsKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVolumeKmsKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListBlockVolumeReplicasResponse listBlockVolumeReplicas(
            ListBlockVolumeReplicasRequest request) {

        return clientCall(request, ListBlockVolumeReplicasResponse::builder)
                .logger(LOG, "listBlockVolumeReplicas")
                .serviceDetails(
                        "Blockstorage",
                        "ListBlockVolumeReplicas",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BlockVolumeReplica/ListBlockVolumeReplicas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBlockVolumeReplicasRequest::builder)
                .basePath("/20160918")
                .appendPathParam("blockVolumeReplicas")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("volumeGroupReplicaId", request.getVolumeGroupReplicaId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.BlockVolumeReplica.class,
                        ListBlockVolumeReplicasResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListBlockVolumeReplicasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListBlockVolumeReplicasResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListBootVolumeBackupsResponse listBootVolumeBackups(
            ListBootVolumeBackupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBootVolumeBackupsResponse::builder)
                .logger(LOG, "listBootVolumeBackups")
                .serviceDetails(
                        "Blockstorage",
                        "ListBootVolumeBackups",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeBackup/ListBootVolumeBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBootVolumeBackupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeBackups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("bootVolumeId", request.getBootVolumeId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("sourceBootVolumeBackupId", request.getSourceBootVolumeBackupId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.BootVolumeBackup.class,
                        ListBootVolumeBackupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListBootVolumeBackupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListBootVolumeBackupsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListBootVolumeReplicasResponse listBootVolumeReplicas(
            ListBootVolumeReplicasRequest request) {

        return clientCall(request, ListBootVolumeReplicasResponse::builder)
                .logger(LOG, "listBootVolumeReplicas")
                .serviceDetails(
                        "Blockstorage",
                        "ListBootVolumeReplicas",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeReplica/ListBootVolumeReplicas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBootVolumeReplicasRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeReplicas")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("volumeGroupReplicaId", request.getVolumeGroupReplicaId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.BootVolumeReplica.class,
                        ListBootVolumeReplicasResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListBootVolumeReplicasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListBootVolumeReplicasResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListBootVolumesResponse listBootVolumes(ListBootVolumesRequest request) {

        return clientCall(request, ListBootVolumesResponse::builder)
                .logger(LOG, "listBootVolumes")
                .serviceDetails(
                        "Blockstorage",
                        "ListBootVolumes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolume/ListBootVolumes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBootVolumesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("volumeGroupId", request.getVolumeGroupId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.BootVolume.class,
                        ListBootVolumesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListBootVolumesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListBootVolumesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVolumeBackupPoliciesResponse listVolumeBackupPolicies(
            ListVolumeBackupPoliciesRequest request) {

        return clientCall(request, ListVolumeBackupPoliciesResponse::builder)
                .logger(LOG, "listVolumeBackupPolicies")
                .serviceDetails(
                        "Blockstorage",
                        "ListVolumeBackupPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackupPolicy/ListVolumeBackupPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVolumeBackupPoliciesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackupPolicies")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VolumeBackupPolicy.class,
                        ListVolumeBackupPoliciesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVolumeBackupPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVolumeBackupPoliciesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVolumeBackupsResponse listVolumeBackups(ListVolumeBackupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVolumeBackupsResponse::builder)
                .logger(LOG, "listVolumeBackups")
                .serviceDetails(
                        "Blockstorage",
                        "ListVolumeBackups",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackup/ListVolumeBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVolumeBackupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("volumeId", request.getVolumeId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("sourceVolumeBackupId", request.getSourceVolumeBackupId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VolumeBackup.class,
                        ListVolumeBackupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVolumeBackupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVolumeBackupsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVolumeGroupBackupsResponse listVolumeGroupBackups(
            ListVolumeGroupBackupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVolumeGroupBackupsResponse::builder)
                .logger(LOG, "listVolumeGroupBackups")
                .serviceDetails(
                        "Blockstorage",
                        "ListVolumeGroupBackups",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroupBackup/ListVolumeGroupBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVolumeGroupBackupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroupBackups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("volumeGroupId", request.getVolumeGroupId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VolumeGroupBackup.class,
                        ListVolumeGroupBackupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVolumeGroupBackupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVolumeGroupBackupsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVolumeGroupReplicasResponse listVolumeGroupReplicas(
            ListVolumeGroupReplicasRequest request) {
        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVolumeGroupReplicasResponse::builder)
                .logger(LOG, "listVolumeGroupReplicas")
                .serviceDetails(
                        "Blockstorage",
                        "ListVolumeGroupReplicas",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroupReplica/ListVolumeGroupReplicas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVolumeGroupReplicasRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroupReplicas")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VolumeGroupReplica.class,
                        ListVolumeGroupReplicasResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVolumeGroupReplicasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVolumeGroupReplicasResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVolumeGroupsResponse listVolumeGroups(ListVolumeGroupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVolumeGroupsResponse::builder)
                .logger(LOG, "listVolumeGroups")
                .serviceDetails(
                        "Blockstorage",
                        "ListVolumeGroups",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroup/ListVolumeGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVolumeGroupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroups")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VolumeGroup.class,
                        ListVolumeGroupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVolumeGroupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVolumeGroupsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVolumesResponse listVolumes(ListVolumesRequest request) {

        return clientCall(request, ListVolumesResponse::builder)
                .logger(LOG, "listVolumes")
                .serviceDetails(
                        "Blockstorage",
                        "ListVolumes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Volume/ListVolumes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVolumesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("volumeGroupId", request.getVolumeGroupId())
                .appendQueryParam("clusterPlacementGroupId", request.getClusterPlacementGroupId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.Volume.class, ListVolumesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVolumesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVolumesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBootVolumeResponse updateBootVolume(UpdateBootVolumeRequest request) {

        Validate.notBlank(request.getBootVolumeId(), "bootVolumeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBootVolumeDetails(), "updateBootVolumeDetails is required");

        return clientCall(request, UpdateBootVolumeResponse::builder)
                .logger(LOG, "updateBootVolume")
                .serviceDetails(
                        "Blockstorage",
                        "UpdateBootVolume",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolume/UpdateBootVolume")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBootVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumes")
                .appendPathParam(request.getBootVolumeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.BootVolume.class,
                        UpdateBootVolumeResponse.Builder::bootVolume)
                .handleResponseHeaderString("etag", UpdateBootVolumeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBootVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBootVolumeBackupResponse updateBootVolumeBackup(
            UpdateBootVolumeBackupRequest request) {

        Validate.notBlank(request.getBootVolumeBackupId(), "bootVolumeBackupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBootVolumeBackupDetails(),
                "updateBootVolumeBackupDetails is required");

        return clientCall(request, UpdateBootVolumeBackupResponse::builder)
                .logger(LOG, "updateBootVolumeBackup")
                .serviceDetails(
                        "Blockstorage",
                        "UpdateBootVolumeBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeBackup/UpdateBootVolumeBackup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBootVolumeBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeBackups")
                .appendPathParam(request.getBootVolumeBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.BootVolumeBackup.class,
                        UpdateBootVolumeBackupResponse.Builder::bootVolumeBackup)
                .handleResponseHeaderString("etag", UpdateBootVolumeBackupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateBootVolumeKmsKeyResponse updateBootVolumeKmsKey(
            UpdateBootVolumeKmsKeyRequest request) {

        Validate.notBlank(request.getBootVolumeId(), "bootVolumeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBootVolumeKmsKeyDetails(),
                "updateBootVolumeKmsKeyDetails is required");

        return clientCall(request, UpdateBootVolumeKmsKeyResponse::builder)
                .logger(LOG, "updateBootVolumeKmsKey")
                .serviceDetails(
                        "Blockstorage",
                        "UpdateBootVolumeKmsKey",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeKmsKey/UpdateBootVolumeKmsKey")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBootVolumeKmsKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumes")
                .appendPathParam(request.getBootVolumeId())
                .appendPathParam("kmsKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.BootVolumeKmsKey.class,
                        UpdateBootVolumeKmsKeyResponse.Builder::bootVolumeKmsKey)
                .handleResponseHeaderString("etag", UpdateBootVolumeKmsKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBootVolumeKmsKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateVolumeResponse updateVolume(UpdateVolumeRequest request) {

        Validate.notBlank(request.getVolumeId(), "volumeId must not be blank");
        Objects.requireNonNull(request.getUpdateVolumeDetails(), "updateVolumeDetails is required");

        return clientCall(request, UpdateVolumeResponse::builder)
                .logger(LOG, "updateVolume")
                .serviceDetails(
                        "Blockstorage",
                        "UpdateVolume",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Volume/UpdateVolume")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumes")
                .appendPathParam(request.getVolumeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Volume.class,
                        UpdateVolumeResponse.Builder::volume)
                .handleResponseHeaderString("etag", UpdateVolumeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateVolumeBackupResponse updateVolumeBackup(UpdateVolumeBackupRequest request) {

        Validate.notBlank(request.getVolumeBackupId(), "volumeBackupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVolumeBackupDetails(), "updateVolumeBackupDetails is required");

        return clientCall(request, UpdateVolumeBackupResponse::builder)
                .logger(LOG, "updateVolumeBackup")
                .serviceDetails(
                        "Blockstorage",
                        "UpdateVolumeBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackup/UpdateVolumeBackup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVolumeBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackups")
                .appendPathParam(request.getVolumeBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeBackup.class,
                        UpdateVolumeBackupResponse.Builder::volumeBackup)
                .handleResponseHeaderString("etag", UpdateVolumeBackupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateVolumeBackupPolicyResponse updateVolumeBackupPolicy(
            UpdateVolumeBackupPolicyRequest request) {

        Validate.notBlank(request.getPolicyId(), "policyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVolumeBackupPolicyDetails(),
                "updateVolumeBackupPolicyDetails is required");

        return clientCall(request, UpdateVolumeBackupPolicyResponse::builder)
                .logger(LOG, "updateVolumeBackupPolicy")
                .serviceDetails(
                        "Blockstorage",
                        "UpdateVolumeBackupPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeBackupPolicy/UpdateVolumeBackupPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVolumeBackupPolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeBackupPolicies")
                .appendPathParam(request.getPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeBackupPolicy.class,
                        UpdateVolumeBackupPolicyResponse.Builder::volumeBackupPolicy)
                .handleResponseHeaderString("etag", UpdateVolumeBackupPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVolumeBackupPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateVolumeGroupResponse updateVolumeGroup(UpdateVolumeGroupRequest request) {

        Validate.notBlank(request.getVolumeGroupId(), "volumeGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVolumeGroupDetails(), "updateVolumeGroupDetails is required");

        return clientCall(request, UpdateVolumeGroupResponse::builder)
                .logger(LOG, "updateVolumeGroup")
                .serviceDetails(
                        "Blockstorage",
                        "UpdateVolumeGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroup/UpdateVolumeGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVolumeGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroups")
                .appendPathParam(request.getVolumeGroupId())
                .appendQueryParam("preserveVolumeReplica", request.getPreserveVolumeReplica())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeGroup.class,
                        UpdateVolumeGroupResponse.Builder::volumeGroup)
                .handleResponseHeaderString("etag", UpdateVolumeGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVolumeGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateVolumeGroupBackupResponse updateVolumeGroupBackup(
            UpdateVolumeGroupBackupRequest request) {

        Validate.notBlank(
                request.getVolumeGroupBackupId(), "volumeGroupBackupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVolumeGroupBackupDetails(),
                "updateVolumeGroupBackupDetails is required");

        return clientCall(request, UpdateVolumeGroupBackupResponse::builder)
                .logger(LOG, "updateVolumeGroupBackup")
                .serviceDetails(
                        "Blockstorage",
                        "UpdateVolumeGroupBackup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeGroupBackup/UpdateVolumeGroupBackup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVolumeGroupBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeGroupBackups")
                .appendPathParam(request.getVolumeGroupBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeGroupBackup.class,
                        UpdateVolumeGroupBackupResponse.Builder::volumeGroupBackup)
                .handleResponseHeaderString("etag", UpdateVolumeGroupBackupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateVolumeKmsKeyResponse updateVolumeKmsKey(UpdateVolumeKmsKeyRequest request) {

        Validate.notBlank(request.getVolumeId(), "volumeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVolumeKmsKeyDetails(), "updateVolumeKmsKeyDetails is required");

        return clientCall(request, UpdateVolumeKmsKeyResponse::builder)
                .logger(LOG, "updateVolumeKmsKey")
                .serviceDetails(
                        "Blockstorage",
                        "UpdateVolumeKmsKey",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeKmsKey/UpdateVolumeKmsKey")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVolumeKmsKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumes")
                .appendPathParam(request.getVolumeId())
                .appendPathParam("kmsKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeKmsKey.class,
                        UpdateVolumeKmsKeyResponse.Builder::volumeKmsKey)
                .handleResponseHeaderString("etag", UpdateVolumeKmsKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVolumeKmsKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BlockstorageWaiters getWaiters() {
        return waiters;
    }

    @Override
    public BlockstorageWaiters newWaiters(
            com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        return new BlockstorageWaiters(executorService, this, workRequestClient);
    }

    @Override
    public BlockstoragePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BlockstorageClient(
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
    public BlockstorageClient(
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
    public BlockstorageClient(
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
    public BlockstorageClient(
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
    public BlockstorageClient(
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
    public BlockstorageClient(
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
    public BlockstorageClient(
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
    public BlockstorageClient(
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
