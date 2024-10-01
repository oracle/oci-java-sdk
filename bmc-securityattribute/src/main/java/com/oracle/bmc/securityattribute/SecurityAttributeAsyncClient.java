/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.securityattribute.requests.*;
import com.oracle.bmc.securityattribute.responses.*;

import java.util.Objects;

/**
 * Async client implementation for SecurityAttribute service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
public class SecurityAttributeAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements SecurityAttributeAsync {
    /** Service instance for SecurityAttribute. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SECURITYATTRIBUTE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://security-attribute.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SecurityAttributeAsyncClient.class);

    SecurityAttributeAsyncClient(
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
                    Builder, SecurityAttributeAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "securityattribute";
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
        public SecurityAttributeAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SecurityAttributeAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<BulkDeleteSecurityAttributesResponse>
            bulkDeleteSecurityAttributes(
                    BulkDeleteSecurityAttributesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkDeleteSecurityAttributesRequest,
                                    BulkDeleteSecurityAttributesResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBulkDeleteSecurityAttributesDetails(),
                "bulkDeleteSecurityAttributesDetails is required");

        return clientCall(request, BulkDeleteSecurityAttributesResponse::builder)
                .logger(LOG, "bulkDeleteSecurityAttributes")
                .serviceDetails("SecurityAttribute", "BulkDeleteSecurityAttributes", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkDeleteSecurityAttributesRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributes")
                .appendPathParam("actions")
                .appendPathParam("bulkDelete")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        BulkDeleteSecurityAttributesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkDeleteSecurityAttributesResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BulkEditSecurityAttributesResponse>
            bulkEditSecurityAttributes(
                    BulkEditSecurityAttributesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkEditSecurityAttributesRequest,
                                    BulkEditSecurityAttributesResponse>
                            handler) {

        return clientCall(request, BulkEditSecurityAttributesResponse::builder)
                .logger(LOG, "bulkEditSecurityAttributes")
                .serviceDetails("SecurityAttribute", "BulkEditSecurityAttributes", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkEditSecurityAttributesRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributes")
                .appendPathParam("actions")
                .appendPathParam("bulkEdit")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", BulkEditSecurityAttributesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkEditSecurityAttributesResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CascadingDeleteSecurityAttributeNamespaceResponse>
            cascadingDeleteSecurityAttributeNamespace(
                    CascadingDeleteSecurityAttributeNamespaceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CascadingDeleteSecurityAttributeNamespaceRequest,
                                    CascadingDeleteSecurityAttributeNamespaceResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        return clientCall(request, CascadingDeleteSecurityAttributeNamespaceResponse::builder)
                .logger(LOG, "cascadingDeleteSecurityAttributeNamespace")
                .serviceDetails(
                        "SecurityAttribute", "CascadingDeleteSecurityAttributeNamespace", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CascadingDeleteSecurityAttributeNamespaceRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .appendPathParam("actions")
                .appendPathParam("cascadeDelete")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        CascadingDeleteSecurityAttributeNamespaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CascadingDeleteSecurityAttributeNamespaceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityAttributeNamespaceCompartmentResponse>
            changeSecurityAttributeNamespaceCompartment(
                    ChangeSecurityAttributeNamespaceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityAttributeNamespaceCompartmentRequest,
                                    ChangeSecurityAttributeNamespaceCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecurityAttributeNamespaceCompartmentDetails(),
                "changeSecurityAttributeNamespaceCompartmentDetails is required");

        return clientCall(request, ChangeSecurityAttributeNamespaceCompartmentResponse::builder)
                .logger(LOG, "changeSecurityAttributeNamespaceCompartment")
                .serviceDetails(
                        "SecurityAttribute", "ChangeSecurityAttributeNamespaceCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSecurityAttributeNamespaceCompartmentRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSecurityAttributeNamespaceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityAttributeResponse> createSecurityAttribute(
            CreateSecurityAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityAttributeRequest, CreateSecurityAttributeResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateSecurityAttributeDetails(),
                "createSecurityAttributeDetails is required");

        return clientCall(request, CreateSecurityAttributeResponse::builder)
                .logger(LOG, "createSecurityAttribute")
                .serviceDetails("SecurityAttribute", "CreateSecurityAttribute", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityAttributeRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .appendPathParam("securityAttributes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttribute.class,
                        CreateSecurityAttributeResponse.Builder::securityAttribute)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecurityAttributeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSecurityAttributeResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityAttributeNamespaceResponse>
            createSecurityAttributeNamespace(
                    CreateSecurityAttributeNamespaceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateSecurityAttributeNamespaceRequest,
                                    CreateSecurityAttributeNamespaceResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateSecurityAttributeNamespaceDetails(),
                "createSecurityAttributeNamespaceDetails is required");

        return clientCall(request, CreateSecurityAttributeNamespaceResponse::builder)
                .logger(LOG, "createSecurityAttributeNamespace")
                .serviceDetails("SecurityAttribute", "CreateSecurityAttributeNamespace", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityAttributeNamespaceRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace.class,
                        CreateSecurityAttributeNamespaceResponse.Builder
                                ::securityAttributeNamespace)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateSecurityAttributeNamespaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateSecurityAttributeNamespaceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityAttributeResponse> deleteSecurityAttribute(
            DeleteSecurityAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityAttributeRequest, DeleteSecurityAttributeResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        Validate.notBlank(
                request.getSecurityAttributeName(), "securityAttributeName must not be blank");

        return clientCall(request, DeleteSecurityAttributeResponse::builder)
                .logger(LOG, "deleteSecurityAttribute")
                .serviceDetails("SecurityAttribute", "DeleteSecurityAttribute", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityAttributeRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .appendPathParam("securityAttributes")
                .appendPathParam(request.getSecurityAttributeName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSecurityAttributeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSecurityAttributeResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityAttributeNamespaceResponse>
            deleteSecurityAttributeNamespace(
                    DeleteSecurityAttributeNamespaceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSecurityAttributeNamespaceRequest,
                                    DeleteSecurityAttributeNamespaceResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        return clientCall(request, DeleteSecurityAttributeNamespaceResponse::builder)
                .logger(LOG, "deleteSecurityAttributeNamespace")
                .serviceDetails("SecurityAttribute", "DeleteSecurityAttributeNamespace", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityAttributeNamespaceRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteSecurityAttributeNamespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityAttributeResponse> getSecurityAttribute(
            GetSecurityAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityAttributeRequest, GetSecurityAttributeResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        Validate.notBlank(
                request.getSecurityAttributeName(), "securityAttributeName must not be blank");

        return clientCall(request, GetSecurityAttributeResponse::builder)
                .logger(LOG, "getSecurityAttribute")
                .serviceDetails("SecurityAttribute", "GetSecurityAttribute", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityAttributeRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .appendPathParam("securityAttributes")
                .appendPathParam(request.getSecurityAttributeName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttribute.class,
                        GetSecurityAttributeResponse.Builder::securityAttribute)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityAttributeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetSecurityAttributeResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityAttributeNamespaceResponse>
            getSecurityAttributeNamespace(
                    GetSecurityAttributeNamespaceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityAttributeNamespaceRequest,
                                    GetSecurityAttributeNamespaceResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        return clientCall(request, GetSecurityAttributeNamespaceResponse::builder)
                .logger(LOG, "getSecurityAttributeNamespace")
                .serviceDetails("SecurityAttribute", "GetSecurityAttributeNamespace", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityAttributeNamespaceRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace.class,
                        GetSecurityAttributeNamespaceResponse.Builder::securityAttributeNamespace)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetSecurityAttributeNamespaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetSecurityAttributeNamespaceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityAttributeWorkRequestResponse>
            getSecurityAttributeWorkRequest(
                    GetSecurityAttributeWorkRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityAttributeWorkRequestRequest,
                                    GetSecurityAttributeWorkRequestResponse>
                            handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetSecurityAttributeWorkRequestResponse::builder)
                .logger(LOG, "getSecurityAttributeWorkRequest")
                .serviceDetails("SecurityAttribute", "GetSecurityAttributeWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityAttributeWorkRequestRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequest.class,
                        GetSecurityAttributeWorkRequestResponse.Builder
                                ::securityAttributeWorkRequest)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetSecurityAttributeWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetSecurityAttributeWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityAttributeNamespacesResponse>
            listSecurityAttributeNamespaces(
                    ListSecurityAttributeNamespacesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityAttributeNamespacesRequest,
                                    ListSecurityAttributeNamespacesResponse>
                            handler) {

        return clientCall(request, ListSecurityAttributeNamespacesResponse::builder)
                .logger(LOG, "listSecurityAttributeNamespaces")
                .serviceDetails("SecurityAttribute", "ListSecurityAttributeNamespaces", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityAttributeNamespacesRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.securityattribute.model.SecurityAttributeNamespaceSummary
                                .class,
                        ListSecurityAttributeNamespacesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSecurityAttributeNamespacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSecurityAttributeNamespacesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityAttributeWorkRequestErrorsResponse>
            listSecurityAttributeWorkRequestErrors(
                    ListSecurityAttributeWorkRequestErrorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityAttributeWorkRequestErrorsRequest,
                                    ListSecurityAttributeWorkRequestErrorsResponse>
                            handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListSecurityAttributeWorkRequestErrorsResponse::builder)
                .logger(LOG, "listSecurityAttributeWorkRequestErrors")
                .serviceDetails("SecurityAttribute", "ListSecurityAttributeWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityAttributeWorkRequestErrorsRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.securityattribute.model
                                .SecurityAttributeWorkRequestErrorSummary.class,
                        ListSecurityAttributeWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSecurityAttributeWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after",
                        ListSecurityAttributeWorkRequestErrorsResponse.Builder::retryAfter)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSecurityAttributeWorkRequestErrorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityAttributeWorkRequestLogsResponse>
            listSecurityAttributeWorkRequestLogs(
                    ListSecurityAttributeWorkRequestLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityAttributeWorkRequestLogsRequest,
                                    ListSecurityAttributeWorkRequestLogsResponse>
                            handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListSecurityAttributeWorkRequestLogsResponse::builder)
                .logger(LOG, "listSecurityAttributeWorkRequestLogs")
                .serviceDetails("SecurityAttribute", "ListSecurityAttributeWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityAttributeWorkRequestLogsRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.securityattribute.model
                                .SecurityAttributeWorkRequestLogSummary.class,
                        ListSecurityAttributeWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSecurityAttributeWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after",
                        ListSecurityAttributeWorkRequestLogsResponse.Builder::retryAfter)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSecurityAttributeWorkRequestLogsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityAttributeWorkRequestsResponse>
            listSecurityAttributeWorkRequests(
                    ListSecurityAttributeWorkRequestsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityAttributeWorkRequestsRequest,
                                    ListSecurityAttributeWorkRequestsResponse>
                            handler) {

        return clientCall(request, ListSecurityAttributeWorkRequestsResponse::builder)
                .logger(LOG, "listSecurityAttributeWorkRequests")
                .serviceDetails("SecurityAttribute", "ListSecurityAttributeWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityAttributeWorkRequestsRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeWorkRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("resourceIdentifier", request.getResourceIdentifier())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestSummary
                                .class,
                        ListSecurityAttributeWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSecurityAttributeWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSecurityAttributeWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityAttributesResponse> listSecurityAttributes(
            ListSecurityAttributesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityAttributesRequest, ListSecurityAttributesResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        return clientCall(request, ListSecurityAttributesResponse::builder)
                .logger(LOG, "listSecurityAttributes")
                .serviceDetails("SecurityAttribute", "ListSecurityAttributes", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityAttributesRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .appendPathParam("securityAttributes")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.securityattribute.model.SecurityAttributeSummary.class,
                        ListSecurityAttributesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityAttributesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityAttributesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityAttributeResponse> updateSecurityAttribute(
            UpdateSecurityAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityAttributeRequest, UpdateSecurityAttributeResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        Validate.notBlank(
                request.getSecurityAttributeName(), "securityAttributeName must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityAttributeDetails(),
                "updateSecurityAttributeDetails is required");

        return clientCall(request, UpdateSecurityAttributeResponse::builder)
                .logger(LOG, "updateSecurityAttribute")
                .serviceDetails("SecurityAttribute", "UpdateSecurityAttribute", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityAttributeRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .appendPathParam("securityAttributes")
                .appendPathParam(request.getSecurityAttributeName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttribute.class,
                        UpdateSecurityAttributeResponse.Builder::securityAttribute)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecurityAttributeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateSecurityAttributeResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityAttributeNamespaceResponse>
            updateSecurityAttributeNamespace(
                    UpdateSecurityAttributeNamespaceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSecurityAttributeNamespaceRequest,
                                    UpdateSecurityAttributeNamespaceResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityAttributeNamespaceDetails(),
                "updateSecurityAttributeNamespaceDetails is required");

        return clientCall(request, UpdateSecurityAttributeNamespaceResponse::builder)
                .logger(LOG, "updateSecurityAttributeNamespace")
                .serviceDetails("SecurityAttribute", "UpdateSecurityAttributeNamespace", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityAttributeNamespaceRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace.class,
                        UpdateSecurityAttributeNamespaceResponse.Builder
                                ::securityAttributeNamespace)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateSecurityAttributeNamespaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateSecurityAttributeNamespaceResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SecurityAttributeAsyncClient(
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
    public SecurityAttributeAsyncClient(
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
    public SecurityAttributeAsyncClient(
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
    public SecurityAttributeAsyncClient(
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
    public SecurityAttributeAsyncClient(
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
    public SecurityAttributeAsyncClient(
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
    public SecurityAttributeAsyncClient(
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
