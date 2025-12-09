/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ApiGateway service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class ApiGatewayAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ApiGatewayAsync {
    /** Service instance for ApiGateway. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ApiGatewayClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apigateway.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApiGatewayAsyncClient.class);

    ApiGatewayAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    ApiGatewayAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "ApiGatewayAsyncClient", "getApiContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ApiGatewayAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apigateway";
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
        public ApiGatewayAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ApiGatewayAsyncClient(
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
    public java.util.concurrent.Future<AddApiLockResponse> addApiLock(
            AddApiLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddApiLockRequest, AddApiLockResponse>
                    handler) {

        Validate.notBlank(request.getApiId(), "apiId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddApiLockResponse::builder)
                .logger(LOG, "addApiLock")
                .serviceDetails(
                        "ApiGateway",
                        "AddApiLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Api/AddApiLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddApiLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
                .appendPathParam(request.getApiId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Api.class, AddApiLockResponse.Builder::api)
                .handleResponseHeaderString(
                        "opc-request-id", AddApiLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddApiLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddCertificateLockResponse> addCertificateLock(
            AddCertificateLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddCertificateLockRequest, AddCertificateLockResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddCertificateLockResponse::builder)
                .logger(LOG, "addCertificateLock")
                .serviceDetails(
                        "ApiGateway",
                        "AddCertificateLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Certificate/AddCertificateLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddCertificateLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Certificate.class,
                        AddCertificateLockResponse.Builder::certificate)
                .handleResponseHeaderString(
                        "opc-request-id", AddCertificateLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddCertificateLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddSdkLockResponse> addSdkLock(
            AddSdkLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddSdkLockRequest, AddSdkLockResponse>
                    handler) {

        Validate.notBlank(request.getSdkId(), "sdkId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddSdkLockResponse::builder)
                .logger(LOG, "addSdkLock")
                .serviceDetails(
                        "ApiGateway",
                        "AddSdkLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Sdk/AddSdkLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddSdkLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("sdks")
                .appendPathParam(request.getSdkId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Sdk.class, AddSdkLockResponse.Builder::sdk)
                .handleResponseHeaderString(
                        "opc-request-id", AddSdkLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddSdkLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeApiCompartmentResponse> changeApiCompartment(
            ChangeApiCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeApiCompartmentRequest, ChangeApiCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getApiId(), "apiId must not be blank");
        Objects.requireNonNull(
                request.getChangeApiCompartmentDetails(),
                "changeApiCompartmentDetails is required");

        return clientCall(request, ChangeApiCompartmentResponse::builder)
                .logger(LOG, "changeApiCompartment")
                .serviceDetails(
                        "ApiGateway",
                        "ChangeApiCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Api/ChangeApiCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeApiCompartmentRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
                .appendPathParam(request.getApiId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeApiCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeApiCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCertificateCompartmentResponse>
            changeCertificateCompartment(
                    ChangeCertificateCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCertificateCompartmentRequest,
                                    ChangeCertificateCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");
        Objects.requireNonNull(
                request.getChangeCertificateCompartmentDetails(),
                "changeCertificateCompartmentDetails is required");

        return clientCall(request, ChangeCertificateCompartmentResponse::builder)
                .logger(LOG, "changeCertificateCompartment")
                .serviceDetails(
                        "ApiGateway",
                        "ChangeCertificateCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Certificate/ChangeCertificateCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCertificateCompartmentRequest::builder)
                .basePath("/20190501")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCertificateCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateApiResponse> createApi(
            CreateApiRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateApiRequest, CreateApiResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateApiDetails(), "createApiDetails is required");

        return clientCall(request, CreateApiResponse::builder)
                .logger(LOG, "createApi")
                .serviceDetails("ApiGateway", "CreateApi", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApiRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Api.class, CreateApiResponse.Builder::api)
                .handleResponseHeaderString("etag", CreateApiResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateApiResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApiResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateApiResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateRequest, CreateCertificateResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCertificateDetails(), "createCertificateDetails is required");

        return clientCall(request, CreateCertificateResponse::builder)
                .logger(LOG, "createCertificate")
                .serviceDetails("ApiGateway", "CreateCertificate", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCertificateRequest::builder)
                .basePath("/20190501")
                .appendPathParam("certificates")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Certificate.class,
                        CreateCertificateResponse.Builder::certificate)
                .handleResponseHeaderString("etag", CreateCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCertificateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateCertificateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("location", CreateCertificateResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSdkResponse> createSdk(
            CreateSdkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateSdkRequest, CreateSdkResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateSdkDetails(), "createSdkDetails is required");

        return clientCall(request, CreateSdkResponse::builder)
                .logger(LOG, "createSdk")
                .serviceDetails(
                        "ApiGateway",
                        "CreateSdk",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Sdk/CreateSdk")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSdkRequest::builder)
                .basePath("/20190501")
                .appendPathParam("sdks")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Sdk.class, CreateSdkResponse.Builder::sdk)
                .handleResponseHeaderString("etag", CreateSdkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateSdkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSdkResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateSdkResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiResponse> deleteApi(
            DeleteApiRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteApiRequest, DeleteApiResponse>
                    handler) {

        Validate.notBlank(request.getApiId(), "apiId must not be blank");

        return clientCall(request, DeleteApiResponse::builder)
                .logger(LOG, "deleteApi")
                .serviceDetails(
                        "ApiGateway",
                        "DeleteApi",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Api/DeleteApi")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApiRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
                .appendPathParam(request.getApiId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteApiResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApiResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateResponse> deleteCertificate(
            DeleteCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCertificateRequest, DeleteCertificateResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, DeleteCertificateResponse::builder)
                .logger(LOG, "deleteCertificate")
                .serviceDetails(
                        "ApiGateway",
                        "DeleteCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Certificate/DeleteCertificate")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCertificateRequest::builder)
                .basePath("/20190501")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteCertificateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCertificateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSdkResponse> deleteSdk(
            DeleteSdkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteSdkRequest, DeleteSdkResponse>
                    handler) {

        Validate.notBlank(request.getSdkId(), "sdkId must not be blank");

        return clientCall(request, DeleteSdkResponse::builder)
                .logger(LOG, "deleteSdk")
                .serviceDetails(
                        "ApiGateway",
                        "DeleteSdk",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Sdk/DeleteSdk")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSdkRequest::builder)
                .basePath("/20190501")
                .appendPathParam("sdks")
                .appendPathParam(request.getSdkId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteSdkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSdkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApiResponse> getApi(
            GetApiRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetApiRequest, GetApiResponse> handler) {

        Validate.notBlank(request.getApiId(), "apiId must not be blank");

        return clientCall(request, GetApiResponse::builder)
                .logger(LOG, "getApi")
                .serviceDetails(
                        "ApiGateway",
                        "GetApi",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Api/GetApi")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApiRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
                .appendPathParam(request.getApiId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.apigateway.model.Api.class, GetApiResponse.Builder::api)
                .handleResponseHeaderString("etag", GetApiResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetApiResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApiContentResponse> getApiContent(
            GetApiContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetApiContentRequest, GetApiContentResponse>
                    handler) {

        Validate.notBlank(request.getApiId(), "apiId must not be blank");

        return clientCall(request, GetApiContentResponse::builder)
                .logger(LOG, "getApiContent")
                .serviceDetails(
                        "ApiGateway",
                        "GetApiContent",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Api/GetApiContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApiContentRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
                .appendPathParam(request.getApiId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("range", request.getRange())
                .handleBody(java.io.InputStream.class, GetApiContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetApiContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApiContentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "x-content-sha256", GetApiContentResponse.Builder::xContentSha256)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApiDeploymentSpecificationResponse>
            getApiDeploymentSpecification(
                    GetApiDeploymentSpecificationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetApiDeploymentSpecificationRequest,
                                    GetApiDeploymentSpecificationResponse>
                            handler) {

        Validate.notBlank(request.getApiId(), "apiId must not be blank");

        return clientCall(request, GetApiDeploymentSpecificationResponse::builder)
                .logger(LOG, "getApiDeploymentSpecification")
                .serviceDetails(
                        "ApiGateway",
                        "GetApiDeploymentSpecification",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/ApiSpecification/GetApiDeploymentSpecification")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApiDeploymentSpecificationRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
                .appendPathParam(request.getApiId())
                .appendPathParam("deploymentSpecification")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.apigateway.model.ApiSpecification.class,
                        GetApiDeploymentSpecificationResponse.Builder::apiSpecification)
                .handleResponseHeaderString(
                        "etag", GetApiDeploymentSpecificationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetApiDeploymentSpecificationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApiValidationsResponse> getApiValidations(
            GetApiValidationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetApiValidationsRequest, GetApiValidationsResponse>
                    handler) {

        Validate.notBlank(request.getApiId(), "apiId must not be blank");

        return clientCall(request, GetApiValidationsResponse::builder)
                .logger(LOG, "getApiValidations")
                .serviceDetails(
                        "ApiGateway",
                        "GetApiValidations",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/ApiValidations/GetApiValidations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApiValidationsRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
                .appendPathParam(request.getApiId())
                .appendPathParam("validations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.apigateway.model.ApiValidations.class,
                        GetApiValidationsResponse.Builder::apiValidations)
                .handleResponseHeaderString("etag", GetApiValidationsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApiValidationsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateResponse> getCertificate(
            GetCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateRequest, GetCertificateResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, GetCertificateResponse::builder)
                .logger(LOG, "getCertificate")
                .serviceDetails(
                        "ApiGateway",
                        "GetCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Certificate/GetCertificate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCertificateRequest::builder)
                .basePath("/20190501")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apigateway.model.Certificate.class,
                        GetCertificateResponse.Builder::certificate)
                .handleResponseHeaderString("etag", GetCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCertificateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSdkResponse> getSdk(
            GetSdkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSdkRequest, GetSdkResponse> handler) {

        Validate.notBlank(request.getSdkId(), "sdkId must not be blank");

        return clientCall(request, GetSdkResponse::builder)
                .logger(LOG, "getSdk")
                .serviceDetails(
                        "ApiGateway",
                        "GetSdk",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Sdk/GetSdk")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSdkRequest::builder)
                .basePath("/20190501")
                .appendPathParam("sdks")
                .appendPathParam(request.getSdkId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.apigateway.model.Sdk.class, GetSdkResponse.Builder::sdk)
                .handleResponseHeaderString("etag", GetSdkResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetSdkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApisResponse> listApis(
            ListApisRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListApisRequest, ListApisResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListApisResponse::builder)
                .logger(LOG, "listApis")
                .serviceDetails(
                        "ApiGateway",
                        "ListApis",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Api/ListApis")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApisRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
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
                        com.oracle.bmc.apigateway.model.ApiCollection.class,
                        ListApisResponse.Builder::apiCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApisResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListApisResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", ListApisResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCertificatesRequest, ListCertificatesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCertificatesResponse::builder)
                .logger(LOG, "listCertificates")
                .serviceDetails(
                        "ApiGateway",
                        "ListCertificates",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Certificate/ListCertificates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCertificatesRequest::builder)
                .basePath("/20190501")
                .appendPathParam("certificates")
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
                        com.oracle.bmc.apigateway.model.CertificateCollection.class,
                        ListCertificatesResponse.Builder::certificateCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCertificatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCertificatesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListCertificatesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSdkLanguageTypesResponse> listSdkLanguageTypes(
            ListSdkLanguageTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSdkLanguageTypesRequest, ListSdkLanguageTypesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSdkLanguageTypesResponse::builder)
                .logger(LOG, "listSdkLanguageTypes")
                .serviceDetails(
                        "ApiGateway",
                        "ListSdkLanguageTypes",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/SdkLanguageTypeSummary/ListSdkLanguageTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSdkLanguageTypesRequest::builder)
                .basePath("/20190501")
                .appendPathParam("sdkLanguageTypes")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apigateway.model.SdkLanguageTypeCollection.class,
                        ListSdkLanguageTypesResponse.Builder::sdkLanguageTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSdkLanguageTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSdkLanguageTypesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSdkLanguageTypesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSdksResponse> listSdks(
            ListSdksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSdksRequest, ListSdksResponse>
                    handler) {

        return clientCall(request, ListSdksResponse::builder)
                .logger(LOG, "listSdks")
                .serviceDetails(
                        "ApiGateway",
                        "ListSdks",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Sdk/ListSdks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSdksRequest::builder)
                .basePath("/20190501")
                .appendPathParam("sdks")
                .appendQueryParam("sdkId", request.getSdkId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("apiId", request.getApiId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apigateway.model.SdkCollection.class,
                        ListSdksResponse.Builder::sdkCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSdksResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListSdksResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", ListSdksResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveApiLockResponse> removeApiLock(
            RemoveApiLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RemoveApiLockRequest, RemoveApiLockResponse>
                    handler) {

        Validate.notBlank(request.getApiId(), "apiId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveApiLockResponse::builder)
                .logger(LOG, "removeApiLock")
                .serviceDetails(
                        "ApiGateway",
                        "RemoveApiLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Api/RemoveApiLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveApiLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
                .appendPathParam(request.getApiId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Api.class,
                        RemoveApiLockResponse.Builder::api)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveApiLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveApiLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveCertificateLockResponse> removeCertificateLock(
            RemoveCertificateLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveCertificateLockRequest, RemoveCertificateLockResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveCertificateLockResponse::builder)
                .logger(LOG, "removeCertificateLock")
                .serviceDetails(
                        "ApiGateway",
                        "RemoveCertificateLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Certificate/RemoveCertificateLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveCertificateLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Certificate.class,
                        RemoveCertificateLockResponse.Builder::certificate)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveCertificateLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveCertificateLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveSdkLockResponse> removeSdkLock(
            RemoveSdkLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RemoveSdkLockRequest, RemoveSdkLockResponse>
                    handler) {

        Validate.notBlank(request.getSdkId(), "sdkId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveSdkLockResponse::builder)
                .logger(LOG, "removeSdkLock")
                .serviceDetails(
                        "ApiGateway",
                        "RemoveSdkLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Sdk/RemoveSdkLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveSdkLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("sdks")
                .appendPathParam(request.getSdkId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Sdk.class,
                        RemoveSdkLockResponse.Builder::sdk)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveSdkLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveSdkLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateApiResponse> updateApi(
            UpdateApiRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateApiRequest, UpdateApiResponse>
                    handler) {

        Validate.notBlank(request.getApiId(), "apiId must not be blank");
        Objects.requireNonNull(request.getUpdateApiDetails(), "updateApiDetails is required");

        return clientCall(request, UpdateApiResponse::builder)
                .logger(LOG, "updateApi")
                .serviceDetails(
                        "ApiGateway",
                        "UpdateApi",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Api/UpdateApi")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApiRequest::builder)
                .basePath("/20190501")
                .appendPathParam("apis")
                .appendPathParam(request.getApiId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateApiResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApiResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateResponse> updateCertificate(
            UpdateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCertificateRequest, UpdateCertificateResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCertificateDetails(), "updateCertificateDetails is required");

        return clientCall(request, UpdateCertificateResponse::builder)
                .logger(LOG, "updateCertificate")
                .serviceDetails(
                        "ApiGateway",
                        "UpdateCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Certificate/UpdateCertificate")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCertificateRequest::builder)
                .basePath("/20190501")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateCertificateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCertificateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSdkResponse> updateSdk(
            UpdateSdkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateSdkRequest, UpdateSdkResponse>
                    handler) {

        Validate.notBlank(request.getSdkId(), "sdkId must not be blank");
        Objects.requireNonNull(request.getUpdateSdkDetails(), "updateSdkDetails is required");

        return clientCall(request, UpdateSdkResponse::builder)
                .logger(LOG, "updateSdk")
                .serviceDetails(
                        "ApiGateway",
                        "UpdateSdk",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Sdk/UpdateSdk")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSdkRequest::builder)
                .basePath("/20190501")
                .appendPathParam("sdks")
                .appendPathParam(request.getSdkId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSdkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApiGatewayAsyncClient(
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
    public ApiGatewayAsyncClient(
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
    public ApiGatewayAsyncClient(
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
    public ApiGatewayAsyncClient(
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
    public ApiGatewayAsyncClient(
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
    public ApiGatewayAsyncClient(
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
    public ApiGatewayAsyncClient(
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
