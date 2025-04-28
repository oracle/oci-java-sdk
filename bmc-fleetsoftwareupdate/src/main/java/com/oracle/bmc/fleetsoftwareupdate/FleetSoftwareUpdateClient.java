/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetsoftwareupdate.requests.*;
import com.oracle.bmc.fleetsoftwareupdate.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public class FleetSoftwareUpdateClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements FleetSoftwareUpdate {
    /** Service instance for FleetSoftwareUpdate. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETSOFTWAREUPDATE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://fleet-software-update.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetSoftwareUpdateClient.class);

    private final FleetSoftwareUpdateWaiters waiters;

    private final FleetSoftwareUpdatePaginators paginators;

    FleetSoftwareUpdateClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    FleetSoftwareUpdateClient(
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
                                    .nameFormat("FleetSoftwareUpdate-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new FleetSoftwareUpdateWaiters(executorService, this);

        this.paginators = new FleetSoftwareUpdatePaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "FleetSoftwareUpdateClient",
                            "getFsuActionOutputContent,getFsuJobOutputContent"));
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
                    Builder, FleetSoftwareUpdateClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "fleetsoftwareupdate";
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
        public FleetSoftwareUpdateClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetSoftwareUpdateClient(
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
    public AbortFsuDiscoveryResponse abortFsuDiscovery(AbortFsuDiscoveryRequest request) {

        Validate.notBlank(request.getFsuDiscoveryId(), "fsuDiscoveryId must not be blank");

        return clientCall(request, AbortFsuDiscoveryResponse::builder)
                .logger(LOG, "abortFsuDiscovery")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "AbortFsuDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscovery/AbortFsuDiscovery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AbortFsuDiscoveryRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuDiscoveries")
                .appendPathParam(request.getFsuDiscoveryId())
                .appendPathParam("actions")
                .appendPathParam("abort")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", AbortFsuDiscoveryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddFsuCollectionTargetsResponse addFsuCollectionTargets(
            AddFsuCollectionTargetsRequest request) {

        Validate.notBlank(request.getFsuCollectionId(), "fsuCollectionId must not be blank");
        Objects.requireNonNull(
                request.getAddFsuCollectionTargetsDetails(),
                "addFsuCollectionTargetsDetails is required");

        return clientCall(request, AddFsuCollectionTargetsResponse::builder)
                .logger(LOG, "addFsuCollectionTargets")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "AddFsuCollectionTargets",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/AddFsuCollectionTargets")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddFsuCollectionTargetsRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .appendPathParam(request.getFsuCollectionId())
                .appendPathParam("targets")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddFsuCollectionTargetsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AddFsuCollectionTargetsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelFsuActionResponse cancelFsuAction(CancelFsuActionRequest request) {

        Validate.notBlank(request.getFsuActionId(), "fsuActionId must not be blank");

        return clientCall(request, CancelFsuActionResponse::builder)
                .logger(LOG, "cancelFsuAction")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "CancelFsuAction",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/CancelFsuAction")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelFsuActionRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuActions")
                .appendPathParam(request.getFsuActionId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelFsuActionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeFsuActionCompartmentResponse changeFsuActionCompartment(
            ChangeFsuActionCompartmentRequest request) {

        Validate.notBlank(request.getFsuActionId(), "fsuActionId must not be blank");
        Objects.requireNonNull(
                request.getChangeFsuActionCompartmentDetails(),
                "changeFsuActionCompartmentDetails is required");

        return clientCall(request, ChangeFsuActionCompartmentResponse::builder)
                .logger(LOG, "changeFsuActionCompartment")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ChangeFsuActionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/ChangeFsuActionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeFsuActionCompartmentRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuActions")
                .appendPathParam(request.getFsuActionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeFsuActionCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeFsuActionCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeFsuCollectionCompartmentResponse changeFsuCollectionCompartment(
            ChangeFsuCollectionCompartmentRequest request) {

        Validate.notBlank(request.getFsuCollectionId(), "fsuCollectionId must not be blank");
        Objects.requireNonNull(
                request.getChangeFsuCollectionCompartmentDetails(),
                "changeFsuCollectionCompartmentDetails is required");

        return clientCall(request, ChangeFsuCollectionCompartmentResponse::builder)
                .logger(LOG, "changeFsuCollectionCompartment")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ChangeFsuCollectionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/ChangeFsuCollectionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeFsuCollectionCompartmentRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .appendPathParam(request.getFsuCollectionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeFsuCollectionCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeFsuCollectionCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeFsuCycleCompartmentResponse changeFsuCycleCompartment(
            ChangeFsuCycleCompartmentRequest request) {

        Validate.notBlank(request.getFsuCycleId(), "fsuCycleId must not be blank");
        Objects.requireNonNull(
                request.getChangeFsuCycleCompartmentDetails(),
                "changeFsuCycleCompartmentDetails is required");

        return clientCall(request, ChangeFsuCycleCompartmentResponse::builder)
                .logger(LOG, "changeFsuCycleCompartment")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ChangeFsuCycleCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycle/ChangeFsuCycleCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeFsuCycleCompartmentRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCycles")
                .appendPathParam(request.getFsuCycleId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeFsuCycleCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeFsuCycleCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeFsuDiscoveryCompartmentResponse changeFsuDiscoveryCompartment(
            ChangeFsuDiscoveryCompartmentRequest request) {

        Validate.notBlank(request.getFsuDiscoveryId(), "fsuDiscoveryId must not be blank");
        Objects.requireNonNull(
                request.getChangeFsuDiscoveryCompartmentDetails(),
                "changeFsuDiscoveryCompartmentDetails is required");

        return clientCall(request, ChangeFsuDiscoveryCompartmentResponse::builder)
                .logger(LOG, "changeFsuDiscoveryCompartment")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ChangeFsuDiscoveryCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscovery/ChangeFsuDiscoveryCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeFsuDiscoveryCompartmentRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuDiscoveries")
                .appendPathParam(request.getFsuDiscoveryId())
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
                        ChangeFsuDiscoveryCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CloneFsuCycleResponse cloneFsuCycle(CloneFsuCycleRequest request) {

        Validate.notBlank(request.getFsuCycleId(), "fsuCycleId must not be blank");
        Objects.requireNonNull(
                request.getCloneFsuCycleDetails(), "cloneFsuCycleDetails is required");

        return clientCall(request, CloneFsuCycleResponse::builder)
                .logger(LOG, "cloneFsuCycle")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "CloneFsuCycle",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycle/CloneFsuCycle")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CloneFsuCycleRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCycles")
                .appendPathParam(request.getFsuCycleId())
                .appendPathParam("actions")
                .appendPathParam("clone")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCycle.class,
                        CloneFsuCycleResponse.Builder::fsuCycle)
                .handleResponseHeaderString(
                        "opc-work-request-id", CloneFsuCycleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CloneFsuCycleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CloneFsuCycleResponse.Builder::etag)
                .handleResponseHeaderString("Location", CloneFsuCycleResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateFsuActionResponse createFsuAction(CreateFsuActionRequest request) {
        Objects.requireNonNull(
                request.getCreateFsuActionDetails(), "createFsuActionDetails is required");

        return clientCall(request, CreateFsuActionResponse::builder)
                .logger(LOG, "createFsuAction")
                .serviceDetails("FleetSoftwareUpdate", "CreateFsuAction", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFsuActionRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuActions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuAction.class,
                        CreateFsuActionResponse.Builder::fsuAction)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateFsuActionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFsuActionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateFsuActionResponse.Builder::etag)
                .handleResponseHeaderString("Location", CreateFsuActionResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateFsuCollectionResponse createFsuCollection(CreateFsuCollectionRequest request) {
        Objects.requireNonNull(
                request.getCreateFsuCollectionDetails(), "createFsuCollectionDetails is required");

        return clientCall(request, CreateFsuCollectionResponse::builder)
                .logger(LOG, "createFsuCollection")
                .serviceDetails("FleetSoftwareUpdate", "CreateFsuCollection", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFsuCollectionRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCollection.class,
                        CreateFsuCollectionResponse.Builder::fsuCollection)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateFsuCollectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFsuCollectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateFsuCollectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "Location", CreateFsuCollectionResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateFsuCycleResponse createFsuCycle(CreateFsuCycleRequest request) {
        Objects.requireNonNull(
                request.getCreateFsuCycleDetails(), "createFsuCycleDetails is required");

        return clientCall(request, CreateFsuCycleResponse::builder)
                .logger(LOG, "createFsuCycle")
                .serviceDetails("FleetSoftwareUpdate", "CreateFsuCycle", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFsuCycleRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCycles")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCycle.class,
                        CreateFsuCycleResponse.Builder::fsuCycle)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateFsuCycleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFsuCycleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateFsuCycleResponse.Builder::etag)
                .handleResponseHeaderString("Location", CreateFsuCycleResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateFsuDiscoveryResponse createFsuDiscovery(CreateFsuDiscoveryRequest request) {
        Objects.requireNonNull(
                request.getCreateFsuDiscoveryDetails(), "createFsuDiscoveryDetails is required");

        return clientCall(request, CreateFsuDiscoveryResponse::builder)
                .logger(LOG, "createFsuDiscovery")
                .serviceDetails("FleetSoftwareUpdate", "CreateFsuDiscovery", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFsuDiscoveryRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuDiscoveries")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscovery.class,
                        CreateFsuDiscoveryResponse.Builder::fsuDiscovery)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateFsuDiscoveryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFsuDiscoveryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateFsuDiscoveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "Location", CreateFsuDiscoveryResponse.Builder::location)
                .callSync();
    }

    @Override
    public DeleteFsuActionResponse deleteFsuAction(DeleteFsuActionRequest request) {

        Validate.notBlank(request.getFsuActionId(), "fsuActionId must not be blank");

        return clientCall(request, DeleteFsuActionResponse::builder)
                .logger(LOG, "deleteFsuAction")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuAction",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/DeleteFsuAction")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFsuActionRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuActions")
                .appendPathParam(request.getFsuActionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteFsuActionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuActionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFsuCollectionResponse deleteFsuCollection(DeleteFsuCollectionRequest request) {

        Validate.notBlank(request.getFsuCollectionId(), "fsuCollectionId must not be blank");

        return clientCall(request, DeleteFsuCollectionResponse::builder)
                .logger(LOG, "deleteFsuCollection")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuCollection",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/DeleteFsuCollection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFsuCollectionRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .appendPathParam(request.getFsuCollectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteFsuCollectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuCollectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFsuCollectionTargetResponse deleteFsuCollectionTarget(
            DeleteFsuCollectionTargetRequest request) {

        Validate.notBlank(request.getFsuCollectionId(), "fsuCollectionId must not be blank");

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        return clientCall(request, DeleteFsuCollectionTargetResponse::builder)
                .logger(LOG, "deleteFsuCollectionTarget")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuCollectionTarget",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/DeleteFsuCollectionTarget")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFsuCollectionTargetRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .appendPathParam(request.getFsuCollectionId())
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteFsuCollectionTargetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuCollectionTargetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFsuCycleResponse deleteFsuCycle(DeleteFsuCycleRequest request) {

        Validate.notBlank(request.getFsuCycleId(), "fsuCycleId must not be blank");

        return clientCall(request, DeleteFsuCycleResponse::builder)
                .logger(LOG, "deleteFsuCycle")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuCycle",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycle/DeleteFsuCycle")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFsuCycleRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCycles")
                .appendPathParam(request.getFsuCycleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteFsuCycleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuCycleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFsuDiscoveryResponse deleteFsuDiscovery(DeleteFsuDiscoveryRequest request) {

        Validate.notBlank(request.getFsuDiscoveryId(), "fsuDiscoveryId must not be blank");

        return clientCall(request, DeleteFsuDiscoveryResponse::builder)
                .logger(LOG, "deleteFsuDiscovery")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscovery/DeleteFsuDiscovery")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFsuDiscoveryRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuDiscoveries")
                .appendPathParam(request.getFsuDiscoveryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteFsuDiscoveryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuDiscoveryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFsuJobResponse deleteFsuJob(DeleteFsuJobRequest request) {

        Validate.notBlank(request.getFsuJobId(), "fsuJobId must not be blank");

        return clientCall(request, DeleteFsuJobResponse::builder)
                .logger(LOG, "deleteFsuJob")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuJob",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJob/DeleteFsuJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFsuJobRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuJobs")
                .appendPathParam(request.getFsuJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFsuActionResponse getFsuAction(GetFsuActionRequest request) {

        Validate.notBlank(request.getFsuActionId(), "fsuActionId must not be blank");

        return clientCall(request, GetFsuActionResponse::builder)
                .logger(LOG, "getFsuAction")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuAction",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/GetFsuAction")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFsuActionRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuActions")
                .appendPathParam(request.getFsuActionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuAction.class,
                        GetFsuActionResponse.Builder::fsuAction)
                .handleResponseHeaderString("etag", GetFsuActionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuActionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFsuActionOutputContentResponse getFsuActionOutputContent(
            GetFsuActionOutputContentRequest request) {

        Validate.notBlank(request.getFsuActionId(), "fsuActionId must not be blank");

        return clientCall(request, GetFsuActionOutputContentResponse::builder)
                .logger(LOG, "getFsuActionOutputContent")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuActionOutputContent",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/GetFsuActionOutputContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFsuActionOutputContentRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuActions")
                .appendPathParam(request.getFsuActionId())
                .appendPathParam("output")
                .appendPathParam("content")
                .accept("application/x-yaml")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetFsuActionOutputContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuActionOutputContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFsuCollectionResponse getFsuCollection(GetFsuCollectionRequest request) {

        Validate.notBlank(request.getFsuCollectionId(), "fsuCollectionId must not be blank");

        return clientCall(request, GetFsuCollectionResponse::builder)
                .logger(LOG, "getFsuCollection")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuCollection",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/GetFsuCollection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFsuCollectionRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .appendPathParam(request.getFsuCollectionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCollection.class,
                        GetFsuCollectionResponse.Builder::fsuCollection)
                .handleResponseHeaderString("etag", GetFsuCollectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuCollectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFsuCollectionTargetResponse getFsuCollectionTarget(
            GetFsuCollectionTargetRequest request) {

        Validate.notBlank(request.getFsuCollectionId(), "fsuCollectionId must not be blank");

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        return clientCall(request, GetFsuCollectionTargetResponse::builder)
                .logger(LOG, "getFsuCollectionTarget")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuCollectionTarget",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollectionTarget/GetFsuCollectionTarget")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFsuCollectionTargetRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .appendPathParam(request.getFsuCollectionId())
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCollectionTarget.class,
                        GetFsuCollectionTargetResponse.Builder::fsuCollectionTarget)
                .handleResponseHeaderString("etag", GetFsuCollectionTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuCollectionTargetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFsuCycleResponse getFsuCycle(GetFsuCycleRequest request) {

        Validate.notBlank(request.getFsuCycleId(), "fsuCycleId must not be blank");

        return clientCall(request, GetFsuCycleResponse::builder)
                .logger(LOG, "getFsuCycle")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuCycle",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycle/GetFsuCycle")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFsuCycleRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCycles")
                .appendPathParam(request.getFsuCycleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCycle.class,
                        GetFsuCycleResponse.Builder::fsuCycle)
                .handleResponseHeaderString("etag", GetFsuCycleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuCycleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFsuDiscoveryResponse getFsuDiscovery(GetFsuDiscoveryRequest request) {

        Validate.notBlank(request.getFsuDiscoveryId(), "fsuDiscoveryId must not be blank");

        return clientCall(request, GetFsuDiscoveryResponse::builder)
                .logger(LOG, "getFsuDiscovery")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscovery/GetFsuDiscovery")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFsuDiscoveryRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuDiscoveries")
                .appendPathParam(request.getFsuDiscoveryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscovery.class,
                        GetFsuDiscoveryResponse.Builder::fsuDiscovery)
                .handleResponseHeaderString("etag", GetFsuDiscoveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuDiscoveryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFsuJobResponse getFsuJob(GetFsuJobRequest request) {

        Validate.notBlank(request.getFsuJobId(), "fsuJobId must not be blank");

        return clientCall(request, GetFsuJobResponse::builder)
                .logger(LOG, "getFsuJob")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuJob",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJob/GetFsuJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFsuJobRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuJobs")
                .appendPathParam(request.getFsuJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuJob.class,
                        GetFsuJobResponse.Builder::fsuJob)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetFsuJobResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetFsuJobOutputContentResponse getFsuJobOutputContent(
            GetFsuJobOutputContentRequest request) {

        Validate.notBlank(request.getFsuJobId(), "fsuJobId must not be blank");

        return clientCall(request, GetFsuJobOutputContentResponse::builder)
                .logger(LOG, "getFsuJobOutputContent")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuJobOutputContent",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJob/GetFsuJobOutputContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFsuJobOutputContentRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuJobs")
                .appendPathParam(request.getFsuJobId())
                .appendPathParam("output")
                .appendPathParam("content")
                .accept("application/x-yaml")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetFsuJobOutputContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuJobOutputContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20220528")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListFsuActionsResponse listFsuActions(ListFsuActionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFsuActionsResponse::builder)
                .logger(LOG, "listFsuActions")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuActions",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuActionSummaryCollection/ListFsuActions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFsuActionsRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuActions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("fsuCycleId", request.getFsuCycleId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuActionSummaryCollection.class,
                        ListFsuActionsResponse.Builder::fsuActionSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuActionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuActionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFsuCollectionTargetsResponse listFsuCollectionTargets(
            ListFsuCollectionTargetsRequest request) {

        Validate.notBlank(request.getFsuCollectionId(), "fsuCollectionId must not be blank");

        return clientCall(request, ListFsuCollectionTargetsResponse::builder)
                .logger(LOG, "listFsuCollectionTargets")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuCollectionTargets",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/TargetSummaryCollection/ListFsuCollectionTargets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFsuCollectionTargetsRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .appendPathParam(request.getFsuCollectionId())
                .appendPathParam("targets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.TargetSummaryCollection.class,
                        ListFsuCollectionTargetsResponse.Builder::targetSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuCollectionTargetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuCollectionTargetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFsuCollectionsResponse listFsuCollections(ListFsuCollectionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFsuCollectionsResponse::builder)
                .logger(LOG, "listFsuCollections")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuCollections",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollectionSummaryCollection/ListFsuCollections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFsuCollectionsRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCollectionSummaryCollection
                                .class,
                        ListFsuCollectionsResponse.Builder::fsuCollectionSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuCollectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuCollectionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFsuCyclesResponse listFsuCycles(ListFsuCyclesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFsuCyclesResponse::builder)
                .logger(LOG, "listFsuCycles")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuCycles",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycleSummary/ListFsuCycles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFsuCyclesRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCycles")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("fsuCollectionId", request.getFsuCollectionId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("collectionType", request.getCollectionType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("targetVersion", request.getTargetVersion())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCycleSummaryCollection.class,
                        ListFsuCyclesResponse.Builder::fsuCycleSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuCyclesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuCyclesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFsuDiscoveriesResponse listFsuDiscoveries(ListFsuDiscoveriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFsuDiscoveriesResponse::builder)
                .logger(LOG, "listFsuDiscoveries")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuDiscoveries",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscoverySummary/ListFsuDiscoveries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFsuDiscoveriesRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuDiscoveries")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscoverySummaryCollection
                                .class,
                        ListFsuDiscoveriesResponse.Builder::fsuDiscoverySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuDiscoveriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuDiscoveriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFsuDiscoveryTargetsResponse listFsuDiscoveryTargets(
            ListFsuDiscoveryTargetsRequest request) {

        Validate.notBlank(request.getFsuDiscoveryId(), "fsuDiscoveryId must not be blank");

        return clientCall(request, ListFsuDiscoveryTargetsResponse::builder)
                .logger(LOG, "listFsuDiscoveryTargets")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuDiscoveryTargets",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/TargetSummaryCollection/ListFsuDiscoveryTargets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFsuDiscoveryTargetsRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuDiscoveries")
                .appendPathParam(request.getFsuDiscoveryId())
                .appendPathParam("targets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.TargetSummaryCollection.class,
                        ListFsuDiscoveryTargetsResponse.Builder::targetSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuDiscoveryTargetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuDiscoveryTargetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFsuJobOutputsResponse listFsuJobOutputs(ListFsuJobOutputsRequest request) {

        Validate.notBlank(request.getFsuJobId(), "fsuJobId must not be blank");

        return clientCall(request, ListFsuJobOutputsResponse::builder)
                .logger(LOG, "listFsuJobOutputs")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuJobOutputs",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJobOutputSummary/ListFsuJobOutputs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFsuJobOutputsRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuJobs")
                .appendPathParam(request.getFsuJobId())
                .appendPathParam("output")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuJobOutputSummaryCollection
                                .class,
                        ListFsuJobOutputsResponse.Builder::fsuJobOutputSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuJobOutputsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuJobOutputsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFsuJobsResponse listFsuJobs(ListFsuJobsRequest request) {
        Objects.requireNonNull(request.getFsuActionId(), "fsuActionId is required");

        return clientCall(request, ListFsuJobsResponse::builder)
                .logger(LOG, "listFsuJobs")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuJobs",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJobSummary/ListFsuJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFsuJobsRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuJobs")
                .appendQueryParam("fsuActionId", request.getFsuActionId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuJobCollection.class,
                        ListFsuJobsResponse.Builder::fsuJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuJobsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20220528")
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
                        com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestErrorCollection.class,
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
                        "FleetSoftwareUpdate",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20220528")
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
                        com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestLogEntryCollection
                                .class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20220528")
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
                        com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RemoveFsuCollectionTargetsResponse removeFsuCollectionTargets(
            RemoveFsuCollectionTargetsRequest request) {

        Validate.notBlank(request.getFsuCollectionId(), "fsuCollectionId must not be blank");
        Objects.requireNonNull(
                request.getRemoveFsuCollectionTargetsDetails(),
                "removeFsuCollectionTargetsDetails is required");

        return clientCall(request, RemoveFsuCollectionTargetsResponse::builder)
                .logger(LOG, "removeFsuCollectionTargets")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "RemoveFsuCollectionTargets",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/RemoveFsuCollectionTargets")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(RemoveFsuCollectionTargetsRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .appendPathParam(request.getFsuCollectionId())
                .appendPathParam("targets")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveFsuCollectionTargetsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveFsuCollectionTargetsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ResumeFsuActionResponse resumeFsuAction(ResumeFsuActionRequest request) {

        Validate.notBlank(request.getFsuActionId(), "fsuActionId must not be blank");

        return clientCall(request, ResumeFsuActionResponse::builder)
                .logger(LOG, "resumeFsuAction")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "ResumeFsuAction",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/ResumeFsuAction")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResumeFsuActionRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuActions")
                .appendPathParam(request.getFsuActionId())
                .appendPathParam("actions")
                .appendPathParam("resume")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", ResumeFsuActionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RetryFsuJobResponse retryFsuJob(RetryFsuJobRequest request) {

        Validate.notBlank(request.getFsuJobId(), "fsuJobId must not be blank");

        return clientCall(request, RetryFsuJobResponse::builder)
                .logger(LOG, "retryFsuJob")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "RetryFsuJob",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJob/RetryFsuJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetryFsuJobRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuJobs")
                .appendPathParam(request.getFsuJobId())
                .appendPathParam("actions")
                .appendPathParam("retry")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", RetryFsuJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFsuActionResponse updateFsuAction(UpdateFsuActionRequest request) {

        Validate.notBlank(request.getFsuActionId(), "fsuActionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFsuActionDetails(), "updateFsuActionDetails is required");

        return clientCall(request, UpdateFsuActionResponse::builder)
                .logger(LOG, "updateFsuAction")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "UpdateFsuAction",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/UpdateFsuAction")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFsuActionRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuActions")
                .appendPathParam(request.getFsuActionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateFsuActionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFsuActionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFsuCollectionResponse updateFsuCollection(UpdateFsuCollectionRequest request) {

        Validate.notBlank(request.getFsuCollectionId(), "fsuCollectionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFsuCollectionDetails(), "updateFsuCollectionDetails is required");

        return clientCall(request, UpdateFsuCollectionResponse::builder)
                .logger(LOG, "updateFsuCollection")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "UpdateFsuCollection",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/UpdateFsuCollection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFsuCollectionRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCollections")
                .appendPathParam(request.getFsuCollectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateFsuCollectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFsuCollectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFsuCycleResponse updateFsuCycle(UpdateFsuCycleRequest request) {

        Validate.notBlank(request.getFsuCycleId(), "fsuCycleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFsuCycleDetails(), "updateFsuCycleDetails is required");

        return clientCall(request, UpdateFsuCycleResponse::builder)
                .logger(LOG, "updateFsuCycle")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "UpdateFsuCycle",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycle/UpdateFsuCycle")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFsuCycleRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuCycles")
                .appendPathParam(request.getFsuCycleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateFsuCycleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFsuCycleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFsuDiscoveryResponse updateFsuDiscovery(UpdateFsuDiscoveryRequest request) {

        Validate.notBlank(request.getFsuDiscoveryId(), "fsuDiscoveryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFsuDiscoveryDetails(), "updateFsuDiscoveryDetails is required");

        return clientCall(request, UpdateFsuDiscoveryResponse::builder)
                .logger(LOG, "updateFsuDiscovery")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "UpdateFsuDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscovery/UpdateFsuDiscovery")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFsuDiscoveryRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuDiscoveries")
                .appendPathParam(request.getFsuDiscoveryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFsuDiscoveryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFsuJobResponse updateFsuJob(UpdateFsuJobRequest request) {

        Validate.notBlank(request.getFsuJobId(), "fsuJobId must not be blank");
        Objects.requireNonNull(request.getUpdateFsuJobDetails(), "updateFsuJobDetails is required");

        return clientCall(request, UpdateFsuJobResponse::builder)
                .logger(LOG, "updateFsuJob")
                .serviceDetails(
                        "FleetSoftwareUpdate",
                        "UpdateFsuJob",
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJob/UpdateFsuJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFsuJobRequest::builder)
                .basePath("/20220528")
                .appendPathParam("fsuJobs")
                .appendPathParam(request.getFsuJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuJob.class,
                        UpdateFsuJobResponse.Builder::fsuJob)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFsuJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateFsuJobResponse.Builder::etag)
                .callSync();
    }

    @Override
    public FleetSoftwareUpdateWaiters getWaiters() {
        return waiters;
    }

    @Override
    public FleetSoftwareUpdatePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetSoftwareUpdateClient(
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
    public FleetSoftwareUpdateClient(
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
    public FleetSoftwareUpdateClient(
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
    public FleetSoftwareUpdateClient(
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
    public FleetSoftwareUpdateClient(
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
    public FleetSoftwareUpdateClient(
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
    public FleetSoftwareUpdateClient(
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
    public FleetSoftwareUpdateClient(
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
