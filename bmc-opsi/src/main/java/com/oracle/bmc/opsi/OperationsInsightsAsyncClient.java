/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OperationsInsights service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class OperationsInsightsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OperationsInsightsAsync {
    /** Service instance for OperationsInsights. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OPERATIONSINSIGHTS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operationsinsights.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationsInsightsAsyncClient.class);

    OperationsInsightsAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    OperationsInsightsAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "OperationsInsightsAsyncClient",
                            "downloadOperationsInsightsWarehouseWallet,getAwrHubObject"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, OperationsInsightsAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "opsi";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
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
        public OperationsInsightsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OperationsInsightsAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<AddExadataInsightMembersResponse> addExadataInsightMembers(
            AddExadataInsightMembersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddExadataInsightMembersRequest, AddExadataInsightMembersResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAutonomousDatabaseInsightAdvancedFeaturesResponse>
            changeAutonomousDatabaseInsightAdvancedFeatures(
                    ChangeAutonomousDatabaseInsightAdvancedFeaturesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousDatabaseInsightAdvancedFeaturesRequest,
                                    ChangeAutonomousDatabaseInsightAdvancedFeaturesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAwrHubSourceCompartmentResponse>
            changeAwrHubSourceCompartment(
                    ChangeAwrHubSourceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAwrHubSourceCompartmentRequest,
                                    ChangeAwrHubSourceCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");
        Objects.requireNonNull(
                request.getChangeAwrHubSourceCompartmentDetails(),
                "changeAwrHubSourceCompartmentDetails is required");

        return clientCall(request, ChangeAwrHubSourceCompartmentResponse::builder)
                .logger(LOG, "changeAwrHubSourceCompartment")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangeAwrHubSourceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubSources/ChangeAwrHubSourceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAwrHubSourceCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAwrHubSourceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAwrHubSourceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseInsightCompartmentResponse>
            changeDatabaseInsightCompartment(
                    ChangeDatabaseInsightCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseInsightCompartmentRequest,
                                    ChangeDatabaseInsightCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeEnterpriseManagerBridgeCompartmentResponse>
            changeEnterpriseManagerBridgeCompartment(
                    ChangeEnterpriseManagerBridgeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeEnterpriseManagerBridgeCompartmentRequest,
                                    ChangeEnterpriseManagerBridgeCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeExadataInsightCompartmentResponse>
            changeExadataInsightCompartment(
                    ChangeExadataInsightCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExadataInsightCompartmentRequest,
                                    ChangeExadataInsightCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeHostInsightCompartmentResponse>
            changeHostInsightCompartment(
                    ChangeHostInsightCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeHostInsightCompartmentRequest,
                                    ChangeHostInsightCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeNewsReportCompartmentResponse>
            changeNewsReportCompartment(
                    ChangeNewsReportCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNewsReportCompartmentRequest,
                                    ChangeNewsReportCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeOperationsInsightsPrivateEndpointCompartmentResponse>
            changeOperationsInsightsPrivateEndpointCompartment(
                    ChangeOperationsInsightsPrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOperationsInsightsPrivateEndpointCompartmentRequest,
                                    ChangeOperationsInsightsPrivateEndpointCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeOperationsInsightsWarehouseCompartmentResponse>
            changeOperationsInsightsWarehouseCompartment(
                    ChangeOperationsInsightsWarehouseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOperationsInsightsWarehouseCompartmentRequest,
                                    ChangeOperationsInsightsWarehouseCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOperationsInsightsWarehouseId(),
                "operationsInsightsWarehouseId must not be blank");
        Objects.requireNonNull(
                request.getChangeOperationsInsightsWarehouseCompartmentDetails(),
                "changeOperationsInsightsWarehouseCompartmentDetails is required");

        return clientCall(request, ChangeOperationsInsightsWarehouseCompartmentResponse::builder)
                .logger(LOG, "changeOperationsInsightsWarehouseCompartment")
                .serviceDetails(
                        "OperationsInsights",
                        "ChangeOperationsInsightsWarehouseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/ChangeOperationsInsightsWarehouseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOperationsInsightsWarehouseCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operationsInsightsWarehouses")
                .appendPathParam(request.getOperationsInsightsWarehouseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOperationsInsightsWarehouseCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOperationsInsightsWarehouseCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeOpsiConfigurationCompartmentResponse>
            changeOpsiConfigurationCompartment(
                    ChangeOpsiConfigurationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOpsiConfigurationCompartmentRequest,
                                    ChangeOpsiConfigurationCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangePeComanagedDatabaseInsightResponse>
            changePeComanagedDatabaseInsight(
                    ChangePeComanagedDatabaseInsightRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePeComanagedDatabaseInsightRequest,
                                    ChangePeComanagedDatabaseInsightResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAwrHubResponse> createAwrHub(
            CreateAwrHubRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateAwrHubRequest, CreateAwrHubResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAwrHubSourceResponse> createAwrHubSource(
            CreateAwrHubSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAwrHubSourceRequest, CreateAwrHubSourceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAwrHubSourceDetails(), "createAwrHubSourceDetails is required");

        return clientCall(request, CreateAwrHubSourceResponse::builder)
                .logger(LOG, "createAwrHubSource")
                .serviceDetails(
                        "OperationsInsights",
                        "CreateAwrHubSource",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubSources/CreateAwrHubSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAwrHubSourceRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubSources")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrHubSource.class,
                        CreateAwrHubSourceResponse.Builder::awrHubSource)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAwrHubSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateAwrHubSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateAwrHubSourceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseInsightResponse> createDatabaseInsight(
            CreateDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseInsightRequest, CreateDatabaseInsightResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateEnterpriseManagerBridgeResponse>
            createEnterpriseManagerBridge(
                    CreateEnterpriseManagerBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateEnterpriseManagerBridgeRequest,
                                    CreateEnterpriseManagerBridgeResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExadataInsightResponse> createExadataInsight(
            CreateExadataInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateExadataInsightRequest, CreateExadataInsightResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateHostInsightResponse> createHostInsight(
            CreateHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateHostInsightRequest, CreateHostInsightResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateNewsReportResponse> createNewsReport(
            CreateNewsReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNewsReportRequest, CreateNewsReportResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOperationsInsightsPrivateEndpointResponse>
            createOperationsInsightsPrivateEndpoint(
                    CreateOperationsInsightsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperationsInsightsPrivateEndpointRequest,
                                    CreateOperationsInsightsPrivateEndpointResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOperationsInsightsWarehouseResponse>
            createOperationsInsightsWarehouse(
                    CreateOperationsInsightsWarehouseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperationsInsightsWarehouseRequest,
                                    CreateOperationsInsightsWarehouseResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOperationsInsightsWarehouseUserResponse>
            createOperationsInsightsWarehouseUser(
                    CreateOperationsInsightsWarehouseUserRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperationsInsightsWarehouseUserRequest,
                                    CreateOperationsInsightsWarehouseUserResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOpsiConfigurationResponse> createOpsiConfiguration(
            CreateOpsiConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOpsiConfigurationRequest, CreateOpsiConfigurationResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAwrHubResponse> deleteAwrHub(
            DeleteAwrHubRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteAwrHubRequest, DeleteAwrHubResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAwrHubObjectResponse> deleteAwrHubObject(
            DeleteAwrHubObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAwrHubObjectRequest, DeleteAwrHubObjectResponse>
                    handler) {

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        return clientCall(request, DeleteAwrHubObjectResponse::builder)
                .logger(LOG, "deleteAwrHubObject")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteAwrHubObject",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubObjects/DeleteAwrHubObject")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAwrHubObjectRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubObjects")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .appendPathParam("o")
                .appendPathParam(request.getObjectName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        DeleteAwrHubObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAwrHubObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderDate(
                        "last-modified", DeleteAwrHubObjectResponse.Builder::lastModified)
                .handleResponseHeaderString(
                        "version-id", DeleteAwrHubObjectResponse.Builder::versionId)
                .handleResponseHeaderBoolean(
                        "is-delete-marker", DeleteAwrHubObjectResponse.Builder::isDeleteMarker)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAwrHubSourceResponse> deleteAwrHubSource(
            DeleteAwrHubSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAwrHubSourceRequest, DeleteAwrHubSourceResponse>
                    handler) {

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");

        return clientCall(request, DeleteAwrHubSourceResponse::builder)
                .logger(LOG, "deleteAwrHubSource")
                .serviceDetails(
                        "OperationsInsights",
                        "DeleteAwrHubSource",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubSources/DeleteAwrHubSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAwrHubSourceRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAwrHubSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAwrHubSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseInsightResponse> deleteDatabaseInsight(
            DeleteDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseInsightRequest, DeleteDatabaseInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnterpriseManagerBridgeResponse>
            deleteEnterpriseManagerBridge(
                    DeleteEnterpriseManagerBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteEnterpriseManagerBridgeRequest,
                                    DeleteEnterpriseManagerBridgeResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExadataInsightResponse> deleteExadataInsight(
            DeleteExadataInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteExadataInsightRequest, DeleteExadataInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteHostInsightResponse> deleteHostInsight(
            DeleteHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteHostInsightRequest, DeleteHostInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNewsReportResponse> deleteNewsReport(
            DeleteNewsReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNewsReportRequest, DeleteNewsReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOperationsInsightsPrivateEndpointResponse>
            deleteOperationsInsightsPrivateEndpoint(
                    DeleteOperationsInsightsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperationsInsightsPrivateEndpointRequest,
                                    DeleteOperationsInsightsPrivateEndpointResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOperationsInsightsWarehouseResponse>
            deleteOperationsInsightsWarehouse(
                    DeleteOperationsInsightsWarehouseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperationsInsightsWarehouseRequest,
                                    DeleteOperationsInsightsWarehouseResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOperationsInsightsWarehouseUserResponse>
            deleteOperationsInsightsWarehouseUser(
                    DeleteOperationsInsightsWarehouseUserRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperationsInsightsWarehouseUserRequest,
                                    DeleteOperationsInsightsWarehouseUserResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOpsiConfigurationResponse> deleteOpsiConfiguration(
            DeleteOpsiConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOpsiConfigurationRequest, DeleteOpsiConfigurationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableAutonomousDatabaseInsightAdvancedFeaturesResponse>
            disableAutonomousDatabaseInsightAdvancedFeatures(
                    DisableAutonomousDatabaseInsightAdvancedFeaturesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutonomousDatabaseInsightAdvancedFeaturesRequest,
                                    DisableAutonomousDatabaseInsightAdvancedFeaturesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableAwrHubSourceResponse> disableAwrHubSource(
            DisableAwrHubSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableAwrHubSourceRequest, DisableAwrHubSourceResponse>
                    handler) {

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");

        return clientCall(request, DisableAwrHubSourceResponse::builder)
                .logger(LOG, "disableAwrHubSource")
                .serviceDetails(
                        "OperationsInsights",
                        "DisableAwrHubSource",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubSources/DisableAwrHubSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableAwrHubSourceRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .appendPathParam("actions")
                .appendPathParam("disable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableAwrHubSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableAwrHubSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableDatabaseInsightResponse> disableDatabaseInsight(
            DisableDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableDatabaseInsightRequest, DisableDatabaseInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExadataInsightResponse> disableExadataInsight(
            DisableExadataInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableExadataInsightRequest, DisableExadataInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableHostInsightResponse> disableHostInsight(
            DisableHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableHostInsightRequest, DisableHostInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadOperationsInsightsWarehouseWalletResponse>
            downloadOperationsInsightsWarehouseWallet(
                    DownloadOperationsInsightsWarehouseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadOperationsInsightsWarehouseWalletRequest,
                                    DownloadOperationsInsightsWarehouseWalletResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableAutonomousDatabaseInsightAdvancedFeaturesResponse>
            enableAutonomousDatabaseInsightAdvancedFeatures(
                    EnableAutonomousDatabaseInsightAdvancedFeaturesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutonomousDatabaseInsightAdvancedFeaturesRequest,
                                    EnableAutonomousDatabaseInsightAdvancedFeaturesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableAwrHubSourceResponse> enableAwrHubSource(
            EnableAwrHubSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableAwrHubSourceRequest, EnableAwrHubSourceResponse>
                    handler) {

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");

        return clientCall(request, EnableAwrHubSourceResponse::builder)
                .logger(LOG, "enableAwrHubSource")
                .serviceDetails(
                        "OperationsInsights",
                        "EnableAwrHubSource",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubSources/EnableAwrHubSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableAwrHubSourceRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .appendPathParam("actions")
                .appendPathParam("enable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", EnableAwrHubSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableAwrHubSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableDatabaseInsightResponse> enableDatabaseInsight(
            EnableDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableDatabaseInsightRequest, EnableDatabaseInsightResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExadataInsightResponse> enableExadataInsight(
            EnableExadataInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableExadataInsightRequest, EnableExadataInsightResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableHostInsightResponse> enableHostInsight(
            EnableHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableHostInsightRequest, EnableHostInsightResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAwrDatabaseReportResponse> getAwrDatabaseReport(
            GetAwrDatabaseReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDatabaseReportRequest, GetAwrDatabaseReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAwrDatabaseSqlReportResponse> getAwrDatabaseSqlReport(
            GetAwrDatabaseSqlReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDatabaseSqlReportRequest, GetAwrDatabaseSqlReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAwrHubResponse> getAwrHub(
            GetAwrHubRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAwrHubRequest, GetAwrHubResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAwrHubObjectResponse> getAwrHubObject(
            GetAwrHubObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAwrHubObjectRequest, GetAwrHubObjectResponse>
                    handler) {

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        return clientCall(request, GetAwrHubObjectResponse::builder)
                .logger(LOG, "getAwrHubObject")
                .serviceDetails(
                        "OperationsInsights",
                        "GetAwrHubObject",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubObjects/GetAwrHubObject")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAwrHubObjectRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubObjects")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .appendPathParam("o")
                .appendPathParam(request.getObjectName())
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(java.io.InputStream.class, GetAwrHubObjectResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetAwrHubObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetAwrHubObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAwrHubObjectResponse.Builder::etag)
                .handleResponseHeadersMap("opc-meta-", GetAwrHubObjectResponse.Builder::opcMeta)
                .handleResponseHeaderLong(
                        "content-length", GetAwrHubObjectResponse.Builder::contentLength)
                .handleResponseHeaderRange(
                        "content-range", GetAwrHubObjectResponse.Builder::contentRange)
                .handleResponseHeaderString(
                        "content-md5", GetAwrHubObjectResponse.Builder::contentMd5)
                .handleResponseHeaderString(
                        "opc-multipart-md5", GetAwrHubObjectResponse.Builder::opcMultipartMd5)
                .handleResponseHeaderString(
                        "content-type", GetAwrHubObjectResponse.Builder::contentType)
                .handleResponseHeaderString(
                        "content-language", GetAwrHubObjectResponse.Builder::contentLanguage)
                .handleResponseHeaderString(
                        "content-encoding", GetAwrHubObjectResponse.Builder::contentEncoding)
                .handleResponseHeaderString(
                        "cache-control", GetAwrHubObjectResponse.Builder::cacheControl)
                .handleResponseHeaderString(
                        "content-disposition", GetAwrHubObjectResponse.Builder::contentDisposition)
                .handleResponseHeaderDate(
                        "last-modified", GetAwrHubObjectResponse.Builder::lastModified)
                .handleResponseHeaderEnum(
                        "storage-tier",
                        com.oracle.bmc.opsi.responses.GetAwrHubObjectResponse.StorageTier::create,
                        GetAwrHubObjectResponse.Builder::storageTier)
                .handleResponseHeaderEnum(
                        "archival-state",
                        com.oracle.bmc.opsi.responses.GetAwrHubObjectResponse.ArchivalState::create,
                        GetAwrHubObjectResponse.Builder::archivalState)
                .handleResponseHeaderDate(
                        "time-of-archival", GetAwrHubObjectResponse.Builder::timeOfArchival)
                .handleResponseHeaderString(
                        "version-id", GetAwrHubObjectResponse.Builder::versionId)
                .handleResponseHeaderDate("expires", GetAwrHubObjectResponse.Builder::expires)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAwrHubSourceResponse> getAwrHubSource(
            GetAwrHubSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAwrHubSourceRequest, GetAwrHubSourceResponse>
                    handler) {

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");

        return clientCall(request, GetAwrHubSourceResponse::builder)
                .logger(LOG, "getAwrHubSource")
                .serviceDetails(
                        "OperationsInsights",
                        "GetAwrHubSource",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubSources/GetAwrHubSource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAwrHubSourceRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrHubSource.class,
                        GetAwrHubSourceResponse.Builder::awrHubSource)
                .handleResponseHeaderString("etag", GetAwrHubSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAwrHubSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAwrReportResponse> getAwrReport(
            GetAwrReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAwrReportRequest, GetAwrReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseInsightResponse> getDatabaseInsight(
            GetDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseInsightRequest, GetDatabaseInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEnterpriseManagerBridgeResponse>
            getEnterpriseManagerBridge(
                    GetEnterpriseManagerBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetEnterpriseManagerBridgeRequest,
                                    GetEnterpriseManagerBridgeResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExadataInsightResponse> getExadataInsight(
            GetExadataInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExadataInsightRequest, GetExadataInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHostInsightResponse> getHostInsight(
            GetHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHostInsightRequest, GetHostInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNewsReportResponse> getNewsReport(
            GetNewsReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetNewsReportRequest, GetNewsReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOperationsInsightsPrivateEndpointResponse>
            getOperationsInsightsPrivateEndpoint(
                    GetOperationsInsightsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOperationsInsightsPrivateEndpointRequest,
                                    GetOperationsInsightsPrivateEndpointResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOperationsInsightsWarehouseResponse>
            getOperationsInsightsWarehouse(
                    GetOperationsInsightsWarehouseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOperationsInsightsWarehouseRequest,
                                    GetOperationsInsightsWarehouseResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOperationsInsightsWarehouseUserResponse>
            getOperationsInsightsWarehouseUser(
                    GetOperationsInsightsWarehouseUserRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOperationsInsightsWarehouseUserRequest,
                                    GetOperationsInsightsWarehouseUserResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOpsiConfigurationResponse> getOpsiConfiguration(
            GetOpsiConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOpsiConfigurationRequest, GetOpsiConfigurationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOpsiDataObjectResponse> getOpsiDataObject(
            GetOpsiDataObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOpsiDataObjectRequest, GetOpsiDataObjectResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<HeadAwrHubObjectResponse> headAwrHubObject(
            HeadAwrHubObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HeadAwrHubObjectRequest, HeadAwrHubObjectResponse>
                    handler) {

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        return clientCall(request, HeadAwrHubObjectResponse::builder)
                .logger(LOG, "headAwrHubObject")
                .serviceDetails(
                        "OperationsInsights",
                        "HeadAwrHubObject",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubObjects/HeadAwrHubObject")
                .method(com.oracle.bmc.http.client.Method.HEAD)
                .requestBuilder(HeadAwrHubObjectRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubObjects")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .appendPathParam("o")
                .appendPathParam(request.getObjectName())
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        HeadAwrHubObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", HeadAwrHubObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", HeadAwrHubObjectResponse.Builder::etag)
                .handleResponseHeadersMap("opc-meta-", HeadAwrHubObjectResponse.Builder::opcMeta)
                .handleResponseHeaderLong(
                        "content-length", HeadAwrHubObjectResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-md5", HeadAwrHubObjectResponse.Builder::contentMd5)
                .handleResponseHeaderString(
                        "opc-multipart-md5", HeadAwrHubObjectResponse.Builder::opcMultipartMd5)
                .handleResponseHeaderString(
                        "content-type", HeadAwrHubObjectResponse.Builder::contentType)
                .handleResponseHeaderString(
                        "content-language", HeadAwrHubObjectResponse.Builder::contentLanguage)
                .handleResponseHeaderString(
                        "content-encoding", HeadAwrHubObjectResponse.Builder::contentEncoding)
                .handleResponseHeaderString(
                        "cache-control", HeadAwrHubObjectResponse.Builder::cacheControl)
                .handleResponseHeaderString(
                        "content-disposition", HeadAwrHubObjectResponse.Builder::contentDisposition)
                .handleResponseHeaderDate(
                        "last-modified", HeadAwrHubObjectResponse.Builder::lastModified)
                .handleResponseHeaderEnum(
                        "storage-tier",
                        com.oracle.bmc.opsi.responses.HeadAwrHubObjectResponse.StorageTier::create,
                        HeadAwrHubObjectResponse.Builder::storageTier)
                .handleResponseHeaderEnum(
                        "archival-state",
                        com.oracle.bmc.opsi.responses.HeadAwrHubObjectResponse.ArchivalState
                                ::create,
                        HeadAwrHubObjectResponse.Builder::archivalState)
                .handleResponseHeaderDate(
                        "time-of-archival", HeadAwrHubObjectResponse.Builder::timeOfArchival)
                .handleResponseHeaderString(
                        "version-id", HeadAwrHubObjectResponse.Builder::versionId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestAddmReportsResponse> ingestAddmReports(
            IngestAddmReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestAddmReportsRequest, IngestAddmReportsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestDatabaseConfigurationResponse>
            ingestDatabaseConfiguration(
                    IngestDatabaseConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    IngestDatabaseConfigurationRequest,
                                    IngestDatabaseConfigurationResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestHostConfigurationResponse> ingestHostConfiguration(
            IngestHostConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestHostConfigurationRequest, IngestHostConfigurationResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestHostMetricsResponse> ingestHostMetrics(
            IngestHostMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestHostMetricsRequest, IngestHostMetricsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestMySqlSqlStatsResponse> ingestMySqlSqlStats(
            IngestMySqlSqlStatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestMySqlSqlStatsRequest, IngestMySqlSqlStatsResponse>
                    handler) {
        Objects.requireNonNull(
                request.getIngestMySqlSqlStatsDetails(), "ingestMySqlSqlStatsDetails is required");

        return clientCall(request, IngestMySqlSqlStatsResponse::builder)
                .logger(LOG, "ingestMySqlSqlStats")
                .serviceDetails(
                        "OperationsInsights",
                        "IngestMySqlSqlStats",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestMySqlSqlStats")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestMySqlSqlStatsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("actions")
                .appendPathParam("ingestMySqlSqlStatsMetric")
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.IngestMySqlSqlStatsResponseDetails.class,
                        IngestMySqlSqlStatsResponse.Builder::ingestMySqlSqlStatsResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", IngestMySqlSqlStatsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IngestMySqlSqlStatsResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestMySqlSqlTextResponse> ingestMySqlSqlText(
            IngestMySqlSqlTextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestMySqlSqlTextRequest, IngestMySqlSqlTextResponse>
                    handler) {
        Objects.requireNonNull(
                request.getIngestMySqlSqlTextDetails(), "ingestMySqlSqlTextDetails is required");

        return clientCall(request, IngestMySqlSqlTextResponse::builder)
                .logger(LOG, "ingestMySqlSqlText")
                .serviceDetails(
                        "OperationsInsights",
                        "IngestMySqlSqlText",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestMySqlSqlText")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestMySqlSqlTextRequest::builder)
                .basePath("/20200630")
                .appendPathParam("databaseInsights")
                .appendPathParam("actions")
                .appendPathParam("ingestMySqlSqlText")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.opsi.model.IngestMySqlSqlTextResponseDetails.class,
                        IngestMySqlSqlTextResponse.Builder::ingestMySqlSqlTextResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", IngestMySqlSqlTextResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IngestMySqlSqlTextResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestSqlBucketResponse> ingestSqlBucket(
            IngestSqlBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestSqlBucketRequest, IngestSqlBucketResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestSqlPlanLinesResponse> ingestSqlPlanLines(
            IngestSqlPlanLinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestSqlPlanLinesRequest, IngestSqlPlanLinesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestSqlStatsResponse> ingestSqlStats(
            IngestSqlStatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestSqlStatsRequest, IngestSqlStatsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestSqlTextResponse> ingestSqlText(
            IngestSqlTextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<IngestSqlTextRequest, IngestSqlTextResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAddmDbFindingCategoriesResponse>
            listAddmDbFindingCategories(
                    ListAddmDbFindingCategoriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAddmDbFindingCategoriesRequest,
                                    ListAddmDbFindingCategoriesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAddmDbFindingsTimeSeriesResponse>
            listAddmDbFindingsTimeSeries(
                    ListAddmDbFindingsTimeSeriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAddmDbFindingsTimeSeriesRequest,
                                    ListAddmDbFindingsTimeSeriesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAddmDbParameterCategoriesResponse>
            listAddmDbParameterCategories(
                    ListAddmDbParameterCategoriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAddmDbParameterCategoriesRequest,
                                    ListAddmDbParameterCategoriesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAddmDbRecommendationCategoriesResponse>
            listAddmDbRecommendationCategories(
                    ListAddmDbRecommendationCategoriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAddmDbRecommendationCategoriesRequest,
                                    ListAddmDbRecommendationCategoriesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAddmDbRecommendationsTimeSeriesResponse>
            listAddmDbRecommendationsTimeSeries(
                    ListAddmDbRecommendationsTimeSeriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAddmDbRecommendationsTimeSeriesRequest,
                                    ListAddmDbRecommendationsTimeSeriesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAddmDbsResponse> listAddmDbs(
            ListAddmDbsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAddmDbsRequest, ListAddmDbsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAwrDatabaseSnapshotsResponse> listAwrDatabaseSnapshots(
            ListAwrDatabaseSnapshotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAwrDatabaseSnapshotsRequest, ListAwrDatabaseSnapshotsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAwrDatabasesResponse> listAwrDatabases(
            ListAwrDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAwrDatabasesRequest, ListAwrDatabasesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAwrHubObjectsResponse> listAwrHubObjects(
            ListAwrHubObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAwrHubObjectsRequest, ListAwrHubObjectsResponse>
                    handler) {

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");

        return clientCall(request, ListAwrHubObjectsResponse::builder)
                .logger(LOG, "listAwrHubObjects")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAwrHubObjects",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubObjects/ListAwrHubObjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAwrHubObjectsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubObjects")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .appendPathParam("o")
                .appendQueryParam("prefix", request.getPrefix())
                .appendQueryParam("start", request.getStart())
                .appendQueryParam("end", request.getEnd())
                .appendQueryParam("delimiter", request.getDelimiter())
                .appendQueryParam("startAfter", request.getStartAfter())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("fields", request.getFields())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.ListObjects.class,
                        ListAwrHubObjectsResponse.Builder::listObjects)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListAwrHubObjectsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListAwrHubObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAwrHubObjectsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAwrHubSourcesResponse> listAwrHubSources(
            ListAwrHubSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAwrHubSourcesRequest, ListAwrHubSourcesResponse>
                    handler) {
        Objects.requireNonNull(request.getAwrHubId(), "awrHubId is required");

        return clientCall(request, ListAwrHubSourcesResponse::builder)
                .logger(LOG, "listAwrHubSources")
                .serviceDetails(
                        "OperationsInsights",
                        "ListAwrHubSources",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubSources/ListAwrHubSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAwrHubSourcesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubSources")
                .appendQueryParam("awrHubId", request.getAwrHubId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("awrHubSourceId", request.getAwrHubSourceId())
                .appendListQueryParam(
                        "sourceType",
                        request.getSourceType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
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
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.AwrHubSourceSummaryCollection.class,
                        ListAwrHubSourcesResponse.Builder::awrHubSourceSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAwrHubSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAwrHubSourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAwrHubsResponse> listAwrHubs(
            ListAwrHubsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAwrHubsRequest, ListAwrHubsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAwrSnapshotsResponse> listAwrSnapshots(
            ListAwrSnapshotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAwrSnapshotsRequest, ListAwrSnapshotsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseConfigurationsResponse>
            listDatabaseConfigurations(
                    ListDatabaseConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseConfigurationsRequest,
                                    ListDatabaseConfigurationsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseInsightsResponse> listDatabaseInsights(
            ListDatabaseInsightsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEnterpriseManagerBridgesResponse>
            listEnterpriseManagerBridges(
                    ListEnterpriseManagerBridgesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListEnterpriseManagerBridgesRequest,
                                    ListEnterpriseManagerBridgesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExadataConfigurationsResponse> listExadataConfigurations(
            ListExadataConfigurationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExadataConfigurationsRequest, ListExadataConfigurationsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExadataInsightsResponse> listExadataInsights(
            ListExadataInsightsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExadataInsightsRequest, ListExadataInsightsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListHostConfigurationsResponse> listHostConfigurations(
            ListHostConfigurationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHostConfigurationsRequest, ListHostConfigurationsResponse>
                    handler) {

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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListHostInsightsResponse> listHostInsights(
            ListHostInsightsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHostInsightsRequest, ListHostInsightsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListHostedEntitiesResponse> listHostedEntities(
            ListHostedEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHostedEntitiesRequest, ListHostedEntitiesResponse>
                    handler) {
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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.HostedEntityCollection.class,
                        ListHostedEntitiesResponse.Builder::hostedEntityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHostedEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHostedEntitiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListImportableAgentEntitiesResponse>
            listImportableAgentEntities(
                    ListImportableAgentEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListImportableAgentEntitiesRequest,
                                    ListImportableAgentEntitiesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListImportableComputeEntitiesResponse>
            listImportableComputeEntities(
                    ListImportableComputeEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListImportableComputeEntitiesRequest,
                                    ListImportableComputeEntitiesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListImportableEnterpriseManagerEntitiesResponse>
            listImportableEnterpriseManagerEntities(
                    ListImportableEnterpriseManagerEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListImportableEnterpriseManagerEntitiesRequest,
                                    ListImportableEnterpriseManagerEntitiesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNewsReportsResponse> listNewsReports(
            ListNewsReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNewsReportsRequest, ListNewsReportsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOperationsInsightsPrivateEndpointsResponse>
            listOperationsInsightsPrivateEndpoints(
                    ListOperationsInsightsPrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOperationsInsightsPrivateEndpointsRequest,
                                    ListOperationsInsightsPrivateEndpointsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOperationsInsightsWarehouseUsersResponse>
            listOperationsInsightsWarehouseUsers(
                    ListOperationsInsightsWarehouseUsersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOperationsInsightsWarehouseUsersRequest,
                                    ListOperationsInsightsWarehouseUsersResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOperationsInsightsWarehousesResponse>
            listOperationsInsightsWarehouses(
                    ListOperationsInsightsWarehousesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOperationsInsightsWarehousesRequest,
                                    ListOperationsInsightsWarehousesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOpsiConfigurationsResponse> listOpsiConfigurations(
            ListOpsiConfigurationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOpsiConfigurationsRequest, ListOpsiConfigurationsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOpsiDataObjectsResponse> listOpsiDataObjects(
            ListOpsiDataObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOpsiDataObjectsRequest, ListOpsiDataObjectsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlPlansResponse> listSqlPlans(
            ListSqlPlansRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSqlPlansRequest, ListSqlPlansResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlSearchesResponse> listSqlSearches(
            ListSqlSearchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlSearchesRequest, ListSqlSearchesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlTextsResponse> listSqlTexts(
            ListSqlTextsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSqlTextsRequest, ListSqlTextsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWarehouseDataObjectsResponse> listWarehouseDataObjects(
            ListWarehouseDataObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWarehouseDataObjectsRequest, ListWarehouseDataObjectsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutAwrHubObjectResponse> putAwrHubObject(
            PutAwrHubObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutAwrHubObjectRequest, PutAwrHubObjectResponse>
                    handler) {
        Objects.requireNonNull(request.getPutAwrHubObjectBody(), "putAwrHubObjectBody is required");

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        return clientCall(request, PutAwrHubObjectResponse::builder)
                .logger(LOG, "putAwrHubObject")
                .serviceDetails(
                        "OperationsInsights",
                        "PutAwrHubObject",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubObjects/PutAwrHubObject")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutAwrHubObjectRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20200630")
                .appendPathParam("awrHubObjects")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .appendPathParam("o")
                .appendPathParam(request.getObjectName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        PutAwrHubObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PutAwrHubObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-content-md5", PutAwrHubObjectResponse.Builder::opcContentMd5)
                .handleResponseHeaderDate(
                        "last-modified", PutAwrHubObjectResponse.Builder::lastModified)
                .handleResponseHeaderString(
                        "version-id", PutAwrHubObjectResponse.Builder::versionId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<QueryOpsiDataObjectDataResponse> queryOpsiDataObjectData(
            QueryOpsiDataObjectDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            QueryOpsiDataObjectDataRequest, QueryOpsiDataObjectDataResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<QueryWarehouseDataObjectDataResponse>
            queryWarehouseDataObjectData(
                    QueryWarehouseDataObjectDataRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    QueryWarehouseDataObjectDataRequest,
                                    QueryWarehouseDataObjectDataResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateOperationsInsightsWarehouseWalletResponse>
            rotateOperationsInsightsWarehouseWallet(
                    RotateOperationsInsightsWarehouseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateOperationsInsightsWarehouseWalletRequest,
                                    RotateOperationsInsightsWarehouseWalletResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAddmDbFindingsResponse> summarizeAddmDbFindings(
            SummarizeAddmDbFindingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAddmDbFindingsRequest, SummarizeAddmDbFindingsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAddmDbParameterChangesResponse>
            summarizeAddmDbParameterChanges(
                    SummarizeAddmDbParameterChangesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAddmDbParameterChangesRequest,
                                    SummarizeAddmDbParameterChangesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAddmDbParametersResponse> summarizeAddmDbParameters(
            SummarizeAddmDbParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAddmDbParametersRequest, SummarizeAddmDbParametersResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAddmDbRecommendationsResponse>
            summarizeAddmDbRecommendations(
                    SummarizeAddmDbRecommendationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAddmDbRecommendationsRequest,
                                    SummarizeAddmDbRecommendationsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAddmDbSchemaObjectsResponse>
            summarizeAddmDbSchemaObjects(
                    SummarizeAddmDbSchemaObjectsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAddmDbSchemaObjectsRequest,
                                    SummarizeAddmDbSchemaObjectsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAddmDbSqlStatementsResponse>
            summarizeAddmDbSqlStatements(
                    SummarizeAddmDbSqlStatementsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAddmDbSqlStatementsRequest,
                                    SummarizeAddmDbSqlStatementsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDatabaseCpuUsagesResponse>
            summarizeAwrDatabaseCpuUsages(
                    SummarizeAwrDatabaseCpuUsagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseCpuUsagesRequest,
                                    SummarizeAwrDatabaseCpuUsagesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDatabaseMetricsResponse>
            summarizeAwrDatabaseMetrics(
                    SummarizeAwrDatabaseMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseMetricsRequest,
                                    SummarizeAwrDatabaseMetricsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDatabaseParameterChangesResponse>
            summarizeAwrDatabaseParameterChanges(
                    SummarizeAwrDatabaseParameterChangesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseParameterChangesRequest,
                                    SummarizeAwrDatabaseParameterChangesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDatabaseParametersResponse>
            summarizeAwrDatabaseParameters(
                    SummarizeAwrDatabaseParametersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseParametersRequest,
                                    SummarizeAwrDatabaseParametersResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDatabaseSnapshotRangesResponse>
            summarizeAwrDatabaseSnapshotRanges(
                    SummarizeAwrDatabaseSnapshotRangesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseSnapshotRangesRequest,
                                    SummarizeAwrDatabaseSnapshotRangesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDatabaseSysstatsResponse>
            summarizeAwrDatabaseSysstats(
                    SummarizeAwrDatabaseSysstatsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseSysstatsRequest,
                                    SummarizeAwrDatabaseSysstatsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDatabaseTopWaitEventsResponse>
            summarizeAwrDatabaseTopWaitEvents(
                    SummarizeAwrDatabaseTopWaitEventsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseTopWaitEventsRequest,
                                    SummarizeAwrDatabaseTopWaitEventsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDatabaseWaitEventBucketsResponse>
            summarizeAwrDatabaseWaitEventBuckets(
                    SummarizeAwrDatabaseWaitEventBucketsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseWaitEventBucketsRequest,
                                    SummarizeAwrDatabaseWaitEventBucketsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDatabaseWaitEventsResponse>
            summarizeAwrDatabaseWaitEvents(
                    SummarizeAwrDatabaseWaitEventsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseWaitEventsRequest,
                                    SummarizeAwrDatabaseWaitEventsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrSourcesSummariesResponse>
            summarizeAwrSourcesSummaries(
                    SummarizeAwrSourcesSummariesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrSourcesSummariesRequest,
                                    SummarizeAwrSourcesSummariesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeConfigurationItemsResponse>
            summarizeConfigurationItems(
                    SummarizeConfigurationItemsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeConfigurationItemsRequest,
                                    SummarizeConfigurationItemsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceCapacityTrendResponse>
            summarizeDatabaseInsightResourceCapacityTrend(
                    SummarizeDatabaseInsightResourceCapacityTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceCapacityTrendRequest,
                                    SummarizeDatabaseInsightResourceCapacityTrendResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceForecastTrendResponse>
            summarizeDatabaseInsightResourceForecastTrend(
                    SummarizeDatabaseInsightResourceForecastTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceForecastTrendRequest,
                                    SummarizeDatabaseInsightResourceForecastTrendResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceStatisticsResponse>
            summarizeDatabaseInsightResourceStatistics(
                    SummarizeDatabaseInsightResourceStatisticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceStatisticsRequest,
                                    SummarizeDatabaseInsightResourceStatisticsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceUsageResponse>
            summarizeDatabaseInsightResourceUsage(
                    SummarizeDatabaseInsightResourceUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUsageRequest,
                                    SummarizeDatabaseInsightResourceUsageResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceUsageTrendResponse>
            summarizeDatabaseInsightResourceUsageTrend(
                    SummarizeDatabaseInsightResourceUsageTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUsageTrendRequest,
                                    SummarizeDatabaseInsightResourceUsageTrendResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceUtilizationInsightResponse>
            summarizeDatabaseInsightResourceUtilizationInsight(
                    SummarizeDatabaseInsightResourceUtilizationInsightRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUtilizationInsightRequest,
                                    SummarizeDatabaseInsightResourceUtilizationInsightResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightTablespaceUsageTrendResponse>
            summarizeDatabaseInsightTablespaceUsageTrend(
                    SummarizeDatabaseInsightTablespaceUsageTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightTablespaceUsageTrendRequest,
                                    SummarizeDatabaseInsightTablespaceUsageTrendResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExadataInsightResourceCapacityTrendResponse>
            summarizeExadataInsightResourceCapacityTrend(
                    SummarizeExadataInsightResourceCapacityTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceCapacityTrendRequest,
                                    SummarizeExadataInsightResourceCapacityTrendResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    SummarizeExadataInsightResourceCapacityTrendAggregatedResponse>
            summarizeExadataInsightResourceCapacityTrendAggregated(
                    SummarizeExadataInsightResourceCapacityTrendAggregatedRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceCapacityTrendAggregatedRequest,
                                    SummarizeExadataInsightResourceCapacityTrendAggregatedResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExadataInsightResourceForecastTrendResponse>
            summarizeExadataInsightResourceForecastTrend(
                    SummarizeExadataInsightResourceForecastTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceForecastTrendRequest,
                                    SummarizeExadataInsightResourceForecastTrendResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    SummarizeExadataInsightResourceForecastTrendAggregatedResponse>
            summarizeExadataInsightResourceForecastTrendAggregated(
                    SummarizeExadataInsightResourceForecastTrendAggregatedRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceForecastTrendAggregatedRequest,
                                    SummarizeExadataInsightResourceForecastTrendAggregatedResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExadataInsightResourceStatisticsResponse>
            summarizeExadataInsightResourceStatistics(
                    SummarizeExadataInsightResourceStatisticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceStatisticsRequest,
                                    SummarizeExadataInsightResourceStatisticsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExadataInsightResourceUsageResponse>
            summarizeExadataInsightResourceUsage(
                    SummarizeExadataInsightResourceUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceUsageRequest,
                                    SummarizeExadataInsightResourceUsageResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExadataInsightResourceUsageAggregatedResponse>
            summarizeExadataInsightResourceUsageAggregated(
                    SummarizeExadataInsightResourceUsageAggregatedRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceUsageAggregatedRequest,
                                    SummarizeExadataInsightResourceUsageAggregatedResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExadataInsightResourceUtilizationInsightResponse>
            summarizeExadataInsightResourceUtilizationInsight(
                    SummarizeExadataInsightResourceUtilizationInsightRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceUtilizationInsightRequest,
                                    SummarizeExadataInsightResourceUtilizationInsightResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeExadataMembersResponse> summarizeExadataMembers(
            SummarizeExadataMembersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeExadataMembersRequest, SummarizeExadataMembersResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightDiskStatisticsResponse>
            summarizeHostInsightDiskStatistics(
                    SummarizeHostInsightDiskStatisticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightDiskStatisticsRequest,
                                    SummarizeHostInsightDiskStatisticsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getId(), "id is required");

        return clientCall(request, SummarizeHostInsightDiskStatisticsResponse::builder)
                .logger(LOG, "summarizeHostInsightDiskStatistics")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightDiskStatistics",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightDiskStatistics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightDiskStatisticsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("diskStatistics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("hostId", request.getHostId())
                .appendEnumQueryParam("statistic", request.getStatistic())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SummarizeHostInsightsDiskStatisticsCollection
                                .class,
                        SummarizeHostInsightDiskStatisticsResponse.Builder
                                ::summarizeHostInsightsDiskStatisticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightDiskStatisticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeHostInsightDiskStatisticsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightHostRecommendationResponse>
            summarizeHostInsightHostRecommendation(
                    SummarizeHostInsightHostRecommendationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightHostRecommendationRequest,
                                    SummarizeHostInsightHostRecommendationResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getId(), "id is required");

        Objects.requireNonNull(request.getResourceMetric(), "resourceMetric is required");

        return clientCall(request, SummarizeHostInsightHostRecommendationResponse::builder)
                .logger(LOG, "summarizeHostInsightHostRecommendation")
                .serviceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightHostRecommendation",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightHostRecommendation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeHostInsightHostRecommendationRequest::builder)
                .basePath("/20200630")
                .appendPathParam("hostInsights")
                .appendPathParam("hostRecommendation")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("resourceMetric", request.getResourceMetric())
                .appendQueryParam("analysisTimeInterval", request.getAnalysisTimeInterval())
                .appendQueryParam("timeIntervalStart", request.getTimeIntervalStart())
                .appendQueryParam("timeIntervalEnd", request.getTimeIntervalEnd())
                .appendQueryParam("hostId", request.getHostId())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("statistic", request.getStatistic())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opsi.model.SummarizeHostInsightHostRecommendationAggregation
                                .class,
                        SummarizeHostInsightHostRecommendationResponse.Builder
                                ::summarizeHostInsightHostRecommendationAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeHostInsightHostRecommendationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeHostInsightHostRecommendationResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightNetworkUsageTrendResponse>
            summarizeHostInsightNetworkUsageTrend(
                    SummarizeHostInsightNetworkUsageTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightNetworkUsageTrendRequest,
                                    SummarizeHostInsightNetworkUsageTrendResponse>
                            handler) {
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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceCapacityTrendResponse>
            summarizeHostInsightResourceCapacityTrend(
                    SummarizeHostInsightResourceCapacityTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceCapacityTrendRequest,
                                    SummarizeHostInsightResourceCapacityTrendResponse>
                            handler) {
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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceForecastTrendResponse>
            summarizeHostInsightResourceForecastTrend(
                    SummarizeHostInsightResourceForecastTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceForecastTrendRequest,
                                    SummarizeHostInsightResourceForecastTrendResponse>
                            handler) {
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
                .appendQueryParam("gpuId", request.getGpuId())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceStatisticsResponse>
            summarizeHostInsightResourceStatistics(
                    SummarizeHostInsightResourceStatisticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceStatisticsRequest,
                                    SummarizeHostInsightResourceStatisticsResponse>
                            handler) {
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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceUsageResponse>
            summarizeHostInsightResourceUsage(
                    SummarizeHostInsightResourceUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUsageRequest,
                                    SummarizeHostInsightResourceUsageResponse>
                            handler) {
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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceUsageTrendResponse>
            summarizeHostInsightResourceUsageTrend(
                    SummarizeHostInsightResourceUsageTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUsageTrendRequest,
                                    SummarizeHostInsightResourceUsageTrendResponse>
                            handler) {
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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceUtilizationInsightResponse>
            summarizeHostInsightResourceUtilizationInsight(
                    SummarizeHostInsightResourceUtilizationInsightRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUtilizationInsightRequest,
                                    SummarizeHostInsightResourceUtilizationInsightResponse>
                            handler) {
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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightStorageUsageTrendResponse>
            summarizeHostInsightStorageUsageTrend(
                    SummarizeHostInsightStorageUsageTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightStorageUsageTrendRequest,
                                    SummarizeHostInsightStorageUsageTrendResponse>
                            handler) {
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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightTopProcessesUsageResponse>
            summarizeHostInsightTopProcessesUsage(
                    SummarizeHostInsightTopProcessesUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightTopProcessesUsageRequest,
                                    SummarizeHostInsightTopProcessesUsageResponse>
                            handler) {
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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightTopProcessesUsageTrendResponse>
            summarizeHostInsightTopProcessesUsageTrend(
                    SummarizeHostInsightTopProcessesUsageTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightTopProcessesUsageTrendRequest,
                                    SummarizeHostInsightTopProcessesUsageTrendResponse>
                            handler) {
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
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeOperationsInsightsWarehouseResourceUsageResponse>
            summarizeOperationsInsightsWarehouseResourceUsage(
                    SummarizeOperationsInsightsWarehouseResourceUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeOperationsInsightsWarehouseResourceUsageRequest,
                                    SummarizeOperationsInsightsWarehouseResourceUsageResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlInsightsResponse> summarizeSqlInsights(
            SummarizeSqlInsightsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlInsightsRequest, SummarizeSqlInsightsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlPlanInsightsResponse> summarizeSqlPlanInsights(
            SummarizeSqlPlanInsightsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlPlanInsightsRequest, SummarizeSqlPlanInsightsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlResponseTimeDistributionsResponse>
            summarizeSqlResponseTimeDistributions(
                    SummarizeSqlResponseTimeDistributionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlResponseTimeDistributionsRequest,
                                    SummarizeSqlResponseTimeDistributionsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlStatisticsResponse> summarizeSqlStatistics(
            SummarizeSqlStatisticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlStatisticsRequest, SummarizeSqlStatisticsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlStatisticsTimeSeriesResponse>
            summarizeSqlStatisticsTimeSeries(
                    SummarizeSqlStatisticsTimeSeriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlStatisticsTimeSeriesRequest,
                                    SummarizeSqlStatisticsTimeSeriesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlStatisticsTimeSeriesByPlanResponse>
            summarizeSqlStatisticsTimeSeriesByPlan(
                    SummarizeSqlStatisticsTimeSeriesByPlanRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlStatisticsTimeSeriesByPlanRequest,
                                    SummarizeSqlStatisticsTimeSeriesByPlanResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAwrHubResponse> updateAwrHub(
            UpdateAwrHubRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateAwrHubRequest, UpdateAwrHubResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAwrHubSourceResponse> updateAwrHubSource(
            UpdateAwrHubSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAwrHubSourceRequest, UpdateAwrHubSourceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateAwrHubSourceDetails(), "updateAwrHubSourceDetails is required");

        Validate.notBlank(request.getAwrHubSourceId(), "awrHubSourceId must not be blank");

        return clientCall(request, UpdateAwrHubSourceResponse::builder)
                .logger(LOG, "updateAwrHubSource")
                .serviceDetails(
                        "OperationsInsights",
                        "UpdateAwrHubSource",
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubSources/UpdateAwrHubSource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAwrHubSourceRequest::builder)
                .basePath("/20200630")
                .appendPathParam("awrHubSources")
                .appendPathParam(request.getAwrHubSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAwrHubSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAwrHubSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseInsightResponse> updateDatabaseInsight(
            UpdateDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseInsightRequest, UpdateDatabaseInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnterpriseManagerBridgeResponse>
            updateEnterpriseManagerBridge(
                    UpdateEnterpriseManagerBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateEnterpriseManagerBridgeRequest,
                                    UpdateEnterpriseManagerBridgeResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExadataInsightResponse> updateExadataInsight(
            UpdateExadataInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExadataInsightRequest, UpdateExadataInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateHostInsightResponse> updateHostInsight(
            UpdateHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHostInsightRequest, UpdateHostInsightResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNewsReportResponse> updateNewsReport(
            UpdateNewsReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNewsReportRequest, UpdateNewsReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOperationsInsightsPrivateEndpointResponse>
            updateOperationsInsightsPrivateEndpoint(
                    UpdateOperationsInsightsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperationsInsightsPrivateEndpointRequest,
                                    UpdateOperationsInsightsPrivateEndpointResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOperationsInsightsWarehouseResponse>
            updateOperationsInsightsWarehouse(
                    UpdateOperationsInsightsWarehouseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperationsInsightsWarehouseRequest,
                                    UpdateOperationsInsightsWarehouseResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOperationsInsightsWarehouseUserResponse>
            updateOperationsInsightsWarehouseUser(
                    UpdateOperationsInsightsWarehouseUserRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperationsInsightsWarehouseUserRequest,
                                    UpdateOperationsInsightsWarehouseUserResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOpsiConfigurationResponse> updateOpsiConfiguration(
            UpdateOpsiConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOpsiConfigurationRequest, UpdateOpsiConfigurationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
