/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.lockbox.requests.*;
import com.oracle.bmc.lockbox.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
public class LockboxClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Lockbox {
    /** Service instance for Lockbox. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(LockboxClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://managed-access.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LockboxClient.class);

    private final LockboxWaiters waiters;

    private final LockboxPaginators paginators;

    LockboxClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    LockboxClient(
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
                                    .nameFormat("Lockbox-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new LockboxWaiters(executorService, this);

        this.paginators = new LockboxPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "LockboxClient", "exportAccessRequests"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LockboxClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "lockbox";
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
        public LockboxClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LockboxClient(
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
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeApprovalTemplateCompartmentResponse changeApprovalTemplateCompartment(
            ChangeApprovalTemplateCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeApprovalTemplateCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeLockboxCompartmentResponse changeLockboxCompartment(
            ChangeLockboxCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeLockboxCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAccessRequestResponse createAccessRequest(CreateAccessRequestRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateApprovalTemplateResponse createApprovalTemplate(
            CreateApprovalTemplateRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lockbox.model.ApprovalTemplate.class,
                        CreateApprovalTemplateResponse.Builder::approvalTemplate)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApprovalTemplateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateApprovalTemplateResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateApprovalTemplateResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateLockboxResponse createLockbox(CreateLockboxRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lockbox.model.Lockbox.class,
                        CreateLockboxResponse.Builder::lockbox)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLockboxResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateLockboxResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateLockboxResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteApprovalTemplateResponse deleteApprovalTemplate(
            DeleteApprovalTemplateRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApprovalTemplateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLockboxResponse deleteLockbox(DeleteLockboxRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLockboxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ExportAccessRequestsResponse exportAccessRequests(ExportAccessRequestsRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        ExportAccessRequestsResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", ExportAccessRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ExportAccessRequestsResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetAccessMaterialsResponse getAccessMaterials(GetAccessMaterialsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.AccessMaterials.class,
                        GetAccessMaterialsResponse.Builder::accessMaterials)
                .handleResponseHeaderString(
                        "opc-request-id", GetAccessMaterialsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAccessRequestResponse getAccessRequest(GetAccessRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.AccessRequest.class,
                        GetAccessRequestResponse.Builder::accessRequest)
                .handleResponseHeaderString("etag", GetAccessRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAccessRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAccessRequestInternalResponse getAccessRequestInternal(
            GetAccessRequestInternalRequest request) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");

        return clientCall(request, GetAccessRequestInternalResponse::builder)
                .logger(LOG, "getAccessRequestInternal")
                .serviceDetails(
                        "Lockbox",
                        "GetAccessRequestInternal",
                        "https://docs.oracle.com/iaas/api/#/en/managed-access/20220126/AccessRequestExt/GetAccessRequestInternal")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAccessRequestInternalRequest::builder)
                .basePath("/20220126")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .appendPathParam("internal")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.AccessRequestExt.class,
                        GetAccessRequestInternalResponse.Builder::accessRequestExt)
                .handleResponseHeaderString("etag", GetAccessRequestInternalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAccessRequestInternalResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetApprovalTemplateResponse getApprovalTemplate(GetApprovalTemplateRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.ApprovalTemplate.class,
                        GetApprovalTemplateResponse.Builder::approvalTemplate)
                .handleResponseHeaderString("etag", GetApprovalTemplateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApprovalTemplateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLockboxResponse getLockbox(GetLockboxRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.Lockbox.class,
                        GetLockboxResponse.Builder::lockbox)
                .handleResponseHeaderString("etag", GetLockboxResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLockboxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public HandleAccessRequestResponse handleAccessRequest(HandleAccessRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        HandleAccessRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", HandleAccessRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAccessRequestsResponse listAccessRequests(ListAccessRequestsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.AccessRequestCollection.class,
                        ListAccessRequestsResponse.Builder::accessRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAccessRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAccessRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListApprovalTemplatesResponse listApprovalTemplates(
            ListApprovalTemplatesRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.ApprovalTemplateCollection.class,
                        ListApprovalTemplatesResponse.Builder::approvalTemplateCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApprovalTemplatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApprovalTemplatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListLockboxesResponse listLockboxes(ListLockboxesRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.LockboxCollection.class,
                        ListLockboxesResponse.Builder::lockboxCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLockboxesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLockboxesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.WorkRequestErrorCollection.class,
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lockbox.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateApprovalTemplateResponse updateApprovalTemplate(
            UpdateApprovalTemplateRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lockbox.model.ApprovalTemplate.class,
                        UpdateApprovalTemplateResponse.Builder::approvalTemplate)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApprovalTemplateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateApprovalTemplateResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateLockboxResponse updateLockbox(UpdateLockboxRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lockbox.model.Lockbox.class,
                        UpdateLockboxResponse.Builder::lockbox)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLockboxResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateLockboxResponse.Builder::etag)
                .callSync();
    }

    @Override
    public LockboxWaiters getWaiters() {
        return waiters;
    }

    @Override
    public LockboxPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LockboxClient(
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
    public LockboxClient(
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
    public LockboxClient(
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
    public LockboxClient(
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
    public LockboxClient(
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
    public LockboxClient(
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
    public LockboxClient(
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
    public LockboxClient(
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
