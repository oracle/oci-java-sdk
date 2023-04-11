/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fusionapps.requests.*;
import com.oracle.bmc.fusionapps.responses.*;

import java.util.Objects;

/**
 * Async client implementation for FusionApplications service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class FusionApplicationsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements FusionApplicationsAsync {
    /** Service instance for FusionApplications. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FUSIONAPPLICATIONS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fusionapps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FusionApplicationsAsyncClient.class);

    FusionApplicationsAsyncClient(
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
                    Builder, FusionApplicationsAsyncClient> {
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
        public FusionApplicationsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FusionApplicationsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeFusionEnvironmentCompartmentResponse>
            changeFusionEnvironmentCompartment(
                    ChangeFusionEnvironmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFusionEnvironmentCompartmentRequest,
                                    ChangeFusionEnvironmentCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");
        Objects.requireNonNull(
                request.getChangeFusionEnvironmentCompartmentDetails(),
                "changeFusionEnvironmentCompartmentDetails is required");

        return clientCall(request, ChangeFusionEnvironmentCompartmentResponse::builder)
                .logger(LOG, "changeFusionEnvironmentCompartment")
                .serviceDetails(
                        "FusionApplications",
                        "ChangeFusionEnvironmentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/ChangeFusionEnvironmentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeFusionEnvironmentCompartmentRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeFusionEnvironmentCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeFusionEnvironmentCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeFusionEnvironmentFamilyCompartmentResponse>
            changeFusionEnvironmentFamilyCompartment(
                    ChangeFusionEnvironmentFamilyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFusionEnvironmentFamilyCompartmentRequest,
                                    ChangeFusionEnvironmentFamilyCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getFusionEnvironmentFamilyId(),
                "fusionEnvironmentFamilyId must not be blank");
        Objects.requireNonNull(
                request.getChangeFusionEnvironmentFamilyCompartmentDetails(),
                "changeFusionEnvironmentFamilyCompartmentDetails is required");

        return clientCall(request, ChangeFusionEnvironmentFamilyCompartmentResponse::builder)
                .logger(LOG, "changeFusionEnvironmentFamilyCompartment")
                .serviceDetails(
                        "FusionApplications",
                        "ChangeFusionEnvironmentFamilyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/ChangeFusionEnvironmentFamilyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeFusionEnvironmentFamilyCompartmentRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironmentFamilies")
                .appendPathParam(request.getFusionEnvironmentFamilyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeFusionEnvironmentFamilyCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeFusionEnvironmentFamilyCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataMaskingActivityResponse> createDataMaskingActivity(
            CreateDataMaskingActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataMaskingActivityRequest, CreateDataMaskingActivityResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");
        Objects.requireNonNull(
                request.getCreateDataMaskingActivityDetails(),
                "createDataMaskingActivityDetails is required");

        return clientCall(request, CreateDataMaskingActivityResponse::builder)
                .logger(LOG, "createDataMaskingActivity")
                .serviceDetails(
                        "FusionApplications",
                        "CreateDataMaskingActivity",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/DataMaskingActivity/CreateDataMaskingActivity")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataMaskingActivityRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("dataMaskingActivities")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDataMaskingActivityResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataMaskingActivityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFusionEnvironmentResponse> createFusionEnvironment(
            CreateFusionEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFusionEnvironmentRequest, CreateFusionEnvironmentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateFusionEnvironmentDetails(),
                "createFusionEnvironmentDetails is required");

        return clientCall(request, CreateFusionEnvironmentResponse::builder)
                .logger(LOG, "createFusionEnvironment")
                .serviceDetails(
                        "FusionApplications",
                        "CreateFusionEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/CreateFusionEnvironment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFusionEnvironmentRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateFusionEnvironmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFusionEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFusionEnvironmentAdminUserResponse>
            createFusionEnvironmentAdminUser(
                    CreateFusionEnvironmentAdminUserRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateFusionEnvironmentAdminUserRequest,
                                    CreateFusionEnvironmentAdminUserResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateFusionEnvironmentAdminUserDetails(),
                "createFusionEnvironmentAdminUserDetails is required");

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, CreateFusionEnvironmentAdminUserResponse::builder)
                .logger(LOG, "createFusionEnvironmentAdminUser")
                .serviceDetails(
                        "FusionApplications",
                        "CreateFusionEnvironmentAdminUser",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/CreateFusionEnvironmentAdminUser")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFusionEnvironmentAdminUserRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("adminUsers")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateFusionEnvironmentAdminUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateFusionEnvironmentAdminUserResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFusionEnvironmentFamilyResponse>
            createFusionEnvironmentFamily(
                    CreateFusionEnvironmentFamilyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateFusionEnvironmentFamilyRequest,
                                    CreateFusionEnvironmentFamilyResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateFusionEnvironmentFamilyDetails(),
                "createFusionEnvironmentFamilyDetails is required");

        return clientCall(request, CreateFusionEnvironmentFamilyResponse::builder)
                .logger(LOG, "createFusionEnvironmentFamily")
                .serviceDetails(
                        "FusionApplications",
                        "CreateFusionEnvironmentFamily",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/CreateFusionEnvironmentFamily")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFusionEnvironmentFamilyRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironmentFamilies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateFusionEnvironmentFamilyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateFusionEnvironmentFamilyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRefreshActivityResponse> createRefreshActivity(
            CreateRefreshActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRefreshActivityRequest, CreateRefreshActivityResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");
        Objects.requireNonNull(
                request.getCreateRefreshActivityDetails(),
                "createRefreshActivityDetails is required");

        return clientCall(request, CreateRefreshActivityResponse::builder)
                .logger(LOG, "createRefreshActivity")
                .serviceDetails(
                        "FusionApplications",
                        "CreateRefreshActivity",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/CreateRefreshActivityDetails/CreateRefreshActivity")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRefreshActivityRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("refreshActivities")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateRefreshActivityResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRefreshActivityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFusionEnvironmentResponse> deleteFusionEnvironment(
            DeleteFusionEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFusionEnvironmentRequest, DeleteFusionEnvironmentResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, DeleteFusionEnvironmentResponse::builder)
                .logger(LOG, "deleteFusionEnvironment")
                .serviceDetails(
                        "FusionApplications",
                        "DeleteFusionEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/DeleteFusionEnvironment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFusionEnvironmentRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteFusionEnvironmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFusionEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFusionEnvironmentAdminUserResponse>
            deleteFusionEnvironmentAdminUser(
                    DeleteFusionEnvironmentAdminUserRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteFusionEnvironmentAdminUserRequest,
                                    DeleteFusionEnvironmentAdminUserResponse>
                            handler) {

        Validate.notBlank(request.getAdminUsername(), "adminUsername must not be blank");

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, DeleteFusionEnvironmentAdminUserResponse::builder)
                .logger(LOG, "deleteFusionEnvironmentAdminUser")
                .serviceDetails(
                        "FusionApplications",
                        "DeleteFusionEnvironmentAdminUser",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/DeleteFusionEnvironmentAdminUser")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFusionEnvironmentAdminUserRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("adminUsers")
                .appendPathParam(request.getAdminUsername())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteFusionEnvironmentAdminUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteFusionEnvironmentAdminUserResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFusionEnvironmentFamilyResponse>
            deleteFusionEnvironmentFamily(
                    DeleteFusionEnvironmentFamilyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteFusionEnvironmentFamilyRequest,
                                    DeleteFusionEnvironmentFamilyResponse>
                            handler) {

        Validate.notBlank(
                request.getFusionEnvironmentFamilyId(),
                "fusionEnvironmentFamilyId must not be blank");

        return clientCall(request, DeleteFusionEnvironmentFamilyResponse::builder)
                .logger(LOG, "deleteFusionEnvironmentFamily")
                .serviceDetails(
                        "FusionApplications",
                        "DeleteFusionEnvironmentFamily",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/DeleteFusionEnvironmentFamily")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFusionEnvironmentFamilyRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironmentFamilies")
                .appendPathParam(request.getFusionEnvironmentFamilyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteFusionEnvironmentFamilyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteFusionEnvironmentFamilyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRefreshActivityResponse> deleteRefreshActivity(
            DeleteRefreshActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRefreshActivityRequest, DeleteRefreshActivityResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        Validate.notBlank(request.getRefreshActivityId(), "refreshActivityId must not be blank");

        return clientCall(request, DeleteRefreshActivityResponse::builder)
                .logger(LOG, "deleteRefreshActivity")
                .serviceDetails(
                        "FusionApplications",
                        "DeleteRefreshActivity",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/RefreshActivity/DeleteRefreshActivity")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRefreshActivityRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("refreshActivities")
                .appendPathParam(request.getRefreshActivityId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteRefreshActivityResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRefreshActivityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataMaskingActivityResponse> getDataMaskingActivity(
            GetDataMaskingActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataMaskingActivityRequest, GetDataMaskingActivityResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        Validate.notBlank(
                request.getDataMaskingActivityId(), "dataMaskingActivityId must not be blank");

        return clientCall(request, GetDataMaskingActivityResponse::builder)
                .logger(LOG, "getDataMaskingActivity")
                .serviceDetails(
                        "FusionApplications",
                        "GetDataMaskingActivity",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/DataMaskingActivity/GetDataMaskingActivity")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataMaskingActivityRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("dataMaskingActivities")
                .appendPathParam(request.getDataMaskingActivityId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.DataMaskingActivity.class,
                        GetDataMaskingActivityResponse.Builder::dataMaskingActivity)
                .handleResponseHeaderString("etag", GetDataMaskingActivityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataMaskingActivityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFusionEnvironmentResponse> getFusionEnvironment(
            GetFusionEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFusionEnvironmentRequest, GetFusionEnvironmentResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, GetFusionEnvironmentResponse::builder)
                .logger(LOG, "getFusionEnvironment")
                .serviceDetails(
                        "FusionApplications",
                        "GetFusionEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/GetFusionEnvironment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFusionEnvironmentRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.FusionEnvironment.class,
                        GetFusionEnvironmentResponse.Builder::fusionEnvironment)
                .handleResponseHeaderString("etag", GetFusionEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFusionEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFusionEnvironmentFamilyResponse>
            getFusionEnvironmentFamily(
                    GetFusionEnvironmentFamilyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentFamilyRequest,
                                    GetFusionEnvironmentFamilyResponse>
                            handler) {

        Validate.notBlank(
                request.getFusionEnvironmentFamilyId(),
                "fusionEnvironmentFamilyId must not be blank");

        return clientCall(request, GetFusionEnvironmentFamilyResponse::builder)
                .logger(LOG, "getFusionEnvironmentFamily")
                .serviceDetails(
                        "FusionApplications",
                        "GetFusionEnvironmentFamily",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/GetFusionEnvironmentFamily")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFusionEnvironmentFamilyRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironmentFamilies")
                .appendPathParam(request.getFusionEnvironmentFamilyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.FusionEnvironmentFamily.class,
                        GetFusionEnvironmentFamilyResponse.Builder::fusionEnvironmentFamily)
                .handleResponseHeaderString(
                        "etag", GetFusionEnvironmentFamilyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFusionEnvironmentFamilyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFusionEnvironmentFamilyLimitsAndUsageResponse>
            getFusionEnvironmentFamilyLimitsAndUsage(
                    GetFusionEnvironmentFamilyLimitsAndUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentFamilyLimitsAndUsageRequest,
                                    GetFusionEnvironmentFamilyLimitsAndUsageResponse>
                            handler) {

        Validate.notBlank(
                request.getFusionEnvironmentFamilyId(),
                "fusionEnvironmentFamilyId must not be blank");

        return clientCall(request, GetFusionEnvironmentFamilyLimitsAndUsageResponse::builder)
                .logger(LOG, "getFusionEnvironmentFamilyLimitsAndUsage")
                .serviceDetails(
                        "FusionApplications",
                        "GetFusionEnvironmentFamilyLimitsAndUsage",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamilyLimitsAndUsage/GetFusionEnvironmentFamilyLimitsAndUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFusionEnvironmentFamilyLimitsAndUsageRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironmentFamilies")
                .appendPathParam(request.getFusionEnvironmentFamilyId())
                .appendPathParam("limitsAndUsage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.FusionEnvironmentFamilyLimitsAndUsage.class,
                        GetFusionEnvironmentFamilyLimitsAndUsageResponse.Builder
                                ::fusionEnvironmentFamilyLimitsAndUsage)
                .handleResponseHeaderString(
                        "etag", GetFusionEnvironmentFamilyLimitsAndUsageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetFusionEnvironmentFamilyLimitsAndUsageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFusionEnvironmentFamilySubscriptionDetailResponse>
            getFusionEnvironmentFamilySubscriptionDetail(
                    GetFusionEnvironmentFamilySubscriptionDetailRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentFamilySubscriptionDetailRequest,
                                    GetFusionEnvironmentFamilySubscriptionDetailResponse>
                            handler) {

        Validate.notBlank(
                request.getFusionEnvironmentFamilyId(),
                "fusionEnvironmentFamilyId must not be blank");

        return clientCall(request, GetFusionEnvironmentFamilySubscriptionDetailResponse::builder)
                .logger(LOG, "getFusionEnvironmentFamilySubscriptionDetail")
                .serviceDetails(
                        "FusionApplications",
                        "GetFusionEnvironmentFamilySubscriptionDetail",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/GetFusionEnvironmentFamilySubscriptionDetail")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFusionEnvironmentFamilySubscriptionDetailRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironmentFamilies")
                .appendPathParam(request.getFusionEnvironmentFamilyId())
                .appendPathParam("subscriptionDetails")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.SubscriptionDetail.class,
                        GetFusionEnvironmentFamilySubscriptionDetailResponse.Builder
                                ::subscriptionDetail)
                .handleResponseHeaderString(
                        "etag", GetFusionEnvironmentFamilySubscriptionDetailResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetFusionEnvironmentFamilySubscriptionDetailResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFusionEnvironmentStatusResponse>
            getFusionEnvironmentStatus(
                    GetFusionEnvironmentStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentStatusRequest,
                                    GetFusionEnvironmentStatusResponse>
                            handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, GetFusionEnvironmentStatusResponse::builder)
                .logger(LOG, "getFusionEnvironmentStatus")
                .serviceDetails(
                        "FusionApplications",
                        "GetFusionEnvironmentStatus",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentStatus/GetFusionEnvironmentStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFusionEnvironmentStatusRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("status")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.FusionEnvironmentStatus.class,
                        GetFusionEnvironmentStatusResponse.Builder::fusionEnvironmentStatus)
                .handleResponseHeaderString(
                        "opc-request-id", GetFusionEnvironmentStatusResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRefreshActivityResponse> getRefreshActivity(
            GetRefreshActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRefreshActivityRequest, GetRefreshActivityResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        Validate.notBlank(request.getRefreshActivityId(), "refreshActivityId must not be blank");

        return clientCall(request, GetRefreshActivityResponse::builder)
                .logger(LOG, "getRefreshActivity")
                .serviceDetails(
                        "FusionApplications",
                        "GetRefreshActivity",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/RefreshActivity/GetRefreshActivity")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRefreshActivityRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("refreshActivities")
                .appendPathParam(request.getRefreshActivityId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.RefreshActivity.class,
                        GetRefreshActivityResponse.Builder::refreshActivity)
                .handleResponseHeaderString("etag", GetRefreshActivityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRefreshActivityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetScheduledActivityResponse> getScheduledActivity(
            GetScheduledActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledActivityRequest, GetScheduledActivityResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        Validate.notBlank(
                request.getScheduledActivityId(), "scheduledActivityId must not be blank");

        return clientCall(request, GetScheduledActivityResponse::builder)
                .logger(LOG, "getScheduledActivity")
                .serviceDetails(
                        "FusionApplications",
                        "GetScheduledActivity",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ScheduledActivity/GetScheduledActivity")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduledActivityRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("scheduledActivities")
                .appendPathParam(request.getScheduledActivityId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.ScheduledActivity.class,
                        GetScheduledActivityResponse.Builder::scheduledActivity)
                .handleResponseHeaderString("etag", GetScheduledActivityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduledActivityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetServiceAttachmentResponse> getServiceAttachment(
            GetServiceAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetServiceAttachmentRequest, GetServiceAttachmentResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        Validate.notBlank(
                request.getServiceAttachmentId(), "serviceAttachmentId must not be blank");

        return clientCall(request, GetServiceAttachmentResponse::builder)
                .logger(LOG, "getServiceAttachment")
                .serviceDetails(
                        "FusionApplications",
                        "GetServiceAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ServiceAttachment/GetServiceAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetServiceAttachmentRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("serviceAttachments")
                .appendPathParam(request.getServiceAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.ServiceAttachment.class,
                        GetServiceAttachmentResponse.Builder::serviceAttachment)
                .handleResponseHeaderString("etag", GetServiceAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetServiceAttachmentResponse.Builder::opcRequestId)
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
                        "FusionApplications",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20211201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAdminUsersResponse> listAdminUsers(
            ListAdminUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdminUsersRequest, ListAdminUsersResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, ListAdminUsersResponse::builder)
                .logger(LOG, "listAdminUsers")
                .serviceDetails(
                        "FusionApplications",
                        "ListAdminUsers",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/ListAdminUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAdminUsersRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("adminUsers")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.AdminUserCollection.class,
                        ListAdminUsersResponse.Builder::adminUserCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAdminUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAdminUsersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataMaskingActivitiesResponse> listDataMaskingActivities(
            ListDataMaskingActivitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataMaskingActivitiesRequest, ListDataMaskingActivitiesResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, ListDataMaskingActivitiesResponse::builder)
                .logger(LOG, "listDataMaskingActivities")
                .serviceDetails(
                        "FusionApplications",
                        "ListDataMaskingActivities",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/DataMaskingActivity/ListDataMaskingActivities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataMaskingActivitiesRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("dataMaskingActivities")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.DataMaskingActivityCollection.class,
                        ListDataMaskingActivitiesResponse.Builder::dataMaskingActivityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataMaskingActivitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataMaskingActivitiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFusionEnvironmentFamiliesResponse>
            listFusionEnvironmentFamilies(
                    ListFusionEnvironmentFamiliesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListFusionEnvironmentFamiliesRequest,
                                    ListFusionEnvironmentFamiliesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFusionEnvironmentFamiliesResponse::builder)
                .logger(LOG, "listFusionEnvironmentFamilies")
                .serviceDetails(
                        "FusionApplications",
                        "ListFusionEnvironmentFamilies",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/ListFusionEnvironmentFamilies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFusionEnvironmentFamiliesRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironmentFamilies")
                .appendQueryParam(
                        "fusionEnvironmentFamilyId", request.getFusionEnvironmentFamilyId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.FusionEnvironmentFamilyCollection.class,
                        ListFusionEnvironmentFamiliesResponse.Builder
                                ::fusionEnvironmentFamilyCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListFusionEnvironmentFamiliesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFusionEnvironmentFamiliesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFusionEnvironmentsResponse> listFusionEnvironments(
            ListFusionEnvironmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFusionEnvironmentsRequest, ListFusionEnvironmentsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFusionEnvironmentsResponse::builder)
                .logger(LOG, "listFusionEnvironments")
                .serviceDetails(
                        "FusionApplications",
                        "ListFusionEnvironments",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/ListFusionEnvironments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFusionEnvironmentsRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "fusionEnvironmentFamilyId", request.getFusionEnvironmentFamilyId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.FusionEnvironmentCollection.class,
                        ListFusionEnvironmentsResponse.Builder::fusionEnvironmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFusionEnvironmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFusionEnvironmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRefreshActivitiesResponse> listRefreshActivities(
            ListRefreshActivitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRefreshActivitiesRequest, ListRefreshActivitiesResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, ListRefreshActivitiesResponse::builder)
                .logger(LOG, "listRefreshActivities")
                .serviceDetails(
                        "FusionApplications",
                        "ListRefreshActivities",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/RefreshActivity/ListRefreshActivities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRefreshActivitiesRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("refreshActivities")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "timeScheduledStartGreaterThanOrEqualTo",
                        request.getTimeScheduledStartGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeExpectedFinishLessThanOrEqualTo",
                        request.getTimeExpectedFinishLessThanOrEqualTo())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.RefreshActivityCollection.class,
                        ListRefreshActivitiesResponse.Builder::refreshActivityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRefreshActivitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRefreshActivitiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListScheduledActivitiesResponse> listScheduledActivities(
            ListScheduledActivitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledActivitiesRequest, ListScheduledActivitiesResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, ListScheduledActivitiesResponse::builder)
                .logger(LOG, "listScheduledActivities")
                .serviceDetails(
                        "FusionApplications",
                        "ListScheduledActivities",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ScheduledActivity/ListScheduledActivities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScheduledActivitiesRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("scheduledActivities")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "timeScheduledStartGreaterThanOrEqualTo",
                        request.getTimeScheduledStartGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeExpectedFinishLessThanOrEqualTo",
                        request.getTimeExpectedFinishLessThanOrEqualTo())
                .appendEnumQueryParam("runCycle", request.getRunCycle())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.ScheduledActivityCollection.class,
                        ListScheduledActivitiesResponse.Builder::scheduledActivityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListScheduledActivitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScheduledActivitiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListServiceAttachmentsResponse> listServiceAttachments(
            ListServiceAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListServiceAttachmentsRequest, ListServiceAttachmentsResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, ListServiceAttachmentsResponse::builder)
                .logger(LOG, "listServiceAttachments")
                .serviceDetails(
                        "FusionApplications",
                        "ListServiceAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ServiceAttachment/ListServiceAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServiceAttachmentsRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("serviceAttachments")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("serviceInstanceType", request.getServiceInstanceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.ServiceAttachmentCollection.class,
                        ListServiceAttachmentsResponse.Builder::serviceAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListServiceAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListServiceAttachmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTimeAvailableForRefreshesResponse>
            listTimeAvailableForRefreshes(
                    ListTimeAvailableForRefreshesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTimeAvailableForRefreshesRequest,
                                    ListTimeAvailableForRefreshesResponse>
                            handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        return clientCall(request, ListTimeAvailableForRefreshesResponse::builder)
                .logger(LOG, "listTimeAvailableForRefreshes")
                .serviceDetails(
                        "FusionApplications",
                        "ListTimeAvailableForRefreshes",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/TimeAvailableForRefresh/ListTimeAvailableForRefreshes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTimeAvailableForRefreshesRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("timeAvailableForRefresh")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.TimeAvailableForRefreshCollection.class,
                        ListTimeAvailableForRefreshesResponse.Builder
                                ::timeAvailableForRefreshCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListTimeAvailableForRefreshesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTimeAvailableForRefreshesResponse.Builder::opcNextPage)
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
                        "FusionApplications",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20211201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.WorkRequestErrorCollection.class,
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
                        "FusionApplications",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20211201")
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
                        com.oracle.bmc.fusionapps.model.WorkRequestLogEntryCollection.class,
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
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "FusionApplications",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20211201")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fusionapps.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResetFusionEnvironmentPasswordResponse>
            resetFusionEnvironmentPassword(
                    ResetFusionEnvironmentPasswordRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ResetFusionEnvironmentPasswordRequest,
                                    ResetFusionEnvironmentPasswordResponse>
                            handler) {
        Objects.requireNonNull(
                request.getResetFusionEnvironmentPasswordDetails(),
                "resetFusionEnvironmentPasswordDetails is required");

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        Validate.notBlank(request.getAdminUsername(), "adminUsername must not be blank");

        return clientCall(request, ResetFusionEnvironmentPasswordResponse::builder)
                .logger(LOG, "resetFusionEnvironmentPassword")
                .serviceDetails(
                        "FusionApplications",
                        "ResetFusionEnvironmentPassword",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/ResetFusionEnvironmentPassword")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResetFusionEnvironmentPasswordRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("adminUsers")
                .appendPathParam(request.getAdminUsername())
                .appendPathParam("actions")
                .appendPathParam("resetPassword")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ResetFusionEnvironmentPasswordResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ResetFusionEnvironmentPasswordResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFusionEnvironmentResponse> updateFusionEnvironment(
            UpdateFusionEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFusionEnvironmentRequest, UpdateFusionEnvironmentResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFusionEnvironmentDetails(),
                "updateFusionEnvironmentDetails is required");

        return clientCall(request, UpdateFusionEnvironmentResponse::builder)
                .logger(LOG, "updateFusionEnvironment")
                .serviceDetails(
                        "FusionApplications",
                        "UpdateFusionEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/UpdateFusionEnvironment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFusionEnvironmentRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateFusionEnvironmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFusionEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFusionEnvironmentFamilyResponse>
            updateFusionEnvironmentFamily(
                    UpdateFusionEnvironmentFamilyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFusionEnvironmentFamilyRequest,
                                    UpdateFusionEnvironmentFamilyResponse>
                            handler) {

        Validate.notBlank(
                request.getFusionEnvironmentFamilyId(),
                "fusionEnvironmentFamilyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFusionEnvironmentFamilyDetails(),
                "updateFusionEnvironmentFamilyDetails is required");

        return clientCall(request, UpdateFusionEnvironmentFamilyResponse::builder)
                .logger(LOG, "updateFusionEnvironmentFamily")
                .serviceDetails(
                        "FusionApplications",
                        "UpdateFusionEnvironmentFamily",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/UpdateFusionEnvironmentFamily")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFusionEnvironmentFamilyRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironmentFamilies")
                .appendPathParam(request.getFusionEnvironmentFamilyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateFusionEnvironmentFamilyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateFusionEnvironmentFamilyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRefreshActivityResponse> updateRefreshActivity(
            UpdateRefreshActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRefreshActivityRequest, UpdateRefreshActivityResponse>
                    handler) {

        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        Validate.notBlank(request.getRefreshActivityId(), "refreshActivityId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRefreshActivityDetails(),
                "updateRefreshActivityDetails is required");

        return clientCall(request, UpdateRefreshActivityResponse::builder)
                .logger(LOG, "updateRefreshActivity")
                .serviceDetails(
                        "FusionApplications",
                        "UpdateRefreshActivity",
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/UpdateRefreshActivityDetails/UpdateRefreshActivity")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRefreshActivityRequest::builder)
                .basePath("/20211201")
                .appendPathParam("fusionEnvironments")
                .appendPathParam(request.getFusionEnvironmentId())
                .appendPathParam("refreshActivities")
                .appendPathParam(request.getRefreshActivityId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fusionapps.model.RefreshActivity.class,
                        UpdateRefreshActivityResponse.Builder::refreshActivity)
                .handleResponseHeaderString("etag", UpdateRefreshActivityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRefreshActivityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
