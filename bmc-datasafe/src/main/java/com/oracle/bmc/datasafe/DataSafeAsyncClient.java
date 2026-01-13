/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DataSafe service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DataSafeAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DataSafeAsync {
    /** Service instance for DataSafe. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DataSafeClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datasafe.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataSafeAsyncClient.class);

    DataSafeAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    DataSafeAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DataSafeAsyncClient",
                            "downloadDiscoveryReport,downloadMaskingLog,downloadMaskingPolicy,downloadMaskingReport,downloadPrivilegeScript,downloadSecurityAssessmentReport,downloadSensitiveDataModel,downloadSensitiveTypesExport,downloadUserAssessmentReport,generateOnPremConnectorConfiguration,getReportContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataSafeAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "datasafe";
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
        public DataSafeAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataSafeAsyncClient(
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
    public java.util.concurrent.Future<ActivateTargetDatabaseResponse> activateTargetDatabase(
            ActivateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateTargetDatabaseRequest, ActivateTargetDatabaseResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddMaskingColumnsFromSdmResponse> addMaskingColumnsFromSdm(
            AddMaskingColumnsFromSdmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMaskingColumnsFromSdmRequest, AddMaskingColumnsFromSdmResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AlertsUpdateResponse> alertsUpdate(
            AlertsUpdateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AlertsUpdateRequest, AlertsUpdateResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ApplyDiscoveryJobResultsResponse> applyDiscoveryJobResults(
            ApplyDiscoveryJobResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ApplyDiscoveryJobResultsRequest, ApplyDiscoveryJobResultsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ApplySdmMaskingPolicyDifferenceResponse>
            applySdmMaskingPolicyDifference(
                    ApplySdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ApplySdmMaskingPolicyDifferenceRequest,
                                    ApplySdmMaskingPolicyDifferenceResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ApplySecurityAssessmentTemplateResponse>
            applySecurityAssessmentTemplate(
                    ApplySecurityAssessmentTemplateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ApplySecurityAssessmentTemplateRequest,
                                    ApplySecurityAssessmentTemplateResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getSecurityAssessmentTemplateDetails(),
                "securityAssessmentTemplateDetails is required");

        return clientCall(request, ApplySecurityAssessmentTemplateResponse::builder)
                .logger(LOG, "applySecurityAssessmentTemplate")
                .serviceDetails(
                        "DataSafe",
                        "ApplySecurityAssessmentTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ApplySecurityAssessmentTemplate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApplySecurityAssessmentTemplateRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("applyTemplate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ApplySecurityAssessmentTemplateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ApplySecurityAssessmentTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BulkCreateSensitiveTypesResponse> bulkCreateSensitiveTypes(
            BulkCreateSensitiveTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkCreateSensitiveTypesRequest, BulkCreateSensitiveTypesResponse>
                    handler) {
        Objects.requireNonNull(
                request.getBulkCreateSensitiveTypesDetails(),
                "bulkCreateSensitiveTypesDetails is required");

        Objects.requireNonNull(request.getOpcCompartmentId(), "opcCompartmentId is required");

        return clientCall(request, BulkCreateSensitiveTypesResponse::builder)
                .logger(LOG, "bulkCreateSensitiveTypes")
                .serviceDetails(
                        "DataSafe",
                        "BulkCreateSensitiveTypes",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/BulkCreateSensitiveTypes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkCreateSensitiveTypesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypes")
                .appendPathParam("actions")
                .appendPathParam("bulkCreateSensitiveTypes")
                .accept("application/json")
                .appendHeader("opc-compartment-id", request.getOpcCompartmentId())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkCreateSensitiveTypesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkCreateSensitiveTypesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BulkCreateSqlFirewallAllowedSqlsResponse>
            bulkCreateSqlFirewallAllowedSqls(
                    BulkCreateSqlFirewallAllowedSqlsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkCreateSqlFirewallAllowedSqlsRequest,
                                    BulkCreateSqlFirewallAllowedSqlsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBulkCreateSqlFirewallAllowedSqlsDetails(),
                "bulkCreateSqlFirewallAllowedSqlsDetails is required");

        return clientCall(request, BulkCreateSqlFirewallAllowedSqlsResponse::builder)
                .logger(LOG, "bulkCreateSqlFirewallAllowedSqls")
                .serviceDetails(
                        "DataSafe",
                        "BulkCreateSqlFirewallAllowedSqls",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallAllowedSql/BulkCreateSqlFirewallAllowedSqls")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkCreateSqlFirewallAllowedSqlsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallAllowedSqls")
                .appendPathParam("actions")
                .appendPathParam("bulkCreate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkCreateSqlFirewallAllowedSqlsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        BulkCreateSqlFirewallAllowedSqlsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BulkCreateUnifiedAuditPolicyResponse>
            bulkCreateUnifiedAuditPolicy(
                    BulkCreateUnifiedAuditPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkCreateUnifiedAuditPolicyRequest,
                                    BulkCreateUnifiedAuditPolicyResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBulkCreateUnifiedAuditPolicyDetails(),
                "bulkCreateUnifiedAuditPolicyDetails is required");

        return clientCall(request, BulkCreateUnifiedAuditPolicyResponse::builder)
                .logger(LOG, "bulkCreateUnifiedAuditPolicy")
                .serviceDetails(
                        "DataSafe",
                        "BulkCreateUnifiedAuditPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicy/BulkCreateUnifiedAuditPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkCreateUnifiedAuditPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicies")
                .appendPathParam("actions")
                .appendPathParam("bulkCreate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkCreateUnifiedAuditPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        BulkCreateUnifiedAuditPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BulkDeleteSqlFirewallAllowedSqlsResponse>
            bulkDeleteSqlFirewallAllowedSqls(
                    BulkDeleteSqlFirewallAllowedSqlsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkDeleteSqlFirewallAllowedSqlsRequest,
                                    BulkDeleteSqlFirewallAllowedSqlsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBulkDeleteSqlFirewallAllowedSqlsDetails(),
                "bulkDeleteSqlFirewallAllowedSqlsDetails is required");

        return clientCall(request, BulkDeleteSqlFirewallAllowedSqlsResponse::builder)
                .logger(LOG, "bulkDeleteSqlFirewallAllowedSqls")
                .serviceDetails(
                        "DataSafe",
                        "BulkDeleteSqlFirewallAllowedSqls",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallAllowedSql/BulkDeleteSqlFirewallAllowedSqls")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkDeleteSqlFirewallAllowedSqlsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallAllowedSqls")
                .appendPathParam("actions")
                .appendPathParam("bulkDelete")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkDeleteSqlFirewallAllowedSqlsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        BulkDeleteSqlFirewallAllowedSqlsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CalculateAuditVolumeAvailableResponse>
            calculateAuditVolumeAvailable(
                    CalculateAuditVolumeAvailableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CalculateAuditVolumeAvailableRequest,
                                    CalculateAuditVolumeAvailableResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CalculateAuditVolumeCollectedResponse>
            calculateAuditVolumeCollected(
                    CalculateAuditVolumeCollectedRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CalculateAuditVolumeCollectedRequest,
                                    CalculateAuditVolumeCollectedResponse>
                            handler) {

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
                .callAsync(handler);
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
                        "DataSafe",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20181201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", CancelWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAlertCompartmentResponse> changeAlertCompartment(
            ChangeAlertCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeAlertCompartmentRequest, ChangeAlertCompartmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAlertPolicyCompartmentResponse>
            changeAlertPolicyCompartment(
                    ChangeAlertPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAlertPolicyCompartmentRequest,
                                    ChangeAlertPolicyCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getAlertPolicyId(), "alertPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeAlertPolicyCompartmentDetails(),
                "changeAlertPolicyCompartmentDetails is required");

        return clientCall(request, ChangeAlertPolicyCompartmentResponse::builder)
                .logger(LOG, "changeAlertPolicyCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeAlertPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/ChangeAlertPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAlertPolicyCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .appendPathParam(request.getAlertPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAlertPolicyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAlertPolicyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAttributeSetCompartmentResponse>
            changeAttributeSetCompartment(
                    ChangeAttributeSetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAttributeSetCompartmentRequest,
                                    ChangeAttributeSetCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getAttributeSetId(), "attributeSetId must not be blank");
        Objects.requireNonNull(
                request.getChangeAttributeSetCompartmentDetails(),
                "changeAttributeSetCompartmentDetails is required");

        return clientCall(request, ChangeAttributeSetCompartmentResponse::builder)
                .logger(LOG, "changeAttributeSetCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeAttributeSetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AttributeSet/ChangeAttributeSetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAttributeSetCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("attributeSets")
                .appendPathParam(request.getAttributeSetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAttributeSetCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAttributeSetCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAuditArchiveRetrievalCompartmentResponse>
            changeAuditArchiveRetrievalCompartment(
                    ChangeAuditArchiveRetrievalCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditArchiveRetrievalCompartmentRequest,
                                    ChangeAuditArchiveRetrievalCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAuditPolicyCompartmentResponse>
            changeAuditPolicyCompartment(
                    ChangeAuditPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditPolicyCompartmentRequest,
                                    ChangeAuditPolicyCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAuditProfileCompartmentResponse>
            changeAuditProfileCompartment(
                    ChangeAuditProfileCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditProfileCompartmentRequest,
                                    ChangeAuditProfileCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDataSafePrivateEndpointCompartmentResponse>
            changeDataSafePrivateEndpointCompartment(
                    ChangeDataSafePrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDataSafePrivateEndpointCompartmentRequest,
                                    ChangeDataSafePrivateEndpointCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseSecurityConfigCompartmentResponse>
            changeDatabaseSecurityConfigCompartment(
                    ChangeDatabaseSecurityConfigCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseSecurityConfigCompartmentRequest,
                                    ChangeDatabaseSecurityConfigCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseSecurityConfigId(),
                "databaseSecurityConfigId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatabaseSecurityConfigCompartmentDetails(),
                "changeDatabaseSecurityConfigCompartmentDetails is required");

        return clientCall(request, ChangeDatabaseSecurityConfigCompartmentResponse::builder)
                .logger(LOG, "changeDatabaseSecurityConfigCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeDatabaseSecurityConfigCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseSecurityConfig/ChangeDatabaseSecurityConfigCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatabaseSecurityConfigCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("databaseSecurityConfigs")
                .appendPathParam(request.getDatabaseSecurityConfigId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDatabaseSecurityConfigCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDatabaseSecurityConfigCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDiscoveryJobCompartmentResponse>
            changeDiscoveryJobCompartment(
                    ChangeDiscoveryJobCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDiscoveryJobCompartmentRequest,
                                    ChangeDiscoveryJobCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeLibraryMaskingFormatCompartmentResponse>
            changeLibraryMaskingFormatCompartment(
                    ChangeLibraryMaskingFormatCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLibraryMaskingFormatCompartmentRequest,
                                    ChangeLibraryMaskingFormatCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMaskingPolicyCompartmentResponse>
            changeMaskingPolicyCompartment(
                    ChangeMaskingPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMaskingPolicyCompartmentRequest,
                                    ChangeMaskingPolicyCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMaskingPolicyHealthReportCompartmentResponse>
            changeMaskingPolicyHealthReportCompartment(
                    ChangeMaskingPolicyHealthReportCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMaskingPolicyHealthReportCompartmentRequest,
                                    ChangeMaskingPolicyHealthReportCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getMaskingPolicyHealthReportId(),
                "maskingPolicyHealthReportId must not be blank");
        Objects.requireNonNull(
                request.getChangeMaskingPolicyHealthReportCompartmentDetails(),
                "changeMaskingPolicyHealthReportCompartmentDetails is required");

        return clientCall(request, ChangeMaskingPolicyHealthReportCompartmentResponse::builder)
                .logger(LOG, "changeMaskingPolicyHealthReportCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeMaskingPolicyHealthReportCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/ChangeMaskingPolicyHealthReportCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMaskingPolicyHealthReportCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicyHealthReports")
                .appendPathParam(request.getMaskingPolicyHealthReportId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMaskingPolicyHealthReportCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeOnPremConnectorCompartmentResponse>
            changeOnPremConnectorCompartment(
                    ChangeOnPremConnectorCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOnPremConnectorCompartmentRequest,
                                    ChangeOnPremConnectorCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeReportCompartmentResponse> changeReportCompartment(
            ChangeReportCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeReportCompartmentRequest, ChangeReportCompartmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeReportDefinitionCompartmentResponse>
            changeReportDefinitionCompartment(
                    ChangeReportDefinitionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeReportDefinitionCompartmentRequest,
                                    ChangeReportDefinitionCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeRetentionResponse> changeRetention(
            ChangeRetentionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeRetentionRequest, ChangeRetentionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSdmMaskingPolicyDifferenceCompartmentResponse>
            changeSdmMaskingPolicyDifferenceCompartment(
                    ChangeSdmMaskingPolicyDifferenceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSdmMaskingPolicyDifferenceCompartmentRequest,
                                    ChangeSdmMaskingPolicyDifferenceCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityAssessmentCompartmentResponse>
            changeSecurityAssessmentCompartment(
                    ChangeSecurityAssessmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityAssessmentCompartmentRequest,
                                    ChangeSecurityAssessmentCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityPolicyCompartmentResponse>
            changeSecurityPolicyCompartment(
                    ChangeSecurityPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityPolicyCompartmentRequest,
                                    ChangeSecurityPolicyCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getSecurityPolicyId(), "securityPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecurityPolicyCompartmentDetails(),
                "changeSecurityPolicyCompartmentDetails is required");

        return clientCall(request, ChangeSecurityPolicyCompartmentResponse::builder)
                .logger(LOG, "changeSecurityPolicyCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSecurityPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicy/ChangeSecurityPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSecurityPolicyCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicies")
                .appendPathParam(request.getSecurityPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeSecurityPolicyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSecurityPolicyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityPolicyConfigCompartmentResponse>
            changeSecurityPolicyConfigCompartment(
                    ChangeSecurityPolicyConfigCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityPolicyConfigCompartmentRequest,
                                    ChangeSecurityPolicyConfigCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyConfigId(), "securityPolicyConfigId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecurityPolicyConfigCompartmentDetails(),
                "changeSecurityPolicyConfigCompartmentDetails is required");

        return clientCall(request, ChangeSecurityPolicyConfigCompartmentResponse::builder)
                .logger(LOG, "changeSecurityPolicyConfigCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSecurityPolicyConfigCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyConfig/ChangeSecurityPolicyConfigCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSecurityPolicyConfigCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyConfigs")
                .appendPathParam(request.getSecurityPolicyConfigId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeSecurityPolicyConfigCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSecurityPolicyConfigCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityPolicyDeploymentCompartmentResponse>
            changeSecurityPolicyDeploymentCompartment(
                    ChangeSecurityPolicyDeploymentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityPolicyDeploymentCompartmentRequest,
                                    ChangeSecurityPolicyDeploymentCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyDeploymentId(),
                "securityPolicyDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecurityPolicyDeploymentCompartmentDetails(),
                "changeSecurityPolicyDeploymentCompartmentDetails is required");

        return clientCall(request, ChangeSecurityPolicyDeploymentCompartmentResponse::builder)
                .logger(LOG, "changeSecurityPolicyDeploymentCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSecurityPolicyDeploymentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeployment/ChangeSecurityPolicyDeploymentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSecurityPolicyDeploymentCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyDeployments")
                .appendPathParam(request.getSecurityPolicyDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeSecurityPolicyDeploymentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSecurityPolicyDeploymentCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSensitiveDataModelCompartmentResponse>
            changeSensitiveDataModelCompartment(
                    ChangeSensitiveDataModelCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSensitiveDataModelCompartmentRequest,
                                    ChangeSensitiveDataModelCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSensitiveTypeCompartmentResponse>
            changeSensitiveTypeCompartment(
                    ChangeSensitiveTypeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSensitiveTypeCompartmentRequest,
                                    ChangeSensitiveTypeCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSensitiveTypeGroupCompartmentResponse>
            changeSensitiveTypeGroupCompartment(
                    ChangeSensitiveTypeGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSensitiveTypeGroupCompartmentRequest,
                                    ChangeSensitiveTypeGroupCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getSensitiveTypeGroupId(), "sensitiveTypeGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeSensitiveTypeGroupCompartmentDetails(),
                "changeSensitiveTypeGroupCompartmentDetails is required");

        return clientCall(request, ChangeSensitiveTypeGroupCompartmentResponse::builder)
                .logger(LOG, "changeSensitiveTypeGroupCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSensitiveTypeGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypeGroup/ChangeSensitiveTypeGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSensitiveTypeGroupCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypeGroups")
                .appendPathParam(request.getSensitiveTypeGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSensitiveTypeGroupCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSensitiveTypesExportCompartmentResponse>
            changeSensitiveTypesExportCompartment(
                    ChangeSensitiveTypesExportCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSensitiveTypesExportCompartmentRequest,
                                    ChangeSensitiveTypesExportCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getSensitiveTypesExportId(), "sensitiveTypesExportId must not be blank");
        Objects.requireNonNull(
                request.getChangeSensitiveTypesExportCompartmentDetails(),
                "changeSensitiveTypesExportCompartmentDetails is required");

        return clientCall(request, ChangeSensitiveTypesExportCompartmentResponse::builder)
                .logger(LOG, "changeSensitiveTypesExportCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSensitiveTypesExportCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypesExport/ChangeSensitiveTypesExportCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSensitiveTypesExportCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypesExports")
                .appendPathParam(request.getSensitiveTypesExportId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSensitiveTypesExportCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSqlCollectionCompartmentResponse>
            changeSqlCollectionCompartment(
                    ChangeSqlCollectionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSqlCollectionCompartmentRequest,
                                    ChangeSqlCollectionCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getSqlCollectionId(), "sqlCollectionId must not be blank");
        Objects.requireNonNull(
                request.getChangeSqlCollectionCompartmentDetails(),
                "changeSqlCollectionCompartmentDetails is required");

        return clientCall(request, ChangeSqlCollectionCompartmentResponse::builder)
                .logger(LOG, "changeSqlCollectionCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSqlCollectionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/ChangeSqlCollectionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSqlCollectionCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendPathParam(request.getSqlCollectionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeSqlCollectionCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSqlCollectionCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSqlFirewallPolicyCompartmentResponse>
            changeSqlFirewallPolicyCompartment(
                    ChangeSqlFirewallPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSqlFirewallPolicyCompartmentRequest,
                                    ChangeSqlFirewallPolicyCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getSqlFirewallPolicyId(), "sqlFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeSqlFirewallPolicyCompartmentDetails(),
                "changeSqlFirewallPolicyCompartmentDetails is required");

        return clientCall(request, ChangeSqlFirewallPolicyCompartmentResponse::builder)
                .logger(LOG, "changeSqlFirewallPolicyCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeSqlFirewallPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicy/ChangeSqlFirewallPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSqlFirewallPolicyCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallPolicies")
                .appendPathParam(request.getSqlFirewallPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeSqlFirewallPolicyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSqlFirewallPolicyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeTargetAlertPolicyAssociationCompartmentResponse>
            changeTargetAlertPolicyAssociationCompartment(
                    ChangeTargetAlertPolicyAssociationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTargetAlertPolicyAssociationCompartmentRequest,
                                    ChangeTargetAlertPolicyAssociationCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeTargetDatabaseCompartmentResponse>
            changeTargetDatabaseCompartment(
                    ChangeTargetDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTargetDatabaseCompartmentRequest,
                                    ChangeTargetDatabaseCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeTargetDatabaseGroupCompartmentResponse>
            changeTargetDatabaseGroupCompartment(
                    ChangeTargetDatabaseGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTargetDatabaseGroupCompartmentRequest,
                                    ChangeTargetDatabaseGroupCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getTargetDatabaseGroupId(), "targetDatabaseGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeTargetDatabaseGroupCompartmentDetails(),
                "changeTargetDatabaseGroupCompartmentDetails is required");

        return clientCall(request, ChangeTargetDatabaseGroupCompartmentResponse::builder)
                .logger(LOG, "changeTargetDatabaseGroupCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeTargetDatabaseGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseGroup/ChangeTargetDatabaseGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTargetDatabaseGroupCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabaseGroups")
                .appendPathParam(request.getTargetDatabaseGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeTargetDatabaseGroupCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeTargetDatabaseGroupCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeUnifiedAuditPolicyCompartmentResponse>
            changeUnifiedAuditPolicyCompartment(
                    ChangeUnifiedAuditPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeUnifiedAuditPolicyCompartmentRequest,
                                    ChangeUnifiedAuditPolicyCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getUnifiedAuditPolicyId(), "unifiedAuditPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeUnifiedAuditPolicyCompartmentDetails(),
                "changeUnifiedAuditPolicyCompartmentDetails is required");

        return clientCall(request, ChangeUnifiedAuditPolicyCompartmentResponse::builder)
                .logger(LOG, "changeUnifiedAuditPolicyCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeUnifiedAuditPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicy/ChangeUnifiedAuditPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeUnifiedAuditPolicyCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicies")
                .appendPathParam(request.getUnifiedAuditPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeUnifiedAuditPolicyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeUnifiedAuditPolicyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeUnifiedAuditPolicyDefinitionCompartmentResponse>
            changeUnifiedAuditPolicyDefinitionCompartment(
                    ChangeUnifiedAuditPolicyDefinitionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeUnifiedAuditPolicyDefinitionCompartmentRequest,
                                    ChangeUnifiedAuditPolicyDefinitionCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getUnifiedAuditPolicyDefinitionId(),
                "unifiedAuditPolicyDefinitionId must not be blank");
        Objects.requireNonNull(
                request.getChangeUnifiedAuditPolicyDefinitionCompartmentDetails(),
                "changeUnifiedAuditPolicyDefinitionCompartmentDetails is required");

        return clientCall(request, ChangeUnifiedAuditPolicyDefinitionCompartmentResponse::builder)
                .logger(LOG, "changeUnifiedAuditPolicyDefinitionCompartment")
                .serviceDetails(
                        "DataSafe",
                        "ChangeUnifiedAuditPolicyDefinitionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicyDefinition/ChangeUnifiedAuditPolicyDefinitionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeUnifiedAuditPolicyDefinitionCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicyDefinitions")
                .appendPathParam(request.getUnifiedAuditPolicyDefinitionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeUnifiedAuditPolicyDefinitionCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeUnifiedAuditPolicyDefinitionCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeUserAssessmentCompartmentResponse>
            changeUserAssessmentCompartment(
                    ChangeUserAssessmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeUserAssessmentCompartmentRequest,
                                    ChangeUserAssessmentCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CompareSecurityAssessmentResponse> compareSecurityAssessment(
            CompareSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompareSecurityAssessmentRequest, CompareSecurityAssessmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CompareToTemplateBaselineResponse> compareToTemplateBaseline(
            CompareToTemplateBaselineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompareToTemplateBaselineRequest, CompareToTemplateBaselineResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getCompareToTemplateBaselineDetails(),
                "compareToTemplateBaselineDetails is required");

        return clientCall(request, CompareToTemplateBaselineResponse::builder)
                .logger(LOG, "compareToTemplateBaseline")
                .serviceDetails(
                        "DataSafe",
                        "CompareToTemplateBaseline",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/CompareToTemplateBaseline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CompareToTemplateBaselineRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("compareToTemplateBaseline")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CompareToTemplateBaselineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CompareToTemplateBaselineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CompareUserAssessmentResponse> compareUserAssessment(
            CompareUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompareUserAssessmentRequest, CompareUserAssessmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAlertPolicyResponse> createAlertPolicy(
            CreateAlertPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAlertPolicyRequest, CreateAlertPolicyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAlertPolicyDetails(), "createAlertPolicyDetails is required");

        return clientCall(request, CreateAlertPolicyResponse::builder)
                .logger(LOG, "createAlertPolicy")
                .serviceDetails(
                        "DataSafe",
                        "CreateAlertPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/CreateAlertPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAlertPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.AlertPolicy.class,
                        CreateAlertPolicyResponse.Builder::alertPolicy)
                .handleResponseHeaderString("etag", CreateAlertPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateAlertPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAlertPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateAlertPolicyResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAlertPolicyRuleResponse> createAlertPolicyRule(
            CreateAlertPolicyRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAlertPolicyRuleRequest, CreateAlertPolicyRuleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAlertPolicyRuleDetails(),
                "createAlertPolicyRuleDetails is required");

        Validate.notBlank(request.getAlertPolicyId(), "alertPolicyId must not be blank");

        return clientCall(request, CreateAlertPolicyRuleResponse::builder)
                .logger(LOG, "createAlertPolicyRule")
                .serviceDetails(
                        "DataSafe",
                        "CreateAlertPolicyRule",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicyRule/CreateAlertPolicyRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAlertPolicyRuleRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .appendPathParam(request.getAlertPolicyId())
                .appendPathParam("rules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.AlertPolicyRule.class,
                        CreateAlertPolicyRuleResponse.Builder::alertPolicyRule)
                .handleResponseHeaderString("etag", CreateAlertPolicyRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAlertPolicyRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAlertPolicyRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateAlertPolicyRuleResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAttributeSetResponse> createAttributeSet(
            CreateAttributeSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAttributeSetRequest, CreateAttributeSetResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAttributeSetDetails(), "createAttributeSetDetails is required");

        return clientCall(request, CreateAttributeSetResponse::builder)
                .logger(LOG, "createAttributeSet")
                .serviceDetails(
                        "DataSafe",
                        "CreateAttributeSet",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AttributeSet/CreateAttributeSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAttributeSetRequest::builder)
                .basePath("/20181201")
                .appendPathParam("attributeSets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.AttributeSet.class,
                        CreateAttributeSetResponse.Builder::attributeSet)
                .handleResponseHeaderString("etag", CreateAttributeSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateAttributeSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAttributeSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAuditArchiveRetrievalResponse>
            createAuditArchiveRetrieval(
                    CreateAuditArchiveRetrievalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAuditArchiveRetrievalRequest,
                                    CreateAuditArchiveRetrievalResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAuditProfileResponse> createAuditProfile(
            CreateAuditProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAuditProfileRequest, CreateAuditProfileResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAuditProfileDetails(), "createAuditProfileDetails is required");

        return clientCall(request, CreateAuditProfileResponse::builder)
                .logger(LOG, "createAuditProfile")
                .serviceDetails(
                        "DataSafe",
                        "CreateAuditProfile",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/CreateAuditProfile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAuditProfileRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.AuditProfile.class,
                        CreateAuditProfileResponse.Builder::auditProfile)
                .handleResponseHeaderString("etag", CreateAuditProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateAuditProfileResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAuditProfileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateAuditProfileResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSafePrivateEndpointResponse>
            createDataSafePrivateEndpoint(
                    CreateDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataSafePrivateEndpointRequest,
                                    CreateDataSafePrivateEndpointResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDiscoveryJobResponse> createDiscoveryJob(
            CreateDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLibraryMaskingFormatResponse>
            createLibraryMaskingFormat(
                    CreateLibraryMaskingFormatRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLibraryMaskingFormatRequest,
                                    CreateLibraryMaskingFormatResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMaskingColumnResponse> createMaskingColumn(
            CreateMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMaskingColumnRequest, CreateMaskingColumnResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMaskingPolicyResponse> createMaskingPolicy(
            CreateMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMaskingPolicyRequest, CreateMaskingPolicyResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOnPremConnectorResponse> createOnPremConnector(
            CreateOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOnPremConnectorRequest, CreateOnPremConnectorResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePeerTargetDatabaseResponse> createPeerTargetDatabase(
            CreatePeerTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePeerTargetDatabaseRequest, CreatePeerTargetDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getCreatePeerTargetDatabaseDetails(),
                "createPeerTargetDatabaseDetails is required");

        return clientCall(request, CreatePeerTargetDatabaseResponse::builder)
                .logger(LOG, "createPeerTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "CreatePeerTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/PeerTargetDatabase/CreatePeerTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePeerTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("peerTargetDatabases")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.PeerTargetDatabase.class,
                        CreatePeerTargetDatabaseResponse.Builder::peerTargetDatabase)
                .handleResponseHeaderString("etag", CreatePeerTargetDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePeerTargetDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePeerTargetDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreatePeerTargetDatabaseResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateReferentialRelationResponse> createReferentialRelation(
            CreateReferentialRelationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateReferentialRelationRequest, CreateReferentialRelationResponse>
                    handler) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");
        Objects.requireNonNull(
                request.getCreateReferentialRelationDetails(),
                "createReferentialRelationDetails is required");

        return clientCall(request, CreateReferentialRelationResponse::builder)
                .logger(LOG, "createReferentialRelation")
                .serviceDetails(
                        "DataSafe",
                        "CreateReferentialRelation",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReferentialRelation/CreateReferentialRelation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateReferentialRelationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("referentialRelations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateReferentialRelationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateReferentialRelationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateReportDefinitionResponse> createReportDefinition(
            CreateReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateReportDefinitionRequest, CreateReportDefinitionResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSdmMaskingPolicyDifferenceResponse>
            createSdmMaskingPolicyDifference(
                    CreateSdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateSdmMaskingPolicyDifferenceRequest,
                                    CreateSdmMaskingPolicyDifferenceResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityAssessmentResponse> createSecurityAssessment(
            CreateSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityAssessmentRequest, CreateSecurityAssessmentResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityPolicyResponse> createSecurityPolicy(
            CreateSecurityPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityPolicyRequest, CreateSecurityPolicyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSecurityPolicyDetails(),
                "createSecurityPolicyDetails is required");

        return clientCall(request, CreateSecurityPolicyResponse::builder)
                .logger(LOG, "createSecurityPolicy")
                .serviceDetails("DataSafe", "CreateSecurityPolicy", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicy.class,
                        CreateSecurityPolicyResponse.Builder::securityPolicy)
                .handleResponseHeaderString("etag", CreateSecurityPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSecurityPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecurityPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSecurityPolicyResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityPolicyConfigResponse>
            createSecurityPolicyConfig(
                    CreateSecurityPolicyConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateSecurityPolicyConfigRequest,
                                    CreateSecurityPolicyConfigResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateSecurityPolicyConfigDetails(),
                "createSecurityPolicyConfigDetails is required");

        return clientCall(request, CreateSecurityPolicyConfigResponse::builder)
                .logger(LOG, "createSecurityPolicyConfig")
                .serviceDetails(
                        "DataSafe",
                        "CreateSecurityPolicyConfig",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyConfig/CreateSecurityPolicyConfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityPolicyConfigRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyConfigs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyConfig.class,
                        CreateSecurityPolicyConfigResponse.Builder::securityPolicyConfig)
                .handleResponseHeaderString(
                        "etag", CreateSecurityPolicyConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSecurityPolicyConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecurityPolicyConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSecurityPolicyConfigResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityPolicyDeploymentResponse>
            createSecurityPolicyDeployment(
                    CreateSecurityPolicyDeploymentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateSecurityPolicyDeploymentRequest,
                                    CreateSecurityPolicyDeploymentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateSecurityPolicyDeploymentDetails(),
                "createSecurityPolicyDeploymentDetails is required");

        return clientCall(request, CreateSecurityPolicyDeploymentResponse::builder)
                .logger(LOG, "createSecurityPolicyDeployment")
                .serviceDetails(
                        "DataSafe",
                        "CreateSecurityPolicyDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeployment/CreateSecurityPolicyDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityPolicyDeploymentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyDeployments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyDeployment.class,
                        CreateSecurityPolicyDeploymentResponse.Builder::securityPolicyDeployment)
                .handleResponseHeaderString(
                        "etag", CreateSecurityPolicyDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSecurityPolicyDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateSecurityPolicyDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSecurityPolicyDeploymentResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSensitiveColumnResponse> createSensitiveColumn(
            CreateSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveColumnRequest, CreateSensitiveColumnResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSensitiveDataModelResponse> createSensitiveDataModel(
            CreateSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveDataModelRequest, CreateSensitiveDataModelResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSensitiveTypeResponse> createSensitiveType(
            CreateSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveTypeRequest, CreateSensitiveTypeResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSensitiveTypeGroupResponse> createSensitiveTypeGroup(
            CreateSensitiveTypeGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveTypeGroupRequest, CreateSensitiveTypeGroupResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSensitiveTypeGroupDetails(),
                "createSensitiveTypeGroupDetails is required");

        return clientCall(request, CreateSensitiveTypeGroupResponse::builder)
                .logger(LOG, "createSensitiveTypeGroup")
                .serviceDetails(
                        "DataSafe",
                        "CreateSensitiveTypeGroup",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypeGroup/CreateSensitiveTypeGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSensitiveTypeGroupRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypeGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveTypeGroup.class,
                        CreateSensitiveTypeGroupResponse.Builder::sensitiveTypeGroup)
                .handleResponseHeaderString("etag", CreateSensitiveTypeGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSensitiveTypeGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSensitiveTypeGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSensitiveTypeGroupResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSensitiveTypesExportResponse>
            createSensitiveTypesExport(
                    CreateSensitiveTypesExportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateSensitiveTypesExportRequest,
                                    CreateSensitiveTypesExportResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateSensitiveTypesExportDetails(),
                "createSensitiveTypesExportDetails is required");

        return clientCall(request, CreateSensitiveTypesExportResponse::builder)
                .logger(LOG, "createSensitiveTypesExport")
                .serviceDetails(
                        "DataSafe",
                        "CreateSensitiveTypesExport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypesExport/CreateSensitiveTypesExport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSensitiveTypesExportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypesExports")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveTypesExport.class,
                        CreateSensitiveTypesExportResponse.Builder::sensitiveTypesExport)
                .handleResponseHeaderString(
                        "etag", CreateSensitiveTypesExportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSensitiveTypesExportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSensitiveTypesExportResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSensitiveTypesExportResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSqlCollectionResponse> createSqlCollection(
            CreateSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSqlCollectionRequest, CreateSqlCollectionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSqlCollectionDetails(), "createSqlCollectionDetails is required");

        return clientCall(request, CreateSqlCollectionResponse::builder)
                .logger(LOG, "createSqlCollection")
                .serviceDetails(
                        "DataSafe",
                        "CreateSqlCollection",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/CreateSqlCollection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSqlCollectionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlCollection.class,
                        CreateSqlCollectionResponse.Builder::sqlCollection)
                .handleResponseHeaderString("etag", CreateSqlCollectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSqlCollectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSqlCollectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSqlCollectionResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTargetAlertPolicyAssociationResponse>
            createTargetAlertPolicyAssociation(
                    CreateTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTargetAlertPolicyAssociationRequest,
                                    CreateTargetAlertPolicyAssociationResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTargetDatabaseResponse> createTargetDatabase(
            CreateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTargetDatabaseRequest, CreateTargetDatabaseResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTargetDatabaseGroupResponse> createTargetDatabaseGroup(
            CreateTargetDatabaseGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTargetDatabaseGroupRequest, CreateTargetDatabaseGroupResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateTargetDatabaseGroupDetails(),
                "createTargetDatabaseGroupDetails is required");

        return clientCall(request, CreateTargetDatabaseGroupResponse::builder)
                .logger(LOG, "createTargetDatabaseGroup")
                .serviceDetails(
                        "DataSafe",
                        "CreateTargetDatabaseGroup",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseGroup/CreateTargetDatabaseGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTargetDatabaseGroupRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabaseGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.TargetDatabaseGroup.class,
                        CreateTargetDatabaseGroupResponse.Builder::targetDatabaseGroup)
                .handleResponseHeaderString("etag", CreateTargetDatabaseGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateTargetDatabaseGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTargetDatabaseGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateUnifiedAuditPolicyResponse> createUnifiedAuditPolicy(
            CreateUnifiedAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateUnifiedAuditPolicyRequest, CreateUnifiedAuditPolicyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateUnifiedAuditPolicyDetails(),
                "createUnifiedAuditPolicyDetails is required");

        return clientCall(request, CreateUnifiedAuditPolicyResponse::builder)
                .logger(LOG, "createUnifiedAuditPolicy")
                .serviceDetails(
                        "DataSafe",
                        "CreateUnifiedAuditPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicy/CreateUnifiedAuditPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUnifiedAuditPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datasafe.model.UnifiedAuditPolicy.class,
                        CreateUnifiedAuditPolicyResponse.Builder::unifiedAuditPolicy)
                .handleResponseHeaderString("etag", CreateUnifiedAuditPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateUnifiedAuditPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateUnifiedAuditPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateUnifiedAuditPolicyResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateUserAssessmentResponse> createUserAssessment(
            CreateUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateUserAssessmentRequest, CreateUserAssessmentResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeactivateTargetDatabaseResponse> deactivateTargetDatabase(
            DeactivateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateTargetDatabaseRequest, DeactivateTargetDatabaseResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlertPolicyResponse> deleteAlertPolicy(
            DeleteAlertPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAlertPolicyRequest, DeleteAlertPolicyResponse>
                    handler) {

        Validate.notBlank(request.getAlertPolicyId(), "alertPolicyId must not be blank");

        return clientCall(request, DeleteAlertPolicyResponse::builder)
                .logger(LOG, "deleteAlertPolicy")
                .serviceDetails(
                        "DataSafe",
                        "DeleteAlertPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/DeleteAlertPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAlertPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .appendPathParam(request.getAlertPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAlertPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAlertPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlertPolicyRuleResponse> deleteAlertPolicyRule(
            DeleteAlertPolicyRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAlertPolicyRuleRequest, DeleteAlertPolicyRuleResponse>
                    handler) {

        Validate.notBlank(request.getAlertPolicyId(), "alertPolicyId must not be blank");

        Validate.notBlank(request.getRuleKey(), "ruleKey must not be blank");

        return clientCall(request, DeleteAlertPolicyRuleResponse::builder)
                .logger(LOG, "deleteAlertPolicyRule")
                .serviceDetails(
                        "DataSafe",
                        "DeleteAlertPolicyRule",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicyRule/DeleteAlertPolicyRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAlertPolicyRuleRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .appendPathParam(request.getAlertPolicyId())
                .appendPathParam("rules")
                .appendPathParam(request.getRuleKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAlertPolicyRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAlertPolicyRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributeSetResponse> deleteAttributeSet(
            DeleteAttributeSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAttributeSetRequest, DeleteAttributeSetResponse>
                    handler) {

        Validate.notBlank(request.getAttributeSetId(), "attributeSetId must not be blank");

        return clientCall(request, DeleteAttributeSetResponse::builder)
                .logger(LOG, "deleteAttributeSet")
                .serviceDetails(
                        "DataSafe",
                        "DeleteAttributeSet",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AttributeSet/DeleteAttributeSet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAttributeSetRequest::builder)
                .basePath("/20181201")
                .appendPathParam("attributeSets")
                .appendPathParam(request.getAttributeSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAttributeSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAttributeSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAuditArchiveRetrievalResponse>
            deleteAuditArchiveRetrieval(
                    DeleteAuditArchiveRetrievalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAuditArchiveRetrievalRequest,
                                    DeleteAuditArchiveRetrievalResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAuditProfileResponse> deleteAuditProfile(
            DeleteAuditProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuditProfileRequest, DeleteAuditProfileResponse>
                    handler) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");

        return clientCall(request, DeleteAuditProfileResponse::builder)
                .logger(LOG, "deleteAuditProfile")
                .serviceDetails(
                        "DataSafe",
                        "DeleteAuditProfile",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/DeleteAuditProfile")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAuditProfileRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAuditProfileResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAuditProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAuditTrailResponse> deleteAuditTrail(
            DeleteAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuditTrailRequest, DeleteAuditTrailResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSafePrivateEndpointResponse>
            deleteDataSafePrivateEndpoint(
                    DeleteDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDataSafePrivateEndpointRequest,
                                    DeleteDataSafePrivateEndpointResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDiscoveryJobResponse> deleteDiscoveryJob(
            DeleteDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDiscoveryJobResultResponse> deleteDiscoveryJobResult(
            DeleteDiscoveryJobResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobResultRequest, DeleteDiscoveryJobResultResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLibraryMaskingFormatResponse>
            deleteLibraryMaskingFormat(
                    DeleteLibraryMaskingFormatRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLibraryMaskingFormatRequest,
                                    DeleteLibraryMaskingFormatResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMaskingColumnResponse> deleteMaskingColumn(
            DeleteMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaskingColumnRequest, DeleteMaskingColumnResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMaskingPolicyResponse> deleteMaskingPolicy(
            DeleteMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaskingPolicyRequest, DeleteMaskingPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMaskingPolicyHealthReportResponse>
            deleteMaskingPolicyHealthReport(
                    DeleteMaskingPolicyHealthReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMaskingPolicyHealthReportRequest,
                                    DeleteMaskingPolicyHealthReportResponse>
                            handler) {

        Validate.notBlank(
                request.getMaskingPolicyHealthReportId(),
                "maskingPolicyHealthReportId must not be blank");

        return clientCall(request, DeleteMaskingPolicyHealthReportResponse::builder)
                .logger(LOG, "deleteMaskingPolicyHealthReport")
                .serviceDetails(
                        "DataSafe",
                        "DeleteMaskingPolicyHealthReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/DeleteMaskingPolicyHealthReport")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMaskingPolicyHealthReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicyHealthReports")
                .appendPathParam(request.getMaskingPolicyHealthReportId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMaskingPolicyHealthReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteMaskingPolicyHealthReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMaskingReportResponse> deleteMaskingReport(
            DeleteMaskingReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaskingReportRequest, DeleteMaskingReportResponse>
                    handler) {

        Validate.notBlank(request.getMaskingReportId(), "maskingReportId must not be blank");

        return clientCall(request, DeleteMaskingReportResponse::builder)
                .logger(LOG, "deleteMaskingReport")
                .serviceDetails(
                        "DataSafe",
                        "DeleteMaskingReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingReport/DeleteMaskingReport")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMaskingReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingReports")
                .appendPathParam(request.getMaskingReportId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMaskingReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMaskingReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOnPremConnectorResponse> deleteOnPremConnector(
            DeleteOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOnPremConnectorRequest, DeleteOnPremConnectorResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePeerTargetDatabaseResponse> deletePeerTargetDatabase(
            DeletePeerTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePeerTargetDatabaseRequest, DeletePeerTargetDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, DeletePeerTargetDatabaseResponse::builder)
                .logger(LOG, "deletePeerTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "DeletePeerTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/PeerTargetDatabase/DeletePeerTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePeerTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("peerTargetDatabases")
                .appendPathParam(request.getPeerTargetDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePeerTargetDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePeerTargetDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteReferentialRelationResponse> deleteReferentialRelation(
            DeleteReferentialRelationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteReferentialRelationRequest, DeleteReferentialRelationResponse>
                    handler) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        Validate.notBlank(
                request.getReferentialRelationKey(), "referentialRelationKey must not be blank");

        return clientCall(request, DeleteReferentialRelationResponse::builder)
                .logger(LOG, "deleteReferentialRelation")
                .serviceDetails(
                        "DataSafe",
                        "DeleteReferentialRelation",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReferentialRelation/DeleteReferentialRelation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteReferentialRelationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("referentialRelations")
                .appendPathParam(request.getReferentialRelationKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteReferentialRelationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteReportDefinitionResponse> deleteReportDefinition(
            DeleteReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteReportDefinitionRequest, DeleteReportDefinitionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSdmMaskingPolicyDifferenceResponse>
            deleteSdmMaskingPolicyDifference(
                    DeleteSdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSdmMaskingPolicyDifferenceRequest,
                                    DeleteSdmMaskingPolicyDifferenceResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityAssessmentResponse> deleteSecurityAssessment(
            DeleteSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityAssessmentRequest, DeleteSecurityAssessmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityPolicyResponse> deleteSecurityPolicy(
            DeleteSecurityPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse>
                    handler) {

        Validate.notBlank(request.getSecurityPolicyId(), "securityPolicyId must not be blank");

        return clientCall(request, DeleteSecurityPolicyResponse::builder)
                .logger(LOG, "deleteSecurityPolicy")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSecurityPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicy/DeleteSecurityPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicies")
                .appendPathParam(request.getSecurityPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSecurityPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSecurityPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityPolicyConfigResponse>
            deleteSecurityPolicyConfig(
                    DeleteSecurityPolicyConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSecurityPolicyConfigRequest,
                                    DeleteSecurityPolicyConfigResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyConfigId(), "securityPolicyConfigId must not be blank");

        return clientCall(request, DeleteSecurityPolicyConfigResponse::builder)
                .logger(LOG, "deleteSecurityPolicyConfig")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSecurityPolicyConfig",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyConfig/DeleteSecurityPolicyConfig")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityPolicyConfigRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyConfigs")
                .appendPathParam(request.getSecurityPolicyConfigId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSecurityPolicyConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSecurityPolicyConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityPolicyDeploymentResponse>
            deleteSecurityPolicyDeployment(
                    DeleteSecurityPolicyDeploymentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSecurityPolicyDeploymentRequest,
                                    DeleteSecurityPolicyDeploymentResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyDeploymentId(),
                "securityPolicyDeploymentId must not be blank");

        return clientCall(request, DeleteSecurityPolicyDeploymentResponse::builder)
                .logger(LOG, "deleteSecurityPolicyDeployment")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSecurityPolicyDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeployment/DeleteSecurityPolicyDeployment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityPolicyDeploymentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyDeployments")
                .appendPathParam(request.getSecurityPolicyDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSecurityPolicyDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteSecurityPolicyDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSensitiveColumnResponse> deleteSensitiveColumn(
            DeleteSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveColumnRequest, DeleteSensitiveColumnResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSensitiveDataModelResponse> deleteSensitiveDataModel(
            DeleteSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveDataModelRequest, DeleteSensitiveDataModelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSensitiveTypeResponse> deleteSensitiveType(
            DeleteSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveTypeRequest, DeleteSensitiveTypeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSensitiveTypeGroupResponse> deleteSensitiveTypeGroup(
            DeleteSensitiveTypeGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveTypeGroupRequest, DeleteSensitiveTypeGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getSensitiveTypeGroupId(), "sensitiveTypeGroupId must not be blank");

        return clientCall(request, DeleteSensitiveTypeGroupResponse::builder)
                .logger(LOG, "deleteSensitiveTypeGroup")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSensitiveTypeGroup",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypeGroup/DeleteSensitiveTypeGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSensitiveTypeGroupRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypeGroups")
                .appendPathParam(request.getSensitiveTypeGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSensitiveTypeGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSensitiveTypeGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSensitiveTypesExportResponse>
            deleteSensitiveTypesExport(
                    DeleteSensitiveTypesExportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSensitiveTypesExportRequest,
                                    DeleteSensitiveTypesExportResponse>
                            handler) {

        Validate.notBlank(
                request.getSensitiveTypesExportId(), "sensitiveTypesExportId must not be blank");

        return clientCall(request, DeleteSensitiveTypesExportResponse::builder)
                .logger(LOG, "deleteSensitiveTypesExport")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSensitiveTypesExport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypesExport/DeleteSensitiveTypesExport")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSensitiveTypesExportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypesExports")
                .appendPathParam(request.getSensitiveTypesExportId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSensitiveTypesExportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSqlCollectionResponse> deleteSqlCollection(
            DeleteSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSqlCollectionRequest, DeleteSqlCollectionResponse>
                    handler) {

        Validate.notBlank(request.getSqlCollectionId(), "sqlCollectionId must not be blank");

        return clientCall(request, DeleteSqlCollectionResponse::builder)
                .logger(LOG, "deleteSqlCollection")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSqlCollection",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/DeleteSqlCollection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSqlCollectionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendPathParam(request.getSqlCollectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSqlCollectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSqlCollectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSqlFirewallAllowedSqlResponse>
            deleteSqlFirewallAllowedSql(
                    DeleteSqlFirewallAllowedSqlRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSqlFirewallAllowedSqlRequest,
                                    DeleteSqlFirewallAllowedSqlResponse>
                            handler) {

        Validate.notBlank(
                request.getSqlFirewallAllowedSqlId(), "sqlFirewallAllowedSqlId must not be blank");

        return clientCall(request, DeleteSqlFirewallAllowedSqlResponse::builder)
                .logger(LOG, "deleteSqlFirewallAllowedSql")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSqlFirewallAllowedSql",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallAllowedSql/DeleteSqlFirewallAllowedSql")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSqlFirewallAllowedSqlRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallAllowedSqls")
                .appendPathParam(request.getSqlFirewallAllowedSqlId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSqlFirewallAllowedSqlResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSqlFirewallAllowedSqlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSqlFirewallPolicyResponse> deleteSqlFirewallPolicy(
            DeleteSqlFirewallPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSqlFirewallPolicyRequest, DeleteSqlFirewallPolicyResponse>
                    handler) {

        Validate.notBlank(
                request.getSqlFirewallPolicyId(), "sqlFirewallPolicyId must not be blank");

        return clientCall(request, DeleteSqlFirewallPolicyResponse::builder)
                .logger(LOG, "deleteSqlFirewallPolicy")
                .serviceDetails(
                        "DataSafe",
                        "DeleteSqlFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicy/DeleteSqlFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSqlFirewallPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallPolicies")
                .appendPathParam(request.getSqlFirewallPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSqlFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSqlFirewallPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetAlertPolicyAssociationResponse>
            deleteTargetAlertPolicyAssociation(
                    DeleteTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTargetAlertPolicyAssociationRequest,
                                    DeleteTargetAlertPolicyAssociationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetDatabaseResponse> deleteTargetDatabase(
            DeleteTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTargetDatabaseRequest, DeleteTargetDatabaseResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetDatabaseGroupResponse> deleteTargetDatabaseGroup(
            DeleteTargetDatabaseGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTargetDatabaseGroupRequest, DeleteTargetDatabaseGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getTargetDatabaseGroupId(), "targetDatabaseGroupId must not be blank");

        return clientCall(request, DeleteTargetDatabaseGroupResponse::builder)
                .logger(LOG, "deleteTargetDatabaseGroup")
                .serviceDetails(
                        "DataSafe",
                        "DeleteTargetDatabaseGroup",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseGroup/DeleteTargetDatabaseGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTargetDatabaseGroupRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabaseGroups")
                .appendPathParam(request.getTargetDatabaseGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteTargetDatabaseGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTargetDatabaseGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUnifiedAuditPolicyResponse> deleteUnifiedAuditPolicy(
            DeleteUnifiedAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUnifiedAuditPolicyRequest, DeleteUnifiedAuditPolicyResponse>
                    handler) {

        Validate.notBlank(
                request.getUnifiedAuditPolicyId(), "unifiedAuditPolicyId must not be blank");

        return clientCall(request, DeleteUnifiedAuditPolicyResponse::builder)
                .logger(LOG, "deleteUnifiedAuditPolicy")
                .serviceDetails(
                        "DataSafe",
                        "DeleteUnifiedAuditPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicy/DeleteUnifiedAuditPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUnifiedAuditPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicies")
                .appendPathParam(request.getUnifiedAuditPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteUnifiedAuditPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUnifiedAuditPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUnifiedAuditPolicyDefinitionResponse>
            deleteUnifiedAuditPolicyDefinition(
                    DeleteUnifiedAuditPolicyDefinitionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteUnifiedAuditPolicyDefinitionRequest,
                                    DeleteUnifiedAuditPolicyDefinitionResponse>
                            handler) {

        Validate.notBlank(
                request.getUnifiedAuditPolicyDefinitionId(),
                "unifiedAuditPolicyDefinitionId must not be blank");

        return clientCall(request, DeleteUnifiedAuditPolicyDefinitionResponse::builder)
                .logger(LOG, "deleteUnifiedAuditPolicyDefinition")
                .serviceDetails(
                        "DataSafe",
                        "DeleteUnifiedAuditPolicyDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicyDefinition/DeleteUnifiedAuditPolicyDefinition")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUnifiedAuditPolicyDefinitionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicyDefinitions")
                .appendPathParam(request.getUnifiedAuditPolicyDefinitionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteUnifiedAuditPolicyDefinitionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteUnifiedAuditPolicyDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserAssessmentResponse> deleteUserAssessment(
            DeleteUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUserAssessmentRequest, DeleteUserAssessmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeploySecurityPolicyDeploymentResponse>
            deploySecurityPolicyDeployment(
                    DeploySecurityPolicyDeploymentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeploySecurityPolicyDeploymentRequest,
                                    DeploySecurityPolicyDeploymentResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyDeploymentId(),
                "securityPolicyDeploymentId must not be blank");

        return clientCall(request, DeploySecurityPolicyDeploymentResponse::builder)
                .logger(LOG, "deploySecurityPolicyDeployment")
                .serviceDetails(
                        "DataSafe",
                        "DeploySecurityPolicyDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeployment/DeploySecurityPolicyDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeploySecurityPolicyDeploymentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyDeployments")
                .appendPathParam(request.getSecurityPolicyDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("deploy")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeploySecurityPolicyDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeploySecurityPolicyDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DiscoverAuditTrailsResponse> discoverAuditTrails(
            DiscoverAuditTrailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DiscoverAuditTrailsRequest, DiscoverAuditTrailsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadDiscoveryReportResponse> downloadDiscoveryReport(
            DownloadDiscoveryReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadDiscoveryReportRequest, DownloadDiscoveryReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadMaskingLogResponse> downloadMaskingLog(
            DownloadMaskingLogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingLogRequest, DownloadMaskingLogResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadMaskingPolicyResponse> downloadMaskingPolicy(
            DownloadMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingPolicyRequest, DownloadMaskingPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadMaskingReportResponse> downloadMaskingReport(
            DownloadMaskingReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingReportRequest, DownloadMaskingReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadPrivilegeScriptResponse> downloadPrivilegeScript(
            DownloadPrivilegeScriptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadPrivilegeScriptRequest, DownloadPrivilegeScriptResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadSecurityAssessmentReportResponse>
            downloadSecurityAssessmentReport(
                    DownloadSecurityAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadSecurityAssessmentReportRequest,
                                    DownloadSecurityAssessmentReportResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadSensitiveDataModelResponse>
            downloadSensitiveDataModel(
                    DownloadSensitiveDataModelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadSensitiveDataModelRequest,
                                    DownloadSensitiveDataModelResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadSensitiveTypesExportResponse>
            downloadSensitiveTypesExport(
                    DownloadSensitiveTypesExportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadSensitiveTypesExportRequest,
                                    DownloadSensitiveTypesExportResponse>
                            handler) {

        Validate.notBlank(
                request.getSensitiveTypesExportId(), "sensitiveTypesExportId must not be blank");
        Objects.requireNonNull(
                request.getDownloadSensitiveTypesExportDetails(),
                "downloadSensitiveTypesExportDetails is required");

        return clientCall(request, DownloadSensitiveTypesExportResponse::builder)
                .logger(LOG, "downloadSensitiveTypesExport")
                .serviceDetails(
                        "DataSafe",
                        "DownloadSensitiveTypesExport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypesExport/DownloadSensitiveTypesExport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadSensitiveTypesExportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypesExports")
                .appendPathParam(request.getSensitiveTypesExportId())
                .appendPathParam("actions")
                .appendPathParam("download")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        DownloadSensitiveTypesExportResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadSensitiveTypesExportResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", DownloadSensitiveTypesExportResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadSensitiveTypesExportResponse.Builder::contentLength)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadUserAssessmentReportResponse>
            downloadUserAssessmentReport(
                    DownloadUserAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadUserAssessmentReportRequest,
                                    DownloadUserAssessmentReportResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableDataSafeConfigurationResponse>
            enableDataSafeConfiguration(
                    EnableDataSafeConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableDataSafeConfigurationRequest,
                                    EnableDataSafeConfigurationResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateDiscoveryReportForDownloadResponse>
            generateDiscoveryReportForDownload(
                    GenerateDiscoveryReportForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDiscoveryReportForDownloadRequest,
                                    GenerateDiscoveryReportForDownloadResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateHealthReportResponse> generateHealthReport(
            GenerateHealthReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateHealthReportRequest, GenerateHealthReportResponse>
                    handler) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getGenerateHealthReportDetails(),
                "generateHealthReportDetails is required");

        return clientCall(request, GenerateHealthReportResponse::builder)
                .logger(LOG, "generateHealthReport")
                .serviceDetails(
                        "DataSafe",
                        "GenerateHealthReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/GenerateHealthReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateHealthReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("actions")
                .appendPathParam("generateHealthReport")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateHealthReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateHealthReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateMaskingPolicyForDownloadResponse>
            generateMaskingPolicyForDownload(
                    GenerateMaskingPolicyForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateMaskingPolicyForDownloadRequest,
                                    GenerateMaskingPolicyForDownloadResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateMaskingReportForDownloadResponse>
            generateMaskingReportForDownload(
                    GenerateMaskingReportForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateMaskingReportForDownloadRequest,
                                    GenerateMaskingReportForDownloadResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateOnPremConnectorConfigurationResponse>
            generateOnPremConnectorConfiguration(
                    GenerateOnPremConnectorConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateOnPremConnectorConfigurationRequest,
                                    GenerateOnPremConnectorConfigurationResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateReportResponse> generateReport(
            GenerateReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateReportRequest, GenerateReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateSecurityAssessmentReportResponse>
            generateSecurityAssessmentReport(
                    GenerateSecurityAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateSecurityAssessmentReportRequest,
                                    GenerateSecurityAssessmentReportResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateSensitiveDataModelForDownloadResponse>
            generateSensitiveDataModelForDownload(
                    GenerateSensitiveDataModelForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateSensitiveDataModelForDownloadRequest,
                                    GenerateSensitiveDataModelForDownloadResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateSqlFirewallPolicyResponse> generateSqlFirewallPolicy(
            GenerateSqlFirewallPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateSqlFirewallPolicyRequest, GenerateSqlFirewallPolicyResponse>
                    handler) {

        Validate.notBlank(request.getSqlCollectionId(), "sqlCollectionId must not be blank");

        return clientCall(request, GenerateSqlFirewallPolicyResponse::builder)
                .logger(LOG, "generateSqlFirewallPolicy")
                .serviceDetails(
                        "DataSafe",
                        "GenerateSqlFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/GenerateSqlFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateSqlFirewallPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendPathParam(request.getSqlCollectionId())
                .appendPathParam("actions")
                .appendPathParam("generateSqlFirewallPolicy")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateSqlFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateSqlFirewallPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateUserAssessmentReportResponse>
            generateUserAssessmentReport(
                    GenerateUserAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateUserAssessmentReportRequest,
                                    GenerateUserAssessmentReportResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAlertResponse> getAlert(
            GetAlertRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAlertRequest, GetAlertResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAlertPolicyResponse> getAlertPolicy(
            GetAlertPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAlertPolicyRequest, GetAlertPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAlertPolicyRuleResponse> getAlertPolicyRule(
            GetAlertPolicyRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAlertPolicyRuleRequest, GetAlertPolicyRuleResponse>
                    handler) {

        Validate.notBlank(request.getAlertPolicyId(), "alertPolicyId must not be blank");

        Validate.notBlank(request.getRuleKey(), "ruleKey must not be blank");

        return clientCall(request, GetAlertPolicyRuleResponse::builder)
                .logger(LOG, "getAlertPolicyRule")
                .serviceDetails(
                        "DataSafe",
                        "GetAlertPolicyRule",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicyRule/GetAlertPolicyRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAlertPolicyRuleRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .appendPathParam(request.getAlertPolicyId())
                .appendPathParam("rules")
                .appendPathParam(request.getRuleKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AlertPolicyRule.class,
                        GetAlertPolicyRuleResponse.Builder::alertPolicyRule)
                .handleResponseHeaderString("etag", GetAlertPolicyRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAlertPolicyRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAttributeSetResponse> getAttributeSet(
            GetAttributeSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAttributeSetRequest, GetAttributeSetResponse>
                    handler) {

        Validate.notBlank(request.getAttributeSetId(), "attributeSetId must not be blank");

        return clientCall(request, GetAttributeSetResponse::builder)
                .logger(LOG, "getAttributeSet")
                .serviceDetails(
                        "DataSafe",
                        "GetAttributeSet",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AttributeSet/GetAttributeSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAttributeSetRequest::builder)
                .basePath("/20181201")
                .appendPathParam("attributeSets")
                .appendPathParam(request.getAttributeSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AttributeSet.class,
                        GetAttributeSetResponse.Builder::attributeSet)
                .handleResponseHeaderString("etag", GetAttributeSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAttributeSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAuditArchiveRetrievalResponse> getAuditArchiveRetrieval(
            GetAuditArchiveRetrievalRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAuditPolicyResponse> getAuditPolicy(
            GetAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuditPolicyRequest, GetAuditPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAuditProfileResponse> getAuditProfile(
            GetAuditProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuditProfileRequest, GetAuditProfileResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAuditTrailResponse> getAuditTrail(
            GetAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAuditTrailRequest, GetAuditTrailResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleFormatsForDataTypesResponse>
            getCompatibleFormatsForDataTypes(
                    GetCompatibleFormatsForDataTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCompatibleFormatsForDataTypesRequest,
                                    GetCompatibleFormatsForDataTypesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleFormatsForSensitiveTypesResponse>
            getCompatibleFormatsForSensitiveTypes(
                    GetCompatibleFormatsForSensitiveTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCompatibleFormatsForSensitiveTypesRequest,
                                    GetCompatibleFormatsForSensitiveTypesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataSafeConfigurationResponse> getDataSafeConfiguration(
            GetDataSafeConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataSafePrivateEndpointResponse>
            getDataSafePrivateEndpoint(
                    GetDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDataSafePrivateEndpointRequest,
                                    GetDataSafePrivateEndpointResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseSecurityConfigResponse> getDatabaseSecurityConfig(
            GetDatabaseSecurityConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseSecurityConfigRequest, GetDatabaseSecurityConfigResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseSecurityConfigId(),
                "databaseSecurityConfigId must not be blank");

        return clientCall(request, GetDatabaseSecurityConfigResponse::builder)
                .logger(LOG, "getDatabaseSecurityConfig")
                .serviceDetails(
                        "DataSafe",
                        "GetDatabaseSecurityConfig",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseSecurityConfig/GetDatabaseSecurityConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseSecurityConfigRequest::builder)
                .basePath("/20181201")
                .appendPathParam("databaseSecurityConfigs")
                .appendPathParam(request.getDatabaseSecurityConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DatabaseSecurityConfig.class,
                        GetDatabaseSecurityConfigResponse.Builder::databaseSecurityConfig)
                .handleResponseHeaderString("etag", GetDatabaseSecurityConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseSecurityConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseTableAccessEntryResponse>
            getDatabaseTableAccessEntry(
                    GetDatabaseTableAccessEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseTableAccessEntryRequest,
                                    GetDatabaseTableAccessEntryResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyReportId(), "securityPolicyReportId must not be blank");

        Validate.notBlank(
                request.getDatabaseTableAccessEntryKey(),
                "databaseTableAccessEntryKey must not be blank");

        return clientCall(request, GetDatabaseTableAccessEntryResponse::builder)
                .logger(LOG, "getDatabaseTableAccessEntry")
                .serviceDetails(
                        "DataSafe",
                        "GetDatabaseTableAccessEntry",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseTableAccessEntry/GetDatabaseTableAccessEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseTableAccessEntryRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyReports")
                .appendPathParam(request.getSecurityPolicyReportId())
                .appendPathParam("databaseTableAccessEntries")
                .appendPathParam(request.getDatabaseTableAccessEntryKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DatabaseTableAccessEntry.class,
                        GetDatabaseTableAccessEntryResponse.Builder::databaseTableAccessEntry)
                .handleResponseHeaderString(
                        "etag", GetDatabaseTableAccessEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseTableAccessEntryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseViewAccessEntryResponse>
            getDatabaseViewAccessEntry(
                    GetDatabaseViewAccessEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseViewAccessEntryRequest,
                                    GetDatabaseViewAccessEntryResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyReportId(), "securityPolicyReportId must not be blank");

        Validate.notBlank(
                request.getDatabaseViewAccessEntryKey(),
                "databaseViewAccessEntryKey must not be blank");

        return clientCall(request, GetDatabaseViewAccessEntryResponse::builder)
                .logger(LOG, "getDatabaseViewAccessEntry")
                .serviceDetails(
                        "DataSafe",
                        "GetDatabaseViewAccessEntry",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseViewAccessEntry/GetDatabaseViewAccessEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseViewAccessEntryRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyReports")
                .appendPathParam(request.getSecurityPolicyReportId())
                .appendPathParam("databaseViewAccessEntries")
                .appendPathParam(request.getDatabaseViewAccessEntryKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DatabaseViewAccessEntry.class,
                        GetDatabaseViewAccessEntryResponse.Builder::databaseViewAccessEntry)
                .handleResponseHeaderString(
                        "etag", GetDatabaseViewAccessEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseViewAccessEntryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDifferenceColumnResponse> getDifferenceColumn(
            GetDifferenceColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDifferenceColumnRequest, GetDifferenceColumnResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveryJobResponse> getDiscoveryJob(
            GetDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryJobRequest, GetDiscoveryJobResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveryJobResultResponse> getDiscoveryJobResult(
            GetDiscoveryJobResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryJobResultRequest, GetDiscoveryJobResultResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGroupMembersResponse> getGroupMembers(
            GetGroupMembersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetGroupMembersRequest, GetGroupMembersResponse>
                    handler) {

        Validate.notBlank(
                request.getTargetDatabaseGroupId(), "targetDatabaseGroupId must not be blank");

        return clientCall(request, GetGroupMembersResponse::builder)
                .logger(LOG, "getGroupMembers")
                .serviceDetails(
                        "DataSafe",
                        "GetGroupMembers",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseGroup/GetGroupMembers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGroupMembersRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabaseGroups")
                .appendPathParam(request.getTargetDatabaseGroupId())
                .appendPathParam("groupMembers")
                .appendQueryParam("targetDatabaseId", request.getTargetDatabaseId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.GroupMembersCollection.class,
                        GetGroupMembersResponse.Builder::groupMembersCollection)
                .handleResponseHeaderString("etag", GetGroupMembersResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGroupMembersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLibraryMaskingFormatResponse> getLibraryMaskingFormat(
            GetLibraryMaskingFormatRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMaskingColumnResponse> getMaskingColumn(
            GetMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaskingColumnRequest, GetMaskingColumnResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMaskingPolicyResponse> getMaskingPolicy(
            GetMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaskingPolicyRequest, GetMaskingPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMaskingPolicyHealthReportResponse>
            getMaskingPolicyHealthReport(
                    GetMaskingPolicyHealthReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMaskingPolicyHealthReportRequest,
                                    GetMaskingPolicyHealthReportResponse>
                            handler) {

        Validate.notBlank(
                request.getMaskingPolicyHealthReportId(),
                "maskingPolicyHealthReportId must not be blank");

        return clientCall(request, GetMaskingPolicyHealthReportResponse::builder)
                .logger(LOG, "getMaskingPolicyHealthReport")
                .serviceDetails(
                        "DataSafe",
                        "GetMaskingPolicyHealthReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/GetMaskingPolicyHealthReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaskingPolicyHealthReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicyHealthReports")
                .appendPathParam(request.getMaskingPolicyHealthReportId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingPolicyHealthReport.class,
                        GetMaskingPolicyHealthReportResponse.Builder::maskingPolicyHealthReport)
                .handleResponseHeaderString(
                        "etag", GetMaskingPolicyHealthReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMaskingPolicyHealthReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMaskingReportResponse> getMaskingReport(
            GetMaskingReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaskingReportRequest, GetMaskingReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOnPremConnectorResponse> getOnPremConnector(
            GetOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOnPremConnectorRequest, GetOnPremConnectorResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPeerTargetDatabaseResponse> getPeerTargetDatabase(
            GetPeerTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPeerTargetDatabaseRequest, GetPeerTargetDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, GetPeerTargetDatabaseResponse::builder)
                .logger(LOG, "getPeerTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "GetPeerTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/PeerTargetDatabase/GetPeerTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPeerTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("peerTargetDatabases")
                .appendPathParam(request.getPeerTargetDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.PeerTargetDatabase.class,
                        GetPeerTargetDatabaseResponse.Builder::peerTargetDatabase)
                .handleResponseHeaderString("etag", GetPeerTargetDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPeerTargetDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProfileResponse> getProfile(
            GetProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProfileRequest, GetProfileResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetReferentialRelationResponse> getReferentialRelation(
            GetReferentialRelationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReferentialRelationRequest, GetReferentialRelationResponse>
                    handler) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        Validate.notBlank(
                request.getReferentialRelationKey(), "referentialRelationKey must not be blank");

        return clientCall(request, GetReferentialRelationResponse::builder)
                .logger(LOG, "getReferentialRelation")
                .serviceDetails(
                        "DataSafe",
                        "GetReferentialRelation",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReferentialRelation/GetReferentialRelation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReferentialRelationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("referentialRelations")
                .appendPathParam(request.getReferentialRelationKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.ReferentialRelation.class,
                        GetReferentialRelationResponse.Builder::referentialRelation)
                .handleResponseHeaderString("etag", GetReferentialRelationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetReferentialRelationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetReportResponse> getReport(
            GetReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetReportRequest, GetReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetReportContentResponse> getReportContent(
            GetReportContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReportContentRequest, GetReportContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetReportDefinitionResponse> getReportDefinition(
            GetReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReportDefinitionRequest, GetReportDefinitionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSdmMaskingPolicyDifferenceResponse>
            getSdmMaskingPolicyDifference(
                    GetSdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSdmMaskingPolicyDifferenceRequest,
                                    GetSdmMaskingPolicyDifferenceResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityAssessmentResponse> getSecurityAssessment(
            GetSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityAssessmentComparisonResponse>
            getSecurityAssessmentComparison(
                    GetSecurityAssessmentComparisonRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityAssessmentComparisonRequest,
                                    GetSecurityAssessmentComparisonResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyResponse> getSecurityPolicy(
            GetSecurityPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityPolicyRequest, GetSecurityPolicyResponse>
                    handler) {

        Validate.notBlank(request.getSecurityPolicyId(), "securityPolicyId must not be blank");

        return clientCall(request, GetSecurityPolicyResponse::builder)
                .logger(LOG, "getSecurityPolicy")
                .serviceDetails(
                        "DataSafe",
                        "GetSecurityPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicy/GetSecurityPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicies")
                .appendPathParam(request.getSecurityPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicy.class,
                        GetSecurityPolicyResponse.Builder::securityPolicy)
                .handleResponseHeaderString("etag", GetSecurityPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyConfigResponse> getSecurityPolicyConfig(
            GetSecurityPolicyConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityPolicyConfigRequest, GetSecurityPolicyConfigResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityPolicyConfigId(), "securityPolicyConfigId must not be blank");

        return clientCall(request, GetSecurityPolicyConfigResponse::builder)
                .logger(LOG, "getSecurityPolicyConfig")
                .serviceDetails(
                        "DataSafe",
                        "GetSecurityPolicyConfig",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyConfig/GetSecurityPolicyConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityPolicyConfigRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyConfigs")
                .appendPathParam(request.getSecurityPolicyConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyConfig.class,
                        GetSecurityPolicyConfigResponse.Builder::securityPolicyConfig)
                .handleResponseHeaderString("etag", GetSecurityPolicyConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityPolicyConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyDeploymentResponse>
            getSecurityPolicyDeployment(
                    GetSecurityPolicyDeploymentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityPolicyDeploymentRequest,
                                    GetSecurityPolicyDeploymentResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyDeploymentId(),
                "securityPolicyDeploymentId must not be blank");

        return clientCall(request, GetSecurityPolicyDeploymentResponse::builder)
                .logger(LOG, "getSecurityPolicyDeployment")
                .serviceDetails(
                        "DataSafe",
                        "GetSecurityPolicyDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeployment/GetSecurityPolicyDeployment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityPolicyDeploymentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyDeployments")
                .appendPathParam(request.getSecurityPolicyDeploymentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyDeployment.class,
                        GetSecurityPolicyDeploymentResponse.Builder::securityPolicyDeployment)
                .handleResponseHeaderString(
                        "etag", GetSecurityPolicyDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityPolicyDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyEntryStateResponse>
            getSecurityPolicyEntryState(
                    GetSecurityPolicyEntryStateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityPolicyEntryStateRequest,
                                    GetSecurityPolicyEntryStateResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyDeploymentId(),
                "securityPolicyDeploymentId must not be blank");

        Validate.notBlank(
                request.getSecurityPolicyEntryStateId(),
                "securityPolicyEntryStateId must not be blank");

        return clientCall(request, GetSecurityPolicyEntryStateResponse::builder)
                .logger(LOG, "getSecurityPolicyEntryState")
                .serviceDetails(
                        "DataSafe",
                        "GetSecurityPolicyEntryState",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyEntryState/GetSecurityPolicyEntryState")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityPolicyEntryStateRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyDeployments")
                .appendPathParam(request.getSecurityPolicyDeploymentId())
                .appendPathParam("securityPolicyEntryStates")
                .appendPathParam(request.getSecurityPolicyEntryStateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyEntryState.class,
                        GetSecurityPolicyEntryStateResponse.Builder::securityPolicyEntryState)
                .handleResponseHeaderString(
                        "etag", GetSecurityPolicyEntryStateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityPolicyEntryStateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyReportResponse> getSecurityPolicyReport(
            GetSecurityPolicyReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityPolicyReportRequest, GetSecurityPolicyReportResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityPolicyReportId(), "securityPolicyReportId must not be blank");

        return clientCall(request, GetSecurityPolicyReportResponse::builder)
                .logger(LOG, "getSecurityPolicyReport")
                .serviceDetails(
                        "DataSafe",
                        "GetSecurityPolicyReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyReport/GetSecurityPolicyReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityPolicyReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyReports")
                .appendPathParam(request.getSecurityPolicyReportId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyReport.class,
                        GetSecurityPolicyReportResponse.Builder::securityPolicyReport)
                .handleResponseHeaderString("etag", GetSecurityPolicyReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityPolicyReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveColumnResponse> getSensitiveColumn(
            GetSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveColumnRequest, GetSensitiveColumnResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveDataModelResponse> getSensitiveDataModel(
            GetSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveTypeResponse> getSensitiveType(
            GetSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveTypeRequest, GetSensitiveTypeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveTypeGroupResponse> getSensitiveTypeGroup(
            GetSensitiveTypeGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveTypeGroupRequest, GetSensitiveTypeGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getSensitiveTypeGroupId(), "sensitiveTypeGroupId must not be blank");

        return clientCall(request, GetSensitiveTypeGroupResponse::builder)
                .logger(LOG, "getSensitiveTypeGroup")
                .serviceDetails(
                        "DataSafe",
                        "GetSensitiveTypeGroup",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypeGroup/GetSensitiveTypeGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSensitiveTypeGroupRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypeGroups")
                .appendPathParam(request.getSensitiveTypeGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveTypeGroup.class,
                        GetSensitiveTypeGroupResponse.Builder::sensitiveTypeGroup)
                .handleResponseHeaderString("etag", GetSensitiveTypeGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSensitiveTypeGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveTypesExportResponse> getSensitiveTypesExport(
            GetSensitiveTypesExportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveTypesExportRequest, GetSensitiveTypesExportResponse>
                    handler) {

        Validate.notBlank(
                request.getSensitiveTypesExportId(), "sensitiveTypesExportId must not be blank");

        return clientCall(request, GetSensitiveTypesExportResponse::builder)
                .logger(LOG, "getSensitiveTypesExport")
                .serviceDetails(
                        "DataSafe",
                        "GetSensitiveTypesExport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypesExport/GetSensitiveTypesExport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSensitiveTypesExportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypesExports")
                .appendPathParam(request.getSensitiveTypesExportId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveTypesExport.class,
                        GetSensitiveTypesExportResponse.Builder::sensitiveTypesExport)
                .handleResponseHeaderString("etag", GetSensitiveTypesExportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSensitiveTypesExportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSqlCollectionResponse> getSqlCollection(
            GetSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSqlCollectionRequest, GetSqlCollectionResponse>
                    handler) {

        Validate.notBlank(request.getSqlCollectionId(), "sqlCollectionId must not be blank");

        return clientCall(request, GetSqlCollectionResponse::builder)
                .logger(LOG, "getSqlCollection")
                .serviceDetails(
                        "DataSafe",
                        "GetSqlCollection",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/GetSqlCollection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSqlCollectionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendPathParam(request.getSqlCollectionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlCollection.class,
                        GetSqlCollectionResponse.Builder::sqlCollection)
                .handleResponseHeaderString("etag", GetSqlCollectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSqlCollectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSqlFirewallAllowedSqlResponse> getSqlFirewallAllowedSql(
            GetSqlFirewallAllowedSqlRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSqlFirewallAllowedSqlRequest, GetSqlFirewallAllowedSqlResponse>
                    handler) {

        Validate.notBlank(
                request.getSqlFirewallAllowedSqlId(), "sqlFirewallAllowedSqlId must not be blank");

        return clientCall(request, GetSqlFirewallAllowedSqlResponse::builder)
                .logger(LOG, "getSqlFirewallAllowedSql")
                .serviceDetails(
                        "DataSafe",
                        "GetSqlFirewallAllowedSql",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallAllowedSql/GetSqlFirewallAllowedSql")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSqlFirewallAllowedSqlRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallAllowedSqls")
                .appendPathParam(request.getSqlFirewallAllowedSqlId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlFirewallAllowedSql.class,
                        GetSqlFirewallAllowedSqlResponse.Builder::sqlFirewallAllowedSql)
                .handleResponseHeaderString("etag", GetSqlFirewallAllowedSqlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSqlFirewallAllowedSqlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSqlFirewallPolicyResponse> getSqlFirewallPolicy(
            GetSqlFirewallPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSqlFirewallPolicyRequest, GetSqlFirewallPolicyResponse>
                    handler) {

        Validate.notBlank(
                request.getSqlFirewallPolicyId(), "sqlFirewallPolicyId must not be blank");

        return clientCall(request, GetSqlFirewallPolicyResponse::builder)
                .logger(LOG, "getSqlFirewallPolicy")
                .serviceDetails(
                        "DataSafe",
                        "GetSqlFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicy/GetSqlFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSqlFirewallPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallPolicies")
                .appendPathParam(request.getSqlFirewallPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlFirewallPolicy.class,
                        GetSqlFirewallPolicyResponse.Builder::sqlFirewallPolicy)
                .handleResponseHeaderString("etag", GetSqlFirewallPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSqlFirewallPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTargetAlertPolicyAssociationResponse>
            getTargetAlertPolicyAssociation(
                    GetTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetAlertPolicyAssociationRequest,
                                    GetTargetAlertPolicyAssociationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTargetDatabaseResponse> getTargetDatabase(
            GetTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTargetDatabaseRequest, GetTargetDatabaseResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTargetDatabaseGroupResponse> getTargetDatabaseGroup(
            GetTargetDatabaseGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTargetDatabaseGroupRequest, GetTargetDatabaseGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getTargetDatabaseGroupId(), "targetDatabaseGroupId must not be blank");

        return clientCall(request, GetTargetDatabaseGroupResponse::builder)
                .logger(LOG, "getTargetDatabaseGroup")
                .serviceDetails(
                        "DataSafe",
                        "GetTargetDatabaseGroup",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseGroup/GetTargetDatabaseGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTargetDatabaseGroupRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabaseGroups")
                .appendPathParam(request.getTargetDatabaseGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.TargetDatabaseGroup.class,
                        GetTargetDatabaseGroupResponse.Builder::targetDatabaseGroup)
                .handleResponseHeaderString("etag", GetTargetDatabaseGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTargetDatabaseGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateBaselineComparisonResponse>
            getTemplateBaselineComparison(
                    GetTemplateBaselineComparisonRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTemplateBaselineComparisonRequest,
                                    GetTemplateBaselineComparisonResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        Validate.notBlank(
                request.getComparisonSecurityAssessmentId(),
                "comparisonSecurityAssessmentId must not be blank");

        return clientCall(request, GetTemplateBaselineComparisonResponse::builder)
                .logger(LOG, "getTemplateBaselineComparison")
                .serviceDetails(
                        "DataSafe",
                        "GetTemplateBaselineComparison",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GetTemplateBaselineComparison")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTemplateBaselineComparisonRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("templateBaselineComparison")
                .appendPathParam(request.getComparisonSecurityAssessmentId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("category", request.getCategory())
                .appendQueryParam("findingKey", request.getFindingKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityAssessmentTemplateBaselineComparison
                                .class,
                        GetTemplateBaselineComparisonResponse.Builder
                                ::securityAssessmentTemplateBaselineComparison)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetTemplateBaselineComparisonResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetTemplateBaselineComparisonResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUnifiedAuditPolicyResponse> getUnifiedAuditPolicy(
            GetUnifiedAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUnifiedAuditPolicyRequest, GetUnifiedAuditPolicyResponse>
                    handler) {

        Validate.notBlank(
                request.getUnifiedAuditPolicyId(), "unifiedAuditPolicyId must not be blank");

        return clientCall(request, GetUnifiedAuditPolicyResponse::builder)
                .logger(LOG, "getUnifiedAuditPolicy")
                .serviceDetails(
                        "DataSafe",
                        "GetUnifiedAuditPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicy/GetUnifiedAuditPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUnifiedAuditPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicies")
                .appendPathParam(request.getUnifiedAuditPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.UnifiedAuditPolicy.class,
                        GetUnifiedAuditPolicyResponse.Builder::unifiedAuditPolicy)
                .handleResponseHeaderString("etag", GetUnifiedAuditPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetUnifiedAuditPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUnifiedAuditPolicyDefinitionResponse>
            getUnifiedAuditPolicyDefinition(
                    GetUnifiedAuditPolicyDefinitionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetUnifiedAuditPolicyDefinitionRequest,
                                    GetUnifiedAuditPolicyDefinitionResponse>
                            handler) {

        Validate.notBlank(
                request.getUnifiedAuditPolicyDefinitionId(),
                "unifiedAuditPolicyDefinitionId must not be blank");

        return clientCall(request, GetUnifiedAuditPolicyDefinitionResponse::builder)
                .logger(LOG, "getUnifiedAuditPolicyDefinition")
                .serviceDetails(
                        "DataSafe",
                        "GetUnifiedAuditPolicyDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicyDefinition/GetUnifiedAuditPolicyDefinition")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUnifiedAuditPolicyDefinitionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicyDefinitions")
                .appendPathParam(request.getUnifiedAuditPolicyDefinitionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.UnifiedAuditPolicyDefinition.class,
                        GetUnifiedAuditPolicyDefinitionResponse.Builder
                                ::unifiedAuditPolicyDefinition)
                .handleResponseHeaderString(
                        "etag", GetUnifiedAuditPolicyDefinitionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetUnifiedAuditPolicyDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserAssessmentResponse> getUserAssessment(
            GetUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserAssessmentRequest, GetUserAssessmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserAssessmentComparisonResponse>
            getUserAssessmentComparison(
                    GetUserAssessmentComparisonRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetUserAssessmentComparisonRequest,
                                    GetUserAssessmentComparisonResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAlertAnalyticsResponse> listAlertAnalytics(
            ListAlertAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAlertPoliciesResponse> listAlertPolicies(
            ListAlertPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlertPoliciesRequest, ListAlertPoliciesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAlertPolicyRulesResponse> listAlertPolicyRules(
            ListAlertPolicyRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAlertsResponse> listAlerts(
            ListAlertsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAlertsRequest, ListAlertsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedResourcesResponse> listAssociatedResources(
            ListAssociatedResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssociatedResourcesRequest, ListAssociatedResourcesResponse>
                    handler) {

        Validate.notBlank(request.getAttributeSetId(), "attributeSetId must not be blank");

        return clientCall(request, ListAssociatedResourcesResponse::builder)
                .logger(LOG, "listAssociatedResources")
                .serviceDetails(
                        "DataSafe",
                        "ListAssociatedResources",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AttributeSet/ListAssociatedResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAssociatedResourcesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("attributeSets")
                .appendPathParam(request.getAttributeSetId())
                .appendPathParam("associatedResources")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("associatedResourceType", request.getAssociatedResourceType())
                .appendQueryParam("associatedResourceId", request.getAssociatedResourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AssociatedResourceCollection.class,
                        ListAssociatedResourcesResponse.Builder::associatedResourceCollection)
                .handleResponseHeaderString("etag", ListAssociatedResourcesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssociatedResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssociatedResourcesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAssociatedResourcesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAttributeSetsResponse> listAttributeSets(
            ListAttributeSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAttributeSetsRequest, ListAttributeSetsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAttributeSetsResponse::builder)
                .logger(LOG, "listAttributeSets")
                .serviceDetails(
                        "DataSafe",
                        "ListAttributeSets",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/attributeSet/ListAttributeSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAttributeSetsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("attributeSets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("attributeSetId", request.getAttributeSetId())
                .appendEnumQueryParam("attributeSetType", request.getAttributeSetType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("isUserDefined", request.getIsUserDefined())
                .appendEnumQueryParam("inUse", request.getInUse())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.AttributeSetCollection.class,
                        ListAttributeSetsResponse.Builder::attributeSetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAttributeSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAttributeSetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAttributeSetsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuditArchiveRetrievalsResponse>
            listAuditArchiveRetrievals(
                    ListAuditArchiveRetrievalsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAuditArchiveRetrievalsRequest,
                                    ListAuditArchiveRetrievalsResponse>
                            handler) {
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
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuditEventAnalyticsResponse> listAuditEventAnalytics(
            ListAuditEventAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuditEventsResponse> listAuditEvents(
            ListAuditEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditEventsRequest, ListAuditEventsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuditPoliciesResponse> listAuditPolicies(
            ListAuditPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditPoliciesRequest, ListAuditPoliciesResponse>
                    handler) {
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
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuditPolicyAnalyticsResponse> listAuditPolicyAnalytics(
            ListAuditPolicyAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditPolicyAnalyticsRequest, ListAuditPolicyAnalyticsResponse>
                    handler) {
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
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuditProfileAnalyticsResponse> listAuditProfileAnalytics(
            ListAuditProfileAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>
                    handler) {
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
                .appendEnumQueryParam("targetType", request.getTargetType())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuditProfilesResponse> listAuditProfiles(
            ListAuditProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditProfilesRequest, ListAuditProfilesResponse>
                    handler) {
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
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendEnumQueryParam("targetType", request.getTargetType())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuditTrailAnalyticsResponse> listAuditTrailAnalytics(
            ListAuditTrailAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>
                    handler) {
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
                .appendQueryParam("timeStarted", request.getTimeStarted())
                .appendQueryParam("timeEnded", request.getTimeEnded())
                .appendQueryParam("queryTimeZone", request.getQueryTimeZone())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuditTrailsResponse> listAuditTrails(
            ListAuditTrailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditTrailsRequest, ListAuditTrailsResponse>
                    handler) {
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
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableAuditVolumesResponse> listAvailableAuditVolumes(
            ListAvailableAuditVolumesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListChecksResponse> listChecks(
            ListChecksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListChecksRequest, ListChecksResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        return clientCall(request, ListChecksResponse::builder)
                .logger(LOG, "listChecks")
                .serviceDetails(
                        "DataSafe",
                        "ListChecks",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListChecks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListChecksRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("checks")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("suggestedSeverity", request.getSuggestedSeverity())
                .appendListQueryParam(
                        "containsSeverity",
                        request.getContainsSeverity(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "containsReferences",
                        request.getContainsReferences(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("key", request.getKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.CheckSummary.class,
                        ListChecksResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListChecksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListChecksResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListChecksResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCollectedAuditVolumesResponse> listCollectedAuditVolumes(
            ListCollectedAuditVolumesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListColumnsResponse> listColumns(
            ListColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListColumnsRequest, ListColumnsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataSafePrivateEndpointsResponse>
            listDataSafePrivateEndpoints(
                    ListDataSafePrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDataSafePrivateEndpointsRequest,
                                    ListDataSafePrivateEndpointsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseSecurityConfigsResponse>
            listDatabaseSecurityConfigs(
                    ListDatabaseSecurityConfigsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseSecurityConfigsRequest,
                                    ListDatabaseSecurityConfigsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatabaseSecurityConfigsResponse::builder)
                .logger(LOG, "listDatabaseSecurityConfigs")
                .serviceDetails(
                        "DataSafe",
                        "ListDatabaseSecurityConfigs",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseSecurityConfigCollection/ListDatabaseSecurityConfigs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseSecurityConfigsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("databaseSecurityConfigs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("databaseSecurityConfigId", request.getDatabaseSecurityConfigId())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DatabaseSecurityConfigCollection.class,
                        ListDatabaseSecurityConfigsResponse.Builder
                                ::databaseSecurityConfigCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabaseSecurityConfigsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseSecurityConfigsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDatabaseSecurityConfigsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseTableAccessEntriesResponse>
            listDatabaseTableAccessEntries(
                    ListDatabaseTableAccessEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseTableAccessEntriesRequest,
                                    ListDatabaseTableAccessEntriesResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyReportId(), "securityPolicyReportId must not be blank");

        return clientCall(request, ListDatabaseTableAccessEntriesResponse::builder)
                .logger(LOG, "listDatabaseTableAccessEntries")
                .serviceDetails(
                        "DataSafe",
                        "ListDatabaseTableAccessEntries",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseTableAccessEntryCollection/ListDatabaseTableAccessEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseTableAccessEntriesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyReports")
                .appendPathParam(request.getSecurityPolicyReportId())
                .appendPathParam("databaseTableAccessEntries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("scimQuery", request.getScimQuery())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DatabaseTableAccessEntryCollection.class,
                        ListDatabaseTableAccessEntriesResponse.Builder
                                ::databaseTableAccessEntryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseTableAccessEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDatabaseTableAccessEntriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListDatabaseTableAccessEntriesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseViewAccessEntriesResponse>
            listDatabaseViewAccessEntries(
                    ListDatabaseViewAccessEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseViewAccessEntriesRequest,
                                    ListDatabaseViewAccessEntriesResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyReportId(), "securityPolicyReportId must not be blank");

        return clientCall(request, ListDatabaseViewAccessEntriesResponse::builder)
                .logger(LOG, "listDatabaseViewAccessEntries")
                .serviceDetails(
                        "DataSafe",
                        "ListDatabaseViewAccessEntries",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseViewAccessEntryCollection/ListDatabaseViewAccessEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseViewAccessEntriesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyReports")
                .appendPathParam(request.getSecurityPolicyReportId())
                .appendPathParam("databaseViewAccessEntries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("scimQuery", request.getScimQuery())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.DatabaseViewAccessEntryCollection.class,
                        ListDatabaseViewAccessEntriesResponse.Builder
                                ::databaseViewAccessEntryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseViewAccessEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseViewAccessEntriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDatabaseViewAccessEntriesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDifferenceColumnsResponse> listDifferenceColumns(
            ListDifferenceColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDifferenceColumnsRequest, ListDifferenceColumnsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryAnalyticsResponse> listDiscoveryAnalytics(
            ListDiscoveryAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>
                    handler) {
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
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("sensitiveDataModelId", request.getSensitiveDataModelId())
                .appendQueryParam("sensitiveTypeId", request.getSensitiveTypeId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("isCommon", request.getIsCommon())
                .appendQueryParam("sensitiveTypeGroupId", request.getSensitiveTypeGroupId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryJobResultsResponse> listDiscoveryJobResults(
            ListDiscoveryJobResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>
                    handler) {

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
                .appendListQueryParam(
                        "confidenceLevel",
                        request.getConfidenceLevel(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryJobsResponse> listDiscoveryJobs(
            ListDiscoveryJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFindingAnalyticsResponse> listFindingAnalytics(
            ListFindingAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFindingAnalyticsRequest, ListFindingAnalyticsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFindingAnalyticsResponse::builder)
                .logger(LOG, "listFindingAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListFindingAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListFindingAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFindingAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam("findingAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("isTopFinding", request.getIsTopFinding())
                .appendEnumQueryParam("groupBy", request.getGroupBy())
                .appendEnumQueryParam("topFindingStatus", request.getTopFindingStatus())
                .appendEnumQueryParam("severity", request.getSeverity())
                .appendQueryParam("findingKey", request.getFindingKey())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendListQueryParam(
                        "containsReferences",
                        request.getContainsReferences(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "targetIds",
                        request.getTargetIds(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("category", request.getCategory())
                .appendListQueryParam(
                        "containsSeverity",
                        request.getContainsSeverity(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("scimQuery", request.getScimQuery())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.FindingAnalyticsCollection.class,
                        ListFindingAnalyticsResponse.Builder::findingAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFindingAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFindingAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListFindingAnalyticsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResponse> listFindings(
            ListFindingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFindingsRequest, ListFindingsResponse>
                    handler) {

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
                .appendQueryParam("isTopFinding", request.getIsTopFinding())
                .appendEnumQueryParam("severity", request.getSeverity())
                .appendListQueryParam(
                        "containsSeverity",
                        request.getContainsSeverity(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("category", request.getCategory())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("references", request.getReferences())
                .appendListQueryParam(
                        "containsReferences",
                        request.getContainsReferences(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("targetId", request.getTargetId())
                .appendListQueryParam(
                        "targetIds",
                        request.getTargetIds(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("scimQuery", request.getScimQuery())
                .appendListQueryParam(
                        "field",
                        request.getField(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsChangeAuditLogsResponse>
            listFindingsChangeAuditLogs(
                    ListFindingsChangeAuditLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListFindingsChangeAuditLogsRequest,
                                    ListFindingsChangeAuditLogsResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        return clientCall(request, ListFindingsChangeAuditLogsResponse::builder)
                .logger(LOG, "listFindingsChangeAuditLogs")
                .serviceDetails(
                        "DataSafe",
                        "ListFindingsChangeAuditLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListFindingsChangeAuditLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFindingsChangeAuditLogsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("findingsChangeAuditLogs")
                .appendEnumQueryParam("severity", request.getSeverity())
                .appendQueryParam("findingKey", request.getFindingKey())
                .appendQueryParam("findingTitle", request.getFindingTitle())
                .appendQueryParam("isRiskDeferred", request.getIsRiskDeferred())
                .appendQueryParam("modifiedBy", request.getModifiedBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam(
                        "timeValidUntilGreaterThanOrEqualTo",
                        request.getTimeValidUntilGreaterThanOrEqualTo())
                .appendQueryParam("timeValidUntilLessThan", request.getTimeValidUntilLessThan())
                .appendQueryParam(
                        "timeUpdatedGreaterThanOrEqualTo",
                        request.getTimeUpdatedGreaterThanOrEqualTo())
                .appendQueryParam("timeUpdatedLessThan", request.getTimeUpdatedLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.FindingsChangeAuditLogCollection.class,
                        ListFindingsChangeAuditLogsResponse.Builder
                                ::findingsChangeAuditLogCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFindingsChangeAuditLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFindingsChangeAuditLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListFindingsChangeAuditLogsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResponse> listGrants(
            ListGrantsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGrantsRequest, ListGrantsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGroupedSensitiveTypesResponse> listGroupedSensitiveTypes(
            ListGroupedSensitiveTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGroupedSensitiveTypesRequest, ListGroupedSensitiveTypesResponse>
                    handler) {

        Validate.notBlank(
                request.getSensitiveTypeGroupId(), "sensitiveTypeGroupId must not be blank");

        return clientCall(request, ListGroupedSensitiveTypesResponse::builder)
                .logger(LOG, "listGroupedSensitiveTypes")
                .serviceDetails(
                        "DataSafe",
                        "ListGroupedSensitiveTypes",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypeGroup/ListGroupedSensitiveTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGroupedSensitiveTypesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypeGroups")
                .appendPathParam(request.getSensitiveTypeGroupId())
                .appendPathParam("groupedSensitiveTypes")
                .appendQueryParam("sensitiveTypeId", request.getSensitiveTypeId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.GroupedSensitiveTypeCollection.class,
                        ListGroupedSensitiveTypesResponse.Builder::groupedSensitiveTypeCollection)
                .handleResponseHeaderString("etag", ListGroupedSensitiveTypesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListGroupedSensitiveTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGroupedSensitiveTypesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListGroupedSensitiveTypesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLibraryMaskingFormatsResponse> listLibraryMaskingFormats(
            ListLibraryMaskingFormatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskedColumnsResponse> listMaskedColumns(
            ListMaskedColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskedColumnsRequest, ListMaskedColumnsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskingAnalyticsResponse> listMaskingAnalytics(
            ListMaskingAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>
                    handler) {
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
                .appendQueryParam("sensitiveTypeId", request.getSensitiveTypeId())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskingColumnsResponse> listMaskingColumns(
            ListMaskingColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingColumnsRequest, ListMaskingColumnsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskingErrorsResponse> listMaskingErrors(
            ListMaskingErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingErrorsRequest, ListMaskingErrorsResponse>
                    handler) {

        Validate.notBlank(request.getMaskingReportId(), "maskingReportId must not be blank");

        return clientCall(request, ListMaskingErrorsResponse::builder)
                .logger(LOG, "listMaskingErrors")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskingErrors",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingErrorSummary/ListMaskingErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskingErrorsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingReports")
                .appendPathParam(request.getMaskingReportId())
                .appendPathParam("maskingErrors")
                .appendEnumQueryParam("stepName", request.getStepName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingErrorCollection.class,
                        ListMaskingErrorsResponse.Builder::maskingErrorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaskingErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaskingErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListMaskingErrorsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskingObjectsResponse> listMaskingObjects(
            ListMaskingObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingObjectsRequest, ListMaskingObjectsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskingPoliciesResponse> listMaskingPolicies(
            ListMaskingPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskingPolicyHealthReportLogsResponse>
            listMaskingPolicyHealthReportLogs(
                    ListMaskingPolicyHealthReportLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMaskingPolicyHealthReportLogsRequest,
                                    ListMaskingPolicyHealthReportLogsResponse>
                            handler) {

        Validate.notBlank(
                request.getMaskingPolicyHealthReportId(),
                "maskingPolicyHealthReportId must not be blank");

        return clientCall(request, ListMaskingPolicyHealthReportLogsResponse::builder)
                .logger(LOG, "listMaskingPolicyHealthReportLogs")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskingPolicyHealthReportLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/ListMaskingPolicyHealthReportLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskingPolicyHealthReportLogsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicyHealthReports")
                .appendPathParam(request.getMaskingPolicyHealthReportId())
                .appendPathParam("logs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("messageType", request.getMessageType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingPolicyHealthReportLogCollection.class,
                        ListMaskingPolicyHealthReportLogsResponse.Builder
                                ::maskingPolicyHealthReportLogCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMaskingPolicyHealthReportLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMaskingPolicyHealthReportLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListMaskingPolicyHealthReportLogsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskingPolicyHealthReportsResponse>
            listMaskingPolicyHealthReports(
                    ListMaskingPolicyHealthReportsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMaskingPolicyHealthReportsRequest,
                                    ListMaskingPolicyHealthReportsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaskingPolicyHealthReportsResponse::builder)
                .logger(LOG, "listMaskingPolicyHealthReports")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskingPolicyHealthReports",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/ListMaskingPolicyHealthReports")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskingPolicyHealthReportsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicyHealthReports")
                .appendQueryParam(
                        "maskingPolicyHealthReportId", request.getMaskingPolicyHealthReportId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("maskingPolicyId", request.getMaskingPolicyId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingPolicyHealthReportCollection.class,
                        ListMaskingPolicyHealthReportsResponse.Builder
                                ::maskingPolicyHealthReportCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMaskingPolicyHealthReportsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMaskingPolicyHealthReportsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListMaskingPolicyHealthReportsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskingPolicyReferentialRelationsResponse>
            listMaskingPolicyReferentialRelations(
                    ListMaskingPolicyReferentialRelationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMaskingPolicyReferentialRelationsRequest,
                                    ListMaskingPolicyReferentialRelationsResponse>
                            handler) {

        Validate.notBlank(request.getMaskingPolicyId(), "maskingPolicyId must not be blank");

        return clientCall(request, ListMaskingPolicyReferentialRelationsResponse::builder)
                .logger(LOG, "listMaskingPolicyReferentialRelations")
                .serviceDetails(
                        "DataSafe",
                        "ListMaskingPolicyReferentialRelations",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyReferentialRelationSummary/ListMaskingPolicyReferentialRelations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaskingPolicyReferentialRelationsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("maskingPolicies")
                .appendPathParam(request.getMaskingPolicyId())
                .appendPathParam("referentialRelations")
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
                        "relationType",
                        request.getRelationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.MaskingPolicyReferentialRelationCollection
                                .class,
                        ListMaskingPolicyReferentialRelationsResponse.Builder
                                ::maskingPolicyReferentialRelationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMaskingPolicyReferentialRelationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMaskingPolicyReferentialRelationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListMaskingPolicyReferentialRelationsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskingReportsResponse> listMaskingReports(
            ListMaskingReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingReportsRequest, ListMaskingReportsResponse>
                    handler) {
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
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaskingSchemasResponse> listMaskingSchemas(
            ListMaskingSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingSchemasRequest, ListMaskingSchemasResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOnPremConnectorsResponse> listOnPremConnectors(
            ListOnPremConnectorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>
                    handler) {
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
                        com.oracle.bmc.datasafe.model.OnPremConnectorSummary.class,
                        ListOnPremConnectorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListOnPremConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOnPremConnectorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPasswordExpiryDateAnalyticsResponse>
            listPasswordExpiryDateAnalytics(
                    ListPasswordExpiryDateAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPasswordExpiryDateAnalyticsRequest,
                                    ListPasswordExpiryDateAnalyticsResponse>
                            handler) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        return clientCall(request, ListPasswordExpiryDateAnalyticsResponse::builder)
                .logger(LOG, "listPasswordExpiryDateAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListPasswordExpiryDateAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListPasswordExpiryDateAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPasswordExpiryDateAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("passwordExpiryDateAnalytics")
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("userCategory", request.getUserCategory())
                .appendQueryParam(
                        "timePasswordExpiryLessThan", request.getTimePasswordExpiryLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.UserAggregation.class,
                        ListPasswordExpiryDateAnalyticsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListPasswordExpiryDateAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListPasswordExpiryDateAnalyticsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPeerTargetDatabasesResponse> listPeerTargetDatabases(
            ListPeerTargetDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPeerTargetDatabasesRequest, ListPeerTargetDatabasesResponse>
                    handler) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, ListPeerTargetDatabasesResponse::builder)
                .logger(LOG, "listPeerTargetDatabases")
                .serviceDetails(
                        "DataSafe",
                        "ListPeerTargetDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/PeerTargetDatabase/ListPeerTargetDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPeerTargetDatabasesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("peerTargetDatabases")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.datasafe.model.PeerTargetDatabaseCollection.class,
                        ListPeerTargetDatabasesResponse.Builder::peerTargetDatabaseCollection)
                .handleResponseHeaderString("etag", ListPeerTargetDatabasesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListPeerTargetDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPeerTargetDatabasesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPeerTargetDatabasesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProfileAnalyticsResponse> listProfileAnalytics(
            ListProfileAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProfileAnalyticsRequest, ListProfileAnalyticsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProfileSummariesResponse> listProfileSummaries(
            ListProfileSummariesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProfileSummariesRequest, ListProfileSummariesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListReferentialRelationsResponse> listReferentialRelations(
            ListReferentialRelationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReferentialRelationsRequest, ListReferentialRelationsResponse>
                    handler) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        return clientCall(request, ListReferentialRelationsResponse::builder)
                .logger(LOG, "listReferentialRelations")
                .serviceDetails(
                        "DataSafe",
                        "ListReferentialRelations",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReferentialRelation/ListReferentialRelations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReferentialRelationsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("referentialRelations")
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
                .appendQueryParam("isSensitive", request.getIsSensitive())
                .appendListQueryParam(
                        "relationType",
                        request.getRelationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.ReferentialRelationCollection.class,
                        ListReferentialRelationsResponse.Builder::referentialRelationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListReferentialRelationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReferentialRelationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListReferentialRelationsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListReportDefinitionsResponse> listReportDefinitions(
            ListReportDefinitionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReportDefinitionsRequest, ListReportDefinitionsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListReportsResponse> listReports(
            ListReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListReportsRequest, ListReportsResponse>
                    handler) {
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
                .appendEnumQueryParam("mimeType", request.getMimeType())
                .appendQueryParam("reportDefinitionId", request.getReportDefinitionId())
                .appendQueryParam(
                        "timeGeneratedGreaterThanOrEqualTo",
                        request.getTimeGeneratedGreaterThanOrEqualTo())
                .appendQueryParam("timeGeneratedLessThan", request.getTimeGeneratedLessThan())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("dataSource", request.getDataSource())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.ReportCollection.class,
                        ListReportsResponse.Builder::reportCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListReportsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReportsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRoleGrantPathsResponse> listRoleGrantPaths(
            ListRoleGrantPathsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRoleGrantPathsRequest, ListRoleGrantPathsResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityPolicyReportId(), "securityPolicyReportId must not be blank");
        Objects.requireNonNull(request.getGrantee(), "grantee is required");

        Objects.requireNonNull(request.getGrantedRole(), "grantedRole is required");

        return clientCall(request, ListRoleGrantPathsResponse::builder)
                .logger(LOG, "listRoleGrantPaths")
                .serviceDetails(
                        "DataSafe",
                        "ListRoleGrantPaths",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/RoleGrantPathCollection/ListRoleGrantPaths")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRoleGrantPathsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyReports")
                .appendPathParam(request.getSecurityPolicyReportId())
                .appendPathParam("roleGrantPaths")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("grantee", request.getGrantee())
                .appendQueryParam("grantedRole", request.getGrantedRole())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.RoleGrantPathCollection.class,
                        ListRoleGrantPathsResponse.Builder::roleGrantPathCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRoleGrantPathsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRoleGrantPathsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListRoleGrantPathsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRolesResponse> listRoles(
            ListRolesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResponse> listSchemas(
            ListSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSdmMaskingPolicyDifferencesResponse>
            listSdmMaskingPolicyDifferences(
                    ListSdmMaskingPolicyDifferencesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSdmMaskingPolicyDifferencesRequest,
                                    ListSdmMaskingPolicyDifferencesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityAssessmentsResponse> listSecurityAssessments(
            ListSecurityAssessmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>
                    handler) {
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
                .appendEnumQueryParam("targetType", request.getTargetType())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendQueryParam("templateAssessmentId", request.getTemplateAssessmentId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityFeatureAnalyticsResponse>
            listSecurityFeatureAnalytics(
                    ListSecurityFeatureAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityFeatureAnalyticsRequest,
                                    ListSecurityFeatureAnalyticsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecurityFeatureAnalyticsResponse::builder)
                .logger(LOG, "listSecurityFeatureAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListSecurityFeatureAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListSecurityFeatureAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityFeatureAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam("securityFeatureAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityFeatureAnalyticsCollection.class,
                        ListSecurityFeatureAnalyticsResponse.Builder
                                ::securityFeatureAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSecurityFeatureAnalyticsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityFeaturesResponse> listSecurityFeatures(
            ListSecurityFeaturesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityFeaturesRequest, ListSecurityFeaturesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecurityFeaturesResponse::builder)
                .logger(LOG, "listSecurityFeatures")
                .serviceDetails(
                        "DataSafe",
                        "ListSecurityFeatures",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListSecurityFeatures")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityFeaturesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam("securityFeatures")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam(
                        "targetsWithUnifiedAudit", request.getTargetsWithUnifiedAudit())
                .appendEnumQueryParam(
                        "targetsWithFineGrainedAudit", request.getTargetsWithFineGrainedAudit())
                .appendEnumQueryParam(
                        "targetsWithTraditionalAudit", request.getTargetsWithTraditionalAudit())
                .appendEnumQueryParam(
                        "targetsWithDatabaseVault", request.getTargetsWithDatabaseVault())
                .appendEnumQueryParam(
                        "targetsWithPrivilegeAnalysis", request.getTargetsWithPrivilegeAnalysis())
                .appendEnumQueryParam(
                        "targetsWithTablespaceEncryption",
                        request.getTargetsWithTablespaceEncryption())
                .appendEnumQueryParam(
                        "targetsWithColumnEncryption", request.getTargetsWithColumnEncryption())
                .appendEnumQueryParam(
                        "targetsWithNetworkEncryption", request.getTargetsWithNetworkEncryption())
                .appendEnumQueryParam(
                        "targetsWithPasswordAuthentication",
                        request.getTargetsWithPasswordAuthentication())
                .appendEnumQueryParam(
                        "targetsWithGlobalAuthentication",
                        request.getTargetsWithGlobalAuthentication())
                .appendEnumQueryParam(
                        "targetsWithExternalAuthentication",
                        request.getTargetsWithExternalAuthentication())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityFeatureCollection.class,
                        ListSecurityFeaturesResponse.Builder::securityFeatureCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityFeaturesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityFeaturesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSecurityFeaturesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPoliciesResponse> listSecurityPolicies(
            ListSecurityPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecurityPoliciesResponse::builder)
                .logger(LOG, "listSecurityPolicies")
                .serviceDetails(
                        "DataSafe",
                        "ListSecurityPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyCollection/ListSecurityPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityPoliciesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("securityPolicyType", request.getSecurityPolicyType())
                .appendQueryParam("securityPolicyId", request.getSecurityPolicyId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyCollection.class,
                        ListSecurityPoliciesResponse.Builder::securityPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSecurityPoliciesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPolicyConfigsResponse> listSecurityPolicyConfigs(
            ListSecurityPolicyConfigsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityPolicyConfigsRequest, ListSecurityPolicyConfigsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecurityPolicyConfigsResponse::builder)
                .logger(LOG, "listSecurityPolicyConfigs")
                .serviceDetails(
                        "DataSafe",
                        "ListSecurityPolicyConfigs",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyConfigCollection/ListSecurityPolicyConfigs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityPolicyConfigsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyConfigs")
                .appendQueryParam("securityPolicyConfigId", request.getSecurityPolicyConfigId())
                .appendQueryParam("securityPolicyId", request.getSecurityPolicyId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyConfigCollection.class,
                        ListSecurityPolicyConfigsResponse.Builder::securityPolicyConfigCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityPolicyConfigsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityPolicyConfigsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSecurityPolicyConfigsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPolicyDeploymentsResponse>
            listSecurityPolicyDeployments(
                    ListSecurityPolicyDeploymentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityPolicyDeploymentsRequest,
                                    ListSecurityPolicyDeploymentsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecurityPolicyDeploymentsResponse::builder)
                .logger(LOG, "listSecurityPolicyDeployments")
                .serviceDetails(
                        "DataSafe",
                        "ListSecurityPolicyDeployments",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeploymentCollection/ListSecurityPolicyDeployments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityPolicyDeploymentsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyDeployments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam(
                        "securityPolicyDeploymentId", request.getSecurityPolicyDeploymentId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("targetType", request.getTargetType())
                .appendQueryParam("securityPolicyId", request.getSecurityPolicyId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyDeploymentCollection.class,
                        ListSecurityPolicyDeploymentsResponse.Builder
                                ::securityPolicyDeploymentCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSecurityPolicyDeploymentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityPolicyDeploymentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSecurityPolicyDeploymentsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPolicyEntryStatesResponse>
            listSecurityPolicyEntryStates(
                    ListSecurityPolicyEntryStatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityPolicyEntryStatesRequest,
                                    ListSecurityPolicyEntryStatesResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyDeploymentId(),
                "securityPolicyDeploymentId must not be blank");

        return clientCall(request, ListSecurityPolicyEntryStatesResponse::builder)
                .logger(LOG, "listSecurityPolicyEntryStates")
                .serviceDetails(
                        "DataSafe",
                        "ListSecurityPolicyEntryStates",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyEntryStateCollection/ListSecurityPolicyEntryStates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityPolicyEntryStatesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyDeployments")
                .appendPathParam(request.getSecurityPolicyDeploymentId())
                .appendPathParam("securityPolicyEntryStates")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("deploymentStatus", request.getDeploymentStatus())
                .appendQueryParam("securityPolicyEntryId", request.getSecurityPolicyEntryId())
                .appendEnumQueryParam(
                        "securityPolicyEntryType", request.getSecurityPolicyEntryType())
                .appendQueryParam("targetId", request.getTargetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateCollection.class,
                        ListSecurityPolicyEntryStatesResponse.Builder
                                ::securityPolicyEntryStateCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSecurityPolicyEntryStatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityPolicyEntryStatesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSecurityPolicyEntryStatesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPolicyReportsResponse> listSecurityPolicyReports(
            ListSecurityPolicyReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityPolicyReportsRequest, ListSecurityPolicyReportsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecurityPolicyReportsResponse::builder)
                .logger(LOG, "listSecurityPolicyReports")
                .serviceDetails(
                        "DataSafe",
                        "ListSecurityPolicyReports",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyReportCollection/ListSecurityPolicyReports")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityPolicyReportsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyReports")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("securityPolicyReportId", request.getSecurityPolicyReportId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SecurityPolicyReportCollection.class,
                        ListSecurityPolicyReportsResponse.Builder::securityPolicyReportCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityPolicyReportsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityPolicyReportsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSecurityPolicyReportsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveColumnAnalyticsResponse>
            listSensitiveColumnAnalytics(
                    ListSensitiveColumnAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSensitiveColumnAnalyticsRequest,
                                    ListSensitiveColumnAnalyticsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSensitiveColumnAnalyticsResponse::builder)
                .logger(LOG, "listSensitiveColumnAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListSensitiveColumnAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ListSensitiveColumnAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSensitiveColumnAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveColumnAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendListQueryParam(
                        "sensitiveTypeId",
                        request.getSensitiveTypeId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("sensitiveTypeGroupId", request.getSensitiveTypeGroupId())
                .appendQueryParam("sensitiveDataModelId", request.getSensitiveDataModelId())
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
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
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveColumnAnalyticsCollection.class,
                        ListSensitiveColumnAnalyticsResponse.Builder
                                ::sensitiveColumnAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSensitiveColumnAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSensitiveColumnAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSensitiveColumnAnalyticsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveColumnsResponse> listSensitiveColumns(
            ListSensitiveColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>
                    handler) {

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
                .appendEnumQueryParam("columnDataCountFilter", request.getColumnDataCountFilter())
                .appendListQueryParam(
                        "confidenceLevel",
                        request.getConfidenceLevel(),
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveDataModelSensitiveTypesResponse>
            listSensitiveDataModelSensitiveTypes(
                    ListSensitiveDataModelSensitiveTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSensitiveDataModelSensitiveTypesRequest,
                                    ListSensitiveDataModelSensitiveTypesResponse>
                            handler) {

        Validate.notBlank(
                request.getSensitiveDataModelId(), "sensitiveDataModelId must not be blank");

        return clientCall(request, ListSensitiveDataModelSensitiveTypesResponse::builder)
                .logger(LOG, "listSensitiveDataModelSensitiveTypes")
                .serviceDetails(
                        "DataSafe",
                        "ListSensitiveDataModelSensitiveTypes",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModelSensitiveTypeCollection/ListSensitiveDataModelSensitiveTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSensitiveDataModelSensitiveTypesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveDataModels")
                .appendPathParam(request.getSensitiveDataModelId())
                .appendPathParam("sensitiveTypes")
                .appendQueryParam("sensitiveTypeId", request.getSensitiveTypeId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveDataModelSensitiveTypeCollection
                                .class,
                        ListSensitiveDataModelSensitiveTypesResponse.Builder
                                ::sensitiveDataModelSensitiveTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSensitiveDataModelSensitiveTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSensitiveDataModelSensitiveTypesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListSensitiveDataModelSensitiveTypesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveDataModelsResponse> listSensitiveDataModels(
            ListSensitiveDataModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveObjectsResponse> listSensitiveObjects(
            ListSensitiveObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveObjectsRequest, ListSensitiveObjectsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveSchemasResponse> listSensitiveSchemas(
            ListSensitiveSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveSchemasRequest, ListSensitiveSchemasResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveTypeGroupsResponse> listSensitiveTypeGroups(
            ListSensitiveTypeGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveTypeGroupsRequest, ListSensitiveTypeGroupsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSensitiveTypeGroupsResponse::builder)
                .logger(LOG, "listSensitiveTypeGroups")
                .serviceDetails(
                        "DataSafe",
                        "ListSensitiveTypeGroups",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypeGroupSummary/ListSensitiveTypeGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSensitiveTypeGroupsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypeGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("sensitiveTypeGroupId", request.getSensitiveTypeGroupId())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveTypeGroupCollection.class,
                        ListSensitiveTypeGroupsResponse.Builder::sensitiveTypeGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSensitiveTypeGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSensitiveTypeGroupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSensitiveTypeGroupsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveTypesResponse> listSensitiveTypes(
            ListSensitiveTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveTypesRequest, ListSensitiveTypesResponse>
                    handler) {
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
                .appendQueryParam("isCommon", request.getIsCommon())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveTypesExportsResponse> listSensitiveTypesExports(
            ListSensitiveTypesExportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveTypesExportsRequest, ListSensitiveTypesExportsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSensitiveTypesExportsResponse::builder)
                .logger(LOG, "listSensitiveTypesExports")
                .serviceDetails(
                        "DataSafe",
                        "ListSensitiveTypesExports",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypesExportCollection/ListSensitiveTypesExports")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSensitiveTypesExportsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypesExports")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("sensitiveTypesExportId", request.getSensitiveTypesExportId())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SensitiveTypesExportCollection.class,
                        ListSensitiveTypesExportsResponse.Builder::sensitiveTypesExportCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSensitiveTypesExportsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSensitiveTypesExportsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSensitiveTypesExportsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlCollectionAnalyticsResponse>
            listSqlCollectionAnalytics(
                    ListSqlCollectionAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlCollectionAnalyticsRequest,
                                    ListSqlCollectionAnalyticsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSqlCollectionAnalyticsResponse::builder)
                .logger(LOG, "listSqlCollectionAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListSqlCollectionAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollectionAnalyticsCollection/ListSqlCollectionAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlCollectionAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollectionAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeStarted", request.getTimeStarted())
                .appendQueryParam("timeEnded", request.getTimeEnded())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlCollectionAnalyticsCollection.class,
                        ListSqlCollectionAnalyticsResponse.Builder
                                ::sqlCollectionAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlCollectionAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlCollectionAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSqlCollectionAnalyticsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlCollectionLogInsightsResponse>
            listSqlCollectionLogInsights(
                    ListSqlCollectionLogInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlCollectionLogInsightsRequest,
                                    ListSqlCollectionLogInsightsResponse>
                            handler) {
        Objects.requireNonNull(request.getTimeStarted(), "timeStarted is required");

        Objects.requireNonNull(request.getTimeEnded(), "timeEnded is required");

        Validate.notBlank(request.getSqlCollectionId(), "sqlCollectionId must not be blank");

        return clientCall(request, ListSqlCollectionLogInsightsResponse::builder)
                .logger(LOG, "listSqlCollectionLogInsights")
                .serviceDetails(
                        "DataSafe",
                        "ListSqlCollectionLogInsights",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollectionLogInsightsCollection/ListSqlCollectionLogInsights")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlCollectionLogInsightsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendPathParam(request.getSqlCollectionId())
                .appendPathParam("logInsights")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("timeStarted", request.getTimeStarted())
                .appendQueryParam("timeEnded", request.getTimeEnded())
                .appendEnumQueryParam("groupBy", request.getGroupBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlCollectionLogInsightsCollection.class,
                        ListSqlCollectionLogInsightsResponse.Builder
                                ::sqlCollectionLogInsightsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSqlCollectionLogInsightsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlCollectionLogInsightsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSqlCollectionLogInsightsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlCollectionsResponse> listSqlCollections(
            ListSqlCollectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlCollectionsRequest, ListSqlCollectionsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSqlCollectionsResponse::builder)
                .logger(LOG, "listSqlCollections")
                .serviceDetails(
                        "DataSafe",
                        "ListSqlCollections",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollectionCollection/ListSqlCollections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlCollectionsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("sqlCollectionId", request.getSqlCollectionId())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendQueryParam("dbUserName", request.getDbUserName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlCollectionCollection.class,
                        ListSqlCollectionsResponse.Builder::sqlCollectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlCollectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlCollectionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSqlCollectionsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallAllowedSqlAnalyticsResponse>
            listSqlFirewallAllowedSqlAnalytics(
                    ListSqlFirewallAllowedSqlAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlFirewallAllowedSqlAnalyticsRequest,
                                    ListSqlFirewallAllowedSqlAnalyticsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSqlFirewallAllowedSqlAnalyticsResponse::builder)
                .logger(LOG, "listSqlFirewallAllowedSqlAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListSqlFirewallAllowedSqlAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallAllowedSqlAnalyticsCollection/ListSqlFirewallAllowedSqlAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlFirewallAllowedSqlAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallAllowedSqlAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("scimQuery", request.getScimQuery())
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlAnalyticsCollection
                                .class,
                        ListSqlFirewallAllowedSqlAnalyticsResponse.Builder
                                ::sqlFirewallAllowedSqlAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSqlFirewallAllowedSqlAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSqlFirewallAllowedSqlAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListSqlFirewallAllowedSqlAnalyticsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallAllowedSqlsResponse>
            listSqlFirewallAllowedSqls(
                    ListSqlFirewallAllowedSqlsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlFirewallAllowedSqlsRequest,
                                    ListSqlFirewallAllowedSqlsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSqlFirewallAllowedSqlsResponse::builder)
                .logger(LOG, "listSqlFirewallAllowedSqls")
                .serviceDetails(
                        "DataSafe",
                        "ListSqlFirewallAllowedSqls",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallAllowedSqlCollection/ListSqlFirewallAllowedSqls")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlFirewallAllowedSqlsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallAllowedSqls")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("scimQuery", request.getScimQuery())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlCollection.class,
                        ListSqlFirewallAllowedSqlsResponse.Builder::sqlFirewallAllowedSqlCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlFirewallAllowedSqlsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlFirewallAllowedSqlsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSqlFirewallAllowedSqlsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallPoliciesResponse> listSqlFirewallPolicies(
            ListSqlFirewallPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlFirewallPoliciesRequest, ListSqlFirewallPoliciesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSqlFirewallPoliciesResponse::builder)
                .logger(LOG, "listSqlFirewallPolicies")
                .serviceDetails(
                        "DataSafe",
                        "ListSqlFirewallPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicyCollection/ListSqlFirewallPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlFirewallPoliciesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("securityPolicyId", request.getSecurityPolicyId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("sqlFirewallPolicyId", request.getSqlFirewallPolicyId())
                .appendQueryParam("dbUserName", request.getDbUserName())
                .appendEnumQueryParam("violationAction", request.getViolationAction())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlFirewallPolicyCollection.class,
                        ListSqlFirewallPoliciesResponse.Builder::sqlFirewallPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlFirewallPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlFirewallPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSqlFirewallPoliciesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallPolicyAnalyticsResponse>
            listSqlFirewallPolicyAnalytics(
                    ListSqlFirewallPolicyAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlFirewallPolicyAnalyticsRequest,
                                    ListSqlFirewallPolicyAnalyticsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSqlFirewallPolicyAnalyticsResponse::builder)
                .logger(LOG, "listSqlFirewallPolicyAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListSqlFirewallPolicyAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicyAnalyticsCollection/ListSqlFirewallPolicyAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlFirewallPolicyAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallPolicyAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("securityPolicyId", request.getSecurityPolicyId())
                .appendQueryParam("timeStarted", request.getTimeStarted())
                .appendQueryParam("timeEnded", request.getTimeEnded())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlFirewallPolicyAnalyticsCollection.class,
                        ListSqlFirewallPolicyAnalyticsResponse.Builder
                                ::sqlFirewallPolicyAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSqlFirewallPolicyAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSqlFirewallPolicyAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListSqlFirewallPolicyAnalyticsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallViolationAnalyticsResponse>
            listSqlFirewallViolationAnalytics(
                    ListSqlFirewallViolationAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlFirewallViolationAnalyticsRequest,
                                    ListSqlFirewallViolationAnalyticsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSqlFirewallViolationAnalyticsResponse::builder)
                .logger(LOG, "listSqlFirewallViolationAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListSqlFirewallViolationAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallViolationSummary/ListSqlFirewallViolationAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlFirewallViolationAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallViolationAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("timeStarted", request.getTimeStarted())
                .appendQueryParam("timeEnded", request.getTimeEnded())
                .appendQueryParam("queryTimeZone", request.getQueryTimeZone())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
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
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlFirewallViolationAnalyticsCollection.class,
                        ListSqlFirewallViolationAnalyticsResponse.Builder
                                ::sqlFirewallViolationAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSqlFirewallViolationAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSqlFirewallViolationAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListSqlFirewallViolationAnalyticsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallViolationsResponse> listSqlFirewallViolations(
            ListSqlFirewallViolationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlFirewallViolationsRequest, ListSqlFirewallViolationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSqlFirewallViolationsResponse::builder)
                .logger(LOG, "listSqlFirewallViolations")
                .serviceDetails(
                        "DataSafe",
                        "ListSqlFirewallViolations",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallViolationSummary/ListSqlFirewallViolations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlFirewallViolationsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallViolations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("scimQuery", request.getScimQuery())
                .accept("application/json, application/xml")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.SqlFirewallViolationsCollection.class,
                        ListSqlFirewallViolationsResponse.Builder::sqlFirewallViolationsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlFirewallViolationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlFirewallViolationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSqlFirewallViolationsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTablesResponse> listTables(
            ListTablesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTablesRequest, ListTablesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTargetAlertPolicyAssociationsResponse>
            listTargetAlertPolicyAssociations(
                    ListTargetAlertPolicyAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetAlertPolicyAssociationsRequest,
                                    ListTargetAlertPolicyAssociationsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTargetDatabaseGroupsResponse> listTargetDatabaseGroups(
            ListTargetDatabaseGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTargetDatabaseGroupsRequest, ListTargetDatabaseGroupsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTargetDatabaseGroupsResponse::builder)
                .logger(LOG, "listTargetDatabaseGroups")
                .serviceDetails(
                        "DataSafe",
                        "ListTargetDatabaseGroups",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseGroupSummary/ListTargetDatabaseGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetDatabaseGroupsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabaseGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("filter", request.getFilter())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.TargetDatabaseGroupCollection.class,
                        ListTargetDatabaseGroupsResponse.Builder::targetDatabaseGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTargetDatabaseGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTargetDatabaseGroupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTargetDatabaseGroupsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTargetDatabasesResponse> listTargetDatabases(
            ListTargetDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTargetDatabasesRequest, ListTargetDatabasesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTargetOverridesResponse> listTargetOverrides(
            ListTargetOverridesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTargetOverridesRequest, ListTargetOverridesResponse>
                    handler) {

        Validate.notBlank(request.getAuditProfileId(), "auditProfileId must not be blank");

        return clientCall(request, ListTargetOverridesResponse::builder)
                .logger(LOG, "listTargetOverrides")
                .serviceDetails(
                        "DataSafe",
                        "ListTargetOverrides",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListTargetOverrides")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetOverridesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("auditProfiles")
                .appendPathParam(request.getAuditProfileId())
                .appendPathParam("targetOverrides")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.TargetOverrideCollection.class,
                        ListTargetOverridesResponse.Builder::targetOverrideCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTargetOverridesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTargetOverridesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTargetOverridesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateAnalyticsResponse> listTemplateAnalytics(
            ListTemplateAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTemplateAnalyticsRequest, ListTemplateAnalyticsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTemplateAnalyticsResponse::builder)
                .logger(LOG, "listTemplateAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListTemplateAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListTemplateAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTemplateAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam("templateAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("templateAssessmentId", request.getTemplateAssessmentId())
                .appendQueryParam(
                        "templateBaselineAssessmentId", request.getTemplateBaselineAssessmentId())
                .appendQueryParam("isGroup", request.getIsGroup())
                .appendQueryParam("isCompared", request.getIsCompared())
                .appendQueryParam("isCompliant", request.getIsCompliant())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.TemplateAnalyticsCollection.class,
                        ListTemplateAnalyticsResponse.Builder::templateAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTemplateAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTemplateAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTemplateAnalyticsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateAssociationAnalyticsResponse>
            listTemplateAssociationAnalytics(
                    ListTemplateAssociationAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTemplateAssociationAnalyticsRequest,
                                    ListTemplateAssociationAnalyticsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTemplateAssociationAnalyticsResponse::builder)
                .logger(LOG, "listTemplateAssociationAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListTemplateAssociationAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListTemplateAssociationAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTemplateAssociationAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam("templateAssociationAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("templateAssessmentId", request.getTemplateAssessmentId())
                .appendQueryParam(
                        "templateBaselineAssessmentId", request.getTemplateBaselineAssessmentId())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.TemplateAssociationAnalyticsCollection.class,
                        ListTemplateAssociationAnalyticsResponse.Builder
                                ::templateAssociationAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListTemplateAssociationAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListTemplateAssociationAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListTemplateAssociationAnalyticsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUnifiedAuditPoliciesResponse> listUnifiedAuditPolicies(
            ListUnifiedAuditPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUnifiedAuditPoliciesRequest, ListUnifiedAuditPoliciesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListUnifiedAuditPoliciesResponse::builder)
                .logger(LOG, "listUnifiedAuditPolicies")
                .serviceDetails(
                        "DataSafe",
                        "ListUnifiedAuditPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicyCollection/ListUnifiedAuditPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUnifiedAuditPoliciesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicies")
                .appendQueryParam("securityPolicyId", request.getSecurityPolicyId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("isSeeded", request.getIsSeeded())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam(
                        "unifiedAuditPolicyDefinitionId",
                        request.getUnifiedAuditPolicyDefinitionId())
                .appendQueryParam("unifiedAuditPolicyId", request.getUnifiedAuditPolicyId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.UnifiedAuditPolicyCollection.class,
                        ListUnifiedAuditPoliciesResponse.Builder::unifiedAuditPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListUnifiedAuditPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUnifiedAuditPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListUnifiedAuditPoliciesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUnifiedAuditPolicyDefinitionsResponse>
            listUnifiedAuditPolicyDefinitions(
                    ListUnifiedAuditPolicyDefinitionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListUnifiedAuditPolicyDefinitionsRequest,
                                    ListUnifiedAuditPolicyDefinitionsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListUnifiedAuditPolicyDefinitionsResponse::builder)
                .logger(LOG, "listUnifiedAuditPolicyDefinitions")
                .serviceDetails(
                        "DataSafe",
                        "ListUnifiedAuditPolicyDefinitions",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicyDefinitionCollection/ListUnifiedAuditPolicyDefinitions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUnifiedAuditPolicyDefinitionsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicyDefinitions")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam(
                        "unifiedAuditPolicyDefinitionId",
                        request.getUnifiedAuditPolicyDefinitionId())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("isSeeded", request.getIsSeeded())
                .appendEnumQueryParam(
                        "unifiedAuditPolicyCategory", request.getUnifiedAuditPolicyCategory())
                .appendQueryParam("unifiedAuditPolicyName", request.getUnifiedAuditPolicyName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.UnifiedAuditPolicyDefinitionCollection.class,
                        ListUnifiedAuditPolicyDefinitionsResponse.Builder
                                ::unifiedAuditPolicyDefinitionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListUnifiedAuditPolicyDefinitionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListUnifiedAuditPolicyDefinitionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListUnifiedAuditPolicyDefinitionsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUserAccessAnalyticsResponse> listUserAccessAnalytics(
            ListUserAccessAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserAccessAnalyticsRequest, ListUserAccessAnalyticsResponse>
                    handler) {

        Validate.notBlank(request.getUserAssessmentId(), "userAssessmentId must not be blank");

        return clientCall(request, ListUserAccessAnalyticsResponse::builder)
                .logger(LOG, "listUserAccessAnalytics")
                .serviceDetails(
                        "DataSafe",
                        "ListUserAccessAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListUserAccessAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUserAccessAnalyticsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("userAssessments")
                .appendPathParam(request.getUserAssessmentId())
                .appendPathParam("userAccessAnalytics")
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datasafe.model.UserAccessAnalyticsCollection.class,
                        ListUserAccessAnalyticsResponse.Builder::userAccessAnalyticsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListUserAccessAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUserAccessAnalyticsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListUserAccessAnalyticsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUserAnalyticsResponse> listUserAnalytics(
            ListUserAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserAnalyticsRequest, ListUserAnalyticsResponse>
                    handler) {

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
                .appendQueryParam(
                        "timePasswordExpiryGreaterThanOrEqualTo",
                        request.getTimePasswordExpiryGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timePasswordExpiryLessThan", request.getTimePasswordExpiryLessThan())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUserAssessmentsResponse> listUserAssessments(
            ListUserAssessmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserAssessmentsRequest, ListUserAssessmentsResponse>
                    handler) {
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
                .appendEnumQueryParam("targetType", request.getTargetType())
                .appendQueryParam("targetDatabaseGroupId", request.getTargetDatabaseGroupId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>
                    handler) {

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
                .appendQueryParam(
                        "timePasswordExpiryGreaterThanOrEqualTo",
                        request.getTimePasswordExpiryGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timePasswordExpiryLessThan", request.getTimePasswordExpiryLessThan())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "schemaList",
                        request.getSchemaList(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("areAllSchemasAccessible", request.getAreAllSchemasAccessible())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.UserSummary.class,
                        ListUsersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListUsersResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", ListUsersResponse.Builder::opcPrevPage)
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
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datasafe.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<MaskDataResponse> maskData(
            MaskDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<MaskDataRequest, MaskDataResponse>
                    handler) {

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
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", MaskDataResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", MaskDataResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ModifyGlobalSettingsResponse> modifyGlobalSettings(
            ModifyGlobalSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ModifyGlobalSettingsRequest, ModifyGlobalSettingsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchAlertsResponse> patchAlerts(
            PatchAlertsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchAlertsRequest, PatchAlertsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchChecksResponse> patchChecks(
            PatchChecksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchChecksRequest, PatchChecksResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");
        Objects.requireNonNull(request.getPatchChecksDetails(), "patchChecksDetails is required");

        return clientCall(request, PatchChecksResponse::builder)
                .logger(LOG, "patchChecks")
                .serviceDetails(
                        "DataSafe",
                        "PatchChecks",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/PatchChecks")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchChecksRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("checks")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PatchChecksResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchChecksResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchDiscoveryJobResultsResponse> patchDiscoveryJobResults(
            PatchDiscoveryJobResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchDiscoveryJobResultsRequest, PatchDiscoveryJobResultsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchFindingsResponse> patchFindings(
            PatchFindingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchFindingsRequest, PatchFindingsResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");
        Objects.requireNonNull(
                request.getPatchFindingsDetails(), "patchFindingsDetails is required");

        return clientCall(request, PatchFindingsResponse::builder)
                .logger(LOG, "patchFindings")
                .serviceDetails(
                        "DataSafe",
                        "PatchFindings",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/PatchFindings")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchFindingsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("findings")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PatchFindingsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchFindingsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchGroupedSensitiveTypesResponse>
            patchGroupedSensitiveTypes(
                    PatchGroupedSensitiveTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchGroupedSensitiveTypesRequest,
                                    PatchGroupedSensitiveTypesResponse>
                            handler) {

        Validate.notBlank(
                request.getSensitiveTypeGroupId(), "sensitiveTypeGroupId must not be blank");
        Objects.requireNonNull(
                request.getPatchGroupedSensitiveTypesDetails(),
                "patchGroupedSensitiveTypesDetails is required");

        return clientCall(request, PatchGroupedSensitiveTypesResponse::builder)
                .logger(LOG, "patchGroupedSensitiveTypes")
                .serviceDetails(
                        "DataSafe",
                        "PatchGroupedSensitiveTypes",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypeGroup/PatchGroupedSensitiveTypes")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchGroupedSensitiveTypesRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypeGroups")
                .appendPathParam(request.getSensitiveTypeGroupId())
                .appendPathParam("groupedSensitiveTypes")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchGroupedSensitiveTypesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchGroupedSensitiveTypesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchMaskingColumnsResponse> patchMaskingColumns(
            PatchMaskingColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMaskingColumnsRequest, PatchMaskingColumnsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchSdmMaskingPolicyDifferenceColumnsResponse>
            patchSdmMaskingPolicyDifferenceColumns(
                    PatchSdmMaskingPolicyDifferenceColumnsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchSdmMaskingPolicyDifferenceColumnsRequest,
                                    PatchSdmMaskingPolicyDifferenceColumnsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchSensitiveColumnsResponse> patchSensitiveColumns(
            PatchSensitiveColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchSensitiveColumnsRequest, PatchSensitiveColumnsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchSqlFirewallAllowedSqlResponse>
            patchSqlFirewallAllowedSql(
                    PatchSqlFirewallAllowedSqlRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchSqlFirewallAllowedSqlRequest,
                                    PatchSqlFirewallAllowedSqlResponse>
                            handler) {
        Objects.requireNonNull(
                request.getPatchSqlFirewallAllowedSqlDetails(),
                "patchSqlFirewallAllowedSqlDetails is required");

        return clientCall(request, PatchSqlFirewallAllowedSqlResponse::builder)
                .logger(LOG, "patchSqlFirewallAllowedSql")
                .serviceDetails(
                        "DataSafe",
                        "PatchSqlFirewallAllowedSql",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallAllowedSql/PatchSqlFirewallAllowedSql")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSqlFirewallAllowedSqlRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallAllowedSqls")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchSqlFirewallAllowedSqlResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchSqlFirewallAllowedSqlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchTargetAlertPolicyAssociationResponse>
            patchTargetAlertPolicyAssociation(
                    PatchTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchTargetAlertPolicyAssociationRequest,
                                    PatchTargetAlertPolicyAssociationResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ProvisionAuditPolicyResponse> provisionAuditPolicy(
            ProvisionAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ProvisionAuditPolicyRequest, ProvisionAuditPolicyResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PurgeSqlCollectionLogsResponse> purgeSqlCollectionLogs(
            PurgeSqlCollectionLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PurgeSqlCollectionLogsRequest, PurgeSqlCollectionLogsResponse>
                    handler) {

        Validate.notBlank(request.getSqlCollectionId(), "sqlCollectionId must not be blank");

        return clientCall(request, PurgeSqlCollectionLogsResponse::builder)
                .logger(LOG, "purgeSqlCollectionLogs")
                .serviceDetails(
                        "DataSafe",
                        "PurgeSqlCollectionLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/PurgeSqlCollectionLogs")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PurgeSqlCollectionLogsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendPathParam(request.getSqlCollectionId())
                .appendPathParam("actions")
                .appendPathParam("purgeLogs")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PurgeSqlCollectionLogsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PurgeSqlCollectionLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshDatabaseSecurityConfigurationResponse>
            refreshDatabaseSecurityConfiguration(
                    RefreshDatabaseSecurityConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshDatabaseSecurityConfigurationRequest,
                                    RefreshDatabaseSecurityConfigurationResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseSecurityConfigId(),
                "databaseSecurityConfigId must not be blank");

        return clientCall(request, RefreshDatabaseSecurityConfigurationResponse::builder)
                .logger(LOG, "refreshDatabaseSecurityConfiguration")
                .serviceDetails(
                        "DataSafe",
                        "RefreshDatabaseSecurityConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseSecurityConfig/RefreshDatabaseSecurityConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshDatabaseSecurityConfigurationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("databaseSecurityConfigs")
                .appendPathParam(request.getDatabaseSecurityConfigId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshDatabaseSecurityConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshDatabaseSecurityConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshSecurityAssessmentResponse> refreshSecurityAssessment(
            RefreshSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshSecurityAssessmentRequest, RefreshSecurityAssessmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshSecurityPolicyDeploymentResponse>
            refreshSecurityPolicyDeployment(
                    RefreshSecurityPolicyDeploymentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshSecurityPolicyDeploymentRequest,
                                    RefreshSecurityPolicyDeploymentResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyDeploymentId(),
                "securityPolicyDeploymentId must not be blank");

        return clientCall(request, RefreshSecurityPolicyDeploymentResponse::builder)
                .logger(LOG, "refreshSecurityPolicyDeployment")
                .serviceDetails(
                        "DataSafe",
                        "RefreshSecurityPolicyDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeployment/RefreshSecurityPolicyDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshSecurityPolicyDeploymentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyDeployments")
                .appendPathParam(request.getSecurityPolicyDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshSecurityPolicyDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshSecurityPolicyDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshSqlCollectionLogInsightsResponse>
            refreshSqlCollectionLogInsights(
                    RefreshSqlCollectionLogInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshSqlCollectionLogInsightsRequest,
                                    RefreshSqlCollectionLogInsightsResponse>
                            handler) {

        Validate.notBlank(request.getSqlCollectionId(), "sqlCollectionId must not be blank");

        return clientCall(request, RefreshSqlCollectionLogInsightsResponse::builder)
                .logger(LOG, "refreshSqlCollectionLogInsights")
                .serviceDetails(
                        "DataSafe",
                        "RefreshSqlCollectionLogInsights",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/RefreshSqlCollectionLogInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshSqlCollectionLogInsightsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendPathParam(request.getSqlCollectionId())
                .appendPathParam("actions")
                .appendPathParam("refreshLogInsights")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshSqlCollectionLogInsightsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshSqlCollectionLogInsightsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshTargetDatabaseResponse> refreshTargetDatabase(
            RefreshTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshTargetDatabaseRequest, RefreshTargetDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        return clientCall(request, RefreshTargetDatabaseResponse::builder)
                .logger(LOG, "refreshTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "RefreshTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/RefreshTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshTargetDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RefreshTargetDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshUserAssessmentResponse> refreshUserAssessment(
            RefreshUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshUserAssessmentRequest, RefreshUserAssessmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveScheduleReportResponse> removeScheduleReport(
            RemoveScheduleReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveScheduleReportRequest, RemoveScheduleReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveSecurityAssessmentTemplateResponse>
            removeSecurityAssessmentTemplate(
                    RemoveSecurityAssessmentTemplateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveSecurityAssessmentTemplateRequest,
                                    RemoveSecurityAssessmentTemplateResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        return clientCall(request, RemoveSecurityAssessmentTemplateResponse::builder)
                .logger(LOG, "removeSecurityAssessmentTemplate")
                .serviceDetails(
                        "DataSafe",
                        "RemoveSecurityAssessmentTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/RemoveSecurityAssessmentTemplate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveSecurityAssessmentTemplateRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("actions")
                .appendPathParam("removeTemplate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveSecurityAssessmentTemplateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveSecurityAssessmentTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResumeAuditTrailResponse> resumeAuditTrail(
            ResumeAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeAuditTrailRequest, ResumeAuditTrailResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResumeWorkRequestResponse> resumeWorkRequest(
            ResumeWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeWorkRequestRequest, ResumeWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetrieveAuditPoliciesResponse> retrieveAuditPolicies(
            RetrieveAuditPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetrieveAuditPoliciesRequest, RetrieveAuditPoliciesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleReportResponse> scheduleReport(
            ScheduleReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ScheduleReportRequest, ScheduleReportResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SetSecurityAssessmentBaselineResponse>
            setSecurityAssessmentBaseline(
                    SetSecurityAssessmentBaselineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SetSecurityAssessmentBaselineRequest,
                                    SetSecurityAssessmentBaselineResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SetUserAssessmentBaselineResponse> setUserAssessmentBaseline(
            SetUserAssessmentBaselineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SetUserAssessmentBaselineRequest, SetUserAssessmentBaselineResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartAuditTrailResponse> startAuditTrail(
            StartAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartAuditTrailRequest, StartAuditTrailResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartSqlCollectionResponse> startSqlCollection(
            StartSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartSqlCollectionRequest, StartSqlCollectionResponse>
                    handler) {

        Validate.notBlank(request.getSqlCollectionId(), "sqlCollectionId must not be blank");

        return clientCall(request, StartSqlCollectionResponse::builder)
                .logger(LOG, "startSqlCollection")
                .serviceDetails(
                        "DataSafe",
                        "StartSqlCollection",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/sqlCollection/StartSqlCollection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartSqlCollectionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendPathParam(request.getSqlCollectionId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", StartSqlCollectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartSqlCollectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopAuditTrailResponse> stopAuditTrail(
            StopAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopAuditTrailRequest, StopAuditTrailResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopSqlCollectionResponse> stopSqlCollection(
            StopSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopSqlCollectionRequest, StopSqlCollectionResponse>
                    handler) {

        Validate.notBlank(request.getSqlCollectionId(), "sqlCollectionId must not be blank");

        return clientCall(request, StopSqlCollectionResponse::builder)
                .logger(LOG, "stopSqlCollection")
                .serviceDetails(
                        "DataSafe",
                        "StopSqlCollection",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/StopSqlCollection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopSqlCollectionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendPathParam(request.getSqlCollectionId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", StopSqlCollectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopSqlCollectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SuspendWorkRequestResponse> suspendWorkRequest(
            SuspendWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SuspendWorkRequestRequest, SuspendWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UnsetSecurityAssessmentBaselineResponse>
            unsetSecurityAssessmentBaseline(
                    UnsetSecurityAssessmentBaselineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UnsetSecurityAssessmentBaselineRequest,
                                    UnsetSecurityAssessmentBaselineResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UnsetSecurityAssessmentBaselineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UnsetSecurityAssessmentBaselineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UnsetUserAssessmentBaselineResponse>
            unsetUserAssessmentBaseline(
                    UnsetUserAssessmentBaselineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UnsetUserAssessmentBaselineRequest,
                                    UnsetUserAssessmentBaselineResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UnsetUserAssessmentBaselineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UnsetUserAssessmentBaselineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAlertResponse> updateAlert(
            UpdateAlertRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateAlertRequest, UpdateAlertResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAlertPolicyResponse> updateAlertPolicy(
            UpdateAlertPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAlertPolicyRequest, UpdateAlertPolicyResponse>
                    handler) {

        Validate.notBlank(request.getAlertPolicyId(), "alertPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAlertPolicyDetails(), "updateAlertPolicyDetails is required");

        return clientCall(request, UpdateAlertPolicyResponse::builder)
                .logger(LOG, "updateAlertPolicy")
                .serviceDetails(
                        "DataSafe",
                        "UpdateAlertPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/UpdateAlertPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAlertPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .appendPathParam(request.getAlertPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAlertPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAlertPolicyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAlertPolicyRuleResponse> updateAlertPolicyRule(
            UpdateAlertPolicyRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAlertPolicyRuleRequest, UpdateAlertPolicyRuleResponse>
                    handler) {

        Validate.notBlank(request.getAlertPolicyId(), "alertPolicyId must not be blank");

        Validate.notBlank(request.getRuleKey(), "ruleKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateAlertPolicyRuleDetails(),
                "updateAlertPolicyRuleDetails is required");

        return clientCall(request, UpdateAlertPolicyRuleResponse::builder)
                .logger(LOG, "updateAlertPolicyRule")
                .serviceDetails(
                        "DataSafe",
                        "UpdateAlertPolicyRule",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicyRule/UpdateAlertPolicyRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAlertPolicyRuleRequest::builder)
                .basePath("/20181201")
                .appendPathParam("alertPolicies")
                .appendPathParam(request.getAlertPolicyId())
                .appendPathParam("rules")
                .appendPathParam(request.getRuleKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAlertPolicyRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAlertPolicyRuleResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAttributeSetResponse> updateAttributeSet(
            UpdateAttributeSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAttributeSetRequest, UpdateAttributeSetResponse>
                    handler) {

        Validate.notBlank(request.getAttributeSetId(), "attributeSetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAttributeSetDetails(), "updateAttributeSetDetails is required");

        return clientCall(request, UpdateAttributeSetResponse::builder)
                .logger(LOG, "updateAttributeSet")
                .serviceDetails(
                        "DataSafe",
                        "UpdateAttributeSet",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AttributeSet/UpdateAttributeSet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAttributeSetRequest::builder)
                .basePath("/20181201")
                .appendPathParam("attributeSets")
                .appendPathParam(request.getAttributeSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAttributeSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAttributeSetResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditArchiveRetrievalResponse>
            updateAuditArchiveRetrieval(
                    UpdateAuditArchiveRetrievalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAuditArchiveRetrievalRequest,
                                    UpdateAuditArchiveRetrievalResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditPolicyResponse> updateAuditPolicy(
            UpdateAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditPolicyRequest, UpdateAuditPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditProfileResponse> updateAuditProfile(
            UpdateAuditProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditProfileRequest, UpdateAuditProfileResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditTrailResponse> updateAuditTrail(
            UpdateAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditTrailRequest, UpdateAuditTrailResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSafePrivateEndpointResponse>
            updateDataSafePrivateEndpoint(
                    UpdateDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDataSafePrivateEndpointRequest,
                                    UpdateDataSafePrivateEndpointResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseSecurityConfigResponse>
            updateDatabaseSecurityConfig(
                    UpdateDatabaseSecurityConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseSecurityConfigRequest,
                                    UpdateDatabaseSecurityConfigResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseSecurityConfigId(),
                "databaseSecurityConfigId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseSecurityConfigDetails(),
                "updateDatabaseSecurityConfigDetails is required");

        return clientCall(request, UpdateDatabaseSecurityConfigResponse::builder)
                .logger(LOG, "updateDatabaseSecurityConfig")
                .serviceDetails(
                        "DataSafe",
                        "UpdateDatabaseSecurityConfig",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseSecurityConfig/UpdateDatabaseSecurityConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseSecurityConfigRequest::builder)
                .basePath("/20181201")
                .appendPathParam("databaseSecurityConfigs")
                .appendPathParam(request.getDatabaseSecurityConfigId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDatabaseSecurityConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDatabaseSecurityConfigResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingResponse> updateFinding(
            UpdateFindingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateFindingRequest, UpdateFindingResponse>
                    handler) {

        Validate.notBlank(
                request.getSecurityAssessmentId(), "securityAssessmentId must not be blank");

        Validate.notBlank(request.getFindingKey(), "findingKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateFindingDetails(), "updateFindingDetails is required");

        return clientCall(request, UpdateFindingResponse::builder)
                .logger(LOG, "updateFinding")
                .serviceDetails(
                        "DataSafe",
                        "UpdateFinding",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Finding/UpdateFinding")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFindingRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityAssessments")
                .appendPathParam(request.getSecurityAssessmentId())
                .appendPathParam("findings")
                .appendPathParam(request.getFindingKey())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateFindingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFindingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLibraryMaskingFormatResponse>
            updateLibraryMaskingFormat(
                    UpdateLibraryMaskingFormatRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLibraryMaskingFormatRequest,
                                    UpdateLibraryMaskingFormatResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaskingColumnResponse> updateMaskingColumn(
            UpdateMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaskingColumnRequest, UpdateMaskingColumnResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaskingPolicyResponse> updateMaskingPolicy(
            UpdateMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaskingPolicyRequest, UpdateMaskingPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOnPremConnectorResponse> updateOnPremConnector(
            UpdateOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOnPremConnectorRequest, UpdateOnPremConnectorResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOnPremConnectorWalletResponse>
            updateOnPremConnectorWallet(
                    UpdateOnPremConnectorWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOnPremConnectorWalletRequest,
                                    UpdateOnPremConnectorWalletResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePeerTargetDatabaseResponse> updatePeerTargetDatabase(
            UpdatePeerTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePeerTargetDatabaseRequest, UpdatePeerTargetDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getTargetDatabaseId(), "targetDatabaseId must not be blank");

        Objects.requireNonNull(
                request.getUpdatePeerTargetDatabaseDetails(),
                "updatePeerTargetDatabaseDetails is required");

        return clientCall(request, UpdatePeerTargetDatabaseResponse::builder)
                .logger(LOG, "updatePeerTargetDatabase")
                .serviceDetails(
                        "DataSafe",
                        "UpdatePeerTargetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/PeerTargetDatabase/UpdatePeerTargetDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePeerTargetDatabaseRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabases")
                .appendPathParam(request.getTargetDatabaseId())
                .appendPathParam("peerTargetDatabases")
                .appendPathParam(request.getPeerTargetDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePeerTargetDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePeerTargetDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateReportResponse> updateReport(
            UpdateReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateReportRequest, UpdateReportResponse>
                    handler) {

        Validate.notBlank(request.getReportId(), "reportId must not be blank");
        Objects.requireNonNull(request.getUpdateReportDetails(), "updateReportDetails is required");

        return clientCall(request, UpdateReportResponse::builder)
                .logger(LOG, "updateReport")
                .serviceDetails(
                        "DataSafe",
                        "UpdateReport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/UpdateReport")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateReportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("reports")
                .appendPathParam(request.getReportId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateReportDefinitionResponse> updateReportDefinition(
            UpdateReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateReportDefinitionRequest, UpdateReportDefinitionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSdmMaskingPolicyDifferenceResponse>
            updateSdmMaskingPolicyDifference(
                    UpdateSdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSdmMaskingPolicyDifferenceRequest,
                                    UpdateSdmMaskingPolicyDifferenceResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityAssessmentResponse> updateSecurityAssessment(
            UpdateSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityAssessmentRequest, UpdateSecurityAssessmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityPolicyResponse> updateSecurityPolicy(
            UpdateSecurityPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>
                    handler) {

        Validate.notBlank(request.getSecurityPolicyId(), "securityPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityPolicyDetails(),
                "updateSecurityPolicyDetails is required");

        return clientCall(request, UpdateSecurityPolicyResponse::builder)
                .logger(LOG, "updateSecurityPolicy")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSecurityPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicy/UpdateSecurityPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicies")
                .appendPathParam(request.getSecurityPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecurityPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSecurityPolicyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityPolicyConfigResponse>
            updateSecurityPolicyConfig(
                    UpdateSecurityPolicyConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSecurityPolicyConfigRequest,
                                    UpdateSecurityPolicyConfigResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyConfigId(), "securityPolicyConfigId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityPolicyConfigDetails(),
                "updateSecurityPolicyConfigDetails is required");

        return clientCall(request, UpdateSecurityPolicyConfigResponse::builder)
                .logger(LOG, "updateSecurityPolicyConfig")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSecurityPolicyConfig",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyConfig/UpdateSecurityPolicyConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityPolicyConfigRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyConfigs")
                .appendPathParam(request.getSecurityPolicyConfigId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecurityPolicyConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSecurityPolicyConfigResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityPolicyDeploymentResponse>
            updateSecurityPolicyDeployment(
                    UpdateSecurityPolicyDeploymentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSecurityPolicyDeploymentRequest,
                                    UpdateSecurityPolicyDeploymentResponse>
                            handler) {

        Validate.notBlank(
                request.getSecurityPolicyDeploymentId(),
                "securityPolicyDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityPolicyDeploymentDetails(),
                "updateSecurityPolicyDeploymentDetails is required");

        return clientCall(request, UpdateSecurityPolicyDeploymentResponse::builder)
                .logger(LOG, "updateSecurityPolicyDeployment")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSecurityPolicyDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeployment/UpdateSecurityPolicyDeployment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityPolicyDeploymentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("securityPolicyDeployments")
                .appendPathParam(request.getSecurityPolicyDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateSecurityPolicyDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSecurityPolicyDeploymentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveColumnResponse> updateSensitiveColumn(
            UpdateSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveColumnRequest, UpdateSensitiveColumnResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveDataModelResponse> updateSensitiveDataModel(
            UpdateSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveDataModelRequest, UpdateSensitiveDataModelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveTypeResponse> updateSensitiveType(
            UpdateSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveTypeRequest, UpdateSensitiveTypeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveTypeGroupResponse> updateSensitiveTypeGroup(
            UpdateSensitiveTypeGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveTypeGroupRequest, UpdateSensitiveTypeGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getSensitiveTypeGroupId(), "sensitiveTypeGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSensitiveTypeGroupDetails(),
                "updateSensitiveTypeGroupDetails is required");

        return clientCall(request, UpdateSensitiveTypeGroupResponse::builder)
                .logger(LOG, "updateSensitiveTypeGroup")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSensitiveTypeGroup",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypeGroup/UpdateSensitiveTypeGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSensitiveTypeGroupRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypeGroups")
                .appendPathParam(request.getSensitiveTypeGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSensitiveTypeGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSensitiveTypeGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveTypesExportResponse>
            updateSensitiveTypesExport(
                    UpdateSensitiveTypesExportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSensitiveTypesExportRequest,
                                    UpdateSensitiveTypesExportResponse>
                            handler) {

        Validate.notBlank(
                request.getSensitiveTypesExportId(), "sensitiveTypesExportId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSensitiveTypesExportDetails(),
                "updateSensitiveTypesExportDetails is required");

        return clientCall(request, UpdateSensitiveTypesExportResponse::builder)
                .logger(LOG, "updateSensitiveTypesExport")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSensitiveTypesExport",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveTypesExport/UpdateSensitiveTypesExport")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSensitiveTypesExportRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sensitiveTypesExports")
                .appendPathParam(request.getSensitiveTypesExportId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSensitiveTypesExportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSensitiveTypesExportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSqlCollectionResponse> updateSqlCollection(
            UpdateSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSqlCollectionRequest, UpdateSqlCollectionResponse>
                    handler) {

        Validate.notBlank(request.getSqlCollectionId(), "sqlCollectionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSqlCollectionDetails(), "updateSqlCollectionDetails is required");

        return clientCall(request, UpdateSqlCollectionResponse::builder)
                .logger(LOG, "updateSqlCollection")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSqlCollection",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/UpdateSqlCollection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSqlCollectionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlCollections")
                .appendPathParam(request.getSqlCollectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSqlCollectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSqlCollectionResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSqlFirewallPolicyResponse> updateSqlFirewallPolicy(
            UpdateSqlFirewallPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSqlFirewallPolicyRequest, UpdateSqlFirewallPolicyResponse>
                    handler) {

        Validate.notBlank(
                request.getSqlFirewallPolicyId(), "sqlFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSqlFirewallPolicyDetails(),
                "updateSqlFirewallPolicyDetails is required");

        return clientCall(request, UpdateSqlFirewallPolicyResponse::builder)
                .logger(LOG, "updateSqlFirewallPolicy")
                .serviceDetails(
                        "DataSafe",
                        "UpdateSqlFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicy/UpdateSqlFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSqlFirewallPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("sqlFirewallPolicies")
                .appendPathParam(request.getSqlFirewallPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSqlFirewallPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSqlFirewallPolicyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetAlertPolicyAssociationResponse>
            updateTargetAlertPolicyAssociation(
                    UpdateTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetAlertPolicyAssociationRequest,
                                    UpdateTargetAlertPolicyAssociationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetDatabaseResponse> updateTargetDatabase(
            UpdateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTargetDatabaseRequest, UpdateTargetDatabaseResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetDatabaseGroupResponse> updateTargetDatabaseGroup(
            UpdateTargetDatabaseGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTargetDatabaseGroupRequest, UpdateTargetDatabaseGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getTargetDatabaseGroupId(), "targetDatabaseGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTargetDatabaseGroupDetails(),
                "updateTargetDatabaseGroupDetails is required");

        return clientCall(request, UpdateTargetDatabaseGroupResponse::builder)
                .logger(LOG, "updateTargetDatabaseGroup")
                .serviceDetails(
                        "DataSafe",
                        "UpdateTargetDatabaseGroup",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseGroup/UpdateTargetDatabaseGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTargetDatabaseGroupRequest::builder)
                .basePath("/20181201")
                .appendPathParam("targetDatabaseGroups")
                .appendPathParam(request.getTargetDatabaseGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateTargetDatabaseGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTargetDatabaseGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateUnifiedAuditPolicyResponse> updateUnifiedAuditPolicy(
            UpdateUnifiedAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUnifiedAuditPolicyRequest, UpdateUnifiedAuditPolicyResponse>
                    handler) {

        Validate.notBlank(
                request.getUnifiedAuditPolicyId(), "unifiedAuditPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateUnifiedAuditPolicyDetails(),
                "updateUnifiedAuditPolicyDetails is required");

        return clientCall(request, UpdateUnifiedAuditPolicyResponse::builder)
                .logger(LOG, "updateUnifiedAuditPolicy")
                .serviceDetails(
                        "DataSafe",
                        "UpdateUnifiedAuditPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicy/UpdateUnifiedAuditPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUnifiedAuditPolicyRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicies")
                .appendPathParam(request.getUnifiedAuditPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateUnifiedAuditPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateUnifiedAuditPolicyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateUnifiedAuditPolicyDefinitionResponse>
            updateUnifiedAuditPolicyDefinition(
                    UpdateUnifiedAuditPolicyDefinitionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateUnifiedAuditPolicyDefinitionRequest,
                                    UpdateUnifiedAuditPolicyDefinitionResponse>
                            handler) {

        Validate.notBlank(
                request.getUnifiedAuditPolicyDefinitionId(),
                "unifiedAuditPolicyDefinitionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateUnifiedAuditPolicyDefinitionDetails(),
                "updateUnifiedAuditPolicyDefinitionDetails is required");

        return clientCall(request, UpdateUnifiedAuditPolicyDefinitionResponse::builder)
                .logger(LOG, "updateUnifiedAuditPolicyDefinition")
                .serviceDetails(
                        "DataSafe",
                        "UpdateUnifiedAuditPolicyDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UnifiedAuditPolicyDefinition/UpdateUnifiedAuditPolicyDefinition")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUnifiedAuditPolicyDefinitionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("unifiedAuditPolicyDefinitions")
                .appendPathParam(request.getUnifiedAuditPolicyDefinitionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateUnifiedAuditPolicyDefinitionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateUnifiedAuditPolicyDefinitionResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserAssessmentResponse> updateUserAssessment(
            UpdateUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserAssessmentRequest, UpdateUserAssessmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadMaskingPolicyResponse> uploadMaskingPolicy(
            UploadMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadMaskingPolicyRequest, UploadMaskingPolicyResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadSensitiveDataModelResponse> uploadSensitiveDataModel(
            UploadSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadSensitiveDataModelRequest, UploadSensitiveDataModelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
