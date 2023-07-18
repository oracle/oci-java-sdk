/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.disasterrecovery.requests.*;
import com.oracle.bmc.disasterrecovery.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DisasterRecovery service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class DisasterRecoveryAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DisasterRecoveryAsync {
    /** Service instance for DisasterRecovery. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DISASTERRECOVERY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://disaster-recovery.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DisasterRecoveryAsyncClient.class);

    DisasterRecoveryAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, DisasterRecoveryAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public DisasterRecoveryAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DisasterRecoveryAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AssociateDrProtectionGroupResponse>
            associateDrProtectionGroup(
                    AssociateDrProtectionGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AssociateDrProtectionGroupRequest,
                                    AssociateDrProtectionGroupResponse>
                            handler) {
        Objects.requireNonNull(
                request.getAssociateDrProtectionGroupDetails(),
                "associateDrProtectionGroupDetails is required");

        Validate.notBlank(
                request.getDrProtectionGroupId(), "drProtectionGroupId must not be blank");

        return clientCall(request, AssociateDrProtectionGroupResponse::builder)
                .logger(LOG, "associateDrProtectionGroup")
                .serviceDetails(
                        "DisasterRecovery",
                        "AssociateDrProtectionGroup",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/AssociateDrProtectionGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AssociateDrProtectionGroupRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drProtectionGroups")
                .appendPathParam(request.getDrProtectionGroupId())
                .appendPathParam("actions")
                .appendPathParam("associate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AssociateDrProtectionGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AssociateDrProtectionGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelDrPlanExecutionResponse> cancelDrPlanExecution(
            CancelDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelDrPlanExecutionRequest, CancelDrPlanExecutionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCancelDrPlanExecutionDetails(),
                "cancelDrPlanExecutionDetails is required");

        Validate.notBlank(request.getDrPlanExecutionId(), "drPlanExecutionId must not be blank");

        return clientCall(request, CancelDrPlanExecutionResponse::builder)
                .logger(LOG, "cancelDrPlanExecution")
                .serviceDetails(
                        "DisasterRecovery",
                        "CancelDrPlanExecution",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/CancelDrPlanExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelDrPlanExecutionRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlanExecutions")
                .appendPathParam(request.getDrPlanExecutionId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CancelDrPlanExecutionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CancelDrPlanExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "DisasterRecovery",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20220125")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDrProtectionGroupCompartmentResponse>
            changeDrProtectionGroupCompartment(
                    ChangeDrProtectionGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDrProtectionGroupCompartmentRequest,
                                    ChangeDrProtectionGroupCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeDrProtectionGroupCompartmentDetails(),
                "changeDrProtectionGroupCompartmentDetails is required");

        Validate.notBlank(
                request.getDrProtectionGroupId(), "drProtectionGroupId must not be blank");

        return clientCall(request, ChangeDrProtectionGroupCompartmentResponse::builder)
                .logger(LOG, "changeDrProtectionGroupCompartment")
                .serviceDetails(
                        "DisasterRecovery",
                        "ChangeDrProtectionGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/ChangeDrProtectionGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDrProtectionGroupCompartmentRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drProtectionGroups")
                .appendPathParam(request.getDrProtectionGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDrProtectionGroupCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDrProtectionGroupCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDrPlanResponse> createDrPlan(
            CreateDrPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateDrPlanRequest, CreateDrPlanResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateDrPlanDetails(), "createDrPlanDetails is required");

        return clientCall(request, CreateDrPlanResponse::builder)
                .logger(LOG, "createDrPlan")
                .serviceDetails(
                        "DisasterRecovery",
                        "CreateDrPlan",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlan/CreateDrPlan")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDrPlanRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlans")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.disasterrecovery.model.DrPlan.class,
                        CreateDrPlanResponse.Builder::drPlan)
                .handleResponseHeaderString("location", CreateDrPlanResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateDrPlanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDrPlanResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDrPlanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDrPlanExecutionResponse> createDrPlanExecution(
            CreateDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDrPlanExecutionRequest, CreateDrPlanExecutionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDrPlanExecutionDetails(),
                "createDrPlanExecutionDetails is required");

        return clientCall(request, CreateDrPlanExecutionResponse::builder)
                .logger(LOG, "createDrPlanExecution")
                .serviceDetails(
                        "DisasterRecovery",
                        "CreateDrPlanExecution",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/CreateDrPlanExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDrPlanExecutionRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlanExecutions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.disasterrecovery.model.DrPlanExecution.class,
                        CreateDrPlanExecutionResponse.Builder::drPlanExecution)
                .handleResponseHeaderString(
                        "location", CreateDrPlanExecutionResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateDrPlanExecutionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDrPlanExecutionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDrPlanExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDrProtectionGroupResponse> createDrProtectionGroup(
            CreateDrProtectionGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDrProtectionGroupRequest, CreateDrProtectionGroupResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDrProtectionGroupDetails(),
                "createDrProtectionGroupDetails is required");

        return clientCall(request, CreateDrProtectionGroupResponse::builder)
                .logger(LOG, "createDrProtectionGroup")
                .serviceDetails(
                        "DisasterRecovery",
                        "CreateDrProtectionGroup",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/CreateDrProtectionGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDrProtectionGroupRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drProtectionGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.disasterrecovery.model.DrProtectionGroup.class,
                        CreateDrProtectionGroupResponse.Builder::drProtectionGroup)
                .handleResponseHeaderString(
                        "location", CreateDrProtectionGroupResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateDrProtectionGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDrProtectionGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDrProtectionGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDrPlanResponse> deleteDrPlan(
            DeleteDrPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteDrPlanRequest, DeleteDrPlanResponse>
                    handler) {

        Validate.notBlank(request.getDrPlanId(), "drPlanId must not be blank");

        return clientCall(request, DeleteDrPlanResponse::builder)
                .logger(LOG, "deleteDrPlan")
                .serviceDetails(
                        "DisasterRecovery",
                        "DeleteDrPlan",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlan/DeleteDrPlan")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDrPlanRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlans")
                .appendPathParam(request.getDrPlanId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDrPlanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDrPlanExecutionResponse> deleteDrPlanExecution(
            DeleteDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDrPlanExecutionRequest, DeleteDrPlanExecutionResponse>
                    handler) {

        Validate.notBlank(request.getDrPlanExecutionId(), "drPlanExecutionId must not be blank");

        return clientCall(request, DeleteDrPlanExecutionResponse::builder)
                .logger(LOG, "deleteDrPlanExecution")
                .serviceDetails(
                        "DisasterRecovery",
                        "DeleteDrPlanExecution",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/DeleteDrPlanExecution")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDrPlanExecutionRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlanExecutions")
                .appendPathParam(request.getDrPlanExecutionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDrPlanExecutionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDrPlanExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDrProtectionGroupResponse> deleteDrProtectionGroup(
            DeleteDrProtectionGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDrProtectionGroupRequest, DeleteDrProtectionGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getDrProtectionGroupId(), "drProtectionGroupId must not be blank");

        return clientCall(request, DeleteDrProtectionGroupResponse::builder)
                .logger(LOG, "deleteDrProtectionGroup")
                .serviceDetails(
                        "DisasterRecovery",
                        "DeleteDrProtectionGroup",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/DeleteDrProtectionGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDrProtectionGroupRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drProtectionGroups")
                .appendPathParam(request.getDrProtectionGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDrProtectionGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDrProtectionGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDrProtectionGroupResponse>
            disassociateDrProtectionGroup(
                    DisassociateDrProtectionGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisassociateDrProtectionGroupRequest,
                                    DisassociateDrProtectionGroupResponse>
                            handler) {
        Objects.requireNonNull(
                request.getDisassociateDrProtectionGroupDetails(),
                "disassociateDrProtectionGroupDetails is required");

        Validate.notBlank(
                request.getDrProtectionGroupId(), "drProtectionGroupId must not be blank");

        return clientCall(request, DisassociateDrProtectionGroupResponse::builder)
                .logger(LOG, "disassociateDrProtectionGroup")
                .serviceDetails(
                        "DisasterRecovery",
                        "DisassociateDrProtectionGroup",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/DisassociateDrProtectionGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisassociateDrProtectionGroupRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drProtectionGroups")
                .appendPathParam(request.getDrProtectionGroupId())
                .appendPathParam("actions")
                .appendPathParam("disassociate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisassociateDrProtectionGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisassociateDrProtectionGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDrPlanResponse> getDrPlan(
            GetDrPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDrPlanRequest, GetDrPlanResponse>
                    handler) {

        Validate.notBlank(request.getDrPlanId(), "drPlanId must not be blank");

        return clientCall(request, GetDrPlanResponse::builder)
                .logger(LOG, "getDrPlan")
                .serviceDetails(
                        "DisasterRecovery",
                        "GetDrPlan",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlan/GetDrPlan")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDrPlanRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlans")
                .appendPathParam(request.getDrPlanId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.disasterrecovery.model.DrPlan.class,
                        GetDrPlanResponse.Builder::drPlan)
                .handleResponseHeaderString("etag", GetDrPlanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDrPlanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDrPlanExecutionResponse> getDrPlanExecution(
            GetDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDrPlanExecutionRequest, GetDrPlanExecutionResponse>
                    handler) {

        Validate.notBlank(request.getDrPlanExecutionId(), "drPlanExecutionId must not be blank");

        return clientCall(request, GetDrPlanExecutionResponse::builder)
                .logger(LOG, "getDrPlanExecution")
                .serviceDetails(
                        "DisasterRecovery",
                        "GetDrPlanExecution",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/GetDrPlanExecution")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDrPlanExecutionRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlanExecutions")
                .appendPathParam(request.getDrPlanExecutionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.disasterrecovery.model.DrPlanExecution.class,
                        GetDrPlanExecutionResponse.Builder::drPlanExecution)
                .handleResponseHeaderString("etag", GetDrPlanExecutionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDrPlanExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDrProtectionGroupResponse> getDrProtectionGroup(
            GetDrProtectionGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDrProtectionGroupRequest, GetDrProtectionGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getDrProtectionGroupId(), "drProtectionGroupId must not be blank");

        return clientCall(request, GetDrProtectionGroupResponse::builder)
                .logger(LOG, "getDrProtectionGroup")
                .serviceDetails(
                        "DisasterRecovery",
                        "GetDrProtectionGroup",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/GetDrProtectionGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDrProtectionGroupRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drProtectionGroups")
                .appendPathParam(request.getDrProtectionGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.disasterrecovery.model.DrProtectionGroup.class,
                        GetDrProtectionGroupResponse.Builder::drProtectionGroup)
                .handleResponseHeaderString("etag", GetDrProtectionGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDrProtectionGroupResponse.Builder::opcRequestId)
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
                        "DisasterRecovery",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20220125")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.disasterrecovery.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IgnoreDrPlanExecutionResponse> ignoreDrPlanExecution(
            IgnoreDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IgnoreDrPlanExecutionRequest, IgnoreDrPlanExecutionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getIgnoreDrPlanExecutionDetails(),
                "ignoreDrPlanExecutionDetails is required");

        Validate.notBlank(request.getDrPlanExecutionId(), "drPlanExecutionId must not be blank");

        return clientCall(request, IgnoreDrPlanExecutionResponse::builder)
                .logger(LOG, "ignoreDrPlanExecution")
                .serviceDetails(
                        "DisasterRecovery",
                        "IgnoreDrPlanExecution",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/IgnoreDrPlanExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IgnoreDrPlanExecutionRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlanExecutions")
                .appendPathParam(request.getDrPlanExecutionId())
                .appendPathParam("actions")
                .appendPathParam("ignore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        IgnoreDrPlanExecutionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", IgnoreDrPlanExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDrPlanExecutionsResponse> listDrPlanExecutions(
            ListDrPlanExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDrPlanExecutionsRequest, ListDrPlanExecutionsResponse>
                    handler) {
        Objects.requireNonNull(request.getDrProtectionGroupId(), "drProtectionGroupId is required");

        return clientCall(request, ListDrPlanExecutionsResponse::builder)
                .logger(LOG, "listDrPlanExecutions")
                .serviceDetails(
                        "DisasterRecovery",
                        "ListDrPlanExecutions",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/ListDrPlanExecutions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDrPlanExecutionsRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlanExecutions")
                .appendQueryParam("drProtectionGroupId", request.getDrProtectionGroupId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("drPlanExecutionId", request.getDrPlanExecutionId())
                .appendEnumQueryParam("drPlanExecutionType", request.getDrPlanExecutionType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.disasterrecovery.model.DrPlanExecutionCollection.class,
                        ListDrPlanExecutionsResponse.Builder::drPlanExecutionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDrPlanExecutionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDrPlanExecutionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDrPlansResponse> listDrPlans(
            ListDrPlansRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDrPlansRequest, ListDrPlansResponse>
                    handler) {
        Objects.requireNonNull(request.getDrProtectionGroupId(), "drProtectionGroupId is required");

        return clientCall(request, ListDrPlansResponse::builder)
                .logger(LOG, "listDrPlans")
                .serviceDetails(
                        "DisasterRecovery",
                        "ListDrPlans",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlan/ListDrPlans")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDrPlansRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlans")
                .appendQueryParam("drProtectionGroupId", request.getDrProtectionGroupId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("drPlanId", request.getDrPlanId())
                .appendEnumQueryParam("drPlanType", request.getDrPlanType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.disasterrecovery.model.DrPlanCollection.class,
                        ListDrPlansResponse.Builder::drPlanCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDrPlansResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDrPlansResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDrProtectionGroupsResponse> listDrProtectionGroups(
            ListDrProtectionGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDrProtectionGroupsRequest, ListDrProtectionGroupsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDrProtectionGroupsResponse::builder)
                .logger(LOG, "listDrProtectionGroups")
                .serviceDetails(
                        "DisasterRecovery",
                        "ListDrProtectionGroups",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/ListDrProtectionGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDrProtectionGroupsRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drProtectionGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("drProtectionGroupId", request.getDrProtectionGroupId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("role", request.getRole())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.disasterrecovery.model.DrProtectionGroupCollection.class,
                        ListDrProtectionGroupsResponse.Builder::drProtectionGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDrProtectionGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDrProtectionGroupsResponse.Builder::opcNextPage)
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
                        "DisasterRecovery",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20220125")
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
                        com.oracle.bmc.disasterrecovery.model.WorkRequestErrorCollection.class,
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
                        "DisasterRecovery",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20220125")
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
                        com.oracle.bmc.disasterrecovery.model.WorkRequestLogEntryCollection.class,
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

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "DisasterRecovery",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20220125")
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
                        com.oracle.bmc.disasterrecovery.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PauseDrPlanExecutionResponse> pauseDrPlanExecution(
            PauseDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PauseDrPlanExecutionRequest, PauseDrPlanExecutionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getPauseDrPlanExecutionDetails(),
                "pauseDrPlanExecutionDetails is required");

        Validate.notBlank(request.getDrPlanExecutionId(), "drPlanExecutionId must not be blank");

        return clientCall(request, PauseDrPlanExecutionResponse::builder)
                .logger(LOG, "pauseDrPlanExecution")
                .serviceDetails(
                        "DisasterRecovery",
                        "PauseDrPlanExecution",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/PauseDrPlanExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PauseDrPlanExecutionRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlanExecutions")
                .appendPathParam(request.getDrPlanExecutionId())
                .appendPathParam("actions")
                .appendPathParam("pause")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PauseDrPlanExecutionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PauseDrPlanExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResumeDrPlanExecutionResponse> resumeDrPlanExecution(
            ResumeDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeDrPlanExecutionRequest, ResumeDrPlanExecutionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getResumeDrPlanExecutionDetails(),
                "resumeDrPlanExecutionDetails is required");

        Validate.notBlank(request.getDrPlanExecutionId(), "drPlanExecutionId must not be blank");

        return clientCall(request, ResumeDrPlanExecutionResponse::builder)
                .logger(LOG, "resumeDrPlanExecution")
                .serviceDetails(
                        "DisasterRecovery",
                        "ResumeDrPlanExecution",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/ResumeDrPlanExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResumeDrPlanExecutionRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlanExecutions")
                .appendPathParam(request.getDrPlanExecutionId())
                .appendPathParam("actions")
                .appendPathParam("resume")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ResumeDrPlanExecutionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ResumeDrPlanExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetryDrPlanExecutionResponse> retryDrPlanExecution(
            RetryDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetryDrPlanExecutionRequest, RetryDrPlanExecutionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getRetryDrPlanExecutionDetails(),
                "retryDrPlanExecutionDetails is required");

        Validate.notBlank(request.getDrPlanExecutionId(), "drPlanExecutionId must not be blank");

        return clientCall(request, RetryDrPlanExecutionResponse::builder)
                .logger(LOG, "retryDrPlanExecution")
                .serviceDetails(
                        "DisasterRecovery",
                        "RetryDrPlanExecution",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/RetryDrPlanExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetryDrPlanExecutionRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlanExecutions")
                .appendPathParam(request.getDrPlanExecutionId())
                .appendPathParam("actions")
                .appendPathParam("retry")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RetryDrPlanExecutionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RetryDrPlanExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDrPlanResponse> updateDrPlan(
            UpdateDrPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateDrPlanRequest, UpdateDrPlanResponse>
                    handler) {
        Objects.requireNonNull(request.getUpdateDrPlanDetails(), "updateDrPlanDetails is required");

        Validate.notBlank(request.getDrPlanId(), "drPlanId must not be blank");

        return clientCall(request, UpdateDrPlanResponse::builder)
                .logger(LOG, "updateDrPlan")
                .serviceDetails(
                        "DisasterRecovery",
                        "UpdateDrPlan",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlan/UpdateDrPlan")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDrPlanRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlans")
                .appendPathParam(request.getDrPlanId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDrPlanResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDrPlanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDrPlanExecutionResponse> updateDrPlanExecution(
            UpdateDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrPlanExecutionRequest, UpdateDrPlanExecutionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateDrPlanExecutionDetails(),
                "updateDrPlanExecutionDetails is required");

        Validate.notBlank(request.getDrPlanExecutionId(), "drPlanExecutionId must not be blank");

        return clientCall(request, UpdateDrPlanExecutionResponse::builder)
                .logger(LOG, "updateDrPlanExecution")
                .serviceDetails(
                        "DisasterRecovery",
                        "UpdateDrPlanExecution",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/UpdateDrPlanExecution")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDrPlanExecutionRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drPlanExecutions")
                .appendPathParam(request.getDrPlanExecutionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDrPlanExecutionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDrPlanExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDrProtectionGroupResponse> updateDrProtectionGroup(
            UpdateDrProtectionGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrProtectionGroupRequest, UpdateDrProtectionGroupResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateDrProtectionGroupDetails(),
                "updateDrProtectionGroupDetails is required");

        Validate.notBlank(
                request.getDrProtectionGroupId(), "drProtectionGroupId must not be blank");

        return clientCall(request, UpdateDrProtectionGroupResponse::builder)
                .logger(LOG, "updateDrProtectionGroup")
                .serviceDetails(
                        "DisasterRecovery",
                        "UpdateDrProtectionGroup",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/UpdateDrProtectionGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDrProtectionGroupRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drProtectionGroups")
                .appendPathParam(request.getDrProtectionGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDrProtectionGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDrProtectionGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDrProtectionGroupRoleResponse>
            updateDrProtectionGroupRole(
                    UpdateDrProtectionGroupRoleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDrProtectionGroupRoleRequest,
                                    UpdateDrProtectionGroupRoleResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateDrProtectionGroupRoleDetails(),
                "updateDrProtectionGroupRoleDetails is required");

        Validate.notBlank(
                request.getDrProtectionGroupId(), "drProtectionGroupId must not be blank");

        return clientCall(request, UpdateDrProtectionGroupRoleResponse::builder)
                .logger(LOG, "updateDrProtectionGroupRole")
                .serviceDetails(
                        "DisasterRecovery",
                        "UpdateDrProtectionGroupRole",
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/UpdateDrProtectionGroupRole")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateDrProtectionGroupRoleRequest::builder)
                .basePath("/20220125")
                .appendPathParam("drProtectionGroups")
                .appendPathParam(request.getDrProtectionGroupId())
                .appendPathParam("actions")
                .appendPathParam("updateRole")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDrProtectionGroupRoleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDrProtectionGroupRoleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DisasterRecoveryAsyncClient(
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
    public DisasterRecoveryAsyncClient(
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
    public DisasterRecoveryAsyncClient(
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
    public DisasterRecoveryAsyncClient(
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
    public DisasterRecoveryAsyncClient(
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
    public DisasterRecoveryAsyncClient(
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
    public DisasterRecoveryAsyncClient(
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
