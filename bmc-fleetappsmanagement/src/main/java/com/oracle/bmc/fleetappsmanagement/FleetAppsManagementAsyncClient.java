/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for FleetAppsManagement service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class FleetAppsManagementAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements FleetAppsManagementAsync {
    /** Service instance for FleetAppsManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(FleetAppsManagementClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementAsyncClient.class);

    FleetAppsManagementAsyncClient(
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
                    Builder, FleetAppsManagementAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "fleetappsmanagement";
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
        public FleetAppsManagementAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeFleetCompartmentResponse> changeFleetCompartment(
            ChangeFleetCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeFleetCompartmentRequest, ChangeFleetCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getChangeFleetCompartmentDetails(),
                "changeFleetCompartmentDetails is required");

        return clientCall(request, ChangeFleetCompartmentResponse::builder)
                .logger(LOG, "changeFleetCompartment")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ChangeFleetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Fleet/ChangeFleetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeFleetCompartmentRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeFleetCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeFleetCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CheckResourceTaggingResponse> checkResourceTagging(
            CheckResourceTaggingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CheckResourceTaggingRequest, CheckResourceTaggingResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCheckResourceTaggingDetails(),
                "checkResourceTaggingDetails is required");

        return clientCall(request, CheckResourceTaggingResponse::builder)
                .logger(LOG, "checkResourceTagging")
                .serviceDetails(
                        "FleetAppsManagement",
                        "CheckResourceTagging",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Fleet/CheckResourceTagging")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CheckResourceTaggingRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam("actions")
                .appendPathParam("checkResourceTagging")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.ResourceTagCheckDetails.class,
                        CheckResourceTaggingResponse.Builder::resourceTagCheckDetails)
                .handleResponseHeaderString("etag", CheckResourceTaggingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CheckResourceTaggingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfirmTargetsResponse> confirmTargets(
            ConfirmTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ConfirmTargetsRequest, ConfirmTargetsResponse>
                    handler) {
        Objects.requireNonNull(
                request.getConfirmTargetsDetails(), "confirmTargetsDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ConfirmTargetsResponse::builder)
                .logger(LOG, "confirmTargets")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ConfirmTargets",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Fleet/ConfirmTargets")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfirmTargetsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("confirmTargets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ConfirmTargetsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ConfirmTargetsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResponse> createFleet(
            CreateFleetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateFleetRequest, CreateFleetResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateFleetDetails(), "createFleetDetails is required");

        return clientCall(request, CreateFleetResponse::builder)
                .logger(LOG, "createFleet")
                .serviceDetails(
                        "FleetAppsManagement",
                        "CreateFleet",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Fleet/CreateFleet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFleetRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetCredentialResponse> createFleetCredential(
            CreateFleetCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFleetCredentialRequest, CreateFleetCredentialResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateFleetCredentialDetails(),
                "createFleetCredentialDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, CreateFleetCredentialResponse::builder)
                .logger(LOG, "createFleetCredential")
                .serviceDetails(
                        "FleetAppsManagement",
                        "CreateFleetCredential",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetCredential/CreateFleetCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFleetCredentialRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetCredentials")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetPropertyResponse> createFleetProperty(
            CreateFleetPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFleetPropertyRequest, CreateFleetPropertyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateFleetPropertyDetails(), "createFleetPropertyDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, CreateFleetPropertyResponse::builder)
                .logger(LOG, "createFleetProperty")
                .serviceDetails(
                        "FleetAppsManagement",
                        "CreateFleetProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetProperty/CreateFleetProperty")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFleetPropertyRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProperties")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetProperty.class,
                        CreateFleetPropertyResponse.Builder::fleetProperty)
                .handleResponseHeaderString("etag", CreateFleetPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFleetPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResourceResponse> createFleetResource(
            CreateFleetResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFleetResourceRequest, CreateFleetResourceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateFleetResourceDetails(), "createFleetResourceDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, CreateFleetResourceResponse::builder)
                .logger(LOG, "createFleetResource")
                .serviceDetails(
                        "FleetAppsManagement",
                        "CreateFleetResource",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetResource/CreateFleetResource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFleetResourceRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetResources")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResponse> deleteFleet(
            DeleteFleetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteFleetRequest, DeleteFleetResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, DeleteFleetResponse::builder)
                .logger(LOG, "deleteFleet")
                .serviceDetails(
                        "FleetAppsManagement",
                        "DeleteFleet",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Fleet/DeleteFleet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFleetRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteFleetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFleetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetCredentialResponse> deleteFleetCredential(
            DeleteFleetCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFleetCredentialRequest, DeleteFleetCredentialResponse>
                    handler) {

        Validate.notBlank(request.getFleetCredentialId(), "fleetCredentialId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, DeleteFleetCredentialResponse::builder)
                .logger(LOG, "deleteFleetCredential")
                .serviceDetails(
                        "FleetAppsManagement",
                        "DeleteFleetCredential",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetCredential/DeleteFleetCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFleetCredentialRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetCredentials")
                .appendPathParam(request.getFleetCredentialId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteFleetCredentialResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFleetCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetPropertyResponse> deleteFleetProperty(
            DeleteFleetPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFleetPropertyRequest, DeleteFleetPropertyResponse>
                    handler) {

        Validate.notBlank(request.getFleetPropertyId(), "fleetPropertyId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, DeleteFleetPropertyResponse::builder)
                .logger(LOG, "deleteFleetProperty")
                .serviceDetails(
                        "FleetAppsManagement",
                        "DeleteFleetProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetProperty/DeleteFleetProperty")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFleetPropertyRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProperties")
                .appendPathParam(request.getFleetPropertyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFleetPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResourceResponse> deleteFleetResource(
            DeleteFleetResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFleetResourceRequest, DeleteFleetResourceResponse>
                    handler) {

        Validate.notBlank(request.getFleetResourceId(), "fleetResourceId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, DeleteFleetResourceResponse::builder)
                .logger(LOG, "deleteFleetResource")
                .serviceDetails(
                        "FleetAppsManagement",
                        "DeleteFleetResource",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetResource/DeleteFleetResource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFleetResourceRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetResources")
                .appendPathParam(request.getFleetResourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteFleetResourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFleetResourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateComplianceReportResponse> generateComplianceReport(
            GenerateComplianceReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateComplianceReportRequest, GenerateComplianceReportResponse>
                    handler) {
        Objects.requireNonNull(
                request.getGenerateComplianceReportDetails(),
                "generateComplianceReportDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GenerateComplianceReportResponse::builder)
                .logger(LOG, "generateComplianceReport")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GenerateComplianceReport",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Fleet/GenerateComplianceReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateComplianceReportRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("generateComplianceReport")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateComplianceReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateComplianceReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceResponse> getCompliance(
            GetComplianceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetComplianceRequest, GetComplianceResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetComplianceResponse::builder)
                .logger(LOG, "getCompliance")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetCompliance",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Compliance/GetCompliance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetComplianceRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("compliance")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Compliance.class,
                        GetComplianceResponse.Builder::compliance)
                .handleResponseHeaderString("etag", GetComplianceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetComplianceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceReportResponse> getComplianceReport(
            GetComplianceReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetComplianceReportRequest, GetComplianceReportResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        Validate.notBlank(request.getComplianceReportId(), "complianceReportId must not be blank");

        return clientCall(request, GetComplianceReportResponse::builder)
                .logger(LOG, "getComplianceReport")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetComplianceReport",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/ComplianceReport/GetComplianceReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetComplianceReportRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("complianceReports")
                .appendPathParam(request.getComplianceReportId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.ComplianceReport.class,
                        GetComplianceReportResponse.Builder::complianceReport)
                .handleResponseHeaderString("etag", GetComplianceReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetComplianceReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFleetResponse> getFleet(
            GetFleetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFleetRequest, GetFleetResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetResponse::builder)
                .logger(LOG, "getFleet")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetFleet",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Fleet/GetFleet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Fleet.class,
                        GetFleetResponse.Builder::fleet)
                .handleResponseHeaderString("etag", GetFleetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFleetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFleetCredentialResponse> getFleetCredential(
            GetFleetCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFleetCredentialRequest, GetFleetCredentialResponse>
                    handler) {

        Validate.notBlank(request.getFleetCredentialId(), "fleetCredentialId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetCredentialResponse::builder)
                .logger(LOG, "getFleetCredential")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetFleetCredential",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetCredential/GetFleetCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetCredentialRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetCredentials")
                .appendPathParam(request.getFleetCredentialId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetCredential.class,
                        GetFleetCredentialResponse.Builder::fleetCredential)
                .handleResponseHeaderString("etag", GetFleetCredentialResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFleetCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFleetPropertyResponse> getFleetProperty(
            GetFleetPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFleetPropertyRequest, GetFleetPropertyResponse>
                    handler) {

        Validate.notBlank(request.getFleetPropertyId(), "fleetPropertyId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetPropertyResponse::builder)
                .logger(LOG, "getFleetProperty")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetFleetProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetProperty/GetFleetProperty")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetPropertyRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProperties")
                .appendPathParam(request.getFleetPropertyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetProperty.class,
                        GetFleetPropertyResponse.Builder::fleetProperty)
                .handleResponseHeaderString("etag", GetFleetPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFleetPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFleetResourceResponse> getFleetResource(
            GetFleetResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFleetResourceRequest, GetFleetResourceResponse>
                    handler) {

        Validate.notBlank(request.getFleetResourceId(), "fleetResourceId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, GetFleetResourceResponse::builder)
                .logger(LOG, "getFleetResource")
                .serviceDetails(
                        "FleetAppsManagement",
                        "GetFleetResource",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetResource/GetFleetResource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFleetResourceRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetResources")
                .appendPathParam(request.getFleetResourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetResource.class,
                        GetFleetResourceResponse.Builder::fleetResource)
                .handleResponseHeaderString("etag", GetFleetResourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFleetResourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAnnouncementsResponse> listAnnouncements(
            ListAnnouncementsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAnnouncementsRequest, ListAnnouncementsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAnnouncementsResponse::builder)
                .logger(LOG, "listAnnouncements")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListAnnouncements",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/AnnouncementCollection/ListAnnouncements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAnnouncementsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("announcements")
                .appendQueryParam("summaryContains", request.getSummaryContains())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.AnnouncementCollection.class,
                        ListAnnouncementsResponse.Builder::announcementCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAnnouncementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAnnouncementsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFleetCredentialsResponse> listFleetCredentials(
            ListFleetCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFleetCredentialsRequest, ListFleetCredentialsResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetCredentialsResponse::builder)
                .logger(LOG, "listFleetCredentials")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleetCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetCredentialCollection/ListFleetCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetCredentialsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetCredentials")
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
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetCredentialCollection.class,
                        ListFleetCredentialsResponse.Builder::fleetCredentialCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetCredentialsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFleetProductsResponse> listFleetProducts(
            ListFleetProductsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFleetProductsRequest, ListFleetProductsResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetProductsResponse::builder)
                .logger(LOG, "listFleetProducts")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleetProducts",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetProductCollection/ListFleetProducts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetProductsRequest::builder)
                .basePath("/20250228")
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
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetProductCollection.class,
                        ListFleetProductsResponse.Builder::fleetProductCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetProductsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetProductsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFleetPropertiesResponse> listFleetProperties(
            ListFleetPropertiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFleetPropertiesRequest, ListFleetPropertiesResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetPropertiesResponse::builder)
                .logger(LOG, "listFleetProperties")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleetProperties",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetPropertyCollection/ListFleetProperties")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetPropertiesRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProperties")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetPropertyCollection.class,
                        ListFleetPropertiesResponse.Builder::fleetPropertyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetPropertiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetPropertiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFleetResourcesResponse> listFleetResources(
            ListFleetResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFleetResourcesRequest, ListFleetResourcesResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetResourcesResponse::builder)
                .logger(LOG, "listFleetResources")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleetResources",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetResourceCollection/ListFleetResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetResourcesRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetResources")
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
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetResourceCollection.class,
                        ListFleetResourcesResponse.Builder::fleetResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetResourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFleetTargetsResponse> listFleetTargets(
            ListFleetTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFleetTargetsRequest, ListFleetTargetsResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListFleetTargetsResponse::builder)
                .logger(LOG, "listFleetTargets")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleetTargets",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetTargetCollection/ListFleetTargets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetTargetsRequest::builder)
                .basePath("/20250228")
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
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetTargetCollection.class,
                        ListFleetTargetsResponse.Builder::fleetTargetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetTargetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetTargetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFleetsResponse> listFleets(
            ListFleetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFleetsRequest, ListFleetsResponse>
                    handler) {

        return clientCall(request, ListFleetsResponse::builder)
                .logger(LOG, "listFleets")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListFleets",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetCollection/ListFleets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFleetsRequest::builder)
                .basePath("/20250228")
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
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetCollection.class,
                        ListFleetsResponse.Builder::fleetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFleetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFleetsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListFleetsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInventoryResourcesResponse> listInventoryResources(
            ListInventoryResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInventoryResourcesRequest, ListInventoryResourcesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getResourceCompartmentId(), "resourceCompartmentId is required");

        return clientCall(request, ListInventoryResourcesResponse::builder)
                .logger(LOG, "listInventoryResources")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListInventoryResources",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/InventoryResourceCollection/ListInventoryResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInventoryResourcesRequest::builder)
                .basePath("/20250228")
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
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.InventoryResourceCollection.class,
                        ListInventoryResourcesResponse.Builder::inventoryResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInventoryResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInventoryResourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsResponse> listTargets(
            ListTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTargetsRequest, ListTargetsResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, ListTargetsResponse::builder)
                .logger(LOG, "listTargets")
                .serviceDetails(
                        "FleetAppsManagement",
                        "ListTargets",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetTargetCollection/ListTargets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("targets")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("isConfirmedTargets", request.getIsConfirmedTargets())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetTargetCollection.class,
                        ListTargetsResponse.Builder::fleetTargetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTargetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTargetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestResourceValidationResponse> requestResourceValidation(
            RequestResourceValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestResourceValidationRequest, RequestResourceValidationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getRequestResourceValidationDetails(),
                "requestResourceValidationDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, RequestResourceValidationResponse::builder)
                .logger(LOG, "requestResourceValidation")
                .serviceDetails(
                        "FleetAppsManagement",
                        "RequestResourceValidation",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Fleet/RequestResourceValidation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestResourceValidationRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("requestResourceValidation")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestResourceValidationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RequestResourceValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestTargetDiscoveryResponse> requestTargetDiscovery(
            RequestTargetDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestTargetDiscoveryRequest, RequestTargetDiscoveryResponse>
                    handler) {
        Objects.requireNonNull(
                request.getRequestTargetDiscoveryDetails(),
                "requestTargetDiscoveryDetails is required");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");

        return clientCall(request, RequestTargetDiscoveryResponse::builder)
                .logger(LOG, "requestTargetDiscovery")
                .serviceDetails(
                        "FleetAppsManagement",
                        "RequestTargetDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Fleet/RequestTargetDiscovery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestTargetDiscoveryRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("actions")
                .appendPathParam("requestTargetDiscovery")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestTargetDiscoveryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RequestTargetDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetResponse> updateFleet(
            UpdateFleetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateFleetRequest, UpdateFleetResponse>
                    handler) {

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(request.getUpdateFleetDetails(), "updateFleetDetails is required");

        return clientCall(request, UpdateFleetResponse::builder)
                .logger(LOG, "updateFleet")
                .serviceDetails(
                        "FleetAppsManagement",
                        "UpdateFleet",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Fleet/UpdateFleet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Fleet.class,
                        UpdateFleetResponse.Builder::fleet)
                .handleResponseHeaderString("etag", UpdateFleetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFleetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetCredentialResponse> updateFleetCredential(
            UpdateFleetCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFleetCredentialRequest, UpdateFleetCredentialResponse>
                    handler) {

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
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetCredential/UpdateFleetCredential")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetCredentialRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetCredentials")
                .appendPathParam(request.getFleetCredentialId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateFleetCredentialResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFleetCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetPropertyResponse> updateFleetProperty(
            UpdateFleetPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFleetPropertyRequest, UpdateFleetPropertyResponse>
                    handler) {

        Validate.notBlank(request.getFleetPropertyId(), "fleetPropertyId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFleetPropertyDetails(), "updateFleetPropertyDetails is required");

        return clientCall(request, UpdateFleetPropertyResponse::builder)
                .logger(LOG, "updateFleetProperty")
                .serviceDetails(
                        "FleetAppsManagement",
                        "UpdateFleetProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetProperty/UpdateFleetProperty")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetPropertyRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetProperties")
                .appendPathParam(request.getFleetPropertyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.FleetProperty.class,
                        UpdateFleetPropertyResponse.Builder::fleetProperty)
                .handleResponseHeaderString("etag", UpdateFleetPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFleetPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetResourceResponse> updateFleetResource(
            UpdateFleetResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFleetResourceRequest, UpdateFleetResourceResponse>
                    handler) {

        Validate.notBlank(request.getFleetResourceId(), "fleetResourceId must not be blank");

        Validate.notBlank(request.getFleetId(), "fleetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFleetResourceDetails(), "updateFleetResourceDetails is required");

        return clientCall(request, UpdateFleetResourceResponse::builder)
                .logger(LOG, "updateFleetResource")
                .serviceDetails(
                        "FleetAppsManagement",
                        "UpdateFleetResource",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/FleetResource/UpdateFleetResource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFleetResourceRequest::builder)
                .basePath("/20250228")
                .appendPathParam("fleets")
                .appendPathParam(request.getFleetId())
                .appendPathParam("fleetResources")
                .appendPathParam(request.getFleetResourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateFleetResourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFleetResourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementAsyncClient(
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
    public FleetAppsManagementAsyncClient(
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
    public FleetAppsManagementAsyncClient(
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
    public FleetAppsManagementAsyncClient(
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
    public FleetAppsManagementAsyncClient(
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
    public FleetAppsManagementAsyncClient(
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
    public FleetAppsManagementAsyncClient(
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
