/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.integration.requests.*;
import com.oracle.bmc.integration.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
public class IntegrationInstanceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements IntegrationInstance {
    /** Service instance for IntegrationInstance. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(IntegrationInstanceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://integration.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IntegrationInstanceClient.class);

    private final IntegrationInstanceWaiters waiters;

    private final IntegrationInstancePaginators paginators;

    IntegrationInstanceClient(
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
                                    .nameFormat("IntegrationInstance-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new IntegrationInstanceWaiters(executorService, this);

        this.paginators = new IntegrationInstancePaginators(this);
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
                    Builder, IntegrationInstanceClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "integration";
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
        public IntegrationInstanceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new IntegrationInstanceClient(
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
    public AddOracleManagedCustomEndpointResponse addOracleManagedCustomEndpoint(
            AddOracleManagedCustomEndpointRequest request) {
        Objects.requireNonNull(
                request.getAddOracleManagedCustomEndpointDetails(),
                "addOracleManagedCustomEndpointDetails is required");

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, AddOracleManagedCustomEndpointResponse::builder)
                .logger(LOG, "addOracleManagedCustomEndpoint")
                .serviceDetails(
                        "IntegrationInstance",
                        "AddOracleManagedCustomEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/AddOracleManagedCustomEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddOracleManagedCustomEndpointRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("addOracleManagedCustomEndpoint")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddOracleManagedCustomEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddOracleManagedCustomEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeIntegrationInstanceCompartmentResponse changeIntegrationInstanceCompartment(
            ChangeIntegrationInstanceCompartmentRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeIntegrationInstanceCompartmentDetails(),
                "changeIntegrationInstanceCompartmentDetails is required");

        return clientCall(request, ChangeIntegrationInstanceCompartmentResponse::builder)
                .logger(LOG, "changeIntegrationInstanceCompartment")
                .serviceDetails(
                        "IntegrationInstance",
                        "ChangeIntegrationInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/ChangeIntegrationInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIntegrationInstanceCompartmentRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeIntegrationInstanceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIntegrationInstanceCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeIntegrationInstanceNetworkEndpointResponse
            changeIntegrationInstanceNetworkEndpoint(
                    ChangeIntegrationInstanceNetworkEndpointRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeIntegrationInstanceNetworkEndpointDetails(),
                "changeIntegrationInstanceNetworkEndpointDetails is required");

        return clientCall(request, ChangeIntegrationInstanceNetworkEndpointResponse::builder)
                .logger(LOG, "changeIntegrationInstanceNetworkEndpoint")
                .serviceDetails(
                        "IntegrationInstance",
                        "ChangeIntegrationInstanceNetworkEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/ChangeIntegrationInstanceNetworkEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIntegrationInstanceNetworkEndpointRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeNetworkEndpoint")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeIntegrationInstanceNetworkEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIntegrationInstanceNetworkEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePrivateEndpointOutboundConnectionResponse changePrivateEndpointOutboundConnection(
            ChangePrivateEndpointOutboundConnectionRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangePrivateEndpointOutboundConnectionDetails(),
                "changePrivateEndpointOutboundConnectionDetails is required");

        return clientCall(request, ChangePrivateEndpointOutboundConnectionResponse::builder)
                .logger(LOG, "changePrivateEndpointOutboundConnection")
                .serviceDetails(
                        "IntegrationInstance",
                        "ChangePrivateEndpointOutboundConnection",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/ChangePrivateEndpointOutboundConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePrivateEndpointOutboundConnectionRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changePrivateEndpointOutboundConnection")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePrivateEndpointOutboundConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePrivateEndpointOutboundConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateIntegrationInstanceResponse createIntegrationInstance(
            CreateIntegrationInstanceRequest request) {
        Objects.requireNonNull(
                request.getCreateIntegrationInstanceDetails(),
                "createIntegrationInstanceDetails is required");

        return clientCall(request, CreateIntegrationInstanceResponse::builder)
                .logger(LOG, "createIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "CreateIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/CreateIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateIntegrationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIntegrationInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteIntegrationInstanceResponse deleteIntegrationInstance(
            DeleteIntegrationInstanceRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, DeleteIntegrationInstanceResponse::builder)
                .logger(LOG, "deleteIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "DeleteIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/DeleteIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteIntegrationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIntegrationInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisasterRecoveryFailoverResponse disasterRecoveryFailover(
            DisasterRecoveryFailoverRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, DisasterRecoveryFailoverResponse::builder)
                .logger(LOG, "disasterRecoveryFailover")
                .serviceDetails(
                        "IntegrationInstance",
                        "DisasterRecoveryFailover",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/DisasterRecoveryFailover")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisasterRecoveryFailoverRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("failover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisasterRecoveryFailoverResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisasterRecoveryFailoverResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableProcessAutomationResponse enableProcessAutomation(
            EnableProcessAutomationRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, EnableProcessAutomationResponse::builder)
                .logger(LOG, "enableProcessAutomation")
                .serviceDetails(
                        "IntegrationInstance",
                        "EnableProcessAutomation",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/EnableProcessAutomation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableProcessAutomationRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("enableProcessAutomation")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableProcessAutomationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableProcessAutomationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ExtendDataRetentionResponse extendDataRetention(ExtendDataRetentionRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");
        Objects.requireNonNull(
                request.getExtendDataRetentionDetails(), "extendDataRetentionDetails is required");

        return clientCall(request, ExtendDataRetentionResponse::builder)
                .logger(LOG, "extendDataRetention")
                .serviceDetails(
                        "IntegrationInstance",
                        "ExtendDataRetention",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/ExtendDataRetention")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExtendDataRetentionRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("extendDataRetention")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExtendDataRetentionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ExtendDataRetentionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetIntegrationInstanceResponse getIntegrationInstance(
            GetIntegrationInstanceRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, GetIntegrationInstanceResponse::builder)
                .logger(LOG, "getIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "GetIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/GetIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.integration.model.IntegrationInstance.class,
                        GetIntegrationInstanceResponse.Builder::integrationInstance)
                .handleResponseHeaderString("etag", GetIntegrationInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIntegrationInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "IntegrationInstance",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20190131")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.integration.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListIntegrationInstancesResponse listIntegrationInstances(
            ListIntegrationInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIntegrationInstancesResponse::builder)
                .logger(LOG, "listIntegrationInstances")
                .serviceDetails(
                        "IntegrationInstance",
                        "ListIntegrationInstances",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstanceSummary/ListIntegrationInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIntegrationInstancesRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.integration.model.IntegrationInstanceSummary.class,
                        ListIntegrationInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListIntegrationInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIntegrationInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page",
                        ListIntegrationInstancesResponse.Builder::opcPreviousPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "IntegrationInstance",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20190131")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.integration.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListWorkRequestErrorsResponse.Builder::opcPreviousPage)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "IntegrationInstance",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20190131")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.integration.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListWorkRequestLogsResponse.Builder::opcPreviousPage)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "IntegrationInstance",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/WorkRequestSummary/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20190131")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("integrationInstanceId", request.getIntegrationInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.integration.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListWorkRequestsResponse.Builder::opcPreviousPage)
                .callSync();
    }

    @Override
    public RemoveOracleManagedCustomEndpointResponse removeOracleManagedCustomEndpoint(
            RemoveOracleManagedCustomEndpointRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, RemoveOracleManagedCustomEndpointResponse::builder)
                .logger(LOG, "removeOracleManagedCustomEndpoint")
                .serviceDetails(
                        "IntegrationInstance",
                        "RemoveOracleManagedCustomEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/RemoveOracleManagedCustomEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveOracleManagedCustomEndpointRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("removeOracleManagedCustomEndpoint")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveOracleManagedCustomEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveOracleManagedCustomEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartIntegrationInstanceResponse startIntegrationInstance(
            StartIntegrationInstanceRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, StartIntegrationInstanceResponse::builder)
                .logger(LOG, "startIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "StartIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/StartIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartIntegrationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartIntegrationInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopIntegrationInstanceResponse stopIntegrationInstance(
            StopIntegrationInstanceRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, StopIntegrationInstanceResponse::builder)
                .logger(LOG, "stopIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "StopIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/StopIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopIntegrationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopIntegrationInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateIntegrationInstanceResponse updateIntegrationInstance(
            UpdateIntegrationInstanceRequest request) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIntegrationInstanceDetails(),
                "updateIntegrationInstanceDetails is required");

        return clientCall(request, UpdateIntegrationInstanceResponse::builder)
                .logger(LOG, "updateIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "UpdateIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/UpdateIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateIntegrationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIntegrationInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public IntegrationInstanceWaiters getWaiters() {
        return waiters;
    }

    @Override
    public IntegrationInstancePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IntegrationInstanceClient(
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
    public IntegrationInstanceClient(
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
    public IntegrationInstanceClient(
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
    public IntegrationInstanceClient(
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
    public IntegrationInstanceClient(
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
    public IntegrationInstanceClient(
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
    public IntegrationInstanceClient(
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
    public IntegrationInstanceClient(
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
