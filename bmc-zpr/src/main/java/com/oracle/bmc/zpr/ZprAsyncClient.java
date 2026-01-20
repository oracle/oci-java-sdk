/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.zpr;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.zpr.requests.*;
import com.oracle.bmc.zpr.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Zpr service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
public class ZprAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ZprAsync {
    /** Service instance for Zpr. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ZprClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://zpr.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ZprAsyncClient.class);

    ZprAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ZprAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "zpr";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public ZprAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ZprAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateConfigurationResponse> createConfiguration(
            CreateConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConfigurationRequest, CreateConfigurationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateConfigurationDetails(), "createConfigurationDetails is required");

        return clientCall(request, CreateConfigurationResponse::builder)
                .logger(LOG, "createConfiguration")
                .serviceDetails(
                        "Zpr",
                        "CreateConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/Configuration/CreateConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConfigurationRequest::builder)
                .basePath("/20240301")
                .appendPathParam("configuration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateConfigurationResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateZprPolicyResponse> createZprPolicy(
            CreateZprPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateZprPolicyRequest, CreateZprPolicyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateZprPolicyDetails(), "createZprPolicyDetails is required");

        return clientCall(request, CreateZprPolicyResponse::builder)
                .logger(LOG, "createZprPolicy")
                .serviceDetails(
                        "Zpr",
                        "CreateZprPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/ZprPolicy/CreateZprPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateZprPolicyRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.zpr.model.ZprPolicy.class,
                        CreateZprPolicyResponse.Builder::zprPolicy)
                .handleResponseHeaderString("location", CreateZprPolicyResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateZprPolicyResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "opc-request-id", CreateZprPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateZprPolicyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteZprPolicyResponse> deleteZprPolicy(
            DeleteZprPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteZprPolicyRequest, DeleteZprPolicyResponse>
                    handler) {

        Validate.notBlank(request.getZprPolicyId(), "zprPolicyId must not be blank");

        return clientCall(request, DeleteZprPolicyResponse::builder)
                .logger(LOG, "deleteZprPolicy")
                .serviceDetails(
                        "Zpr",
                        "DeleteZprPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/ZprPolicy/DeleteZprPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteZprPolicyRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicies")
                .appendPathParam(request.getZprPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteZprPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteZprPolicyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfigurationRequest, GetConfigurationResponse>
                    handler) {

        return clientCall(request, GetConfigurationResponse::builder)
                .logger(LOG, "getConfiguration")
                .serviceDetails(
                        "Zpr",
                        "GetConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/Configuration/GetConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigurationRequest::builder)
                .basePath("/20240301")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.zpr.model.Configuration.class,
                        GetConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString("etag", GetConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetZprConfigurationWorkRequestResponse>
            getZprConfigurationWorkRequest(
                    GetZprConfigurationWorkRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetZprConfigurationWorkRequestRequest,
                                    GetZprConfigurationWorkRequestResponse>
                            handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetZprConfigurationWorkRequestResponse::builder)
                .logger(LOG, "getZprConfigurationWorkRequest")
                .serviceDetails(
                        "Zpr",
                        "GetZprConfigurationWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/WorkRequest/GetZprConfigurationWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetZprConfigurationWorkRequestRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprConfigurationWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.zpr.model.WorkRequest.class,
                        GetZprConfigurationWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "etag", GetZprConfigurationWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetZprConfigurationWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetZprConfigurationWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetZprPolicyResponse> getZprPolicy(
            GetZprPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetZprPolicyRequest, GetZprPolicyResponse>
                    handler) {

        Validate.notBlank(request.getZprPolicyId(), "zprPolicyId must not be blank");

        return clientCall(request, GetZprPolicyResponse::builder)
                .logger(LOG, "getZprPolicy")
                .serviceDetails(
                        "Zpr",
                        "GetZprPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/ZprPolicy/GetZprPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetZprPolicyRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicies")
                .appendPathParam(request.getZprPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.zpr.model.ZprPolicy.class,
                        GetZprPolicyResponse.Builder::zprPolicy)
                .handleResponseHeaderString("etag", GetZprPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetZprPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetZprPolicyWorkRequestResponse> getZprPolicyWorkRequest(
            GetZprPolicyWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetZprPolicyWorkRequestRequest, GetZprPolicyWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetZprPolicyWorkRequestResponse::builder)
                .logger(LOG, "getZprPolicyWorkRequest")
                .serviceDetails(
                        "Zpr",
                        "GetZprPolicyWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/WorkRequest/GetZprPolicyWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetZprPolicyWorkRequestRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicyWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.zpr.model.WorkRequest.class,
                        GetZprPolicyWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetZprPolicyWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetZprPolicyWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetZprPolicyWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListZprConfigurationWorkRequestErrorsResponse>
            listZprConfigurationWorkRequestErrors(
                    ListZprConfigurationWorkRequestErrorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListZprConfigurationWorkRequestErrorsRequest,
                                    ListZprConfigurationWorkRequestErrorsResponse>
                            handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListZprConfigurationWorkRequestErrorsResponse::builder)
                .logger(LOG, "listZprConfigurationWorkRequestErrors")
                .serviceDetails(
                        "Zpr",
                        "ListZprConfigurationWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/WorkRequestError/ListZprConfigurationWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprConfigurationWorkRequestErrorsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprConfigurationWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.zpr.model.WorkRequestErrorCollection.class,
                        ListZprConfigurationWorkRequestErrorsResponse.Builder
                                ::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListZprConfigurationWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListZprConfigurationWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListZprConfigurationWorkRequestLogsResponse>
            listZprConfigurationWorkRequestLogs(
                    ListZprConfigurationWorkRequestLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListZprConfigurationWorkRequestLogsRequest,
                                    ListZprConfigurationWorkRequestLogsResponse>
                            handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListZprConfigurationWorkRequestLogsResponse::builder)
                .logger(LOG, "listZprConfigurationWorkRequestLogs")
                .serviceDetails(
                        "Zpr",
                        "ListZprConfigurationWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/WorkRequestLogEntry/ListZprConfigurationWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprConfigurationWorkRequestLogsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprConfigurationWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.zpr.model.WorkRequestLogEntryCollection.class,
                        ListZprConfigurationWorkRequestLogsResponse.Builder
                                ::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListZprConfigurationWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListZprConfigurationWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListZprConfigurationWorkRequestsResponse>
            listZprConfigurationWorkRequests(
                    ListZprConfigurationWorkRequestsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListZprConfigurationWorkRequestsRequest,
                                    ListZprConfigurationWorkRequestsResponse>
                            handler) {

        return clientCall(request, ListZprConfigurationWorkRequestsResponse::builder)
                .logger(LOG, "listZprConfigurationWorkRequests")
                .serviceDetails(
                        "Zpr",
                        "ListZprConfigurationWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/WorkRequest/ListZprConfigurationWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprConfigurationWorkRequestsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprConfigurationWorkRequests")
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
                        com.oracle.bmc.zpr.model.WorkRequestSummaryCollection.class,
                        ListZprConfigurationWorkRequestsResponse.Builder
                                ::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListZprConfigurationWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListZprConfigurationWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListZprPoliciesResponse> listZprPolicies(
            ListZprPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListZprPoliciesRequest, ListZprPoliciesResponse>
                    handler) {

        return clientCall(request, ListZprPoliciesResponse::builder)
                .logger(LOG, "listZprPolicies")
                .serviceDetails(
                        "Zpr",
                        "ListZprPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/ZprPolicyCollection/ListZprPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprPoliciesRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.zpr.model.ZprPolicyCollection.class,
                        ListZprPoliciesResponse.Builder::zprPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListZprPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListZprPoliciesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListZprPolicyWorkRequestErrorsResponse>
            listZprPolicyWorkRequestErrors(
                    ListZprPolicyWorkRequestErrorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListZprPolicyWorkRequestErrorsRequest,
                                    ListZprPolicyWorkRequestErrorsResponse>
                            handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListZprPolicyWorkRequestErrorsResponse::builder)
                .logger(LOG, "listZprPolicyWorkRequestErrors")
                .serviceDetails(
                        "Zpr",
                        "ListZprPolicyWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/WorkRequestError/ListZprPolicyWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprPolicyWorkRequestErrorsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicyWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.zpr.model.WorkRequestErrorCollection.class,
                        ListZprPolicyWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListZprPolicyWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListZprPolicyWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListZprPolicyWorkRequestLogsResponse>
            listZprPolicyWorkRequestLogs(
                    ListZprPolicyWorkRequestLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListZprPolicyWorkRequestLogsRequest,
                                    ListZprPolicyWorkRequestLogsResponse>
                            handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListZprPolicyWorkRequestLogsResponse::builder)
                .logger(LOG, "listZprPolicyWorkRequestLogs")
                .serviceDetails(
                        "Zpr",
                        "ListZprPolicyWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/WorkRequestLogEntry/ListZprPolicyWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprPolicyWorkRequestLogsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicyWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.zpr.model.WorkRequestLogEntryCollection.class,
                        ListZprPolicyWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListZprPolicyWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListZprPolicyWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListZprPolicyWorkRequestsResponse> listZprPolicyWorkRequests(
            ListZprPolicyWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListZprPolicyWorkRequestsRequest, ListZprPolicyWorkRequestsResponse>
                    handler) {

        return clientCall(request, ListZprPolicyWorkRequestsResponse::builder)
                .logger(LOG, "listZprPolicyWorkRequests")
                .serviceDetails(
                        "Zpr",
                        "ListZprPolicyWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/WorkRequest/ListZprPolicyWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprPolicyWorkRequestsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicyWorkRequests")
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
                        com.oracle.bmc.zpr.model.WorkRequestSummaryCollection.class,
                        ListZprPolicyWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListZprPolicyWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListZprPolicyWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateZprPolicyResponse> updateZprPolicy(
            UpdateZprPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateZprPolicyRequest, UpdateZprPolicyResponse>
                    handler) {

        Validate.notBlank(request.getZprPolicyId(), "zprPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateZprPolicyDetails(), "updateZprPolicyDetails is required");

        return clientCall(request, UpdateZprPolicyResponse::builder)
                .logger(LOG, "updateZprPolicy")
                .serviceDetails(
                        "Zpr",
                        "UpdateZprPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/zero-trust-packet-routing/20240301/ZprPolicy/UpdateZprPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateZprPolicyRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicies")
                .appendPathParam(request.getZprPolicyId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateZprPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateZprPolicyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ZprAsyncClient(
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
    public ZprAsyncClient(
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
    public ZprAsyncClient(
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
    public ZprAsyncClient(
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
    public ZprAsyncClient(
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
    public ZprAsyncClient(
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
    public ZprAsyncClient(
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
