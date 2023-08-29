/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class OperationsInsightsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OperationsInsights {
    /** Service instance for OperationsInsights. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OPERATIONSINSIGHTS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operationsinsights.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationsInsightsClient.class);

    private final OperationsInsightsWaiters waiters;

    private final OperationsInsightsPaginators paginators;

    OperationsInsightsClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    OperationsInsightsClient(
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
                                    .nameFormat("OperationsInsights-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OperationsInsightsWaiters(executorService, this);

        this.paginators = new OperationsInsightsPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "OperationsInsightsClient",
                            "downloadOperationsInsightsWarehouseWallet"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OperationsInsightsClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "opsi";
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
        public OperationsInsightsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OperationsInsightsClient(
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
    public AddExadataInsightMembersResponse addExadataInsightMembers(
            AddExadataInsightMembersRequest request) {
        Objects.requireNonNull(
                request.getAddExadataInsightMembersDetails(),
                "addExadataInsightMembersDetails is required");

        Validate.notBlank(request.getExadataInsightId(), "exadataInsightId must not be blank");

        return clientCall(request, AddExadataInsightMembersResponse::builder)
                .logger(LOG, "addExadataInsightMembers")
                .serviceDetails(
                        "OperationsInsights",
                        "AddExadataInsightMembers",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/AddExadataInsightMembers")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddExadataInsightMembersRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam(request.getExadataInsightId())
                .appendPathParam("actions")
                .appendPathParam("addMembers")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddExadataInsightMembersResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AddExadataInsightMembersResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeAutonomousDatabaseInsightAdvancedFeaturesResponse
            changeAutonomousDatabaseInsightAdvancedFeatures(
                    ChangeAutonomousDatabaseInsightAdvancedFeaturesRequest request) {
        Objects.requireNonNull(
                request.getChangeAutonomousDatabaseInsightAdvancedFeaturesDetails(),
                "changeAutonomousDatabaseInsightAdvancedFeaturesDetails is required");

        Validate.notBlank(request.getDatabaseInsightId(), "databaseInsightId must not be blank");

        return clientCall(request, ChangeAutonomousDatabaseInsightAdvancedFeaturesResponse::builder)
                .logger(LOG, "changeAutonomousDatabaseInsightAdvancedFeatures")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangeAutonomousDatabaseInsightAdvancedFeatures",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ChangeAutonomousDatabaseInsightAdvancedFeatures")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAutonomousDatabaseInsightAdvancedFeaturesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam(request.getDatabaseInsightId())
                .appendPathParam("actions")
                .appendPathParam("changeAutonomousDatabaseInsightAdvancedFeatures")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAutonomousDatabaseInsightAdvancedFeaturesResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAutonomousDatabaseInsightAdvancedFeaturesResponse.Builder
                                ::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeDatabaseInsightCompartmentResponse changeDatabaseInsightCompartment(
            ChangeDatabaseInsightCompartmentRequest request) {

        Validate.notBlank(request.getDatabaseInsightId(), "databaseInsightId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatabaseInsightCompartmentDetails(),
                "changeDatabaseInsightCompartmentDetails is required");

        return clientCall(request, ChangeDatabaseInsightCompartmentResponse::builder)
                .logger(LOG, "changeDatabaseInsightCompartment")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangeDatabaseInsightCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ChangeDatabaseInsightCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatabaseInsightCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam(request.getDatabaseInsightId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDatabaseInsightCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDatabaseInsightCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeEnterpriseManagerBridgeCompartmentResponse
            changeEnterpriseManagerBridgeCompartment(
                    ChangeEnterpriseManagerBridgeCompartmentRequest request) {

        Validate.notBlank(
                request.getEnterpriseManagerBridgeId(),
                "enterpriseManagerBridgeId must not be blank");
        Objects.requireNonNull(
                request.getChangeEnterpriseManagerBridgeCompartmentDetails(),
                "changeEnterpriseManagerBridgeCompartmentDetails is required");

        return clientCall(request, ChangeEnterpriseManagerBridgeCompartmentResponse::builder)
                .logger(LOG, "changeEnterpriseManagerBridgeCompartment")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangeEnterpriseManagerBridgeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/ChangeEnterpriseManagerBridgeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeEnterpriseManagerBridgeCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("enterpriseManagerBridges")
                .appendPathParam(request.getEnterpriseManagerBridgeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeEnterpriseManagerBridgeCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeEnterpriseManagerBridgeCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeExadataInsightCompartmentResponse changeExadataInsightCompartment(
            ChangeExadataInsightCompartmentRequest request) {

        Validate.notBlank(request.getExadataInsightId(), "exadataInsightId must not be blank");
        Objects.requireNonNull(
                request.getChangeExadataInsightCompartmentDetails(),
                "changeExadataInsightCompartmentDetails is required");

        return clientCall(request, ChangeExadataInsightCompartmentResponse::builder)
                .logger(LOG, "changeExadataInsightCompartment")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangeExadataInsightCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/ChangeExadataInsightCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExadataInsightCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam(request.getExadataInsightId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExadataInsightCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExadataInsightCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeHostInsightCompartmentResponse changeHostInsightCompartment(
            ChangeHostInsightCompartmentRequest request) {

        Validate.notBlank(request.getHostInsightId(), "hostInsightId must not be blank");
        Objects.requireNonNull(
                request.getChangeHostInsightCompartmentDetails(),
                "changeHostInsightCompartmentDetails is required");

        return clientCall(request, ChangeHostInsightCompartmentResponse::builder)
                .logger(LOG, "changeHostInsightCompartment")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangeHostInsightCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ChangeHostInsightCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeHostInsightCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam(request.getHostInsightId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeHostInsightCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeHostInsightCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeNewsReportCompartmentResponse changeNewsReportCompartment(
            ChangeNewsReportCompartmentRequest request) {

        Validate.notBlank(request.getNewsReportId(), "newsReportId must not be blank");
        Objects.requireNonNull(
                request.getChangeNewsReportCompartmentDetails(),
                "changeNewsReportCompartmentDetails is required");

        return clientCall(request, ChangeNewsReportCompartmentResponse::builder)
                .logger(LOG, "changeNewsReportCompartment")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangeNewsReportCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/NewsReports/ChangeNewsReportCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNewsReportCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("newsReports")
                .appendPathParam(request.getNewsReportId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeNewsReportCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeNewsReportCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeOperationsInsightsPrivateEndpointCompartmentResponse
            changeOperationsInsightsPrivateEndpointCompartment(
                    ChangeOperationsInsightsPrivateEndpointCompartmentRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsPrivateEndpointId(),
                "operationsInsightsPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeOperationsInsightsPrivateEndpointCompartmentDetails(),
                "changeOperationsInsightsPrivateEndpointCompartmentDetails is required");

        return clientCall(
                        request,
                        ChangeOperationsInsightsPrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeOperationsInsightsPrivateEndpointCompartment")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangeOperationsInsightsPrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/ChangeOperationsInsightsPrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOperationsInsightsPrivateEndpointCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsPrivateEndpoints")
                .appendPathParam(request.getOperationsInsightsPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOperationsInsightsPrivateEndpointCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOperationsInsightsPrivateEndpointCompartmentResponse.Builder
                                ::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeOpsiConfigurationCompartmentResponse changeOpsiConfigurationCompartment(
            ChangeOpsiConfigurationCompartmentRequest request) {

        Validate.notBlank(
                request.getOpsiConfigurationId(), "opsiConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getChangeOpsiConfigurationCompartmentDetails(),
                "changeOpsiConfigurationCompartmentDetails is required");

        return clientCall(request, ChangeOpsiConfigurationCompartmentResponse::builder)
                .logger(LOG, "changeOpsiConfigurationCompartment")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangeOpsiConfigurationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiConfigurations/ChangeOpsiConfigurationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOpsiConfigurationCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("opsiConfigurations")
                .appendPathParam(request.getOpsiConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOpsiConfigurationCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOpsiConfigurationCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangePeComanagedDatabaseInsightResponse changePeComanagedDatabaseInsight(
            ChangePeComanagedDatabaseInsightRequest request) {

        Validate.notBlank(request.getDatabaseInsightId(), "databaseInsightId must not be blank");
        Objects.requireNonNull(
                request.getChangePeComanagedDatabaseInsightDetails(),
                "changePeComanagedDatabaseInsightDetails is required");

        return clientCall(request, ChangePeComanagedDatabaseInsightResponse::builder)
                .logger(LOG, "changePeComanagedDatabaseInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangePeComanagedDatabaseInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ChangePeComanagedDatabaseInsight")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePeComanagedDatabaseInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam(request.getDatabaseInsightId())
                .appendPathParam("actions")
                .appendPathParam("changePeComanagedDatabaseInsightDetails")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePeComanagedDatabaseInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePeComanagedDatabaseInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateAwrHubResponse createAwrHub(CreateAwrHubRequest request) {
        Objects.requireNonNull(request.getCreateAwrHubDetails(), "createAwrHubDetails is required");

        return clientCall(request, CreateAwrHubResponse::builder)
                .logger(LOG, "createAwrHub")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateAwrHub",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/CreateAwrHub")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAwrHubRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrHub.class,
                        CreateAwrHubResponse.Builder::awrHub)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateAwrHubResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAwrHubResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateAwrHubResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateAwrHubResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateAwrHubResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDatabaseInsightResponse createDatabaseInsight(
            CreateDatabaseInsightRequest request) {
        Objects.requireNonNull(
                request.getCreateDatabaseInsightDetails(),
                "createDatabaseInsightDetails is required");

        return clientCall(request, CreateDatabaseInsightResponse::builder)
                .logger(LOG, "createDatabaseInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateDatabaseInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/CreateDatabaseInsight")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatabaseInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.DatabaseInsight.class,
                        CreateDatabaseInsightResponse.Builder::databaseInsight)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDatabaseInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatabaseInsightResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateDatabaseInsightResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateDatabaseInsightResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateDatabaseInsightResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateEnterpriseManagerBridgeResponse createEnterpriseManagerBridge(
            CreateEnterpriseManagerBridgeRequest request) {
        Objects.requireNonNull(
                request.getCreateEnterpriseManagerBridgeDetails(),
                "createEnterpriseManagerBridgeDetails is required");

        return clientCall(request, CreateEnterpriseManagerBridgeResponse::builder)
                .logger(LOG, "createEnterpriseManagerBridge")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateEnterpriseManagerBridge",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/CreateEnterpriseManagerBridge")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEnterpriseManagerBridgeRequest::builder)
                .basePath("/20200630")
                .appendPathParam("enterpriseManagerBridges")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.EnterpriseManagerBridge.class,
                        CreateEnterpriseManagerBridgeResponse.Builder::enterpriseManagerBridge)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateEnterpriseManagerBridgeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateEnterpriseManagerBridgeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateEnterpriseManagerBridgeResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateEnterpriseManagerBridgeResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateEnterpriseManagerBridgeResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateExadataInsightResponse createExadataInsight(CreateExadataInsightRequest request) {
        Objects.requireNonNull(
                request.getCreateExadataInsightDetails(),
                "createExadataInsightDetails is required");

        return clientCall(request, CreateExadataInsightResponse::builder)
                .logger(LOG, "createExadataInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateExadataInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/CreateExadataInsight")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExadataInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.ExadataInsight.class,
                        CreateExadataInsightResponse.Builder::exadataInsight)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExadataInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateExadataInsightResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateExadataInsightResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateExadataInsightResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateExadataInsightResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateHostInsightResponse createHostInsight(CreateHostInsightRequest request) {
        Objects.requireNonNull(
                request.getCreateHostInsightDetails(), "createHostInsightDetails is required");

        return clientCall(request, CreateHostInsightResponse::builder)
                .logger(LOG, "createHostInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateHostInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/CreateHostInsight")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateHostInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.HostInsight.class,
                        CreateHostInsightResponse.Builder::hostInsight)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateHostInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateHostInsightResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateHostInsightResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateHostInsightResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateHostInsightResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateNewsReportResponse createNewsReport(CreateNewsReportRequest request) {
        Objects.requireNonNull(
                request.getCreateNewsReportDetails(), "createNewsReportDetails is required");

        return clientCall(request, CreateNewsReportResponse::builder)
                .logger(LOG, "createNewsReport")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateNewsReport",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/NewsReports/CreateNewsReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNewsReportRequest::builder)
                .basePath("/20200630")
                .appendPathParam("newsReports")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.NewsReport.class,
                        CreateNewsReportResponse.Builder::newsReport)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateNewsReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNewsReportResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateNewsReportResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateNewsReportResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateNewsReportResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateOperationsInsightsPrivateEndpointResponse createOperationsInsightsPrivateEndpoint(
            CreateOperationsInsightsPrivateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreateOperationsInsightsPrivateEndpointDetails(),
                "createOperationsInsightsPrivateEndpointDetails is required");

        return clientCall(request, CreateOperationsInsightsPrivateEndpointResponse::builder)
                .logger(LOG, "createOperationsInsightsPrivateEndpoint")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateOperationsInsightsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/CreateOperationsInsightsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOperationsInsightsPrivateEndpointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsPrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpoint.class,
                        CreateOperationsInsightsPrivateEndpointResponse.Builder
                                ::operationsInsightsPrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOperationsInsightsPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOperationsInsightsPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location",
                        CreateOperationsInsightsPrivateEndpointResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOperationsInsightsPrivateEndpointResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOperationsInsightsPrivateEndpointResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateOperationsInsightsWarehouseResponse createOperationsInsightsWarehouse(
            CreateOperationsInsightsWarehouseRequest request) {
        Objects.requireNonNull(
                request.getCreateOperationsInsightsWarehouseDetails(),
                "createOperationsInsightsWarehouseDetails is required");

        return clientCall(request, CreateOperationsInsightsWarehouseResponse::builder)
                .logger(LOG, "createOperationsInsightsWarehouse")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateOperationsInsightsWarehouse",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/CreateOperationsInsightsWarehouse")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOperationsInsightsWarehouseRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouses")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.OperationsInsightsWarehouse.class,
                        CreateOperationsInsightsWarehouseResponse.Builder
                                ::operationsInsightsWarehouse)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOperationsInsightsWarehouseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOperationsInsightsWarehouseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOperationsInsightsWarehouseResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOperationsInsightsWarehouseResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOperationsInsightsWarehouseResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateOperationsInsightsWarehouseUserResponse createOperationsInsightsWarehouseUser(
            CreateOperationsInsightsWarehouseUserRequest request) {
        Objects.requireNonNull(
                request.getCreateOperationsInsightsWarehouseUserDetails(),
                "createOperationsInsightsWarehouseUserDetails is required");

        return clientCall(request, CreateOperationsInsightsWarehouseUserResponse::builder)
                .logger(LOG, "createOperationsInsightsWarehouseUser")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateOperationsInsightsWarehouseUser",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouseUsers/CreateOperationsInsightsWarehouseUser")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOperationsInsightsWarehouseUserRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouseUsers")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUser.class,
                        CreateOperationsInsightsWarehouseUserResponse.Builder
                                ::operationsInsightsWarehouseUser)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOperationsInsightsWarehouseUserResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOperationsInsightsWarehouseUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOperationsInsightsWarehouseUserResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOperationsInsightsWarehouseUserResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOperationsInsightsWarehouseUserResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateOpsiConfigurationResponse createOpsiConfiguration(
            CreateOpsiConfigurationRequest request) {
        Objects.requireNonNull(
                request.getCreateOpsiConfigurationDetails(),
                "createOpsiConfigurationDetails is required");

        return clientCall(request, CreateOpsiConfigurationResponse::builder)
                .logger(LOG, "createOpsiConfiguration")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateOpsiConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiConfigurations/CreateOpsiConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOpsiConfigurationRequest::builder)
                .basePath("/20200630")
                .appendPathParam("opsiConfigurations")
                .appendListQueryParam(
                        "opsiConfigField",
                        request.getOpsiConfigField(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "configItemCustomStatus",
                        request.getConfigItemCustomStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "configItemsApplicableContext",
                        request.getConfigItemsApplicableContext(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "configItemField",
                        request.getConfigItemField(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.OpsiConfiguration.class,
                        CreateOpsiConfigurationResponse.Builder::opsiConfiguration)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOpsiConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOpsiConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateOpsiConfigurationResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteAwrHubResponse deleteAwrHub(DeleteAwrHubRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");

        return clientCall(request, DeleteAwrHubResponse::builder)
                .logger(LOG, "deleteAwrHub")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteAwrHub",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/DeleteAwrHub")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAwrHubRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAwrHubResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAwrHubResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDatabaseInsightResponse deleteDatabaseInsight(
            DeleteDatabaseInsightRequest request) {

        Validate.notBlank(request.getDatabaseInsightId(), "databaseInsightId must not be blank");

        return clientCall(request, DeleteDatabaseInsightResponse::builder)
                .logger(LOG, "deleteDatabaseInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteDatabaseInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/DeleteDatabaseInsight")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatabaseInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam(request.getDatabaseInsightId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDatabaseInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatabaseInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteEnterpriseManagerBridgeResponse deleteEnterpriseManagerBridge(
            DeleteEnterpriseManagerBridgeRequest request) {

        Validate.notBlank(
                request.getEnterpriseManagerBridgeId(),
                "enterpriseManagerBridgeId must not be blank");

        return clientCall(request, DeleteEnterpriseManagerBridgeResponse::builder)
                .logger(LOG, "deleteEnterpriseManagerBridge")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteEnterpriseManagerBridge",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/DeleteEnterpriseManagerBridge")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEnterpriseManagerBridgeRequest::builder)
                .basePath("/20200630")
                .appendPathParam("enterpriseManagerBridges")
                .appendPathParam(request.getEnterpriseManagerBridgeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteEnterpriseManagerBridgeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteEnterpriseManagerBridgeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteExadataInsightResponse deleteExadataInsight(DeleteExadataInsightRequest request) {

        Validate.notBlank(request.getExadataInsightId(), "exadataInsightId must not be blank");

        return clientCall(request, DeleteExadataInsightResponse::builder)
                .logger(LOG, "deleteExadataInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteExadataInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/DeleteExadataInsight")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExadataInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam(request.getExadataInsightId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExadataInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteExadataInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteHostInsightResponse deleteHostInsight(DeleteHostInsightRequest request) {

        Validate.notBlank(request.getHostInsightId(), "hostInsightId must not be blank");

        return clientCall(request, DeleteHostInsightResponse::builder)
                .logger(LOG, "deleteHostInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteHostInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/DeleteHostInsight")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteHostInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam(request.getHostInsightId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteHostInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteHostInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteNewsReportResponse deleteNewsReport(DeleteNewsReportRequest request) {

        Validate.notBlank(request.getNewsReportId(), "newsReportId must not be blank");

        return clientCall(request, DeleteNewsReportResponse::builder)
                .logger(LOG, "deleteNewsReport")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteNewsReport",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/NewsReports/DeleteNewsReport")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNewsReportRequest::builder)
                .basePath("/20200630")
                .appendPathParam("newsReports")
                .appendPathParam(request.getNewsReportId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteNewsReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNewsReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteOperationsInsightsPrivateEndpointResponse deleteOperationsInsightsPrivateEndpoint(
            DeleteOperationsInsightsPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsPrivateEndpointId(),
                "operationsInsightsPrivateEndpointId must not be blank");

        return clientCall(request, DeleteOperationsInsightsPrivateEndpointResponse::builder)
                .logger(LOG, "deleteOperationsInsightsPrivateEndpoint")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteOperationsInsightsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/DeleteOperationsInsightsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOperationsInsightsPrivateEndpointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsPrivateEndpoints")
                .appendPathParam(request.getOperationsInsightsPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOperationsInsightsPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOperationsInsightsPrivateEndpointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteOperationsInsightsWarehouseResponse deleteOperationsInsightsWarehouse(
            DeleteOperationsInsightsWarehouseRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsWarehouseId(),
                "operationsInsightsWarehouseId must not be blank");

        return clientCall(request, DeleteOperationsInsightsWarehouseResponse::builder)
                .logger(LOG, "deleteOperationsInsightsWarehouse")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteOperationsInsightsWarehouse",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/DeleteOperationsInsightsWarehouse")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOperationsInsightsWarehouseRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouses")
                .appendPathParam(request.getOperationsInsightsWarehouseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOperationsInsightsWarehouseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOperationsInsightsWarehouseResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteOperationsInsightsWarehouseUserResponse deleteOperationsInsightsWarehouseUser(
            DeleteOperationsInsightsWarehouseUserRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsWarehouseUserId(),
                "operationsInsightsWarehouseUserId must not be blank");

        return clientCall(request, DeleteOperationsInsightsWarehouseUserResponse::builder)
                .logger(LOG, "deleteOperationsInsightsWarehouseUser")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteOperationsInsightsWarehouseUser",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouseUsers/DeleteOperationsInsightsWarehouseUser")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOperationsInsightsWarehouseUserRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouseUsers")
                .appendPathParam(request.getOperationsInsightsWarehouseUserId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOperationsInsightsWarehouseUserResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOperationsInsightsWarehouseUserResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteOpsiConfigurationResponse deleteOpsiConfiguration(
            DeleteOpsiConfigurationRequest request) {

        Validate.notBlank(
                request.getOpsiConfigurationId(), "opsiConfigurationId must not be blank");

        return clientCall(request, DeleteOpsiConfigurationResponse::builder)
                .logger(LOG, "deleteOpsiConfiguration")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteOpsiConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiConfigurations/DeleteOpsiConfiguration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOpsiConfigurationRequest::builder)
                .basePath("/20200630")
                .appendPathParam("opsiConfigurations")
                .appendPathParam(request.getOpsiConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOpsiConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOpsiConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DisableAutonomousDatabaseInsightAdvancedFeaturesResponse
            disableAutonomousDatabaseInsightAdvancedFeatures(
                    DisableAutonomousDatabaseInsightAdvancedFeaturesRequest request) {

        Validate.notBlank(request.getDatabaseInsightId(), "databaseInsightId must not be blank");

        return clientCall(
                        request, DisableAutonomousDatabaseInsightAdvancedFeaturesResponse::builder)
                .logger(LOG, "disableAutonomousDatabaseInsightAdvancedFeatures")
                .serviceDetails(
                        "OperationsInsights",
                        "DisableAutonomousDatabaseInsightAdvancedFeatures",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/DisableAutonomousDatabaseInsightAdvancedFeatures")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableAutonomousDatabaseInsightAdvancedFeaturesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam(request.getDatabaseInsightId())
                .appendPathParam("actions")
                .appendPathParam("disableAutonomousDatabaseInsightAdvancedFeatures")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableAutonomousDatabaseInsightAdvancedFeaturesResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableAutonomousDatabaseInsightAdvancedFeaturesResponse.Builder
                                ::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DisableDatabaseInsightResponse disableDatabaseInsight(
            DisableDatabaseInsightRequest request) {

        Validate.notBlank(request.getDatabaseInsightId(), "databaseInsightId must not be blank");

        return clientCall(request, DisableDatabaseInsightResponse::builder)
                .logger(LOG, "disableDatabaseInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "DisableDatabaseInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/DisableDatabaseInsight")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableDatabaseInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam(request.getDatabaseInsightId())
                .appendPathParam("actions")
                .appendPathParam("disable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableDatabaseInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableDatabaseInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DisableExadataInsightResponse disableExadataInsight(
            DisableExadataInsightRequest request) {

        Validate.notBlank(request.getExadataInsightId(), "exadataInsightId must not be blank");

        return clientCall(request, DisableExadataInsightResponse::builder)
                .logger(LOG, "disableExadataInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "DisableExadataInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/DisableExadataInsight")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExadataInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam(request.getExadataInsightId())
                .appendPathParam("actions")
                .appendPathParam("disable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExadataInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableExadataInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DisableHostInsightResponse disableHostInsight(DisableHostInsightRequest request) {

        Validate.notBlank(request.getHostInsightId(), "hostInsightId must not be blank");

        return clientCall(request, DisableHostInsightResponse::builder)
                .logger(LOG, "disableHostInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "DisableHostInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/DisableHostInsight")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableHostInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam(request.getHostInsightId())
                .appendPathParam("actions")
                .appendPathParam("disable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", DisableHostInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableHostInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DownloadOperationsInsightsWarehouseWalletResponse
            downloadOperationsInsightsWarehouseWallet(
                    DownloadOperationsInsightsWarehouseWalletRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsWarehouseId(),
                "operationsInsightsWarehouseId must not be blank");
        Objects.requireNonNull(
                request.getDownloadOperationsInsightsWarehouseWalletDetails(),
                "downloadOperationsInsightsWarehouseWalletDetails is required");

        return clientCall(request, DownloadOperationsInsightsWarehouseWalletResponse::builder)
                .logger(LOG, "downloadOperationsInsightsWarehouseWallet")
                .serviceDetails(
                        "OperationsInsights",
                        "DownloadOperationsInsightsWarehouseWallet",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/DownloadOperationsInsightsWarehouseWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadOperationsInsightsWarehouseWalletRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouses")
                .appendPathParam(request.getOperationsInsightsWarehouseId())
                .appendPathParam("actions")
                .appendPathParam("downloadWarehouseWallet")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        DownloadOperationsInsightsWarehouseWalletResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", DownloadOperationsInsightsWarehouseWalletResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadOperationsInsightsWarehouseWalletResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadOperationsInsightsWarehouseWalletResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        DownloadOperationsInsightsWarehouseWalletResponse.Builder::lastModified)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EnableAutonomousDatabaseInsightAdvancedFeaturesResponse
            enableAutonomousDatabaseInsightAdvancedFeatures(
                    EnableAutonomousDatabaseInsightAdvancedFeaturesRequest request) {
        Objects.requireNonNull(
                request.getEnableAutonomousDatabaseInsightAdvancedFeaturesDetails(),
                "enableAutonomousDatabaseInsightAdvancedFeaturesDetails is required");

        Validate.notBlank(request.getDatabaseInsightId(), "databaseInsightId must not be blank");

        return clientCall(request, EnableAutonomousDatabaseInsightAdvancedFeaturesResponse::builder)
                .logger(LOG, "enableAutonomousDatabaseInsightAdvancedFeatures")
                .serviceDetails(
                        "OperationsInsights",
                        "EnableAutonomousDatabaseInsightAdvancedFeatures",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/EnableAutonomousDatabaseInsightAdvancedFeatures")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableAutonomousDatabaseInsightAdvancedFeaturesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam(request.getDatabaseInsightId())
                .appendPathParam("actions")
                .appendPathParam("enableAutonomousDatabaseInsightAdvancedFeatures")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableAutonomousDatabaseInsightAdvancedFeaturesResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableAutonomousDatabaseInsightAdvancedFeaturesResponse.Builder
                                ::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EnableDatabaseInsightResponse enableDatabaseInsight(
            EnableDatabaseInsightRequest request) {
        Objects.requireNonNull(
                request.getEnableDatabaseInsightDetails(),
                "enableDatabaseInsightDetails is required");

        Validate.notBlank(request.getDatabaseInsightId(), "databaseInsightId must not be blank");

        return clientCall(request, EnableDatabaseInsightResponse::builder)
                .logger(LOG, "enableDatabaseInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "EnableDatabaseInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/EnableDatabaseInsight")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableDatabaseInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam(request.getDatabaseInsightId())
                .appendPathParam("actions")
                .appendPathParam("enable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableDatabaseInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableDatabaseInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EnableExadataInsightResponse enableExadataInsight(EnableExadataInsightRequest request) {
        Objects.requireNonNull(
                request.getEnableExadataInsightDetails(),
                "enableExadataInsightDetails is required");

        Validate.notBlank(request.getExadataInsightId(), "exadataInsightId must not be blank");

        return clientCall(request, EnableExadataInsightResponse::builder)
                .logger(LOG, "enableExadataInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "EnableExadataInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/EnableExadataInsight")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExadataInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam(request.getExadataInsightId())
                .appendPathParam("actions")
                .appendPathParam("enable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExadataInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableExadataInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EnableHostInsightResponse enableHostInsight(EnableHostInsightRequest request) {
        Objects.requireNonNull(
                request.getEnableHostInsightDetails(), "enableHostInsightDetails is required");

        Validate.notBlank(request.getHostInsightId(), "hostInsightId must not be blank");

        return clientCall(request, EnableHostInsightResponse::builder)
                .logger(LOG, "enableHostInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "EnableHostInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/EnableHostInsight")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableHostInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam(request.getHostInsightId())
                .appendPathParam("actions")
                .appendPathParam("enable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", EnableHostInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableHostInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAwrDatabaseReportResponse getAwrDatabaseReport(GetAwrDatabaseReportRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        return clientCall(request, GetAwrDatabaseReportResponse::builder)
                .logger(LOG, "getAwrDatabaseReport")
                .serviceDetails(
                        "OperationsInsights",
                        "GetAwrDatabaseReport",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/GetAwrDatabaseReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAwrDatabaseReportRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseReport")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendEnumQueryParam("reportType", request.getReportType())
                .appendEnumQueryParam("reportFormat", request.getReportFormat())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseReport.class,
                        GetAwrDatabaseReportResponse.Builder::awrDatabaseReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetAwrDatabaseReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAwrDatabaseSqlReportResponse getAwrDatabaseSqlReport(
            GetAwrDatabaseSqlReportRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        Objects.requireNonNull(request.getSqlId(), "sqlId is required");

        return clientCall(request, GetAwrDatabaseSqlReportResponse::builder)
                .logger(LOG, "getAwrDatabaseSqlReport")
                .serviceDetails(
                        "OperationsInsights",
                        "GetAwrDatabaseSqlReport",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/GetAwrDatabaseSqlReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAwrDatabaseSqlReportRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseSqlReport")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("sqlId", request.getSqlId())
                .appendEnumQueryParam("reportFormat", request.getReportFormat())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseSqlReport.class,
                        GetAwrDatabaseSqlReportResponse.Builder::awrDatabaseSqlReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetAwrDatabaseSqlReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAwrHubResponse getAwrHub(GetAwrHubRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");

        return clientCall(request, GetAwrHubResponse::builder)
                .logger(LOG, "getAwrHub")
                .serviceDetails(
                        "OperationsInsights",
                        "GetAwrHub",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/GetAwrHub")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAwrHubRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrHub.class, GetAwrHubResponse.Builder::awrHub)
                .handleResponseHeaderString("etag", GetAwrHubResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAwrHubResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAwrReportResponse getAwrReport(GetAwrReportRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        return clientCall(request, GetAwrReportResponse::builder)
                .logger(LOG, "getAwrReport")
                .serviceDetails(
                        "OperationsInsights",
                        "GetAwrReport",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/GetAwrReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAwrReportRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrReport")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendEnumQueryParam("reportFormat", request.getReportFormat())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrReport.class,
                        GetAwrReportResponse.Builder::awrReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetAwrReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDatabaseInsightResponse getDatabaseInsight(GetDatabaseInsightRequest request) {

        Validate.notBlank(request.getDatabaseInsightId(), "databaseInsightId must not be blank");

        return clientCall(request, GetDatabaseInsightResponse::builder)
                .logger(LOG, "getDatabaseInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "GetDatabaseInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/GetDatabaseInsight")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam(request.getDatabaseInsightId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.DatabaseInsight.class,
                        GetDatabaseInsightResponse.Builder::databaseInsight)
                .handleResponseHeaderString("etag", GetDatabaseInsightResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetEnterpriseManagerBridgeResponse getEnterpriseManagerBridge(
            GetEnterpriseManagerBridgeRequest request) {

        Validate.notBlank(
                request.getEnterpriseManagerBridgeId(),
                "enterpriseManagerBridgeId must not be blank");

        return clientCall(request, GetEnterpriseManagerBridgeResponse::builder)
                .logger(LOG, "getEnterpriseManagerBridge")
                .serviceDetails(
                        "OperationsInsights",
                        "GetEnterpriseManagerBridge",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/GetEnterpriseManagerBridge")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEnterpriseManagerBridgeRequest::builder)
                .basePath("/20200630")
                .appendPathParam("enterpriseManagerBridges")
                .appendPathParam(request.getEnterpriseManagerBridgeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.EnterpriseManagerBridge.class,
                        GetEnterpriseManagerBridgeResponse.Builder::enterpriseManagerBridge)
                .handleResponseHeaderString(
                        "etag", GetEnterpriseManagerBridgeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEnterpriseManagerBridgeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetExadataInsightResponse getExadataInsight(GetExadataInsightRequest request) {

        Validate.notBlank(request.getExadataInsightId(), "exadataInsightId must not be blank");

        return clientCall(request, GetExadataInsightResponse::builder)
                .logger(LOG, "getExadataInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "GetExadataInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/GetExadataInsight")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExadataInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam(request.getExadataInsightId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.ExadataInsight.class,
                        GetExadataInsightResponse.Builder::exadataInsight)
                .handleResponseHeaderString("etag", GetExadataInsightResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExadataInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetHostInsightResponse getHostInsight(GetHostInsightRequest request) {

        Validate.notBlank(request.getHostInsightId(), "hostInsightId must not be blank");

        return clientCall(request, GetHostInsightResponse::builder)
                .logger(LOG, "getHostInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "GetHostInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/GetHostInsight")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHostInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam(request.getHostInsightId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.HostInsight.class,
                        GetHostInsightResponse.Builder::hostInsight)
                .handleResponseHeaderString("etag", GetHostInsightResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetHostInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetNewsReportResponse getNewsReport(GetNewsReportRequest request) {

        Validate.notBlank(request.getNewsReportId(), "newsReportId must not be blank");

        return clientCall(request, GetNewsReportResponse::builder)
                .logger(LOG, "getNewsReport")
                .serviceDetails(
                        "OperationsInsights",
                        "GetNewsReport",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/NewsReports/GetNewsReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNewsReportRequest::builder)
                .basePath("/20200630")
                .appendPathParam("newsReports")
                .appendPathParam(request.getNewsReportId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.NewsReport.class,
                        GetNewsReportResponse.Builder::newsReport)
                .handleResponseHeaderString("etag", GetNewsReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNewsReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetOperationsInsightsPrivateEndpointResponse getOperationsInsightsPrivateEndpoint(
            GetOperationsInsightsPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsPrivateEndpointId(),
                "operationsInsightsPrivateEndpointId must not be blank");

        return clientCall(request, GetOperationsInsightsPrivateEndpointResponse::builder)
                .logger(LOG, "getOperationsInsightsPrivateEndpoint")
                .serviceDetails(
                        "OperationsInsights",
                        "GetOperationsInsightsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/GetOperationsInsightsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOperationsInsightsPrivateEndpointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsPrivateEndpoints")
                .appendPathParam(request.getOperationsInsightsPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpoint.class,
                        GetOperationsInsightsPrivateEndpointResponse.Builder
                                ::operationsInsightsPrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", GetOperationsInsightsPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOperationsInsightsPrivateEndpointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetOperationsInsightsWarehouseResponse getOperationsInsightsWarehouse(
            GetOperationsInsightsWarehouseRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsWarehouseId(),
                "operationsInsightsWarehouseId must not be blank");

        return clientCall(request, GetOperationsInsightsWarehouseResponse::builder)
                .logger(LOG, "getOperationsInsightsWarehouse")
                .serviceDetails(
                        "OperationsInsights",
                        "GetOperationsInsightsWarehouse",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/GetOperationsInsightsWarehouse")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOperationsInsightsWarehouseRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouses")
                .appendPathParam(request.getOperationsInsightsWarehouseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.OperationsInsightsWarehouse.class,
                        GetOperationsInsightsWarehouseResponse.Builder::operationsInsightsWarehouse)
                .handleResponseHeaderString(
                        "etag", GetOperationsInsightsWarehouseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOperationsInsightsWarehouseResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetOperationsInsightsWarehouseUserResponse getOperationsInsightsWarehouseUser(
            GetOperationsInsightsWarehouseUserRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsWarehouseUserId(),
                "operationsInsightsWarehouseUserId must not be blank");

        return clientCall(request, GetOperationsInsightsWarehouseUserResponse::builder)
                .logger(LOG, "getOperationsInsightsWarehouseUser")
                .serviceDetails(
                        "OperationsInsights",
                        "GetOperationsInsightsWarehouseUser",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouseUsers/GetOperationsInsightsWarehouseUser")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOperationsInsightsWarehouseUserRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouseUsers")
                .appendPathParam(request.getOperationsInsightsWarehouseUserId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUser.class,
                        GetOperationsInsightsWarehouseUserResponse.Builder
                                ::operationsInsightsWarehouseUser)
                .handleResponseHeaderString(
                        "etag", GetOperationsInsightsWarehouseUserResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOperationsInsightsWarehouseUserResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetOpsiConfigurationResponse getOpsiConfiguration(GetOpsiConfigurationRequest request) {

        Validate.notBlank(
                request.getOpsiConfigurationId(), "opsiConfigurationId must not be blank");

        return clientCall(request, GetOpsiConfigurationResponse::builder)
                .logger(LOG, "getOpsiConfiguration")
                .serviceDetails(
                        "OperationsInsights",
                        "GetOpsiConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiConfigurations/GetOpsiConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOpsiConfigurationRequest::builder)
                .basePath("/20200630")
                .appendPathParam("opsiConfigurations")
                .appendPathParam(request.getOpsiConfigurationId())
                .appendListQueryParam(
                        "opsiConfigField",
                        request.getOpsiConfigField(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "configItemCustomStatus",
                        request.getConfigItemCustomStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "configItemsApplicableContext",
                        request.getConfigItemsApplicableContext(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "configItemField",
                        request.getConfigItemField(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.OpsiConfiguration.class,
                        GetOpsiConfigurationResponse.Builder::opsiConfiguration)
                .handleResponseHeaderString("etag", GetOpsiConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOpsiConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetOpsiDataObjectResponse getOpsiDataObject(GetOpsiDataObjectRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(
                request.getOpsiDataObjectIdentifier(),
                "opsiDataObjectIdentifier must not be blank");

        return clientCall(request, GetOpsiDataObjectResponse::builder)
                .logger(LOG, "getOpsiDataObject")
                .serviceDetails(
                        "OperationsInsights",
                        "GetOpsiDataObject",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiDataObjects/GetOpsiDataObject")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOpsiDataObjectRequest::builder)
                .basePath("/20200630")
                .appendPathParam("opsiDataObjects")
                .appendPathParam(request.getOpsiDataObjectIdentifier())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.OpsiDataObject.class,
                        GetOpsiDataObjectResponse.Builder::opsiDataObject)
                .handleResponseHeaderString(
                        "opc-request-id", GetOpsiDataObjectResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "OperationsInsights",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/WorkRequests/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200630")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderBigDecimal(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public IngestAddmReportsResponse ingestAddmReports(IngestAddmReportsRequest request) {
        Objects.requireNonNull(
                request.getIngestAddmReportsDetails(), "ingestAddmReportsDetails is required");

        return clientCall(request, IngestAddmReportsResponse::builder)
                .logger(LOG, "ingestAddmReports")
                .serviceDetails(
                        "OperationsInsights",
                        "IngestAddmReports",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestAddmReports")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestAddmReportsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("actions")
                .appendPathParam("ingestAddmReports")
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.IngestAddmReportsResponseDetails.class,
                        IngestAddmReportsResponse.Builder::ingestAddmReportsResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", IngestAddmReportsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IngestAddmReportsResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public IngestDatabaseConfigurationResponse ingestDatabaseConfiguration(
            IngestDatabaseConfigurationRequest request) {
        Objects.requireNonNull(
                request.getIngestDatabaseConfigurationDetails(),
                "ingestDatabaseConfigurationDetails is required");

        return clientCall(request, IngestDatabaseConfigurationResponse::builder)
                .logger(LOG, "ingestDatabaseConfiguration")
                .serviceDetails(
                        "OperationsInsights",
                        "IngestDatabaseConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestDatabaseConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestDatabaseConfigurationRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("actions")
                .appendPathParam("ingestDatabaseConfiguration")
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.IngestDatabaseConfigurationResponseDetails.class,
                        IngestDatabaseConfigurationResponse.Builder
                                ::ingestDatabaseConfigurationResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", IngestDatabaseConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", IngestDatabaseConfigurationResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public IngestHostConfigurationResponse ingestHostConfiguration(
            IngestHostConfigurationRequest request) {
        Objects.requireNonNull(request.getId(), "id is required");

        Objects.requireNonNull(
                request.getIngestHostConfigurationDetails(),
                "ingestHostConfigurationDetails is required");

        return clientCall(request, IngestHostConfigurationResponse::builder)
                .logger(LOG, "ingestHostConfiguration")
                .serviceDetails(
                        "OperationsInsights",
                        "IngestHostConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/IngestHostConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestHostConfigurationRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("actions")
                .appendPathParam("ingestHostConfiguration")
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.IngestHostConfigurationResponseDetails.class,
                        IngestHostConfigurationResponse.Builder
                                ::ingestHostConfigurationResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", IngestHostConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IngestHostConfigurationResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public IngestHostMetricsResponse ingestHostMetrics(IngestHostMetricsRequest request) {
        Objects.requireNonNull(request.getId(), "id is required");

        Objects.requireNonNull(
                request.getIngestHostMetricsDetails(), "ingestHostMetricsDetails is required");

        return clientCall(request, IngestHostMetricsResponse::builder)
                .logger(LOG, "ingestHostMetrics")
                .serviceDetails(
                        "OperationsInsights",
                        "IngestHostMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/IngestHostMetrics")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestHostMetricsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("actions")
                .appendPathParam("ingestHostMetrics")
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.IngestHostMetricsResponseDetails.class,
                        IngestHostMetricsResponse.Builder::ingestHostMetricsResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", IngestHostMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IngestHostMetricsResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public IngestSqlBucketResponse ingestSqlBucket(IngestSqlBucketRequest request) {
        Objects.requireNonNull(
                request.getIngestSqlBucketDetails(), "ingestSqlBucketDetails is required");

        return clientCall(request, IngestSqlBucketResponse::builder)
                .logger(LOG, "ingestSqlBucket")
                .serviceDetails(
                        "OperationsInsights",
                        "IngestSqlBucket",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestSqlBucket")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestSqlBucketRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("actions")
                .appendPathParam("ingestSqlBucket")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.IngestSqlBucketResponseDetails.class,
                        IngestSqlBucketResponse.Builder::ingestSqlBucketResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", IngestSqlBucketResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IngestSqlBucketResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public IngestSqlPlanLinesResponse ingestSqlPlanLines(IngestSqlPlanLinesRequest request) {
        Objects.requireNonNull(
                request.getIngestSqlPlanLinesDetails(), "ingestSqlPlanLinesDetails is required");

        return clientCall(request, IngestSqlPlanLinesResponse::builder)
                .logger(LOG, "ingestSqlPlanLines")
                .serviceDetails(
                        "OperationsInsights",
                        "IngestSqlPlanLines",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestSqlPlanLines")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestSqlPlanLinesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("actions")
                .appendPathParam("ingestSqlPlanLines")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.IngestSqlPlanLinesResponseDetails.class,
                        IngestSqlPlanLinesResponse.Builder::ingestSqlPlanLinesResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", IngestSqlPlanLinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IngestSqlPlanLinesResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public IngestSqlStatsResponse ingestSqlStats(IngestSqlStatsRequest request) {
        Objects.requireNonNull(
                request.getIngestSqlStatsDetails(), "ingestSqlStatsDetails is required");

        return clientCall(request, IngestSqlStatsResponse::builder)
                .logger(LOG, "ingestSqlStats")
                .serviceDetails(
                        "OperationsInsights",
                        "IngestSqlStats",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestSqlStats")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestSqlStatsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("actions")
                .appendPathParam("ingestSqlStatsMetric")
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.IngestSqlStatsResponseDetails.class,
                        IngestSqlStatsResponse.Builder::ingestSqlStatsResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", IngestSqlStatsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IngestSqlStatsResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public IngestSqlTextResponse ingestSqlText(IngestSqlTextRequest request) {
        Objects.requireNonNull(
                request.getIngestSqlTextDetails(), "ingestSqlTextDetails is required");

        return clientCall(request, IngestSqlTextResponse::builder)
                .logger(LOG, "ingestSqlText")
                .serviceDetails(
                        "OperationsInsights",
                        "IngestSqlText",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestSqlText")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestSqlTextRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("actions")
                .appendPathParam("ingestSqlText")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.IngestSqlTextResponseDetails.class,
                        IngestSqlTextResponse.Builder::ingestSqlTextResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", IngestSqlTextResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IngestSqlTextResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAddmDbFindingCategoriesResponse listAddmDbFindingCategories(
            ListAddmDbFindingCategoriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAddmDbFindingCategoriesResponse::builder)
                .logger(LOG, "listAddmDbFindingCategories")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAddmDbFindingCategories",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListAddmDbFindingCategories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAddmDbFindingCategoriesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbFindingCategories")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbFindingCategoryCollection.class,
                        ListAddmDbFindingCategoriesResponse.Builder
                                ::addmDbFindingCategoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAddmDbFindingCategoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAddmDbFindingCategoriesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAddmDbFindingsTimeSeriesResponse listAddmDbFindingsTimeSeries(
            ListAddmDbFindingsTimeSeriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAddmDbFindingsTimeSeriesResponse::builder)
                .logger(LOG, "listAddmDbFindingsTimeSeries")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAddmDbFindingsTimeSeries",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListAddmDbFindingsTimeSeries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAddmDbFindingsTimeSeriesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbFindingsTimeSeries")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("categoryName", request.getCategoryName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbFindingsTimeSeriesCollection.class,
                        ListAddmDbFindingsTimeSeriesResponse.Builder
                                ::addmDbFindingsTimeSeriesCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAddmDbFindingsTimeSeriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAddmDbFindingsTimeSeriesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAddmDbParameterCategoriesResponse listAddmDbParameterCategories(
            ListAddmDbParameterCategoriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAddmDbParameterCategoriesResponse::builder)
                .logger(LOG, "listAddmDbParameterCategories")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAddmDbParameterCategories",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListAddmDbParameterCategories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAddmDbParameterCategoriesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbParameterCategories")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbParameterCategoryCollection.class,
                        ListAddmDbParameterCategoriesResponse.Builder
                                ::addmDbParameterCategoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAddmDbParameterCategoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAddmDbParameterCategoriesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAddmDbRecommendationCategoriesResponse listAddmDbRecommendationCategories(
            ListAddmDbRecommendationCategoriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAddmDbRecommendationCategoriesResponse::builder)
                .logger(LOG, "listAddmDbRecommendationCategories")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAddmDbRecommendationCategories",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListAddmDbRecommendationCategories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAddmDbRecommendationCategoriesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbRecommendationCategories")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbRecommendationCategoryCollection.class,
                        ListAddmDbRecommendationCategoriesResponse.Builder
                                ::addmDbRecommendationCategoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAddmDbRecommendationCategoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAddmDbRecommendationCategoriesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAddmDbRecommendationsTimeSeriesResponse listAddmDbRecommendationsTimeSeries(
            ListAddmDbRecommendationsTimeSeriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAddmDbRecommendationsTimeSeriesResponse::builder)
                .logger(LOG, "listAddmDbRecommendationsTimeSeries")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAddmDbRecommendationsTimeSeries",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListAddmDbRecommendationsTimeSeries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAddmDbRecommendationsTimeSeriesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbRecommendationsTimeSeries")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("categoryName", request.getCategoryName())
                .appendQueryParam("sqlIdentifier", request.getSqlIdentifier())
                .appendQueryParam("ownerOrNameContains", request.getOwnerOrNameContains())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbRecommendationsTimeSeriesCollection.class,
                        ListAddmDbRecommendationsTimeSeriesResponse.Builder
                                ::addmDbRecommendationsTimeSeriesCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAddmDbRecommendationsTimeSeriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAddmDbRecommendationsTimeSeriesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAddmDbsResponse listAddmDbs(ListAddmDbsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAddmDbsResponse::builder)
                .logger(LOG, "listAddmDbs")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAddmDbs",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListAddmDbs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAddmDbsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbCollection.class,
                        ListAddmDbsResponse.Builder::addmDbCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAddmDbsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAddmDbsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAwrDatabaseSnapshotsResponse listAwrDatabaseSnapshots(
            ListAwrDatabaseSnapshotsRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        return clientCall(request, ListAwrDatabaseSnapshotsResponse::builder)
                .logger(LOG, "listAwrDatabaseSnapshots")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAwrDatabaseSnapshots",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/ListAwrDatabaseSnapshots")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAwrDatabaseSnapshotsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseSnapshots")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseSnapshotCollection.class,
                        ListAwrDatabaseSnapshotsResponse.Builder::awrDatabaseSnapshotCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAwrDatabaseSnapshotsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAwrDatabaseSnapshotsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAwrDatabasesResponse listAwrDatabases(ListAwrDatabasesRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");

        return clientCall(request, ListAwrDatabasesResponse::builder)
                .logger(LOG, "listAwrDatabases")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAwrDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/ListAwrDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAwrDatabasesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabases")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseCollection.class,
                        ListAwrDatabasesResponse.Builder::awrDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAwrDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAwrDatabasesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAwrHubsResponse listAwrHubs(ListAwrHubsRequest request) {
        Objects.requireNonNull(
                request.getOperationsInsightsWarehouseId(),
                "operationsInsightsWarehouseId is required");

        return clientCall(request, ListAwrHubsResponse::builder)
                .logger(LOG, "listAwrHubs")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAwrHubs",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/ListAwrHubs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAwrHubsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam(
                        "operationsInsightsWarehouseId", request.getOperationsInsightsWarehouseId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrHubSummaryCollection.class,
                        ListAwrHubsResponse.Builder::awrHubSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAwrHubsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAwrHubsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAwrSnapshotsResponse listAwrSnapshots(ListAwrSnapshotsRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        return clientCall(request, ListAwrSnapshotsResponse::builder)
                .logger(LOG, "listAwrSnapshots")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAwrSnapshots",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/ListAwrSnapshots")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAwrSnapshotsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrSnapshots")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrSnapshotCollection.class,
                        ListAwrSnapshotsResponse.Builder::awrSnapshotCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAwrSnapshotsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAwrSnapshotsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDatabaseConfigurationsResponse listDatabaseConfigurations(
            ListDatabaseConfigurationsRequest request) {

        return clientCall(request, ListDatabaseConfigurationsResponse::builder)
                .logger(LOG, "listDatabaseConfigurations")
                .serviceDetails(
                        "OperationsInsights",
                        "ListDatabaseConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListDatabaseConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseConfigurationsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("databaseConfigurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "enterpriseManagerBridgeId", request.getEnterpriseManagerBridgeId())
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseType",
                        request.getDatabaseType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.DatabaseConfigurationCollection.class,
                        ListDatabaseConfigurationsResponse.Builder::databaseConfigurationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabaseConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListDatabaseConfigurationsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseConfigurationsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDatabaseInsightsResponse listDatabaseInsights(ListDatabaseInsightsRequest request) {

        return clientCall(request, ListDatabaseInsightsResponse::builder)
                .logger(LOG, "listDatabaseInsights")
                .serviceDetails(
                        "OperationsInsights",
                        "ListDatabaseInsights",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListDatabaseInsights")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseInsightsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "enterpriseManagerBridgeId", request.getEnterpriseManagerBridgeId())
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseType",
                        request.getDatabaseType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("exadataInsightId", request.getExadataInsightId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("opsiPrivateEndpointId", request.getOpsiPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.DatabaseInsightsCollection.class,
                        ListDatabaseInsightsResponse.Builder::databaseInsightsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabaseInsightsResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDatabaseInsightsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseInsightsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListEnterpriseManagerBridgesResponse listEnterpriseManagerBridges(
            ListEnterpriseManagerBridgesRequest request) {

        return clientCall(request, ListEnterpriseManagerBridgesResponse::builder)
                .logger(LOG, "listEnterpriseManagerBridges")
                .serviceDetails(
                        "OperationsInsights",
                        "ListEnterpriseManagerBridges",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/ListEnterpriseManagerBridges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEnterpriseManagerBridgesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("enterpriseManagerBridges")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.EnterpriseManagerBridgeCollection.class,
                        ListEnterpriseManagerBridgesResponse.Builder
                                ::enterpriseManagerBridgeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListEnterpriseManagerBridgesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEnterpriseManagerBridgesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListExadataConfigurationsResponse listExadataConfigurations(
            ListExadataConfigurationsRequest request) {

        return clientCall(request, ListExadataConfigurationsResponse::builder)
                .logger(LOG, "listExadataConfigurations")
                .serviceDetails(
                        "OperationsInsights",
                        "ListExadataConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/ListExadataConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExadataConfigurationsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam("exadataConfigurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.ExadataConfigurationCollection.class,
                        ListExadataConfigurationsResponse.Builder::exadataConfigurationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExadataConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListExadataConfigurationsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-next-page", ListExadataConfigurationsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListExadataInsightsResponse listExadataInsights(ListExadataInsightsRequest request) {

        return clientCall(request, ListExadataInsightsResponse::builder)
                .logger(LOG, "listExadataInsights")
                .serviceDetails(
                        "OperationsInsights",
                        "ListExadataInsights",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/ListExadataInsights")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExadataInsightsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "enterpriseManagerBridgeId", request.getEnterpriseManagerBridgeId())
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.ExadataInsightSummaryCollection.class,
                        ListExadataInsightsResponse.Builder::exadataInsightSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExadataInsightsResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListExadataInsightsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-next-page", ListExadataInsightsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListHostConfigurationsResponse listHostConfigurations(
            ListHostConfigurationsRequest request) {

        return clientCall(request, ListHostConfigurationsResponse::builder)
                .logger(LOG, "listHostConfigurations")
                .serviceDetails(
                        "OperationsInsights",
                        "ListHostConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ListHostConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHostConfigurationsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("hostConfigurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "enterpriseManagerBridgeId", request.getEnterpriseManagerBridgeId())
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostId", request.getHostId())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.HostConfigurationCollection.class,
                        ListHostConfigurationsResponse.Builder::hostConfigurationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHostConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListHostConfigurationsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-next-page", ListHostConfigurationsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListHostInsightsResponse listHostInsights(ListHostInsightsRequest request) {

        return clientCall(request, ListHostInsightsResponse::builder)
                .logger(LOG, "listHostInsights")
                .serviceDetails(
                        "OperationsInsights",
                        "ListHostInsights",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ListHostInsights")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHostInsightsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam(
                        "enterpriseManagerBridgeId", request.getEnterpriseManagerBridgeId())
                .appendQueryParam("exadataInsightId", request.getExadataInsightId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.HostInsightSummaryCollection.class,
                        ListHostInsightsResponse.Builder::hostInsightSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHostInsightsResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListHostInsightsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-next-page", ListHostInsightsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListHostedEntitiesResponse listHostedEntities(ListHostedEntitiesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getId(), "id is required");

        return clientCall(request, ListHostedEntitiesResponse::builder)
                .logger(LOG, "listHostedEntities")
                .serviceDetails(
                        "OperationsInsights",
                        "ListHostedEntities",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ListHostedEntities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHostedEntitiesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("hostedEntities")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("id", request.getId())
                .appendQueryParam("exadataInsightId", request.getExadataInsightId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostId", request.getHostId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.HostedEntityCollection.class,
                        ListHostedEntitiesResponse.Builder::hostedEntityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHostedEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHostedEntitiesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListImportableAgentEntitiesResponse listImportableAgentEntities(
            ListImportableAgentEntitiesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListImportableAgentEntitiesResponse::builder)
                .logger(LOG, "listImportableAgentEntities")
                .serviceDetails(
                        "OperationsInsights",
                        "ListImportableAgentEntities",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ListImportableAgentEntities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListImportableAgentEntitiesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("importableAgentEntities")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.ImportableAgentEntitySummaryCollection.class,
                        ListImportableAgentEntitiesResponse.Builder
                                ::importableAgentEntitySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListImportableAgentEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListImportableAgentEntitiesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListImportableComputeEntitiesResponse listImportableComputeEntities(
            ListImportableComputeEntitiesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListImportableComputeEntitiesResponse::builder)
                .logger(LOG, "listImportableComputeEntities")
                .serviceDetails(
                        "OperationsInsights",
                        "ListImportableComputeEntities",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ListImportableComputeEntities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListImportableComputeEntitiesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("importableComputeEntities")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.ImportableComputeEntitySummaryCollection.class,
                        ListImportableComputeEntitiesResponse.Builder
                                ::importableComputeEntitySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListImportableComputeEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListImportableComputeEntitiesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListImportableEnterpriseManagerEntitiesResponse listImportableEnterpriseManagerEntities(
            ListImportableEnterpriseManagerEntitiesRequest request) {

        Validate.notBlank(
                request.getEnterpriseManagerBridgeId(),
                "enterpriseManagerBridgeId must not be blank");

        return clientCall(request, ListImportableEnterpriseManagerEntitiesResponse::builder)
                .logger(LOG, "listImportableEnterpriseManagerEntities")
                .serviceDetails(
                        "OperationsInsights",
                        "ListImportableEnterpriseManagerEntities",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/ListImportableEnterpriseManagerEntities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListImportableEnterpriseManagerEntitiesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("enterpriseManagerBridges")
                .appendPathParam(request.getEnterpriseManagerBridgeId())
                .appendPathParam("importableEnterpriseManagerEntities")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "enterpriseManagerEntityType",
                        request.getEnterpriseManagerEntityType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "enterpriseManagerIdentifier", request.getEnterpriseManagerIdentifier())
                .appendQueryParam(
                        "enterpriseManagerParentEntityIdentifier",
                        request.getEnterpriseManagerParentEntityIdentifier())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.ImportableEnterpriseManagerEntityCollection.class,
                        ListImportableEnterpriseManagerEntitiesResponse.Builder
                                ::importableEnterpriseManagerEntityCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListImportableEnterpriseManagerEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListImportableEnterpriseManagerEntitiesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListNewsReportsResponse listNewsReports(ListNewsReportsRequest request) {

        return clientCall(request, ListNewsReportsResponse::builder)
                .logger(LOG, "listNewsReports")
                .serviceDetails(
                        "OperationsInsights",
                        "ListNewsReports",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/NewsReport/ListNewsReports")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNewsReportsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("newsReports")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("newsReportId", request.getNewsReportId())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.NewsReportCollection.class,
                        ListNewsReportsResponse.Builder::newsReportCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNewsReportsResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListNewsReportsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-next-page", ListNewsReportsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListOperationsInsightsPrivateEndpointsResponse listOperationsInsightsPrivateEndpoints(
            ListOperationsInsightsPrivateEndpointsRequest request) {

        return clientCall(request, ListOperationsInsightsPrivateEndpointsResponse::builder)
                .logger(LOG, "listOperationsInsightsPrivateEndpoints")
                .serviceDetails(
                        "OperationsInsights",
                        "ListOperationsInsightsPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/ListOperationsInsightsPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOperationsInsightsPrivateEndpointsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsPrivateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("opsiPrivateEndpointId", request.getOpsiPrivateEndpointId())
                .appendQueryParam("isUsedForRacDbs", request.getIsUsedForRacDbs())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointCollection.class,
                        ListOperationsInsightsPrivateEndpointsResponse.Builder
                                ::operationsInsightsPrivateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOperationsInsightsPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOperationsInsightsPrivateEndpointsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListOperationsInsightsWarehouseUsersResponse listOperationsInsightsWarehouseUsers(
            ListOperationsInsightsWarehouseUsersRequest request) {
        Objects.requireNonNull(
                request.getOperationsInsightsWarehouseId(),
                "operationsInsightsWarehouseId is required");

        return clientCall(request, ListOperationsInsightsWarehouseUsersResponse::builder)
                .logger(LOG, "listOperationsInsightsWarehouseUsers")
                .serviceDetails(
                        "OperationsInsights",
                        "ListOperationsInsightsWarehouseUsers",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouseUsers/ListOperationsInsightsWarehouseUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOperationsInsightsWarehouseUsersRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouseUsers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam(
                        "operationsInsightsWarehouseId", request.getOperationsInsightsWarehouseId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserSummaryCollection
                                .class,
                        ListOperationsInsightsWarehouseUsersResponse.Builder
                                ::operationsInsightsWarehouseUserSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOperationsInsightsWarehouseUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOperationsInsightsWarehouseUsersResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListOperationsInsightsWarehousesResponse listOperationsInsightsWarehouses(
            ListOperationsInsightsWarehousesRequest request) {

        return clientCall(request, ListOperationsInsightsWarehousesResponse::builder)
                .logger(LOG, "listOperationsInsightsWarehouses")
                .serviceDetails(
                        "OperationsInsights",
                        "ListOperationsInsightsWarehouses",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/ListOperationsInsightsWarehouses")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOperationsInsightsWarehousesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouses")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.OperationsInsightsWarehouseSummaryCollection
                                .class,
                        ListOperationsInsightsWarehousesResponse.Builder
                                ::operationsInsightsWarehouseSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOperationsInsightsWarehousesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOperationsInsightsWarehousesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListOpsiConfigurationsResponse listOpsiConfigurations(
            ListOpsiConfigurationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOpsiConfigurationsResponse::builder)
                .logger(LOG, "listOpsiConfigurations")
                .serviceDetails(
                        "OperationsInsights",
                        "ListOpsiConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiConfigurations/ListOpsiConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOpsiConfigurationsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("opsiConfigurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "opsiConfigType",
                        request.getOpsiConfigType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.OpsiConfigurationsCollection.class,
                        ListOpsiConfigurationsResponse.Builder::opsiConfigurationsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOpsiConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOpsiConfigurationsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListOpsiDataObjectsResponse listOpsiDataObjects(ListOpsiDataObjectsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOpsiDataObjectsResponse::builder)
                .logger(LOG, "listOpsiDataObjects")
                .serviceDetails(
                        "OperationsInsights",
                        "ListOpsiDataObjects",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiDataObjects/ListOpsiDataObjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOpsiDataObjectsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("opsiDataObjects")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "dataObjectType",
                        request.getDataObjectType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("groupName", request.getGroupName())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.OpsiDataObjectsCollection.class,
                        ListOpsiDataObjectsResponse.Builder::opsiDataObjectsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOpsiDataObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOpsiDataObjectsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSqlPlansResponse listSqlPlans(ListSqlPlansRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSqlIdentifier(), "sqlIdentifier is required");

        Objects.requireNonNull(request.getPlanHash(), "planHash is required");

        return clientCall(request, ListSqlPlansResponse::builder)
                .logger(LOG, "listSqlPlans")
                .serviceDetails(
                        "OperationsInsights",
                        "ListSqlPlans",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListSqlPlans")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlPlansRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("sqlPlans")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("sqlIdentifier", request.getSqlIdentifier())
                .appendListQueryParam(
                        "planHash",
                        request.getPlanHash(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SqlPlanCollection.class,
                        ListSqlPlansResponse.Builder::sqlPlanCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlPlansResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlPlansResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSqlSearchesResponse listSqlSearches(ListSqlSearchesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSqlIdentifier(), "sqlIdentifier is required");

        return clientCall(request, ListSqlSearchesResponse::builder)
                .logger(LOG, "listSqlSearches")
                .serviceDetails(
                        "OperationsInsights",
                        "ListSqlSearches",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListSqlSearches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlSearchesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("sqlSearches")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("sqlIdentifier", request.getSqlIdentifier())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SqlSearchCollection.class,
                        ListSqlSearchesResponse.Builder::sqlSearchCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlSearchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlSearchesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSqlTextsResponse listSqlTexts(ListSqlTextsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSqlIdentifier(), "sqlIdentifier is required");

        return clientCall(request, ListSqlTextsResponse::builder)
                .logger(LOG, "listSqlTexts")
                .serviceDetails(
                        "OperationsInsights",
                        "ListSqlTexts",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListSqlTexts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlTextsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("sqlTexts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "sqlIdentifier",
                        request.getSqlIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SqlTextCollection.class,
                        ListSqlTextsResponse.Builder::sqlTextCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlTextsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlTextsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWarehouseDataObjectsResponse listWarehouseDataObjects(
            ListWarehouseDataObjectsRequest request) {

        Validate.notBlank(request.getWarehouseType().getValue(), "warehouseType must not be blank");

        Validate.notBlank(request.getWarehouseId(), "warehouseId must not be blank");

        return clientCall(request, ListWarehouseDataObjectsResponse::builder)
                .logger(LOG, "listWarehouseDataObjects")
                .serviceDetails(
                        "OperationsInsights",
                        "ListWarehouseDataObjects",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiWarehouseDataObjects/ListWarehouseDataObjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWarehouseDataObjectsRequest::builder)
                .basePath("/20200630")
                .appendPathParam(request.getWarehouseType().getValue())
                .appendPathParam(request.getWarehouseId())
                .appendPathParam("dataObjects")
                .appendListQueryParam(
                        "dataObjectType",
                        request.getDataObjectType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendQueryParam("owner", request.getOwner())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "summaryField",
                        request.getSummaryField(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.WarehouseDataObjectCollection.class,
                        ListWarehouseDataObjectsResponse.Builder::warehouseDataObjectCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWarehouseDataObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWarehouseDataObjectsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "OperationsInsights",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/WorkRequests/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200630")
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
                        com.oracle.bmc.opsi.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "OperationsInsights",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/WorkRequests/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200630")
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
                        com.oracle.bmc.opsi.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "OperationsInsights",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/WorkRequests/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("workRequests")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("relatedResourceId", request.getRelatedResourceId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public QueryOpsiDataObjectDataResponse queryOpsiDataObjectData(
            QueryOpsiDataObjectDataRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getQueryOpsiDataObjectDataDetails(),
                "queryOpsiDataObjectDataDetails is required");

        return clientCall(request, QueryOpsiDataObjectDataResponse::builder)
                .logger(LOG, "queryOpsiDataObjectData")
                .serviceDetails(
                        "OperationsInsights",
                        "QueryOpsiDataObjectData",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiDataObjects/QueryOpsiDataObjectData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(QueryOpsiDataObjectDataRequest::builder)
                .basePath("/20200630")
                .appendPathParam("opsiDataObjects")
                .appendPathParam("actions")
                .appendPathParam("queryData")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.QueryDataObjectResultSetRowsCollection.class,
                        QueryOpsiDataObjectDataResponse.Builder
                                ::queryDataObjectResultSetRowsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", QueryOpsiDataObjectDataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", QueryOpsiDataObjectDataResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public QueryWarehouseDataObjectDataResponse queryWarehouseDataObjectData(
            QueryWarehouseDataObjectDataRequest request) {

        Validate.notBlank(request.getWarehouseType().getValue(), "warehouseType must not be blank");

        Validate.notBlank(request.getWarehouseId(), "warehouseId must not be blank");
        Objects.requireNonNull(
                request.getQueryWarehouseDataObjectDataDetails(),
                "queryWarehouseDataObjectDataDetails is required");

        return clientCall(request, QueryWarehouseDataObjectDataResponse::builder)
                .logger(LOG, "queryWarehouseDataObjectData")
                .serviceDetails(
                        "OperationsInsights",
                        "QueryWarehouseDataObjectData",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiWarehouseDataObjects/QueryWarehouseDataObjectData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(QueryWarehouseDataObjectDataRequest::builder)
                .basePath("/20200630")
                .appendPathParam(request.getWarehouseType().getValue())
                .appendPathParam(request.getWarehouseId())
                .appendPathParam("actions")
                .appendPathParam("queryData")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.QueryDataObjectResultSetRowsCollection.class,
                        QueryWarehouseDataObjectDataResponse.Builder
                                ::queryDataObjectResultSetRowsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        QueryWarehouseDataObjectDataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", QueryWarehouseDataObjectDataResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RotateOperationsInsightsWarehouseWalletResponse rotateOperationsInsightsWarehouseWallet(
            RotateOperationsInsightsWarehouseWalletRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsWarehouseId(),
                "operationsInsightsWarehouseId must not be blank");

        return clientCall(request, RotateOperationsInsightsWarehouseWalletResponse::builder)
                .logger(LOG, "rotateOperationsInsightsWarehouseWallet")
                .serviceDetails(
                        "OperationsInsights",
                        "RotateOperationsInsightsWarehouseWallet",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/RotateOperationsInsightsWarehouseWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateOperationsInsightsWarehouseWalletRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouses")
                .appendPathParam(request.getOperationsInsightsWarehouseId())
                .appendPathParam("actions")
                .appendPathParam("rotateWarehouseWallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateOperationsInsightsWarehouseWalletResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateOperationsInsightsWarehouseWalletResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAddmDbFindingsResponse summarizeAddmDbFindings(
            SummarizeAddmDbFindingsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, SummarizeAddmDbFindingsResponse::builder)
                .logger(LOG, "summarizeAddmDbFindings")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAddmDbFindings",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeAddmDbFindings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAddmDbFindingsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbFindings")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("categoryName", request.getCategoryName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbFindingAggregationCollection.class,
                        SummarizeAddmDbFindingsResponse.Builder::addmDbFindingAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAddmDbFindingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAddmDbFindingsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAddmDbParameterChangesResponse summarizeAddmDbParameterChanges(
            SummarizeAddmDbParameterChangesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getName(), "name is required");

        return clientCall(request, SummarizeAddmDbParameterChangesResponse::builder)
                .logger(LOG, "summarizeAddmDbParameterChanges")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAddmDbParameterChanges",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeAddmDbParameterChanges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAddmDbParameterChangesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbParameterChanges")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("valueContains", request.getValueContains())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbParameterChangeAggregationCollection.class,
                        SummarizeAddmDbParameterChangesResponse.Builder
                                ::addmDbParameterChangeAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAddmDbParameterChangesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeAddmDbParameterChangesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAddmDbParametersResponse summarizeAddmDbParameters(
            SummarizeAddmDbParametersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, SummarizeAddmDbParametersResponse::builder)
                .logger(LOG, "summarizeAddmDbParameters")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAddmDbParameters",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeAddmDbParameters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAddmDbParametersRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbParameters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("categoryName", request.getCategoryName())
                .appendQueryParam("nameOrValueContains", request.getNameOrValueContains())
                .appendEnumQueryParam("isChanged", request.getIsChanged())
                .appendEnumQueryParam("isDefault", request.getIsDefault())
                .appendEnumQueryParam("hasRecommendations", request.getHasRecommendations())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbParameterAggregationCollection.class,
                        SummarizeAddmDbParametersResponse.Builder
                                ::addmDbParameterAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAddmDbParametersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAddmDbParametersResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAddmDbRecommendationsResponse summarizeAddmDbRecommendations(
            SummarizeAddmDbRecommendationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, SummarizeAddmDbRecommendationsResponse::builder)
                .logger(LOG, "summarizeAddmDbRecommendations")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAddmDbRecommendations",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeAddmDbRecommendations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAddmDbRecommendationsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbRecommendations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("categoryName", request.getCategoryName())
                .appendQueryParam("findingIdentifier", request.getFindingIdentifier())
                .appendQueryParam("sqlIdentifier", request.getSqlIdentifier())
                .appendQueryParam("ownerOrNameContains", request.getOwnerOrNameContains())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbRecommendationAggregationCollection.class,
                        SummarizeAddmDbRecommendationsResponse.Builder
                                ::addmDbRecommendationAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAddmDbRecommendationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeAddmDbRecommendationsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAddmDbSchemaObjectsResponse summarizeAddmDbSchemaObjects(
            SummarizeAddmDbSchemaObjectsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getObjectIdentifier(), "objectIdentifier is required");

        return clientCall(request, SummarizeAddmDbSchemaObjectsResponse::builder)
                .logger(LOG, "summarizeAddmDbSchemaObjects")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAddmDbSchemaObjects",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeAddmDbSchemaObjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAddmDbSchemaObjectsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbSchemaObjects")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectIdentifier",
                        request.getObjectIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbSchemaObjectCollection.class,
                        SummarizeAddmDbSchemaObjectsResponse.Builder::addmDbSchemaObjectCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAddmDbSchemaObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAddmDbSchemaObjectsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAddmDbSqlStatementsResponse summarizeAddmDbSqlStatements(
            SummarizeAddmDbSqlStatementsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSqlIdentifier(), "sqlIdentifier is required");

        return clientCall(request, SummarizeAddmDbSqlStatementsResponse::builder)
                .logger(LOG, "summarizeAddmDbSqlStatements")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAddmDbSqlStatements",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeAddmDbSqlStatements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAddmDbSqlStatementsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("addmDbSqlStatements")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "sqlIdentifier",
                        request.getSqlIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AddmDbSqlStatementCollection.class,
                        SummarizeAddmDbSqlStatementsResponse.Builder::addmDbSqlStatementCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAddmDbSqlStatementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAddmDbSqlStatementsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAwrDatabaseCpuUsagesResponse summarizeAwrDatabaseCpuUsages(
            SummarizeAwrDatabaseCpuUsagesRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        return clientCall(request, SummarizeAwrDatabaseCpuUsagesResponse::builder)
                .logger(LOG, "summarizeAwrDatabaseCpuUsages")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAwrDatabaseCpuUsages",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrDatabaseCpuUsages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDatabaseCpuUsagesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseCpuUsages")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendEnumQueryParam("sessionType", request.getSessionType())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseCpuUsageCollection.class,
                        SummarizeAwrDatabaseCpuUsagesResponse.Builder
                                ::awrDatabaseCpuUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDatabaseCpuUsagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrDatabaseCpuUsagesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAwrDatabaseMetricsResponse summarizeAwrDatabaseMetrics(
            SummarizeAwrDatabaseMetricsRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        Objects.requireNonNull(request.getName(), "name is required");

        return clientCall(request, SummarizeAwrDatabaseMetricsResponse::builder)
                .logger(LOG, "summarizeAwrDatabaseMetrics")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAwrDatabaseMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrDatabaseMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDatabaseMetricsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseMetrics")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseMetricCollection.class,
                        SummarizeAwrDatabaseMetricsResponse.Builder::awrDatabaseMetricCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAwrDatabaseMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrDatabaseMetricsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAwrDatabaseParameterChangesResponse summarizeAwrDatabaseParameterChanges(
            SummarizeAwrDatabaseParameterChangesRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        Objects.requireNonNull(request.getName(), "name is required");

        return clientCall(request, SummarizeAwrDatabaseParameterChangesResponse::builder)
                .logger(LOG, "summarizeAwrDatabaseParameterChanges")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAwrDatabaseParameterChanges",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrDatabaseParameterChanges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDatabaseParameterChangesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseParameterChanges")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseParameterChangeCollection.class,
                        SummarizeAwrDatabaseParameterChangesResponse.Builder
                                ::awrDatabaseParameterChangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDatabaseParameterChangesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeAwrDatabaseParameterChangesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAwrDatabaseParametersResponse summarizeAwrDatabaseParameters(
            SummarizeAwrDatabaseParametersRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        return clientCall(request, SummarizeAwrDatabaseParametersResponse::builder)
                .logger(LOG, "summarizeAwrDatabaseParameters")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAwrDatabaseParameters",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrDatabaseParameters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDatabaseParametersRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseParameters")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("nameContains", request.getNameContains())
                .appendEnumQueryParam("valueChanged", request.getValueChanged())
                .appendEnumQueryParam("valueDefault", request.getValueDefault())
                .appendEnumQueryParam("valueModified", request.getValueModified())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseParameterCollection.class,
                        SummarizeAwrDatabaseParametersResponse.Builder
                                ::awrDatabaseParameterCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDatabaseParametersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeAwrDatabaseParametersResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAwrDatabaseSnapshotRangesResponse summarizeAwrDatabaseSnapshotRanges(
            SummarizeAwrDatabaseSnapshotRangesRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");

        return clientCall(request, SummarizeAwrDatabaseSnapshotRangesResponse::builder)
                .logger(LOG, "summarizeAwrDatabaseSnapshotRanges")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAwrDatabaseSnapshotRanges",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrDatabaseSnapshotRanges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDatabaseSnapshotRangesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseSnapshotRanges")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseSnapshotRangeCollection.class,
                        SummarizeAwrDatabaseSnapshotRangesResponse.Builder
                                ::awrDatabaseSnapshotRangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDatabaseSnapshotRangesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeAwrDatabaseSnapshotRangesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAwrDatabaseSysstatsResponse summarizeAwrDatabaseSysstats(
            SummarizeAwrDatabaseSysstatsRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        Objects.requireNonNull(request.getName(), "name is required");

        return clientCall(request, SummarizeAwrDatabaseSysstatsResponse::builder)
                .logger(LOG, "summarizeAwrDatabaseSysstats")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAwrDatabaseSysstats",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrDatabaseSysstats")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDatabaseSysstatsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseSysstats")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseSysstatCollection.class,
                        SummarizeAwrDatabaseSysstatsResponse.Builder::awrDatabaseSysstatCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDatabaseSysstatsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrDatabaseSysstatsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAwrDatabaseTopWaitEventsResponse summarizeAwrDatabaseTopWaitEvents(
            SummarizeAwrDatabaseTopWaitEventsRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        return clientCall(request, SummarizeAwrDatabaseTopWaitEventsResponse::builder)
                .logger(LOG, "summarizeAwrDatabaseTopWaitEvents")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAwrDatabaseTopWaitEvents",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrDatabaseTopWaitEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDatabaseTopWaitEventsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseTopWaitEvents")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendEnumQueryParam("sessionType", request.getSessionType())
                .appendQueryParam("topN", request.getTopN())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseTopWaitEventCollection.class,
                        SummarizeAwrDatabaseTopWaitEventsResponse.Builder
                                ::awrDatabaseTopWaitEventCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDatabaseTopWaitEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeAwrDatabaseTopWaitEventsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAwrDatabaseWaitEventBucketsResponse summarizeAwrDatabaseWaitEventBuckets(
            SummarizeAwrDatabaseWaitEventBucketsRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        Objects.requireNonNull(request.getName(), "name is required");

        return clientCall(request, SummarizeAwrDatabaseWaitEventBucketsResponse::builder)
                .logger(LOG, "summarizeAwrDatabaseWaitEventBuckets")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAwrDatabaseWaitEventBuckets",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrDatabaseWaitEventBuckets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDatabaseWaitEventBucketsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseWaitEventBuckets")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("numBucket", request.getNumBucket())
                .appendQueryParam("minValue", request.getMinValue())
                .appendQueryParam("maxValue", request.getMaxValue())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseWaitEventBucketCollection.class,
                        SummarizeAwrDatabaseWaitEventBucketsResponse.Builder
                                ::awrDatabaseWaitEventBucketCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDatabaseWaitEventBucketsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeAwrDatabaseWaitEventBucketsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAwrDatabaseWaitEventsResponse summarizeAwrDatabaseWaitEvents(
            SummarizeAwrDatabaseWaitEventsRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");

        return clientCall(request, SummarizeAwrDatabaseWaitEventsResponse::builder)
                .logger(LOG, "summarizeAwrDatabaseWaitEvents")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAwrDatabaseWaitEvents",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrDatabaseWaitEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrDatabaseWaitEventsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrDatabaseWaitEvents")
                .appendQueryParam(
                        "awrSourceDatabaseIdentifier", request.getAwrSourceDatabaseIdentifier())
                .appendQueryParam("instanceNumber", request.getInstanceNumber())
                .appendQueryParam(
                        "beginSnapshotIdentifierGreaterThanOrEqualTo",
                        request.getBeginSnapshotIdentifierGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endSnapshotIdentifierLessThanOrEqualTo",
                        request.getEndSnapshotIdentifierLessThanOrEqualTo())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sessionType", request.getSessionType())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrDatabaseWaitEventCollection.class,
                        SummarizeAwrDatabaseWaitEventsResponse.Builder
                                ::awrDatabaseWaitEventCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrDatabaseWaitEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeAwrDatabaseWaitEventsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeAwrSourcesSummariesResponse summarizeAwrSourcesSummaries(
            SummarizeAwrSourcesSummariesRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");

        return clientCall(request, SummarizeAwrSourcesSummariesResponse::builder)
                .logger(LOG, "summarizeAwrSourcesSummaries")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeAwrSourcesSummaries",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrSourcesSummaries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAwrSourcesSummariesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .appendPathParam("awrSourcesSummary")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SummarizeAwrSourcesSummariesCollection.class,
                        SummarizeAwrSourcesSummariesResponse.Builder
                                ::summarizeAwrSourcesSummariesCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAwrSourcesSummariesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAwrSourcesSummariesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeConfigurationItemsResponse summarizeConfigurationItems(
            SummarizeConfigurationItemsRequest request) {

        return clientCall(request, SummarizeConfigurationItemsResponse::builder)
                .logger(LOG, "summarizeConfigurationItems")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeConfigurationItems",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiConfigurations/SummarizeConfigurationItems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeConfigurationItemsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("opsiConfigurations")
                .appendPathParam("configurationItems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("opsiConfigType", request.getOpsiConfigType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "configItemsApplicableContext",
                        request.getConfigItemsApplicableContext(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "configItemField",
                        request.getConfigItemField(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.ConfigurationItemsCollection.class,
                        SummarizeConfigurationItemsResponse.Builder::configurationItemsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeConfigurationItemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeConfigurationItemsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeDatabaseInsightResourceCapacityTrendResponse
            summarizeDatabaseInsightResourceCapacityTrend(
                    SummarizeDatabaseInsightResourceCapacityTrendRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeDatabaseInsightResourceCapacityTrendResponse::builder)
                .logger(LOG, "summarizeDatabaseInsightResourceCapacityTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceCapacityTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceCapacityTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeDatabaseInsightResourceCapacityTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("resourceCapacityTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "databaseType",
                        request.getDatabaseType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("utilizationLevel", request.getUtilizationLevel())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("tablespaceName", request.getTablespaceName())
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "isDatabaseInstanceLevelMetrics",
                        request.getIsDatabaseInstanceLevelMetrics())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("highUtilizationThreshold", request.getHighUtilizationThreshold())
                .appendQueryParam("lowUtilizationThreshold", request.getLowUtilizationThreshold())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeDatabaseInsightResourceCapacityTrendAggregationCollection
                                .class,
                        SummarizeDatabaseInsightResourceCapacityTrendResponse.Builder
                                ::summarizeDatabaseInsightResourceCapacityTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeDatabaseInsightResourceCapacityTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeDatabaseInsightResourceCapacityTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeDatabaseInsightResourceForecastTrendResponse
            summarizeDatabaseInsightResourceForecastTrend(
                    SummarizeDatabaseInsightResourceForecastTrendRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeDatabaseInsightResourceForecastTrendResponse::builder)
                .logger(LOG, "summarizeDatabaseInsightResourceForecastTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceForecastTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceForecastTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeDatabaseInsightResourceForecastTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("resourceForecastTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "databaseType",
                        request.getDatabaseType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("statistic", request.getStatistic())
                .appendQueryParam("forecastDays", request.getForecastDays())
                .appendEnumQueryParam("forecastModel", request.getForecastModel())
                .appendEnumQueryParam("utilizationLevel", request.getUtilizationLevel())
                .appendQueryParam("confidence", request.getConfidence())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("tablespaceName", request.getTablespaceName())
                .appendQueryParam(
                        "isDatabaseInstanceLevelMetrics",
                        request.getIsDatabaseInstanceLevelMetrics())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("highUtilizationThreshold", request.getHighUtilizationThreshold())
                .appendQueryParam("lowUtilizationThreshold", request.getLowUtilizationThreshold())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeDatabaseInsightResourceForecastTrendAggregation.class,
                        SummarizeDatabaseInsightResourceForecastTrendResponse.Builder
                                ::summarizeDatabaseInsightResourceForecastTrendAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeDatabaseInsightResourceForecastTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeDatabaseInsightResourceForecastTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeDatabaseInsightResourceStatisticsResponse
            summarizeDatabaseInsightResourceStatistics(
                    SummarizeDatabaseInsightResourceStatisticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeDatabaseInsightResourceStatisticsResponse::builder)
                .logger(LOG, "summarizeDatabaseInsightResourceStatistics")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceStatistics",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceStatistics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeDatabaseInsightResourceStatisticsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("resourceStatistics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "databaseType",
                        request.getDatabaseType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("percentile", request.getPercentile())
                .appendQueryParam("insightBy", request.getInsightBy())
                .appendQueryParam("forecastDays", request.getForecastDays())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "isDatabaseInstanceLevelMetrics",
                        request.getIsDatabaseInstanceLevelMetrics())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("highUtilizationThreshold", request.getHighUtilizationThreshold())
                .appendQueryParam("lowUtilizationThreshold", request.getLowUtilizationThreshold())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeDatabaseInsightResourceStatisticsAggregationCollection
                                .class,
                        SummarizeDatabaseInsightResourceStatisticsResponse.Builder
                                ::summarizeDatabaseInsightResourceStatisticsAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeDatabaseInsightResourceStatisticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeDatabaseInsightResourceStatisticsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeDatabaseInsightResourceUsageResponse summarizeDatabaseInsightResourceUsage(
            SummarizeDatabaseInsightResourceUsageRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeDatabaseInsightResourceUsageResponse::builder)
                .logger(LOG, "summarizeDatabaseInsightResourceUsage")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceUsage",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeDatabaseInsightResourceUsageRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("resourceUsageSummary")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "databaseType",
                        request.getDatabaseType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "isDatabaseInstanceLevelMetrics",
                        request.getIsDatabaseInstanceLevelMetrics())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("percentile", request.getPercentile())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceUsageAggregation
                                .class,
                        SummarizeDatabaseInsightResourceUsageResponse.Builder
                                ::summarizeDatabaseInsightResourceUsageAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeDatabaseInsightResourceUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeDatabaseInsightResourceUsageResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeDatabaseInsightResourceUsageTrendResponse
            summarizeDatabaseInsightResourceUsageTrend(
                    SummarizeDatabaseInsightResourceUsageTrendRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeDatabaseInsightResourceUsageTrendResponse::builder)
                .logger(LOG, "summarizeDatabaseInsightResourceUsageTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceUsageTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceUsageTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeDatabaseInsightResourceUsageTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("resourceUsageTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "databaseType",
                        request.getDatabaseType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "isDatabaseInstanceLevelMetrics",
                        request.getIsDatabaseInstanceLevelMetrics())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeDatabaseInsightResourceUsageTrendAggregationCollection
                                .class,
                        SummarizeDatabaseInsightResourceUsageTrendResponse.Builder
                                ::summarizeDatabaseInsightResourceUsageTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeDatabaseInsightResourceUsageTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeDatabaseInsightResourceUsageTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeDatabaseInsightResourceUtilizationInsightResponse
            summarizeDatabaseInsightResourceUtilizationInsight(
                    SummarizeDatabaseInsightResourceUtilizationInsightRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(
                        request,
                        SummarizeDatabaseInsightResourceUtilizationInsightResponse::builder)
                .logger(LOG, "summarizeDatabaseInsightResourceUtilizationInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceUtilizationInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceUtilizationInsight")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeDatabaseInsightResourceUtilizationInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("resourceUtilizationInsight")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "databaseType",
                        request.getDatabaseType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("forecastDays", request.getForecastDays())
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "isDatabaseInstanceLevelMetrics",
                        request.getIsDatabaseInstanceLevelMetrics())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("highUtilizationThreshold", request.getHighUtilizationThreshold())
                .appendQueryParam("lowUtilizationThreshold", request.getLowUtilizationThreshold())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeDatabaseInsightResourceUtilizationInsightAggregation
                                .class,
                        SummarizeDatabaseInsightResourceUtilizationInsightResponse.Builder
                                ::summarizeDatabaseInsightResourceUtilizationInsightAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeDatabaseInsightResourceUtilizationInsightResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeDatabaseInsightResourceUtilizationInsightResponse.Builder
                                ::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeDatabaseInsightTablespaceUsageTrendResponse
            summarizeDatabaseInsightTablespaceUsageTrend(
                    SummarizeDatabaseInsightTablespaceUsageTrendRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, SummarizeDatabaseInsightTablespaceUsageTrendResponse::builder)
                .logger(LOG, "summarizeDatabaseInsightTablespaceUsageTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightTablespaceUsageTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightTablespaceUsageTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeDatabaseInsightTablespaceUsageTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("tablespaceUsageTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeDatabaseInsightTablespaceUsageTrendAggregationCollection
                                .class,
                        SummarizeDatabaseInsightTablespaceUsageTrendResponse.Builder
                                ::summarizeDatabaseInsightTablespaceUsageTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeDatabaseInsightTablespaceUsageTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeDatabaseInsightTablespaceUsageTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeExadataInsightResourceCapacityTrendResponse
            summarizeExadataInsightResourceCapacityTrend(
                    SummarizeExadataInsightResourceCapacityTrendRequest request) {
        Objects.requireNonNull(request.getResourceType(), "resourceType is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        Objects.requireNonNull(request.getExadataInsightId(), "exadataInsightId is required");

        return clientCall(request, SummarizeExadataInsightResourceCapacityTrendResponse::builder)
                .logger(LOG, "summarizeExadataInsightResourceCapacityTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceCapacityTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceCapacityTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExadataInsightResourceCapacityTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam("resourceCapacityTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("exadataInsightId", request.getExadataInsightId())
                .appendListQueryParam(
                        "databaseInsightId",
                        request.getDatabaseInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostInsightId",
                        request.getHostInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "storageServerName",
                        request.getStorageServerName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeExadataInsightResourceCapacityTrendCollection.class,
                        SummarizeExadataInsightResourceCapacityTrendResponse.Builder
                                ::summarizeExadataInsightResourceCapacityTrendCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExadataInsightResourceCapacityTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExadataInsightResourceCapacityTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeExadataInsightResourceCapacityTrendAggregatedResponse
            summarizeExadataInsightResourceCapacityTrendAggregated(
                    SummarizeExadataInsightResourceCapacityTrendAggregatedRequest request) {
        Objects.requireNonNull(request.getResourceType(), "resourceType is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(
                        request,
                        SummarizeExadataInsightResourceCapacityTrendAggregatedResponse::builder)
                .logger(LOG, "summarizeExadataInsightResourceCapacityTrendAggregated")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceCapacityTrendAggregated",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceCapacityTrendAggregated")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(
                        SummarizeExadataInsightResourceCapacityTrendAggregatedRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam("resourceCapacityTrendAggregated")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeExadataInsightResourceCapacityTrendAggregation.class,
                        SummarizeExadataInsightResourceCapacityTrendAggregatedResponse.Builder
                                ::summarizeExadataInsightResourceCapacityTrendAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExadataInsightResourceCapacityTrendAggregatedResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExadataInsightResourceCapacityTrendAggregatedResponse.Builder
                                ::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeExadataInsightResourceForecastTrendResponse
            summarizeExadataInsightResourceForecastTrend(
                    SummarizeExadataInsightResourceForecastTrendRequest request) {
        Objects.requireNonNull(request.getResourceType(), "resourceType is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        Objects.requireNonNull(request.getExadataInsightId(), "exadataInsightId is required");

        return clientCall(request, SummarizeExadataInsightResourceForecastTrendResponse::builder)
                .logger(LOG, "summarizeExadataInsightResourceForecastTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceForecastTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceForecastTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExadataInsightResourceForecastTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam("resourceForecastTrend")
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("exadataInsightId", request.getExadataInsightId())
                .appendListQueryParam(
                        "databaseInsightId",
                        request.getDatabaseInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostInsightId",
                        request.getHostInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "storageServerName",
                        request.getStorageServerName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("statistic", request.getStatistic())
                .appendQueryParam("forecastStartDay", request.getForecastStartDay())
                .appendQueryParam("forecastDays", request.getForecastDays())
                .appendEnumQueryParam("forecastModel", request.getForecastModel())
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("confidence", request.getConfidence())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeExadataInsightResourceForecastTrendCollection.class,
                        SummarizeExadataInsightResourceForecastTrendResponse.Builder
                                ::summarizeExadataInsightResourceForecastTrendCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExadataInsightResourceForecastTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExadataInsightResourceForecastTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeExadataInsightResourceForecastTrendAggregatedResponse
            summarizeExadataInsightResourceForecastTrendAggregated(
                    SummarizeExadataInsightResourceForecastTrendAggregatedRequest request) {
        Objects.requireNonNull(request.getResourceType(), "resourceType is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(
                        request,
                        SummarizeExadataInsightResourceForecastTrendAggregatedResponse::builder)
                .logger(LOG, "summarizeExadataInsightResourceForecastTrendAggregated")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceForecastTrendAggregated",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceForecastTrendAggregated")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(
                        SummarizeExadataInsightResourceForecastTrendAggregatedRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam("resourceForecastTrendAggregated")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("statistic", request.getStatistic())
                .appendQueryParam("forecastStartDay", request.getForecastStartDay())
                .appendQueryParam("forecastDays", request.getForecastDays())
                .appendEnumQueryParam("forecastModel", request.getForecastModel())
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("confidence", request.getConfidence())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeExadataInsightResourceForecastTrendAggregation.class,
                        SummarizeExadataInsightResourceForecastTrendAggregatedResponse.Builder
                                ::summarizeExadataInsightResourceForecastTrendAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExadataInsightResourceForecastTrendAggregatedResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExadataInsightResourceForecastTrendAggregatedResponse.Builder
                                ::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeExadataInsightResourceStatisticsResponse
            summarizeExadataInsightResourceStatistics(
                    SummarizeExadataInsightResourceStatisticsRequest request) {
        Objects.requireNonNull(request.getExadataInsightId(), "exadataInsightId is required");

        Objects.requireNonNull(request.getResourceType(), "resourceType is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeExadataInsightResourceStatisticsResponse::builder)
                .logger(LOG, "summarizeExadataInsightResourceStatistics")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceStatistics",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceStatistics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExadataInsightResourceStatisticsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam("resourceStatistics")
                .appendQueryParam("exadataInsightId", request.getExadataInsightId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("percentile", request.getPercentile())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeExadataInsightResourceStatisticsAggregationCollection
                                .class,
                        SummarizeExadataInsightResourceStatisticsResponse.Builder
                                ::summarizeExadataInsightResourceStatisticsAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExadataInsightResourceStatisticsResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        SummarizeExadataInsightResourceStatisticsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExadataInsightResourceStatisticsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeExadataInsightResourceUsageResponse summarizeExadataInsightResourceUsage(
            SummarizeExadataInsightResourceUsageRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceType(), "resourceType is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeExadataInsightResourceUsageResponse::builder)
                .logger(LOG, "summarizeExadataInsightResourceUsage")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceUsage",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExadataInsightResourceUsageRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam("resourceUsageSummary")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("percentile", request.getPercentile())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceUsageCollection
                                .class,
                        SummarizeExadataInsightResourceUsageResponse.Builder
                                ::summarizeExadataInsightResourceUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExadataInsightResourceUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExadataInsightResourceUsageResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeExadataInsightResourceUsageAggregatedResponse
            summarizeExadataInsightResourceUsageAggregated(
                    SummarizeExadataInsightResourceUsageAggregatedRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceType(), "resourceType is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeExadataInsightResourceUsageAggregatedResponse::builder)
                .logger(LOG, "summarizeExadataInsightResourceUsageAggregated")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceUsageAggregated",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceUsageAggregated")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExadataInsightResourceUsageAggregatedRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam("resourceUsageSummaryAggregated")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("percentile", request.getPercentile())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceUsageAggregation
                                .class,
                        SummarizeExadataInsightResourceUsageAggregatedResponse.Builder
                                ::summarizeExadataInsightResourceUsageAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExadataInsightResourceUsageAggregatedResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExadataInsightResourceUsageAggregatedResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeExadataInsightResourceUtilizationInsightResponse
            summarizeExadataInsightResourceUtilizationInsight(
                    SummarizeExadataInsightResourceUtilizationInsightRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceType(), "resourceType is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(
                        request, SummarizeExadataInsightResourceUtilizationInsightResponse::builder)
                .logger(LOG, "summarizeExadataInsightResourceUtilizationInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceUtilizationInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceUtilizationInsight")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExadataInsightResourceUtilizationInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam("resourceUtilizationInsight")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("forecastStartDay", request.getForecastStartDay())
                .appendQueryParam("forecastDays", request.getForecastDays())
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeExadataInsightResourceUtilizationInsightAggregation.class,
                        SummarizeExadataInsightResourceUtilizationInsightResponse.Builder
                                ::summarizeExadataInsightResourceUtilizationInsightAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeExadataInsightResourceUtilizationInsightResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        SummarizeExadataInsightResourceUtilizationInsightResponse.Builder
                                ::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeExadataInsightResourceUtilizationInsightResponse.Builder
                                ::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeExadataMembersResponse summarizeExadataMembers(
            SummarizeExadataMembersRequest request) {
        Objects.requireNonNull(request.getExadataInsightId(), "exadataInsightId is required");

        return clientCall(request, SummarizeExadataMembersResponse::builder)
                .logger(LOG, "summarizeExadataMembers")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeExadataMembers",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataMembers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeExadataMembersRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam("exadataMembers")
                .appendQueryParam("exadataInsightId", request.getExadataInsightId())
                .appendListQueryParam(
                        "exadataType",
                        request.getExadataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.ExadataMemberCollection.class,
                        SummarizeExadataMembersResponse.Builder::exadataMemberCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeExadataMembersResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items", SummarizeExadataMembersResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeExadataMembersResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeHostInsightNetworkUsageTrendResponse summarizeHostInsightNetworkUsageTrend(
            SummarizeHostInsightNetworkUsageTrendRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getId(), "id is required");

        return clientCall(request, SummarizeHostInsightNetworkUsageTrendResponse::builder)
                .logger(LOG, "summarizeHostInsightNetworkUsageTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightNetworkUsageTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightNetworkUsageTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightNetworkUsageTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("networkUsageTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("hostId", request.getHostId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("statistic", request.getStatistic())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeHostInsightNetworkUsageTrendAggregationCollection.class,
                        SummarizeHostInsightNetworkUsageTrendResponse.Builder
                                ::summarizeHostInsightNetworkUsageTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightNetworkUsageTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeHostInsightNetworkUsageTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeHostInsightResourceCapacityTrendResponse
            summarizeHostInsightResourceCapacityTrend(
                    SummarizeHostInsightResourceCapacityTrendRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeHostInsightResourceCapacityTrendResponse::builder)
                .logger(LOG, "summarizeHostInsightResourceCapacityTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceCapacityTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceCapacityTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightResourceCapacityTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("resourceCapacityTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("utilizationLevel", request.getUtilizationLevel())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostId", request.getHostId())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("highUtilizationThreshold", request.getHighUtilizationThreshold())
                .appendQueryParam("lowUtilizationThreshold", request.getLowUtilizationThreshold())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeHostInsightResourceCapacityTrendAggregationCollection
                                .class,
                        SummarizeHostInsightResourceCapacityTrendResponse.Builder
                                ::summarizeHostInsightResourceCapacityTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightResourceCapacityTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeHostInsightResourceCapacityTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeHostInsightResourceForecastTrendResponse
            summarizeHostInsightResourceForecastTrend(
                    SummarizeHostInsightResourceForecastTrendRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeHostInsightResourceForecastTrendResponse::builder)
                .logger(LOG, "summarizeHostInsightResourceForecastTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceForecastTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceForecastTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightResourceForecastTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("resourceForecastTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("statistic", request.getStatistic())
                .appendQueryParam("forecastDays", request.getForecastDays())
                .appendEnumQueryParam("forecastModel", request.getForecastModel())
                .appendEnumQueryParam("utilizationLevel", request.getUtilizationLevel())
                .appendQueryParam("confidence", request.getConfidence())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostId", request.getHostId())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("highUtilizationThreshold", request.getHighUtilizationThreshold())
                .appendQueryParam("lowUtilizationThreshold", request.getLowUtilizationThreshold())
                .appendQueryParam("mountPoint", request.getMountPoint())
                .appendQueryParam("interfaceName", request.getInterfaceName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeHostInsightResourceForecastTrendAggregation.class,
                        SummarizeHostInsightResourceForecastTrendResponse.Builder
                                ::summarizeHostInsightResourceForecastTrendAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightResourceForecastTrendResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeHostInsightResourceStatisticsResponse summarizeHostInsightResourceStatistics(
            SummarizeHostInsightResourceStatisticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeHostInsightResourceStatisticsResponse::builder)
                .logger(LOG, "summarizeHostInsightResourceStatistics")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceStatistics",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceStatistics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightResourceStatisticsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("resourceStatistics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("percentile", request.getPercentile())
                .appendQueryParam("insightBy", request.getInsightBy())
                .appendQueryParam("forecastDays", request.getForecastDays())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostId", request.getHostId())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("highUtilizationThreshold", request.getHighUtilizationThreshold())
                .appendQueryParam("lowUtilizationThreshold", request.getLowUtilizationThreshold())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeHostInsightResourceStatisticsAggregationCollection.class,
                        SummarizeHostInsightResourceStatisticsResponse.Builder
                                ::summarizeHostInsightResourceStatisticsAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightResourceStatisticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeHostInsightResourceStatisticsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeHostInsightResourceUsageResponse summarizeHostInsightResourceUsage(
            SummarizeHostInsightResourceUsageRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeHostInsightResourceUsageResponse::builder)
                .logger(LOG, "summarizeHostInsightResourceUsage")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceUsage",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightResourceUsageRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("resourceUsageSummary")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("percentile", request.getPercentile())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostId", request.getHostId())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SummarizeHostInsightResourceUsageAggregation
                                .class,
                        SummarizeHostInsightResourceUsageResponse.Builder
                                ::summarizeHostInsightResourceUsageAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightResourceUsageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeHostInsightResourceUsageTrendResponse summarizeHostInsightResourceUsageTrend(
            SummarizeHostInsightResourceUsageTrendRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeHostInsightResourceUsageTrendResponse::builder)
                .logger(LOG, "summarizeHostInsightResourceUsageTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceUsageTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceUsageTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightResourceUsageTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("resourceUsageTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostId", request.getHostId())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeHostInsightResourceUsageTrendAggregationCollection.class,
                        SummarizeHostInsightResourceUsageTrendResponse.Builder
                                ::summarizeHostInsightResourceUsageTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightResourceUsageTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeHostInsightResourceUsageTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeHostInsightResourceUtilizationInsightResponse
            summarizeHostInsightResourceUtilizationInsight(
                    SummarizeHostInsightResourceUtilizationInsightRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeHostInsightResourceUtilizationInsightResponse::builder)
                .logger(LOG, "summarizeHostInsightResourceUtilizationInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceUtilizationInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceUtilizationInsight")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightResourceUtilizationInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("resourceUtilizationInsight")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("forecastDays", request.getForecastDays())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostId", request.getHostId())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("highUtilizationThreshold", request.getHighUtilizationThreshold())
                .appendQueryParam("lowUtilizationThreshold", request.getLowUtilizationThreshold())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeHostInsightResourceUtilizationInsightAggregation.class,
                        SummarizeHostInsightResourceUtilizationInsightResponse.Builder
                                ::summarizeHostInsightResourceUtilizationInsightAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightResourceUtilizationInsightResponse.Builder
                                ::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeHostInsightStorageUsageTrendResponse summarizeHostInsightStorageUsageTrend(
            SummarizeHostInsightStorageUsageTrendRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getId(), "id is required");

        return clientCall(request, SummarizeHostInsightStorageUsageTrendResponse::builder)
                .logger(LOG, "summarizeHostInsightStorageUsageTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightStorageUsageTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightStorageUsageTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightStorageUsageTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("storageUsageTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("hostId", request.getHostId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("statistic", request.getStatistic())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeHostInsightStorageUsageTrendAggregationCollection.class,
                        SummarizeHostInsightStorageUsageTrendResponse.Builder
                                ::summarizeHostInsightStorageUsageTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightStorageUsageTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeHostInsightStorageUsageTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeHostInsightTopProcessesUsageResponse summarizeHostInsightTopProcessesUsage(
            SummarizeHostInsightTopProcessesUsageRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getId(), "id is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        Objects.requireNonNull(request.getTimestamp(), "timestamp is required");

        return clientCall(request, SummarizeHostInsightTopProcessesUsageResponse::builder)
                .logger(LOG, "summarizeHostInsightTopProcessesUsage")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightTopProcessesUsage",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightTopProcessesUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightTopProcessesUsageRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("topProcessesUsage")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostId", request.getHostId())
                .appendQueryParam("timestamp", request.getTimestamp())
                .appendEnumQueryParam("statistic", request.getStatistic())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SummarizeHostInsightsTopProcessesUsageCollection
                                .class,
                        SummarizeHostInsightTopProcessesUsageResponse.Builder
                                ::summarizeHostInsightsTopProcessesUsageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightTopProcessesUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeHostInsightTopProcessesUsageResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeHostInsightTopProcessesUsageTrendResponse
            summarizeHostInsightTopProcessesUsageTrend(
                    SummarizeHostInsightTopProcessesUsageTrendRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getId(), "id is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeHostInsightTopProcessesUsageTrendResponse::builder)
                .logger(LOG, "summarizeHostInsightTopProcessesUsageTrend")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightTopProcessesUsageTrend",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightTopProcessesUsageTrend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightTopProcessesUsageTrendRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("topProcessesUsageTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendListQueryParam(
                        "hostType",
                        request.getHostType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hostId", request.getHostId())
                .appendQueryParam("processHash", request.getProcessHash())
                .appendEnumQueryParam("statistic", request.getStatistic())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeHostInsightsTopProcessesUsageTrendCollection.class,
                        SummarizeHostInsightTopProcessesUsageTrendResponse.Builder
                                ::summarizeHostInsightsTopProcessesUsageTrendCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightTopProcessesUsageTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeHostInsightTopProcessesUsageTrendResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeOperationsInsightsWarehouseResourceUsageResponse
            summarizeOperationsInsightsWarehouseResourceUsage(
                    SummarizeOperationsInsightsWarehouseResourceUsageRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsWarehouseId(),
                "operationsInsightsWarehouseId must not be blank");

        return clientCall(
                        request, SummarizeOperationsInsightsWarehouseResourceUsageResponse::builder)
                .logger(LOG, "summarizeOperationsInsightsWarehouseResourceUsage")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeOperationsInsightsWarehouseResourceUsage",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/SummarizeOperationsInsightsWarehouseResourceUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeOperationsInsightsWarehouseResourceUsageRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouses")
                .appendPathParam(request.getOperationsInsightsWarehouseId())
                .appendPathParam("resourceUsageSummary")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model
                                .SummarizeOperationsInsightsWarehouseResourceUsageAggregation.class,
                        SummarizeOperationsInsightsWarehouseResourceUsageResponse.Builder
                                ::summarizeOperationsInsightsWarehouseResourceUsageAggregation)
                .handleResponseHeaderString(
                        "etag",
                        SummarizeOperationsInsightsWarehouseResourceUsageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeOperationsInsightsWarehouseResourceUsageResponse.Builder
                                ::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeSqlInsightsResponse summarizeSqlInsights(SummarizeSqlInsightsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, SummarizeSqlInsightsResponse::builder)
                .logger(LOG, "summarizeSqlInsights")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeSqlInsights",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlInsights")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeSqlInsightsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("sqlInsights")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseType",
                        request.getDatabaseType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "databaseTimePctGreaterThan", request.getDatabaseTimePctGreaterThan())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SqlInsightAggregationCollection.class,
                        SummarizeSqlInsightsResponse.Builder::sqlInsightAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeSqlInsightsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeSqlInsightsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeSqlPlanInsightsResponse summarizeSqlPlanInsights(
            SummarizeSqlPlanInsightsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSqlIdentifier(), "sqlIdentifier is required");

        return clientCall(request, SummarizeSqlPlanInsightsResponse::builder)
                .logger(LOG, "summarizeSqlPlanInsights")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeSqlPlanInsights",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlPlanInsights")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeSqlPlanInsightsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("sqlPlanInsights")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("sqlIdentifier", request.getSqlIdentifier())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SqlPlanInsightAggregationCollection.class,
                        SummarizeSqlPlanInsightsResponse.Builder
                                ::sqlPlanInsightAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeSqlPlanInsightsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeSqlPlanInsightsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeSqlResponseTimeDistributionsResponse summarizeSqlResponseTimeDistributions(
            SummarizeSqlResponseTimeDistributionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSqlIdentifier(), "sqlIdentifier is required");

        return clientCall(request, SummarizeSqlResponseTimeDistributionsResponse::builder)
                .logger(LOG, "summarizeSqlResponseTimeDistributions")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeSqlResponseTimeDistributions",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlResponseTimeDistributions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeSqlResponseTimeDistributionsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("sqlResponseTimeDistributions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("sqlIdentifier", request.getSqlIdentifier())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SqlResponseTimeDistributionAggregationCollection
                                .class,
                        SummarizeSqlResponseTimeDistributionsResponse.Builder
                                ::sqlResponseTimeDistributionAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeSqlResponseTimeDistributionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeSqlResponseTimeDistributionsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeSqlStatisticsResponse summarizeSqlStatistics(
            SummarizeSqlStatisticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, SummarizeSqlStatisticsResponse::builder)
                .logger(LOG, "summarizeSqlStatistics")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeSqlStatistics",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlStatistics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeSqlStatisticsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("sqlStatistics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseType",
                        request.getDatabaseType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "databaseTimePctGreaterThan", request.getDatabaseTimePctGreaterThan())
                .appendListQueryParam(
                        "sqlIdentifier",
                        request.getSqlIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "category",
                        request.getCategory(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SqlStatisticAggregationCollection.class,
                        SummarizeSqlStatisticsResponse.Builder::sqlStatisticAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeSqlStatisticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeSqlStatisticsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeSqlStatisticsTimeSeriesResponse summarizeSqlStatisticsTimeSeries(
            SummarizeSqlStatisticsTimeSeriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSqlIdentifier(), "sqlIdentifier is required");

        return clientCall(request, SummarizeSqlStatisticsTimeSeriesResponse::builder)
                .logger(LOG, "summarizeSqlStatisticsTimeSeries")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeSqlStatisticsTimeSeries",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlStatisticsTimeSeries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeSqlStatisticsTimeSeriesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("sqlStatisticsTimeSeries")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "databaseId",
                        request.getDatabaseId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "exadataInsightId",
                        request.getExadataInsightId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "cdbName",
                        request.getCdbName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "hostName",
                        request.getHostName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("sqlIdentifier", request.getSqlIdentifier())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "vmclusterName",
                        request.getVmclusterName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SqlStatisticsTimeSeriesAggregationCollection
                                .class,
                        SummarizeSqlStatisticsTimeSeriesResponse.Builder
                                ::sqlStatisticsTimeSeriesAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeSqlStatisticsTimeSeriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeSqlStatisticsTimeSeriesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SummarizeSqlStatisticsTimeSeriesByPlanResponse summarizeSqlStatisticsTimeSeriesByPlan(
            SummarizeSqlStatisticsTimeSeriesByPlanRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSqlIdentifier(), "sqlIdentifier is required");

        return clientCall(request, SummarizeSqlStatisticsTimeSeriesByPlanResponse::builder)
                .logger(LOG, "summarizeSqlStatisticsTimeSeriesByPlan")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeSqlStatisticsTimeSeriesByPlan",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlStatisticsTimeSeriesByPlan")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeSqlStatisticsTimeSeriesByPlanRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("sqlStatisticsTimeSeriesByPlan")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("sqlIdentifier", request.getSqlIdentifier())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SqlStatisticsTimeSeriesByPlanAggregationCollection
                                .class,
                        SummarizeSqlStatisticsTimeSeriesByPlanResponse.Builder
                                ::sqlStatisticsTimeSeriesByPlanAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeSqlStatisticsTimeSeriesByPlanResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeSqlStatisticsTimeSeriesByPlanResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateAwrHubResponse updateAwrHub(UpdateAwrHubRequest request) {

        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Objects.requireNonNull(request.getUpdateAwrHubDetails(), "updateAwrHubDetails is required");

        return clientCall(request, UpdateAwrHubResponse::builder)
                .logger(LOG, "updateAwrHub")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateAwrHub",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/UpdateAwrHub")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAwrHubRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubs")
                .appendPathParam(request.getAwrHubId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAwrHubResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAwrHubResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDatabaseInsightResponse updateDatabaseInsight(
            UpdateDatabaseInsightRequest request) {

        Validate.notBlank(request.getDatabaseInsightId(), "databaseInsightId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseInsightDetails(),
                "updateDatabaseInsightDetails is required");

        return clientCall(request, UpdateDatabaseInsightResponse::builder)
                .logger(LOG, "updateDatabaseInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateDatabaseInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/UpdateDatabaseInsight")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam(request.getDatabaseInsightId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDatabaseInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatabaseInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateEnterpriseManagerBridgeResponse updateEnterpriseManagerBridge(
            UpdateEnterpriseManagerBridgeRequest request) {

        Validate.notBlank(
                request.getEnterpriseManagerBridgeId(),
                "enterpriseManagerBridgeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateEnterpriseManagerBridgeDetails(),
                "updateEnterpriseManagerBridgeDetails is required");

        return clientCall(request, UpdateEnterpriseManagerBridgeResponse::builder)
                .logger(LOG, "updateEnterpriseManagerBridge")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateEnterpriseManagerBridge",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/UpdateEnterpriseManagerBridge")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEnterpriseManagerBridgeRequest::builder)
                .basePath("/20200630")
                .appendPathParam("enterpriseManagerBridges")
                .appendPathParam(request.getEnterpriseManagerBridgeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateEnterpriseManagerBridgeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateEnterpriseManagerBridgeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateExadataInsightResponse updateExadataInsight(UpdateExadataInsightRequest request) {

        Validate.notBlank(request.getExadataInsightId(), "exadataInsightId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExadataInsightDetails(),
                "updateExadataInsightDetails is required");

        return clientCall(request, UpdateExadataInsightResponse::builder)
                .logger(LOG, "updateExadataInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateExadataInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/UpdateExadataInsight")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExadataInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("exadataInsights")
                .appendPathParam(request.getExadataInsightId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExadataInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExadataInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateHostInsightResponse updateHostInsight(UpdateHostInsightRequest request) {

        Validate.notBlank(request.getHostInsightId(), "hostInsightId must not be blank");
        Objects.requireNonNull(
                request.getUpdateHostInsightDetails(), "updateHostInsightDetails is required");

        return clientCall(request, UpdateHostInsightResponse::builder)
                .logger(LOG, "updateHostInsight")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateHostInsight",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/UpdateHostInsight")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHostInsightRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam(request.getHostInsightId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateHostInsightResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHostInsightResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateNewsReportResponse updateNewsReport(UpdateNewsReportRequest request) {

        Validate.notBlank(request.getNewsReportId(), "newsReportId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNewsReportDetails(), "updateNewsReportDetails is required");

        return clientCall(request, UpdateNewsReportResponse::builder)
                .logger(LOG, "updateNewsReport")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateNewsReport",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/NewsReports/UpdateNewsReport")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNewsReportRequest::builder)
                .basePath("/20200630")
                .appendPathParam("newsReports")
                .appendPathParam(request.getNewsReportId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateNewsReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNewsReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateOperationsInsightsPrivateEndpointResponse updateOperationsInsightsPrivateEndpoint(
            UpdateOperationsInsightsPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsPrivateEndpointId(),
                "operationsInsightsPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOperationsInsightsPrivateEndpointDetails(),
                "updateOperationsInsightsPrivateEndpointDetails is required");

        return clientCall(request, UpdateOperationsInsightsPrivateEndpointResponse::builder)
                .logger(LOG, "updateOperationsInsightsPrivateEndpoint")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateOperationsInsightsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/UpdateOperationsInsightsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOperationsInsightsPrivateEndpointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsPrivateEndpoints")
                .appendPathParam(request.getOperationsInsightsPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOperationsInsightsPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOperationsInsightsPrivateEndpointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateOperationsInsightsWarehouseResponse updateOperationsInsightsWarehouse(
            UpdateOperationsInsightsWarehouseRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsWarehouseId(),
                "operationsInsightsWarehouseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOperationsInsightsWarehouseDetails(),
                "updateOperationsInsightsWarehouseDetails is required");

        return clientCall(request, UpdateOperationsInsightsWarehouseResponse::builder)
                .logger(LOG, "updateOperationsInsightsWarehouse")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateOperationsInsightsWarehouse",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/UpdateOperationsInsightsWarehouse")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOperationsInsightsWarehouseRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouses")
                .appendPathParam(request.getOperationsInsightsWarehouseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOperationsInsightsWarehouseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOperationsInsightsWarehouseResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateOperationsInsightsWarehouseUserResponse updateOperationsInsightsWarehouseUser(
            UpdateOperationsInsightsWarehouseUserRequest request) {

        Validate.notBlank(
                request.getOperationsInsightsWarehouseUserId(),
                "operationsInsightsWarehouseUserId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOperationsInsightsWarehouseUserDetails(),
                "updateOperationsInsightsWarehouseUserDetails is required");

        return clientCall(request, UpdateOperationsInsightsWarehouseUserResponse::builder)
                .logger(LOG, "updateOperationsInsightsWarehouseUser")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateOperationsInsightsWarehouseUser",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouseUsers/UpdateOperationsInsightsWarehouseUser")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOperationsInsightsWarehouseUserRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouseUsers")
                .appendPathParam(request.getOperationsInsightsWarehouseUserId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOperationsInsightsWarehouseUserResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOperationsInsightsWarehouseUserResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateOpsiConfigurationResponse updateOpsiConfiguration(
            UpdateOpsiConfigurationRequest request) {

        Validate.notBlank(
                request.getOpsiConfigurationId(), "opsiConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOpsiConfigurationDetails(),
                "updateOpsiConfigurationDetails is required");

        return clientCall(request, UpdateOpsiConfigurationResponse::builder)
                .logger(LOG, "updateOpsiConfiguration")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateOpsiConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiConfigurations/UpdateOpsiConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOpsiConfigurationRequest::builder)
                .basePath("/20200630")
                .appendPathParam("opsiConfigurations")
                .appendPathParam(request.getOpsiConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOpsiConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOpsiConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public OperationsInsightsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OperationsInsightsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
