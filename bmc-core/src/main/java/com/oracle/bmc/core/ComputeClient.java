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
public class ComputeClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Compute {
    /** Service instance for Compute. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("COMPUTE")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ComputeClient.class);

    protected final java.util.concurrent.ExecutorService executorService;
    private final ComputeWaiters waiters;

    private final ComputePaginators paginators;

    ComputeClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(builder, authenticationDetailsProvider, null);

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
                                    .nameFormat("Compute-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.executorService = executorService;
        this.waiters = new ComputeWaiters(executorService, this);

        this.paginators = new ComputePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ComputeClient> {
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
        public ComputeClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ComputeClient(this, authenticationDetailsProvider, executorService);
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
    public AcceptShieldedIntegrityPolicyResponse acceptShieldedIntegrityPolicy(
            AcceptShieldedIntegrityPolicyRequest request) {

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");

        return clientCall(request, AcceptShieldedIntegrityPolicyResponse::builder)
                .logger(LOG, "acceptShieldedIntegrityPolicy")
                .serviceDetails(
                        "Compute",
                        "AcceptShieldedIntegrityPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/MeasuredBootReport/AcceptShieldedIntegrityPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AcceptShieldedIntegrityPolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .appendPathParam("actions")
                .appendPathParam("acceptShieldedIntegrityPolicy")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        AcceptShieldedIntegrityPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddImageShapeCompatibilityEntryResponse addImageShapeCompatibilityEntry(
            AddImageShapeCompatibilityEntryRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");

        Validate.notBlank(request.getShapeName(), "shapeName must not be blank");

        return clientCall(request, AddImageShapeCompatibilityEntryResponse::builder)
                .logger(LOG, "addImageShapeCompatibilityEntry")
                .serviceDetails(
                        "Compute",
                        "AddImageShapeCompatibilityEntry",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/AddImageShapeCompatibilityEntry")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(AddImageShapeCompatibilityEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .appendPathParam("shapes")
                .appendPathParam(request.getShapeName())
                .accept("application/json")
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ImageShapeCompatibilityEntry.class,
                        AddImageShapeCompatibilityEntryResponse.Builder
                                ::imageShapeCompatibilityEntry)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddImageShapeCompatibilityEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AttachBootVolumeResponse attachBootVolume(AttachBootVolumeRequest request) {
        Objects.requireNonNull(
                request.getAttachBootVolumeDetails(), "attachBootVolumeDetails is required");

        return clientCall(request, AttachBootVolumeResponse::builder)
                .logger(LOG, "attachBootVolume")
                .serviceDetails(
                        "Compute",
                        "AttachBootVolume",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeAttachment/AttachBootVolume")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachBootVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeAttachments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.BootVolumeAttachment.class,
                        AttachBootVolumeResponse.Builder::bootVolumeAttachment)
                .handleResponseHeaderString("etag", AttachBootVolumeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AttachBootVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AttachVnicResponse attachVnic(AttachVnicRequest request) {
        Objects.requireNonNull(request.getAttachVnicDetails(), "attachVnicDetails is required");

        return clientCall(request, AttachVnicResponse::builder)
                .logger(LOG, "attachVnic")
                .serviceDetails(
                        "Compute",
                        "AttachVnic",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/AttachVnic")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachVnicRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vnicAttachments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VnicAttachment.class,
                        AttachVnicResponse.Builder::vnicAttachment)
                .handleResponseHeaderString("etag", AttachVnicResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AttachVnicResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AttachVolumeResponse attachVolume(AttachVolumeRequest request) {
        Objects.requireNonNull(request.getAttachVolumeDetails(), "attachVolumeDetails is required");

        return clientCall(request, AttachVolumeResponse::builder)
                .logger(LOG, "attachVolume")
                .serviceDetails(
                        "Compute",
                        "AttachVolume",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/AttachVolume")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeAttachments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeAttachment.class,
                        AttachVolumeResponse.Builder::volumeAttachment)
                .handleResponseHeaderString("etag", AttachVolumeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AttachVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CaptureConsoleHistoryResponse captureConsoleHistory(
            CaptureConsoleHistoryRequest request) {
        Objects.requireNonNull(
                request.getCaptureConsoleHistoryDetails(),
                "captureConsoleHistoryDetails is required");

        return clientCall(request, CaptureConsoleHistoryResponse::builder)
                .logger(LOG, "captureConsoleHistory")
                .serviceDetails(
                        "Compute",
                        "CaptureConsoleHistory",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/CaptureConsoleHistory")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CaptureConsoleHistoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleHistories")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ConsoleHistory.class,
                        CaptureConsoleHistoryResponse.Builder::consoleHistory)
                .handleResponseHeaderString("etag", CaptureConsoleHistoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CaptureConsoleHistoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeComputeCapacityReservationCompartmentResponse
            changeComputeCapacityReservationCompartment(
                    ChangeComputeCapacityReservationCompartmentRequest request) {

        Validate.notBlank(
                request.getCapacityReservationId(), "capacityReservationId must not be blank");
        Objects.requireNonNull(
                request.getChangeComputeCapacityReservationCompartmentDetails(),
                "changeComputeCapacityReservationCompartmentDetails is required");

        return clientCall(request, ChangeComputeCapacityReservationCompartmentResponse::builder)
                .logger(LOG, "changeComputeCapacityReservationCompartment")
                .serviceDetails(
                        "Compute",
                        "ChangeComputeCapacityReservationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/ChangeComputeCapacityReservationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeComputeCapacityReservationCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityReservations")
                .appendPathParam(request.getCapacityReservationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeComputeCapacityReservationCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeComputeCapacityReservationCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeComputeCapacityTopologyCompartmentResponse
            changeComputeCapacityTopologyCompartment(
                    ChangeComputeCapacityTopologyCompartmentRequest request) {

        Validate.notBlank(
                request.getComputeCapacityTopologyId(),
                "computeCapacityTopologyId must not be blank");
        Objects.requireNonNull(
                request.getChangeComputeCapacityTopologyCompartmentDetails(),
                "changeComputeCapacityTopologyCompartmentDetails is required");

        return clientCall(request, ChangeComputeCapacityTopologyCompartmentResponse::builder)
                .logger(LOG, "changeComputeCapacityTopologyCompartment")
                .serviceDetails(
                        "Compute",
                        "ChangeComputeCapacityTopologyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityTopology/ChangeComputeCapacityTopologyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeComputeCapacityTopologyCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityTopologies")
                .appendPathParam(request.getComputeCapacityTopologyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeComputeCapacityTopologyCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeComputeCapacityTopologyCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeComputeClusterCompartmentResponse changeComputeClusterCompartment(
            ChangeComputeClusterCompartmentRequest request) {

        Validate.notBlank(request.getComputeClusterId(), "computeClusterId must not be blank");
        Objects.requireNonNull(
                request.getChangeComputeClusterCompartmentDetails(),
                "changeComputeClusterCompartmentDetails is required");

        return clientCall(request, ChangeComputeClusterCompartmentResponse::builder)
                .logger(LOG, "changeComputeClusterCompartment")
                .serviceDetails(
                        "Compute",
                        "ChangeComputeClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/ChangeComputeClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeComputeClusterCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeClusters")
                .appendPathParam(request.getComputeClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeComputeClusterCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeComputeImageCapabilitySchemaCompartmentResponse
            changeComputeImageCapabilitySchemaCompartment(
                    ChangeComputeImageCapabilitySchemaCompartmentRequest request) {

        Validate.notBlank(
                request.getComputeImageCapabilitySchemaId(),
                "computeImageCapabilitySchemaId must not be blank");
        Objects.requireNonNull(
                request.getChangeComputeImageCapabilitySchemaCompartmentDetails(),
                "changeComputeImageCapabilitySchemaCompartmentDetails is required");

        return clientCall(request, ChangeComputeImageCapabilitySchemaCompartmentResponse::builder)
                .logger(LOG, "changeComputeImageCapabilitySchemaCompartment")
                .serviceDetails(
                        "Compute",
                        "ChangeComputeImageCapabilitySchemaCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/ChangeComputeImageCapabilitySchemaCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeComputeImageCapabilitySchemaCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeImageCapabilitySchemas")
                .appendPathParam(request.getComputeImageCapabilitySchemaId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeComputeImageCapabilitySchemaCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDedicatedVmHostCompartmentResponse changeDedicatedVmHostCompartment(
            ChangeDedicatedVmHostCompartmentRequest request) {

        Validate.notBlank(request.getDedicatedVmHostId(), "dedicatedVmHostId must not be blank");
        Objects.requireNonNull(
                request.getChangeDedicatedVmHostCompartmentDetails(),
                "changeDedicatedVmHostCompartmentDetails is required");

        return clientCall(request, ChangeDedicatedVmHostCompartmentResponse::builder)
                .logger(LOG, "changeDedicatedVmHostCompartment")
                .serviceDetails(
                        "Compute",
                        "ChangeDedicatedVmHostCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/ChangeDedicatedVmHostCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDedicatedVmHostCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dedicatedVmHosts")
                .appendPathParam(request.getDedicatedVmHostId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeDedicatedVmHostCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDedicatedVmHostCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDedicatedVmHostCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeImageCompartmentResponse changeImageCompartment(
            ChangeImageCompartmentRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");
        Objects.requireNonNull(
                request.getChangeImageCompartmentDetails(),
                "changeImageCompartmentDetails is required");

        return clientCall(request, ChangeImageCompartmentResponse::builder)
                .logger(LOG, "changeImageCompartment")
                .serviceDetails(
                        "Compute",
                        "ChangeImageCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/ChangeImageCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeImageCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString("etag", ChangeImageCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeImageCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeInstanceCompartmentResponse changeInstanceCompartment(
            ChangeInstanceCompartmentRequest request) {

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeInstanceCompartmentDetails(),
                "changeInstanceCompartmentDetails is required");

        return clientCall(request, ChangeInstanceCompartmentResponse::builder)
                .logger(LOG, "changeInstanceCompartment")
                .serviceDetails(
                        "Compute",
                        "ChangeInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/ChangeInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeInstanceCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeInstanceCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeInstanceCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeInstanceCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateAppCatalogSubscriptionResponse createAppCatalogSubscription(
            CreateAppCatalogSubscriptionRequest request) {
        Objects.requireNonNull(
                request.getCreateAppCatalogSubscriptionDetails(),
                "createAppCatalogSubscriptionDetails is required");

        return clientCall(request, CreateAppCatalogSubscriptionResponse::builder)
                .logger(LOG, "createAppCatalogSubscription")
                .serviceDetails(
                        "Compute",
                        "CreateAppCatalogSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogSubscription/CreateAppCatalogSubscription")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAppCatalogSubscriptionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("appCatalogSubscriptions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.AppCatalogSubscription.class,
                        CreateAppCatalogSubscriptionResponse.Builder::appCatalogSubscription)
                .handleResponseHeaderString(
                        "etag", CreateAppCatalogSubscriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAppCatalogSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateComputeCapacityReportResponse createComputeCapacityReport(
            CreateComputeCapacityReportRequest request) {
        Objects.requireNonNull(
                request.getCreateComputeCapacityReportDetails(),
                "createComputeCapacityReportDetails is required");

        return clientCall(request, CreateComputeCapacityReportResponse::builder)
                .logger(LOG, "createComputeCapacityReport")
                .serviceDetails(
                        "Compute",
                        "CreateComputeCapacityReport",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReport/CreateComputeCapacityReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateComputeCapacityReportRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityReports")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeCapacityReport.class,
                        CreateComputeCapacityReportResponse.Builder::computeCapacityReport)
                .handleResponseHeaderString(
                        "opc-request-id", CreateComputeCapacityReportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateComputeCapacityReservationResponse createComputeCapacityReservation(
            CreateComputeCapacityReservationRequest request) {
        Objects.requireNonNull(
                request.getCreateComputeCapacityReservationDetails(),
                "createComputeCapacityReservationDetails is required");

        return clientCall(request, CreateComputeCapacityReservationResponse::builder)
                .logger(LOG, "createComputeCapacityReservation")
                .serviceDetails("Compute", "CreateComputeCapacityReservation", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateComputeCapacityReservationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityReservations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeCapacityReservation.class,
                        CreateComputeCapacityReservationResponse.Builder
                                ::computeCapacityReservation)
                .handleResponseHeaderString(
                        "etag", CreateComputeCapacityReservationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateComputeCapacityReservationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateComputeCapacityReservationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", CreateComputeCapacityReservationResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateComputeCapacityTopologyResponse createComputeCapacityTopology(
            CreateComputeCapacityTopologyRequest request) {
        Objects.requireNonNull(
                request.getCreateComputeCapacityTopologyDetails(),
                "createComputeCapacityTopologyDetails is required");

        return clientCall(request, CreateComputeCapacityTopologyResponse::builder)
                .logger(LOG, "createComputeCapacityTopology")
                .serviceDetails("Compute", "CreateComputeCapacityTopology", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateComputeCapacityTopologyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityTopologies")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeCapacityTopology.class,
                        CreateComputeCapacityTopologyResponse.Builder::computeCapacityTopology)
                .handleResponseHeaderString(
                        "etag", CreateComputeCapacityTopologyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", CreateComputeCapacityTopologyResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateComputeCapacityTopologyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateComputeCapacityTopologyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateComputeClusterResponse createComputeCluster(CreateComputeClusterRequest request) {
        Objects.requireNonNull(
                request.getCreateComputeClusterDetails(),
                "createComputeClusterDetails is required");

        return clientCall(request, CreateComputeClusterResponse::builder)
                .logger(LOG, "createComputeCluster")
                .serviceDetails(
                        "Compute",
                        "CreateComputeCluster",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/CreateComputeCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateComputeClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeCluster.class,
                        CreateComputeClusterResponse.Builder::computeCluster)
                .handleResponseHeaderString("etag", CreateComputeClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateComputeClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateComputeImageCapabilitySchemaResponse createComputeImageCapabilitySchema(
            CreateComputeImageCapabilitySchemaRequest request) {
        Objects.requireNonNull(
                request.getCreateComputeImageCapabilitySchemaDetails(),
                "createComputeImageCapabilitySchemaDetails is required");

        return clientCall(request, CreateComputeImageCapabilitySchemaResponse::builder)
                .logger(LOG, "createComputeImageCapabilitySchema")
                .serviceDetails(
                        "Compute",
                        "CreateComputeImageCapabilitySchema",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/CreateComputeImageCapabilitySchema")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateComputeImageCapabilitySchemaRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeImageCapabilitySchemas")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeImageCapabilitySchema.class,
                        CreateComputeImageCapabilitySchemaResponse.Builder
                                ::computeImageCapabilitySchema)
                .handleResponseHeaderString(
                        "etag", CreateComputeImageCapabilitySchemaResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateComputeImageCapabilitySchemaResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDedicatedVmHostResponse createDedicatedVmHost(
            CreateDedicatedVmHostRequest request) {
        Objects.requireNonNull(
                request.getCreateDedicatedVmHostDetails(),
                "createDedicatedVmHostDetails is required");

        return clientCall(request, CreateDedicatedVmHostResponse::builder)
                .logger(LOG, "createDedicatedVmHost")
                .serviceDetails(
                        "Compute",
                        "CreateDedicatedVmHost",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/CreateDedicatedVmHost")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDedicatedVmHostRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dedicatedVmHosts")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.DedicatedVmHost.class,
                        CreateDedicatedVmHostResponse.Builder::dedicatedVmHost)
                .handleResponseHeaderString("etag", CreateDedicatedVmHostResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDedicatedVmHostResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDedicatedVmHostResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateImageResponse createImage(CreateImageRequest request) {
        Objects.requireNonNull(request.getCreateImageDetails(), "createImageDetails is required");

        return clientCall(request, CreateImageResponse::builder)
                .logger(LOG, "createImage")
                .serviceDetails(
                        "Compute",
                        "CreateImage",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/CreateImage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Image.class, CreateImageResponse.Builder::image)
                .handleResponseHeaderString("etag", CreateImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateImageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateImageResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateInstanceConsoleConnectionResponse createInstanceConsoleConnection(
            CreateInstanceConsoleConnectionRequest request) {
        Objects.requireNonNull(
                request.getCreateInstanceConsoleConnectionDetails(),
                "createInstanceConsoleConnectionDetails is required");

        return clientCall(request, CreateInstanceConsoleConnectionResponse::builder)
                .logger(LOG, "createInstanceConsoleConnection")
                .serviceDetails(
                        "Compute",
                        "CreateInstanceConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/CreateInstanceConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInstanceConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleConnections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InstanceConsoleConnection.class,
                        CreateInstanceConsoleConnectionResponse.Builder::instanceConsoleConnection)
                .handleResponseHeaderString(
                        "etag", CreateInstanceConsoleConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateInstanceConsoleConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAppCatalogSubscriptionResponse deleteAppCatalogSubscription(
            DeleteAppCatalogSubscriptionRequest request) {
        Objects.requireNonNull(request.getListingId(), "listingId is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceVersion(), "resourceVersion is required");

        return clientCall(request, DeleteAppCatalogSubscriptionResponse::builder)
                .logger(LOG, "deleteAppCatalogSubscription")
                .serviceDetails("Compute", "DeleteAppCatalogSubscription", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAppCatalogSubscriptionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("appCatalogSubscriptions")
                .appendQueryParam("listingId", request.getListingId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceVersion", request.getResourceVersion())
                .accept("application/json")
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteAppCatalogSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteComputeCapacityReservationResponse deleteComputeCapacityReservation(
            DeleteComputeCapacityReservationRequest request) {

        Validate.notBlank(
                request.getCapacityReservationId(), "capacityReservationId must not be blank");

        return clientCall(request, DeleteComputeCapacityReservationResponse::builder)
                .logger(LOG, "deleteComputeCapacityReservation")
                .serviceDetails(
                        "Compute",
                        "DeleteComputeCapacityReservation",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/DeleteComputeCapacityReservation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteComputeCapacityReservationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityReservations")
                .appendPathParam(request.getCapacityReservationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteComputeCapacityReservationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteComputeCapacityReservationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteComputeCapacityTopologyResponse deleteComputeCapacityTopology(
            DeleteComputeCapacityTopologyRequest request) {

        Validate.notBlank(
                request.getComputeCapacityTopologyId(),
                "computeCapacityTopologyId must not be blank");

        return clientCall(request, DeleteComputeCapacityTopologyResponse::builder)
                .logger(LOG, "deleteComputeCapacityTopology")
                .serviceDetails(
                        "Compute",
                        "DeleteComputeCapacityTopology",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityTopology/DeleteComputeCapacityTopology")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteComputeCapacityTopologyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityTopologies")
                .appendPathParam(request.getComputeCapacityTopologyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteComputeCapacityTopologyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteComputeCapacityTopologyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteComputeClusterResponse deleteComputeCluster(DeleteComputeClusterRequest request) {

        Validate.notBlank(request.getComputeClusterId(), "computeClusterId must not be blank");

        return clientCall(request, DeleteComputeClusterResponse::builder)
                .logger(LOG, "deleteComputeCluster")
                .serviceDetails(
                        "Compute",
                        "DeleteComputeCluster",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/DeleteComputeCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteComputeClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeClusters")
                .appendPathParam(request.getComputeClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteComputeClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteComputeImageCapabilitySchemaResponse deleteComputeImageCapabilitySchema(
            DeleteComputeImageCapabilitySchemaRequest request) {

        Validate.notBlank(
                request.getComputeImageCapabilitySchemaId(),
                "computeImageCapabilitySchemaId must not be blank");

        return clientCall(request, DeleteComputeImageCapabilitySchemaResponse::builder)
                .logger(LOG, "deleteComputeImageCapabilitySchema")
                .serviceDetails(
                        "Compute",
                        "DeleteComputeImageCapabilitySchema",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/DeleteComputeImageCapabilitySchema")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteComputeImageCapabilitySchemaRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeImageCapabilitySchemas")
                .appendPathParam(request.getComputeImageCapabilitySchemaId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteComputeImageCapabilitySchemaResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteConsoleHistoryResponse deleteConsoleHistory(DeleteConsoleHistoryRequest request) {

        Validate.notBlank(
                request.getInstanceConsoleHistoryId(),
                "instanceConsoleHistoryId must not be blank");

        return clientCall(request, DeleteConsoleHistoryResponse::builder)
                .logger(LOG, "deleteConsoleHistory")
                .serviceDetails(
                        "Compute",
                        "DeleteConsoleHistory",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/DeleteConsoleHistory")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConsoleHistoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleHistories")
                .appendPathParam(request.getInstanceConsoleHistoryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConsoleHistoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDedicatedVmHostResponse deleteDedicatedVmHost(
            DeleteDedicatedVmHostRequest request) {

        Validate.notBlank(request.getDedicatedVmHostId(), "dedicatedVmHostId must not be blank");

        return clientCall(request, DeleteDedicatedVmHostResponse::builder)
                .logger(LOG, "deleteDedicatedVmHost")
                .serviceDetails(
                        "Compute",
                        "DeleteDedicatedVmHost",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/DeleteDedicatedVmHost")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDedicatedVmHostRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dedicatedVmHosts")
                .appendPathParam(request.getDedicatedVmHostId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDedicatedVmHostResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDedicatedVmHostResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteImageResponse deleteImage(DeleteImageRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");

        return clientCall(request, DeleteImageResponse::builder)
                .logger(LOG, "deleteImage")
                .serviceDetails("Compute", "DeleteImage", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteImageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteInstanceConsoleConnectionResponse deleteInstanceConsoleConnection(
            DeleteInstanceConsoleConnectionRequest request) {

        Validate.notBlank(
                request.getInstanceConsoleConnectionId(),
                "instanceConsoleConnectionId must not be blank");

        return clientCall(request, DeleteInstanceConsoleConnectionResponse::builder)
                .logger(LOG, "deleteInstanceConsoleConnection")
                .serviceDetails(
                        "Compute",
                        "DeleteInstanceConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/DeleteInstanceConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteInstanceConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleConnections")
                .appendPathParam(request.getInstanceConsoleConnectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteInstanceConsoleConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetachBootVolumeResponse detachBootVolume(DetachBootVolumeRequest request) {

        Validate.notBlank(
                request.getBootVolumeAttachmentId(), "bootVolumeAttachmentId must not be blank");

        return clientCall(request, DetachBootVolumeResponse::builder)
                .logger(LOG, "detachBootVolume")
                .serviceDetails("Compute", "DetachBootVolume", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DetachBootVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeAttachments")
                .appendPathParam(request.getBootVolumeAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DetachBootVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetachVnicResponse detachVnic(DetachVnicRequest request) {

        Validate.notBlank(request.getVnicAttachmentId(), "vnicAttachmentId must not be blank");

        return clientCall(request, DetachVnicResponse::builder)
                .logger(LOG, "detachVnic")
                .serviceDetails(
                        "Compute",
                        "DetachVnic",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/DetachVnic")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DetachVnicRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vnicAttachments")
                .appendPathParam(request.getVnicAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DetachVnicResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetachVolumeResponse detachVolume(DetachVolumeRequest request) {

        Validate.notBlank(request.getVolumeAttachmentId(), "volumeAttachmentId must not be blank");

        return clientCall(request, DetachVolumeResponse::builder)
                .logger(LOG, "detachVolume")
                .serviceDetails(
                        "Compute",
                        "DetachVolume",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/DetachVolume")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DetachVolumeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeAttachments")
                .appendPathParam(request.getVolumeAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DetachVolumeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ExportImageResponse exportImage(ExportImageRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");
        Objects.requireNonNull(request.getExportImageDetails(), "exportImageDetails is required");

        return clientCall(request, ExportImageResponse::builder)
                .logger(LOG, "exportImage")
                .serviceDetails(
                        "Compute",
                        "ExportImage",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/ExportImage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .appendPathParam("actions")
                .appendPathParam("export")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Image.class, ExportImageResponse.Builder::image)
                .handleResponseHeaderString("etag", ExportImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ExportImageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ExportImageResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetAppCatalogListingResponse getAppCatalogListing(GetAppCatalogListingRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, GetAppCatalogListingResponse::builder)
                .logger(LOG, "getAppCatalogListing")
                .serviceDetails(
                        "Compute",
                        "GetAppCatalogListing",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListing/GetAppCatalogListing")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAppCatalogListingRequest::builder)
                .basePath("/20160918")
                .appendPathParam("appCatalogListings")
                .appendPathParam(request.getListingId())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.AppCatalogListing.class,
                        GetAppCatalogListingResponse.Builder::appCatalogListing)
                .handleResponseHeaderString("etag", GetAppCatalogListingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAppCatalogListingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAppCatalogListingAgreementsResponse getAppCatalogListingAgreements(
            GetAppCatalogListingAgreementsRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        Validate.notBlank(request.getResourceVersion(), "resourceVersion must not be blank");

        return clientCall(request, GetAppCatalogListingAgreementsResponse::builder)
                .logger(LOG, "getAppCatalogListingAgreements")
                .serviceDetails(
                        "Compute",
                        "GetAppCatalogListingAgreements",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingResourceVersionAgreements/GetAppCatalogListingAgreements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAppCatalogListingAgreementsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("appCatalogListings")
                .appendPathParam(request.getListingId())
                .appendPathParam("resourceVersions")
                .appendPathParam(request.getResourceVersion())
                .appendPathParam("agreements")
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.AppCatalogListingResourceVersionAgreements.class,
                        GetAppCatalogListingAgreementsResponse.Builder
                                ::appCatalogListingResourceVersionAgreements)
                .handleResponseHeaderString(
                        "etag", GetAppCatalogListingAgreementsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAppCatalogListingAgreementsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAppCatalogListingResourceVersionResponse getAppCatalogListingResourceVersion(
            GetAppCatalogListingResourceVersionRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        Validate.notBlank(request.getResourceVersion(), "resourceVersion must not be blank");

        return clientCall(request, GetAppCatalogListingResourceVersionResponse::builder)
                .logger(LOG, "getAppCatalogListingResourceVersion")
                .serviceDetails(
                        "Compute",
                        "GetAppCatalogListingResourceVersion",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingResourceVersion/GetAppCatalogListingResourceVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAppCatalogListingResourceVersionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("appCatalogListings")
                .appendPathParam(request.getListingId())
                .appendPathParam("resourceVersions")
                .appendPathParam(request.getResourceVersion())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.AppCatalogListingResourceVersion.class,
                        GetAppCatalogListingResourceVersionResponse.Builder
                                ::appCatalogListingResourceVersion)
                .handleResponseHeaderString(
                        "etag", GetAppCatalogListingResourceVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAppCatalogListingResourceVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBootVolumeAttachmentResponse getBootVolumeAttachment(
            GetBootVolumeAttachmentRequest request) {

        Validate.notBlank(
                request.getBootVolumeAttachmentId(), "bootVolumeAttachmentId must not be blank");

        return clientCall(request, GetBootVolumeAttachmentResponse::builder)
                .logger(LOG, "getBootVolumeAttachment")
                .serviceDetails(
                        "Compute",
                        "GetBootVolumeAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeAttachment/GetBootVolumeAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBootVolumeAttachmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeAttachments")
                .appendPathParam(request.getBootVolumeAttachmentId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.BootVolumeAttachment.class,
                        GetBootVolumeAttachmentResponse.Builder::bootVolumeAttachment)
                .handleResponseHeaderString("etag", GetBootVolumeAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBootVolumeAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetComputeCapacityReservationResponse getComputeCapacityReservation(
            GetComputeCapacityReservationRequest request) {

        Validate.notBlank(
                request.getCapacityReservationId(), "capacityReservationId must not be blank");

        return clientCall(request, GetComputeCapacityReservationResponse::builder)
                .logger(LOG, "getComputeCapacityReservation")
                .serviceDetails(
                        "Compute",
                        "GetComputeCapacityReservation",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/GetComputeCapacityReservation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetComputeCapacityReservationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityReservations")
                .appendPathParam(request.getCapacityReservationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.ComputeCapacityReservation.class,
                        GetComputeCapacityReservationResponse.Builder::computeCapacityReservation)
                .handleResponseHeaderString(
                        "etag", GetComputeCapacityReservationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetComputeCapacityReservationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetComputeCapacityTopologyResponse getComputeCapacityTopology(
            GetComputeCapacityTopologyRequest request) {

        Validate.notBlank(
                request.getComputeCapacityTopologyId(),
                "computeCapacityTopologyId must not be blank");

        return clientCall(request, GetComputeCapacityTopologyResponse::builder)
                .logger(LOG, "getComputeCapacityTopology")
                .serviceDetails(
                        "Compute",
                        "GetComputeCapacityTopology",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityTopology/GetComputeCapacityTopology")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetComputeCapacityTopologyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityTopologies")
                .appendPathParam(request.getComputeCapacityTopologyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeCapacityTopology.class,
                        GetComputeCapacityTopologyResponse.Builder::computeCapacityTopology)
                .handleResponseHeaderString(
                        "etag", GetComputeCapacityTopologyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetComputeCapacityTopologyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetComputeClusterResponse getComputeCluster(GetComputeClusterRequest request) {

        Validate.notBlank(request.getComputeClusterId(), "computeClusterId must not be blank");

        return clientCall(request, GetComputeClusterResponse::builder)
                .logger(LOG, "getComputeCluster")
                .serviceDetails(
                        "Compute",
                        "GetComputeCluster",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/GetComputeCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetComputeClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeClusters")
                .appendPathParam(request.getComputeClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.ComputeCluster.class,
                        GetComputeClusterResponse.Builder::computeCluster)
                .handleResponseHeaderString("etag", GetComputeClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetComputeClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetComputeGlobalImageCapabilitySchemaResponse getComputeGlobalImageCapabilitySchema(
            GetComputeGlobalImageCapabilitySchemaRequest request) {

        Validate.notBlank(
                request.getComputeGlobalImageCapabilitySchemaId(),
                "computeGlobalImageCapabilitySchemaId must not be blank");

        return clientCall(request, GetComputeGlobalImageCapabilitySchemaResponse::builder)
                .logger(LOG, "getComputeGlobalImageCapabilitySchema")
                .serviceDetails(
                        "Compute",
                        "GetComputeGlobalImageCapabilitySchema",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchema/GetComputeGlobalImageCapabilitySchema")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetComputeGlobalImageCapabilitySchemaRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeGlobalImageCapabilitySchemas")
                .appendPathParam(request.getComputeGlobalImageCapabilitySchemaId())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchema.class,
                        GetComputeGlobalImageCapabilitySchemaResponse.Builder
                                ::computeGlobalImageCapabilitySchema)
                .handleResponseHeaderString(
                        "etag", GetComputeGlobalImageCapabilitySchemaResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetComputeGlobalImageCapabilitySchemaResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetComputeGlobalImageCapabilitySchemaVersionResponse
            getComputeGlobalImageCapabilitySchemaVersion(
                    GetComputeGlobalImageCapabilitySchemaVersionRequest request) {

        Validate.notBlank(
                request.getComputeGlobalImageCapabilitySchemaId(),
                "computeGlobalImageCapabilitySchemaId must not be blank");

        Validate.notBlank(
                request.getComputeGlobalImageCapabilitySchemaVersionName(),
                "computeGlobalImageCapabilitySchemaVersionName must not be blank");

        return clientCall(request, GetComputeGlobalImageCapabilitySchemaVersionResponse::builder)
                .logger(LOG, "getComputeGlobalImageCapabilitySchemaVersion")
                .serviceDetails(
                        "Compute",
                        "GetComputeGlobalImageCapabilitySchemaVersion",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchemaVersion/GetComputeGlobalImageCapabilitySchemaVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetComputeGlobalImageCapabilitySchemaVersionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeGlobalImageCapabilitySchemas")
                .appendPathParam(request.getComputeGlobalImageCapabilitySchemaId())
                .appendPathParam("versions")
                .appendPathParam(request.getComputeGlobalImageCapabilitySchemaVersionName())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaVersion.class,
                        GetComputeGlobalImageCapabilitySchemaVersionResponse.Builder
                                ::computeGlobalImageCapabilitySchemaVersion)
                .handleResponseHeaderString(
                        "etag", GetComputeGlobalImageCapabilitySchemaVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetComputeGlobalImageCapabilitySchemaVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetComputeImageCapabilitySchemaResponse getComputeImageCapabilitySchema(
            GetComputeImageCapabilitySchemaRequest request) {

        Validate.notBlank(
                request.getComputeImageCapabilitySchemaId(),
                "computeImageCapabilitySchemaId must not be blank");

        return clientCall(request, GetComputeImageCapabilitySchemaResponse::builder)
                .logger(LOG, "getComputeImageCapabilitySchema")
                .serviceDetails(
                        "Compute",
                        "GetComputeImageCapabilitySchema",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/GetComputeImageCapabilitySchema")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetComputeImageCapabilitySchemaRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeImageCapabilitySchemas")
                .appendPathParam(request.getComputeImageCapabilitySchemaId())
                .appendQueryParam("isMergeEnabled", request.getIsMergeEnabled())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeImageCapabilitySchema.class,
                        GetComputeImageCapabilitySchemaResponse.Builder
                                ::computeImageCapabilitySchema)
                .handleResponseHeaderString(
                        "etag", GetComputeImageCapabilitySchemaResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetComputeImageCapabilitySchemaResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetConsoleHistoryResponse getConsoleHistory(GetConsoleHistoryRequest request) {

        Validate.notBlank(
                request.getInstanceConsoleHistoryId(),
                "instanceConsoleHistoryId must not be blank");

        return clientCall(request, GetConsoleHistoryResponse::builder)
                .logger(LOG, "getConsoleHistory")
                .serviceDetails(
                        "Compute",
                        "GetConsoleHistory",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/GetConsoleHistory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConsoleHistoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleHistories")
                .appendPathParam(request.getInstanceConsoleHistoryId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.ConsoleHistory.class,
                        GetConsoleHistoryResponse.Builder::consoleHistory)
                .handleResponseHeaderString("etag", GetConsoleHistoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConsoleHistoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetConsoleHistoryContentResponse getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request) {

        Validate.notBlank(
                request.getInstanceConsoleHistoryId(),
                "instanceConsoleHistoryId must not be blank");

        return clientCall(request, GetConsoleHistoryContentResponse::builder)
                .logger(LOG, "getConsoleHistoryContent")
                .serviceDetails(
                        "Compute",
                        "GetConsoleHistoryContent",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/GetConsoleHistoryContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConsoleHistoryContentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleHistories")
                .appendPathParam(request.getInstanceConsoleHistoryId())
                .appendPathParam("data")
                .appendQueryParam("offset", request.getOffset())
                .appendQueryParam("length", request.getLength())
                .accept("application/json")
                .handleBody(String.class, GetConsoleHistoryContentResponse.Builder::value)
                .handleResponseHeaderInteger(
                        "opc-bytes-remaining",
                        GetConsoleHistoryContentResponse.Builder::opcBytesRemaining)
                .handleResponseHeaderString(
                        "opc-request-id", GetConsoleHistoryContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDedicatedVmHostResponse getDedicatedVmHost(GetDedicatedVmHostRequest request) {

        Validate.notBlank(request.getDedicatedVmHostId(), "dedicatedVmHostId must not be blank");

        return clientCall(request, GetDedicatedVmHostResponse::builder)
                .logger(LOG, "getDedicatedVmHost")
                .serviceDetails(
                        "Compute",
                        "GetDedicatedVmHost",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/GetDedicatedVmHost")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDedicatedVmHostRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dedicatedVmHosts")
                .appendPathParam(request.getDedicatedVmHostId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.DedicatedVmHost.class,
                        GetDedicatedVmHostResponse.Builder::dedicatedVmHost)
                .handleResponseHeaderString("etag", GetDedicatedVmHostResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDedicatedVmHostResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetImageResponse getImage(GetImageRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");

        return clientCall(request, GetImageResponse::builder)
                .logger(LOG, "getImage")
                .serviceDetails(
                        "Compute",
                        "GetImage",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/GetImage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBody(com.oracle.bmc.core.model.Image.class, GetImageResponse.Builder::image)
                .handleResponseHeaderString("etag", GetImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetImageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetImageShapeCompatibilityEntryResponse getImageShapeCompatibilityEntry(
            GetImageShapeCompatibilityEntryRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");

        Validate.notBlank(request.getShapeName(), "shapeName must not be blank");

        return clientCall(request, GetImageShapeCompatibilityEntryResponse::builder)
                .logger(LOG, "getImageShapeCompatibilityEntry")
                .serviceDetails(
                        "Compute",
                        "GetImageShapeCompatibilityEntry",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/GetImageShapeCompatibilityEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetImageShapeCompatibilityEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .appendPathParam("shapes")
                .appendPathParam(request.getShapeName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.ImageShapeCompatibilityEntry.class,
                        GetImageShapeCompatibilityEntryResponse.Builder
                                ::imageShapeCompatibilityEntry)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetImageShapeCompatibilityEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInstanceResponse getInstance(GetInstanceRequest request) {

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");

        return clientCall(request, GetInstanceResponse::builder)
                .logger(LOG, "getInstance")
                .serviceDetails(
                        "Compute",
                        "GetInstance",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/GetInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInstanceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.Instance.class,
                        GetInstanceResponse.Builder::instance)
                .handleResponseHeaderString("etag", GetInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInstanceConsoleConnectionResponse getInstanceConsoleConnection(
            GetInstanceConsoleConnectionRequest request) {

        Validate.notBlank(
                request.getInstanceConsoleConnectionId(),
                "instanceConsoleConnectionId must not be blank");

        return clientCall(request, GetInstanceConsoleConnectionResponse::builder)
                .logger(LOG, "getInstanceConsoleConnection")
                .serviceDetails(
                        "Compute",
                        "GetInstanceConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/GetInstanceConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInstanceConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleConnections")
                .appendPathParam(request.getInstanceConsoleConnectionId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.InstanceConsoleConnection.class,
                        GetInstanceConsoleConnectionResponse.Builder::instanceConsoleConnection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetInstanceConsoleConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInstanceMaintenanceEventResponse getInstanceMaintenanceEvent(
            GetInstanceMaintenanceEventRequest request) {

        Validate.notBlank(
                request.getInstanceMaintenanceEventId(),
                "instanceMaintenanceEventId must not be blank");

        return clientCall(request, GetInstanceMaintenanceEventResponse::builder)
                .logger(LOG, "getInstanceMaintenanceEvent")
                .serviceDetails(
                        "Compute",
                        "GetInstanceMaintenanceEvent",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceMaintenanceEvent/GetInstanceMaintenanceEvent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInstanceMaintenanceEventRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceMaintenanceEvents")
                .appendPathParam(request.getInstanceMaintenanceEventId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.InstanceMaintenanceEvent.class,
                        GetInstanceMaintenanceEventResponse.Builder::instanceMaintenanceEvent)
                .handleResponseHeaderString(
                        "etag", GetInstanceMaintenanceEventResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInstanceMaintenanceEventResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInstanceMaintenanceRebootResponse getInstanceMaintenanceReboot(
            GetInstanceMaintenanceRebootRequest request) {

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");

        return clientCall(request, GetInstanceMaintenanceRebootResponse::builder)
                .logger(LOG, "getInstanceMaintenanceReboot")
                .serviceDetails(
                        "Compute",
                        "GetInstanceMaintenanceReboot",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceMaintenanceReboot/GetInstanceMaintenanceReboot")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInstanceMaintenanceRebootRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .appendPathParam("maintenanceReboot")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.InstanceMaintenanceReboot.class,
                        GetInstanceMaintenanceRebootResponse.Builder::instanceMaintenanceReboot)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetInstanceMaintenanceRebootResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMeasuredBootReportResponse getMeasuredBootReport(
            GetMeasuredBootReportRequest request) {

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");

        return clientCall(request, GetMeasuredBootReportResponse::builder)
                .logger(LOG, "getMeasuredBootReport")
                .serviceDetails(
                        "Compute",
                        "GetMeasuredBootReport",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/MeasuredBootReport/GetMeasuredBootReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMeasuredBootReportRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .appendPathParam("measuredBootReport")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.MeasuredBootReport.class,
                        GetMeasuredBootReportResponse.Builder::measuredBootReport)
                .handleResponseHeaderString("etag", GetMeasuredBootReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMeasuredBootReportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVnicAttachmentResponse getVnicAttachment(GetVnicAttachmentRequest request) {

        Validate.notBlank(request.getVnicAttachmentId(), "vnicAttachmentId must not be blank");

        return clientCall(request, GetVnicAttachmentResponse::builder)
                .logger(LOG, "getVnicAttachment")
                .serviceDetails(
                        "Compute",
                        "GetVnicAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/GetVnicAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVnicAttachmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vnicAttachments")
                .appendPathParam(request.getVnicAttachmentId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.VnicAttachment.class,
                        GetVnicAttachmentResponse.Builder::vnicAttachment)
                .handleResponseHeaderString("etag", GetVnicAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVnicAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVolumeAttachmentResponse getVolumeAttachment(GetVolumeAttachmentRequest request) {

        Validate.notBlank(request.getVolumeAttachmentId(), "volumeAttachmentId must not be blank");

        return clientCall(request, GetVolumeAttachmentResponse::builder)
                .logger(LOG, "getVolumeAttachment")
                .serviceDetails(
                        "Compute",
                        "GetVolumeAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/GetVolumeAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVolumeAttachmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeAttachments")
                .appendPathParam(request.getVolumeAttachmentId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.VolumeAttachment.class,
                        GetVolumeAttachmentResponse.Builder::volumeAttachment)
                .handleResponseHeaderString("etag", GetVolumeAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVolumeAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWindowsInstanceInitialCredentialsResponse getWindowsInstanceInitialCredentials(
            GetWindowsInstanceInitialCredentialsRequest request) {

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");

        return clientCall(request, GetWindowsInstanceInitialCredentialsResponse::builder)
                .logger(LOG, "getWindowsInstanceInitialCredentials")
                .serviceDetails(
                        "Compute",
                        "GetWindowsInstanceInitialCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceCredentials/GetWindowsInstanceInitialCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWindowsInstanceInitialCredentialsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .appendPathParam("initialCredentials")
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.InstanceCredentials.class,
                        GetWindowsInstanceInitialCredentialsResponse.Builder::instanceCredentials)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetWindowsInstanceInitialCredentialsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public InstanceActionResponse instanceAction(InstanceActionRequest request) {

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");
        Objects.requireNonNull(request.getAction(), "action is required");

        return clientCall(request, InstanceActionResponse::builder)
                .logger(LOG, "instanceAction")
                .serviceDetails(
                        "Compute",
                        "InstanceAction",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/InstanceAction")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstanceActionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .appendQueryParam("action", request.getAction())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Instance.class,
                        InstanceActionResponse.Builder::instance)
                .handleResponseHeaderString("etag", InstanceActionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", InstanceActionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public LaunchInstanceResponse launchInstance(LaunchInstanceRequest request) {
        Objects.requireNonNull(
                request.getLaunchInstanceDetails(), "launchInstanceDetails is required");

        return clientCall(request, LaunchInstanceResponse::builder)
                .logger(LOG, "launchInstance")
                .serviceDetails(
                        "Compute",
                        "LaunchInstance",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/LaunchInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LaunchInstanceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Instance.class,
                        LaunchInstanceResponse.Builder::instance)
                .handleResponseHeaderString("etag", LaunchInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", LaunchInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", LaunchInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ListAppCatalogListingResourceVersionsResponse listAppCatalogListingResourceVersions(
            ListAppCatalogListingResourceVersionsRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, ListAppCatalogListingResourceVersionsResponse::builder)
                .logger(LOG, "listAppCatalogListingResourceVersions")
                .serviceDetails(
                        "Compute",
                        "ListAppCatalogListingResourceVersions",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingResourceVersionSummary/ListAppCatalogListingResourceVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAppCatalogListingResourceVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("appCatalogListings")
                .appendPathParam(request.getListingId())
                .appendPathParam("resourceVersions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.core.model.AppCatalogListingResourceVersionSummary.class,
                        ListAppCatalogListingResourceVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAppCatalogListingResourceVersionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAppCatalogListingResourceVersionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAppCatalogListingsResponse listAppCatalogListings(
            ListAppCatalogListingsRequest request) {

        return clientCall(request, ListAppCatalogListingsResponse::builder)
                .logger(LOG, "listAppCatalogListings")
                .serviceDetails(
                        "Compute",
                        "ListAppCatalogListings",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingSummary/ListAppCatalogListings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAppCatalogListingsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("appCatalogListings")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("publisherName", request.getPublisherName())
                .appendQueryParam("publisherType", request.getPublisherType())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.core.model.AppCatalogListingSummary.class,
                        ListAppCatalogListingsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAppCatalogListingsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAppCatalogListingsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAppCatalogSubscriptionsResponse listAppCatalogSubscriptions(
            ListAppCatalogSubscriptionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAppCatalogSubscriptionsResponse::builder)
                .logger(LOG, "listAppCatalogSubscriptions")
                .serviceDetails(
                        "Compute",
                        "ListAppCatalogSubscriptions",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogSubscriptionSummary/ListAppCatalogSubscriptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAppCatalogSubscriptionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("appCatalogSubscriptions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("listingId", request.getListingId())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.core.model.AppCatalogSubscriptionSummary.class,
                        ListAppCatalogSubscriptionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAppCatalogSubscriptionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAppCatalogSubscriptionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListBootVolumeAttachmentsResponse listBootVolumeAttachments(
            ListBootVolumeAttachmentsRequest request) {
        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBootVolumeAttachmentsResponse::builder)
                .logger(LOG, "listBootVolumeAttachments")
                .serviceDetails(
                        "Compute",
                        "ListBootVolumeAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeAttachment/ListBootVolumeAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBootVolumeAttachmentsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("bootVolumeAttachments")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("instanceId", request.getInstanceId())
                .appendQueryParam("bootVolumeId", request.getBootVolumeId())
                .accept("application/json, application/x-json-stream")
                .handleBodyList(
                        com.oracle.bmc.core.model.BootVolumeAttachment.class,
                        ListBootVolumeAttachmentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListBootVolumeAttachmentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListBootVolumeAttachmentsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeCapacityReservationInstanceShapesResponse
            listComputeCapacityReservationInstanceShapes(
                    ListComputeCapacityReservationInstanceShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListComputeCapacityReservationInstanceShapesResponse::builder)
                .logger(LOG, "listComputeCapacityReservationInstanceShapes")
                .serviceDetails(
                        "Compute",
                        "ListComputeCapacityReservationInstanceShapes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservationInstanceShapeSummary/ListComputeCapacityReservationInstanceShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeCapacityReservationInstanceShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityReservationInstanceShapes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.ComputeCapacityReservationInstanceShapeSummary
                                .class,
                        ListComputeCapacityReservationInstanceShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListComputeCapacityReservationInstanceShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputeCapacityReservationInstanceShapesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeCapacityReservationInstancesResponse listComputeCapacityReservationInstances(
            ListComputeCapacityReservationInstancesRequest request) {

        Validate.notBlank(
                request.getCapacityReservationId(), "capacityReservationId must not be blank");

        return clientCall(request, ListComputeCapacityReservationInstancesResponse::builder)
                .logger(LOG, "listComputeCapacityReservationInstances")
                .serviceDetails(
                        "Compute",
                        "ListComputeCapacityReservationInstances",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CapacityReservationInstanceSummary/ListComputeCapacityReservationInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeCapacityReservationInstancesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityReservations")
                .appendPathParam(request.getCapacityReservationId())
                .appendPathParam("instances")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json, application/x-json-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.CapacityReservationInstanceSummary.class,
                        ListComputeCapacityReservationInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListComputeCapacityReservationInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputeCapacityReservationInstancesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeCapacityReservationsResponse listComputeCapacityReservations(
            ListComputeCapacityReservationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListComputeCapacityReservationsResponse::builder)
                .logger(LOG, "listComputeCapacityReservations")
                .serviceDetails(
                        "Compute",
                        "ListComputeCapacityReservations",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/ListComputeCapacityReservations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeCapacityReservationsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityReservations")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json, application/x-json-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.ComputeCapacityReservationSummary.class,
                        ListComputeCapacityReservationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListComputeCapacityReservationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputeCapacityReservationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeCapacityTopologiesResponse listComputeCapacityTopologies(
            ListComputeCapacityTopologiesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListComputeCapacityTopologiesResponse::builder)
                .logger(LOG, "listComputeCapacityTopologies")
                .serviceDetails(
                        "Compute",
                        "ListComputeCapacityTopologies",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityTopology/ListComputeCapacityTopologies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeCapacityTopologiesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityTopologies")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeCapacityTopologyCollection.class,
                        ListComputeCapacityTopologiesResponse.Builder
                                ::computeCapacityTopologyCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListComputeCapacityTopologiesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputeCapacityTopologiesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeCapacityTopologyComputeBareMetalHostsResponse
            listComputeCapacityTopologyComputeBareMetalHosts(
                    ListComputeCapacityTopologyComputeBareMetalHostsRequest request) {

        Validate.notBlank(
                request.getComputeCapacityTopologyId(),
                "computeCapacityTopologyId must not be blank");

        return clientCall(
                        request, ListComputeCapacityTopologyComputeBareMetalHostsResponse::builder)
                .logger(LOG, "listComputeCapacityTopologyComputeBareMetalHosts")
                .serviceDetails(
                        "Compute",
                        "ListComputeCapacityTopologyComputeBareMetalHosts",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeBareMetalHost/ListComputeCapacityTopologyComputeBareMetalHosts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeCapacityTopologyComputeBareMetalHostsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityTopologies")
                .appendPathParam(request.getComputeCapacityTopologyId())
                .appendPathParam("computeBareMetalHosts")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("computeHpcIslandId", request.getComputeHpcIslandId())
                .appendQueryParam("computeNetworkBlockId", request.getComputeNetworkBlockId())
                .appendQueryParam("computeLocalBlockId", request.getComputeLocalBlockId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeBareMetalHostCollection.class,
                        ListComputeCapacityTopologyComputeBareMetalHostsResponse.Builder
                                ::computeBareMetalHostCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListComputeCapacityTopologyComputeBareMetalHostsResponse.Builder
                                ::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputeCapacityTopologyComputeBareMetalHostsResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeCapacityTopologyComputeHpcIslandsResponse
            listComputeCapacityTopologyComputeHpcIslands(
                    ListComputeCapacityTopologyComputeHpcIslandsRequest request) {

        Validate.notBlank(
                request.getComputeCapacityTopologyId(),
                "computeCapacityTopologyId must not be blank");

        return clientCall(request, ListComputeCapacityTopologyComputeHpcIslandsResponse::builder)
                .logger(LOG, "listComputeCapacityTopologyComputeHpcIslands")
                .serviceDetails(
                        "Compute",
                        "ListComputeCapacityTopologyComputeHpcIslands",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeHpcIsland/ListComputeCapacityTopologyComputeHpcIslands")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeCapacityTopologyComputeHpcIslandsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityTopologies")
                .appendPathParam(request.getComputeCapacityTopologyId())
                .appendPathParam("computeHpcIslands")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeHpcIslandCollection.class,
                        ListComputeCapacityTopologyComputeHpcIslandsResponse.Builder
                                ::computeHpcIslandCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListComputeCapacityTopologyComputeHpcIslandsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputeCapacityTopologyComputeHpcIslandsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeCapacityTopologyComputeNetworkBlocksResponse
            listComputeCapacityTopologyComputeNetworkBlocks(
                    ListComputeCapacityTopologyComputeNetworkBlocksRequest request) {

        Validate.notBlank(
                request.getComputeCapacityTopologyId(),
                "computeCapacityTopologyId must not be blank");

        return clientCall(request, ListComputeCapacityTopologyComputeNetworkBlocksResponse::builder)
                .logger(LOG, "listComputeCapacityTopologyComputeNetworkBlocks")
                .serviceDetails(
                        "Compute",
                        "ListComputeCapacityTopologyComputeNetworkBlocks",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeNetworkBlock/ListComputeCapacityTopologyComputeNetworkBlocks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeCapacityTopologyComputeNetworkBlocksRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityTopologies")
                .appendPathParam(request.getComputeCapacityTopologyId())
                .appendPathParam("computeNetworkBlocks")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("computeHpcIslandId", request.getComputeHpcIslandId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeNetworkBlockCollection.class,
                        ListComputeCapacityTopologyComputeNetworkBlocksResponse.Builder
                                ::computeNetworkBlockCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListComputeCapacityTopologyComputeNetworkBlocksResponse.Builder
                                ::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputeCapacityTopologyComputeNetworkBlocksResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeClustersResponse listComputeClusters(ListComputeClustersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListComputeClustersResponse::builder)
                .logger(LOG, "listComputeClusters")
                .serviceDetails(
                        "Compute",
                        "ListComputeClusters",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/ListComputeClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeClustersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeClusters")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.ComputeClusterCollection.class,
                        ListComputeClustersResponse.Builder::computeClusterCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListComputeClustersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListComputeClustersResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeGlobalImageCapabilitySchemaVersionsResponse
            listComputeGlobalImageCapabilitySchemaVersions(
                    ListComputeGlobalImageCapabilitySchemaVersionsRequest request) {

        Validate.notBlank(
                request.getComputeGlobalImageCapabilitySchemaId(),
                "computeGlobalImageCapabilitySchemaId must not be blank");

        return clientCall(request, ListComputeGlobalImageCapabilitySchemaVersionsResponse::builder)
                .logger(LOG, "listComputeGlobalImageCapabilitySchemaVersions")
                .serviceDetails(
                        "Compute",
                        "ListComputeGlobalImageCapabilitySchemaVersions",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchemaVersionSummary/ListComputeGlobalImageCapabilitySchemaVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeGlobalImageCapabilitySchemaVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeGlobalImageCapabilitySchemas")
                .appendPathParam(request.getComputeGlobalImageCapabilitySchemaId())
                .appendPathParam("versions")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaVersionSummary
                                .class,
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeGlobalImageCapabilitySchemasResponse listComputeGlobalImageCapabilitySchemas(
            ListComputeGlobalImageCapabilitySchemasRequest request) {

        return clientCall(request, ListComputeGlobalImageCapabilitySchemasResponse::builder)
                .logger(LOG, "listComputeGlobalImageCapabilitySchemas")
                .serviceDetails(
                        "Compute",
                        "ListComputeGlobalImageCapabilitySchemas",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchemaSummary/ListComputeGlobalImageCapabilitySchemas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeGlobalImageCapabilitySchemasRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeGlobalImageCapabilitySchemas")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaSummary.class,
                        ListComputeGlobalImageCapabilitySchemasResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListComputeGlobalImageCapabilitySchemasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputeGlobalImageCapabilitySchemasResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputeImageCapabilitySchemasResponse listComputeImageCapabilitySchemas(
            ListComputeImageCapabilitySchemasRequest request) {

        return clientCall(request, ListComputeImageCapabilitySchemasResponse::builder)
                .logger(LOG, "listComputeImageCapabilitySchemas")
                .serviceDetails(
                        "Compute",
                        "ListComputeImageCapabilitySchemas",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchemaSummary/ListComputeImageCapabilitySchemas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputeImageCapabilitySchemasRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeImageCapabilitySchemas")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("imageId", request.getImageId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.core.model.ComputeImageCapabilitySchemaSummary.class,
                        ListComputeImageCapabilitySchemasResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListComputeImageCapabilitySchemasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputeImageCapabilitySchemasResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListConsoleHistoriesResponse listConsoleHistories(ListConsoleHistoriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListConsoleHistoriesResponse::builder)
                .logger(LOG, "listConsoleHistories")
                .serviceDetails(
                        "Compute",
                        "ListConsoleHistories",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/ListConsoleHistories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConsoleHistoriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleHistories")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("instanceId", request.getInstanceId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.ConsoleHistory.class,
                        ListConsoleHistoriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListConsoleHistoriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListConsoleHistoriesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDedicatedVmHostInstanceShapesResponse listDedicatedVmHostInstanceShapes(
            ListDedicatedVmHostInstanceShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDedicatedVmHostInstanceShapesResponse::builder)
                .logger(LOG, "listDedicatedVmHostInstanceShapes")
                .serviceDetails(
                        "Compute",
                        "ListDedicatedVmHostInstanceShapes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostInstanceShapeSummary/ListDedicatedVmHostInstanceShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDedicatedVmHostInstanceShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dedicatedVmHostInstanceShapes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dedicatedVmHostShape", request.getDedicatedVmHostShape())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.DedicatedVmHostInstanceShapeSummary.class,
                        ListDedicatedVmHostInstanceShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDedicatedVmHostInstanceShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDedicatedVmHostInstanceShapesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDedicatedVmHostInstancesResponse listDedicatedVmHostInstances(
            ListDedicatedVmHostInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getDedicatedVmHostId(), "dedicatedVmHostId must not be blank");

        return clientCall(request, ListDedicatedVmHostInstancesResponse::builder)
                .logger(LOG, "listDedicatedVmHostInstances")
                .serviceDetails(
                        "Compute",
                        "ListDedicatedVmHostInstances",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostInstanceSummary/ListDedicatedVmHostInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDedicatedVmHostInstancesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dedicatedVmHosts")
                .appendPathParam(request.getDedicatedVmHostId())
                .appendPathParam("instances")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json, application/x-json-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.DedicatedVmHostInstanceSummary.class,
                        ListDedicatedVmHostInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListDedicatedVmHostInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDedicatedVmHostInstancesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDedicatedVmHostShapesResponse listDedicatedVmHostShapes(
            ListDedicatedVmHostShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDedicatedVmHostShapesResponse::builder)
                .logger(LOG, "listDedicatedVmHostShapes")
                .serviceDetails(
                        "Compute",
                        "ListDedicatedVmHostShapes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostShapeSummary/ListDedicatedVmHostShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDedicatedVmHostShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dedicatedVmHostShapes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("instanceShapeName", request.getInstanceShapeName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.DedicatedVmHostShapeSummary.class,
                        ListDedicatedVmHostShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListDedicatedVmHostShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDedicatedVmHostShapesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDedicatedVmHostsResponse listDedicatedVmHosts(ListDedicatedVmHostsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDedicatedVmHostsResponse::builder)
                .logger(LOG, "listDedicatedVmHosts")
                .serviceDetails(
                        "Compute",
                        "ListDedicatedVmHosts",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostSummary/ListDedicatedVmHosts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDedicatedVmHostsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dedicatedVmHosts")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("instanceShapeName", request.getInstanceShapeName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam(
                        "remainingMemoryInGBsGreaterThanOrEqualTo",
                        request.getRemainingMemoryInGBsGreaterThanOrEqualTo())
                .appendQueryParam(
                        "remainingOcpusGreaterThanOrEqualTo",
                        request.getRemainingOcpusGreaterThanOrEqualTo())
                .accept("application/json, application/x-json-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.DedicatedVmHostSummary.class,
                        ListDedicatedVmHostsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListDedicatedVmHostsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDedicatedVmHostsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListImageShapeCompatibilityEntriesResponse listImageShapeCompatibilityEntries(
            ListImageShapeCompatibilityEntriesRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");

        return clientCall(request, ListImageShapeCompatibilityEntriesResponse::builder)
                .logger(LOG, "listImageShapeCompatibilityEntries")
                .serviceDetails(
                        "Compute",
                        "ListImageShapeCompatibilityEntries",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/ListImageShapeCompatibilityEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListImageShapeCompatibilityEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .appendPathParam("shapes")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.core.model.ImageShapeCompatibilitySummary.class,
                        ListImageShapeCompatibilityEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListImageShapeCompatibilityEntriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListImageShapeCompatibilityEntriesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListImagesResponse listImages(ListImagesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListImagesResponse::builder)
                .logger(LOG, "listImages")
                .serviceDetails(
                        "Compute",
                        "ListImages",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/ListImages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListImagesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("operatingSystem", request.getOperatingSystem())
                .appendQueryParam("operatingSystemVersion", request.getOperatingSystemVersion())
                .appendQueryParam("shape", request.getShape())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.core.model.Image.class, ListImagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListImagesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListImagesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInstanceConsoleConnectionsResponse listInstanceConsoleConnections(
            ListInstanceConsoleConnectionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInstanceConsoleConnectionsResponse::builder)
                .logger(LOG, "listInstanceConsoleConnections")
                .serviceDetails(
                        "Compute",
                        "ListInstanceConsoleConnections",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/ListInstanceConsoleConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInstanceConsoleConnectionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleConnections")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("instanceId", request.getInstanceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.InstanceConsoleConnection.class,
                        ListInstanceConsoleConnectionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListInstanceConsoleConnectionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInstanceConsoleConnectionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInstanceDevicesResponse listInstanceDevices(ListInstanceDevicesRequest request) {

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");

        return clientCall(request, ListInstanceDevicesResponse::builder)
                .logger(LOG, "listInstanceDevices")
                .serviceDetails(
                        "Compute",
                        "ListInstanceDevices",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Device/ListInstanceDevices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInstanceDevicesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .appendPathParam("devices")
                .appendQueryParam("isAvailable", request.getIsAvailable())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.Device.class,
                        ListInstanceDevicesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListInstanceDevicesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListInstanceDevicesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInstanceMaintenanceEventsResponse listInstanceMaintenanceEvents(
            ListInstanceMaintenanceEventsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInstanceMaintenanceEventsResponse::builder)
                .logger(LOG, "listInstanceMaintenanceEvents")
                .serviceDetails(
                        "Compute",
                        "ListInstanceMaintenanceEvents",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceMaintenanceEventSummary/ListInstanceMaintenanceEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInstanceMaintenanceEventsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceMaintenanceEvents")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("instanceId", request.getInstanceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("correlationToken", request.getCorrelationToken())
                .appendQueryParam("instanceAction", request.getInstanceAction())
                .appendQueryParam(
                        "timeWindowStartGreaterThanOrEqualTo",
                        request.getTimeWindowStartGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeWindowStartLessThanOrEqualTo",
                        request.getTimeWindowStartLessThanOrEqualTo())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.InstanceMaintenanceEventSummary.class,
                        ListInstanceMaintenanceEventsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListInstanceMaintenanceEventsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInstanceMaintenanceEventsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInstancesResponse::builder)
                .logger(LOG, "listInstances")
                .serviceDetails(
                        "Compute",
                        "ListInstances",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/ListInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInstancesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("capacityReservationId", request.getCapacityReservationId())
                .appendQueryParam("computeClusterId", request.getComputeClusterId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json, application/x-json-stream")
                .handleBodyList(
                        com.oracle.bmc.core.model.Instance.class,
                        ListInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListInstancesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListShapesResponse listShapes(ListShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListShapesResponse::builder)
                .logger(LOG, "listShapes")
                .serviceDetails(
                        "Compute",
                        "ListShapes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Shape/ListShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("shapes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("imageId", request.getImageId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.Shape.class, ListShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListShapesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVnicAttachmentsResponse listVnicAttachments(ListVnicAttachmentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVnicAttachmentsResponse::builder)
                .logger(LOG, "listVnicAttachments")
                .serviceDetails(
                        "Compute",
                        "ListVnicAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/ListVnicAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVnicAttachmentsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vnicAttachments")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("instanceId", request.getInstanceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("vnicId", request.getVnicId())
                .accept("application/json, application/x-json-stream")
                .handleBodyList(
                        com.oracle.bmc.core.model.VnicAttachment.class,
                        ListVnicAttachmentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVnicAttachmentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVnicAttachmentsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVolumeAttachmentsResponse listVolumeAttachments(
            ListVolumeAttachmentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVolumeAttachmentsResponse::builder)
                .logger(LOG, "listVolumeAttachments")
                .serviceDetails(
                        "Compute",
                        "ListVolumeAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/ListVolumeAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVolumeAttachmentsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeAttachments")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("instanceId", request.getInstanceId())
                .appendQueryParam("volumeId", request.getVolumeId())
                .accept("application/json, application/x-json-stream")
                .handleBodyList(
                        com.oracle.bmc.core.model.VolumeAttachment.class,
                        ListVolumeAttachmentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVolumeAttachmentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVolumeAttachmentsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveImageShapeCompatibilityEntryResponse removeImageShapeCompatibilityEntry(
            RemoveImageShapeCompatibilityEntryRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");

        Validate.notBlank(request.getShapeName(), "shapeName must not be blank");

        return clientCall(request, RemoveImageShapeCompatibilityEntryResponse::builder)
                .logger(LOG, "removeImageShapeCompatibilityEntry")
                .serviceDetails(
                        "Compute",
                        "RemoveImageShapeCompatibilityEntry",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/RemoveImageShapeCompatibilityEntry")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(RemoveImageShapeCompatibilityEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .appendPathParam("shapes")
                .appendPathParam(request.getShapeName())
                .accept("application/json")
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveImageShapeCompatibilityEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request) {

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");

        return clientCall(request, TerminateInstanceResponse::builder)
                .logger(LOG, "terminateInstance")
                .serviceDetails("Compute", "TerminateInstance", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(TerminateInstanceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .appendQueryParam("preserveBootVolume", request.getPreserveBootVolume())
                .appendQueryParam(
                        "preserveDataVolumesCreatedAtLaunch",
                        request.getPreserveDataVolumesCreatedAtLaunch())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", TerminateInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateComputeCapacityReservationResponse updateComputeCapacityReservation(
            UpdateComputeCapacityReservationRequest request) {

        Validate.notBlank(
                request.getCapacityReservationId(), "capacityReservationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateComputeCapacityReservationDetails(),
                "updateComputeCapacityReservationDetails is required");

        return clientCall(request, UpdateComputeCapacityReservationResponse::builder)
                .logger(LOG, "updateComputeCapacityReservation")
                .serviceDetails(
                        "Compute",
                        "UpdateComputeCapacityReservation",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/UpdateComputeCapacityReservation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateComputeCapacityReservationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityReservations")
                .appendPathParam(request.getCapacityReservationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateComputeCapacityReservationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateComputeCapacityReservationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateComputeCapacityTopologyResponse updateComputeCapacityTopology(
            UpdateComputeCapacityTopologyRequest request) {

        Validate.notBlank(
                request.getComputeCapacityTopologyId(),
                "computeCapacityTopologyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateComputeCapacityTopologyDetails(),
                "updateComputeCapacityTopologyDetails is required");

        return clientCall(request, UpdateComputeCapacityTopologyResponse::builder)
                .logger(LOG, "updateComputeCapacityTopology")
                .serviceDetails(
                        "Compute",
                        "UpdateComputeCapacityTopology",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityTopology/UpdateComputeCapacityTopology")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateComputeCapacityTopologyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeCapacityTopologies")
                .appendPathParam(request.getComputeCapacityTopologyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateComputeCapacityTopologyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateComputeCapacityTopologyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateComputeClusterResponse updateComputeCluster(UpdateComputeClusterRequest request) {

        Validate.notBlank(request.getComputeClusterId(), "computeClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateComputeClusterDetails(),
                "updateComputeClusterDetails is required");

        return clientCall(request, UpdateComputeClusterResponse::builder)
                .logger(LOG, "updateComputeCluster")
                .serviceDetails(
                        "Compute",
                        "UpdateComputeCluster",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/UpdateComputeCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateComputeClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeClusters")
                .appendPathParam(request.getComputeClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeCluster.class,
                        UpdateComputeClusterResponse.Builder::computeCluster)
                .handleResponseHeaderString("etag", UpdateComputeClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateComputeClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateComputeImageCapabilitySchemaResponse updateComputeImageCapabilitySchema(
            UpdateComputeImageCapabilitySchemaRequest request) {

        Validate.notBlank(
                request.getComputeImageCapabilitySchemaId(),
                "computeImageCapabilitySchemaId must not be blank");
        Objects.requireNonNull(
                request.getUpdateComputeImageCapabilitySchemaDetails(),
                "updateComputeImageCapabilitySchemaDetails is required");

        return clientCall(request, UpdateComputeImageCapabilitySchemaResponse::builder)
                .logger(LOG, "updateComputeImageCapabilitySchema")
                .serviceDetails(
                        "Compute",
                        "UpdateComputeImageCapabilitySchema",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/UpdateComputeImageCapabilitySchema")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateComputeImageCapabilitySchemaRequest::builder)
                .basePath("/20160918")
                .appendPathParam("computeImageCapabilitySchemas")
                .appendPathParam(request.getComputeImageCapabilitySchemaId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ComputeImageCapabilitySchema.class,
                        UpdateComputeImageCapabilitySchemaResponse.Builder
                                ::computeImageCapabilitySchema)
                .handleResponseHeaderString(
                        "etag", UpdateComputeImageCapabilitySchemaResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateComputeImageCapabilitySchemaResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateConsoleHistoryResponse updateConsoleHistory(UpdateConsoleHistoryRequest request) {

        Validate.notBlank(
                request.getInstanceConsoleHistoryId(),
                "instanceConsoleHistoryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateConsoleHistoryDetails(),
                "updateConsoleHistoryDetails is required");

        return clientCall(request, UpdateConsoleHistoryResponse::builder)
                .logger(LOG, "updateConsoleHistory")
                .serviceDetails(
                        "Compute",
                        "UpdateConsoleHistory",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/UpdateConsoleHistory")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConsoleHistoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleHistories")
                .appendPathParam(request.getInstanceConsoleHistoryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ConsoleHistory.class,
                        UpdateConsoleHistoryResponse.Builder::consoleHistory)
                .handleResponseHeaderString("etag", UpdateConsoleHistoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConsoleHistoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDedicatedVmHostResponse updateDedicatedVmHost(
            UpdateDedicatedVmHostRequest request) {

        Validate.notBlank(request.getDedicatedVmHostId(), "dedicatedVmHostId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDedicatedVmHostDetails(),
                "updateDedicatedVmHostDetails is required");

        return clientCall(request, UpdateDedicatedVmHostResponse::builder)
                .logger(LOG, "updateDedicatedVmHost")
                .serviceDetails(
                        "Compute",
                        "UpdateDedicatedVmHost",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/UpdateDedicatedVmHost")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDedicatedVmHostRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dedicatedVmHosts")
                .appendPathParam(request.getDedicatedVmHostId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.DedicatedVmHost.class,
                        UpdateDedicatedVmHostResponse.Builder::dedicatedVmHost)
                .handleResponseHeaderString("etag", UpdateDedicatedVmHostResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDedicatedVmHostResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateImageResponse updateImage(UpdateImageRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");
        Objects.requireNonNull(request.getUpdateImageDetails(), "updateImageDetails is required");

        return clientCall(request, UpdateImageResponse::builder)
                .logger(LOG, "updateImage")
                .serviceDetails(
                        "Compute",
                        "UpdateImage",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/UpdateImage")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Image.class, UpdateImageResponse.Builder::image)
                .handleResponseHeaderString("etag", UpdateImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateImageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateInstanceDetails(), "updateInstanceDetails is required");

        return clientCall(request, UpdateInstanceResponse::builder)
                .logger(LOG, "updateInstance")
                .serviceDetails(
                        "Compute",
                        "UpdateInstance",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/UpdateInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInstanceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Instance.class,
                        UpdateInstanceResponse.Builder::instance)
                .handleResponseHeaderString("etag", UpdateInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateInstanceConsoleConnectionResponse updateInstanceConsoleConnection(
            UpdateInstanceConsoleConnectionRequest request) {

        Validate.notBlank(
                request.getInstanceConsoleConnectionId(),
                "instanceConsoleConnectionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateInstanceConsoleConnectionDetails(),
                "updateInstanceConsoleConnectionDetails is required");

        return clientCall(request, UpdateInstanceConsoleConnectionResponse::builder)
                .logger(LOG, "updateInstanceConsoleConnection")
                .serviceDetails(
                        "Compute",
                        "UpdateInstanceConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/UpdateInstanceConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInstanceConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConsoleConnections")
                .appendPathParam(request.getInstanceConsoleConnectionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InstanceConsoleConnection.class,
                        UpdateInstanceConsoleConnectionResponse.Builder::instanceConsoleConnection)
                .handleResponseHeaderString(
                        "etag", UpdateInstanceConsoleConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateInstanceConsoleConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateInstanceMaintenanceEventResponse updateInstanceMaintenanceEvent(
            UpdateInstanceMaintenanceEventRequest request) {

        Validate.notBlank(
                request.getInstanceMaintenanceEventId(),
                "instanceMaintenanceEventId must not be blank");
        Objects.requireNonNull(
                request.getUpdateInstanceMaintenanceEventDetails(),
                "updateInstanceMaintenanceEventDetails is required");

        return clientCall(request, UpdateInstanceMaintenanceEventResponse::builder)
                .logger(LOG, "updateInstanceMaintenanceEvent")
                .serviceDetails(
                        "Compute",
                        "UpdateInstanceMaintenanceEvent",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceMaintenanceEvent/UpdateInstanceMaintenanceEvent")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInstanceMaintenanceEventRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceMaintenanceEvents")
                .appendPathParam(request.getInstanceMaintenanceEventId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateInstanceMaintenanceEventResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateInstanceMaintenanceEventResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateVolumeAttachmentResponse updateVolumeAttachment(
            UpdateVolumeAttachmentRequest request) {

        Validate.notBlank(request.getVolumeAttachmentId(), "volumeAttachmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVolumeAttachmentDetails(),
                "updateVolumeAttachmentDetails is required");

        return clientCall(request, UpdateVolumeAttachmentResponse::builder)
                .logger(LOG, "updateVolumeAttachment")
                .serviceDetails(
                        "Compute",
                        "UpdateVolumeAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/UpdateVolumeAttachment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVolumeAttachmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("volumeAttachments")
                .appendPathParam(request.getVolumeAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VolumeAttachment.class,
                        UpdateVolumeAttachmentResponse.Builder::volumeAttachment)
                .handleResponseHeaderString("etag", UpdateVolumeAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVolumeAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ComputeWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ComputeWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        return new ComputeWaiters(executorService, this, workRequestClient);
    }

    @Override
    public ComputePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ComputeClient(
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
    public ComputeClient(
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
    public ComputeClient(
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
    public ComputeClient(
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
    public ComputeClient(
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
    public ComputeClient(
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
    public ComputeClient(
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
    public ComputeClient(
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
