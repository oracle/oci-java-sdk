/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DataSafeClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DataSafe {
    /** Service instance for DataSafe. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATASAFE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datasafe.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataSafeClient.class);

    private final DataSafeWaiters waiters;

    private final DataSafePaginators paginators;

    DataSafeClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    DataSafeClient(
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
                                    .nameFormat("DataSafe-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DataSafeWaiters(executorService, this);

        this.paginators = new DataSafePaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DataSafeClient",
                            "downloadDiscoveryReport,downloadMaskingLog,downloadMaskingPolicy,downloadMaskingReport,downloadPrivilegeScript,downloadSecurityAssessmentReport,downloadSensitiveDataModel,downloadUserAssessmentReport,generateOnPremConnectorConfiguration,getReportContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataSafeClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public DataSafeClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataSafeClient(
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
    public ActivateTargetDatabaseResponse activateTargetDatabase(
            ActivateTargetDatabaseRequest request) {
        Objects.requireNonNull(
                request.getActivateTargetDatabaseDetails(),
                "activateTargetDatabaseDetails is required");

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, ActivateTargetDatabaseResponse::builder)
                .logger(LOG, "activateTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "ActivateTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ActivateTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateTargetDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ActivateTargetDatabaseResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public AddMaskingColumnsFromSdmResponse addMaskingColumnsFromSdm(
            AddMaskingColumnsFromSdmRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        return clientCall(request, AddMaskingColumnsFromSdmResponse::builder)
                .logger(LOG, "addMaskingColumnsFromSdm")
                .serviceDetails(
                        "DataSafe",
                        "AddMaskingColumnsFromSdm",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/AddMaskingColumnsFromSdm")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddMaskingColumnsFromSdmRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("actions")
                .appendPathParam("addMaskingColumnsFromSdm")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddMaskingColumnsFromSdmResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AddMaskingColumnsFromSdmResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public AlertsUpdateResponse alertsUpdate(AlertsUpdateRequest request) {
        Objects.requireNonNull(request.getAlertsUpdateDetails(), "alertsUpdateDetails is required");

        return clientCall(request, AlertsUpdateResponse::builder)
                .logger(LOG, "alertsUpdate")
                .serviceDetails(
                        "DataSafe",
                        "AlertsUpdate",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/AlertsUpdate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AlertsUpdateRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alerts")
                .appendPathParam("actions")
                .appendPathParam("updateAll")
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", AlertsUpdateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AlertsUpdateResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ApplyDiscoveryJobResultsResponse applyDiscoveryJobResults(
            ApplyDiscoveryJobResultsRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getApplyDiscoveryJobResultsDetails(),
                "applyDiscoveryJobResultsDetails is required");

        return clientCall(request, ApplyDiscoveryJobResultsResponse::builder)
                .logger(LOG, "applyDiscoveryJobResults")
                .serviceDetails(
                        "DataSafe",
                        "ApplyDiscoveryJobResults",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ApplyDiscoveryJobResults")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApplyDiscoveryJobResultsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("sensitiveColumns")
                .appendPathParam("actions")
                .appendPathParam("applyDiscoveryJobResults")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ApplyDiscoveryJobResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ApplyDiscoveryJobResultsResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ApplySdmMaskingPolicyDifferenceResponse applySdmMaskingPolicyDifference(
            ApplySdmMaskingPolicyDifferenceRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getApplySdmMaskingPolicyDifferenceDetails(),
                "applySdmMaskingPolicyDifferenceDetails is required");

        return clientCall(request, ApplySdmMaskingPolicyDifferenceResponse::builder)
                .logger(LOG, "applySdmMaskingPolicyDifference")
                .serviceDetails(
                        "DataSafe",
                        "ApplySdmMaskingPolicyDifference",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ApplySdmMaskingPolicyDifference")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApplySdmMaskingPolicyDifferenceRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("maskingColumns")
                .appendPathParam("actions")
                .appendPathParam("applyDifferenceToMaskingColumns")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ApplySdmMaskingPolicyDifferenceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ApplySdmMaskingPolicyDifferenceResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CalculateAuditVolumeAvailableResponse calculateAuditVolumeAvailable(
            CalculateAuditVolumeAvailableRequest request) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");
        Objects.requireNonNull(
                request.getCalculateAuditVolumeAvailableDetails(),
                "calculateAuditVolumeAvailableDetails is required");

        return clientCall(request, CalculateAuditVolumeAvailableResponse::builder)
                .logger(LOG, "calculateAuditVolumeAvailable")
                .serviceDetails(
                        "DataSafe",
                        "CalculateAuditVolumeAvailable",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/CalculateAuditVolumeAvailable")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CalculateAuditVolumeAvailableRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .appendPathParam("actions")
                .appendPathParam("calculateAuditVolumeAvailable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CalculateAuditVolumeAvailableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CalculateAuditVolumeAvailableResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CalculateAuditVolumeCollectedResponse calculateAuditVolumeCollected(
            CalculateAuditVolumeCollectedRequest request) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");
        Objects.requireNonNull(
                request.getCalculateAuditVolumeCollectedDetails(),
                "calculateAuditVolumeCollectedDetails is required");

        return clientCall(request, CalculateAuditVolumeCollectedResponse::builder)
                .logger(LOG, "calculateAuditVolumeCollected")
                .serviceDetails(
                        "DataSafe",
                        "CalculateAuditVolumeCollected",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/CalculateAuditVolumeCollected")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CalculateAuditVolumeCollectedRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .appendPathParam("actions")
                .appendPathParam("calculateAuditVolumeCollected")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CalculateAuditVolumeCollectedResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CalculateAuditVolumeCollectedResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "DataSafe",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20181201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", CancelWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeAlertCompartmentResponse changeAlertCompartment(
            ChangeAlertCompartmentRequest request) {

        Validate.notBlank(request.getAlertId(), "alertId must not be blank");
        Objects.requireNonNull(
                request.getChangeAlertCompartmentDetails(),
                "changeAlertCompartmentDetails is required");

        return clientCall(request, ChangeAlertCompartmentResponse::builder)
                .logger(LOG, "changeAlertCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeAlertCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/ChangeAlertCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAlertCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alerts")
                .appendPathParam(request.getAlertId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeAlertCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeAuditArchiveRetrievalCompartmentResponse changeAuditArchiveRetrievalCompartment(
            ChangeAuditArchiveRetrievalCompartmentRequest request) {

        Validate.notBlank(
                request.getAuditArchiveRetrievalId(), "auditArchiveRetrievalId must not be blank");
        Objects.requireNonNull(
                request.getChangeAuditArchiveRetrievalCompartmentDetails(),
                "changeAuditArchiveRetrievalCompartmentDetails is required");

        return clientCall(request, ChangeAuditArchiveRetrievalCompartmentResponse::builder)
                .logger(LOG, "changeAuditArchiveRetrievalCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeAuditArchiveRetrievalCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/ChangeAuditArchiveRetrievalCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAuditArchiveRetrievalCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditArchiveRetrievals")
                .appendPathParam(request.getAuditArchiveRetrievalId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAuditArchiveRetrievalCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAuditArchiveRetrievalCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeAuditPolicyCompartmentResponse changeAuditPolicyCompartment(
            ChangeAuditPolicyCompartmentRequest request) {

        Validate.notBlank(request.getAuditPolicyId(), "auditPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeAuditPolicyCompartmentDetails(),
                "changeAuditPolicyCompartmentDetails is required");

        return clientCall(request, ChangeAuditPolicyCompartmentResponse::builder)
                .logger(LOG, "changeAuditPolicyCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeAuditPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/ChangeAuditPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAuditPolicyCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditPolicies")
                .appendPathParam(request.getAuditPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAuditPolicyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAuditPolicyCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeAuditProfileCompartmentResponse changeAuditProfileCompartment(
            ChangeAuditProfileCompartmentRequest request) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");
        Objects.requireNonNull(
                request.getChangeAuditProfileCompartmentDetails(),
                "changeAuditProfileCompartmentDetails is required");

        return clientCall(request, ChangeAuditProfileCompartmentResponse::builder)
                .logger(LOG, "changeAuditProfileCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeAuditProfileCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ChangeAuditProfileCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAuditProfileCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAuditProfileCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAuditProfileCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeDataSafePrivateEndpointCompartmentResponse
            changeDataSafePrivateEndpointCompartment(
                    ChangeDataSafePrivateEndpointCompartmentRequest request) {

        Validate.notBlank(
                request.getDataSafePrivateEndpointId(),
                "dataSafePrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeDataSafePrivateEndpointCompartmentDetails(),
                "changeDataSafePrivateEndpointCompartmentDetails is required");

        return clientCall(request, ChangeDataSafePrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeDataSafePrivateEndpointCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeDataSafePrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/ChangeDataSafePrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDataSafePrivateEndpointCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("dataSafePrivateEndpoints")
                .appendPathParam(request.getDataSafePrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDataSafePrivateEndpointCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDataSafePrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeDiscoveryJobCompartmentResponse changeDiscoveryJobCompartment(
            ChangeDiscoveryJobCompartmentRequest request) {

        Validate.notBlank(request.getDiscoveryJobId(), "discoveryJobId must not be blank");
        Objects.requireNonNull(
                request.getChangeDiscoveryJobCompartmentDetails(),
                "changeDiscoveryJobCompartmentDetails is required");

        return clientCall(request, ChangeDiscoveryJobCompartmentResponse::builder)
                .logger(LOG, "changeDiscoveryJobCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeDiscoveryJobCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ChangeDiscoveryJobCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDiscoveryJobCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("discoveryJobs")
                .appendPathParam(request.getDiscoveryJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDiscoveryJobCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeLibraryMaskingFormatCompartmentResponse changeLibraryMaskingFormatCompartment(
            ChangeLibraryMaskingFormatCompartmentRequest request) {

        Validate.notBlank(
                request.getLibraryMaskingFormatId(), "libraryMaskingFormatId must not be blank");
        Objects.requireNonNull(
                request.getChangeLibraryMaskingFormatCompartmentDetails(),
                "changeLibraryMaskingFormatCompartmentDetails is required");

        return clientCall(request, ChangeLibraryMaskingFormatCompartmentResponse::builder)
                .logger(LOG, "changeLibraryMaskingFormatCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeLibraryMaskingFormatCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/ChangeLibraryMaskingFormatCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLibraryMaskingFormatCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("libraryMaskingFormats")
                .appendPathParam(request.getLibraryMaskingFormatId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLibraryMaskingFormatCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeMaskingPolicyCompartmentResponse changeMaskingPolicyCompartment(
            ChangeMaskingPolicyCompartmentRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeMaskingPolicyCompartmentDetails(),
                "changeMaskingPolicyCompartmentDetails is required");

        return clientCall(request, ChangeMaskingPolicyCompartmentResponse::builder)
                .logger(LOG, "changeMaskingPolicyCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeMaskingPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ChangeMaskingPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMaskingPolicyCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMaskingPolicyCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeOnPremConnectorCompartmentResponse changeOnPremConnectorCompartment(
            ChangeOnPremConnectorCompartmentRequest request) {

        Validate.notBlank(request.getOnPremConnectorId(), "onPremConnectorId must not be blank");
        Objects.requireNonNull(
                request.getChangeOnPremConnectorCompartmentDetails(),
                "changeOnPremConnectorCompartmentDetails is required");

        return clientCall(request, ChangeOnPremConnectorCompartmentResponse::builder)
                .logger(LOG, "changeOnPremConnectorCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeOnPremConnectorCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/ChangeOnPremConnectorCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOnPremConnectorCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("onPremConnectors")
                .appendPathParam(request.getOnPremConnectorId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOnPremConnectorCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeReportCompartmentResponse changeReportCompartment(
            ChangeReportCompartmentRequest request) {

        Validate.notBlank(request.getReportId(), "reportId must not be blank");
        Objects.requireNonNull(
                request.getChangeReportCompartmentDetails(),
                "changeReportCompartmentDetails is required");

        return clientCall(request, ChangeReportCompartmentResponse::builder)
                .logger(LOG, "changeReportCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeReportCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/ChangeReportCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeReportCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reports")
                .appendPathParam(request.getReportId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeReportCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeReportCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeReportDefinitionCompartmentResponse changeReportDefinitionCompartment(
            ChangeReportDefinitionCompartmentRequest request) {

        Validate.notBlank(request.getReportDefinitionId(), "reportDefinitionId must not be blank");
        Objects.requireNonNull(
                request.getChangeReportDefinitionCompartmentDetails(),
                "changeReportDefinitionCompartmentDetails is required");

        return clientCall(request, ChangeReportDefinitionCompartmentResponse::builder)
                .logger(LOG, "changeReportDefinitionCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeReportDefinitionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/ChangeReportDefinitionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeReportDefinitionCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reportDefinitions")
                .appendPathParam(request.getReportDefinitionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeReportDefinitionCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeReportDefinitionCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeRetentionResponse changeRetention(ChangeRetentionRequest request) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");
        Objects.requireNonNull(
                request.getChangeRetentionDetails(), "changeRetentionDetails is required");

        return clientCall(request, ChangeRetentionResponse::builder)
                .logger(LOG, "changeRetention")
                .serviceDetails(
                        "DataSafe",
                        "ChangeRetention",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ChangeRetention")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRetentionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .appendPathParam("actions")
                .appendPathParam("changeRetention")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ChangeRetentionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeRetentionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeSdmMaskingPolicyDifferenceCompartmentResponse
            changeSdmMaskingPolicyDifferenceCompartment(
                    ChangeSdmMaskingPolicyDifferenceCompartmentRequest request) {

        Validate.notBlank(
                request.getSdmMaskingPolicyDifferenceId(),
                "sdmMaskingPolicyDifferenceId must not be blank");
        Objects.requireNonNull(
                request.getChangeSdmMaskingPolicyDifferenceCompartmentDetails(),
                "changeSdmMaskingPolicyDifferenceCompartmentDetails is required");

        return clientCall(request, ChangeSdmMaskingPolicyDifferenceCompartmentResponse::builder)
                .logger(LOG, "changeSdmMaskingPolicyDifferenceCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSdmMaskingPolicyDifferenceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/ChangeSdmMaskingPolicyDifferenceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSdmMaskingPolicyDifferenceCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sdmMaskingPolicyDifferences")
                .appendPathParam(request.getSdmMaskingPolicyDifferenceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSdmMaskingPolicyDifferenceCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeSecurityAssessmentCompartmentResponse changeSecurityAssessmentCompartment(
            ChangeSecurityAssessmentCompartmentRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecurityAssessmentCompartmentDetails(),
                "changeSecurityAssessmentCompartmentDetails is required");

        return clientCall(request, ChangeSecurityAssessmentCompartmentResponse::builder)
                .logger(LOG, "changeSecurityAssessmentCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSecurityAssessmentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ChangeSecurityAssessmentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSecurityAssessmentCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSecurityAssessmentCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeSensitiveDataModelCompartmentResponse changeSensitiveDataModelCompartment(
            ChangeSensitiveDataModelCompartmentRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getChangeSensitiveDataModelCompartmentDetails(),
                "changeSensitiveDataModelCompartmentDetails is required");

        return clientCall(request, ChangeSensitiveDataModelCompartmentResponse::builder)
                .logger(LOG, "changeSensitiveDataModelCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSensitiveDataModelCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ChangeSensitiveDataModelCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSensitiveDataModelCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSensitiveDataModelCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeSensitiveTypeCompartmentResponse changeSensitiveTypeCompartment(
            ChangeSensitiveTypeCompartmentRequest request) {

        Validate.notBlank(request.getSensitiveTypeId(), "sensitiveTypeId must not be blank");
        Objects.requireNonNull(
                request.getChangeSensitiveTypeCompartmentDetails(),
                "changeSensitiveTypeCompartmentDetails is required");

        return clientCall(request, ChangeSensitiveTypeCompartmentResponse::builder)
                .logger(LOG, "changeSensitiveTypeCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSensitiveTypeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/ChangeSensitiveTypeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSensitiveTypeCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypes")
                .appendPathParam(request.getSensitiveTypeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSensitiveTypeCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeTargetAlertPolicyAssociationCompartmentResponse
            changeTargetAlertPolicyAssociationCompartment(
                    ChangeTargetAlertPolicyAssociationCompartmentRequest request) {

        Validate.notBlank(
                request.getTargetAlertPolicyAssociationId(),
                "targetAlertPolicyAssociationId must not be blank");
        Objects.requireNonNull(
                request.getChangeTargetAlertPolicyAssociationCompartmentDetails(),
                "changeTargetAlertPolicyAssociationCompartmentDetails is required");

        return clientCall(request, ChangeTargetAlertPolicyAssociationCompartmentResponse::builder)
                .logger(LOG, "changeTargetAlertPolicyAssociationCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeTargetAlertPolicyAssociationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/ChangeTargetAlertPolicyAssociationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTargetAlertPolicyAssociationCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetAlertPolicyAssociations")
                .appendPathParam(request.getTargetAlertPolicyAssociationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeTargetAlertPolicyAssociationCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeTargetDatabaseCompartmentResponse changeTargetDatabaseCompartment(
            ChangeTargetDatabaseCompartmentRequest request) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeTargetDatabaseCompartmentDetails(),
                "changeTargetDatabaseCompartmentDetails is required");

        return clientCall(request, ChangeTargetDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeTargetDatabaseCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeTargetDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ChangeTargetDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTargetDatabaseCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeTargetDatabaseCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeUserAssessmentCompartmentResponse changeUserAssessmentCompartment(
            ChangeUserAssessmentCompartmentRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getChangeUserAssessmentCompartmentDetails(),
                "changeUserAssessmentCompartmentDetails is required");

        return clientCall(request, ChangeUserAssessmentCompartmentResponse::builder)
                .logger(LOG, "changeUserAssessmentCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeUserAssessmentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ChangeUserAssessmentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeUserAssessmentCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeUserAssessmentCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CompareSecurityAssessmentResponse compareSecurityAssessment(
            CompareSecurityAssessmentRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getCompareSecurityAssessmentDetails(),
                "compareSecurityAssessmentDetails is required");

        return clientCall(request, CompareSecurityAssessmentResponse::builder)
                .logger(LOG, "compareSecurityAssessment")
                .serviceDetails(
                        "DataSafe",
                        "CompareSecurityAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/CompareSecurityAssessment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CompareSecurityAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("compare")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CompareSecurityAssessmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CompareSecurityAssessmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CompareUserAssessmentResponse compareUserAssessment(
            CompareUserAssessmentRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getCompareUserAssessmentDetails(),
                "compareUserAssessmentDetails is required");

        return clientCall(request, CompareUserAssessmentResponse::builder)
                .logger(LOG, "compareUserAssessment")
                .serviceDetails(
                        "DataSafe",
                        "CompareUserAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/CompareUserAssessment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CompareUserAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("compare")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CompareUserAssessmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CompareUserAssessmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateAuditArchiveRetrievalResponse createAuditArchiveRetrieval(
            CreateAuditArchiveRetrievalRequest request) {
        Objects.requireNonNull(
                request.getCreateAuditArchiveRetrievalDetails(),
                "createAuditArchiveRetrievalDetails is required");

        return clientCall(request, CreateAuditArchiveRetrievalResponse::builder)
                .logger(LOG, "createAuditArchiveRetrieval")
                .serviceDetails("DataSafe", "CreateAuditArchiveRetrieval", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAuditArchiveRetrievalRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditArchiveRetrievals")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditArchiveRetrieval.class,
                        CreateAuditArchiveRetrievalResponse.Builder::auditArchiveRetrieval)
                .handleResponseHeaderString(
                        "etag", CreateAuditArchiveRetrievalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAuditArchiveRetrievalResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAuditArchiveRetrievalResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDataSafePrivateEndpointResponse createDataSafePrivateEndpoint(
            CreateDataSafePrivateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreateDataSafePrivateEndpointDetails(),
                "createDataSafePrivateEndpointDetails is required");

        return clientCall(request, CreateDataSafePrivateEndpointResponse::builder)
                .logger(LOG, "createDataSafePrivateEndpoint")
                .serviceDetails(
                        "DataSafe",
                        "CreateDataSafePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/CreateDataSafePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataSafePrivateEndpointRequest::builder)
                .basePath("/20181201")
                .appendPathParam("dataSafePrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.DataSafePrivateEndpoint.class,
                        CreateDataSafePrivateEndpointResponse.Builder::dataSafePrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", CreateDataSafePrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDataSafePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDataSafePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateDataSafePrivateEndpointResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDiscoveryJobResponse createDiscoveryJob(CreateDiscoveryJobRequest request) {
        Objects.requireNonNull(
                request.getCreateDiscoveryJobDetails(), "createDiscoveryJobDetails is required");

        return clientCall(request, CreateDiscoveryJobResponse::builder)
                .logger(LOG, "createDiscoveryJob")
                .serviceDetails("DataSafe", "CreateDiscoveryJob", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDiscoveryJobRequest::builder)
                .basePath("/20181201")
                .appendPathParam("discoveryJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.DiscoveryJob.class,
                        CreateDiscoveryJobResponse.Builder::discoveryJob)
                .handleResponseHeaderString("etag", CreateDiscoveryJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDiscoveryJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDiscoveryJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateDiscoveryJobResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateLibraryMaskingFormatResponse createLibraryMaskingFormat(
            CreateLibraryMaskingFormatRequest request) {
        Objects.requireNonNull(
                request.getCreateLibraryMaskingFormatDetails(),
                "createLibraryMaskingFormatDetails is required");

        return clientCall(request, CreateLibraryMaskingFormatResponse::builder)
                .logger(LOG, "createLibraryMaskingFormat")
                .serviceDetails(
                        "DataSafe",
                        "CreateLibraryMaskingFormat",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/CreateLibraryMaskingFormat")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLibraryMaskingFormatRequest::builder)
                .basePath("/20181201")
                .appendPathParam("libraryMaskingFormats")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.LibraryMaskingFormat.class,
                        CreateLibraryMaskingFormatResponse.Builder::libraryMaskingFormat)
                .handleResponseHeaderString(
                        "etag", CreateLibraryMaskingFormatResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateLibraryMaskingFormatResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLibraryMaskingFormatResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateLibraryMaskingFormatResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMaskingColumnResponse createMaskingColumn(CreateMaskingColumnRequest request) {
        Objects.requireNonNull(
                request.getCreateMaskingColumnDetails(), "createMaskingColumnDetails is required");

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        return clientCall(request, CreateMaskingColumnResponse::builder)
                .logger(LOG, "createMaskingColumn")
                .serviceDetails(
                        "DataSafe",
                        "CreateMaskingColumn",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/CreateMaskingColumn")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMaskingColumnRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("maskingColumns")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMaskingColumnResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMaskingColumnResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMaskingPolicyResponse createMaskingPolicy(CreateMaskingPolicyRequest request) {
        Objects.requireNonNull(
                request.getCreateMaskingPolicyDetails(), "createMaskingPolicyDetails is required");

        return clientCall(request, CreateMaskingPolicyResponse::builder)
                .logger(LOG, "createMaskingPolicy")
                .serviceDetails(
                        "DataSafe",
                        "CreateMaskingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/CreateMaskingPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMaskingPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingPolicy.class,
                        CreateMaskingPolicyResponse.Builder::maskingPolicy)
                .handleResponseHeaderString("etag", CreateMaskingPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMaskingPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMaskingPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateMaskingPolicyResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateOnPremConnectorResponse createOnPremConnector(
            CreateOnPremConnectorRequest request) {
        Objects.requireNonNull(
                request.getCreateOnPremConnectorDetails(),
                "createOnPremConnectorDetails is required");

        return clientCall(request, CreateOnPremConnectorResponse::builder)
                .logger(LOG, "createOnPremConnector")
                .serviceDetails(
                        "DataSafe",
                        "CreateOnPremConnector",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/CreateOnPremConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOnPremConnectorRequest::builder)
                .basePath("/20181201")
                .appendPathParam("onPremConnectors")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.OnPremConnector.class,
                        CreateOnPremConnectorResponse.Builder::onPremConnector)
                .handleResponseHeaderString("etag", CreateOnPremConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOnPremConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOnPremConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOnPremConnectorResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateReportDefinitionResponse createReportDefinition(
            CreateReportDefinitionRequest request) {
        Objects.requireNonNull(
                request.getCreateReportDefinitionDetails(),
                "createReportDefinitionDetails is required");

        return clientCall(request, CreateReportDefinitionResponse::builder)
                .logger(LOG, "createReportDefinition")
                .serviceDetails(
                        "DataSafe",
                        "CreateReportDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/CreateReportDefinition")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateReportDefinitionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reportDefinitions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.ReportDefinition.class,
                        CreateReportDefinitionResponse.Builder::reportDefinition)
                .handleResponseHeaderString("etag", CreateReportDefinitionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateReportDefinitionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateReportDefinitionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateSdmMaskingPolicyDifferenceResponse createSdmMaskingPolicyDifference(
            CreateSdmMaskingPolicyDifferenceRequest request) {
        Objects.requireNonNull(
                request.getCreateSdmMaskingPolicyDifferenceDetails(),
                "createSdmMaskingPolicyDifferenceDetails is required");

        return clientCall(request, CreateSdmMaskingPolicyDifferenceResponse::builder)
                .logger(LOG, "createSdmMaskingPolicyDifference")
                .serviceDetails("DataSafe", "CreateSdmMaskingPolicyDifference", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSdmMaskingPolicyDifferenceRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sdmMaskingPolicyDifferences")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifference.class,
                        CreateSdmMaskingPolicyDifferenceResponse.Builder
                                ::sdmMaskingPolicyDifference)
                .handleResponseHeaderString(
                        "etag", CreateSdmMaskingPolicyDifferenceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSdmMaskingPolicyDifferenceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateSdmMaskingPolicyDifferenceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSdmMaskingPolicyDifferenceResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateSecurityAssessmentResponse createSecurityAssessment(
            CreateSecurityAssessmentRequest request) {
        Objects.requireNonNull(
                request.getCreateSecurityAssessmentDetails(),
                "createSecurityAssessmentDetails is required");

        return clientCall(request, CreateSecurityAssessmentResponse::builder)
                .logger(LOG, "createSecurityAssessment")
                .serviceDetails(
                        "DataSafe",
                        "CreateSecurityAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/CreateSecurityAssessment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityAssessment.class,
                        CreateSecurityAssessmentResponse.Builder::securityAssessment)
                .handleResponseHeaderString("etag", CreateSecurityAssessmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSecurityAssessmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecurityAssessmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSecurityAssessmentResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateSensitiveColumnResponse createSensitiveColumn(
            CreateSensitiveColumnRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getCreateSensitiveColumnDetails(),
                "createSensitiveColumnDetails is required");

        return clientCall(request, CreateSensitiveColumnResponse::builder)
                .logger(LOG, "createSensitiveColumn")
                .serviceDetails(
                        "DataSafe",
                        "CreateSensitiveColumn",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/CreateSensitiveColumn")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSensitiveColumnRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("sensitiveColumns")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSensitiveColumnResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSensitiveColumnResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateSensitiveDataModelResponse createSensitiveDataModel(
            CreateSensitiveDataModelRequest request) {
        Objects.requireNonNull(
                request.getCreateSensitiveDataModelDetails(),
                "createSensitiveDataModelDetails is required");

        return clientCall(request, CreateSensitiveDataModelResponse::builder)
                .logger(LOG, "createSensitiveDataModel")
                .serviceDetails(
                        "DataSafe",
                        "CreateSensitiveDataModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/CreateSensitiveDataModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSensitiveDataModelRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveDataModel.class,
                        CreateSensitiveDataModelResponse.Builder::sensitiveDataModel)
                .handleResponseHeaderString("etag", CreateSensitiveDataModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSensitiveDataModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSensitiveDataModelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSensitiveDataModelResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateSensitiveTypeResponse createSensitiveType(CreateSensitiveTypeRequest request) {
        Objects.requireNonNull(
                request.getCreateSensitiveTypeDetails(), "createSensitiveTypeDetails is required");

        return clientCall(request, CreateSensitiveTypeResponse::builder)
                .logger(LOG, "createSensitiveType")
                .serviceDetails("DataSafe", "CreateSensitiveType", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSensitiveTypeRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveType.class,
                        CreateSensitiveTypeResponse.Builder::sensitiveType)
                .handleResponseHeaderString("etag", CreateSensitiveTypeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSensitiveTypeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSensitiveTypeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSensitiveTypeResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateTargetAlertPolicyAssociationResponse createTargetAlertPolicyAssociation(
            CreateTargetAlertPolicyAssociationRequest request) {
        Objects.requireNonNull(
                request.getCreateTargetAlertPolicyAssociationDetails(),
                "createTargetAlertPolicyAssociationDetails is required");

        return clientCall(request, CreateTargetAlertPolicyAssociationResponse::builder)
                .logger(LOG, "createTargetAlertPolicyAssociation")
                .serviceDetails(
                        "DataSafe",
                        "CreateTargetAlertPolicyAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/CreateTargetAlertPolicyAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTargetAlertPolicyAssociationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetAlertPolicyAssociations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociation.class,
                        CreateTargetAlertPolicyAssociationResponse.Builder
                                ::targetAlertPolicyAssociation)
                .handleResponseHeaderString(
                        "etag", CreateTargetAlertPolicyAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateTargetAlertPolicyAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateTargetAlertPolicyAssociationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateTargetAlertPolicyAssociationResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateTargetDatabaseResponse createTargetDatabase(CreateTargetDatabaseRequest request) {
        Objects.requireNonNull(
                request.getCreateTargetDatabaseDetails(),
                "createTargetDatabaseDetails is required");

        return clientCall(request, CreateTargetDatabaseResponse::builder)
                .logger(LOG, "createTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "CreateTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/CreateTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.TargetDatabase.class,
                        CreateTargetDatabaseResponse.Builder::targetDatabase)
                .handleResponseHeaderString("etag", CreateTargetDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateTargetDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTargetDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateTargetDatabaseResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateUserAssessmentResponse createUserAssessment(CreateUserAssessmentRequest request) {
        Objects.requireNonNull(
                request.getCreateUserAssessmentDetails(),
                "createUserAssessmentDetails is required");

        return clientCall(request, CreateUserAssessmentResponse::builder)
                .logger(LOG, "createUserAssessment")
                .serviceDetails(
                        "DataSafe",
                        "CreateUserAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/CreateUserAssessment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUserAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.UserAssessment.class,
                        CreateUserAssessmentResponse.Builder::userAssessment)
                .handleResponseHeaderString("etag", CreateUserAssessmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateUserAssessmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateUserAssessmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateUserAssessmentResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeactivateTargetDatabaseResponse deactivateTargetDatabase(
            DeactivateTargetDatabaseRequest request) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, DeactivateTargetDatabaseResponse::builder)
                .logger(LOG, "deactivateTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "DeactivateTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DeactivateTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeactivateTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("deactivate")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeactivateTargetDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeactivateTargetDatabaseResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteAuditArchiveRetrievalResponse deleteAuditArchiveRetrieval(
            DeleteAuditArchiveRetrievalRequest request) {

        Validate.notBlank(
                request.getAuditArchiveRetrievalId(), "auditArchiveRetrievalId must not be blank");

        return clientCall(request, DeleteAuditArchiveRetrievalResponse::builder)
                .logger(LOG, "deleteAuditArchiveRetrieval")
                .serviceDetails(
                        "DataSafe",
                        "DeleteAuditArchiveRetrieval",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/DeleteAuditArchiveRetrieval")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAuditArchiveRetrievalRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditArchiveRetrievals")
                .appendPathParam(request.getAuditArchiveRetrievalId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAuditArchiveRetrievalResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAuditArchiveRetrievalResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteAuditTrailResponse deleteAuditTrail(DeleteAuditTrailRequest request) {

        Validate.notBlank(request.getAuditTrailId(), "auditTrailId must not be blank");

        return clientCall(request, DeleteAuditTrailResponse::builder)
                .logger(LOG, "deleteAuditTrail")
                .serviceDetails(
                        "DataSafe",
                        "DeleteAuditTrail",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/DeleteAuditTrail")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAuditTrailRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditTrails")
                .appendPathParam(request.getAuditTrailId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAuditTrailResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAuditTrailResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDataSafePrivateEndpointResponse deleteDataSafePrivateEndpoint(
            DeleteDataSafePrivateEndpointRequest request) {

        Validate.notBlank(
                request.getDataSafePrivateEndpointId(),
                "dataSafePrivateEndpointId must not be blank");

        return clientCall(request, DeleteDataSafePrivateEndpointResponse::builder)
                .logger(LOG, "deleteDataSafePrivateEndpoint")
                .serviceDetails(
                        "DataSafe",
                        "DeleteDataSafePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/DeleteDataSafePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataSafePrivateEndpointRequest::builder)
                .basePath("/20181201")
                .appendPathParam("dataSafePrivateEndpoints")
                .appendPathParam(request.getDataSafePrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDataSafePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDataSafePrivateEndpointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDiscoveryJobResponse deleteDiscoveryJob(DeleteDiscoveryJobRequest request) {

        Validate.notBlank(request.getDiscoveryJobId(), "discoveryJobId must not be blank");

        return clientCall(request, DeleteDiscoveryJobResponse::builder)
                .logger(LOG, "deleteDiscoveryJob")
                .serviceDetails(
                        "DataSafe",
                        "DeleteDiscoveryJob",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/DeleteDiscoveryJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDiscoveryJobRequest::builder)
                .basePath("/20181201")
                .appendPathParam("discoveryJobs")
                .appendPathParam(request.getDiscoveryJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDiscoveryJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDiscoveryJobResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDiscoveryJobResultResponse deleteDiscoveryJobResult(
            DeleteDiscoveryJobResultRequest request) {

        Validate.notBlank(request.getDiscoveryJobId(), "discoveryJobId must not be blank");

        Validate.notBlank(request.getResultKey(), "resultKey must not be blank");

        return clientCall(request, DeleteDiscoveryJobResultResponse::builder)
                .logger(LOG, "deleteDiscoveryJobResult")
                .serviceDetails(
                        "DataSafe",
                        "DeleteDiscoveryJobResult",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJobResult/DeleteDiscoveryJobResult")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDiscoveryJobResultRequest::builder)
                .basePath("/20181201")
                .appendPathParam("discoveryJobs")
                .appendPathParam(request.getDiscoveryJobId())
                .appendPathParam("results")
                .appendPathParam(request.getResultKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDiscoveryJobResultResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteLibraryMaskingFormatResponse deleteLibraryMaskingFormat(
            DeleteLibraryMaskingFormatRequest request) {

        Validate.notBlank(
                request.getLibraryMaskingFormatId(), "libraryMaskingFormatId must not be blank");

        return clientCall(request, DeleteLibraryMaskingFormatResponse::builder)
                .logger(LOG, "deleteLibraryMaskingFormat")
                .serviceDetails(
                        "DataSafe",
                        "DeleteLibraryMaskingFormat",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/DeleteLibraryMaskingFormat")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLibraryMaskingFormatRequest::builder)
                .basePath("/20181201")
                .appendPathParam("libraryMaskingFormats")
                .appendPathParam(request.getLibraryMaskingFormatId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLibraryMaskingFormatResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMaskingColumnResponse deleteMaskingColumn(DeleteMaskingColumnRequest request) {

        Validate.notBlank(request.getMaskingColumnKey(), "maskingColumnKey must not be blank");

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        return clientCall(request, DeleteMaskingColumnResponse::builder)
                .logger(LOG, "deleteMaskingColumn")
                .serviceDetails(
                        "DataSafe",
                        "DeleteMaskingColumn",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/DeleteMaskingColumn")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMaskingColumnRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("maskingColumns")
                .appendPathParam(request.getMaskingColumnKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMaskingColumnResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMaskingPolicyResponse deleteMaskingPolicy(DeleteMaskingPolicyRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        return clientCall(request, DeleteMaskingPolicyResponse::builder)
                .logger(LOG, "deleteMaskingPolicy")
                .serviceDetails(
                        "DataSafe",
                        "DeleteMaskingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DeleteMaskingPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMaskingPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMaskingPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMaskingPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteOnPremConnectorResponse deleteOnPremConnector(
            DeleteOnPremConnectorRequest request) {

        Validate.notBlank(request.getOnPremConnectorId(), "onPremConnectorId must not be blank");

        return clientCall(request, DeleteOnPremConnectorResponse::builder)
                .logger(LOG, "deleteOnPremConnector")
                .serviceDetails(
                        "DataSafe",
                        "DeleteOnPremConnector",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/DeleteOnPremConnector")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOnPremConnectorRequest::builder)
                .basePath("/20181201")
                .appendPathParam("onPremConnectors")
                .appendPathParam(request.getOnPremConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOnPremConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOnPremConnectorResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteReportDefinitionResponse deleteReportDefinition(
            DeleteReportDefinitionRequest request) {

        Validate.notBlank(request.getReportDefinitionId(), "reportDefinitionId must not be blank");

        return clientCall(request, DeleteReportDefinitionResponse::builder)
                .logger(LOG, "deleteReportDefinition")
                .serviceDetails(
                        "DataSafe",
                        "DeleteReportDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/DeleteReportDefinition")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteReportDefinitionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reportDefinitions")
                .appendPathParam(request.getReportDefinitionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteReportDefinitionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteReportDefinitionResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteSdmMaskingPolicyDifferenceResponse deleteSdmMaskingPolicyDifference(
            DeleteSdmMaskingPolicyDifferenceRequest request) {

        Validate.notBlank(
                request.getSdmMaskingPolicyDifferenceId(),
                "sdmMaskingPolicyDifferenceId must not be blank");

        return clientCall(request, DeleteSdmMaskingPolicyDifferenceResponse::builder)
                .logger(LOG, "deleteSdmMaskingPolicyDifference")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSdmMaskingPolicyDifference",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/DeleteSdmMaskingPolicyDifference")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSdmMaskingPolicyDifferenceRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sdmMaskingPolicyDifferences")
                .appendPathParam(request.getSdmMaskingPolicyDifferenceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSdmMaskingPolicyDifferenceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteSdmMaskingPolicyDifferenceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteSecurityAssessmentResponse deleteSecurityAssessment(
            DeleteSecurityAssessmentRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        return clientCall(request, DeleteSecurityAssessmentResponse::builder)
                .logger(LOG, "deleteSecurityAssessment")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSecurityAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/DeleteSecurityAssessment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSecurityAssessmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSecurityAssessmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteSensitiveColumnResponse deleteSensitiveColumn(
            DeleteSensitiveColumnRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        Validate.notBlank(request.getSensitiveColumnKey(), "sensitiveColumnKey must not be blank");

        return clientCall(request, DeleteSensitiveColumnResponse::builder)
                .logger(LOG, "deleteSensitiveColumn")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSensitiveColumn",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/DeleteSensitiveColumn")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSensitiveColumnRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("sensitiveColumns")
                .appendPathParam(request.getSensitiveColumnKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSensitiveColumnResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteSensitiveDataModelResponse deleteSensitiveDataModel(
            DeleteSensitiveDataModelRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        return clientCall(request, DeleteSensitiveDataModelResponse::builder)
                .logger(LOG, "deleteSensitiveDataModel")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSensitiveDataModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DeleteSensitiveDataModel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSensitiveDataModelRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSensitiveDataModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSensitiveDataModelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteSensitiveTypeResponse deleteSensitiveType(DeleteSensitiveTypeRequest request) {

        Validate.notBlank(request.getSensitiveTypeId(), "sensitiveTypeId must not be blank");

        return clientCall(request, DeleteSensitiveTypeResponse::builder)
                .logger(LOG, "deleteSensitiveType")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSensitiveType",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/DeleteSensitiveType")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSensitiveTypeRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypes")
                .appendPathParam(request.getSensitiveTypeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSensitiveTypeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteTargetAlertPolicyAssociationResponse deleteTargetAlertPolicyAssociation(
            DeleteTargetAlertPolicyAssociationRequest request) {

        Validate.notBlank(
                request.getTargetAlertPolicyAssociationId(),
                "targetAlertPolicyAssociationId must not be blank");

        return clientCall(request, DeleteTargetAlertPolicyAssociationResponse::builder)
                .logger(LOG, "deleteTargetAlertPolicyAssociation")
                .serviceDetails(
                        "DataSafe",
                        "DeleteTargetAlertPolicyAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/DeleteTargetAlertPolicyAssociation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTargetAlertPolicyAssociationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetAlertPolicyAssociations")
                .appendPathParam(request.getTargetAlertPolicyAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteTargetAlertPolicyAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteTargetAlertPolicyAssociationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteTargetDatabaseResponse deleteTargetDatabase(DeleteTargetDatabaseRequest request) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, DeleteTargetDatabaseResponse::builder)
                .logger(LOG, "deleteTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "DeleteTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DeleteTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteTargetDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTargetDatabaseResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteUserAssessmentResponse deleteUserAssessment(DeleteUserAssessmentRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        return clientCall(request, DeleteUserAssessmentResponse::builder)
                .logger(LOG, "deleteUserAssessment")
                .serviceDetails(
                        "DataSafe",
                        "DeleteUserAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/DeleteUserAssessment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUserAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteUserAssessmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUserAssessmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DiscoverAuditTrailsResponse discoverAuditTrails(DiscoverAuditTrailsRequest request) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");

        return clientCall(request, DiscoverAuditTrailsResponse::builder)
                .logger(LOG, "discoverAuditTrails")
                .serviceDetails(
                        "DataSafe",
                        "DiscoverAuditTrails",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/DiscoverAuditTrails")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DiscoverAuditTrailsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .appendPathParam("actions")
                .appendPathParam("discoverAuditTrails")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DiscoverAuditTrailsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DiscoverAuditTrailsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DownloadDiscoveryReportResponse downloadDiscoveryReport(
            DownloadDiscoveryReportRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getDownloadDiscoveryReportDetails(),
                "downloadDiscoveryReportDetails is required");

        return clientCall(request, DownloadDiscoveryReportResponse::builder)
                .logger(LOG, "downloadDiscoveryReport")
                .serviceDetails(
                        "DataSafe",
                        "DownloadDiscoveryReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DownloadDiscoveryReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadDiscoveryReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("actions")
                .appendPathParam("downloadReport")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        DownloadDiscoveryReportResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", DownloadDiscoveryReportResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", DownloadDiscoveryReportResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length", DownloadDiscoveryReportResponse.Builder::contentLength)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DownloadMaskingLogResponse downloadMaskingLog(DownloadMaskingLogRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getDownloadMaskingLogDetails(), "downloadMaskingLogDetails is required");

        return clientCall(request, DownloadMaskingLogResponse::builder)
                .logger(LOG, "downloadMaskingLog")
                .serviceDetails(
                        "DataSafe",
                        "DownloadMaskingLog",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingLog")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadMaskingLogRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("actions")
                .appendPathParam("downloadLog")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class, DownloadMaskingLogResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", DownloadMaskingLogResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DownloadMaskingLogResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", DownloadMaskingLogResponse.Builder::contentLength)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DownloadMaskingPolicyResponse downloadMaskingPolicy(
            DownloadMaskingPolicyRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getDownloadMaskingPolicyDetails(),
                "downloadMaskingPolicyDetails is required");

        return clientCall(request, DownloadMaskingPolicyResponse::builder)
                .logger(LOG, "downloadMaskingPolicy")
                .serviceDetails(
                        "DataSafe",
                        "DownloadMaskingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadMaskingPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("actions")
                .appendPathParam("download")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        DownloadMaskingPolicyResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", DownloadMaskingPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DownloadMaskingPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", DownloadMaskingPolicyResponse.Builder::contentLength)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DownloadMaskingReportResponse downloadMaskingReport(
            DownloadMaskingReportRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getDownloadMaskingReportDetails(),
                "downloadMaskingReportDetails is required");

        return clientCall(request, DownloadMaskingReportResponse::builder)
                .logger(LOG, "downloadMaskingReport")
                .serviceDetails(
                        "DataSafe",
                        "DownloadMaskingReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadMaskingReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("actions")
                .appendPathParam("downloadReport")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        DownloadMaskingReportResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", DownloadMaskingReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DownloadMaskingReportResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", DownloadMaskingReportResponse.Builder::contentLength)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DownloadPrivilegeScriptResponse downloadPrivilegeScript(
            DownloadPrivilegeScriptRequest request) {

        return clientCall(request, DownloadPrivilegeScriptResponse::builder)
                .logger(LOG, "downloadPrivilegeScript")
                .serviceDetails(
                        "DataSafe",
                        "DownloadPrivilegeScript",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DownloadPrivilegeScript")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadPrivilegeScriptRequest::builder)
                .basePath("/20181201")
                .appendPathParam("actions")
                .appendPathParam("downloadPrivilegeScript")
                .accept("application/octet-stream")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        java.io.InputStream.class,
                        DownloadPrivilegeScriptResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", DownloadPrivilegeScriptResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", DownloadPrivilegeScriptResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length", DownloadPrivilegeScriptResponse.Builder::contentLength)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DownloadSecurityAssessmentReportResponse downloadSecurityAssessmentReport(
            DownloadSecurityAssessmentReportRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getDownloadSecurityAssessmentReportDetails(),
                "downloadSecurityAssessmentReportDetails is required");

        return clientCall(request, DownloadSecurityAssessmentReportResponse::builder)
                .logger(LOG, "downloadSecurityAssessmentReport")
                .serviceDetails(
                        "DataSafe",
                        "DownloadSecurityAssessmentReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/DownloadSecurityAssessmentReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadSecurityAssessmentReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("downloadReport")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        DownloadSecurityAssessmentReportResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadSecurityAssessmentReportResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", DownloadSecurityAssessmentReportResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadSecurityAssessmentReportResponse.Builder::contentLength)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DownloadSensitiveDataModelResponse downloadSensitiveDataModel(
            DownloadSensitiveDataModelRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getDownloadSensitiveDataModelDetails(),
                "downloadSensitiveDataModelDetails is required");

        return clientCall(request, DownloadSensitiveDataModelResponse::builder)
                .logger(LOG, "downloadSensitiveDataModel")
                .serviceDetails(
                        "DataSafe",
                        "DownloadSensitiveDataModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DownloadSensitiveDataModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadSensitiveDataModelRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("actions")
                .appendPathParam("download")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        DownloadSensitiveDataModelResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", DownloadSensitiveDataModelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", DownloadSensitiveDataModelResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length", DownloadSensitiveDataModelResponse.Builder::contentLength)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DownloadUserAssessmentReportResponse downloadUserAssessmentReport(
            DownloadUserAssessmentReportRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getDownloadUserAssessmentReportDetails(),
                "downloadUserAssessmentReportDetails is required");

        return clientCall(request, DownloadUserAssessmentReportResponse::builder)
                .logger(LOG, "downloadUserAssessmentReport")
                .serviceDetails(
                        "DataSafe",
                        "DownloadUserAssessmentReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/DownloadUserAssessmentReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadUserAssessmentReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("downloadReport")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        DownloadUserAssessmentReportResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadUserAssessmentReportResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", DownloadUserAssessmentReportResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadUserAssessmentReportResponse.Builder::contentLength)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EnableDataSafeConfigurationResponse enableDataSafeConfiguration(
            EnableDataSafeConfigurationRequest request) {
        Objects.requireNonNull(
                request.getEnableDataSafeConfigurationDetails(),
                "enableDataSafeConfigurationDetails is required");

        return clientCall(request, EnableDataSafeConfigurationResponse::builder)
                .logger(LOG, "enableDataSafeConfiguration")
                .serviceDetails(
                        "DataSafe",
                        "EnableDataSafeConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/EnableDataSafeConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(EnableDataSafeConfigurationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableDataSafeConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableDataSafeConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateDiscoveryReportForDownloadResponse generateDiscoveryReportForDownload(
            GenerateDiscoveryReportForDownloadRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getGenerateDiscoveryReportForDownloadDetails(),
                "generateDiscoveryReportForDownloadDetails is required");

        return clientCall(request, GenerateDiscoveryReportForDownloadResponse::builder)
                .logger(LOG, "generateDiscoveryReportForDownload")
                .serviceDetails(
                        "DataSafe",
                        "GenerateDiscoveryReportForDownload",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GenerateDiscoveryReportForDownload")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateDiscoveryReportForDownloadRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("actions")
                .appendPathParam("generateReportForDownload")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateDiscoveryReportForDownloadResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateDiscoveryReportForDownloadResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateMaskingPolicyForDownloadResponse generateMaskingPolicyForDownload(
            GenerateMaskingPolicyForDownloadRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getGenerateMaskingPolicyForDownloadDetails(),
                "generateMaskingPolicyForDownloadDetails is required");

        return clientCall(request, GenerateMaskingPolicyForDownloadResponse::builder)
                .logger(LOG, "generateMaskingPolicyForDownload")
                .serviceDetails(
                        "DataSafe",
                        "GenerateMaskingPolicyForDownload",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GenerateMaskingPolicyForDownload")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateMaskingPolicyForDownloadRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("actions")
                .appendPathParam("generatePolicyForDownload")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateMaskingPolicyForDownloadResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateMaskingPolicyForDownloadResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateMaskingReportForDownloadResponse generateMaskingReportForDownload(
            GenerateMaskingReportForDownloadRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getGenerateMaskingReportForDownloadDetails(),
                "generateMaskingReportForDownloadDetails is required");

        return clientCall(request, GenerateMaskingReportForDownloadResponse::builder)
                .logger(LOG, "generateMaskingReportForDownload")
                .serviceDetails(
                        "DataSafe",
                        "GenerateMaskingReportForDownload",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GenerateMaskingReportForDownload")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateMaskingReportForDownloadRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("actions")
                .appendPathParam("generateReportForDownload")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateMaskingReportForDownloadResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateMaskingReportForDownloadResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateOnPremConnectorConfigurationResponse generateOnPremConnectorConfiguration(
            GenerateOnPremConnectorConfigurationRequest request) {
        Objects.requireNonNull(
                request.getGenerateOnPremConnectorConfigurationDetails(),
                "generateOnPremConnectorConfigurationDetails is required");

        Validate.notBlank(request.getOnPremConnectorId(), "onPremConnectorId must not be blank");

        return clientCall(request, GenerateOnPremConnectorConfigurationResponse::builder)
                .logger(LOG, "generateOnPremConnectorConfiguration")
                .serviceDetails(
                        "DataSafe",
                        "GenerateOnPremConnectorConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/GenerateOnPremConnectorConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateOnPremConnectorConfigurationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("onPremConnectors")
                .appendPathParam(request.getOnPremConnectorId())
                .appendPathParam("actions")
                .appendPathParam("generateConfiguration")
                .accept("application/octet-stream")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        GenerateOnPremConnectorConfigurationResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateOnPremConnectorConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        GenerateOnPremConnectorConfigurationResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        GenerateOnPremConnectorConfigurationResponse.Builder::lastModified)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateReportResponse generateReport(GenerateReportRequest request) {

        Validate.notBlank(request.getReportDefinitionId(), "reportDefinitionId must not be blank");
        Objects.requireNonNull(
                request.getGenerateReportDetails(), "generateReportDetails is required");

        return clientCall(request, GenerateReportResponse::builder)
                .logger(LOG, "generateReport")
                .serviceDetails(
                        "DataSafe",
                        "GenerateReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/GenerateReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reportDefinitions")
                .appendPathParam(request.getReportDefinitionId())
                .appendPathParam("actions")
                .appendPathParam("generateReport")
                .appendQueryParam("scimQuery", request.getScimQuery())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", GenerateReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateSecurityAssessmentReportResponse generateSecurityAssessmentReport(
            GenerateSecurityAssessmentReportRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getGenerateSecurityAssessmentReportDetails(),
                "generateSecurityAssessmentReportDetails is required");

        return clientCall(request, GenerateSecurityAssessmentReportResponse::builder)
                .logger(LOG, "generateSecurityAssessmentReport")
                .serviceDetails(
                        "DataSafe",
                        "GenerateSecurityAssessmentReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GenerateSecurityAssessmentReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateSecurityAssessmentReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("generateReport")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateSecurityAssessmentReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateSecurityAssessmentReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateSensitiveDataModelForDownloadResponse generateSensitiveDataModelForDownload(
            GenerateSensitiveDataModelForDownloadRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getGenerateSensitiveDataModelForDownloadDetails(),
                "generateSensitiveDataModelForDownloadDetails is required");

        return clientCall(request, GenerateSensitiveDataModelForDownloadResponse::builder)
                .logger(LOG, "generateSensitiveDataModelForDownload")
                .serviceDetails(
                        "DataSafe",
                        "GenerateSensitiveDataModelForDownload",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GenerateSensitiveDataModelForDownload")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateSensitiveDataModelForDownloadRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("actions")
                .appendPathParam("generateDataModelForDownload")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateSensitiveDataModelForDownloadResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateSensitiveDataModelForDownloadResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateUserAssessmentReportResponse generateUserAssessmentReport(
            GenerateUserAssessmentReportRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getGenerateUserAssessmentReportDetails(),
                "generateUserAssessmentReportDetails is required");

        return clientCall(request, GenerateUserAssessmentReportResponse::builder)
                .logger(LOG, "generateUserAssessmentReport")
                .serviceDetails(
                        "DataSafe",
                        "GenerateUserAssessmentReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GenerateUserAssessmentReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateUserAssessmentReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("generateReport")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateUserAssessmentReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateUserAssessmentReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAlertResponse getAlert(GetAlertRequest request) {

        Validate.notBlank(request.getAlertId(), "alertId must not be blank");

        return clientCall(request, GetAlertResponse::builder)
                .logger(LOG, "getAlert")
                .serviceDetails(
                        "DataSafe",
                        "GetAlert",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/GetAlert")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAlertRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alerts")
                .appendPathParam(request.getAlertId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.Alert.class, GetAlertResponse.Builder::alert)
                .handleResponseHeaderString("etag", GetAlertResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAlertResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAlertPolicyResponse getAlertPolicy(GetAlertPolicyRequest request) {

        Validate.notBlank(request.getAlertPolicyId(), "alertPolicyId must not be blank");

        return clientCall(request, GetAlertPolicyResponse::builder)
                .logger(LOG, "getAlertPolicy")
                .serviceDetails(
                        "DataSafe",
                        "GetAlertPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/GetAlertPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAlertPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .appendPathParam(request.getAlertPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AlertPolicy.class,
                        GetAlertPolicyResponse.Builder::alertPolicy)
                .handleResponseHeaderString("etag", GetAlertPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAlertPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAuditArchiveRetrievalResponse getAuditArchiveRetrieval(
            GetAuditArchiveRetrievalRequest request) {

        Validate.notBlank(
                request.getAuditArchiveRetrievalId(), "auditArchiveRetrievalId must not be blank");

        return clientCall(request, GetAuditArchiveRetrievalResponse::builder)
                .logger(LOG, "getAuditArchiveRetrieval")
                .serviceDetails(
                        "DataSafe",
                        "GetAuditArchiveRetrieval",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/GetAuditArchiveRetrieval")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuditArchiveRetrievalRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditArchiveRetrievals")
                .appendPathParam(request.getAuditArchiveRetrievalId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditArchiveRetrieval.class,
                        GetAuditArchiveRetrievalResponse.Builder::auditArchiveRetrieval)
                .handleResponseHeaderString("etag", GetAuditArchiveRetrievalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAuditArchiveRetrievalResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAuditPolicyResponse getAuditPolicy(GetAuditPolicyRequest request) {

        Validate.notBlank(request.getAuditPolicyId(), "auditPolicyId must not be blank");

        return clientCall(request, GetAuditPolicyResponse::builder)
                .logger(LOG, "getAuditPolicy")
                .serviceDetails(
                        "DataSafe",
                        "GetAuditPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/GetAuditPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuditPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditPolicies")
                .appendPathParam(request.getAuditPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditPolicy.class,
                        GetAuditPolicyResponse.Builder::auditPolicy)
                .handleResponseHeaderString("etag", GetAuditPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAuditPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAuditProfileResponse getAuditProfile(GetAuditProfileRequest request) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");

        return clientCall(request, GetAuditProfileResponse::builder)
                .logger(LOG, "getAuditProfile")
                .serviceDetails(
                        "DataSafe",
                        "GetAuditProfile",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/GetAuditProfile")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuditProfileRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditProfile.class,
                        GetAuditProfileResponse.Builder::auditProfile)
                .handleResponseHeaderString("etag", GetAuditProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAuditProfileResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAuditTrailResponse getAuditTrail(GetAuditTrailRequest request) {

        Validate.notBlank(request.getAuditTrailId(), "auditTrailId must not be blank");

        return clientCall(request, GetAuditTrailResponse::builder)
                .logger(LOG, "getAuditTrail")
                .serviceDetails(
                        "DataSafe",
                        "GetAuditTrail",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/GetAuditTrail")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuditTrailRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditTrails")
                .appendPathParam(request.getAuditTrailId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditTrail.class,
                        GetAuditTrailResponse.Builder::auditTrail)
                .handleResponseHeaderString("etag", GetAuditTrailResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAuditTrailResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetCompatibleFormatsForDataTypesResponse getCompatibleFormatsForDataTypes(
            GetCompatibleFormatsForDataTypesRequest request) {

        return clientCall(request, GetCompatibleFormatsForDataTypesResponse::builder)
                .logger(LOG, "getCompatibleFormatsForDataTypes")
                .serviceDetails(
                        "DataSafe",
                        "GetCompatibleFormatsForDataTypes",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetCompatibleFormatsForDataTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCompatibleFormatsForDataTypesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("compatibleFormatsForDataTypes")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.CompatibleFormatsForDataTypes.class,
                        GetCompatibleFormatsForDataTypesResponse.Builder
                                ::compatibleFormatsForDataTypes)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCompatibleFormatsForDataTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        GetCompatibleFormatsForDataTypesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        GetCompatibleFormatsForDataTypesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetCompatibleFormatsForSensitiveTypesResponse getCompatibleFormatsForSensitiveTypes(
            GetCompatibleFormatsForSensitiveTypesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetCompatibleFormatsForSensitiveTypesResponse::builder)
                .logger(LOG, "getCompatibleFormatsForSensitiveTypes")
                .serviceDetails(
                        "DataSafe",
                        "GetCompatibleFormatsForSensitiveTypes",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetCompatibleFormatsForSensitiveTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCompatibleFormatsForSensitiveTypesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("compatibleFormatsForSensitiveTypes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.CompatibleFormatsForSensitiveTypes.class,
                        GetCompatibleFormatsForSensitiveTypesResponse.Builder
                                ::compatibleFormatsForSensitiveTypes)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCompatibleFormatsForSensitiveTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        GetCompatibleFormatsForSensitiveTypesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        GetCompatibleFormatsForSensitiveTypesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDataSafeConfigurationResponse getDataSafeConfiguration(
            GetDataSafeConfigurationRequest request) {

        return clientCall(request, GetDataSafeConfigurationResponse::builder)
                .logger(LOG, "getDataSafeConfiguration")
                .serviceDetails(
                        "DataSafe",
                        "GetDataSafeConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/GetDataSafeConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataSafeConfigurationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DataSafeConfiguration.class,
                        GetDataSafeConfigurationResponse.Builder::dataSafeConfiguration)
                .handleResponseHeaderString("etag", GetDataSafeConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataSafeConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDataSafePrivateEndpointResponse getDataSafePrivateEndpoint(
            GetDataSafePrivateEndpointRequest request) {

        Validate.notBlank(
                request.getDataSafePrivateEndpointId(),
                "dataSafePrivateEndpointId must not be blank");

        return clientCall(request, GetDataSafePrivateEndpointResponse::builder)
                .logger(LOG, "getDataSafePrivateEndpoint")
                .serviceDetails(
                        "DataSafe",
                        "GetDataSafePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/GetDataSafePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataSafePrivateEndpointRequest::builder)
                .basePath("/20181201")
                .appendPathParam("dataSafePrivateEndpoints")
                .appendPathParam(request.getDataSafePrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DataSafePrivateEndpoint.class,
                        GetDataSafePrivateEndpointResponse.Builder::dataSafePrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", GetDataSafePrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataSafePrivateEndpointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDifferenceColumnResponse getDifferenceColumn(GetDifferenceColumnRequest request) {

        Validate.notBlank(
                request.getSdmMaskingPolicyDifferenceId(),
                "sdmMaskingPolicyDifferenceId must not be blank");

        Validate.notBlank(
                request.getDifferenceColumnKey(), "differenceColumnKey must not be blank");

        return clientCall(request, GetDifferenceColumnResponse::builder)
                .logger(LOG, "getDifferenceColumn")
                .serviceDetails(
                        "DataSafe",
                        "GetDifferenceColumn",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DifferenceColumn/GetDifferenceColumn")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDifferenceColumnRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sdmMaskingPolicyDifferences")
                .appendPathParam(request.getSdmMaskingPolicyDifferenceId())
                .appendPathParam("differenceColumns")
                .appendPathParam(request.getDifferenceColumnKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DifferenceColumn.class,
                        GetDifferenceColumnResponse.Builder::differenceColumn)
                .handleResponseHeaderString("etag", GetDifferenceColumnResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDifferenceColumnResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDiscoveryJobResponse getDiscoveryJob(GetDiscoveryJobRequest request) {

        Validate.notBlank(request.getDiscoveryJobId(), "discoveryJobId must not be blank");

        return clientCall(request, GetDiscoveryJobResponse::builder)
                .logger(LOG, "getDiscoveryJob")
                .serviceDetails(
                        "DataSafe",
                        "GetDiscoveryJob",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/GetDiscoveryJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDiscoveryJobRequest::builder)
                .basePath("/20181201")
                .appendPathParam("discoveryJobs")
                .appendPathParam(request.getDiscoveryJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DiscoveryJob.class,
                        GetDiscoveryJobResponse.Builder::discoveryJob)
                .handleResponseHeaderString("etag", GetDiscoveryJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDiscoveryJobResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDiscoveryJobResultResponse getDiscoveryJobResult(
            GetDiscoveryJobResultRequest request) {

        Validate.notBlank(request.getDiscoveryJobId(), "discoveryJobId must not be blank");

        Validate.notBlank(request.getResultKey(), "resultKey must not be blank");

        return clientCall(request, GetDiscoveryJobResultResponse::builder)
                .logger(LOG, "getDiscoveryJobResult")
                .serviceDetails(
                        "DataSafe",
                        "GetDiscoveryJobResult",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJobResult/GetDiscoveryJobResult")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDiscoveryJobResultRequest::builder)
                .basePath("/20181201")
                .appendPathParam("discoveryJobs")
                .appendPathParam(request.getDiscoveryJobId())
                .appendPathParam("results")
                .appendPathParam(request.getResultKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DiscoveryJobResult.class,
                        GetDiscoveryJobResultResponse.Builder::discoveryJobResult)
                .handleResponseHeaderString("etag", GetDiscoveryJobResultResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDiscoveryJobResultResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLibraryMaskingFormatResponse getLibraryMaskingFormat(
            GetLibraryMaskingFormatRequest request) {

        Validate.notBlank(
                request.getLibraryMaskingFormatId(), "libraryMaskingFormatId must not be blank");

        return clientCall(request, GetLibraryMaskingFormatResponse::builder)
                .logger(LOG, "getLibraryMaskingFormat")
                .serviceDetails(
                        "DataSafe",
                        "GetLibraryMaskingFormat",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/GetLibraryMaskingFormat")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLibraryMaskingFormatRequest::builder)
                .basePath("/20181201")
                .appendPathParam("libraryMaskingFormats")
                .appendPathParam(request.getLibraryMaskingFormatId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.LibraryMaskingFormat.class,
                        GetLibraryMaskingFormatResponse.Builder::libraryMaskingFormat)
                .handleResponseHeaderString("etag", GetLibraryMaskingFormatResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLibraryMaskingFormatResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMaskingColumnResponse getMaskingColumn(GetMaskingColumnRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        Validate.notBlank(request.getMaskingColumnKey(), "maskingColumnKey must not be blank");

        return clientCall(request, GetMaskingColumnResponse::builder)
                .logger(LOG, "getMaskingColumn")
                .serviceDetails(
                        "DataSafe",
                        "GetMaskingColumn",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetMaskingColumn")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaskingColumnRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("maskingColumns")
                .appendPathParam(request.getMaskingColumnKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingColumn.class,
                        GetMaskingColumnResponse.Builder::maskingColumn)
                .handleResponseHeaderString("etag", GetMaskingColumnResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaskingColumnResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMaskingPolicyResponse getMaskingPolicy(GetMaskingPolicyRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        return clientCall(request, GetMaskingPolicyResponse::builder)
                .logger(LOG, "getMaskingPolicy")
                .serviceDetails(
                        "DataSafe",
                        "GetMaskingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GetMaskingPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaskingPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingPolicy.class,
                        GetMaskingPolicyResponse.Builder::maskingPolicy)
                .handleResponseHeaderString("etag", GetMaskingPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaskingPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMaskingReportResponse getMaskingReport(GetMaskingReportRequest request) {

        Validate.notBlank(request.getMaskingReportId(), "maskingReportId must not be blank");

        return clientCall(request, GetMaskingReportResponse::builder)
                .logger(LOG, "getMaskingReport")
                .serviceDetails(
                        "DataSafe",
                        "GetMaskingReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingReport/GetMaskingReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaskingReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingReports")
                .appendPathParam(request.getMaskingReportId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingReport.class,
                        GetMaskingReportResponse.Builder::maskingReport)
                .handleResponseHeaderString("etag", GetMaskingReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaskingReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetOnPremConnectorResponse getOnPremConnector(GetOnPremConnectorRequest request) {

        Validate.notBlank(request.getOnPremConnectorId(), "onPremConnectorId must not be blank");

        return clientCall(request, GetOnPremConnectorResponse::builder)
                .logger(LOG, "getOnPremConnector")
                .serviceDetails(
                        "DataSafe",
                        "GetOnPremConnector",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/GetOnPremConnector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOnPremConnectorRequest::builder)
                .basePath("/20181201")
                .appendPathParam("onPremConnectors")
                .appendPathParam(request.getOnPremConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.OnPremConnector.class,
                        GetOnPremConnectorResponse.Builder::onPremConnector)
                .handleResponseHeaderString("etag", GetOnPremConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOnPremConnectorResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetProfileResponse getProfile(GetProfileRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        Validate.notBlank(request.getProfileName(), "profileName must not be blank");

        return clientCall(request, GetProfileResponse::builder)
                .logger(LOG, "getProfile")
                .serviceDetails(
                        "DataSafe",
                        "GetProfile",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GetProfile")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProfileRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.Profile.class,
                        GetProfileResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", GetProfileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetProfileResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", GetProfileResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetReportResponse getReport(GetReportRequest request) {

        Validate.notBlank(request.getReportId(), "reportId must not be blank");

        return clientCall(request, GetReportResponse::builder)
                .logger(LOG, "getReport")
                .serviceDetails(
                        "DataSafe",
                        "GetReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/GetReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reports")
                .appendPathParam(request.getReportId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.Report.class,
                        GetReportResponse.Builder::report)
                .handleResponseHeaderString("etag", GetReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetReportContentResponse getReportContent(GetReportContentRequest request) {

        Validate.notBlank(request.getReportId(), "reportId must not be blank");

        return clientCall(request, GetReportContentResponse::builder)
                .logger(LOG, "getReportContent")
                .serviceDetails(
                        "DataSafe",
                        "GetReportContent",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/GetReportContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReportContentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reports")
                .appendPathParam(request.getReportId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class, GetReportContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetReportContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetReportContentResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", GetReportContentResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified", GetReportContentResponse.Builder::lastModified)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetReportDefinitionResponse getReportDefinition(GetReportDefinitionRequest request) {

        Validate.notBlank(request.getReportDefinitionId(), "reportDefinitionId must not be blank");

        return clientCall(request, GetReportDefinitionResponse::builder)
                .logger(LOG, "getReportDefinition")
                .serviceDetails(
                        "DataSafe",
                        "GetReportDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/GetReportDefinition")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReportDefinitionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reportDefinitions")
                .appendPathParam(request.getReportDefinitionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.ReportDefinition.class,
                        GetReportDefinitionResponse.Builder::reportDefinition)
                .handleResponseHeaderString("etag", GetReportDefinitionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetReportDefinitionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSdmMaskingPolicyDifferenceResponse getSdmMaskingPolicyDifference(
            GetSdmMaskingPolicyDifferenceRequest request) {

        Validate.notBlank(
                request.getSdmMaskingPolicyDifferenceId(),
                "sdmMaskingPolicyDifferenceId must not be blank");

        return clientCall(request, GetSdmMaskingPolicyDifferenceResponse::builder)
                .logger(LOG, "getSdmMaskingPolicyDifference")
                .serviceDetails(
                        "DataSafe",
                        "GetSdmMaskingPolicyDifference",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/GetSdmMaskingPolicyDifference")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSdmMaskingPolicyDifferenceRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sdmMaskingPolicyDifferences")
                .appendPathParam(request.getSdmMaskingPolicyDifferenceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifference.class,
                        GetSdmMaskingPolicyDifferenceResponse.Builder::sdmMaskingPolicyDifference)
                .handleResponseHeaderString(
                        "etag", GetSdmMaskingPolicyDifferenceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetSdmMaskingPolicyDifferenceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSecurityAssessmentResponse getSecurityAssessment(
            GetSecurityAssessmentRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        return clientCall(request, GetSecurityAssessmentResponse::builder)
                .logger(LOG, "getSecurityAssessment")
                .serviceDetails(
                        "DataSafe",
                        "GetSecurityAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GetSecurityAssessment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityAssessment.class,
                        GetSecurityAssessmentResponse.Builder::securityAssessment)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityAssessmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetSecurityAssessmentResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSecurityAssessmentComparisonResponse getSecurityAssessmentComparison(
            GetSecurityAssessmentComparisonRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        Validate.notBlank(
                request.getComparisonSecurityAssessmentId(),
                "comparisonSecurityAssessmentId must not be blank");

        return clientCall(request, GetSecurityAssessmentComparisonResponse::builder)
                .logger(LOG, "getSecurityAssessmentComparison")
                .serviceDetails(
                        "DataSafe",
                        "GetSecurityAssessmentComparison",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GetSecurityAssessmentComparison")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityAssessmentComparisonRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("comparison")
                .appendPathParam(request.getComparisonSecurityAssessmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityAssessmentComparison.class,
                        GetSecurityAssessmentComparisonResponse.Builder
                                ::securityAssessmentComparison)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetSecurityAssessmentComparisonResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetSecurityAssessmentComparisonResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSensitiveColumnResponse getSensitiveColumn(GetSensitiveColumnRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        Validate.notBlank(request.getSensitiveColumnKey(), "sensitiveColumnKey must not be blank");

        return clientCall(request, GetSensitiveColumnResponse::builder)
                .logger(LOG, "getSensitiveColumn")
                .serviceDetails(
                        "DataSafe",
                        "GetSensitiveColumn",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/GetSensitiveColumn")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSensitiveColumnRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("sensitiveColumns")
                .appendPathParam(request.getSensitiveColumnKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveColumn.class,
                        GetSensitiveColumnResponse.Builder::sensitiveColumn)
                .handleResponseHeaderString("etag", GetSensitiveColumnResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSensitiveColumnResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSensitiveDataModelResponse getSensitiveDataModel(
            GetSensitiveDataModelRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        return clientCall(request, GetSensitiveDataModelResponse::builder)
                .logger(LOG, "getSensitiveDataModel")
                .serviceDetails(
                        "DataSafe",
                        "GetSensitiveDataModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GetSensitiveDataModel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSensitiveDataModelRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveDataModel.class,
                        GetSensitiveDataModelResponse.Builder::sensitiveDataModel)
                .handleResponseHeaderString("etag", GetSensitiveDataModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSensitiveDataModelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSensitiveTypeResponse getSensitiveType(GetSensitiveTypeRequest request) {

        Validate.notBlank(request.getSensitiveTypeId(), "sensitiveTypeId must not be blank");

        return clientCall(request, GetSensitiveTypeResponse::builder)
                .logger(LOG, "getSensitiveType")
                .serviceDetails(
                        "DataSafe",
                        "GetSensitiveType",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/GetSensitiveType")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSensitiveTypeRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypes")
                .appendPathParam(request.getSensitiveTypeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveType.class,
                        GetSensitiveTypeResponse.Builder::sensitiveType)
                .handleResponseHeaderString("etag", GetSensitiveTypeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSensitiveTypeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetTargetAlertPolicyAssociationResponse getTargetAlertPolicyAssociation(
            GetTargetAlertPolicyAssociationRequest request) {

        Validate.notBlank(
                request.getTargetAlertPolicyAssociationId(),
                "targetAlertPolicyAssociationId must not be blank");

        return clientCall(request, GetTargetAlertPolicyAssociationResponse::builder)
                .logger(LOG, "getTargetAlertPolicyAssociation")
                .serviceDetails(
                        "DataSafe",
                        "GetTargetAlertPolicyAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/GetTargetAlertPolicyAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTargetAlertPolicyAssociationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetAlertPolicyAssociations")
                .appendPathParam(request.getTargetAlertPolicyAssociationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociation.class,
                        GetTargetAlertPolicyAssociationResponse.Builder
                                ::targetAlertPolicyAssociation)
                .handleResponseHeaderString(
                        "etag", GetTargetAlertPolicyAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetTargetAlertPolicyAssociationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetTargetDatabaseResponse getTargetDatabase(GetTargetDatabaseRequest request) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, GetTargetDatabaseResponse::builder)
                .logger(LOG, "getTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "GetTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/GetTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.TargetDatabase.class,
                        GetTargetDatabaseResponse.Builder::targetDatabase)
                .handleResponseHeaderString("etag", GetTargetDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTargetDatabaseResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetUserAssessmentResponse getUserAssessment(GetUserAssessmentRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        return clientCall(request, GetUserAssessmentResponse::builder)
                .logger(LOG, "getUserAssessment")
                .serviceDetails(
                        "DataSafe",
                        "GetUserAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GetUserAssessment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.UserAssessment.class,
                        GetUserAssessmentResponse.Builder::userAssessment)
                .handleResponseHeaderString("etag", GetUserAssessmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetUserAssessmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetUserAssessmentComparisonResponse getUserAssessmentComparison(
            GetUserAssessmentComparisonRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        Validate.notBlank(
                request.getComparisonUserAssessmentId(),
                "comparisonUserAssessmentId must not be blank");

        return clientCall(request, GetUserAssessmentComparisonResponse::builder)
                .logger(LOG, "getUserAssessmentComparison")
                .serviceDetails(
                        "DataSafe",
                        "GetUserAssessmentComparison",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GetUserAssessmentComparison")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserAssessmentComparisonRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("comparison")
                .appendPathParam(request.getComparisonUserAssessmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.UserAssessmentComparison.class,
                        GetUserAssessmentComparisonResponse.Builder::userAssessmentComparison)
                .handleResponseHeaderString(
                        "opc-request-id", GetUserAssessmentComparisonResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "DataSafe",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20181201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAlertAnalyticsResponse listAlertAnalytics(ListAlertAnalyticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAlertAnalyticsResponse::builder)
                .logger(LOG, "listAlertAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListAlertAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertSummary/ListAlertAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAlertAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("timeStarted", request.getTimeStarted())
                .appendQueryParam("timeEnded", request.getTimeEnded())
                .appendQueryParam("queryTimeZone", request.getQueryTimeZone())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("scimQuery", request.getScimQuery())
                .appendListQueryParam(
                        "summaryField",
                        request.getSummaryField(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AlertAnalyticsCollection.class,
                        ListAlertAnalyticsResponse.Builder::alertAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAlertAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAlertAnalyticsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAlertPoliciesResponse listAlertPolicies(ListAlertPoliciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAlertPoliciesResponse::builder)
                .logger(LOG, "listAlertPolicies")
                .serviceDetails(
                        "DataSafe",
                        "ListAlertPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/ListAlertPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAlertPoliciesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .appendQueryParam("alertPolicyId", request.getAlertPolicyId())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("isUserDefined", request.getIsUserDefined())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AlertPolicyCollection.class,
                        ListAlertPoliciesResponse.Builder::alertPolicyCollection)
                .handleResponseHeaderString("etag", ListAlertPoliciesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListAlertPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAlertPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAlertPoliciesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAlertPolicyRulesResponse listAlertPolicyRules(ListAlertPolicyRulesRequest request) {

        Validate.notBlank(request.getAlertPolicyId(), "alertPolicyId must not be blank");

        return clientCall(request, ListAlertPolicyRulesResponse::builder)
                .logger(LOG, "listAlertPolicyRules")
                .serviceDetails(
                        "DataSafe",
                        "ListAlertPolicyRules",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/ListAlertPolicyRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAlertPolicyRulesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .appendPathParam(request.getAlertPolicyId())
                .appendPathParam("rules")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AlertPolicyRuleCollection.class,
                        ListAlertPolicyRulesResponse.Builder::alertPolicyRuleCollection)
                .handleResponseHeaderString("etag", ListAlertPolicyRulesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListAlertPolicyRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAlertPolicyRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAlertPolicyRulesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAlertsResponse listAlerts(ListAlertsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAlertsResponse::builder)
                .logger(LOG, "listAlerts")
                .serviceDetails(
                        "DataSafe",
                        "ListAlerts",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertSummary/ListAlerts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAlertsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alerts")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("scimQuery", request.getScimQuery())
                .appendListQueryParam(
                        "field",
                        request.getField(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AlertCollection.class,
                        ListAlertsResponse.Builder::alertCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAlertsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAlertsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAlertsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAuditArchiveRetrievalsResponse listAuditArchiveRetrievals(
            ListAuditArchiveRetrievalsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAuditArchiveRetrievalsResponse::builder)
                .logger(LOG, "listAuditArchiveRetrievals")
                .serviceDetails(
                        "DataSafe",
                        "ListAuditArchiveRetrievals",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/ListAuditArchiveRetrievals")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuditArchiveRetrievalsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditArchiveRetrievals")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("auditArchiveRetrievalId", request.getAuditArchiveRetrievalId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeOfExpiry", request.getTimeOfExpiry())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditArchiveRetrievalCollection.class,
                        ListAuditArchiveRetrievalsResponse.Builder::auditArchiveRetrievalCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuditArchiveRetrievalsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuditArchiveRetrievalsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAuditArchiveRetrievalsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAuditEventAnalyticsResponse listAuditEventAnalytics(
            ListAuditEventAnalyticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAuditEventAnalyticsResponse::builder)
                .logger(LOG, "listAuditEventAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListAuditEventAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditEventSummary/ListAuditEventAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuditEventAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditEventAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("scimQuery", request.getScimQuery())
                .appendListQueryParam(
                        "summaryField",
                        request.getSummaryField(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeStarted", request.getTimeStarted())
                .appendQueryParam("timeEnded", request.getTimeEnded())
                .appendQueryParam("queryTimeZone", request.getQueryTimeZone())
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditEventAnalyticsCollection.class,
                        ListAuditEventAnalyticsResponse.Builder::auditEventAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuditEventAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuditEventAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAuditEventAnalyticsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAuditEventsResponse listAuditEvents(ListAuditEventsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAuditEventsResponse::builder)
                .logger(LOG, "listAuditEvents")
                .serviceDetails(
                        "DataSafe",
                        "ListAuditEvents",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditEventSummary/ListAuditEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuditEventsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditEvents")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("scimQuery", request.getScimQuery())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json, application/xml")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditEventCollection.class,
                        ListAuditEventsResponse.Builder::auditEventCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuditEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuditEventsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAuditEventsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAuditPoliciesResponse listAuditPolicies(ListAuditPoliciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAuditPoliciesResponse::builder)
                .logger(LOG, "listAuditPolicies")
                .serviceDetails(
                        "DataSafe",
                        "ListAuditPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicyCollection/ListAuditPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuditPoliciesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("auditPolicyId", request.getAuditPolicyId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditPolicyCollection.class,
                        ListAuditPoliciesResponse.Builder::auditPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuditPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuditPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAuditPoliciesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAuditPolicyAnalyticsResponse listAuditPolicyAnalytics(
            ListAuditPolicyAnalyticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAuditPolicyAnalyticsResponse::builder)
                .logger(LOG, "listAuditPolicyAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListAuditPolicyAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicyAnalyticCollection/ListAuditPolicyAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuditPolicyAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditPolicyAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("auditPolicyCategory", request.getAuditPolicyCategory())
                .appendQueryParam("auditPolicyName", request.getAuditPolicyName())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditPolicyAnalyticCollection.class,
                        ListAuditPolicyAnalyticsResponse.Builder::auditPolicyAnalyticCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuditPolicyAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuditPolicyAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAuditPolicyAnalyticsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAuditProfileAnalyticsResponse listAuditProfileAnalytics(
            ListAuditProfileAnalyticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAuditProfileAnalyticsResponse::builder)
                .logger(LOG, "listAuditProfileAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListAuditProfileAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfileAnalyticCollection/ListAuditProfileAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuditProfileAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfileAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditProfileAnalyticCollection.class,
                        ListAuditProfileAnalyticsResponse.Builder::auditProfileAnalyticCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuditProfileAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuditProfileAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAuditProfileAnalyticsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAuditProfilesResponse listAuditProfiles(ListAuditProfilesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAuditProfilesResponse::builder)
                .logger(LOG, "listAuditProfiles")
                .serviceDetails(
                        "DataSafe",
                        "ListAuditProfiles",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListAuditProfiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuditProfilesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("auditProfileId", request.getAuditProfileId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam(
                        "isOverrideGlobalRetentionSetting",
                        request.getIsOverrideGlobalRetentionSetting())
                .appendQueryParam("isPaidUsageEnabled", request.getIsPaidUsageEnabled())
                .appendQueryParam(
                        "auditCollectedVolumeGreaterThanOrEqualTo",
                        request.getAuditCollectedVolumeGreaterThanOrEqualTo())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditProfileCollection.class,
                        ListAuditProfilesResponse.Builder::auditProfileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuditProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuditProfilesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAuditProfilesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAuditTrailAnalyticsResponse listAuditTrailAnalytics(
            ListAuditTrailAnalyticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAuditTrailAnalyticsResponse::builder)
                .logger(LOG, "listAuditTrailAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListAuditTrailAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrailAnalyticCollection/ListAuditTrailAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuditTrailAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditTrailAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("targetId", request.getTargetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditTrailAnalyticCollection.class,
                        ListAuditTrailAnalyticsResponse.Builder::auditTrailAnalyticCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuditTrailAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuditTrailAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAuditTrailAnalyticsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAuditTrailsResponse listAuditTrails(ListAuditTrailsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAuditTrailsResponse::builder)
                .logger(LOG, "listAuditTrails")
                .serviceDetails(
                        "DataSafe",
                        "ListAuditTrails",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/ListAuditTrails")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuditTrailsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditTrails")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("auditTrailId", request.getAuditTrailId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditTrailCollection.class,
                        ListAuditTrailsResponse.Builder::auditTrailCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuditTrailsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuditTrailsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAuditTrailsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAvailableAuditVolumesResponse listAvailableAuditVolumes(
            ListAvailableAuditVolumesRequest request) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");
        Objects.requireNonNull(request.getWorkRequestId(), "workRequestId is required");

        return clientCall(request, ListAvailableAuditVolumesResponse::builder)
                .logger(LOG, "listAvailableAuditVolumes")
                .serviceDetails(
                        "DataSafe",
                        "ListAvailableAuditVolumes",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListAvailableAuditVolumes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailableAuditVolumesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .appendPathParam("availableAuditVolumes")
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("trailLocation", request.getTrailLocation())
                .appendQueryParam(
                        "monthInConsiderationGreaterThan",
                        request.getMonthInConsiderationGreaterThan())
                .appendQueryParam(
                        "monthInConsiderationLessThan", request.getMonthInConsiderationLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AvailableAuditVolumeCollection.class,
                        ListAvailableAuditVolumesResponse.Builder::availableAuditVolumeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAvailableAuditVolumesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAvailableAuditVolumesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAvailableAuditVolumesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListCollectedAuditVolumesResponse listCollectedAuditVolumes(
            ListCollectedAuditVolumesRequest request) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");
        Objects.requireNonNull(request.getWorkRequestId(), "workRequestId is required");

        return clientCall(request, ListCollectedAuditVolumesResponse::builder)
                .logger(LOG, "listCollectedAuditVolumes")
                .serviceDetails(
                        "DataSafe",
                        "ListCollectedAuditVolumes",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListCollectedAuditVolumes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCollectedAuditVolumesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .appendPathParam("collectedAuditVolumes")
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam(
                        "monthInConsiderationGreaterThan",
                        request.getMonthInConsiderationGreaterThan())
                .appendQueryParam(
                        "monthInConsiderationLessThan", request.getMonthInConsiderationLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.CollectedAuditVolumeCollection.class,
                        ListCollectedAuditVolumesResponse.Builder::collectedAuditVolumeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCollectedAuditVolumesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCollectedAuditVolumesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListCollectedAuditVolumesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListColumnsResponse listColumns(ListColumnsRequest request) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, ListColumnsResponse::builder)
                .logger(LOG, "listColumns")
                .serviceDetails(
                        "DataSafe",
                        "ListColumns",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListColumns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListColumnsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("columns")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "tableName",
                        request.getTableName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "columnName",
                        request.getColumnName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "datatype",
                        request.getDatatype(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("schemaNameContains", request.getSchemaNameContains())
                .appendQueryParam("tableNameContains", request.getTableNameContains())
                .appendQueryParam("columnNameContains", request.getColumnNameContains())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.ColumnSummary.class,
                        ListColumnsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListColumnsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListColumnsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListColumnsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDataSafePrivateEndpointsResponse listDataSafePrivateEndpoints(
            ListDataSafePrivateEndpointsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDataSafePrivateEndpointsResponse::builder)
                .logger(LOG, "listDataSafePrivateEndpoints")
                .serviceDetails(
                        "DataSafe",
                        "ListDataSafePrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpointSummary/ListDataSafePrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataSafePrivateEndpointsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("dataSafePrivateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary.class,
                        ListDataSafePrivateEndpointsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDataSafePrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataSafePrivateEndpointsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDifferenceColumnsResponse listDifferenceColumns(
            ListDifferenceColumnsRequest request) {

        Validate.notBlank(
                request.getSdmMaskingPolicyDifferenceId(),
                "sdmMaskingPolicyDifferenceId must not be blank");

        return clientCall(request, ListDifferenceColumnsResponse::builder)
                .logger(LOG, "listDifferenceColumns")
                .serviceDetails(
                        "DataSafe",
                        "ListDifferenceColumns",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/ListDifferenceColumns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDifferenceColumnsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sdmMaskingPolicyDifferences")
                .appendPathParam(request.getSdmMaskingPolicyDifferenceId())
                .appendPathParam("differenceColumns")
                .appendEnumQueryParam("differenceType", request.getDifferenceType())
                .appendEnumQueryParam("plannedAction", request.getPlannedAction())
                .appendEnumQueryParam("syncStatus", request.getSyncStatus())
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectName",
                        request.getObjectName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "columnName",
                        request.getColumnName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifferenceColumnCollection
                                .class,
                        ListDifferenceColumnsResponse.Builder
                                ::sdmMaskingPolicyDifferenceColumnCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDifferenceColumnsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDifferenceColumnsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDifferenceColumnsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDiscoveryAnalyticsResponse listDiscoveryAnalytics(
            ListDiscoveryAnalyticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDiscoveryAnalyticsResponse::builder)
                .logger(LOG, "listDiscoveryAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListDiscoveryAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ListDiscoveryAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDiscoveryAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("discoveryAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("groupBy", request.getGroupBy())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("sensitiveDataModelId", request.getSensitiveDataModelId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DiscoveryAnalyticsCollection.class,
                        ListDiscoveryAnalyticsResponse.Builder::discoveryAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDiscoveryAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDiscoveryAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDiscoveryAnalyticsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDiscoveryJobResultsResponse listDiscoveryJobResults(
            ListDiscoveryJobResultsRequest request) {

        Validate.notBlank(request.getDiscoveryJobId(), "discoveryJobId must not be blank");

        return clientCall(request, ListDiscoveryJobResultsResponse::builder)
                .logger(LOG, "listDiscoveryJobResults")
                .serviceDetails(
                        "DataSafe",
                        "ListDiscoveryJobResults",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ListDiscoveryJobResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDiscoveryJobResultsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("discoveryJobs")
                .appendPathParam(request.getDiscoveryJobId())
                .appendPathParam("results")
                .appendEnumQueryParam("discoveryType", request.getDiscoveryType())
                .appendEnumQueryParam("plannedAction", request.getPlannedAction())
                .appendQueryParam("isResultApplied", request.getIsResultApplied())
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectName",
                        request.getObjectName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "columnName",
                        request.getColumnName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DiscoveryJobResultCollection.class,
                        ListDiscoveryJobResultsResponse.Builder::discoveryJobResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDiscoveryJobResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDiscoveryJobResultsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDiscoveryJobResultsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDiscoveryJobsResponse listDiscoveryJobs(ListDiscoveryJobsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDiscoveryJobsResponse::builder)
                .logger(LOG, "listDiscoveryJobs")
                .serviceDetails(
                        "DataSafe",
                        "ListDiscoveryJobs",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ListDiscoveryJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDiscoveryJobsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("discoveryJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("discoveryJobId", request.getDiscoveryJobId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("sensitiveDataModelId", request.getSensitiveDataModelId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DiscoveryJobCollection.class,
                        ListDiscoveryJobsResponse.Builder::discoveryJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDiscoveryJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDiscoveryJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDiscoveryJobsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListFindingsResponse listFindings(ListFindingsRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        return clientCall(request, ListFindingsResponse::builder)
                .logger(LOG, "listFindings")
                .serviceDetails(
                        "DataSafe",
                        "ListFindings",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListFindings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFindingsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("findings")
                .appendEnumQueryParam("severity", request.getSeverity())
                .appendEnumQueryParam("references", request.getReferences())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("findingKey", request.getFindingKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.FindingSummary.class,
                        ListFindingsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListFindingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFindingsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListFindingsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListGrantsResponse listGrants(ListGrantsRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        Validate.notBlank(request.getUserKey(), "userKey must not be blank");

        return clientCall(request, ListGrantsResponse::builder)
                .logger(LOG, "listGrants")
                .serviceDetails(
                        "DataSafe",
                        "ListGrants",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListGrants")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGrantsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("users")
                .appendPathParam(request.getUserKey())
                .appendPathParam("grants")
                .appendQueryParam("grantKey", request.getGrantKey())
                .appendQueryParam("grantName", request.getGrantName())
                .appendQueryParam("privilegeType", request.getPrivilegeType())
                .appendQueryParam("privilegeCategory", request.getPrivilegeCategory())
                .appendQueryParam("depthLevel", request.getDepthLevel())
                .appendQueryParam(
                        "depthLevelGreaterThanOrEqualTo",
                        request.getDepthLevelGreaterThanOrEqualTo())
                .appendQueryParam("depthLevelLessThan", request.getDepthLevelLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.GrantSummary.class,
                        ListGrantsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListGrantsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGrantsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListGrantsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLibraryMaskingFormatsResponse listLibraryMaskingFormats(
            ListLibraryMaskingFormatsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLibraryMaskingFormatsResponse::builder)
                .logger(LOG, "listLibraryMaskingFormats")
                .serviceDetails(
                        "DataSafe",
                        "ListLibraryMaskingFormats",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormatSummary/ListLibraryMaskingFormats")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLibraryMaskingFormatsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("libraryMaskingFormats")
                .appendQueryParam("libraryMaskingFormatId", request.getLibraryMaskingFormatId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendEnumQueryParam(
                        "libraryMaskingFormatSource", request.getLibraryMaskingFormatSource())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.LibraryMaskingFormatCollection.class,
                        ListLibraryMaskingFormatsResponse.Builder::libraryMaskingFormatCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLibraryMaskingFormatsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLibraryMaskingFormatsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListLibraryMaskingFormatsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMaskedColumnsResponse listMaskedColumns(ListMaskedColumnsRequest request) {

        Validate.notBlank(request.getMaskingReportId(), "maskingReportId must not be blank");

        return clientCall(request, ListMaskedColumnsResponse::builder)
                .logger(LOG, "listMaskedColumns")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskedColumns",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskedColumnSummary/ListMaskedColumns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskedColumnsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingReports")
                .appendPathParam(request.getMaskingReportId())
                .appendPathParam("maskedColumns")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectName",
                        request.getObjectName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "columnName",
                        request.getColumnName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectType",
                        request.getObjectType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "maskingColumnGroup",
                        request.getMaskingColumnGroup(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("sensitiveTypeId", request.getSensitiveTypeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskedColumnCollection.class,
                        ListMaskedColumnsResponse.Builder::maskedColumnCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaskedColumnsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaskedColumnsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListMaskedColumnsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMaskingAnalyticsResponse listMaskingAnalytics(ListMaskingAnalyticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaskingAnalyticsResponse::builder)
                .logger(LOG, "listMaskingAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskingAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskingAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("groupBy", request.getGroupBy())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("maskingPolicyId", request.getMaskingPolicyId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingAnalyticsCollection.class,
                        ListMaskingAnalyticsResponse.Builder::maskingAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaskingAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaskingAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListMaskingAnalyticsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMaskingColumnsResponse listMaskingColumns(ListMaskingColumnsRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        return clientCall(request, ListMaskingColumnsResponse::builder)
                .logger(LOG, "listMaskingColumns")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskingColumns",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/ListMaskingColumns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskingColumnsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("maskingColumns")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam(
                        "maskingColumnLifecycleState", request.getMaskingColumnLifecycleState())
                .appendListQueryParam(
                        "dataType",
                        request.getDataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectName",
                        request.getObjectName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "columnName",
                        request.getColumnName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectType",
                        request.getObjectType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "maskingColumnGroup",
                        request.getMaskingColumnGroup(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("sensitiveTypeId", request.getSensitiveTypeId())
                .appendQueryParam("isMaskingEnabled", request.getIsMaskingEnabled())
                .appendQueryParam("isSeedRequired", request.getIsSeedRequired())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam(
                        "timeUpdatedGreaterThanOrEqualTo",
                        request.getTimeUpdatedGreaterThanOrEqualTo())
                .appendQueryParam("timeUpdatedLessThan", request.getTimeUpdatedLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingColumnCollection.class,
                        ListMaskingColumnsResponse.Builder::maskingColumnCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaskingColumnsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaskingColumnsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListMaskingColumnsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMaskingObjectsResponse listMaskingObjects(ListMaskingObjectsRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        return clientCall(request, ListMaskingObjectsResponse::builder)
                .logger(LOG, "listMaskingObjects")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskingObjects",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingObjectCollection/ListMaskingObjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskingObjectsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("maskingObjects")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectName",
                        request.getObjectName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectType",
                        request.getObjectType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingObjectCollection.class,
                        ListMaskingObjectsResponse.Builder::maskingObjectCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaskingObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaskingObjectsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListMaskingObjectsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMaskingPoliciesResponse listMaskingPolicies(ListMaskingPoliciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaskingPoliciesResponse::builder)
                .logger(LOG, "listMaskingPolicies")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskingPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskingPoliciesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendQueryParam("maskingPolicyId", request.getMaskingPolicyId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("sensitiveDataModelId", request.getSensitiveDataModelId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingPolicyCollection.class,
                        ListMaskingPoliciesResponse.Builder::maskingPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaskingPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaskingPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListMaskingPoliciesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMaskingReportsResponse listMaskingReports(ListMaskingReportsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaskingReportsResponse::builder)
                .logger(LOG, "listMaskingReports")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskingReports",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingReports")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskingReportsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingReports")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("maskingPolicyId", request.getMaskingPolicyId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingReportCollection.class,
                        ListMaskingReportsResponse.Builder::maskingReportCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaskingReportsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaskingReportsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListMaskingReportsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMaskingSchemasResponse listMaskingSchemas(ListMaskingSchemasRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        return clientCall(request, ListMaskingSchemasResponse::builder)
                .logger(LOG, "listMaskingSchemas")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskingSchemas",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingSchemaCollection/ListMaskingSchemas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskingSchemasRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("maskingSchemas")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingSchemaCollection.class,
                        ListMaskingSchemasResponse.Builder::maskingSchemaCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaskingSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaskingSchemasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListMaskingSchemasResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListOnPremConnectorsResponse listOnPremConnectors(ListOnPremConnectorsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOnPremConnectorsResponse::builder)
                .logger(LOG, "listOnPremConnectors")
                .serviceDetails(
                        "DataSafe",
                        "ListOnPremConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnectorSummary/ListOnPremConnectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOnPremConnectorsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("onPremConnectors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("onPremConnectorId", request.getOnPremConnectorId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam(
                        "onPremConnectorLifecycleState", request.getOnPremConnectorLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.OnPremConnectorSummary.class,
                        ListOnPremConnectorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListOnPremConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOnPremConnectorsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListProfileAnalyticsResponse listProfileAnalytics(ListProfileAnalyticsRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProfileAnalyticsResponse::builder)
                .logger(LOG, "listProfileAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListProfileAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Profile/ListProfileAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProfileAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("profileAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("profileName", request.getProfileName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.ProfileAggregation.class,
                        ListProfileAnalyticsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListProfileAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProfileAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListProfileAnalyticsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListProfileSummariesResponse listProfileSummaries(ListProfileSummariesRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProfileSummariesResponse::builder)
                .logger(LOG, "listProfileSummaries")
                .serviceDetails(
                        "DataSafe",
                        "ListProfileSummaries",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListProfileSummaries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProfileSummariesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("profiles")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("profileName", request.getProfileName())
                .appendQueryParam("isUserCreated", request.getIsUserCreated())
                .appendQueryParam(
                        "passwordVerificationFunction", request.getPasswordVerificationFunction())
                .appendQueryParam(
                        "userCountGreaterThanOrEqual", request.getUserCountGreaterThanOrEqual())
                .appendQueryParam("userCountLessThan", request.getUserCountLessThan())
                .appendQueryParam(
                        "failedLoginAttemptsGreaterThanOrEqual",
                        request.getFailedLoginAttemptsGreaterThanOrEqual())
                .appendQueryParam(
                        "failedLoginAttemptsLessThan", request.getFailedLoginAttemptsLessThan())
                .appendQueryParam(
                        "sessionsPerUserGreaterThanOrEqual",
                        request.getSessionsPerUserGreaterThanOrEqual())
                .appendQueryParam("sessionsPerUserLessThan", request.getSessionsPerUserLessThan())
                .appendQueryParam(
                        "inactiveAccountTimeGreaterThanOrEqual",
                        request.getInactiveAccountTimeGreaterThanOrEqual())
                .appendQueryParam(
                        "inactiveAccountTimeLessThan", request.getInactiveAccountTimeLessThan())
                .appendQueryParam(
                        "passwordLockTimeGreaterThanOrEqual",
                        request.getPasswordLockTimeGreaterThanOrEqual())
                .appendQueryParam("passwordLockTimeLessThan", request.getPasswordLockTimeLessThan())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.ProfileSummary.class,
                        ListProfileSummariesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListProfileSummariesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProfileSummariesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListProfileSummariesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListReportDefinitionsResponse listReportDefinitions(
            ListReportDefinitionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListReportDefinitionsResponse::builder)
                .logger(LOG, "listReportDefinitions")
                .serviceDetails(
                        "DataSafe",
                        "ListReportDefinitions",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/ListReportDefinitions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReportDefinitionsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reportDefinitions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("isSeeded", request.getIsSeeded())
                .appendEnumQueryParam("dataSource", request.getDataSource())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("category", request.getCategory())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.ReportDefinitionCollection.class,
                        ListReportDefinitionsResponse.Builder::reportDefinitionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListReportDefinitionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReportDefinitionsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListReportsResponse listReports(ListReportsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListReportsResponse::builder)
                .logger(LOG, "listReports")
                .serviceDetails(
                        "DataSafe",
                        "ListReports",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportSummary/ListReports")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReportsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reports")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("reportDefinitionId", request.getReportDefinitionId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("type", request.getType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.ReportCollection.class,
                        ListReportsResponse.Builder::reportCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListReportsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReportsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListRolesResponse listRoles(ListRolesRequest request) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, ListRolesResponse::builder)
                .logger(LOG, "listRoles")
                .serviceDetails(
                        "DataSafe",
                        "ListRoles",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListRoles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRolesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("roles")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "roleName",
                        request.getRoleName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isOracleMaintained", request.getIsOracleMaintained())
                .appendQueryParam("authenticationType", request.getAuthenticationType())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("roleNameContains", request.getRoleNameContains())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.RoleSummary.class,
                        ListRolesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListRolesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListRolesResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", ListRolesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSchemasResponse listSchemas(ListSchemasRequest request) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, ListSchemasResponse::builder)
                .logger(LOG, "listSchemas")
                .serviceDetails(
                        "DataSafe",
                        "ListSchemas",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListSchemas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSchemasRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("schemas")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("isOracleMaintained", request.getIsOracleMaintained())
                .appendQueryParam("schemaNameContains", request.getSchemaNameContains())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.SchemaSummary.class,
                        ListSchemasResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSchemasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSchemasResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSdmMaskingPolicyDifferencesResponse listSdmMaskingPolicyDifferences(
            ListSdmMaskingPolicyDifferencesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSdmMaskingPolicyDifferencesResponse::builder)
                .logger(LOG, "listSdmMaskingPolicyDifferences")
                .serviceDetails(
                        "DataSafe",
                        "ListSdmMaskingPolicyDifferences",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/ListSdmMaskingPolicyDifferences")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSdmMaskingPolicyDifferencesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sdmMaskingPolicyDifferences")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("differenceAccessLevel", request.getDifferenceAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("sensitiveDataModelId", request.getSensitiveDataModelId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("maskingPolicyId", request.getMaskingPolicyId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifferenceCollection.class,
                        ListSdmMaskingPolicyDifferencesResponse.Builder
                                ::sdmMaskingPolicyDifferenceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSdmMaskingPolicyDifferencesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSdmMaskingPolicyDifferencesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListSdmMaskingPolicyDifferencesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSecurityAssessmentsResponse listSecurityAssessments(
            ListSecurityAssessmentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecurityAssessmentsResponse::builder)
                .logger(LOG, "listSecurityAssessments")
                .serviceDetails(
                        "DataSafe",
                        "ListSecurityAssessments",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessmentSummary/ListSecurityAssessments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityAssessmentsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("scheduleAssessmentId", request.getScheduleAssessmentId())
                .appendQueryParam("isScheduleAssessment", request.getIsScheduleAssessment())
                .appendEnumQueryParam("triggeredBy", request.getTriggeredBy())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("isBaseline", request.getIsBaseline())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.SecurityAssessmentSummary.class,
                        ListSecurityAssessmentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityAssessmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityAssessmentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSecurityAssessmentsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSensitiveColumnsResponse listSensitiveColumns(ListSensitiveColumnsRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        return clientCall(request, ListSensitiveColumnsResponse::builder)
                .logger(LOG, "listSensitiveColumns")
                .serviceDetails(
                        "DataSafe",
                        "ListSensitiveColumns",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/ListSensitiveColumns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSensitiveColumnsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("sensitiveColumns")
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam(
                        "timeUpdatedGreaterThanOrEqualTo",
                        request.getTimeUpdatedGreaterThanOrEqualTo())
                .appendQueryParam("timeUpdatedLessThan", request.getTimeUpdatedLessThan())
                .appendEnumQueryParam(
                        "sensitiveColumnLifecycleState", request.getSensitiveColumnLifecycleState())
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectName",
                        request.getObjectName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "columnName",
                        request.getColumnName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectType",
                        request.getObjectType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "dataType",
                        request.getDataType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "sensitiveTypeId",
                        request.getSensitiveTypeId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "parentColumnKey",
                        request.getParentColumnKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "relationType",
                        request.getRelationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("columnGroup", request.getColumnGroup())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("isCaseInSensitive", request.getIsCaseInSensitive())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveColumnCollection.class,
                        ListSensitiveColumnsResponse.Builder::sensitiveColumnCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSensitiveColumnsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSensitiveColumnsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSensitiveColumnsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSensitiveDataModelsResponse listSensitiveDataModels(
            ListSensitiveDataModelsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSensitiveDataModelsResponse::builder)
                .logger(LOG, "listSensitiveDataModels")
                .serviceDetails(
                        "DataSafe",
                        "ListSensitiveDataModels",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ListSensitiveDataModels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSensitiveDataModelsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("sensitiveDataModelId", request.getSensitiveDataModelId())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveDataModelCollection.class,
                        ListSensitiveDataModelsResponse.Builder::sensitiveDataModelCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSensitiveDataModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSensitiveDataModelsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSensitiveDataModelsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSensitiveObjectsResponse listSensitiveObjects(ListSensitiveObjectsRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        return clientCall(request, ListSensitiveObjectsResponse::builder)
                .logger(LOG, "listSensitiveObjects")
                .serviceDetails(
                        "DataSafe",
                        "ListSensitiveObjects",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveObjectCollection/ListSensitiveObjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSensitiveObjectsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("sensitiveObjects")
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectName",
                        request.getObjectName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "objectType",
                        request.getObjectType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveObjectCollection.class,
                        ListSensitiveObjectsResponse.Builder::sensitiveObjectCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSensitiveObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSensitiveObjectsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSensitiveObjectsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSensitiveSchemasResponse listSensitiveSchemas(ListSensitiveSchemasRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        return clientCall(request, ListSensitiveSchemasResponse::builder)
                .logger(LOG, "listSensitiveSchemas")
                .serviceDetails(
                        "DataSafe",
                        "ListSensitiveSchemas",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveSchemaCollection/ListSensitiveSchemas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSensitiveSchemasRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("sensitiveSchemas")
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveSchemaCollection.class,
                        ListSensitiveSchemasResponse.Builder::sensitiveSchemaCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSensitiveSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSensitiveSchemasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSensitiveSchemasResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSensitiveTypesResponse listSensitiveTypes(ListSensitiveTypesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSensitiveTypesResponse::builder)
                .logger(LOG, "listSensitiveTypes")
                .serviceDetails(
                        "DataSafe",
                        "ListSensitiveTypes",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/ListSensitiveTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSensitiveTypesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("sensitiveTypeId", request.getSensitiveTypeId())
                .appendEnumQueryParam("sensitiveTypeSource", request.getSensitiveTypeSource())
                .appendEnumQueryParam("entityType", request.getEntityType())
                .appendQueryParam("parentCategoryId", request.getParentCategoryId())
                .appendQueryParam("defaultMaskingFormatId", request.getDefaultMaskingFormatId())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveTypeCollection.class,
                        ListSensitiveTypesResponse.Builder::sensitiveTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSensitiveTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSensitiveTypesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSensitiveTypesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTablesResponse listTables(ListTablesRequest request) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, ListTablesResponse::builder)
                .logger(LOG, "listTables")
                .serviceDetails(
                        "DataSafe",
                        "ListTables",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListTables")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTablesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("tables")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "schemaName",
                        request.getSchemaName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "tableName",
                        request.getTableName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("tableNameContains", request.getTableNameContains())
                .appendQueryParam("schemaNameContains", request.getSchemaNameContains())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.TableSummary.class,
                        ListTablesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListTablesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTablesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTablesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTargetAlertPolicyAssociationsResponse listTargetAlertPolicyAssociations(
            ListTargetAlertPolicyAssociationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTargetAlertPolicyAssociationsResponse::builder)
                .logger(LOG, "listTargetAlertPolicyAssociations")
                .serviceDetails(
                        "DataSafe",
                        "ListTargetAlertPolicyAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociationSummary/ListTargetAlertPolicyAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetAlertPolicyAssociationsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetAlertPolicyAssociations")
                .appendQueryParam(
                        "targetAlertPolicyAssociationId",
                        request.getTargetAlertPolicyAssociationId())
                .appendQueryParam("alertPolicyId", request.getAlertPolicyId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociationCollection.class,
                        ListTargetAlertPolicyAssociationsResponse.Builder
                                ::targetAlertPolicyAssociationCollection)
                .handleResponseHeaderString(
                        "etag", ListTargetAlertPolicyAssociationsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListTargetAlertPolicyAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListTargetAlertPolicyAssociationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListTargetAlertPolicyAssociationsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTargetDatabasesResponse listTargetDatabases(ListTargetDatabasesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTargetDatabasesResponse::builder)
                .logger(LOG, "listTargetDatabases")
                .serviceDetails(
                        "DataSafe",
                        "ListTargetDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseSummary/ListTargetDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetDatabasesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("associatedResourceId", request.getAssociatedResourceId())
                .appendQueryParam("targetDatabaseId", request.getTargetDatabaseId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("databaseType", request.getDatabaseType())
                .appendEnumQueryParam("infrastructureType", request.getInfrastructureType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.TargetDatabaseSummary.class,
                        ListTargetDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListTargetDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTargetDatabasesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTargetDatabasesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListUserAnalyticsResponse listUserAnalytics(ListUserAnalyticsRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        return clientCall(request, ListUserAnalyticsResponse::builder)
                .logger(LOG, "listUserAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListUserAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListUserAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUserAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("userAnalytics")
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("userCategory", request.getUserCategory())
                .appendQueryParam("userKey", request.getUserKey())
                .appendQueryParam("accountStatus", request.getAccountStatus())
                .appendQueryParam("authenticationType", request.getAuthenticationType())
                .appendQueryParam("userName", request.getUserName())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam(
                        "timeLastLoginGreaterThanOrEqualTo",
                        request.getTimeLastLoginGreaterThanOrEqualTo())
                .appendQueryParam("timeLastLoginLessThan", request.getTimeLastLoginLessThan())
                .appendQueryParam(
                        "timeUserCreatedGreaterThanOrEqualTo",
                        request.getTimeUserCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeUserCreatedLessThan", request.getTimeUserCreatedLessThan())
                .appendQueryParam(
                        "timePasswordLastChangedGreaterThanOrEqualTo",
                        request.getTimePasswordLastChangedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timePasswordLastChangedLessThan",
                        request.getTimePasswordLastChangedLessThan())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.UserAggregation.class,
                        ListUserAnalyticsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListUserAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUserAnalyticsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListUserAssessmentsResponse listUserAssessments(ListUserAssessmentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListUserAssessmentsResponse::builder)
                .logger(LOG, "listUserAssessments")
                .serviceDetails(
                        "DataSafe",
                        "ListUserAssessments",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessmentSummary/ListUserAssessments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUserAssessmentsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("scheduleUserAssessmentId", request.getScheduleUserAssessmentId())
                .appendQueryParam("isScheduleAssessment", request.getIsScheduleAssessment())
                .appendQueryParam("isBaseline", request.getIsBaseline())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("triggeredBy", request.getTriggeredBy())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.UserAssessmentSummary.class,
                        ListUserAssessmentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListUserAssessmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUserAssessmentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListUserAssessmentsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        return clientCall(request, ListUsersResponse::builder)
                .logger(LOG, "listUsers")
                .serviceDetails(
                        "DataSafe",
                        "ListUsers",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUsersRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("users")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("userCategory", request.getUserCategory())
                .appendQueryParam("userRole", request.getUserRole())
                .appendQueryParam("userProfile", request.getUserProfile())
                .appendQueryParam("userType", request.getUserType())
                .appendQueryParam("userKey", request.getUserKey())
                .appendQueryParam("accountStatus", request.getAccountStatus())
                .appendQueryParam("authenticationType", request.getAuthenticationType())
                .appendQueryParam("userName", request.getUserName())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam(
                        "timeLastLoginGreaterThanOrEqualTo",
                        request.getTimeLastLoginGreaterThanOrEqualTo())
                .appendQueryParam("timeLastLoginLessThan", request.getTimeLastLoginLessThan())
                .appendQueryParam(
                        "timeUserCreatedGreaterThanOrEqualTo",
                        request.getTimeUserCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeUserCreatedLessThan", request.getTimeUserCreatedLessThan())
                .appendQueryParam(
                        "timePasswordLastChangedGreaterThanOrEqualTo",
                        request.getTimePasswordLastChangedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timePasswordLastChangedLessThan",
                        request.getTimePasswordLastChangedLessThan())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.UserSummary.class,
                        ListUsersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListUsersResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", ListUsersResponse.Builder::opcPrevPage)
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
                        "DataSafe",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "DataSafe",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "DataSafe",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestSummary/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("operationType", request.getOperationType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("targetDatabaseId", request.getTargetDatabaseId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public MaskDataResponse maskData(MaskDataRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(request.getMaskDataDetails(), "maskDataDetails is required");

        return clientCall(request, MaskDataResponse::builder)
                .logger(LOG, "maskData")
                .serviceDetails(
                        "DataSafe",
                        "MaskData",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/MaskData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MaskDataRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("actions")
                .appendPathParam("mask")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", MaskDataResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", MaskDataResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ModifyGlobalSettingsResponse modifyGlobalSettings(ModifyGlobalSettingsRequest request) {
        Objects.requireNonNull(
                request.getModifyGlobalSettingsDetails(),
                "modifyGlobalSettingsDetails is required");

        Validate.notBlank(request.getCompartmentId(), "compartmentId must not be blank");

        return clientCall(request, ModifyGlobalSettingsResponse::builder)
                .logger(LOG, "modifyGlobalSettings")
                .serviceDetails(
                        "DataSafe",
                        "ModifyGlobalSettings",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/ModifyGlobalSettings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ModifyGlobalSettingsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("configuration")
                .appendPathParam(request.getCompartmentId())
                .appendPathParam("actions")
                .appendPathParam("modifyGlobalSettings")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ModifyGlobalSettingsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ModifyGlobalSettingsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public PatchAlertsResponse patchAlerts(PatchAlertsRequest request) {
        Objects.requireNonNull(request.getPatchAlertsDetails(), "patchAlertsDetails is required");

        return clientCall(request, PatchAlertsResponse::builder)
                .logger(LOG, "patchAlerts")
                .serviceDetails(
                        "DataSafe",
                        "PatchAlerts",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/PatchAlerts")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchAlertsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alerts")
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PatchAlertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchAlertsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public PatchDiscoveryJobResultsResponse patchDiscoveryJobResults(
            PatchDiscoveryJobResultsRequest request) {

        Validate.notBlank(request.getDiscoveryJobId(), "discoveryJobId must not be blank");
        Objects.requireNonNull(
                request.getPatchDiscoveryJobResultDetails(),
                "patchDiscoveryJobResultDetails is required");

        return clientCall(request, PatchDiscoveryJobResultsResponse::builder)
                .logger(LOG, "patchDiscoveryJobResults")
                .serviceDetails(
                        "DataSafe",
                        "PatchDiscoveryJobResults",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/PatchDiscoveryJobResults")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchDiscoveryJobResultsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("discoveryJobs")
                .appendPathParam(request.getDiscoveryJobId())
                .appendPathParam("results")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchDiscoveryJobResultsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchDiscoveryJobResultsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public PatchMaskingColumnsResponse patchMaskingColumns(PatchMaskingColumnsRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getPatchMaskingColumnsDetails(), "patchMaskingColumnsDetails is required");

        return clientCall(request, PatchMaskingColumnsResponse::builder)
                .logger(LOG, "patchMaskingColumns")
                .serviceDetails(
                        "DataSafe",
                        "PatchMaskingColumns",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/PatchMaskingColumns")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMaskingColumnsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("maskingColumns")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchMaskingColumnsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchMaskingColumnsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public PatchSdmMaskingPolicyDifferenceColumnsResponse patchSdmMaskingPolicyDifferenceColumns(
            PatchSdmMaskingPolicyDifferenceColumnsRequest request) {

        Validate.notBlank(
                request.getSdmMaskingPolicyDifferenceId(),
                "sdmMaskingPolicyDifferenceId must not be blank");
        Objects.requireNonNull(
                request.getPatchSdmMaskingPolicyDifferenceColumnsDetails(),
                "patchSdmMaskingPolicyDifferenceColumnsDetails is required");

        return clientCall(request, PatchSdmMaskingPolicyDifferenceColumnsResponse::builder)
                .logger(LOG, "patchSdmMaskingPolicyDifferenceColumns")
                .serviceDetails(
                        "DataSafe",
                        "PatchSdmMaskingPolicyDifferenceColumns",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/PatchSdmMaskingPolicyDifferenceColumns")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSdmMaskingPolicyDifferenceColumnsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sdmMaskingPolicyDifferences")
                .appendPathParam(request.getSdmMaskingPolicyDifferenceId())
                .appendPathParam("differenceColumns")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchSdmMaskingPolicyDifferenceColumnsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PatchSdmMaskingPolicyDifferenceColumnsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public PatchSensitiveColumnsResponse patchSensitiveColumns(
            PatchSensitiveColumnsRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getPatchSensitiveColumnDetails(),
                "patchSensitiveColumnDetails is required");

        return clientCall(request, PatchSensitiveColumnsResponse::builder)
                .logger(LOG, "patchSensitiveColumns")
                .serviceDetails(
                        "DataSafe",
                        "PatchSensitiveColumns",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/PatchSensitiveColumns")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSensitiveColumnsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("sensitiveColumns")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchSensitiveColumnsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchSensitiveColumnsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public PatchTargetAlertPolicyAssociationResponse patchTargetAlertPolicyAssociation(
            PatchTargetAlertPolicyAssociationRequest request) {
        Objects.requireNonNull(
                request.getPatchTargetAlertPolicyAssociationDetails(),
                "patchTargetAlertPolicyAssociationDetails is required");

        return clientCall(request, PatchTargetAlertPolicyAssociationResponse::builder)
                .logger(LOG, "patchTargetAlertPolicyAssociation")
                .serviceDetails(
                        "DataSafe",
                        "PatchTargetAlertPolicyAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/PatchTargetAlertPolicyAssociation")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchTargetAlertPolicyAssociationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetAlertPolicyAssociations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchTargetAlertPolicyAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PatchTargetAlertPolicyAssociationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ProvisionAuditPolicyResponse provisionAuditPolicy(ProvisionAuditPolicyRequest request) {
        Objects.requireNonNull(
                request.getProvisionAuditPolicyDetails(),
                "provisionAuditPolicyDetails is required");

        Validate.notBlank(request.getAuditPolicyId(), "auditPolicyId must not be blank");

        return clientCall(request, ProvisionAuditPolicyResponse::builder)
                .logger(LOG, "provisionAuditPolicy")
                .serviceDetails(
                        "DataSafe",
                        "ProvisionAuditPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/ProvisionAuditPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ProvisionAuditPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditPolicies")
                .appendPathParam(request.getAuditPolicyId())
                .appendPathParam("actions")
                .appendPathParam("provision")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ProvisionAuditPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ProvisionAuditPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RefreshSecurityAssessmentResponse refreshSecurityAssessment(
            RefreshSecurityAssessmentRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getRunSecurityAssessmentDetails(),
                "runSecurityAssessmentDetails is required");

        return clientCall(request, RefreshSecurityAssessmentResponse::builder)
                .logger(LOG, "refreshSecurityAssessment")
                .serviceDetails(
                        "DataSafe",
                        "RefreshSecurityAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/RefreshSecurityAssessment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshSecurityAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshSecurityAssessmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RefreshSecurityAssessmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RefreshUserAssessmentResponse refreshUserAssessment(
            RefreshUserAssessmentRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getRunUserAssessmentDetails(), "runUserAssessmentDetails is required");

        return clientCall(request, RefreshUserAssessmentResponse::builder)
                .logger(LOG, "refreshUserAssessment")
                .serviceDetails(
                        "DataSafe",
                        "RefreshUserAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/RefreshUserAssessment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshUserAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshUserAssessmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RefreshUserAssessmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RemoveScheduleReportResponse removeScheduleReport(RemoveScheduleReportRequest request) {

        Validate.notBlank(request.getReportDefinitionId(), "reportDefinitionId must not be blank");

        return clientCall(request, RemoveScheduleReportResponse::builder)
                .logger(LOG, "removeScheduleReport")
                .serviceDetails(
                        "DataSafe",
                        "RemoveScheduleReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/RemoveScheduleReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveScheduleReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reportDefinitions")
                .appendPathParam(request.getReportDefinitionId())
                .appendPathParam("actions")
                .appendPathParam("removeScheduleReport")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveScheduleReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveScheduleReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ResumeAuditTrailResponse resumeAuditTrail(ResumeAuditTrailRequest request) {

        Validate.notBlank(request.getAuditTrailId(), "auditTrailId must not be blank");

        return clientCall(request, ResumeAuditTrailResponse::builder)
                .logger(LOG, "resumeAuditTrail")
                .serviceDetails(
                        "DataSafe",
                        "ResumeAuditTrail",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/ResumeAuditTrail")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResumeAuditTrailRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditTrails")
                .appendPathParam(request.getAuditTrailId())
                .appendPathParam("actions")
                .appendPathParam("resume")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", ResumeAuditTrailResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ResumeAuditTrailResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ResumeWorkRequestResponse resumeWorkRequest(ResumeWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ResumeWorkRequestResponse::builder)
                .logger(LOG, "resumeWorkRequest")
                .serviceDetails(
                        "DataSafe",
                        "ResumeWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/ResumeWorkRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResumeWorkRequestRequest::builder)
                .basePath("/20181201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("actions")
                .appendPathParam("resume")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", ResumeWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", ResumeWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RetrieveAuditPoliciesResponse retrieveAuditPolicies(
            RetrieveAuditPoliciesRequest request) {

        Validate.notBlank(request.getAuditPolicyId(), "auditPolicyId must not be blank");

        return clientCall(request, RetrieveAuditPoliciesResponse::builder)
                .logger(LOG, "retrieveAuditPolicies")
                .serviceDetails(
                        "DataSafe",
                        "RetrieveAuditPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/RetrieveAuditPolicies")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveAuditPoliciesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditPolicies")
                .appendPathParam(request.getAuditPolicyId())
                .appendPathParam("actions")
                .appendPathParam("retrieveFromTarget")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RetrieveAuditPoliciesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RetrieveAuditPoliciesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ScheduleReportResponse scheduleReport(ScheduleReportRequest request) {

        Validate.notBlank(request.getReportDefinitionId(), "reportDefinitionId must not be blank");
        Objects.requireNonNull(
                request.getScheduleReportDetails(), "scheduleReportDetails is required");

        return clientCall(request, ScheduleReportResponse::builder)
                .logger(LOG, "scheduleReport")
                .serviceDetails(
                        "DataSafe",
                        "ScheduleReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/ScheduleReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reportDefinitions")
                .appendPathParam(request.getReportDefinitionId())
                .appendPathParam("actions")
                .appendPathParam("scheduleReport")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ScheduleReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ScheduleReportResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SetSecurityAssessmentBaselineResponse setSecurityAssessmentBaseline(
            SetSecurityAssessmentBaselineRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        return clientCall(request, SetSecurityAssessmentBaselineResponse::builder)
                .logger(LOG, "setSecurityAssessmentBaseline")
                .serviceDetails(
                        "DataSafe",
                        "SetSecurityAssessmentBaseline",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/SetSecurityAssessmentBaseline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SetSecurityAssessmentBaselineRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("setBaseline")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SetSecurityAssessmentBaselineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SetSecurityAssessmentBaselineResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SetUserAssessmentBaselineResponse setUserAssessmentBaseline(
            SetUserAssessmentBaselineRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        return clientCall(request, SetUserAssessmentBaselineResponse::builder)
                .logger(LOG, "setUserAssessmentBaseline")
                .serviceDetails(
                        "DataSafe",
                        "SetUserAssessmentBaseline",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/SetUserAssessmentBaseline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SetUserAssessmentBaselineRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("setBaseline")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SetUserAssessmentBaselineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", SetUserAssessmentBaselineResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StartAuditTrailResponse startAuditTrail(StartAuditTrailRequest request) {
        Objects.requireNonNull(
                request.getStartAuditTrailDetails(), "startAuditTrailDetails is required");

        Validate.notBlank(request.getAuditTrailId(), "auditTrailId must not be blank");

        return clientCall(request, StartAuditTrailResponse::builder)
                .logger(LOG, "startAuditTrail")
                .serviceDetails(
                        "DataSafe",
                        "StartAuditTrail",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/StartAuditTrail")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartAuditTrailRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditTrails")
                .appendPathParam(request.getAuditTrailId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartAuditTrailResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartAuditTrailResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StopAuditTrailResponse stopAuditTrail(StopAuditTrailRequest request) {

        Validate.notBlank(request.getAuditTrailId(), "auditTrailId must not be blank");

        return clientCall(request, StopAuditTrailResponse::builder)
                .logger(LOG, "stopAuditTrail")
                .serviceDetails(
                        "DataSafe",
                        "StopAuditTrail",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/StopAuditTrail")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopAuditTrailRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditTrails")
                .appendPathParam(request.getAuditTrailId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", StopAuditTrailResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopAuditTrailResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SuspendWorkRequestResponse suspendWorkRequest(SuspendWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, SuspendWorkRequestResponse::builder)
                .logger(LOG, "suspendWorkRequest")
                .serviceDetails(
                        "DataSafe",
                        "SuspendWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/SuspendWorkRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SuspendWorkRequestRequest::builder)
                .basePath("/20181201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("actions")
                .appendPathParam("suspend")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", SuspendWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", SuspendWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UnsetSecurityAssessmentBaselineResponse unsetSecurityAssessmentBaseline(
            UnsetSecurityAssessmentBaselineRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        return clientCall(request, UnsetSecurityAssessmentBaselineResponse::builder)
                .logger(LOG, "unsetSecurityAssessmentBaseline")
                .serviceDetails(
                        "DataSafe",
                        "UnsetSecurityAssessmentBaseline",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/UnsetSecurityAssessmentBaseline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UnsetSecurityAssessmentBaselineRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("unsetBaseline")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UnsetSecurityAssessmentBaselineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UnsetSecurityAssessmentBaselineResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UnsetUserAssessmentBaselineResponse unsetUserAssessmentBaseline(
            UnsetUserAssessmentBaselineRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        return clientCall(request, UnsetUserAssessmentBaselineResponse::builder)
                .logger(LOG, "unsetUserAssessmentBaseline")
                .serviceDetails(
                        "DataSafe",
                        "UnsetUserAssessmentBaseline",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/UnsetUserAssessmentBaseline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UnsetUserAssessmentBaselineRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("unsetBaseline")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UnsetUserAssessmentBaselineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UnsetUserAssessmentBaselineResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateAlertResponse updateAlert(UpdateAlertRequest request) {

        Validate.notBlank(request.getAlertId(), "alertId must not be blank");
        Objects.requireNonNull(request.getUpdateAlertDetails(), "updateAlertDetails is required");

        return clientCall(request, UpdateAlertResponse::builder)
                .logger(LOG, "updateAlert")
                .serviceDetails(
                        "DataSafe",
                        "UpdateAlert",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/UpdateAlert")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAlertRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alerts")
                .appendPathParam(request.getAlertId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.Alert.class,
                        UpdateAlertResponse.Builder::alert)
                .handleResponseHeaderString("etag", UpdateAlertResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAlertResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateAuditArchiveRetrievalResponse updateAuditArchiveRetrieval(
            UpdateAuditArchiveRetrievalRequest request) {

        Validate.notBlank(
                request.getAuditArchiveRetrievalId(), "auditArchiveRetrievalId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAuditArchiveRetrievalDetails(),
                "updateAuditArchiveRetrievalDetails is required");

        return clientCall(request, UpdateAuditArchiveRetrievalResponse::builder)
                .logger(LOG, "updateAuditArchiveRetrieval")
                .serviceDetails(
                        "DataSafe",
                        "UpdateAuditArchiveRetrieval",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/UpdateAuditArchiveRetrieval")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAuditArchiveRetrievalRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditArchiveRetrievals")
                .appendPathParam(request.getAuditArchiveRetrievalId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAuditArchiveRetrievalResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAuditArchiveRetrievalResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateAuditPolicyResponse updateAuditPolicy(UpdateAuditPolicyRequest request) {

        Validate.notBlank(request.getAuditPolicyId(), "auditPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAuditPolicyDetails(), "updateAuditPolicyDetails is required");

        return clientCall(request, UpdateAuditPolicyResponse::builder)
                .logger(LOG, "updateAuditPolicy")
                .serviceDetails(
                        "DataSafe",
                        "UpdateAuditPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/UpdateAuditPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAuditPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditPolicies")
                .appendPathParam(request.getAuditPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAuditPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAuditPolicyResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateAuditProfileResponse updateAuditProfile(UpdateAuditProfileRequest request) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAuditProfileDetails(), "updateAuditProfileDetails is required");

        return clientCall(request, UpdateAuditProfileResponse::builder)
                .logger(LOG, "updateAuditProfile")
                .serviceDetails(
                        "DataSafe",
                        "UpdateAuditProfile",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/UpdateAuditProfile")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAuditProfileRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAuditProfileResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAuditProfileResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateAuditTrailResponse updateAuditTrail(UpdateAuditTrailRequest request) {

        Validate.notBlank(request.getAuditTrailId(), "auditTrailId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAuditTrailDetails(), "updateAuditTrailDetails is required");

        return clientCall(request, UpdateAuditTrailResponse::builder)
                .logger(LOG, "updateAuditTrail")
                .serviceDetails(
                        "DataSafe",
                        "UpdateAuditTrail",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/UpdateAuditTrail")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAuditTrailRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditTrails")
                .appendPathParam(request.getAuditTrailId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAuditTrailResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAuditTrailResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDataSafePrivateEndpointResponse updateDataSafePrivateEndpoint(
            UpdateDataSafePrivateEndpointRequest request) {

        Validate.notBlank(
                request.getDataSafePrivateEndpointId(),
                "dataSafePrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataSafePrivateEndpointDetails(),
                "updateDataSafePrivateEndpointDetails is required");

        return clientCall(request, UpdateDataSafePrivateEndpointResponse::builder)
                .logger(LOG, "updateDataSafePrivateEndpoint")
                .serviceDetails(
                        "DataSafe",
                        "UpdateDataSafePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/UpdateDataSafePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataSafePrivateEndpointRequest::builder)
                .basePath("/20181201")
                .appendPathParam("dataSafePrivateEndpoints")
                .appendPathParam(request.getDataSafePrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDataSafePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDataSafePrivateEndpointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateLibraryMaskingFormatResponse updateLibraryMaskingFormat(
            UpdateLibraryMaskingFormatRequest request) {

        Validate.notBlank(
                request.getLibraryMaskingFormatId(), "libraryMaskingFormatId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLibraryMaskingFormatDetails(),
                "updateLibraryMaskingFormatDetails is required");

        return clientCall(request, UpdateLibraryMaskingFormatResponse::builder)
                .logger(LOG, "updateLibraryMaskingFormat")
                .serviceDetails(
                        "DataSafe",
                        "UpdateLibraryMaskingFormat",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/UpdateLibraryMaskingFormat")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLibraryMaskingFormatRequest::builder)
                .basePath("/20181201")
                .appendPathParam("libraryMaskingFormats")
                .appendPathParam(request.getLibraryMaskingFormatId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateLibraryMaskingFormatResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLibraryMaskingFormatResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMaskingColumnResponse updateMaskingColumn(UpdateMaskingColumnRequest request) {

        Validate.notBlank(request.getMaskingColumnKey(), "maskingColumnKey must not be blank");

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMaskingColumnDetails(), "updateMaskingColumnDetails is required");

        return clientCall(request, UpdateMaskingColumnResponse::builder)
                .logger(LOG, "updateMaskingColumn")
                .serviceDetails(
                        "DataSafe",
                        "UpdateMaskingColumn",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/UpdateMaskingColumn")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMaskingColumnRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("maskingColumns")
                .appendPathParam(request.getMaskingColumnKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMaskingColumnResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMaskingColumnResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMaskingPolicyResponse updateMaskingPolicy(UpdateMaskingPolicyRequest request) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMaskingPolicyDetails(), "updateMaskingPolicyDetails is required");

        return clientCall(request, UpdateMaskingPolicyResponse::builder)
                .logger(LOG, "updateMaskingPolicy")
                .serviceDetails(
                        "DataSafe",
                        "UpdateMaskingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/UpdateMaskingPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMaskingPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMaskingPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMaskingPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateOnPremConnectorResponse updateOnPremConnector(
            UpdateOnPremConnectorRequest request) {

        Validate.notBlank(request.getOnPremConnectorId(), "onPremConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOnPremConnectorDetails(),
                "updateOnPremConnectorDetails is required");

        return clientCall(request, UpdateOnPremConnectorResponse::builder)
                .logger(LOG, "updateOnPremConnector")
                .serviceDetails(
                        "DataSafe",
                        "UpdateOnPremConnector",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/UpdateOnPremConnector")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOnPremConnectorRequest::builder)
                .basePath("/20181201")
                .appendPathParam("onPremConnectors")
                .appendPathParam(request.getOnPremConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOnPremConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOnPremConnectorResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateOnPremConnectorWalletResponse updateOnPremConnectorWallet(
            UpdateOnPremConnectorWalletRequest request) {
        Objects.requireNonNull(
                request.getUpdateOnPremConnectorWalletDetails(),
                "updateOnPremConnectorWalletDetails is required");

        Validate.notBlank(request.getOnPremConnectorId(), "onPremConnectorId must not be blank");

        return clientCall(request, UpdateOnPremConnectorWalletResponse::builder)
                .logger(LOG, "updateOnPremConnectorWallet")
                .serviceDetails(
                        "DataSafe",
                        "UpdateOnPremConnectorWallet",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/UpdateOnPremConnectorWallet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOnPremConnectorWalletRequest::builder)
                .basePath("/20181201")
                .appendPathParam("onPremConnectors")
                .appendPathParam(request.getOnPremConnectorId())
                .appendPathParam("wallet")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOnPremConnectorWalletResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOnPremConnectorWalletResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateReportDefinitionResponse updateReportDefinition(
            UpdateReportDefinitionRequest request) {

        Validate.notBlank(request.getReportDefinitionId(), "reportDefinitionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateReportDefinitionDetails(),
                "updateReportDefinitionDetails is required");

        return clientCall(request, UpdateReportDefinitionResponse::builder)
                .logger(LOG, "updateReportDefinition")
                .serviceDetails(
                        "DataSafe",
                        "UpdateReportDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/UpdateReportDefinition")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateReportDefinitionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reportDefinitions")
                .appendPathParam(request.getReportDefinitionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateReportDefinitionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateReportDefinitionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateSdmMaskingPolicyDifferenceResponse updateSdmMaskingPolicyDifference(
            UpdateSdmMaskingPolicyDifferenceRequest request) {

        Validate.notBlank(
                request.getSdmMaskingPolicyDifferenceId(),
                "sdmMaskingPolicyDifferenceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSdmMaskingPolicyDifferenceDetails(),
                "updateSdmMaskingPolicyDifferenceDetails is required");

        return clientCall(request, UpdateSdmMaskingPolicyDifferenceResponse::builder)
                .logger(LOG, "updateSdmMaskingPolicyDifference")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSdmMaskingPolicyDifference",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/UpdateSdmMaskingPolicyDifference")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSdmMaskingPolicyDifferenceRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sdmMaskingPolicyDifferences")
                .appendPathParam(request.getSdmMaskingPolicyDifferenceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSdmMaskingPolicyDifferenceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateSdmMaskingPolicyDifferenceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateSecurityAssessmentResponse updateSecurityAssessment(
            UpdateSecurityAssessmentRequest request) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityAssessmentDetails(),
                "updateSecurityAssessmentDetails is required");

        return clientCall(request, UpdateSecurityAssessmentResponse::builder)
                .logger(LOG, "updateSecurityAssessment")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSecurityAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/UpdateSecurityAssessment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSecurityAssessmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecurityAssessmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateSensitiveColumnResponse updateSensitiveColumn(
            UpdateSensitiveColumnRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        Validate.notBlank(request.getSensitiveColumnKey(), "sensitiveColumnKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateSensitiveColumnDetails(),
                "updateSensitiveColumnDetails is required");

        return clientCall(request, UpdateSensitiveColumnResponse::builder)
                .logger(LOG, "updateSensitiveColumn")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSensitiveColumn",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/UpdateSensitiveColumn")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSensitiveColumnRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("sensitiveColumns")
                .appendPathParam(request.getSensitiveColumnKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSensitiveColumnResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSensitiveColumnResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateSensitiveDataModelResponse updateSensitiveDataModel(
            UpdateSensitiveDataModelRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSensitiveDataModelDetails(),
                "updateSensitiveDataModelDetails is required");

        return clientCall(request, UpdateSensitiveDataModelResponse::builder)
                .logger(LOG, "updateSensitiveDataModel")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSensitiveDataModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/UpdateSensitiveDataModel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSensitiveDataModelRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSensitiveDataModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSensitiveDataModelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateSensitiveTypeResponse updateSensitiveType(UpdateSensitiveTypeRequest request) {

        Validate.notBlank(request.getSensitiveTypeId(), "sensitiveTypeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSensitiveTypeDetails(), "updateSensitiveTypeDetails is required");

        return clientCall(request, UpdateSensitiveTypeResponse::builder)
                .logger(LOG, "updateSensitiveType")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSensitiveType",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/UpdateSensitiveType")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSensitiveTypeRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypes")
                .appendPathParam(request.getSensitiveTypeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSensitiveTypeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSensitiveTypeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateTargetAlertPolicyAssociationResponse updateTargetAlertPolicyAssociation(
            UpdateTargetAlertPolicyAssociationRequest request) {

        Validate.notBlank(
                request.getTargetAlertPolicyAssociationId(),
                "targetAlertPolicyAssociationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTargetAlertPolicyAssociationDetails(),
                "updateTargetAlertPolicyAssociationDetails is required");

        return clientCall(request, UpdateTargetAlertPolicyAssociationResponse::builder)
                .logger(LOG, "updateTargetAlertPolicyAssociation")
                .serviceDetails(
                        "DataSafe",
                        "UpdateTargetAlertPolicyAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/UpdateTargetAlertPolicyAssociation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTargetAlertPolicyAssociationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetAlertPolicyAssociations")
                .appendPathParam(request.getTargetAlertPolicyAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateTargetAlertPolicyAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateTargetAlertPolicyAssociationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateTargetDatabaseResponse updateTargetDatabase(UpdateTargetDatabaseRequest request) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTargetDatabaseDetails(),
                "updateTargetDatabaseDetails is required");

        return clientCall(request, UpdateTargetDatabaseResponse::builder)
                .logger(LOG, "updateTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "UpdateTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/UpdateTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateTargetDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTargetDatabaseResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateUserAssessmentResponse updateUserAssessment(UpdateUserAssessmentRequest request) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateUserAssessmentDetails(),
                "updateUserAssessmentDetails is required");

        return clientCall(request, UpdateUserAssessmentResponse::builder)
                .logger(LOG, "updateUserAssessment")
                .serviceDetails(
                        "DataSafe",
                        "UpdateUserAssessment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/UpdateUserAssessment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUserAssessmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateUserAssessmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateUserAssessmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UploadMaskingPolicyResponse uploadMaskingPolicy(UploadMaskingPolicyRequest request) {
        Objects.requireNonNull(
                request.getUploadMaskingPolicyDetails(), "uploadMaskingPolicyDetails is required");

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        return clientCall(request, UploadMaskingPolicyResponse::builder)
                .logger(LOG, "uploadMaskingPolicy")
                .serviceDetails(
                        "DataSafe",
                        "UploadMaskingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/UploadMaskingPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UploadMaskingPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("actions")
                .appendPathParam("upload")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UploadMaskingPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UploadMaskingPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UploadSensitiveDataModelResponse uploadSensitiveDataModel(
            UploadSensitiveDataModelRequest request) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getUploadSensitiveDataModelDetails(),
                "uploadSensitiveDataModelDetails is required");

        return clientCall(request, UploadSensitiveDataModelResponse::builder)
                .logger(LOG, "uploadSensitiveDataModel")
                .serviceDetails(
                        "DataSafe",
                        "UploadSensitiveDataModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/UploadSensitiveDataModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UploadSensitiveDataModelRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("actions")
                .appendPathParam("upload")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UploadSensitiveDataModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UploadSensitiveDataModelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DataSafeWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DataSafePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
