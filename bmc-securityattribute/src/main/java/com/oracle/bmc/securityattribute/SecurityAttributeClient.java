/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.securityattribute.requests.*;
import com.oracle.bmc.securityattribute.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
public class SecurityAttributeClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements SecurityAttribute {
    /** Service instance for SecurityAttribute. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(SecurityAttributeClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://security-attribute.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SecurityAttributeClient.class);

    private final SecurityAttributeWaiters waiters;

    private final SecurityAttributePaginators paginators;

    SecurityAttributeClient(
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
                                    .nameFormat("SecurityAttribute-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new SecurityAttributeWaiters(executorService, this);

        this.paginators = new SecurityAttributePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SecurityAttributeClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "securityattribute";
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
        public SecurityAttributeClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SecurityAttributeClient(
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
    public BulkDeleteSecurityAttributesResponse bulkDeleteSecurityAttributes(
            BulkDeleteSecurityAttributesRequest request) {
        Objects.requireNonNull(
                request.getBulkDeleteSecurityAttributesDetails(),
                "bulkDeleteSecurityAttributesDetails is required");

        return clientCall(request, BulkDeleteSecurityAttributesResponse::builder)
                .logger(LOG, "bulkDeleteSecurityAttributes")
                .serviceDetails(
                        "SecurityAttribute",
                        "BulkDeleteSecurityAttributes",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttribute/BulkDeleteSecurityAttributes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkDeleteSecurityAttributesRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributes")
                .appendPathParam("actions")
                .appendPathParam("bulkDelete")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        BulkDeleteSecurityAttributesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkDeleteSecurityAttributesResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public BulkEditSecurityAttributesResponse bulkEditSecurityAttributes(
            BulkEditSecurityAttributesRequest request) {

        return clientCall(request, BulkEditSecurityAttributesResponse::builder)
                .logger(LOG, "bulkEditSecurityAttributes")
                .serviceDetails(
                        "SecurityAttribute",
                        "BulkEditSecurityAttributes",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttribute/BulkEditSecurityAttributes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkEditSecurityAttributesRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributes")
                .appendPathParam("actions")
                .appendPathParam("bulkEdit")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", BulkEditSecurityAttributesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkEditSecurityAttributesResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CascadingDeleteSecurityAttributeNamespaceResponse
            cascadingDeleteSecurityAttributeNamespace(
                    CascadingDeleteSecurityAttributeNamespaceRequest request) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        return clientCall(request, CascadingDeleteSecurityAttributeNamespaceResponse::builder)
                .logger(LOG, "cascadingDeleteSecurityAttributeNamespace")
                .serviceDetails(
                        "SecurityAttribute",
                        "CascadingDeleteSecurityAttributeNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeNamespace/CascadingDeleteSecurityAttributeNamespace")
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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CascadingDeleteSecurityAttributeNamespaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CascadingDeleteSecurityAttributeNamespaceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeSecurityAttributeNamespaceCompartmentResponse
            changeSecurityAttributeNamespaceCompartment(
                    ChangeSecurityAttributeNamespaceCompartmentRequest request) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecurityAttributeNamespaceCompartmentDetails(),
                "changeSecurityAttributeNamespaceCompartmentDetails is required");

        return clientCall(request, ChangeSecurityAttributeNamespaceCompartmentResponse::builder)
                .logger(LOG, "changeSecurityAttributeNamespaceCompartment")
                .serviceDetails(
                        "SecurityAttribute",
                        "ChangeSecurityAttributeNamespaceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeNamespace/ChangeSecurityAttributeNamespaceCompartment")
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSecurityAttributeNamespaceCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSecurityAttributeResponse createSecurityAttribute(
            CreateSecurityAttributeRequest request) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateSecurityAttributeDetails(),
                "createSecurityAttributeDetails is required");

        return clientCall(request, CreateSecurityAttributeResponse::builder)
                .logger(LOG, "createSecurityAttribute")
                .serviceDetails(
                        "SecurityAttribute",
                        "CreateSecurityAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttribute/CreateSecurityAttribute")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityAttributeRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .appendPathParam("securityAttributes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttribute.class,
                        CreateSecurityAttributeResponse.Builder::securityAttribute)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecurityAttributeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSecurityAttributeResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateSecurityAttributeNamespaceResponse createSecurityAttributeNamespace(
            CreateSecurityAttributeNamespaceRequest request) {
        Objects.requireNonNull(
                request.getCreateSecurityAttributeNamespaceDetails(),
                "createSecurityAttributeNamespaceDetails is required");

        return clientCall(request, CreateSecurityAttributeNamespaceResponse::builder)
                .logger(LOG, "createSecurityAttributeNamespace")
                .serviceDetails(
                        "SecurityAttribute",
                        "CreateSecurityAttributeNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeNamespace/CreateSecurityAttributeNamespace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityAttributeNamespaceRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public DeleteSecurityAttributeResponse deleteSecurityAttribute(
            DeleteSecurityAttributeRequest request) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        Validate.notBlank(
                request.getSecurityAttributeName(), "securityAttributeName must not be blank");

        return clientCall(request, DeleteSecurityAttributeResponse::builder)
                .logger(LOG, "deleteSecurityAttribute")
                .serviceDetails(
                        "SecurityAttribute",
                        "DeleteSecurityAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttribute/DeleteSecurityAttribute")
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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSecurityAttributeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSecurityAttributeResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteSecurityAttributeNamespaceResponse deleteSecurityAttributeNamespace(
            DeleteSecurityAttributeNamespaceRequest request) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        return clientCall(request, DeleteSecurityAttributeNamespaceResponse::builder)
                .logger(LOG, "deleteSecurityAttributeNamespace")
                .serviceDetails(
                        "SecurityAttribute",
                        "DeleteSecurityAttributeNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeNamespace/DeleteSecurityAttributeNamespace")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityAttributeNamespaceRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteSecurityAttributeNamespaceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSecurityAttributeResponse getSecurityAttribute(GetSecurityAttributeRequest request) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        Validate.notBlank(
                request.getSecurityAttributeName(), "securityAttributeName must not be blank");

        return clientCall(request, GetSecurityAttributeResponse::builder)
                .logger(LOG, "getSecurityAttribute")
                .serviceDetails(
                        "SecurityAttribute",
                        "GetSecurityAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttribute/GetSecurityAttribute")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityAttributeRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .appendPathParam("securityAttributes")
                .appendPathParam(request.getSecurityAttributeName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttribute.class,
                        GetSecurityAttributeResponse.Builder::securityAttribute)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityAttributeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetSecurityAttributeResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetSecurityAttributeNamespaceResponse getSecurityAttributeNamespace(
            GetSecurityAttributeNamespaceRequest request) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        return clientCall(request, GetSecurityAttributeNamespaceResponse::builder)
                .logger(LOG, "getSecurityAttributeNamespace")
                .serviceDetails(
                        "SecurityAttribute",
                        "GetSecurityAttributeNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeNamespace/GetSecurityAttributeNamespace")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityAttributeNamespaceRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace.class,
                        GetSecurityAttributeNamespaceResponse.Builder::securityAttributeNamespace)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetSecurityAttributeNamespaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetSecurityAttributeNamespaceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetSecurityAttributeWorkRequestResponse getSecurityAttributeWorkRequest(
            GetSecurityAttributeWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetSecurityAttributeWorkRequestResponse::builder)
                .logger(LOG, "getSecurityAttributeWorkRequest")
                .serviceDetails(
                        "SecurityAttribute",
                        "GetSecurityAttributeWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeWorkRequest/GetSecurityAttributeWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityAttributeWorkRequestRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequest.class,
                        GetSecurityAttributeWorkRequestResponse.Builder
                                ::securityAttributeWorkRequest)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetSecurityAttributeWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetSecurityAttributeWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListSecurityAttributeNamespacesResponse listSecurityAttributeNamespaces(
            ListSecurityAttributeNamespacesRequest request) {

        return clientCall(request, ListSecurityAttributeNamespacesResponse::builder)
                .logger(LOG, "listSecurityAttributeNamespaces")
                .serviceDetails(
                        "SecurityAttribute",
                        "ListSecurityAttributeNamespaces",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeNamespaceSummary/ListSecurityAttributeNamespaces")
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListSecurityAttributeWorkRequestErrorsResponse listSecurityAttributeWorkRequestErrors(
            ListSecurityAttributeWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListSecurityAttributeWorkRequestErrorsResponse::builder)
                .logger(LOG, "listSecurityAttributeWorkRequestErrors")
                .serviceDetails(
                        "SecurityAttribute",
                        "ListSecurityAttributeWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeWorkRequestErrorSummary/ListSecurityAttributeWorkRequestErrors")
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListSecurityAttributeWorkRequestLogsResponse listSecurityAttributeWorkRequestLogs(
            ListSecurityAttributeWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListSecurityAttributeWorkRequestLogsResponse::builder)
                .logger(LOG, "listSecurityAttributeWorkRequestLogs")
                .serviceDetails(
                        "SecurityAttribute",
                        "ListSecurityAttributeWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeWorkRequestLogSummary/ListSecurityAttributeWorkRequestLogs")
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListSecurityAttributeWorkRequestsResponse listSecurityAttributeWorkRequests(
            ListSecurityAttributeWorkRequestsRequest request) {

        return clientCall(request, ListSecurityAttributeWorkRequestsResponse::builder)
                .logger(LOG, "listSecurityAttributeWorkRequests")
                .serviceDetails(
                        "SecurityAttribute",
                        "ListSecurityAttributeWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeWorkRequestSummary/ListSecurityAttributeWorkRequests")
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListSecurityAttributesResponse listSecurityAttributes(
            ListSecurityAttributesRequest request) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");

        return clientCall(request, ListSecurityAttributesResponse::builder)
                .logger(LOG, "listSecurityAttributes")
                .serviceDetails(
                        "SecurityAttribute",
                        "ListSecurityAttributes",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeSummary/ListSecurityAttributes")
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
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.securityattribute.model.SecurityAttributeSummary.class,
                        ListSecurityAttributesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityAttributesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityAttributesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateSecurityAttributeResponse updateSecurityAttribute(
            UpdateSecurityAttributeRequest request) {

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
                .serviceDetails(
                        "SecurityAttribute",
                        "UpdateSecurityAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttribute/UpdateSecurityAttribute")
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.securityattribute.model.SecurityAttribute.class,
                        UpdateSecurityAttributeResponse.Builder::securityAttribute)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecurityAttributeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateSecurityAttributeResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateSecurityAttributeNamespaceResponse updateSecurityAttributeNamespace(
            UpdateSecurityAttributeNamespaceRequest request) {

        Validate.notBlank(
                request.getSecurityAttributeNamespaceId(),
                "securityAttributeNamespaceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityAttributeNamespaceDetails(),
                "updateSecurityAttributeNamespaceDetails is required");

        return clientCall(request, UpdateSecurityAttributeNamespaceResponse::builder)
                .logger(LOG, "updateSecurityAttributeNamespace")
                .serviceDetails(
                        "SecurityAttribute",
                        "UpdateSecurityAttributeNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/security-attribute/20240815/SecurityAttributeNamespace/UpdateSecurityAttributeNamespace")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityAttributeNamespaceRequest::builder)
                .basePath("/20240815")
                .appendPathParam("securityAttributeNamespaces")
                .appendPathParam(request.getSecurityAttributeNamespaceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public SecurityAttributeWaiters getWaiters() {
        return waiters;
    }

    @Override
    public SecurityAttributePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SecurityAttributeClient(
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
    public SecurityAttributeClient(
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
    public SecurityAttributeClient(
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
    public SecurityAttributeClient(
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
    public SecurityAttributeClient(
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
    public SecurityAttributeClient(
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
    public SecurityAttributeClient(
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
    public SecurityAttributeClient(
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
