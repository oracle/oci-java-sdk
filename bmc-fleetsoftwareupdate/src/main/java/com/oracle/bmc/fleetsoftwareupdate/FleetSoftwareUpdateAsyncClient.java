/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetsoftwareupdate.requests.*;
import com.oracle.bmc.fleetsoftwareupdate.responses.*;

import java.util.Objects;

/**
 * Async client implementation for FleetSoftwareUpdate service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public class FleetSoftwareUpdateAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements FleetSoftwareUpdateAsync {
    /** Service instance for FleetSoftwareUpdate. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETSOFTWAREUPDATE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://fleet-software-update.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetSoftwareUpdateAsyncClient.class);

    FleetSoftwareUpdateAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    FleetSoftwareUpdateAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "FleetSoftwareUpdateAsyncClient",
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
                    Builder, FleetSoftwareUpdateAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public FleetSoftwareUpdateAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetSoftwareUpdateAsyncClient(
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
    public java.util.concurrent.Future<AbortFsuDiscoveryResponse> abortFsuDiscovery(
            AbortFsuDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AbortFsuDiscoveryRequest, AbortFsuDiscoveryResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", AbortFsuDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddFsuCollectionTargetsResponse> addFsuCollectionTargets(
            AddFsuCollectionTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddFsuCollectionTargetsRequest, AddFsuCollectionTargetsResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddFsuCollectionTargetsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AddFsuCollectionTargetsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelFsuActionResponse> cancelFsuAction(
            CancelFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelFsuActionRequest, CancelFsuActionResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", CancelFsuActionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeFsuActionCompartmentResponse>
            changeFsuActionCompartment(
                    ChangeFsuActionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFsuActionCompartmentRequest,
                                    ChangeFsuActionCompartmentResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeFsuActionCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeFsuActionCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeFsuCollectionCompartmentResponse>
            changeFsuCollectionCompartment(
                    ChangeFsuCollectionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFsuCollectionCompartmentRequest,
                                    ChangeFsuCollectionCompartmentResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeFsuCollectionCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeFsuCollectionCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeFsuCycleCompartmentResponse> changeFsuCycleCompartment(
            ChangeFsuCycleCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeFsuCycleCompartmentRequest, ChangeFsuCycleCompartmentResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeFsuCycleCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeFsuCycleCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeFsuDiscoveryCompartmentResponse>
            changeFsuDiscoveryCompartment(
                    ChangeFsuDiscoveryCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFsuDiscoveryCompartmentRequest,
                                    ChangeFsuDiscoveryCompartmentResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeFsuDiscoveryCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CloneFsuCycleResponse> cloneFsuCycle(
            CloneFsuCycleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CloneFsuCycleRequest, CloneFsuCycleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFsuActionResponse> createFsuAction(
            CreateFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFsuActionRequest, CreateFsuActionResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFsuCollectionResponse> createFsuCollection(
            CreateFsuCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFsuCollectionRequest, CreateFsuCollectionResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFsuCycleResponse> createFsuCycle(
            CreateFsuCycleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFsuCycleRequest, CreateFsuCycleResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFsuDiscoveryResponse> createFsuDiscovery(
            CreateFsuDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFsuDiscoveryRequest, CreateFsuDiscoveryResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFsuActionResponse> deleteFsuAction(
            DeleteFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuActionRequest, DeleteFsuActionResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteFsuActionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuActionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFsuCollectionResponse> deleteFsuCollection(
            DeleteFsuCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuCollectionRequest, DeleteFsuCollectionResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteFsuCollectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuCollectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFsuCycleResponse> deleteFsuCycle(
            DeleteFsuCycleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuCycleRequest, DeleteFsuCycleResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteFsuCycleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuCycleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFsuDiscoveryResponse> deleteFsuDiscovery(
            DeleteFsuDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuDiscoveryRequest, DeleteFsuDiscoveryResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteFsuDiscoveryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFsuJobResponse> deleteFsuJob(
            DeleteFsuJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteFsuJobRequest, DeleteFsuJobResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFsuJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFsuActionResponse> getFsuAction(
            GetFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFsuActionRequest, GetFsuActionResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuAction.class,
                        GetFsuActionResponse.Builder::fsuAction)
                .handleResponseHeaderString("etag", GetFsuActionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuActionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFsuActionOutputContentResponse> getFsuActionOutputContent(
            GetFsuActionOutputContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFsuActionOutputContentRequest, GetFsuActionOutputContentResponse>
                    handler) {

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
                .handleBody(
                        java.io.InputStream.class,
                        GetFsuActionOutputContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuActionOutputContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFsuCollectionResponse> getFsuCollection(
            GetFsuCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFsuCollectionRequest, GetFsuCollectionResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCollection.class,
                        GetFsuCollectionResponse.Builder::fsuCollection)
                .handleResponseHeaderString("etag", GetFsuCollectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuCollectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFsuCycleResponse> getFsuCycle(
            GetFsuCycleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFsuCycleRequest, GetFsuCycleResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCycle.class,
                        GetFsuCycleResponse.Builder::fsuCycle)
                .handleResponseHeaderString("etag", GetFsuCycleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuCycleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFsuDiscoveryResponse> getFsuDiscovery(
            GetFsuDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFsuDiscoveryRequest, GetFsuDiscoveryResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscovery.class,
                        GetFsuDiscoveryResponse.Builder::fsuDiscovery)
                .handleResponseHeaderString("etag", GetFsuDiscoveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFsuJobResponse> getFsuJob(
            GetFsuJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFsuJobRequest, GetFsuJobResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuJob.class,
                        GetFsuJobResponse.Builder::fsuJob)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetFsuJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFsuJobOutputContentResponse> getFsuJobOutputContent(
            GetFsuJobOutputContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFsuJobOutputContentRequest, GetFsuJobOutputContentResponse>
                    handler) {

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
                .handleBody(
                        java.io.InputStream.class,
                        GetFsuJobOutputContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetFsuJobOutputContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFsuActionsResponse> listFsuActions(
            ListFsuActionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuActionsRequest, ListFsuActionsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuActionSummaryCollection.class,
                        ListFsuActionsResponse.Builder::fsuActionSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuActionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuActionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFsuCollectionTargetsResponse> listFsuCollectionTargets(
            ListFsuCollectionTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuCollectionTargetsRequest, ListFsuCollectionTargetsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.TargetSummaryCollection.class,
                        ListFsuCollectionTargetsResponse.Builder::targetSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuCollectionTargetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuCollectionTargetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFsuCollectionsResponse> listFsuCollections(
            ListFsuCollectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuCollectionsRequest, ListFsuCollectionsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCollectionSummaryCollection
                                .class,
                        ListFsuCollectionsResponse.Builder::fsuCollectionSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuCollectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuCollectionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFsuCyclesResponse> listFsuCycles(
            ListFsuCyclesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFsuCyclesRequest, ListFsuCyclesResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuCycleSummaryCollection.class,
                        ListFsuCyclesResponse.Builder::fsuCycleSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuCyclesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuCyclesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFsuDiscoveriesResponse> listFsuDiscoveries(
            ListFsuDiscoveriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuDiscoveriesRequest, ListFsuDiscoveriesResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscoverySummaryCollection
                                .class,
                        ListFsuDiscoveriesResponse.Builder::fsuDiscoverySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuDiscoveriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuDiscoveriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFsuDiscoveryTargetsResponse> listFsuDiscoveryTargets(
            ListFsuDiscoveryTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuDiscoveryTargetsRequest, ListFsuDiscoveryTargetsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.TargetSummaryCollection.class,
                        ListFsuDiscoveryTargetsResponse.Builder::targetSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuDiscoveryTargetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuDiscoveryTargetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFsuJobOutputsResponse> listFsuJobOutputs(
            ListFsuJobOutputsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuJobOutputsRequest, ListFsuJobOutputsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuJobOutputSummaryCollection
                                .class,
                        ListFsuJobOutputsResponse.Builder::fsuJobOutputSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuJobOutputsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuJobOutputsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFsuJobsResponse> listFsuJobs(
            ListFsuJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFsuJobsRequest, ListFsuJobsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuJobCollection.class,
                        ListFsuJobsResponse.Builder::fsuJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFsuJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFsuJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestLogEntryCollection
                                .class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveFsuCollectionTargetsResponse>
            removeFsuCollectionTargets(
                    RemoveFsuCollectionTargetsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveFsuCollectionTargetsRequest,
                                    RemoveFsuCollectionTargetsResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveFsuCollectionTargetsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveFsuCollectionTargetsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResumeFsuActionResponse> resumeFsuAction(
            ResumeFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeFsuActionRequest, ResumeFsuActionResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", ResumeFsuActionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetryFsuJobResponse> retryFsuJob(
            RetryFsuJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RetryFsuJobRequest, RetryFsuJobResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", RetryFsuJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFsuActionResponse> updateFsuAction(
            UpdateFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFsuActionRequest, UpdateFsuActionResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateFsuActionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFsuActionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFsuCollectionResponse> updateFsuCollection(
            UpdateFsuCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFsuCollectionRequest, UpdateFsuCollectionResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateFsuCollectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFsuCollectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFsuCycleResponse> updateFsuCycle(
            UpdateFsuCycleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFsuCycleRequest, UpdateFsuCycleResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateFsuCycleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFsuCycleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFsuDiscoveryResponse> updateFsuDiscovery(
            UpdateFsuDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFsuDiscoveryRequest, UpdateFsuDiscoveryResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFsuDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFsuJobResponse> updateFsuJob(
            UpdateFsuJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateFsuJobRequest, UpdateFsuJobResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetsoftwareupdate.model.FsuJob.class,
                        UpdateFsuJobResponse.Builder::fsuJob)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFsuJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateFsuJobResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
