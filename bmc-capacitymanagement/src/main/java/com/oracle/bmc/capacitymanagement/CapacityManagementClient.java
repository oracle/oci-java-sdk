/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.capacitymanagement.requests.*;
import com.oracle.bmc.capacitymanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class CapacityManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements CapacityManagement {
    /** Service instance for CapacityManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CAPACITYMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://control-center-cp.{region}.oci.{secondLevelDomain}")
                    .endpointServiceName("control-center-cp")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CapacityManagementClient.class);

    private final CapacityManagementWaiters waiters;

    private final CapacityManagementPaginators paginators;

    CapacityManagementClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    CapacityManagementClient(
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
                                    .nameFormat("CapacityManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new CapacityManagementWaiters(executorService, this);

        this.paginators = new CapacityManagementPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "CapacityManagementClient", "getOccAvailabilityCatalogContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CapacityManagementClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "capacitymanagement";
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
        public CapacityManagementClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new CapacityManagementClient(
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
    public CreateOccAvailabilityCatalogResponse createOccAvailabilityCatalog(
            CreateOccAvailabilityCatalogRequest request) {
        Objects.requireNonNull(
                request.getCreateOccAvailabilityCatalogDetails(),
                "createOccAvailabilityCatalogDetails is required");

        return clientCall(request, CreateOccAvailabilityCatalogResponse::builder)
                .logger(LOG, "createOccAvailabilityCatalog")
                .serviceDetails(
                        "CapacityManagement",
                        "CreateOccAvailabilityCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccAvailabilityCatalog/CreateOccAvailabilityCatalog")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOccAvailabilityCatalogRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occAvailabilityCatalogs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog.class,
                        CreateOccAvailabilityCatalogResponse.Builder::occAvailabilityCatalog)
                .handleResponseHeaderString(
                        "etag", CreateOccAvailabilityCatalogResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOccAvailabilityCatalogResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", CreateOccAvailabilityCatalogResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public CreateOccCapacityRequestResponse createOccCapacityRequest(
            CreateOccCapacityRequestRequest request) {
        Objects.requireNonNull(
                request.getCreateOccCapacityRequestDetails(),
                "createOccCapacityRequestDetails is required");

        return clientCall(request, CreateOccCapacityRequestResponse::builder)
                .logger(LOG, "createOccCapacityRequest")
                .serviceDetails(
                        "CapacityManagement",
                        "CreateOccCapacityRequest",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCapacityRequest/CreateOccCapacityRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOccCapacityRequestRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCapacityRequests")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.class,
                        CreateOccCapacityRequestResponse.Builder::occCapacityRequest)
                .handleResponseHeaderString("etag", CreateOccCapacityRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOccCapacityRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", CreateOccCapacityRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public CreateOccCustomerResponse createOccCustomer(CreateOccCustomerRequest request) {
        Objects.requireNonNull(
                request.getCreateOccCustomerDetails(), "createOccCustomerDetails is required");

        Validate.notBlank(request.getOccCustomerGroupId(), "occCustomerGroupId must not be blank");

        return clientCall(request, CreateOccCustomerResponse::builder)
                .logger(LOG, "createOccCustomer")
                .serviceDetails(
                        "CapacityManagement",
                        "CreateOccCustomer",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCustomer/CreateOccCustomer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOccCustomerRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCustomerGroups")
                .appendPathParam(request.getOccCustomerGroupId())
                .appendPathParam("occCustomers")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCustomer.class,
                        CreateOccCustomerResponse.Builder::occCustomer)
                .handleResponseHeaderString("etag", CreateOccCustomerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOccCustomerResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", CreateOccCustomerResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public CreateOccCustomerGroupResponse createOccCustomerGroup(
            CreateOccCustomerGroupRequest request) {
        Objects.requireNonNull(
                request.getCreateOccCustomerGroupDetails(),
                "createOccCustomerGroupDetails is required");

        return clientCall(request, CreateOccCustomerGroupResponse::builder)
                .logger(LOG, "createOccCustomerGroup")
                .serviceDetails(
                        "CapacityManagement",
                        "CreateOccCustomerGroup",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCustomerGroup/CreateOccCustomerGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOccCustomerGroupRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCustomerGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.class,
                        CreateOccCustomerGroupResponse.Builder::occCustomerGroup)
                .handleResponseHeaderString("etag", CreateOccCustomerGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOccCustomerGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", CreateOccCustomerGroupResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public DeleteOccAvailabilityCatalogResponse deleteOccAvailabilityCatalog(
            DeleteOccAvailabilityCatalogRequest request) {

        Validate.notBlank(
                request.getOccAvailabilityCatalogId(),
                "occAvailabilityCatalogId must not be blank");

        return clientCall(request, DeleteOccAvailabilityCatalogResponse::builder)
                .logger(LOG, "deleteOccAvailabilityCatalog")
                .serviceDetails(
                        "CapacityManagement",
                        "DeleteOccAvailabilityCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccAvailabilityCatalog/DeleteOccAvailabilityCatalog")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOccAvailabilityCatalogRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occAvailabilityCatalogs")
                .appendPathParam(request.getOccAvailabilityCatalogId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOccAvailabilityCatalogResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", DeleteOccAvailabilityCatalogResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public DeleteOccCapacityRequestResponse deleteOccCapacityRequest(
            DeleteOccCapacityRequestRequest request) {

        Validate.notBlank(
                request.getOccCapacityRequestId(), "occCapacityRequestId must not be blank");

        return clientCall(request, DeleteOccCapacityRequestResponse::builder)
                .logger(LOG, "deleteOccCapacityRequest")
                .serviceDetails(
                        "CapacityManagement",
                        "DeleteOccCapacityRequest",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCapacityRequest/DeleteOccCapacityRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOccCapacityRequestRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCapacityRequests")
                .appendPathParam(request.getOccCapacityRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOccCapacityRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", DeleteOccCapacityRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public DeleteOccCustomerResponse deleteOccCustomer(DeleteOccCustomerRequest request) {

        Validate.notBlank(request.getOccCustomerGroupId(), "occCustomerGroupId must not be blank");

        Validate.notBlank(request.getOccCustomerId(), "occCustomerId must not be blank");

        return clientCall(request, DeleteOccCustomerResponse::builder)
                .logger(LOG, "deleteOccCustomer")
                .serviceDetails(
                        "CapacityManagement",
                        "DeleteOccCustomer",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCustomer/DeleteOccCustomer")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOccCustomerRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCustomerGroups")
                .appendPathParam(request.getOccCustomerGroupId())
                .appendPathParam("occCustomers")
                .appendPathParam(request.getOccCustomerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOccCustomerResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", DeleteOccCustomerResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public DeleteOccCustomerGroupResponse deleteOccCustomerGroup(
            DeleteOccCustomerGroupRequest request) {

        Validate.notBlank(request.getOccCustomerGroupId(), "occCustomerGroupId must not be blank");

        return clientCall(request, DeleteOccCustomerGroupResponse::builder)
                .logger(LOG, "deleteOccCustomerGroup")
                .serviceDetails(
                        "CapacityManagement",
                        "DeleteOccCustomerGroup",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCustomerGroup/DeleteOccCustomerGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOccCustomerGroupRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCustomerGroups")
                .appendPathParam(request.getOccCustomerGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOccCustomerGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", DeleteOccCustomerGroupResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public GetOccAvailabilityCatalogResponse getOccAvailabilityCatalog(
            GetOccAvailabilityCatalogRequest request) {

        Validate.notBlank(
                request.getOccAvailabilityCatalogId(),
                "occAvailabilityCatalogId must not be blank");

        return clientCall(request, GetOccAvailabilityCatalogResponse::builder)
                .logger(LOG, "getOccAvailabilityCatalog")
                .serviceDetails(
                        "CapacityManagement",
                        "GetOccAvailabilityCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccAvailabilityCatalog/GetOccAvailabilityCatalog")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOccAvailabilityCatalogRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occAvailabilityCatalogs")
                .appendPathParam(request.getOccAvailabilityCatalogId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog.class,
                        GetOccAvailabilityCatalogResponse.Builder::occAvailabilityCatalog)
                .handleResponseHeaderString("etag", GetOccAvailabilityCatalogResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOccAvailabilityCatalogResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOccAvailabilityCatalogContentResponse getOccAvailabilityCatalogContent(
            GetOccAvailabilityCatalogContentRequest request) {

        Validate.notBlank(
                request.getOccAvailabilityCatalogId(),
                "occAvailabilityCatalogId must not be blank");

        return clientCall(request, GetOccAvailabilityCatalogContentResponse::builder)
                .logger(LOG, "getOccAvailabilityCatalogContent")
                .serviceDetails(
                        "CapacityManagement",
                        "GetOccAvailabilityCatalogContent",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccAvailabilityCatalog/GetOccAvailabilityCatalogContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOccAvailabilityCatalogContentRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occAvailabilityCatalogs")
                .appendPathParam(request.getOccAvailabilityCatalogId())
                .appendPathParam("content")
                .accept("application/binary")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetOccAvailabilityCatalogContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOccAvailabilityCatalogContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOccCapacityRequestResponse getOccCapacityRequest(
            GetOccCapacityRequestRequest request) {

        Validate.notBlank(
                request.getOccCapacityRequestId(), "occCapacityRequestId must not be blank");

        return clientCall(request, GetOccCapacityRequestResponse::builder)
                .logger(LOG, "getOccCapacityRequest")
                .serviceDetails(
                        "CapacityManagement",
                        "GetOccCapacityRequest",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCapacityRequest/GetOccCapacityRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOccCapacityRequestRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCapacityRequests")
                .appendPathParam(request.getOccCapacityRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.class,
                        GetOccCapacityRequestResponse.Builder::occCapacityRequest)
                .handleResponseHeaderString("etag", GetOccCapacityRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOccCapacityRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOccCustomerGroupResponse getOccCustomerGroup(GetOccCustomerGroupRequest request) {

        Validate.notBlank(request.getOccCustomerGroupId(), "occCustomerGroupId must not be blank");

        return clientCall(request, GetOccCustomerGroupResponse::builder)
                .logger(LOG, "getOccCustomerGroup")
                .serviceDetails(
                        "CapacityManagement",
                        "GetOccCustomerGroup",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCustomerGroup/GetOccCustomerGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOccCustomerGroupRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCustomerGroups")
                .appendPathParam(request.getOccCustomerGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.class,
                        GetOccCustomerGroupResponse.Builder::occCustomerGroup)
                .handleResponseHeaderString("etag", GetOccCustomerGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOccCustomerGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInternalNamespaceOccOverviewsResponse listInternalNamespaceOccOverviews(
            ListInternalNamespaceOccOverviewsRequest request) {

        Validate.notBlank(request.getNamespace().getValue(), "namespace must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getOccCustomerGroupId(), "occCustomerGroupId is required");

        return clientCall(request, ListInternalNamespaceOccOverviewsResponse::builder)
                .logger(LOG, "listInternalNamespaceOccOverviews")
                .serviceDetails(
                        "CapacityManagement",
                        "ListInternalNamespaceOccOverviews",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccOverviewCollection/ListInternalNamespaceOccOverviews")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInternalNamespaceOccOverviewsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("namespace")
                .appendPathParam(request.getNamespace().getValue())
                .appendPathParam("occOverview")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("occCustomerGroupId", request.getOccCustomerGroupId())
                .appendQueryParam("workloadType", request.getWorkloadType())
                .appendQueryParam("from", request.getFrom())
                .appendQueryParam("to", request.getTo())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccOverviewCollection.class,
                        ListInternalNamespaceOccOverviewsResponse.Builder::occOverviewCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInternalNamespaceOccOverviewsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListInternalNamespaceOccOverviewsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListInternalOccHandoverResourceBlockDetailsResponse
            listInternalOccHandoverResourceBlockDetails(
                    ListInternalOccHandoverResourceBlockDetailsRequest request) {
        Objects.requireNonNull(
                request.getOccHandoverResourceBlockId(), "occHandoverResourceBlockId is required");

        return clientCall(request, ListInternalOccHandoverResourceBlockDetailsResponse::builder)
                .logger(LOG, "listInternalOccHandoverResourceBlockDetails")
                .serviceDetails(
                        "CapacityManagement",
                        "ListInternalOccHandoverResourceBlockDetails",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccHandoverResourceBlockDetailCollection/ListInternalOccHandoverResourceBlockDetails")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInternalOccHandoverResourceBlockDetailsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occHandoverResourceBlockDetails")
                .appendQueryParam(
                        "occHandoverResourceBlockId", request.getOccHandoverResourceBlockId())
                .appendQueryParam("hostId", request.getHostId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model
                                .OccHandoverResourceBlockDetailCollection.class,
                        ListInternalOccHandoverResourceBlockDetailsResponse.Builder
                                ::occHandoverResourceBlockDetailCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInternalOccHandoverResourceBlockDetailsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListInternalOccHandoverResourceBlockDetailsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListInternalOccHandoverResourceBlocksResponse listInternalOccHandoverResourceBlocks(
            ListInternalOccHandoverResourceBlocksRequest request) {
        Objects.requireNonNull(request.getNamespace(), "namespace is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getOccCustomerGroupId(), "occCustomerGroupId is required");

        return clientCall(request, ListInternalOccHandoverResourceBlocksResponse::builder)
                .logger(LOG, "listInternalOccHandoverResourceBlocks")
                .serviceDetails(
                        "CapacityManagement",
                        "ListInternalOccHandoverResourceBlocks",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccHandoverResourceBlockCollection/ListInternalOccHandoverResourceBlocks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInternalOccHandoverResourceBlocksRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occHandoverResourceBlocks")
                .appendEnumQueryParam("namespace", request.getNamespace())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("occCustomerGroupId", request.getOccCustomerGroupId())
                .appendQueryParam("handoverResourceName", request.getHandoverResourceName())
                .appendQueryParam(
                        "handoverDateGreaterThanOrEqualTo",
                        request.getHandoverDateGreaterThanOrEqualTo())
                .appendQueryParam(
                        "handoverDateLessThanOrEqualTo", request.getHandoverDateLessThanOrEqualTo())
                .appendQueryParam(
                        "occHandoverResourceBlockId", request.getOccHandoverResourceBlockId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccHandoverResourceBlockCollection
                                .class,
                        ListInternalOccHandoverResourceBlocksResponse.Builder
                                ::occHandoverResourceBlockCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInternalOccHandoverResourceBlocksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListInternalOccHandoverResourceBlocksResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOccAvailabilitiesResponse listOccAvailabilities(
            ListOccAvailabilitiesRequest request) {

        Validate.notBlank(
                request.getOccAvailabilityCatalogId(),
                "occAvailabilityCatalogId must not be blank");

        return clientCall(request, ListOccAvailabilitiesResponse::builder)
                .logger(LOG, "listOccAvailabilities")
                .serviceDetails(
                        "CapacityManagement",
                        "ListOccAvailabilities",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccAvailabilityCollection/ListOccAvailabilities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccAvailabilitiesRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occAvailabilityCatalogs")
                .appendPathParam(request.getOccAvailabilityCatalogId())
                .appendPathParam("occAvailabilities")
                .appendQueryParam(
                        "dateExpectedCapacityHandover", request.getDateExpectedCapacityHandover())
                .appendQueryParam("resourceName", request.getResourceName())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("workloadType", request.getWorkloadType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccAvailabilityCollection.class,
                        ListOccAvailabilitiesResponse.Builder::occAvailabilityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOccAvailabilitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOccAvailabilitiesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOccAvailabilityCatalogsResponse listOccAvailabilityCatalogs(
            ListOccAvailabilityCatalogsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOccAvailabilityCatalogsResponse::builder)
                .logger(LOG, "listOccAvailabilityCatalogs")
                .serviceDetails(
                        "CapacityManagement",
                        "ListOccAvailabilityCatalogs",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccAvailabilityCatalogCollection/ListOccAvailabilityCatalogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccAvailabilityCatalogsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occAvailabilityCatalogs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("namespace", request.getNamespace())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("catalogState", request.getCatalogState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalogCollection
                                .class,
                        ListOccAvailabilityCatalogsResponse.Builder
                                ::occAvailabilityCatalogCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOccAvailabilityCatalogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOccAvailabilityCatalogsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOccAvailabilityCatalogsInternalResponse listOccAvailabilityCatalogsInternal(
            ListOccAvailabilityCatalogsInternalRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getOccCustomerGroupId(), "occCustomerGroupId is required");

        return clientCall(request, ListOccAvailabilityCatalogsInternalResponse::builder)
                .logger(LOG, "listOccAvailabilityCatalogsInternal")
                .serviceDetails(
                        "CapacityManagement",
                        "ListOccAvailabilityCatalogsInternal",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccAvailabilityCatalogCollection/ListOccAvailabilityCatalogsInternal")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccAvailabilityCatalogsInternalRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occAvailabilityCatalogs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("namespace", request.getNamespace())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("catalogState", request.getCatalogState())
                .appendQueryParam("occCustomerGroupId", request.getOccCustomerGroupId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalogCollection
                                .class,
                        ListOccAvailabilityCatalogsInternalResponse.Builder
                                ::occAvailabilityCatalogCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOccAvailabilityCatalogsInternalResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOccAvailabilityCatalogsInternalResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOccCapacityRequestsResponse listOccCapacityRequests(
            ListOccCapacityRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOccCapacityRequestsResponse::builder)
                .logger(LOG, "listOccCapacityRequests")
                .serviceDetails(
                        "CapacityManagement",
                        "ListOccCapacityRequests",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCapacityRequestCollection/ListOccCapacityRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccCapacityRequestsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCapacityRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("occAvailabilityCatalogId", request.getOccAvailabilityCatalogId())
                .appendEnumQueryParam("namespace", request.getNamespace())
                .appendEnumQueryParam("requestType", request.getRequestType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCapacityRequestCollection.class,
                        ListOccCapacityRequestsResponse.Builder::occCapacityRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOccCapacityRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOccCapacityRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOccCapacityRequestsInternalResponse listOccCapacityRequestsInternal(
            ListOccCapacityRequestsInternalRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getOccCustomerGroupId(), "occCustomerGroupId is required");

        return clientCall(request, ListOccCapacityRequestsInternalResponse::builder)
                .logger(LOG, "listOccCapacityRequestsInternal")
                .serviceDetails(
                        "CapacityManagement",
                        "ListOccCapacityRequestsInternal",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCapacityRequestCollection/ListOccCapacityRequestsInternal")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccCapacityRequestsInternalRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occCapacityRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("occCustomerGroupId", request.getOccCustomerGroupId())
                .appendQueryParam("occAvailabilityCatalogId", request.getOccAvailabilityCatalogId())
                .appendEnumQueryParam("namespace", request.getNamespace())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("requestType", request.getRequestType())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCapacityRequestCollection.class,
                        ListOccCapacityRequestsInternalResponse.Builder
                                ::occCapacityRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOccCapacityRequestsInternalResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOccCapacityRequestsInternalResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOccCustomerGroupsResponse listOccCustomerGroups(
            ListOccCustomerGroupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOccCustomerGroupsResponse::builder)
                .logger(LOG, "listOccCustomerGroups")
                .serviceDetails(
                        "CapacityManagement",
                        "ListOccCustomerGroups",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCustomerGroupCollection/ListOccCustomerGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccCustomerGroupsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCustomerGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCustomerGroupCollection.class,
                        ListOccCustomerGroupsResponse.Builder::occCustomerGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOccCustomerGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOccCustomerGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOccHandoverResourceBlockDetailsResponse listOccHandoverResourceBlockDetails(
            ListOccHandoverResourceBlockDetailsRequest request) {
        Objects.requireNonNull(
                request.getOccHandoverResourceBlockId(), "occHandoverResourceBlockId is required");

        return clientCall(request, ListOccHandoverResourceBlockDetailsResponse::builder)
                .logger(LOG, "listOccHandoverResourceBlockDetails")
                .serviceDetails(
                        "CapacityManagement",
                        "ListOccHandoverResourceBlockDetails",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccHandoverResourceBlockDetailCollection/ListOccHandoverResourceBlockDetails")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccHandoverResourceBlockDetailsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occHandoverResourceBlockDetails")
                .appendQueryParam(
                        "occHandoverResourceBlockId", request.getOccHandoverResourceBlockId())
                .appendQueryParam("hostId", request.getHostId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model
                                .OccHandoverResourceBlockDetailCollection.class,
                        ListOccHandoverResourceBlockDetailsResponse.Builder
                                ::occHandoverResourceBlockDetailCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOccHandoverResourceBlockDetailsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOccHandoverResourceBlockDetailsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOccHandoverResourceBlocksResponse listOccHandoverResourceBlocks(
            ListOccHandoverResourceBlocksRequest request) {

        return clientCall(request, ListOccHandoverResourceBlocksResponse::builder)
                .logger(LOG, "listOccHandoverResourceBlocks")
                .serviceDetails(
                        "CapacityManagement",
                        "ListOccHandoverResourceBlocks",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccHandoverResourceBlockCollection/ListOccHandoverResourceBlocks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccHandoverResourceBlocksRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occHandoverResourceBlocks")
                .appendEnumQueryParam("namespace", request.getNamespace())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("handoverResourceName", request.getHandoverResourceName())
                .appendQueryParam(
                        "handoverDateGreaterThanOrEqualTo",
                        request.getHandoverDateGreaterThanOrEqualTo())
                .appendQueryParam(
                        "handoverDateLessThanOrEqualTo", request.getHandoverDateLessThanOrEqualTo())
                .appendQueryParam(
                        "occHandoverResourceBlockId", request.getOccHandoverResourceBlockId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccHandoverResourceBlockCollection
                                .class,
                        ListOccHandoverResourceBlocksResponse.Builder
                                ::occHandoverResourceBlockCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOccHandoverResourceBlocksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOccHandoverResourceBlocksResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOccOverviewsResponse listOccOverviews(ListOccOverviewsRequest request) {

        Validate.notBlank(request.getNamespace().getValue(), "namespace must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOccOverviewsResponse::builder)
                .logger(LOG, "listOccOverviews")
                .serviceDetails(
                        "CapacityManagement",
                        "ListOccOverviews",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccOverviewCollection/ListOccOverviews")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccOverviewsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("namespace")
                .appendPathParam(request.getNamespace().getValue())
                .appendPathParam("occOverview")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("from", request.getFrom())
                .appendQueryParam("to", request.getTo())
                .appendQueryParam("workloadType", request.getWorkloadType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccOverviewCollection.class,
                        ListOccOverviewsResponse.Builder::occOverviewCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOccOverviewsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOccOverviewsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PatchInternalOccCapacityRequestResponse patchInternalOccCapacityRequest(
            PatchInternalOccCapacityRequestRequest request) {
        Objects.requireNonNull(
                request.getPatchOccCapacityRequestDetails(),
                "patchOccCapacityRequestDetails is required");

        Validate.notBlank(
                request.getOccCapacityRequestId(), "occCapacityRequestId must not be blank");

        return clientCall(request, PatchInternalOccCapacityRequestResponse::builder)
                .logger(LOG, "patchInternalOccCapacityRequest")
                .serviceDetails(
                        "CapacityManagement",
                        "PatchInternalOccCapacityRequest",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCapacityRequest/PatchInternalOccCapacityRequest")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchInternalOccCapacityRequestRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occCapacityRequests")
                .appendPathParam(request.getOccCapacityRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.class,
                        PatchInternalOccCapacityRequestResponse.Builder::occCapacityRequest)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PatchInternalOccCapacityRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PatchInternalOccCapacityRequestResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchOccCapacityRequestResponse patchOccCapacityRequest(
            PatchOccCapacityRequestRequest request) {
        Objects.requireNonNull(
                request.getPatchOccCapacityRequestDetails(),
                "patchOccCapacityRequestDetails is required");

        Validate.notBlank(
                request.getOccCapacityRequestId(), "occCapacityRequestId must not be blank");

        return clientCall(request, PatchOccCapacityRequestResponse::builder)
                .logger(LOG, "patchOccCapacityRequest")
                .serviceDetails(
                        "CapacityManagement",
                        "PatchOccCapacityRequest",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCapacityRequest/PatchOccCapacityRequest")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchOccCapacityRequestRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCapacityRequests")
                .appendPathParam(request.getOccCapacityRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.class,
                        PatchOccCapacityRequestResponse.Builder::occCapacityRequest)
                .handleResponseHeaderString(
                        "opc-request-id", PatchOccCapacityRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchOccCapacityRequestResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PublishOccAvailabilityCatalogResponse publishOccAvailabilityCatalog(
            PublishOccAvailabilityCatalogRequest request) {

        Validate.notBlank(
                request.getOccAvailabilityCatalogId(),
                "occAvailabilityCatalogId must not be blank");

        return clientCall(request, PublishOccAvailabilityCatalogResponse::builder)
                .logger(LOG, "publishOccAvailabilityCatalog")
                .serviceDetails(
                        "CapacityManagement",
                        "PublishOccAvailabilityCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccAvailabilityCatalog/PublishOccAvailabilityCatalog")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishOccAvailabilityCatalogRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occAvailabilityCatalogs")
                .appendPathParam(request.getOccAvailabilityCatalogId())
                .appendPathParam("actions")
                .appendPathParam("publish")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        PublishOccAvailabilityCatalogResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateInternalOccCapacityRequestResponse updateInternalOccCapacityRequest(
            UpdateInternalOccCapacityRequestRequest request) {
        Objects.requireNonNull(
                request.getUpdateInternalOccCapacityRequestDetails(),
                "updateInternalOccCapacityRequestDetails is required");

        Validate.notBlank(
                request.getOccCapacityRequestId(), "occCapacityRequestId must not be blank");

        return clientCall(request, UpdateInternalOccCapacityRequestResponse::builder)
                .logger(LOG, "updateInternalOccCapacityRequest")
                .serviceDetails(
                        "CapacityManagement",
                        "UpdateInternalOccCapacityRequest",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCapacityRequest/UpdateInternalOccCapacityRequest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInternalOccCapacityRequestRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occCapacityRequests")
                .appendPathParam(request.getOccCapacityRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.class,
                        UpdateInternalOccCapacityRequestResponse.Builder::occCapacityRequest)
                .handleResponseHeaderString(
                        "etag", UpdateInternalOccCapacityRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateInternalOccCapacityRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", UpdateInternalOccCapacityRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public UpdateOccAvailabilityCatalogResponse updateOccAvailabilityCatalog(
            UpdateOccAvailabilityCatalogRequest request) {
        Objects.requireNonNull(
                request.getUpdateOccAvailabilityCatalogDetails(),
                "updateOccAvailabilityCatalogDetails is required");

        Validate.notBlank(
                request.getOccAvailabilityCatalogId(),
                "occAvailabilityCatalogId must not be blank");

        return clientCall(request, UpdateOccAvailabilityCatalogResponse::builder)
                .logger(LOG, "updateOccAvailabilityCatalog")
                .serviceDetails(
                        "CapacityManagement",
                        "UpdateOccAvailabilityCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccAvailabilityCatalog/UpdateOccAvailabilityCatalog")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOccAvailabilityCatalogRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occAvailabilityCatalogs")
                .appendPathParam(request.getOccAvailabilityCatalogId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog.class,
                        UpdateOccAvailabilityCatalogResponse.Builder::occAvailabilityCatalog)
                .handleResponseHeaderString(
                        "etag", UpdateOccAvailabilityCatalogResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOccAvailabilityCatalogResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", UpdateOccAvailabilityCatalogResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public UpdateOccCapacityRequestResponse updateOccCapacityRequest(
            UpdateOccCapacityRequestRequest request) {
        Objects.requireNonNull(
                request.getUpdateOccCapacityRequestDetails(),
                "updateOccCapacityRequestDetails is required");

        Validate.notBlank(
                request.getOccCapacityRequestId(), "occCapacityRequestId must not be blank");

        return clientCall(request, UpdateOccCapacityRequestResponse::builder)
                .logger(LOG, "updateOccCapacityRequest")
                .serviceDetails(
                        "CapacityManagement",
                        "UpdateOccCapacityRequest",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCapacityRequest/UpdateOccCapacityRequest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOccCapacityRequestRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCapacityRequests")
                .appendPathParam(request.getOccCapacityRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.class,
                        UpdateOccCapacityRequestResponse.Builder::occCapacityRequest)
                .handleResponseHeaderString("etag", UpdateOccCapacityRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOccCapacityRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", UpdateOccCapacityRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public UpdateOccCustomerResponse updateOccCustomer(UpdateOccCustomerRequest request) {
        Objects.requireNonNull(
                request.getUpdateOccCustomerDetails(), "updateOccCustomerDetails is required");

        Validate.notBlank(request.getOccCustomerGroupId(), "occCustomerGroupId must not be blank");

        Validate.notBlank(request.getOccCustomerId(), "occCustomerId must not be blank");

        return clientCall(request, UpdateOccCustomerResponse::builder)
                .logger(LOG, "updateOccCustomer")
                .serviceDetails(
                        "CapacityManagement",
                        "UpdateOccCustomer",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCustomer/UpdateOccCustomer")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOccCustomerRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCustomerGroups")
                .appendPathParam(request.getOccCustomerGroupId())
                .appendPathParam("occCustomers")
                .appendPathParam(request.getOccCustomerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCustomer.class,
                        UpdateOccCustomerResponse.Builder::occCustomer)
                .handleResponseHeaderString("etag", UpdateOccCustomerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOccCustomerResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", UpdateOccCustomerResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public UpdateOccCustomerGroupResponse updateOccCustomerGroup(
            UpdateOccCustomerGroupRequest request) {
        Objects.requireNonNull(
                request.getUpdateOccCustomerGroupDetails(),
                "updateOccCustomerGroupDetails is required");

        Validate.notBlank(request.getOccCustomerGroupId(), "occCustomerGroupId must not be blank");

        return clientCall(request, UpdateOccCustomerGroupResponse::builder)
                .logger(LOG, "updateOccCustomerGroup")
                .serviceDetails(
                        "CapacityManagement",
                        "UpdateOccCustomerGroup",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccCustomerGroup/UpdateOccCustomerGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOccCustomerGroupRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occCustomerGroups")
                .appendPathParam(request.getOccCustomerGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.class,
                        UpdateOccCustomerGroupResponse.Builder::occCustomerGroup)
                .handleResponseHeaderString("etag", UpdateOccCustomerGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOccCustomerGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", UpdateOccCustomerGroupResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public CapacityManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public CapacityManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CapacityManagementClient(
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
    public CapacityManagementClient(
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
    public CapacityManagementClient(
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
    public CapacityManagementClient(
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
    public CapacityManagementClient(
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
    public CapacityManagementClient(
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
    public CapacityManagementClient(
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
    public CapacityManagementClient(
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
