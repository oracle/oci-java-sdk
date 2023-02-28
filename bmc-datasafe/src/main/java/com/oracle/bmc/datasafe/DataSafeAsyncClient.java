/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
                    .serviceName("DATASAFE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datasafe.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataSafeAsyncClient.class);

    private DataSafeAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataSafeAsyncClient> {
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
        public DataSafeAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataSafeAsyncClient(this, authenticationDetailsProvider);
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
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
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
                .appendEnumQueryParam("severity", request.getSeverity())
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
