/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.lockbox.requests.*;
import com.oracle.bmc.lockbox.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Lockbox service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
public class LockboxAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements LockboxAsync {
    /** Service instance for Lockbox. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LOCKBOX")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://managed-access.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LockboxAsyncClient.class);

    LockboxAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    LockboxAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "LockboxAsyncClient", "exportAccessRequests"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LockboxAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "lockbox";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public LockboxAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LockboxAsyncClient(
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
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "Lockbox",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20220126")
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
    public java.util.concurrent.Future<ChangeApprovalTemplateCompartmentResponse>
            changeApprovalTemplateCompartment(
                    ChangeApprovalTemplateCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeApprovalTemplateCompartmentRequest,
                                    ChangeApprovalTemplateCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getApprovalTemplateId(), "approvalTemplateId must not be blank");
        Objects.requireNonNull(
                request.getChangeApprovalTemplateCompartmentDetails(),
                "changeApprovalTemplateCompartmentDetails is required");

        return clientCall(request, ChangeApprovalTemplateCompartmentResponse::builder)
                .logger(LOG, "changeApprovalTemplateCompartment")
                .serviceDetails(
                        "Lockbox",
                        "ChangeApprovalTemplateCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/ApprovalTemplate/ChangeApprovalTemplateCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeApprovalTemplateCompartmentRequest::builder)
                .basePath("/20220126")
                .appendPathParam("approvalTemplates")
                .appendPathParam(request.getApprovalTemplateId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeApprovalTemplateCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeLockboxCompartmentResponse> changeLockboxCompartment(
            ChangeLockboxCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeLockboxCompartmentRequest, ChangeLockboxCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getLockboxId(), "lockboxId must not be blank");
        Objects.requireNonNull(
                request.getChangeLockboxCompartmentDetails(),
                "changeLockboxCompartmentDetails is required");

        return clientCall(request, ChangeLockboxCompartmentResponse::builder)
                .logger(LOG, "changeLockboxCompartment")
                .serviceDetails(
                        "Lockbox",
                        "ChangeLockboxCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/Lockbox/ChangeLockboxCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLockboxCompartmentRequest::builder)
                .basePath("/20220126")
                .appendPathParam("lockboxes")
                .appendPathParam(request.getLockboxId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeLockboxCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessRequestResponse> createAccessRequest(
            CreateAccessRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAccessRequestRequest, CreateAccessRequestResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAccessRequestDetails(), "createAccessRequestDetails is required");

        return clientCall(request, CreateAccessRequestResponse::builder)
                .logger(LOG, "createAccessRequest")
                .serviceDetails(
                        "Lockbox",
                        "CreateAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/AccessRequest/CreateAccessRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAccessRequestRequest::builder)
                .basePath("/20220126")
                .appendPathParam("accessRequests")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lockbox.model.AccessRequest.class,
                        CreateAccessRequestResponse.Builder::accessRequest)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAccessRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAccessRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateAccessRequestResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateAccessRequestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateApprovalTemplateResponse> createApprovalTemplate(
            CreateApprovalTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateApprovalTemplateRequest, CreateApprovalTemplateResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateApprovalTemplateDetails(),
                "createApprovalTemplateDetails is required");

        return clientCall(request, CreateApprovalTemplateResponse::builder)
                .logger(LOG, "createApprovalTemplate")
                .serviceDetails(
                        "Lockbox",
                        "CreateApprovalTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/ApprovalTemplate/CreateApprovalTemplate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApprovalTemplateRequest::builder)
                .basePath("/20220126")
                .appendPathParam("approvalTemplates")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lockbox.model.ApprovalTemplate.class,
                        CreateApprovalTemplateResponse.Builder::approvalTemplate)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApprovalTemplateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateApprovalTemplateResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateApprovalTemplateResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLockboxResponse> createLockbox(
            CreateLockboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateLockboxRequest, CreateLockboxResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateLockboxDetails(), "createLockboxDetails is required");

        return clientCall(request, CreateLockboxResponse::builder)
                .logger(LOG, "createLockbox")
                .serviceDetails(
                        "Lockbox",
                        "CreateLockbox",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/Lockbox/CreateLockbox")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLockboxRequest::builder)
                .basePath("/20220126")
                .appendPathParam("lockboxes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lockbox.model.Lockbox.class,
                        CreateLockboxResponse.Builder::lockbox)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLockboxResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateLockboxResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateLockboxResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApprovalTemplateResponse> deleteApprovalTemplate(
            DeleteApprovalTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteApprovalTemplateRequest, DeleteApprovalTemplateResponse>
                    handler) {

        Validate.notBlank(request.getApprovalTemplateId(), "approvalTemplateId must not be blank");

        return clientCall(request, DeleteApprovalTemplateResponse::builder)
                .logger(LOG, "deleteApprovalTemplate")
                .serviceDetails(
                        "Lockbox",
                        "DeleteApprovalTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/ApprovalTemplate/DeleteApprovalTemplate")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApprovalTemplateRequest::builder)
                .basePath("/20220126")
                .appendPathParam("approvalTemplates")
                .appendPathParam(request.getApprovalTemplateId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApprovalTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLockboxResponse> deleteLockbox(
            DeleteLockboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteLockboxRequest, DeleteLockboxResponse>
                    handler) {

        Validate.notBlank(request.getLockboxId(), "lockboxId must not be blank");

        return clientCall(request, DeleteLockboxResponse::builder)
                .logger(LOG, "deleteLockbox")
                .serviceDetails(
                        "Lockbox",
                        "DeleteLockbox",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/Lockbox/DeleteLockbox")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLockboxRequest::builder)
                .basePath("/20220126")
                .appendPathParam("lockboxes")
                .appendPathParam(request.getLockboxId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLockboxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportAccessRequestsResponse> exportAccessRequests(
            ExportAccessRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportAccessRequestsRequest, ExportAccessRequestsResponse>
                    handler) {
        Objects.requireNonNull(
                request.getExportAccessRequestsDetails(),
                "exportAccessRequestsDetails is required");

        return clientCall(request, ExportAccessRequestsResponse::builder)
                .logger(LOG, "exportAccessRequests")
                .serviceDetails(
                        "Lockbox",
                        "ExportAccessRequests",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/AccessRequestCollection/ExportAccessRequests")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportAccessRequestsRequest::builder)
                .basePath("/20220126")
                .appendPathParam("accessRequests")
                .appendPathParam("actions")
                .appendPathParam("export")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("lockboxPartner", request.getLockboxPartner())
                .appendQueryParam("partnerId", request.getPartnerId())
                .appendQueryParam("requestorId", request.getRequestorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("text/csv")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        ExportAccessRequestsResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", ExportAccessRequestsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAccessMaterialsResponse> getAccessMaterials(
            GetAccessMaterialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAccessMaterialsRequest, GetAccessMaterialsResponse>
                    handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");

        return clientCall(request, GetAccessMaterialsResponse::builder)
                .logger(LOG, "getAccessMaterials")
                .serviceDetails(
                        "Lockbox",
                        "GetAccessMaterials",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/AccessMaterials/GetAccessMaterials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAccessMaterialsRequest::builder)
                .basePath("/20220126")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .appendPathParam("accessMaterials")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lockbox.model.AccessMaterials.class,
                        GetAccessMaterialsResponse.Builder::accessMaterials)
                .handleResponseHeaderString(
                        "opc-request-id", GetAccessMaterialsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAccessRequestResponse> getAccessRequest(
            GetAccessRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAccessRequestRequest, GetAccessRequestResponse>
                    handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");

        return clientCall(request, GetAccessRequestResponse::builder)
                .logger(LOG, "getAccessRequest")
                .serviceDetails(
                        "Lockbox",
                        "GetAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/AccessRequest/GetAccessRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAccessRequestRequest::builder)
                .basePath("/20220126")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lockbox.model.AccessRequest.class,
                        GetAccessRequestResponse.Builder::accessRequest)
                .handleResponseHeaderString("etag", GetAccessRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAccessRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApprovalTemplateResponse> getApprovalTemplate(
            GetApprovalTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetApprovalTemplateRequest, GetApprovalTemplateResponse>
                    handler) {

        Validate.notBlank(request.getApprovalTemplateId(), "approvalTemplateId must not be blank");

        return clientCall(request, GetApprovalTemplateResponse::builder)
                .logger(LOG, "getApprovalTemplate")
                .serviceDetails(
                        "Lockbox",
                        "GetApprovalTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/ApprovalTemplate/GetApprovalTemplate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApprovalTemplateRequest::builder)
                .basePath("/20220126")
                .appendPathParam("approvalTemplates")
                .appendPathParam(request.getApprovalTemplateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lockbox.model.ApprovalTemplate.class,
                        GetApprovalTemplateResponse.Builder::approvalTemplate)
                .handleResponseHeaderString("etag", GetApprovalTemplateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApprovalTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLockboxResponse> getLockbox(
            GetLockboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetLockboxRequest, GetLockboxResponse>
                    handler) {

        Validate.notBlank(request.getLockboxId(), "lockboxId must not be blank");

        return clientCall(request, GetLockboxResponse::builder)
                .logger(LOG, "getLockbox")
                .serviceDetails(
                        "Lockbox",
                        "GetLockbox",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/Lockbox/GetLockbox")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLockboxRequest::builder)
                .basePath("/20220126")
                .appendPathParam("lockboxes")
                .appendPathParam(request.getLockboxId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lockbox.model.Lockbox.class,
                        GetLockboxResponse.Builder::lockbox)
                .handleResponseHeaderString("etag", GetLockboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLockboxResponse.Builder::opcRequestId)
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
                        "Lockbox",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20220126")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lockbox.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<HandleAccessRequestResponse> handleAccessRequest(
            HandleAccessRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HandleAccessRequestRequest, HandleAccessRequestResponse>
                    handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");
        Objects.requireNonNull(
                request.getHandleAccessRequestDetails(), "handleAccessRequestDetails is required");

        return clientCall(request, HandleAccessRequestResponse::builder)
                .logger(LOG, "handleAccessRequest")
                .serviceDetails(
                        "Lockbox",
                        "HandleAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/AccessRequest/HandleAccessRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(HandleAccessRequestRequest::builder)
                .basePath("/20220126")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .appendPathParam("actions")
                .appendPathParam("handle")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        HandleAccessRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", HandleAccessRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAccessRequestsResponse> listAccessRequests(
            ListAccessRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAccessRequestsRequest, ListAccessRequestsResponse>
                    handler) {

        return clientCall(request, ListAccessRequestsResponse::builder)
                .logger(LOG, "listAccessRequests")
                .serviceDetails(
                        "Lockbox",
                        "ListAccessRequests",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/AccessRequestCollection/ListAccessRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAccessRequestsRequest::builder)
                .basePath("/20220126")
                .appendPathParam("accessRequests")
                .appendQueryParam("lockboxId", request.getLockboxId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("lockboxPartner", request.getLockboxPartner())
                .appendQueryParam("partnerId", request.getPartnerId())
                .appendQueryParam("requestorId", request.getRequestorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("timeCreatedAfter", request.getTimeCreatedAfter())
                .appendQueryParam("timeCreatedBefore", request.getTimeCreatedBefore())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lockbox.model.AccessRequestCollection.class,
                        ListAccessRequestsResponse.Builder::accessRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAccessRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAccessRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApprovalTemplatesResponse> listApprovalTemplates(
            ListApprovalTemplatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApprovalTemplatesRequest, ListApprovalTemplatesResponse>
                    handler) {

        return clientCall(request, ListApprovalTemplatesResponse::builder)
                .logger(LOG, "listApprovalTemplates")
                .serviceDetails(
                        "Lockbox",
                        "ListApprovalTemplates",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/ApprovalTemplateCollection/ListApprovalTemplates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApprovalTemplatesRequest::builder)
                .basePath("/20220126")
                .appendPathParam("approvalTemplates")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lockbox.model.ApprovalTemplateCollection.class,
                        ListApprovalTemplatesResponse.Builder::approvalTemplateCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApprovalTemplatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApprovalTemplatesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLockboxesResponse> listLockboxes(
            ListLockboxesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListLockboxesRequest, ListLockboxesResponse>
                    handler) {

        return clientCall(request, ListLockboxesResponse::builder)
                .logger(LOG, "listLockboxes")
                .serviceDetails(
                        "Lockbox",
                        "ListLockboxes",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/LockboxCollection/ListLockboxes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLockboxesRequest::builder)
                .basePath("/20220126")
                .appendPathParam("lockboxes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendEnumQueryParam("lockboxPartner", request.getLockboxPartner())
                .appendQueryParam("partnerId", request.getPartnerId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lockbox.model.LockboxCollection.class,
                        ListLockboxesResponse.Builder::lockboxCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLockboxesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLockboxesResponse.Builder::opcNextPage)
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
                        "Lockbox",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20220126")
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
                        com.oracle.bmc.lockbox.model.WorkRequestErrorCollection.class,
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
                        "Lockbox",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20220126")
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
                        com.oracle.bmc.lockbox.model.WorkRequestLogEntryCollection.class,
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
                        "Lockbox",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20220126")
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
                        com.oracle.bmc.lockbox.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateApprovalTemplateResponse> updateApprovalTemplate(
            UpdateApprovalTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateApprovalTemplateRequest, UpdateApprovalTemplateResponse>
                    handler) {

        Validate.notBlank(request.getApprovalTemplateId(), "approvalTemplateId must not be blank");
        Objects.requireNonNull(
                request.getUpdateApprovalTemplateDetails(),
                "updateApprovalTemplateDetails is required");

        return clientCall(request, UpdateApprovalTemplateResponse::builder)
                .logger(LOG, "updateApprovalTemplate")
                .serviceDetails(
                        "Lockbox",
                        "UpdateApprovalTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/ApprovalTemplate/UpdateApprovalTemplate")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApprovalTemplateRequest::builder)
                .basePath("/20220126")
                .appendPathParam("approvalTemplates")
                .appendPathParam(request.getApprovalTemplateId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lockbox.model.ApprovalTemplate.class,
                        UpdateApprovalTemplateResponse.Builder::approvalTemplate)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApprovalTemplateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateApprovalTemplateResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLockboxResponse> updateLockbox(
            UpdateLockboxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateLockboxRequest, UpdateLockboxResponse>
                    handler) {

        Validate.notBlank(request.getLockboxId(), "lockboxId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLockboxDetails(), "updateLockboxDetails is required");

        return clientCall(request, UpdateLockboxResponse::builder)
                .logger(LOG, "updateLockbox")
                .serviceDetails(
                        "Lockbox",
                        "UpdateLockbox",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/Lockbox/UpdateLockbox")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLockboxRequest::builder)
                .basePath("/20220126")
                .appendPathParam("lockboxes")
                .appendPathParam(request.getLockboxId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lockbox.model.Lockbox.class,
                        UpdateLockboxResponse.Builder::lockbox)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLockboxResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateLockboxResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LockboxAsyncClient(
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
    public LockboxAsyncClient(
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
    public LockboxAsyncClient(
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
    public LockboxAsyncClient(
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
    public LockboxAsyncClient(
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
    public LockboxAsyncClient(
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
    public LockboxAsyncClient(
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
