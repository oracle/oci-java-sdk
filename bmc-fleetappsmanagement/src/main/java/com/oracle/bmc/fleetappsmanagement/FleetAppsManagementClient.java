/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements FleetAppsManagement {
    /** Service instance for FleetAppsManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETAPPSMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementClient.class);

    private final FleetAppsManagementWaiters waiters;

    private final FleetAppsManagementPaginators paginators;

    FleetAppsManagementClient(
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
                                    .nameFormat("FleetAppsManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new FleetAppsManagementWaiters(executorService, this);

        this.paginators = new FleetAppsManagementPaginators(this);
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
                    Builder, FleetAppsManagementClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "fleetappsmanagement";
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
        public FleetAppsManagementClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementClient(
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
    public CheckResourceTaggingResponse checkResourceTagging(CheckResourceTaggingRequest request) {
        Objects.requireNonNull(
                request.getCheckResourceTaggingDetails(),
                "checkResourceTaggingDetails is required");

        return clientCall(request, CheckResourceTaggingResponse::builder)
                .logger(LOG, "checkResourceTagging")
                .serviceDetails(
                        "FleetAppsManagement",
                        "CheckResourceTagging",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Fleet/CheckResourceTagging")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CheckResourceTaggingRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam("actions")
                .appendPathParam("checkResourceTagging")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.ResourceTagCheckDetails.class,
                        CheckResourceTaggingResponse.Builder::resourceTagCheckDetails)
                .handleResponseHeaderString("etag", CheckResourceTaggingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CheckResourceTaggingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConfirmTargetsResponse confirmTargets(ConfirmTargetsRequest request) {
        Objects.requireNonNull(
                request.getConfirmTargetsDetails(), "confirmTargetsDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ConfirmTargetsResponse::builder)
                .logger(LOG, "confirmTargets")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ConfirmTargets",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Fleet/ConfirmTargets")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfirmTargetsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("confirmTargets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ConfirmTargetsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ConfirmTargetsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateFleetResponse createFleet(CreateFleetRequest request) {
        Objects.requireNonNull(request.getCreateFleetDetails(), "createFleetDetails is required");

        return clientCall(request, CreateFleetResponse::builder)
                .logger(LOG, "createFleet")
                .serviceDetails(
                        "FleetAppsManagement",
                        "CreateFleet",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Fleet/CreateFleet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFleetRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Fleet.class,
                        CreateFleetResponse.Builder::fleet)
                .handleResponseHeaderString("location", CreateFleetResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateFleetResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateFleetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateFleetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFleetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateFleetCredentialResponse createFleetCredential(
            CreateFleetCredentialRequest request) {
        Objects.requireNonNull(
                request.getCreateFleetCredentialDetails(),
                "createFleetCredentialDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, CreateFleetCredentialResponse::builder)
                .logger(LOG, "createFleetCredential")
                .serviceDetails(
                        "FleetAppsManagement",
                        "CreateFleetCredential",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetCredential/CreateFleetCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFleetCredentialRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetCredentials")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetCredential.class,
                        CreateFleetCredentialResponse.Builder::fleetCredential)
                .handleResponseHeaderString(
                        "location", CreateFleetCredentialResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateFleetCredentialResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateFleetCredentialResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateFleetCredentialResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFleetCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateFleetPropertyResponse createFleetProperty(CreateFleetPropertyRequest request) {
        Objects.requireNonNull(
                request.getCreateFleetPropertyDetails(), "createFleetPropertyDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, CreateFleetPropertyResponse::builder)
                .logger(LOG, "createFleetProperty")
                .serviceDetails(
                        "FleetAppsManagement",
                        "CreateFleetProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetProperty/CreateFleetProperty")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFleetPropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProperties")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetProperty.class,
                        CreateFleetPropertyResponse.Builder::fleetProperty)
                .handleResponseHeaderString("etag", CreateFleetPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFleetPropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateFleetResourceResponse createFleetResource(CreateFleetResourceRequest request) {
        Objects.requireNonNull(
                request.getCreateFleetResourceDetails(), "createFleetResourceDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, CreateFleetResourceResponse::builder)
                .logger(LOG, "createFleetResource")
                .serviceDetails(
                        "FleetAppsManagement",
                        "CreateFleetResource",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetResource/CreateFleetResource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFleetResourceRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetResources")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetResource.class,
                        CreateFleetResourceResponse.Builder::fleetResource)
                .handleResponseHeaderString(
                        "location", CreateFleetResourceResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateFleetResourceResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateFleetResourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateFleetResourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFleetResourceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFleetResponse deleteFleet(DeleteFleetRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, DeleteFleetResponse::builder)
                .logger(LOG, "deleteFleet")
                .serviceDetails(
                        "FleetAppsManagement",
                        "DeleteFleet",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Fleet/DeleteFleet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFleetRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteFleetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFleetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFleetCredentialResponse deleteFleetCredential(
            DeleteFleetCredentialRequest request) {

        Validate.notBlank(request.getFleetCredentialId(), "fleetCredentialId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, DeleteFleetCredentialResponse::builder)
                .logger(LOG, "deleteFleetCredential")
                .serviceDetails(
                        "FleetAppsManagement",
                        "DeleteFleetCredential",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetCredential/DeleteFleetCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFleetCredentialRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetCredentials")
                .appendPathParam(request.getFleetCredentialId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteFleetCredentialResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFleetCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFleetPropertyResponse deleteFleetProperty(DeleteFleetPropertyRequest request) {

        Validate.notBlank(request.getFleetPropertyId(), "fleetPropertyId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, DeleteFleetPropertyResponse::builder)
                .logger(LOG, "deleteFleetProperty")
                .serviceDetails(
                        "FleetAppsManagement",
                        "DeleteFleetProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetProperty/DeleteFleetProperty")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFleetPropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProperties")
                .appendPathParam(request.getFleetPropertyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFleetPropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFleetResourceResponse deleteFleetResource(DeleteFleetResourceRequest request) {

        Validate.notBlank(request.getFleetResourceId(), "fleetResourceId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, DeleteFleetResourceResponse::builder)
                .logger(LOG, "deleteFleetResource")
                .serviceDetails(
                        "FleetAppsManagement",
                        "DeleteFleetResource",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetResource/DeleteFleetResource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFleetResourceRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetResources")
                .appendPathParam(request.getFleetResourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteFleetResourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFleetResourceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GenerateComplianceReportResponse generateComplianceReport(
            GenerateComplianceReportRequest request) {
        Objects.requireNonNull(
                request.getGenerateComplianceReportDetails(),
                "generateComplianceReportDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GenerateComplianceReportResponse::builder)
                .logger(LOG, "generateComplianceReport")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GenerateComplianceReport",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Fleet/GenerateComplianceReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateComplianceReportRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("generateComplianceReport")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateComplianceReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateComplianceReportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetComplianceReportResponse getComplianceReport(GetComplianceReportRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(request.getComplianceReportId(), "complianceReportId must not be blank");

        return clientCall(request, GetComplianceReportResponse::builder)
                .logger(LOG, "getComplianceReport")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetComplianceReport",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ComplianceReport/GetComplianceReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetComplianceReportRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("complianceReports")
                .appendPathParam(request.getComplianceReportId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.ComplianceReport.class,
                        GetComplianceReportResponse.Builder::complianceReport)
                .handleResponseHeaderString("etag", GetComplianceReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetComplianceReportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFleetResponse getFleet(GetFleetRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetResponse::builder)
                .logger(LOG, "getFleet")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetFleet",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Fleet/GetFleet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Fleet.class,
                        GetFleetResponse.Builder::fleet)
                .handleResponseHeaderString("etag", GetFleetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFleetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFleetCredentialResponse getFleetCredential(GetFleetCredentialRequest request) {

        Validate.notBlank(request.getFleetCredentialId(), "fleetCredentialId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetCredentialResponse::builder)
                .logger(LOG, "getFleetCredential")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetFleetCredential",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetCredential/GetFleetCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetCredentialRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetCredentials")
                .appendPathParam(request.getFleetCredentialId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetCredential.class,
                        GetFleetCredentialResponse.Builder::fleetCredential)
                .handleResponseHeaderString("etag", GetFleetCredentialResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFleetCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFleetPropertyResponse getFleetProperty(GetFleetPropertyRequest request) {

        Validate.notBlank(request.getFleetPropertyId(), "fleetPropertyId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetPropertyResponse::builder)
                .logger(LOG, "getFleetProperty")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetFleetProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetProperty/GetFleetProperty")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetPropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProperties")
                .appendPathParam(request.getFleetPropertyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetProperty.class,
                        GetFleetPropertyResponse.Builder::fleetProperty)
                .handleResponseHeaderString("etag", GetFleetPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFleetPropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFleetResourceResponse getFleetResource(GetFleetResourceRequest request) {

        Validate.notBlank(request.getFleetResourceId(), "fleetResourceId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetResourceResponse::builder)
                .logger(LOG, "getFleetResource")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetFleetResource",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetResource/GetFleetResource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetResourceRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetResources")
                .appendPathParam(request.getFleetResourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetResource.class,
                        GetFleetResourceResponse.Builder::fleetResource)
                .handleResponseHeaderString("etag", GetFleetResourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFleetResourceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20230831")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListAnnouncementsResponse listAnnouncements(ListAnnouncementsRequest request) {

        return clientCall(request, ListAnnouncementsResponse::builder)
                .logger(LOG, "listAnnouncements")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListAnnouncements",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/AnnouncementCollection/ListAnnouncements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAnnouncementsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("announcements")
                .appendQueryParam("summaryContains", request.getSummaryContains())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.AnnouncementCollection.class,
                        ListAnnouncementsResponse.Builder::announcementCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAnnouncementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAnnouncementsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFleetCredentialsResponse listFleetCredentials(ListFleetCredentialsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetCredentialsResponse::builder)
                .logger(LOG, "listFleetCredentials")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleetCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetCredentialCollection/ListFleetCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetCredentialsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetCredentials")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("target", request.getTarget())
                .appendEnumQueryParam("credentialLevel", request.getCredentialLevel())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetCredentialCollection.class,
                        ListFleetCredentialsResponse.Builder::fleetCredentialCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFleetProductsResponse listFleetProducts(ListFleetProductsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetProductsResponse::builder)
                .logger(LOG, "listFleetProducts")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleetProducts",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetProductCollection/ListFleetProducts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetProductsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProducts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("resourceDisplayName", request.getResourceDisplayName())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetProductCollection.class,
                        ListFleetProductsResponse.Builder::fleetProductCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetProductsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetProductsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFleetPropertiesResponse listFleetProperties(ListFleetPropertiesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetPropertiesResponse::builder)
                .logger(LOG, "listFleetProperties")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleetProperties",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetPropertyCollection/ListFleetProperties")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetPropertiesRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProperties")
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
                        com.oracle.bmc.fleetappsmanagement.model.FleetPropertyCollection.class,
                        ListFleetPropertiesResponse.Builder::fleetPropertyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetPropertiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetPropertiesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFleetResourcesResponse listFleetResources(ListFleetResourcesRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetResourcesResponse::builder)
                .logger(LOG, "listFleetResources")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleetResources",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetResourceCollection/ListFleetResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetResourcesRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetResources")
                .appendQueryParam("tenancyId", request.getTenancyId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("fleetResourceType", request.getFleetResourceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetResourceCollection.class,
                        ListFleetResourcesResponse.Builder::fleetResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetResourcesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFleetTargetsResponse listFleetTargets(ListFleetTargetsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetTargetsResponse::builder)
                .logger(LOG, "listFleetTargets")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleetTargets",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetTargetCollection/ListFleetTargets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetTargetsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetTargets")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("product", request.getProduct())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("resourceDisplayName", request.getResourceDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetTargetCollection.class,
                        ListFleetTargetsResponse.Builder::fleetTargetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetTargetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetTargetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFleetsResponse listFleets(ListFleetsRequest request) {

        return clientCall(request, ListFleetsResponse::builder)
                .logger(LOG, "listFleets")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleets",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetCollection/ListFleets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("fleetType", request.getFleetType())
                .appendQueryParam("applicationType", request.getApplicationType())
                .appendQueryParam("product", request.getProduct())
                .appendQueryParam("environmentType", request.getEnvironmentType())
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
                        com.oracle.bmc.fleetappsmanagement.model.FleetCollection.class,
                        ListFleetsResponse.Builder::fleetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListFleetsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListInventoryResourcesResponse listInventoryResources(
            ListInventoryResourcesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getResourceCompartmentId(), "resourceCompartmentId is required");

        return clientCall(request, ListInventoryResourcesResponse::builder)
                .logger(LOG, "listInventoryResources")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListInventoryResources",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/InventoryResourceCollection/ListInventoryResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInventoryResourcesRequest::builder)
                .basePath("/20230831")
                .appendPathParam("inventoryResources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceRegion", request.getResourceRegion())
                .appendQueryParam("resourceCompartmentId", request.getResourceCompartmentId())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "inventoryProperties",
                        request.getInventoryProperties(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("matchingCriteria", request.getMatchingCriteria())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.InventoryResourceCollection.class,
                        ListInventoryResourcesResponse.Builder::inventoryResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInventoryResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInventoryResourcesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListTargetsResponse listTargets(ListTargetsRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListTargetsResponse::builder)
                .logger(LOG, "listTargets")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListTargets",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetTargetCollection/ListTargets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("targets")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetTargetCollection.class,
                        ListTargetsResponse.Builder::fleetTargetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTargetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTargetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20230831")
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
                        com.oracle.bmc.fleetappsmanagement.model.WorkRequestErrorCollection.class,
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
                        "FleetAppsManagement",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20230831")
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
                        com.oracle.bmc.fleetappsmanagement.model.WorkRequestLogEntryCollection
                                .class,
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
                        "FleetAppsManagement",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20230831")
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
                        com.oracle.bmc.fleetappsmanagement.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RequestResourceValidationResponse requestResourceValidation(
            RequestResourceValidationRequest request) {
        Objects.requireNonNull(
                request.getRequestResourceValidationDetails(),
                "requestResourceValidationDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, RequestResourceValidationResponse::builder)
                .logger(LOG, "requestResourceValidation")
                .serviceDetails(
                        "FleetAppsManagement",
                        "RequestResourceValidation",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Fleet/RequestResourceValidation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestResourceValidationRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("requestResourceValidation")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestResourceValidationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RequestResourceValidationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RequestTargetDiscoveryResponse requestTargetDiscovery(
            RequestTargetDiscoveryRequest request) {
        Objects.requireNonNull(
                request.getRequestTargetDiscoveryDetails(),
                "requestTargetDiscoveryDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, RequestTargetDiscoveryResponse::builder)
                .logger(LOG, "requestTargetDiscovery")
                .serviceDetails(
                        "FleetAppsManagement",
                        "RequestTargetDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Fleet/RequestTargetDiscovery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestTargetDiscoveryRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("requestTargetDiscovery")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestTargetDiscoveryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RequestTargetDiscoveryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFleetResponse updateFleet(UpdateFleetRequest request) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(request.getUpdateFleetDetails(), "updateFleetDetails is required");

        return clientCall(request, UpdateFleetResponse::builder)
                .logger(LOG, "updateFleet")
                .serviceDetails(
                        "FleetAppsManagement",
                        "UpdateFleet",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Fleet/UpdateFleet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Fleet.class,
                        UpdateFleetResponse.Builder::fleet)
                .handleResponseHeaderString("etag", UpdateFleetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFleetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFleetCredentialResponse updateFleetCredential(
            UpdateFleetCredentialRequest request) {

        Validate.notBlank(request.getFleetCredentialId(), "fleetCredentialId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFleetCredentialDetails(),
                "updateFleetCredentialDetails is required");

        return clientCall(request, UpdateFleetCredentialResponse::builder)
                .logger(LOG, "updateFleetCredential")
                .serviceDetails(
                        "FleetAppsManagement",
                        "UpdateFleetCredential",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetCredential/UpdateFleetCredential")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetCredentialRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetCredentials")
                .appendPathParam(request.getFleetCredentialId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateFleetCredentialResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFleetCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFleetPropertyResponse updateFleetProperty(UpdateFleetPropertyRequest request) {

        Validate.notBlank(request.getFleetPropertyId(), "fleetPropertyId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFleetPropertyDetails(), "updateFleetPropertyDetails is required");

        return clientCall(request, UpdateFleetPropertyResponse::builder)
                .logger(LOG, "updateFleetProperty")
                .serviceDetails(
                        "FleetAppsManagement",
                        "UpdateFleetProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetProperty/UpdateFleetProperty")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetPropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProperties")
                .appendPathParam(request.getFleetPropertyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetProperty.class,
                        UpdateFleetPropertyResponse.Builder::fleetProperty)
                .handleResponseHeaderString("etag", UpdateFleetPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFleetPropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFleetResourceResponse updateFleetResource(UpdateFleetResourceRequest request) {

        Validate.notBlank(request.getFleetResourceId(), "fleetResourceId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFleetResourceDetails(), "updateFleetResourceDetails is required");

        return clientCall(request, UpdateFleetResourceResponse::builder)
                .logger(LOG, "updateFleetResource")
                .serviceDetails(
                        "FleetAppsManagement",
                        "UpdateFleetResource",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/FleetResource/UpdateFleetResource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetResourceRequest::builder)
                .basePath("/20230831")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetResources")
                .appendPathParam(request.getFleetResourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateFleetResourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFleetResourceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public FleetAppsManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public FleetAppsManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementClient(
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
    public FleetAppsManagementClient(
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
    public FleetAppsManagementClient(
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
    public FleetAppsManagementClient(
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
    public FleetAppsManagementClient(
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
    public FleetAppsManagementClient(
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
    public FleetAppsManagementClient(
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
    public FleetAppsManagementClient(
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
