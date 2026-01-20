/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourceanalytics;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.resourceanalytics.requests.*;
import com.oracle.bmc.resourceanalytics.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241031")
public class ResourceAnalyticsInstanceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ResourceAnalyticsInstance {
    /** Service instance for ResourceAnalyticsInstance. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ResourceAnalyticsInstanceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://resource-analytics.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ResourceAnalyticsInstanceClient.class);

    private final ResourceAnalyticsInstanceWaiters waiters;

    private final ResourceAnalyticsInstancePaginators paginators;

    ResourceAnalyticsInstanceClient(
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
                                    .nameFormat("ResourceAnalyticsInstance-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ResourceAnalyticsInstanceWaiters(executorService, this);

        this.paginators = new ResourceAnalyticsInstancePaginators(this);
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
                    Builder, ResourceAnalyticsInstanceClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "resourceanalytics";
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
        public ResourceAnalyticsInstanceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ResourceAnalyticsInstanceClient(
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
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20241031")
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
    public ChangeResourceAnalyticsInstanceCompartmentResponse
            changeResourceAnalyticsInstanceCompartment(
                    ChangeResourceAnalyticsInstanceCompartmentRequest request) {

        Validate.notBlank(
                request.getResourceAnalyticsInstanceId(),
                "resourceAnalyticsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeResourceAnalyticsInstanceCompartmentDetails(),
                "changeResourceAnalyticsInstanceCompartmentDetails is required");

        return clientCall(request, ChangeResourceAnalyticsInstanceCompartmentResponse::builder)
                .logger(LOG, "changeResourceAnalyticsInstanceCompartment")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "ChangeResourceAnalyticsInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/ResourceAnalyticsInstance/ChangeResourceAnalyticsInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeResourceAnalyticsInstanceCompartmentRequest::builder)
                .basePath("/20241031")
                .appendPathParam("resourceAnalyticsInstances")
                .appendPathParam(request.getResourceAnalyticsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeResourceAnalyticsInstanceCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeResourceAnalyticsInstanceCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateResourceAnalyticsInstanceResponse createResourceAnalyticsInstance(
            CreateResourceAnalyticsInstanceRequest request) {
        Objects.requireNonNull(
                request.getCreateResourceAnalyticsInstanceDetails(),
                "createResourceAnalyticsInstanceDetails is required");

        return clientCall(request, CreateResourceAnalyticsInstanceResponse::builder)
                .logger(LOG, "createResourceAnalyticsInstance")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "CreateResourceAnalyticsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/ResourceAnalyticsInstance/CreateResourceAnalyticsInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateResourceAnalyticsInstanceRequest::builder)
                .basePath("/20241031")
                .appendPathParam("resourceAnalyticsInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourceanalytics.model.ResourceAnalyticsInstance.class,
                        CreateResourceAnalyticsInstanceResponse.Builder::resourceAnalyticsInstance)
                .handleResponseHeaderString(
                        "location", CreateResourceAnalyticsInstanceResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateResourceAnalyticsInstanceResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateResourceAnalyticsInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateResourceAnalyticsInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateResourceAnalyticsInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteResourceAnalyticsInstanceResponse deleteResourceAnalyticsInstance(
            DeleteResourceAnalyticsInstanceRequest request) {

        Validate.notBlank(
                request.getResourceAnalyticsInstanceId(),
                "resourceAnalyticsInstanceId must not be blank");

        return clientCall(request, DeleteResourceAnalyticsInstanceResponse::builder)
                .logger(LOG, "deleteResourceAnalyticsInstance")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "DeleteResourceAnalyticsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/ResourceAnalyticsInstance/DeleteResourceAnalyticsInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteResourceAnalyticsInstanceRequest::builder)
                .basePath("/20241031")
                .appendPathParam("resourceAnalyticsInstances")
                .appendPathParam(request.getResourceAnalyticsInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteResourceAnalyticsInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteResourceAnalyticsInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetResourceAnalyticsInstanceResponse getResourceAnalyticsInstance(
            GetResourceAnalyticsInstanceRequest request) {

        Validate.notBlank(
                request.getResourceAnalyticsInstanceId(),
                "resourceAnalyticsInstanceId must not be blank");

        return clientCall(request, GetResourceAnalyticsInstanceResponse::builder)
                .logger(LOG, "getResourceAnalyticsInstance")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "GetResourceAnalyticsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/ResourceAnalyticsInstance/GetResourceAnalyticsInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResourceAnalyticsInstanceRequest::builder)
                .basePath("/20241031")
                .appendPathParam("resourceAnalyticsInstances")
                .appendPathParam(request.getResourceAnalyticsInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.resourceanalytics.model.ResourceAnalyticsInstance.class,
                        GetResourceAnalyticsInstanceResponse.Builder::resourceAnalyticsInstance)
                .handleResponseHeaderString(
                        "etag", GetResourceAnalyticsInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetResourceAnalyticsInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20241031")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.resourceanalytics.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListResourceAnalyticsInstancesResponse listResourceAnalyticsInstances(
            ListResourceAnalyticsInstancesRequest request) {

        return clientCall(request, ListResourceAnalyticsInstancesResponse::builder)
                .logger(LOG, "listResourceAnalyticsInstances")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "ListResourceAnalyticsInstances",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/ResourceAnalyticsInstanceCollection/ListResourceAnalyticsInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourceAnalyticsInstancesRequest::builder)
                .basePath("/20241031")
                .appendPathParam("resourceAnalyticsInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
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
                        com.oracle.bmc.resourceanalytics.model.ResourceAnalyticsInstanceCollection
                                .class,
                        ListResourceAnalyticsInstancesResponse.Builder
                                ::resourceAnalyticsInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListResourceAnalyticsInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListResourceAnalyticsInstancesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20241031")
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
                        com.oracle.bmc.resourceanalytics.model.WorkRequestErrorCollection.class,
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
                        "ResourceAnalyticsInstance",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20241031")
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
                        com.oracle.bmc.resourceanalytics.model.WorkRequestLogEntryCollection.class,
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
                        "ResourceAnalyticsInstance",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20241031")
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
                        com.oracle.bmc.resourceanalytics.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ResourceAnalyticsInstanceDisableOacResponse resourceAnalyticsInstanceDisableOac(
            ResourceAnalyticsInstanceDisableOacRequest request) {

        Validate.notBlank(
                request.getResourceAnalyticsInstanceId(),
                "resourceAnalyticsInstanceId must not be blank");

        return clientCall(request, ResourceAnalyticsInstanceDisableOacResponse::builder)
                .logger(LOG, "resourceAnalyticsInstanceDisableOac")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "ResourceAnalyticsInstanceDisableOac",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/ResourceAnalyticsInstance/ResourceAnalyticsInstanceDisableOac")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResourceAnalyticsInstanceDisableOacRequest::builder)
                .basePath("/20241031")
                .appendPathParam("resourceAnalyticsInstances")
                .appendPathParam(request.getResourceAnalyticsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("disableOac")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ResourceAnalyticsInstanceDisableOacResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ResourceAnalyticsInstanceDisableOacResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ResourceAnalyticsInstanceEnableOacResponse resourceAnalyticsInstanceEnableOac(
            ResourceAnalyticsInstanceEnableOacRequest request) {

        Validate.notBlank(
                request.getResourceAnalyticsInstanceId(),
                "resourceAnalyticsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getResourceAnalyticsInstanceEnableOacDetails(),
                "resourceAnalyticsInstanceEnableOacDetails is required");

        return clientCall(request, ResourceAnalyticsInstanceEnableOacResponse::builder)
                .logger(LOG, "resourceAnalyticsInstanceEnableOac")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "ResourceAnalyticsInstanceEnableOac",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/ResourceAnalyticsInstance/ResourceAnalyticsInstanceEnableOac")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResourceAnalyticsInstanceEnableOacRequest::builder)
                .basePath("/20241031")
                .appendPathParam("resourceAnalyticsInstances")
                .appendPathParam(request.getResourceAnalyticsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("enableOac")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ResourceAnalyticsInstanceEnableOacResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ResourceAnalyticsInstanceEnableOacResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateResourceAnalyticsInstanceResponse updateResourceAnalyticsInstance(
            UpdateResourceAnalyticsInstanceRequest request) {

        Validate.notBlank(
                request.getResourceAnalyticsInstanceId(),
                "resourceAnalyticsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateResourceAnalyticsInstanceDetails(),
                "updateResourceAnalyticsInstanceDetails is required");

        return clientCall(request, UpdateResourceAnalyticsInstanceResponse::builder)
                .logger(LOG, "updateResourceAnalyticsInstance")
                .serviceDetails(
                        "ResourceAnalyticsInstance",
                        "UpdateResourceAnalyticsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/ResourceAnalyticsInstance/UpdateResourceAnalyticsInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateResourceAnalyticsInstanceRequest::builder)
                .basePath("/20241031")
                .appendPathParam("resourceAnalyticsInstances")
                .appendPathParam(request.getResourceAnalyticsInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateResourceAnalyticsInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateResourceAnalyticsInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ResourceAnalyticsInstanceWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ResourceAnalyticsInstancePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ResourceAnalyticsInstanceClient(
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
    public ResourceAnalyticsInstanceClient(
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
    public ResourceAnalyticsInstanceClient(
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
    public ResourceAnalyticsInstanceClient(
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
    public ResourceAnalyticsInstanceClient(
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
    public ResourceAnalyticsInstanceClient(
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
    public ResourceAnalyticsInstanceClient(
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
    public ResourceAnalyticsInstanceClient(
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
