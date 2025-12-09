/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.waf.requests.*;
import com.oracle.bmc.waf.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class WafClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Waf {
    /** Service instance for Waf. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(WafClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://waf.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WafClient.class);

    private final WafWaiters waiters;

    private final WafPaginators paginators;

    WafClient(
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
                                    .nameFormat("Waf-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new WafWaiters(executorService, this);

        this.paginators = new WafPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WafClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "waf";
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
        public WafClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new WafClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeNetworkAddressListCompartmentResponse changeNetworkAddressListCompartment(
            ChangeNetworkAddressListCompartmentRequest request) {

        Validate.notBlank(
                request.getNetworkAddressListId(), "networkAddressListId must not be blank");
        Objects.requireNonNull(
                request.getChangeNetworkAddressListCompartmentDetails(),
                "changeNetworkAddressListCompartmentDetails is required");

        return clientCall(request, ChangeNetworkAddressListCompartmentResponse::builder)
                .logger(LOG, "changeNetworkAddressListCompartment")
                .serviceDetails(
                        "Waf",
                        "ChangeNetworkAddressListCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/NetworkAddressList/ChangeNetworkAddressListCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNetworkAddressListCompartmentRequest::builder)
                .basePath("/20210930")
                .appendPathParam("networkAddressLists")
                .appendPathParam(request.getNetworkAddressListId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeNetworkAddressListCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeNetworkAddressListCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeWebAppFirewallCompartmentResponse changeWebAppFirewallCompartment(
            ChangeWebAppFirewallCompartmentRequest request) {

        Validate.notBlank(request.getWebAppFirewallId(), "webAppFirewallId must not be blank");
        Objects.requireNonNull(
                request.getChangeWebAppFirewallCompartmentDetails(),
                "changeWebAppFirewallCompartmentDetails is required");

        return clientCall(request, ChangeWebAppFirewallCompartmentResponse::builder)
                .logger(LOG, "changeWebAppFirewallCompartment")
                .serviceDetails(
                        "Waf",
                        "ChangeWebAppFirewallCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewall/ChangeWebAppFirewallCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeWebAppFirewallCompartmentRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewalls")
                .appendPathParam(request.getWebAppFirewallId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeWebAppFirewallCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeWebAppFirewallCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeWebAppFirewallPolicyCompartmentResponse changeWebAppFirewallPolicyCompartment(
            ChangeWebAppFirewallPolicyCompartmentRequest request) {

        Validate.notBlank(
                request.getWebAppFirewallPolicyId(), "webAppFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeWebAppFirewallPolicyCompartmentDetails(),
                "changeWebAppFirewallPolicyCompartmentDetails is required");

        return clientCall(request, ChangeWebAppFirewallPolicyCompartmentResponse::builder)
                .logger(LOG, "changeWebAppFirewallPolicyCompartment")
                .serviceDetails(
                        "Waf",
                        "ChangeWebAppFirewallPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewallPolicy/ChangeWebAppFirewallPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeWebAppFirewallPolicyCompartmentRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewallPolicies")
                .appendPathParam(request.getWebAppFirewallPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeWebAppFirewallPolicyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeWebAppFirewallPolicyCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateNetworkAddressListResponse createNetworkAddressList(
            CreateNetworkAddressListRequest request) {
        Objects.requireNonNull(
                request.getCreateNetworkAddressListDetails(),
                "createNetworkAddressListDetails is required");

        return clientCall(request, CreateNetworkAddressListResponse::builder)
                .logger(LOG, "createNetworkAddressList")
                .serviceDetails(
                        "Waf",
                        "CreateNetworkAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/NetworkAddressList/CreateNetworkAddressList")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNetworkAddressListRequest::builder)
                .basePath("/20210930")
                .appendPathParam("networkAddressLists")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waf.model.NetworkAddressList.class,
                        CreateNetworkAddressListResponse.Builder::networkAddressList)
                .handleResponseHeaderString("etag", CreateNetworkAddressListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateNetworkAddressListResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNetworkAddressListResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateNetworkAddressListResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateNetworkAddressListResponse.Builder::contentLocation)
                .callSync();
    }

    @Override
    public CreateWebAppFirewallResponse createWebAppFirewall(CreateWebAppFirewallRequest request) {
        Objects.requireNonNull(
                request.getCreateWebAppFirewallDetails(),
                "createWebAppFirewallDetails is required");

        return clientCall(request, CreateWebAppFirewallResponse::builder)
                .logger(LOG, "createWebAppFirewall")
                .serviceDetails(
                        "Waf",
                        "CreateWebAppFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewall/CreateWebAppFirewall")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateWebAppFirewallRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewalls")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waf.model.WebAppFirewall.class,
                        CreateWebAppFirewallResponse.Builder::webAppFirewall)
                .handleResponseHeaderString("etag", CreateWebAppFirewallResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateWebAppFirewallResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateWebAppFirewallResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateWebAppFirewallResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateWebAppFirewallResponse.Builder::contentLocation)
                .callSync();
    }

    @Override
    public CreateWebAppFirewallPolicyResponse createWebAppFirewallPolicy(
            CreateWebAppFirewallPolicyRequest request) {
        Objects.requireNonNull(
                request.getCreateWebAppFirewallPolicyDetails(),
                "createWebAppFirewallPolicyDetails is required");

        return clientCall(request, CreateWebAppFirewallPolicyResponse::builder)
                .logger(LOG, "createWebAppFirewallPolicy")
                .serviceDetails(
                        "Waf",
                        "CreateWebAppFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewallPolicy/CreateWebAppFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateWebAppFirewallPolicyRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewallPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waf.model.WebAppFirewallPolicy.class,
                        CreateWebAppFirewallPolicyResponse.Builder::webAppFirewallPolicy)
                .handleResponseHeaderString(
                        "etag", CreateWebAppFirewallPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateWebAppFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateWebAppFirewallPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateWebAppFirewallPolicyResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateWebAppFirewallPolicyResponse.Builder::contentLocation)
                .callSync();
    }

    @Override
    public DeleteNetworkAddressListResponse deleteNetworkAddressList(
            DeleteNetworkAddressListRequest request) {

        Validate.notBlank(
                request.getNetworkAddressListId(), "networkAddressListId must not be blank");

        return clientCall(request, DeleteNetworkAddressListResponse::builder)
                .logger(LOG, "deleteNetworkAddressList")
                .serviceDetails(
                        "Waf",
                        "DeleteNetworkAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/NetworkAddressList/DeleteNetworkAddressList")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNetworkAddressListRequest::builder)
                .basePath("/20210930")
                .appendPathParam("networkAddressLists")
                .appendPathParam(request.getNetworkAddressListId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteNetworkAddressListResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNetworkAddressListResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteWebAppFirewallResponse deleteWebAppFirewall(DeleteWebAppFirewallRequest request) {

        Validate.notBlank(request.getWebAppFirewallId(), "webAppFirewallId must not be blank");

        return clientCall(request, DeleteWebAppFirewallResponse::builder)
                .logger(LOG, "deleteWebAppFirewall")
                .serviceDetails(
                        "Waf",
                        "DeleteWebAppFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewall/DeleteWebAppFirewall")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWebAppFirewallRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewalls")
                .appendPathParam(request.getWebAppFirewallId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteWebAppFirewallResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWebAppFirewallResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteWebAppFirewallPolicyResponse deleteWebAppFirewallPolicy(
            DeleteWebAppFirewallPolicyRequest request) {

        Validate.notBlank(
                request.getWebAppFirewallPolicyId(), "webAppFirewallPolicyId must not be blank");

        return clientCall(request, DeleteWebAppFirewallPolicyResponse::builder)
                .logger(LOG, "deleteWebAppFirewallPolicy")
                .serviceDetails(
                        "Waf",
                        "DeleteWebAppFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewallPolicy/DeleteWebAppFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWebAppFirewallPolicyRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewallPolicies")
                .appendPathParam(request.getWebAppFirewallPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteWebAppFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWebAppFirewallPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetNetworkAddressListResponse getNetworkAddressList(
            GetNetworkAddressListRequest request) {

        Validate.notBlank(
                request.getNetworkAddressListId(), "networkAddressListId must not be blank");

        return clientCall(request, GetNetworkAddressListResponse::builder)
                .logger(LOG, "getNetworkAddressList")
                .serviceDetails(
                        "Waf",
                        "GetNetworkAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/NetworkAddressList/GetNetworkAddressList")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkAddressListRequest::builder)
                .basePath("/20210930")
                .appendPathParam("networkAddressLists")
                .appendPathParam(request.getNetworkAddressListId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waf.model.NetworkAddressList.class,
                        GetNetworkAddressListResponse.Builder::networkAddressList)
                .handleResponseHeaderString("etag", GetNetworkAddressListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkAddressListResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWebAppFirewallResponse getWebAppFirewall(GetWebAppFirewallRequest request) {

        Validate.notBlank(request.getWebAppFirewallId(), "webAppFirewallId must not be blank");

        return clientCall(request, GetWebAppFirewallResponse::builder)
                .logger(LOG, "getWebAppFirewall")
                .serviceDetails(
                        "Waf",
                        "GetWebAppFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewall/GetWebAppFirewall")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWebAppFirewallRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewalls")
                .appendPathParam(request.getWebAppFirewallId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waf.model.WebAppFirewall.class,
                        GetWebAppFirewallResponse.Builder::webAppFirewall)
                .handleResponseHeaderString("etag", GetWebAppFirewallResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWebAppFirewallResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWebAppFirewallPolicyResponse getWebAppFirewallPolicy(
            GetWebAppFirewallPolicyRequest request) {

        Validate.notBlank(
                request.getWebAppFirewallPolicyId(), "webAppFirewallPolicyId must not be blank");

        return clientCall(request, GetWebAppFirewallPolicyResponse::builder)
                .logger(LOG, "getWebAppFirewallPolicy")
                .serviceDetails(
                        "Waf",
                        "GetWebAppFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewallPolicy/GetWebAppFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWebAppFirewallPolicyRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewallPolicies")
                .appendPathParam(request.getWebAppFirewallPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waf.model.WebAppFirewallPolicy.class,
                        GetWebAppFirewallPolicyResponse.Builder::webAppFirewallPolicy)
                .handleResponseHeaderString("etag", GetWebAppFirewallPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWebAppFirewallPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Waf",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210930")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waf.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListNetworkAddressListsResponse listNetworkAddressLists(
            ListNetworkAddressListsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNetworkAddressListsResponse::builder)
                .logger(LOG, "listNetworkAddressLists")
                .serviceDetails(
                        "Waf",
                        "ListNetworkAddressLists",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/NetworkAddressList/ListNetworkAddressLists")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkAddressListsRequest::builder)
                .basePath("/20210930")
                .appendPathParam("networkAddressLists")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                        com.oracle.bmc.waf.model.NetworkAddressListCollection.class,
                        ListNetworkAddressListsResponse.Builder::networkAddressListCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNetworkAddressListsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkAddressListsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListProtectionCapabilitiesResponse listProtectionCapabilities(
            ListProtectionCapabilitiesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProtectionCapabilitiesResponse::builder)
                .logger(LOG, "listProtectionCapabilities")
                .serviceDetails(
                        "Waf",
                        "ListProtectionCapabilities",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/ProtectionCapability/ListProtectionCapabilities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProtectionCapabilitiesRequest::builder)
                .basePath("/20210930")
                .appendPathParam("protectionCapabilities")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("key", request.getKey())
                .appendListQueryParam(
                        "isLatestVersion",
                        request.getIsLatestVersion(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("type", request.getType())
                .appendListQueryParam(
                        "groupTag",
                        request.getGroupTag(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waf.model.ProtectionCapabilityCollection.class,
                        ListProtectionCapabilitiesResponse.Builder::protectionCapabilityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProtectionCapabilitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProtectionCapabilitiesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListProtectionCapabilityGroupTagsResponse listProtectionCapabilityGroupTags(
            ListProtectionCapabilityGroupTagsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProtectionCapabilityGroupTagsResponse::builder)
                .logger(LOG, "listProtectionCapabilityGroupTags")
                .serviceDetails(
                        "Waf",
                        "ListProtectionCapabilityGroupTags",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/ProtectionCapability/ListProtectionCapabilityGroupTags")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProtectionCapabilityGroupTagsRequest::builder)
                .basePath("/20210930")
                .appendPathParam("protectionCapabilities")
                .appendPathParam("groupTags")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waf.model.ProtectionCapabilityGroupTagCollection.class,
                        ListProtectionCapabilityGroupTagsResponse.Builder
                                ::protectionCapabilityGroupTagCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListProtectionCapabilityGroupTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListProtectionCapabilityGroupTagsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWebAppFirewallPoliciesResponse listWebAppFirewallPolicies(
            ListWebAppFirewallPoliciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWebAppFirewallPoliciesResponse::builder)
                .logger(LOG, "listWebAppFirewallPolicies")
                .serviceDetails(
                        "Waf",
                        "ListWebAppFirewallPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewallPolicy/ListWebAppFirewallPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWebAppFirewallPoliciesRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewallPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                        com.oracle.bmc.waf.model.WebAppFirewallPolicyCollection.class,
                        ListWebAppFirewallPoliciesResponse.Builder::webAppFirewallPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWebAppFirewallPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWebAppFirewallPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWebAppFirewallsResponse listWebAppFirewalls(ListWebAppFirewallsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWebAppFirewallsResponse::builder)
                .logger(LOG, "listWebAppFirewalls")
                .serviceDetails(
                        "Waf",
                        "ListWebAppFirewalls",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewall/ListWebAppFirewalls")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWebAppFirewallsRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewalls")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("webAppFirewallPolicyId", request.getWebAppFirewallPolicyId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waf.model.WebAppFirewallCollection.class,
                        ListWebAppFirewallsResponse.Builder::webAppFirewallCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWebAppFirewallsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWebAppFirewallsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "Waf",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210930")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waf.model.WorkRequestErrorCollection.class,
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
                        "Waf",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210930")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waf.model.WorkRequestLogEntryCollection.class,
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
                        "Waf",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210930")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waf.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateNetworkAddressListResponse updateNetworkAddressList(
            UpdateNetworkAddressListRequest request) {

        Validate.notBlank(
                request.getNetworkAddressListId(), "networkAddressListId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNetworkAddressListDetails(),
                "updateNetworkAddressListDetails is required");

        return clientCall(request, UpdateNetworkAddressListResponse::builder)
                .logger(LOG, "updateNetworkAddressList")
                .serviceDetails(
                        "Waf",
                        "UpdateNetworkAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/NetworkAddressList/UpdateNetworkAddressList")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNetworkAddressListRequest::builder)
                .basePath("/20210930")
                .appendPathParam("networkAddressLists")
                .appendPathParam(request.getNetworkAddressListId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNetworkAddressListResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkAddressListResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateWebAppFirewallResponse updateWebAppFirewall(UpdateWebAppFirewallRequest request) {

        Validate.notBlank(request.getWebAppFirewallId(), "webAppFirewallId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWebAppFirewallDetails(),
                "updateWebAppFirewallDetails is required");

        return clientCall(request, UpdateWebAppFirewallResponse::builder)
                .logger(LOG, "updateWebAppFirewall")
                .serviceDetails(
                        "Waf",
                        "UpdateWebAppFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewall/UpdateWebAppFirewall")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWebAppFirewallRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewalls")
                .appendPathParam(request.getWebAppFirewallId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateWebAppFirewallResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWebAppFirewallResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateWebAppFirewallPolicyResponse updateWebAppFirewallPolicy(
            UpdateWebAppFirewallPolicyRequest request) {

        Validate.notBlank(
                request.getWebAppFirewallPolicyId(), "webAppFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWebAppFirewallPolicyDetails(),
                "updateWebAppFirewallPolicyDetails is required");

        return clientCall(request, UpdateWebAppFirewallPolicyResponse::builder)
                .logger(LOG, "updateWebAppFirewallPolicy")
                .serviceDetails(
                        "Waf",
                        "UpdateWebAppFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waf/20210930/WebAppFirewallPolicy/UpdateWebAppFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWebAppFirewallPolicyRequest::builder)
                .basePath("/20210930")
                .appendPathParam("webAppFirewallPolicies")
                .appendPathParam(request.getWebAppFirewallPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateWebAppFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWebAppFirewallPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public WafWaiters getWaiters() {
        return waiters;
    }

    @Override
    public WafPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WafClient(
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
    public WafClient(
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
    public WafClient(
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
    public WafClient(
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
    public WafClient(
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
    public WafClient(
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
    public WafClient(
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
    public WafClient(
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
