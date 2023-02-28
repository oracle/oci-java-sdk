/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.networkfirewall.requests.*;
import com.oracle.bmc.networkfirewall.responses.*;

import java.util.Objects;

/**
 * Async client implementation for NetworkFirewall service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class NetworkFirewallAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements NetworkFirewallAsync {
    /** Service instance for NetworkFirewall. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NETWORKFIREWALL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://network-firewall.{region}.ocs.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NetworkFirewallAsyncClient.class);

    private NetworkFirewallAsyncClient(
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
                    Builder, NetworkFirewallAsyncClient> {
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
        public NetworkFirewallAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new NetworkFirewallAsyncClient(this, authenticationDetailsProvider);
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
                        "NetworkFirewall",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20211001")
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
    public java.util.concurrent.Future<ChangeNetworkFirewallCompartmentResponse>
            changeNetworkFirewallCompartment(
                    ChangeNetworkFirewallCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkFirewallCompartmentRequest,
                                    ChangeNetworkFirewallCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getNetworkFirewallId(), "networkFirewallId must not be blank");
        Objects.requireNonNull(
                request.getChangeNetworkFirewallCompartmentDetails(),
                "changeNetworkFirewallCompartmentDetails is required");

        return clientCall(request, ChangeNetworkFirewallCompartmentResponse::builder)
                .logger(LOG, "changeNetworkFirewallCompartment")
                .serviceDetails(
                        "NetworkFirewall",
                        "ChangeNetworkFirewallCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewall/ChangeNetworkFirewallCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNetworkFirewallCompartmentRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewalls")
                .appendPathParam(request.getNetworkFirewallId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeNetworkFirewallCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeNetworkFirewallCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeNetworkFirewallPolicyCompartmentResponse>
            changeNetworkFirewallPolicyCompartment(
                    ChangeNetworkFirewallPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkFirewallPolicyCompartmentRequest,
                                    ChangeNetworkFirewallPolicyCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeNetworkFirewallPolicyCompartmentDetails(),
                "changeNetworkFirewallPolicyCompartmentDetails is required");

        return clientCall(request, ChangeNetworkFirewallPolicyCompartmentResponse::builder)
                .logger(LOG, "changeNetworkFirewallPolicyCompartment")
                .serviceDetails(
                        "NetworkFirewall",
                        "ChangeNetworkFirewallPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewallPolicy/ChangeNetworkFirewallPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNetworkFirewallPolicyCompartmentRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeNetworkFirewallPolicyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkFirewallResponse> createNetworkFirewall(
            CreateNetworkFirewallRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkFirewallRequest, CreateNetworkFirewallResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateNetworkFirewallDetails(),
                "createNetworkFirewallDetails is required");

        return clientCall(request, CreateNetworkFirewallResponse::builder)
                .logger(LOG, "createNetworkFirewall")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateNetworkFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewall/CreateNetworkFirewall")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNetworkFirewallRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewalls")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewall.class,
                        CreateNetworkFirewallResponse.Builder::networkFirewall)
                .handleResponseHeaderString("etag", CreateNetworkFirewallResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateNetworkFirewallResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNetworkFirewallResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkFirewallPolicyResponse>
            createNetworkFirewallPolicy(
                    CreateNetworkFirewallPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateNetworkFirewallPolicyRequest,
                                    CreateNetworkFirewallPolicyResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateNetworkFirewallPolicyDetails(),
                "createNetworkFirewallPolicyDetails is required");

        return clientCall(request, CreateNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "createNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewallPolicy/CreateNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNetworkFirewallPolicyRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewallPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy.class,
                        CreateNetworkFirewallPolicyResponse.Builder::networkFirewallPolicy)
                .handleResponseHeaderString(
                        "etag", CreateNetworkFirewallPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateNetworkFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNetworkFirewallPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkFirewallResponse> deleteNetworkFirewall(
            DeleteNetworkFirewallRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkFirewallRequest, DeleteNetworkFirewallResponse>
                    handler) {

        Validate.notBlank(request.getNetworkFirewallId(), "networkFirewallId must not be blank");

        return clientCall(request, DeleteNetworkFirewallResponse::builder)
                .logger(LOG, "deleteNetworkFirewall")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteNetworkFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewall/DeleteNetworkFirewall")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNetworkFirewallRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewalls")
                .appendPathParam(request.getNetworkFirewallId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteNetworkFirewallResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNetworkFirewallResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkFirewallPolicyResponse>
            deleteNetworkFirewallPolicy(
                    DeleteNetworkFirewallPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteNetworkFirewallPolicyRequest,
                                    DeleteNetworkFirewallPolicyResponse>
                            handler) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, DeleteNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "deleteNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewallPolicy/DeleteNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNetworkFirewallPolicyRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteNetworkFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNetworkFirewallPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkFirewallResponse> getNetworkFirewall(
            GetNetworkFirewallRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkFirewallRequest, GetNetworkFirewallResponse>
                    handler) {

        Validate.notBlank(request.getNetworkFirewallId(), "networkFirewallId must not be blank");

        return clientCall(request, GetNetworkFirewallResponse::builder)
                .logger(LOG, "getNetworkFirewall")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetNetworkFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewall/GetNetworkFirewall")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkFirewallRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewalls")
                .appendPathParam(request.getNetworkFirewallId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewall.class,
                        GetNetworkFirewallResponse.Builder::networkFirewall)
                .handleResponseHeaderString("etag", GetNetworkFirewallResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkFirewallResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkFirewallPolicyResponse> getNetworkFirewallPolicy(
            GetNetworkFirewallPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkFirewallPolicyRequest, GetNetworkFirewallPolicyResponse>
                    handler) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, GetNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "getNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewallPolicy/GetNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkFirewallPolicyRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy.class,
                        GetNetworkFirewallPolicyResponse.Builder::networkFirewallPolicy)
                .handleResponseHeaderString("etag", GetNetworkFirewallPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkFirewallPolicyResponse.Builder::opcRequestId)
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
                        "NetworkFirewall",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20211001")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkFirewallPoliciesResponse>
            listNetworkFirewallPolicies(
                    ListNetworkFirewallPoliciesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkFirewallPoliciesRequest,
                                    ListNetworkFirewallPoliciesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNetworkFirewallPoliciesResponse::builder)
                .logger(LOG, "listNetworkFirewallPolicies")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListNetworkFirewallPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewallPolicy/ListNetworkFirewallPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkFirewallPoliciesRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewallPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummaryCollection
                                .class,
                        ListNetworkFirewallPoliciesResponse.Builder
                                ::networkFirewallPolicySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNetworkFirewallPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkFirewallPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListNetworkFirewallPoliciesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListNetworkFirewallPoliciesResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListNetworkFirewallPoliciesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkFirewallsResponse> listNetworkFirewalls(
            ListNetworkFirewallsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkFirewallsRequest, ListNetworkFirewallsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNetworkFirewallsResponse::builder)
                .logger(LOG, "listNetworkFirewalls")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListNetworkFirewalls",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewall/ListNetworkFirewalls")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkFirewallsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewalls")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("networkFirewallPolicyId", request.getNetworkFirewallPolicyId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewallCollection.class,
                        ListNetworkFirewallsResponse.Builder::networkFirewallCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNetworkFirewallsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkFirewallsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListNetworkFirewallsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListNetworkFirewallsResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListNetworkFirewallsResponse.Builder::opcTotalItems)
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
                        "NetworkFirewall",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20211001")
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
                        com.oracle.bmc.networkfirewall.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestErrorsResponse.Builder::opcPrevPage)
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
                        "NetworkFirewall",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20211001")
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
                        com.oracle.bmc.networkfirewall.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestLogsResponse.Builder::opcPrevPage)
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
                        "NetworkFirewall",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20211001")
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
                        com.oracle.bmc.networkfirewall.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkFirewallResponse> updateNetworkFirewall(
            UpdateNetworkFirewallRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkFirewallRequest, UpdateNetworkFirewallResponse>
                    handler) {

        Validate.notBlank(request.getNetworkFirewallId(), "networkFirewallId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNetworkFirewallDetails(),
                "updateNetworkFirewallDetails is required");

        return clientCall(request, UpdateNetworkFirewallResponse::builder)
                .logger(LOG, "updateNetworkFirewall")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateNetworkFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewall/UpdateNetworkFirewall")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNetworkFirewallRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewalls")
                .appendPathParam(request.getNetworkFirewallId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNetworkFirewallResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkFirewallResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkFirewallPolicyResponse>
            updateNetworkFirewallPolicy(
                    UpdateNetworkFirewallPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNetworkFirewallPolicyRequest,
                                    UpdateNetworkFirewallPolicyResponse>
                            handler) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNetworkFirewallPolicyDetails(),
                "updateNetworkFirewallPolicyDetails is required");

        return clientCall(request, UpdateNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "updateNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20211001/NetworkFirewallPolicy/UpdateNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNetworkFirewallPolicyRequest::builder)
                .basePath("/20211001")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNetworkFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkFirewallPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
