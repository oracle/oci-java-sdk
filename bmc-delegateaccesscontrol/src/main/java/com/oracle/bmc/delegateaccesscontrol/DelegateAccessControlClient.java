/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.delegateaccesscontrol.requests.*;
import com.oracle.bmc.delegateaccesscontrol.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class DelegateAccessControlClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DelegateAccessControl {
    /** Service instance for DelegateAccessControl. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DelegateAccessControlClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://delegate-access-control.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DelegateAccessControlClient.class);

    private final DelegateAccessControlWaiters waiters;

    private final DelegateAccessControlPaginators paginators;

    DelegateAccessControlClient(
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
                                    .nameFormat("DelegateAccessControl-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DelegateAccessControlWaiters(executorService, this);

        this.paginators = new DelegateAccessControlPaginators(this);
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
                    Builder, DelegateAccessControlClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "delegateaccesscontrol";
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
        public DelegateAccessControlClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DelegateAccessControlClient(
                    this, authenticationDetailsProvider, executorService);
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
    public ApproveDelegatedResourceAccessRequestResponse approveDelegatedResourceAccessRequest(
            ApproveDelegatedResourceAccessRequestRequest request) {

        Validate.notBlank(
                request.getDelegatedResourceAccessRequestId(),
                "delegatedResourceAccessRequestId must not be blank");
        Objects.requireNonNull(
                request.getApproveDelegatedResourceAccessRequestDetails(),
                "approveDelegatedResourceAccessRequestDetails is required");

        return clientCall(request, ApproveDelegatedResourceAccessRequestResponse::builder)
                .logger(LOG, "approveDelegatedResourceAccessRequest")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ApproveDelegatedResourceAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegatedResourceAccessRequest/ApproveDelegatedResourceAccessRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApproveDelegatedResourceAccessRequestRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegatedResourceAccessRequests")
                .appendPathParam(request.getDelegatedResourceAccessRequestId())
                .appendPathParam("actions")
                .appendPathParam("approve")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ApproveDelegatedResourceAccessRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ApproveDelegatedResourceAccessRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDelegationControlCompartmentResponse changeDelegationControlCompartment(
            ChangeDelegationControlCompartmentRequest request) {

        Validate.notBlank(
                request.getDelegationControlId(), "delegationControlId must not be blank");
        Objects.requireNonNull(
                request.getChangeDelegationControlCompartmentDetails(),
                "changeDelegationControlCompartmentDetails is required");

        return clientCall(request, ChangeDelegationControlCompartmentResponse::builder)
                .logger(LOG, "changeDelegationControlCompartment")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ChangeDelegationControlCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationControl/ChangeDelegationControlCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDelegationControlCompartmentRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationControls")
                .appendPathParam(request.getDelegationControlId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDelegationControlCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDelegationControlCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeDelegationSubscriptionCompartmentResponse changeDelegationSubscriptionCompartment(
            ChangeDelegationSubscriptionCompartmentRequest request) {

        Validate.notBlank(
                request.getDelegationSubscriptionId(),
                "delegationSubscriptionId must not be blank");
        Objects.requireNonNull(
                request.getChangeDelegationSubscriptionCompartmentDetails(),
                "changeDelegationSubscriptionCompartmentDetails is required");

        return clientCall(request, ChangeDelegationSubscriptionCompartmentResponse::builder)
                .logger(LOG, "changeDelegationSubscriptionCompartment")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ChangeDelegationSubscriptionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationSubscription/ChangeDelegationSubscriptionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDelegationSubscriptionCompartmentRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationSubscriptions")
                .appendPathParam(request.getDelegationSubscriptionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDelegationSubscriptionCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDelegationSubscriptionCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateDelegationControlResponse createDelegationControl(
            CreateDelegationControlRequest request) {
        Objects.requireNonNull(
                request.getCreateDelegationControlDetails(),
                "createDelegationControlDetails is required");

        return clientCall(request, CreateDelegationControlResponse::builder)
                .logger(LOG, "createDelegationControl")
                .serviceDetails(
                        "DelegateAccessControl",
                        "CreateDelegationControl",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationControl/CreateDelegationControl")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDelegationControlRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationControls")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model.DelegationControl.class,
                        CreateDelegationControlResponse.Builder::delegationControl)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDelegationControlResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDelegationControlResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateDelegationControlResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateDelegationControlResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateDelegationControlResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateDelegationSubscriptionResponse createDelegationSubscription(
            CreateDelegationSubscriptionRequest request) {
        Objects.requireNonNull(
                request.getCreateDelegationSubscriptionDetails(),
                "createDelegationSubscriptionDetails is required");

        return clientCall(request, CreateDelegationSubscriptionResponse::builder)
                .logger(LOG, "createDelegationSubscription")
                .serviceDetails(
                        "DelegateAccessControl",
                        "CreateDelegationSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationSubscription/CreateDelegationSubscription")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDelegationSubscriptionRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationSubscriptions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription.class,
                        CreateDelegationSubscriptionResponse.Builder::delegationSubscription)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDelegationSubscriptionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDelegationSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateDelegationSubscriptionResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateDelegationSubscriptionResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateDelegationSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteDelegationControlResponse deleteDelegationControl(
            DeleteDelegationControlRequest request) {

        Validate.notBlank(
                request.getDelegationControlId(), "delegationControlId must not be blank");

        return clientCall(request, DeleteDelegationControlResponse::builder)
                .logger(LOG, "deleteDelegationControl")
                .serviceDetails(
                        "DelegateAccessControl",
                        "DeleteDelegationControl",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationControl/DeleteDelegationControl")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDelegationControlRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationControls")
                .appendPathParam(request.getDelegationControlId())
                .appendQueryParam("description", request.getDescription())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDelegationControlResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDelegationControlResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteDelegationSubscriptionResponse deleteDelegationSubscription(
            DeleteDelegationSubscriptionRequest request) {

        Validate.notBlank(
                request.getDelegationSubscriptionId(),
                "delegationSubscriptionId must not be blank");

        return clientCall(request, DeleteDelegationSubscriptionResponse::builder)
                .logger(LOG, "deleteDelegationSubscription")
                .serviceDetails(
                        "DelegateAccessControl",
                        "DeleteDelegationSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationSubscription/DeleteDelegationSubscription")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDelegationSubscriptionRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationSubscriptions")
                .appendPathParam(request.getDelegationSubscriptionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDelegationSubscriptionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDelegationSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDelegatedResourceAccessRequestResponse getDelegatedResourceAccessRequest(
            GetDelegatedResourceAccessRequestRequest request) {

        Validate.notBlank(
                request.getDelegatedResourceAccessRequestId(),
                "delegatedResourceAccessRequestId must not be blank");

        return clientCall(request, GetDelegatedResourceAccessRequestResponse::builder)
                .logger(LOG, "getDelegatedResourceAccessRequest")
                .serviceDetails(
                        "DelegateAccessControl",
                        "GetDelegatedResourceAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegatedResourceAccessRequest/GetDelegatedResourceAccessRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDelegatedResourceAccessRequestRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegatedResourceAccessRequests")
                .appendPathParam(request.getDelegatedResourceAccessRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequest
                                .class,
                        GetDelegatedResourceAccessRequestResponse.Builder
                                ::delegatedResourceAccessRequest)
                .handleResponseHeaderString(
                        "etag", GetDelegatedResourceAccessRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDelegatedResourceAccessRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDelegatedResourceAccessRequestAuditLogReportResponse
            getDelegatedResourceAccessRequestAuditLogReport(
                    GetDelegatedResourceAccessRequestAuditLogReportRequest request) {

        Validate.notBlank(
                request.getDelegatedResourceAccessRequestId(),
                "delegatedResourceAccessRequestId must not be blank");

        return clientCall(request, GetDelegatedResourceAccessRequestAuditLogReportResponse::builder)
                .logger(LOG, "getDelegatedResourceAccessRequestAuditLogReport")
                .serviceDetails(
                        "DelegateAccessControl",
                        "GetDelegatedResourceAccessRequestAuditLogReport",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegatedResourceAccessRequestAuditLogReport/GetDelegatedResourceAccessRequestAuditLogReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDelegatedResourceAccessRequestAuditLogReportRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegatedResourceAccessRequests")
                .appendPathParam(request.getDelegatedResourceAccessRequestId())
                .appendPathParam("delegatedResourceAccessRequestAuditLogReport")
                .appendQueryParam("isProcessTreeEnabled", request.getIsProcessTreeEnabled())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model
                                .DelegatedResourceAccessRequestAuditLogReport.class,
                        GetDelegatedResourceAccessRequestAuditLogReportResponse.Builder
                                ::delegatedResourceAccessRequestAuditLogReport)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDelegatedResourceAccessRequestAuditLogReportResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public GetDelegationControlResponse getDelegationControl(GetDelegationControlRequest request) {

        Validate.notBlank(
                request.getDelegationControlId(), "delegationControlId must not be blank");

        return clientCall(request, GetDelegationControlResponse::builder)
                .logger(LOG, "getDelegationControl")
                .serviceDetails(
                        "DelegateAccessControl",
                        "GetDelegationControl",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationControl/GetDelegationControl")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDelegationControlRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationControls")
                .appendPathParam(request.getDelegationControlId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model.DelegationControl.class,
                        GetDelegationControlResponse.Builder::delegationControl)
                .handleResponseHeaderString("etag", GetDelegationControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDelegationControlResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDelegationSubscriptionResponse getDelegationSubscription(
            GetDelegationSubscriptionRequest request) {

        Validate.notBlank(
                request.getDelegationSubscriptionId(),
                "delegationSubscriptionId must not be blank");

        return clientCall(request, GetDelegationSubscriptionResponse::builder)
                .logger(LOG, "getDelegationSubscription")
                .serviceDetails(
                        "DelegateAccessControl",
                        "GetDelegationSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationSubscription/GetDelegationSubscription")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDelegationSubscriptionRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationSubscriptions")
                .appendPathParam(request.getDelegationSubscriptionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription.class,
                        GetDelegationSubscriptionResponse.Builder::delegationSubscription)
                .handleResponseHeaderString("etag", GetDelegationSubscriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDelegationSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetServiceProviderResponse getServiceProvider(GetServiceProviderRequest request) {

        Validate.notBlank(request.getServiceProviderId(), "serviceProviderId must not be blank");

        return clientCall(request, GetServiceProviderResponse::builder)
                .logger(LOG, "getServiceProvider")
                .serviceDetails(
                        "DelegateAccessControl",
                        "GetServiceProvider",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/ServiceProvider/GetServiceProvider")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetServiceProviderRequest::builder)
                .basePath("/20230801")
                .appendPathParam("serviceProviders")
                .appendPathParam(request.getServiceProviderId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.class,
                        GetServiceProviderResponse.Builder::serviceProvider)
                .handleResponseHeaderString("etag", GetServiceProviderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetServiceProviderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetServiceProviderActionResponse getServiceProviderAction(
            GetServiceProviderActionRequest request) {

        Validate.notBlank(
                request.getServiceProviderActionId(), "serviceProviderActionId must not be blank");

        return clientCall(request, GetServiceProviderActionResponse::builder)
                .logger(LOG, "getServiceProviderAction")
                .serviceDetails(
                        "DelegateAccessControl",
                        "GetServiceProviderAction",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/ServiceProviderAction/GetServiceProviderAction")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetServiceProviderActionRequest::builder)
                .basePath("/20230801")
                .appendPathParam("serviceProviderActions")
                .appendPathParam(request.getServiceProviderActionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderAction.class,
                        GetServiceProviderActionResponse.Builder::serviceProviderAction)
                .handleResponseHeaderString("etag", GetServiceProviderActionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetServiceProviderActionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDelegatedResourceAccessRequestHistoriesResponse
            listDelegatedResourceAccessRequestHistories(
                    ListDelegatedResourceAccessRequestHistoriesRequest request) {

        Validate.notBlank(
                request.getDelegatedResourceAccessRequestId(),
                "delegatedResourceAccessRequestId must not be blank");

        return clientCall(request, ListDelegatedResourceAccessRequestHistoriesResponse::builder)
                .logger(LOG, "listDelegatedResourceAccessRequestHistories")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ListDelegatedResourceAccessRequestHistories",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegatedResourceAccessRequest/ListDelegatedResourceAccessRequestHistories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDelegatedResourceAccessRequestHistoriesRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegatedResourceAccessRequests")
                .appendPathParam(request.getDelegatedResourceAccessRequestId())
                .appendPathParam("history")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model
                                .DelegatedResourceAccessRequestHistoryCollection.class,
                        ListDelegatedResourceAccessRequestHistoriesResponse.Builder
                                ::delegatedResourceAccessRequestHistoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDelegatedResourceAccessRequestHistoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDelegatedResourceAccessRequestHistoriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDelegatedResourceAccessRequestsResponse listDelegatedResourceAccessRequests(
            ListDelegatedResourceAccessRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDelegatedResourceAccessRequestsResponse::builder)
                .logger(LOG, "listDelegatedResourceAccessRequests")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ListDelegatedResourceAccessRequests",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegatedResourceAccessRequest/ListDelegatedResourceAccessRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDelegatedResourceAccessRequestsRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegatedResourceAccessRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("delegationControlId", request.getDelegationControlId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("requestStatus", request.getRequestStatus())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model
                                .DelegatedResourceAccessRequestSummaryCollection.class,
                        ListDelegatedResourceAccessRequestsResponse.Builder
                                ::delegatedResourceAccessRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDelegatedResourceAccessRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDelegatedResourceAccessRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDelegationControlResourcesResponse listDelegationControlResources(
            ListDelegationControlResourcesRequest request) {

        Validate.notBlank(
                request.getDelegationControlId(), "delegationControlId must not be blank");

        return clientCall(request, ListDelegationControlResourcesResponse::builder)
                .logger(LOG, "listDelegationControlResources")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ListDelegationControlResources",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationControl/ListDelegationControlResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDelegationControlResourcesRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationControls")
                .appendPathParam(request.getDelegationControlId())
                .appendPathParam("resources")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model
                                .DelegationControlResourceCollection.class,
                        ListDelegationControlResourcesResponse.Builder
                                ::delegationControlResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDelegationControlResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDelegationControlResourcesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDelegationControlsResponse listDelegationControls(
            ListDelegationControlsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDelegationControlsResponse::builder)
                .logger(LOG, "listDelegationControls")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ListDelegationControls",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationControl/ListDelegationControls")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDelegationControlsRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationControls")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model
                                .DelegationControlSummaryCollection.class,
                        ListDelegationControlsResponse.Builder::delegationControlSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDelegationControlsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDelegationControlsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDelegationSubscriptionsResponse listDelegationSubscriptions(
            ListDelegationSubscriptionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDelegationSubscriptionsResponse::builder)
                .logger(LOG, "listDelegationSubscriptions")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ListDelegationSubscriptions",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationSubscription/ListDelegationSubscriptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDelegationSubscriptionsRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationSubscriptions")
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
                        com.oracle.bmc.delegateaccesscontrol.model
                                .DelegationSubscriptionSummaryCollection.class,
                        ListDelegationSubscriptionsResponse.Builder
                                ::delegationSubscriptionSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDelegationSubscriptionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDelegationSubscriptionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListServiceProviderActionsResponse listServiceProviderActions(
            ListServiceProviderActionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListServiceProviderActionsResponse::builder)
                .logger(LOG, "listServiceProviderActions")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ListServiceProviderActions",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/ServiceProviderAction/ListServiceProviderActions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServiceProviderActionsRequest::builder)
                .basePath("/20230801")
                .appendPathParam("serviceProviderActions")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("resourceType", request.getResourceType())
                .appendListQueryParam(
                        "serviceProviderServiceType",
                        request.getServiceProviderServiceType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model
                                .ServiceProviderActionSummaryCollection.class,
                        ListServiceProviderActionsResponse.Builder
                                ::serviceProviderActionSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListServiceProviderActionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListServiceProviderActionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListServiceProviderInteractionsResponse listServiceProviderInteractions(
            ListServiceProviderInteractionsRequest request) {

        Validate.notBlank(
                request.getDelegatedResourceAccessRequestId(),
                "delegatedResourceAccessRequestId must not be blank");

        return clientCall(request, ListServiceProviderInteractionsResponse::builder)
                .logger(LOG, "listServiceProviderInteractions")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ListServiceProviderInteractions",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegatedResourceAccessRequest/ListServiceProviderInteractions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServiceProviderInteractionsRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegatedResourceAccessRequests")
                .appendPathParam(request.getDelegatedResourceAccessRequestId())
                .appendPathParam("serviceProviderInteractions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model
                                .ServiceProviderInteractionCollection.class,
                        ListServiceProviderInteractionsResponse.Builder
                                ::serviceProviderInteractionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListServiceProviderInteractionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListServiceProviderInteractionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListServiceProvidersResponse listServiceProviders(ListServiceProvidersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListServiceProvidersResponse::builder)
                .logger(LOG, "listServiceProviders")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ListServiceProviders",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/ServiceProvider/ListServiceProviders")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServiceProvidersRequest::builder)
                .basePath("/20230801")
                .appendPathParam("serviceProviders")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("supportedResourceType", request.getSupportedResourceType())
                .appendEnumQueryParam("serviceProviderType", request.getServiceProviderType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderSummaryCollection
                                .class,
                        ListServiceProvidersResponse.Builder::serviceProviderSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListServiceProvidersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListServiceProvidersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RejectDelegatedResourceAccessRequestResponse rejectDelegatedResourceAccessRequest(
            RejectDelegatedResourceAccessRequestRequest request) {

        Validate.notBlank(
                request.getDelegatedResourceAccessRequestId(),
                "delegatedResourceAccessRequestId must not be blank");
        Objects.requireNonNull(
                request.getRejectDelegatedResourceAccessRequestDetails(),
                "rejectDelegatedResourceAccessRequestDetails is required");

        return clientCall(request, RejectDelegatedResourceAccessRequestResponse::builder)
                .logger(LOG, "rejectDelegatedResourceAccessRequest")
                .serviceDetails(
                        "DelegateAccessControl",
                        "RejectDelegatedResourceAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegatedResourceAccessRequest/RejectDelegatedResourceAccessRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RejectDelegatedResourceAccessRequestRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegatedResourceAccessRequests")
                .appendPathParam(request.getDelegatedResourceAccessRequestId())
                .appendPathParam("actions")
                .appendPathParam("reject")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RejectDelegatedResourceAccessRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RejectDelegatedResourceAccessRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RevokeDelegatedResourceAccessRequestResponse revokeDelegatedResourceAccessRequest(
            RevokeDelegatedResourceAccessRequestRequest request) {

        Validate.notBlank(
                request.getDelegatedResourceAccessRequestId(),
                "delegatedResourceAccessRequestId must not be blank");
        Objects.requireNonNull(
                request.getRevokeDelegatedResourceAccessRequestDetails(),
                "revokeDelegatedResourceAccessRequestDetails is required");

        return clientCall(request, RevokeDelegatedResourceAccessRequestResponse::builder)
                .logger(LOG, "revokeDelegatedResourceAccessRequest")
                .serviceDetails(
                        "DelegateAccessControl",
                        "RevokeDelegatedResourceAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegatedResourceAccessRequest/RevokeDelegatedResourceAccessRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RevokeDelegatedResourceAccessRequestRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegatedResourceAccessRequests")
                .appendPathParam(request.getDelegatedResourceAccessRequestId())
                .appendPathParam("actions")
                .appendPathParam("revoke")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RevokeDelegatedResourceAccessRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RevokeDelegatedResourceAccessRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ServiceProviderInteractionRequestResponse serviceProviderInteractionRequest(
            ServiceProviderInteractionRequestRequest request) {

        Validate.notBlank(
                request.getDelegatedResourceAccessRequestId(),
                "delegatedResourceAccessRequestId must not be blank");
        Objects.requireNonNull(
                request.getServiceProviderInteractionRequestDetails(),
                "serviceProviderInteractionRequestDetails is required");

        return clientCall(request, ServiceProviderInteractionRequestResponse::builder)
                .logger(LOG, "serviceProviderInteractionRequest")
                .serviceDetails(
                        "DelegateAccessControl",
                        "ServiceProviderInteractionRequest",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegatedResourceAccessRequest/ServiceProviderInteractionRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ServiceProviderInteractionRequestRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegatedResourceAccessRequests")
                .appendPathParam(request.getDelegatedResourceAccessRequestId())
                .appendPathParam("actions")
                .appendPathParam("serviceProviderInteractionRequest")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ServiceProviderInteractionRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDelegationControlResponse updateDelegationControl(
            UpdateDelegationControlRequest request) {

        Validate.notBlank(
                request.getDelegationControlId(), "delegationControlId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDelegationControlDetails(),
                "updateDelegationControlDetails is required");

        return clientCall(request, UpdateDelegationControlResponse::builder)
                .logger(LOG, "updateDelegationControl")
                .serviceDetails(
                        "DelegateAccessControl",
                        "UpdateDelegationControl",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationControl/UpdateDelegationControl")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDelegationControlRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationControls")
                .appendPathParam(request.getDelegationControlId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model.DelegationControl.class,
                        UpdateDelegationControlResponse.Builder::delegationControl)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDelegationControlResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDelegationControlResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "content-location",
                        UpdateDelegationControlResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", UpdateDelegationControlResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateDelegationSubscriptionResponse updateDelegationSubscription(
            UpdateDelegationSubscriptionRequest request) {

        Validate.notBlank(
                request.getDelegationSubscriptionId(),
                "delegationSubscriptionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDelegationSubscriptionDetails(),
                "updateDelegationSubscriptionDetails is required");

        return clientCall(request, UpdateDelegationSubscriptionResponse::builder)
                .logger(LOG, "updateDelegationSubscription")
                .serviceDetails(
                        "DelegateAccessControl",
                        "UpdateDelegationSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/delegate-access-control/20230801/DelegationSubscription/UpdateDelegationSubscription")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDelegationSubscriptionRequest::builder)
                .basePath("/20230801")
                .appendPathParam("delegationSubscriptions")
                .appendPathParam(request.getDelegationSubscriptionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription.class,
                        UpdateDelegationSubscriptionResponse.Builder::delegationSubscription)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDelegationSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDelegationSubscriptionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "content-location",
                        UpdateDelegationSubscriptionResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", UpdateDelegationSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DelegateAccessControlWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DelegateAccessControlPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DelegateAccessControlClient(
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
    public DelegateAccessControlClient(
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
    public DelegateAccessControlClient(
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
    public DelegateAccessControlClient(
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
    public DelegateAccessControlClient(
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
    public DelegateAccessControlClient(
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
    public DelegateAccessControlClient(
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
    public DelegateAccessControlClient(
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
