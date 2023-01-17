/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class ApiGatewayClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ApiGateway {
    /** Service instance for ApiGateway. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("APIGATEWAY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apigateway.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApiGatewayAsyncClient.class);

    private final ApiGatewayWaiters waiters;

    private final ApiGatewayPaginators paginators;

    private ApiGatewayClient(
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
                                    .nameFormat("ApiGateway-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ApiGatewayWaiters(executorService, this);

        this.paginators = new ApiGatewayPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ApiGatewayClient> {
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
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ApiGatewayClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ApiGatewayClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeApiCompartmentResponse changeApiCompartment(ChangeApiCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeCertificateCompartmentResponse changeCertificateCompartment(
            ChangeCertificateCompartmentRequest request) {

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
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCertificateCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateApiResponse createApi(CreateApiRequest request) {
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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateSdkResponse createSdk(CreateSdkRequest request) {
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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteApiResponse deleteApi(DeleteApiRequest request) {

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
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteApiResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApiResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {

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
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteCertificateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSdkResponse deleteSdk(DeleteSdkRequest request) {

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
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteSdkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSdkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetApiResponse getApi(GetApiRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetApiContentResponse getApiContent(GetApiContentRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetApiDeploymentSpecificationResponse getApiDeploymentSpecification(
            GetApiDeploymentSpecificationRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetApiValidationsResponse getApiValidations(GetApiValidationsRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetCertificateResponse getCertificate(GetCertificateRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSdkResponse getSdk(GetSdkRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListApisResponse listApis(ListApisRequest request) {
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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSdkLanguageTypesResponse listSdkLanguageTypes(ListSdkLanguageTypesRequest request) {
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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSdksResponse listSdks(ListSdksRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateApiResponse updateApi(UpdateApiRequest request) {

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
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateApiResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApiResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {

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
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateCertificateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateSdkResponse updateSdk(UpdateSdkRequest request) {

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
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSdkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ApiGatewayWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ApiGatewayPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApiGatewayClient(
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
    public ApiGatewayClient(
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
    public ApiGatewayClient(
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
    public ApiGatewayClient(
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
    public ApiGatewayClient(
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
    public ApiGatewayClient(
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
    public ApiGatewayClient(
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
    public ApiGatewayClient(
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
