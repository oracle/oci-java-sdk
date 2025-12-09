/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class WaasClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Waas {
    /** Service instance for Waas. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(WaasClient.class.getName())
                    .serviceEndpointPrefix("waas")
                    .serviceEndpointTemplate("https://waas.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WaasClient.class);

    private final WaasWaiters waiters;

    private final WaasPaginators paginators;

    WaasClient(
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
                                    .nameFormat("Waas-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new WaasWaiters(executorService, this);

        this.paginators = new WaasPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WaasClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "waas";
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
        public WaasClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new WaasClient(this, authenticationDetailsProvider, executorService);
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
    public AcceptRecommendationsResponse acceptRecommendations(
            AcceptRecommendationsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(request.getProtectionRuleKeys(), "protectionRuleKeys is required");

        return clientCall(request, AcceptRecommendationsResponse::builder)
                .logger(LOG, "acceptRecommendations")
                .serviceDetails(
                        "Waas",
                        "AcceptRecommendations",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Recommendation/AcceptRecommendations")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AcceptRecommendationsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("actions")
                .appendPathParam("acceptWafConfigRecommendations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AcceptRecommendationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AcceptRecommendationsResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "Waas",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20181116")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeAddressListCompartmentResponse changeAddressListCompartment(
            ChangeAddressListCompartmentRequest request) {

        Validate.notBlank(request.getAddressListId(), "addressListId must not be blank");
        Objects.requireNonNull(
                request.getChangeAddressListCompartmentDetails(),
                "changeAddressListCompartmentDetails is required");

        return clientCall(request, ChangeAddressListCompartmentResponse::builder)
                .logger(LOG, "changeAddressListCompartment")
                .serviceDetails(
                        "Waas",
                        "ChangeAddressListCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/ChangeAddressListCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAddressListCompartmentRequest::builder)
                .basePath("/20181116")
                .appendPathParam("addressLists")
                .appendPathParam(request.getAddressListId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAddressListCompartmentResponse.Builder::opcRequestId)
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
                        "Waas",
                        "ChangeCertificateCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/ChangeCertificateCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCertificateCompartmentRequest::builder)
                .basePath("/20181116")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCertificateCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeCustomProtectionRuleCompartmentResponse changeCustomProtectionRuleCompartment(
            ChangeCustomProtectionRuleCompartmentRequest request) {

        Validate.notBlank(
                request.getCustomProtectionRuleId(), "customProtectionRuleId must not be blank");
        Objects.requireNonNull(
                request.getChangeCustomProtectionRuleCompartmentDetails(),
                "changeCustomProtectionRuleCompartmentDetails is required");

        return clientCall(request, ChangeCustomProtectionRuleCompartmentResponse::builder)
                .logger(LOG, "changeCustomProtectionRuleCompartment")
                .serviceDetails(
                        "Waas",
                        "ChangeCustomProtectionRuleCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/ChangeCustomProtectionRuleCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCustomProtectionRuleCompartmentRequest::builder)
                .basePath("/20181116")
                .appendPathParam("customProtectionRules")
                .appendPathParam(request.getCustomProtectionRuleId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCustomProtectionRuleCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeWaasPolicyCompartmentResponse changeWaasPolicyCompartment(
            ChangeWaasPolicyCompartmentRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeWaasPolicyCompartmentDetails(),
                "changeWaasPolicyCompartmentDetails is required");

        return clientCall(request, ChangeWaasPolicyCompartmentResponse::builder)
                .logger(LOG, "changeWaasPolicyCompartment")
                .serviceDetails(
                        "Waas",
                        "ChangeWaasPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/ChangeWaasPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeWaasPolicyCompartmentRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeWaasPolicyCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAddressListResponse createAddressList(CreateAddressListRequest request) {
        Objects.requireNonNull(
                request.getCreateAddressListDetails(), "createAddressListDetails is required");

        return clientCall(request, CreateAddressListResponse::builder)
                .logger(LOG, "createAddressList")
                .serviceDetails(
                        "Waas",
                        "CreateAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/CreateAddressList")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAddressListRequest::builder)
                .basePath("/20181116")
                .appendPathParam("addressLists")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waas.model.AddressList.class,
                        CreateAddressListResponse.Builder::addressList)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAddressListResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateAddressListResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        Objects.requireNonNull(
                request.getCreateCertificateDetails(), "createCertificateDetails is required");

        return clientCall(request, CreateCertificateResponse::builder)
                .logger(LOG, "createCertificate")
                .serviceDetails(
                        "Waas",
                        "CreateCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/CreateCertificate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCertificateRequest::builder)
                .basePath("/20181116")
                .appendPathParam("certificates")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waas.model.Certificate.class,
                        CreateCertificateResponse.Builder::certificate)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCertificateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCertificateResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateCustomProtectionRuleResponse createCustomProtectionRule(
            CreateCustomProtectionRuleRequest request) {
        Objects.requireNonNull(
                request.getCreateCustomProtectionRuleDetails(),
                "createCustomProtectionRuleDetails is required");

        return clientCall(request, CreateCustomProtectionRuleResponse::builder)
                .logger(LOG, "createCustomProtectionRule")
                .serviceDetails(
                        "Waas",
                        "CreateCustomProtectionRule",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/CreateCustomProtectionRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCustomProtectionRuleRequest::builder)
                .basePath("/20181116")
                .appendPathParam("customProtectionRules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waas.model.CustomProtectionRule.class,
                        CreateCustomProtectionRuleResponse.Builder::customProtectionRule)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCustomProtectionRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateCustomProtectionRuleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateWaasPolicyResponse createWaasPolicy(CreateWaasPolicyRequest request) {
        Objects.requireNonNull(
                request.getCreateWaasPolicyDetails(), "createWaasPolicyDetails is required");

        return clientCall(request, CreateWaasPolicyResponse::builder)
                .logger(LOG, "createWaasPolicy")
                .serviceDetails(
                        "Waas",
                        "CreateWaasPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/CreateWaasPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateWaasPolicyRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateWaasPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateWaasPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateWaasPolicyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteAddressListResponse deleteAddressList(DeleteAddressListRequest request) {

        Validate.notBlank(request.getAddressListId(), "addressListId must not be blank");

        return clientCall(request, DeleteAddressListResponse::builder)
                .logger(LOG, "deleteAddressList")
                .serviceDetails(
                        "Waas",
                        "DeleteAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/DeleteAddressList")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAddressListRequest::builder)
                .basePath("/20181116")
                .appendPathParam("addressLists")
                .appendPathParam(request.getAddressListId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAddressListResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, DeleteCertificateResponse::builder)
                .logger(LOG, "deleteCertificate")
                .serviceDetails(
                        "Waas",
                        "DeleteCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/DeleteCertificate")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCertificateRequest::builder)
                .basePath("/20181116")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCustomProtectionRuleResponse deleteCustomProtectionRule(
            DeleteCustomProtectionRuleRequest request) {

        Validate.notBlank(
                request.getCustomProtectionRuleId(), "customProtectionRuleId must not be blank");

        return clientCall(request, DeleteCustomProtectionRuleResponse::builder)
                .logger(LOG, "deleteCustomProtectionRule")
                .serviceDetails(
                        "Waas",
                        "DeleteCustomProtectionRule",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/DeleteCustomProtectionRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCustomProtectionRuleRequest::builder)
                .basePath("/20181116")
                .appendPathParam("customProtectionRules")
                .appendPathParam(request.getCustomProtectionRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCustomProtectionRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteWaasPolicyResponse deleteWaasPolicy(DeleteWaasPolicyRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, DeleteWaasPolicyResponse::builder)
                .logger(LOG, "deleteWaasPolicy")
                .serviceDetails(
                        "Waas",
                        "DeleteWaasPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/DeleteWaasPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWaasPolicyRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWaasPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteWaasPolicyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetAddressListResponse getAddressList(GetAddressListRequest request) {

        Validate.notBlank(request.getAddressListId(), "addressListId must not be blank");

        return clientCall(request, GetAddressListResponse::builder)
                .logger(LOG, "getAddressList")
                .serviceDetails(
                        "Waas",
                        "GetAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/GetAddressList")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAddressListRequest::builder)
                .basePath("/20181116")
                .appendPathParam("addressLists")
                .appendPathParam(request.getAddressListId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.AddressList.class,
                        GetAddressListResponse.Builder::addressList)
                .handleResponseHeaderString("etag", GetAddressListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAddressListResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCertificateResponse getCertificate(GetCertificateRequest request) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, GetCertificateResponse::builder)
                .logger(LOG, "getCertificate")
                .serviceDetails(
                        "Waas",
                        "GetCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/GetCertificate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCertificateRequest::builder)
                .basePath("/20181116")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.Certificate.class,
                        GetCertificateResponse.Builder::certificate)
                .handleResponseHeaderString("etag", GetCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCustomProtectionRuleResponse getCustomProtectionRule(
            GetCustomProtectionRuleRequest request) {

        Validate.notBlank(
                request.getCustomProtectionRuleId(), "customProtectionRuleId must not be blank");

        return clientCall(request, GetCustomProtectionRuleResponse::builder)
                .logger(LOG, "getCustomProtectionRule")
                .serviceDetails(
                        "Waas",
                        "GetCustomProtectionRule",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/GetCustomProtectionRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCustomProtectionRuleRequest::builder)
                .basePath("/20181116")
                .appendPathParam("customProtectionRules")
                .appendPathParam(request.getCustomProtectionRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.CustomProtectionRule.class,
                        GetCustomProtectionRuleResponse.Builder::customProtectionRule)
                .handleResponseHeaderString("etag", GetCustomProtectionRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCustomProtectionRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDeviceFingerprintChallengeResponse getDeviceFingerprintChallenge(
            GetDeviceFingerprintChallengeRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, GetDeviceFingerprintChallengeResponse::builder)
                .logger(LOG, "getDeviceFingerprintChallenge")
                .serviceDetails(
                        "Waas",
                        "GetDeviceFingerprintChallenge",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/DeviceFingerprintChallenge/GetDeviceFingerprintChallenge")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDeviceFingerprintChallengeRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("deviceFingerprintChallenge")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.DeviceFingerprintChallenge.class,
                        GetDeviceFingerprintChallengeResponse.Builder::deviceFingerprintChallenge)
                .handleResponseHeaderString(
                        "etag", GetDeviceFingerprintChallengeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDeviceFingerprintChallengeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetHumanInteractionChallengeResponse getHumanInteractionChallenge(
            GetHumanInteractionChallengeRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, GetHumanInteractionChallengeResponse::builder)
                .logger(LOG, "getHumanInteractionChallenge")
                .serviceDetails(
                        "Waas",
                        "GetHumanInteractionChallenge",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HumanInteractionChallenge/GetHumanInteractionChallenge")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHumanInteractionChallengeRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("humanInteractionChallenge")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.HumanInteractionChallenge.class,
                        GetHumanInteractionChallengeResponse.Builder::humanInteractionChallenge)
                .handleResponseHeaderString(
                        "etag", GetHumanInteractionChallengeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetHumanInteractionChallengeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJsChallengeResponse getJsChallenge(GetJsChallengeRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, GetJsChallengeResponse::builder)
                .logger(LOG, "getJsChallenge")
                .serviceDetails(
                        "Waas",
                        "GetJsChallenge",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/JsChallenge/GetJsChallenge")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJsChallengeRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("jsChallenge")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.JsChallenge.class,
                        GetJsChallengeResponse.Builder::jsChallenge)
                .handleResponseHeaderString("etag", GetJsChallengeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJsChallengeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPolicyConfigResponse getPolicyConfig(GetPolicyConfigRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, GetPolicyConfigResponse::builder)
                .logger(LOG, "getPolicyConfig")
                .serviceDetails(
                        "Waas",
                        "GetPolicyConfig",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/PolicyConfig/GetPolicyConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPolicyConfigRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("policyConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.PolicyConfig.class,
                        GetPolicyConfigResponse.Builder::policyConfig)
                .handleResponseHeaderString("etag", GetPolicyConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPolicyConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetProtectionRuleResponse getProtectionRule(GetProtectionRuleRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        Validate.notBlank(request.getProtectionRuleKey(), "protectionRuleKey must not be blank");

        return clientCall(request, GetProtectionRuleResponse::builder)
                .logger(LOG, "getProtectionRule")
                .serviceDetails(
                        "Waas",
                        "GetProtectionRule",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionRule/GetProtectionRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProtectionRuleRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("protectionRules")
                .appendPathParam(request.getProtectionRuleKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.ProtectionRule.class,
                        GetProtectionRuleResponse.Builder::protectionRule)
                .handleResponseHeaderString("etag", GetProtectionRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProtectionRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetProtectionSettingsResponse getProtectionSettings(
            GetProtectionSettingsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, GetProtectionSettingsResponse::builder)
                .logger(LOG, "getProtectionSettings")
                .serviceDetails(
                        "Waas",
                        "GetProtectionSettings",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionSettings/GetProtectionSettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProtectionSettingsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("protectionSettings")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.ProtectionSettings.class,
                        GetProtectionSettingsResponse.Builder::protectionSettings)
                .handleResponseHeaderString("etag", GetProtectionSettingsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProtectionSettingsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWaasPolicyResponse getWaasPolicy(GetWaasPolicyRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, GetWaasPolicyResponse::builder)
                .logger(LOG, "getWaasPolicy")
                .serviceDetails(
                        "Waas",
                        "GetWaasPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/GetWaasPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWaasPolicyRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.WaasPolicy.class,
                        GetWaasPolicyResponse.Builder::waasPolicy)
                .handleResponseHeaderString("etag", GetWaasPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWaasPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWafAddressRateLimitingResponse getWafAddressRateLimiting(
            GetWafAddressRateLimitingRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, GetWafAddressRateLimitingResponse::builder)
                .logger(LOG, "getWafAddressRateLimiting")
                .serviceDetails(
                        "Waas",
                        "GetWafAddressRateLimiting",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressRateLimiting/GetWafAddressRateLimiting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWafAddressRateLimitingRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("addressRateLimiting")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.AddressRateLimiting.class,
                        GetWafAddressRateLimitingResponse.Builder::addressRateLimiting)
                .handleResponseHeaderString("etag", GetWafAddressRateLimitingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWafAddressRateLimitingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWafConfigResponse getWafConfig(GetWafConfigRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, GetWafConfigResponse::builder)
                .logger(LOG, "getWafConfig")
                .serviceDetails(
                        "Waas",
                        "GetWafConfig",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafConfig/GetWafConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWafConfigRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.WafConfig.class,
                        GetWafConfigResponse.Builder::wafConfig)
                .handleResponseHeaderString("etag", GetWafConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWafConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Waas",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20181116")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.waas.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderFloat(
                        "Retry-After", GetWorkRequestResponse.Builder::retryAfter)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAccessRulesResponse listAccessRules(ListAccessRulesRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListAccessRulesResponse::builder)
                .logger(LOG, "listAccessRules")
                .serviceDetails(
                        "Waas",
                        "ListAccessRules",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AccessRule/ListAccessRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAccessRulesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("accessRules")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.AccessRule.class,
                        ListAccessRulesResponse.Builder::items)
                .handleResponseHeaderString("etag", ListAccessRulesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListAccessRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAccessRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAddressListsResponse listAddressLists(ListAddressListsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAddressListsResponse::builder)
                .logger(LOG, "listAddressLists")
                .serviceDetails(
                        "Waas",
                        "ListAddressLists",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/ListAddressLists")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAddressListsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("addressLists")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.AddressListSummary.class,
                        ListAddressListsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAddressListsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAddressListsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListCachingRulesResponse listCachingRules(ListCachingRulesRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListCachingRulesResponse::builder)
                .logger(LOG, "listCachingRules")
                .serviceDetails(
                        "Waas",
                        "ListCachingRules",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CachingRuleSummary/ListCachingRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCachingRulesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("cachingRules")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.CachingRuleSummary.class,
                        ListCachingRulesResponse.Builder::items)
                .handleResponseHeaderString("etag", ListCachingRulesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListCachingRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCachingRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListCaptchasResponse listCaptchas(ListCaptchasRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListCaptchasResponse::builder)
                .logger(LOG, "listCaptchas")
                .serviceDetails(
                        "Waas",
                        "ListCaptchas",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Captcha/ListCaptchas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCaptchasRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("captchas")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.Captcha.class,
                        ListCaptchasResponse.Builder::items)
                .handleResponseHeaderString("etag", ListCaptchasResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListCaptchasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCaptchasResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCertificatesResponse::builder)
                .logger(LOG, "listCertificates")
                .serviceDetails(
                        "Waas",
                        "ListCertificates",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CertificateSummary/ListCertificates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCertificatesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("certificates")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.CertificateSummary.class,
                        ListCertificatesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListCertificatesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCertificatesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListCustomProtectionRulesResponse listCustomProtectionRules(
            ListCustomProtectionRulesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCustomProtectionRulesResponse::builder)
                .logger(LOG, "listCustomProtectionRules")
                .serviceDetails(
                        "Waas",
                        "ListCustomProtectionRules",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/ListCustomProtectionRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCustomProtectionRulesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("customProtectionRules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.CustomProtectionRuleSummary.class,
                        ListCustomProtectionRulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListCustomProtectionRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCustomProtectionRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListEdgeSubnetsResponse listEdgeSubnets(ListEdgeSubnetsRequest request) {

        return clientCall(request, ListEdgeSubnetsResponse::builder)
                .logger(LOG, "listEdgeSubnets")
                .serviceDetails(
                        "Waas",
                        "ListEdgeSubnets",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/EdgeSubnet/ListEdgeSubnets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEdgeSubnetsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("edgeSubnets")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.EdgeSubnet.class,
                        ListEdgeSubnetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListEdgeSubnetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListEdgeSubnetsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListGoodBotsResponse listGoodBots(ListGoodBotsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListGoodBotsResponse::builder)
                .logger(LOG, "listGoodBots")
                .serviceDetails(
                        "Waas",
                        "ListGoodBots",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/GoodBot/ListGoodBots")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGoodBotsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("goodBots")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.GoodBot.class,
                        ListGoodBotsResponse.Builder::items)
                .handleResponseHeaderString("etag", ListGoodBotsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListGoodBotsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGoodBotsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListProtectionRulesResponse listProtectionRules(ListProtectionRulesRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListProtectionRulesResponse::builder)
                .logger(LOG, "listProtectionRules")
                .serviceDetails(
                        "Waas",
                        "ListProtectionRules",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionRule/ListProtectionRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProtectionRulesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("protectionRules")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "modSecurityRuleId",
                        request.getModSecurityRuleId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "action",
                        request.getAction(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.ProtectionRule.class,
                        ListProtectionRulesResponse.Builder::items)
                .handleResponseHeaderString("etag", ListProtectionRulesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListProtectionRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListProtectionRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListRecommendationsResponse::builder)
                .logger(LOG, "listRecommendations")
                .serviceDetails(
                        "Waas",
                        "ListRecommendations",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Recommendation/ListRecommendations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRecommendationsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("recommendations")
                .appendEnumQueryParam("recommendedAction", request.getRecommendedAction())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.Recommendation.class,
                        ListRecommendationsResponse.Builder::items)
                .handleResponseHeaderString("etag", ListRecommendationsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecommendationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecommendationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListThreatFeedsResponse listThreatFeeds(ListThreatFeedsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListThreatFeedsResponse::builder)
                .logger(LOG, "listThreatFeeds")
                .serviceDetails(
                        "Waas",
                        "ListThreatFeeds",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ThreatFeed/ListThreatFeeds")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListThreatFeedsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("threatFeeds")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.ThreatFeed.class,
                        ListThreatFeedsResponse.Builder::items)
                .handleResponseHeaderString("etag", ListThreatFeedsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListThreatFeedsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListThreatFeedsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWaasPoliciesResponse listWaasPolicies(ListWaasPoliciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWaasPoliciesResponse::builder)
                .logger(LOG, "listWaasPolicies")
                .serviceDetails(
                        "Waas",
                        "ListWaasPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/ListWaasPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWaasPoliciesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.WaasPolicySummary.class,
                        ListWaasPoliciesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWaasPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWaasPoliciesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWaasPolicyCustomProtectionRulesResponse listWaasPolicyCustomProtectionRules(
            ListWaasPolicyCustomProtectionRulesRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListWaasPolicyCustomProtectionRulesResponse::builder)
                .logger(LOG, "listWaasPolicyCustomProtectionRules")
                .serviceDetails(
                        "Waas",
                        "ListWaasPolicyCustomProtectionRules",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/ListWaasPolicyCustomProtectionRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWaasPolicyCustomProtectionRulesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("customProtectionRules")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "modSecurityRuleId",
                        request.getModSecurityRuleId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "action",
                        request.getAction(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.WaasPolicyCustomProtectionRuleSummary.class,
                        ListWaasPolicyCustomProtectionRulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "etag", ListWaasPolicyCustomProtectionRulesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListWaasPolicyCustomProtectionRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListWaasPolicyCustomProtectionRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWafBlockedRequestsResponse listWafBlockedRequests(
            ListWafBlockedRequestsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListWafBlockedRequestsResponse::builder)
                .logger(LOG, "listWafBlockedRequests")
                .serviceDetails(
                        "Waas",
                        "ListWafBlockedRequests",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafBlockedRequest/ListWafBlockedRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWafBlockedRequestsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("reports")
                .appendPathParam("waf")
                .appendPathParam("blocked")
                .appendQueryParam(
                        "timeObservedGreaterThanOrEqualTo",
                        request.getTimeObservedGreaterThanOrEqualTo())
                .appendQueryParam("timeObservedLessThan", request.getTimeObservedLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "wafFeature",
                        request.getWafFeature(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.WafBlockedRequest.class,
                        ListWafBlockedRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWafBlockedRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWafBlockedRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWafLogsResponse listWafLogs(ListWafLogsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListWafLogsResponse::builder)
                .logger(LOG, "listWafLogs")
                .serviceDetails(
                        "Waas",
                        "ListWafLogs",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafLog/ListWafLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWafLogsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafLogs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam(
                        "timeObservedGreaterThanOrEqualTo",
                        request.getTimeObservedGreaterThanOrEqualTo())
                .appendQueryParam("timeObservedLessThan", request.getTimeObservedLessThan())
                .appendQueryParam("textContains", request.getTextContains())
                .appendListQueryParam(
                        "accessRuleKey",
                        request.getAccessRuleKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "action",
                        request.getAction(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "clientAddress",
                        request.getClientAddress(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "countryCode",
                        request.getCountryCode(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "countryName",
                        request.getCountryName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "fingerprint",
                        request.getFingerprint(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "httpMethod",
                        request.getHttpMethod(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "incidentKey",
                        request.getIncidentKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "logType",
                        request.getLogType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "originAddress",
                        request.getOriginAddress(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "referrer",
                        request.getReferrer(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "requestUrl",
                        request.getRequestUrl(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "responseCode",
                        request.getResponseCode(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "threatFeedKey",
                        request.getThreatFeedKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "userAgent",
                        request.getUserAgent(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "protectionRuleKey",
                        request.getProtectionRuleKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.WafLog.class, ListWafLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWafLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWafLogsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWafRequestsResponse listWafRequests(ListWafRequestsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListWafRequestsResponse::builder)
                .logger(LOG, "listWafRequests")
                .serviceDetails(
                        "Waas",
                        "ListWafRequests",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafRequest/ListWafRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWafRequestsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("reports")
                .appendPathParam("waf")
                .appendPathParam("requests")
                .appendQueryParam(
                        "timeObservedGreaterThanOrEqualTo",
                        request.getTimeObservedGreaterThanOrEqualTo())
                .appendQueryParam("timeObservedLessThan", request.getTimeObservedLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.WafRequest.class,
                        ListWafRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWafRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWafRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWafTrafficResponse listWafTraffic(ListWafTrafficRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListWafTrafficResponse::builder)
                .logger(LOG, "listWafTraffic")
                .serviceDetails(
                        "Waas",
                        "ListWafTraffic",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafTrafficDatum/ListWafTraffic")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWafTrafficRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("reports")
                .appendPathParam("waf")
                .appendPathParam("traffic")
                .appendQueryParam(
                        "timeObservedGreaterThanOrEqualTo",
                        request.getTimeObservedGreaterThanOrEqualTo())
                .appendQueryParam("timeObservedLessThan", request.getTimeObservedLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.WafTrafficDatum.class,
                        ListWafTrafficResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWafTrafficResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWafTrafficResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWhitelistsResponse listWhitelists(ListWhitelistsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, ListWhitelistsResponse::builder)
                .logger(LOG, "listWhitelists")
                .serviceDetails(
                        "Waas",
                        "ListWhitelists",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Whitelist/ListWhitelists")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWhitelistsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("whitelists")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.Whitelist.class,
                        ListWhitelistsResponse.Builder::items)
                .handleResponseHeaderString("etag", ListWhitelistsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListWhitelistsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWhitelistsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getWaasPolicyId(), "waasPolicyId is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "Waas",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WorkRequestSummary/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("workRequests")
                .appendQueryParam("waasPolicyId", request.getWaasPolicyId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.waas.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PurgeCacheResponse purgeCache(PurgeCacheRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        return clientCall(request, PurgeCacheResponse::builder)
                .logger(LOG, "purgeCache")
                .serviceDetails(
                        "Waas",
                        "PurgeCache",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/PurgeCache/PurgeCache")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PurgeCacheRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("actions")
                .appendPathParam("purgeCache")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", PurgeCacheResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", PurgeCacheResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAccessRulesResponse updateAccessRules(UpdateAccessRulesRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(request.getAccessRules(), "accessRules is required");

        return clientCall(request, UpdateAccessRulesResponse::builder)
                .logger(LOG, "updateAccessRules")
                .serviceDetails(
                        "Waas",
                        "UpdateAccessRules",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AccessRule/UpdateAccessRules")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAccessRulesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("accessRules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAccessRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAccessRulesResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAddressListResponse updateAddressList(UpdateAddressListRequest request) {

        Validate.notBlank(request.getAddressListId(), "addressListId must not be blank");

        return clientCall(request, UpdateAddressListResponse::builder)
                .logger(LOG, "updateAddressList")
                .serviceDetails(
                        "Waas",
                        "UpdateAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/UpdateAddressList")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAddressListRequest::builder)
                .basePath("/20181116")
                .appendPathParam("addressLists")
                .appendPathParam(request.getAddressListId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waas.model.AddressList.class,
                        UpdateAddressListResponse.Builder::addressList)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAddressListResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateAddressListResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateCachingRulesResponse updateCachingRules(UpdateCachingRulesRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(request.getCachingRulesDetails(), "cachingRulesDetails is required");

        return clientCall(request, UpdateCachingRulesResponse::builder)
                .logger(LOG, "updateCachingRules")
                .serviceDetails(
                        "Waas",
                        "UpdateCachingRules",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CachingRule/UpdateCachingRules")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCachingRulesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("cachingRules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCachingRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateCachingRulesResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateCaptchasResponse updateCaptchas(UpdateCaptchasRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(request.getCaptchas(), "captchas is required");

        return clientCall(request, UpdateCaptchasResponse::builder)
                .logger(LOG, "updateCaptchas")
                .serviceDetails(
                        "Waas",
                        "UpdateCaptchas",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Captcha/UpdateCaptchas")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCaptchasRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("captchas")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCaptchasResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateCaptchasResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, UpdateCertificateResponse::builder)
                .logger(LOG, "updateCertificate")
                .serviceDetails(
                        "Waas",
                        "UpdateCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/UpdateCertificate")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCertificateRequest::builder)
                .basePath("/20181116")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waas.model.Certificate.class,
                        UpdateCertificateResponse.Builder::certificate)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCertificateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCertificateResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateCustomProtectionRuleResponse updateCustomProtectionRule(
            UpdateCustomProtectionRuleRequest request) {

        Validate.notBlank(
                request.getCustomProtectionRuleId(), "customProtectionRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCustomProtectionRuleDetails(),
                "updateCustomProtectionRuleDetails is required");

        return clientCall(request, UpdateCustomProtectionRuleResponse::builder)
                .logger(LOG, "updateCustomProtectionRule")
                .serviceDetails(
                        "Waas",
                        "UpdateCustomProtectionRule",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/UpdateCustomProtectionRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCustomProtectionRuleRequest::builder)
                .basePath("/20181116")
                .appendPathParam("customProtectionRules")
                .appendPathParam(request.getCustomProtectionRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waas.model.CustomProtectionRule.class,
                        UpdateCustomProtectionRuleResponse.Builder::customProtectionRule)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCustomProtectionRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateCustomProtectionRuleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateDeviceFingerprintChallengeResponse updateDeviceFingerprintChallenge(
            UpdateDeviceFingerprintChallengeRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDeviceFingerprintChallengeDetails(),
                "updateDeviceFingerprintChallengeDetails is required");

        return clientCall(request, UpdateDeviceFingerprintChallengeResponse::builder)
                .logger(LOG, "updateDeviceFingerprintChallenge")
                .serviceDetails(
                        "Waas",
                        "UpdateDeviceFingerprintChallenge",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/DeviceFingerprintChallenge/UpdateDeviceFingerprintChallenge")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDeviceFingerprintChallengeRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("deviceFingerprintChallenge")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDeviceFingerprintChallengeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDeviceFingerprintChallengeResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateGoodBotsResponse updateGoodBots(UpdateGoodBotsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(request.getGoodBots(), "goodBots is required");

        return clientCall(request, UpdateGoodBotsResponse::builder)
                .logger(LOG, "updateGoodBots")
                .serviceDetails(
                        "Waas",
                        "UpdateGoodBots",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/GoodBot/UpdateGoodBots")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGoodBotsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("goodBots")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGoodBotsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateGoodBotsResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateHumanInteractionChallengeResponse updateHumanInteractionChallenge(
            UpdateHumanInteractionChallengeRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateHumanInteractionChallengeDetails(),
                "updateHumanInteractionChallengeDetails is required");

        return clientCall(request, UpdateHumanInteractionChallengeResponse::builder)
                .logger(LOG, "updateHumanInteractionChallenge")
                .serviceDetails(
                        "Waas",
                        "UpdateHumanInteractionChallenge",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HumanInteractionChallenge/UpdateHumanInteractionChallenge")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHumanInteractionChallengeRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("humanInteractionChallenge")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateHumanInteractionChallengeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateHumanInteractionChallengeResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateJsChallengeResponse updateJsChallenge(UpdateJsChallengeRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateJsChallengeDetails(), "updateJsChallengeDetails is required");

        return clientCall(request, UpdateJsChallengeResponse::builder)
                .logger(LOG, "updateJsChallenge")
                .serviceDetails(
                        "Waas",
                        "UpdateJsChallenge",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/JsChallenge/UpdateJsChallenge")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJsChallengeRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("jsChallenge")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJsChallengeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateJsChallengeResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdatePolicyConfigResponse updatePolicyConfig(UpdatePolicyConfigRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePolicyConfigDetails(), "updatePolicyConfigDetails is required");

        return clientCall(request, UpdatePolicyConfigResponse::builder)
                .logger(LOG, "updatePolicyConfig")
                .serviceDetails(
                        "Waas",
                        "UpdatePolicyConfig",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/PolicyConfig/UpdatePolicyConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePolicyConfigRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("policyConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePolicyConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdatePolicyConfigResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateProtectionRulesResponse updateProtectionRules(
            UpdateProtectionRulesRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(request.getProtectionRules(), "protectionRules is required");

        return clientCall(request, UpdateProtectionRulesResponse::builder)
                .logger(LOG, "updateProtectionRules")
                .serviceDetails(
                        "Waas",
                        "UpdateProtectionRules",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionRule/UpdateProtectionRules")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProtectionRulesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("protectionRules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProtectionRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateProtectionRulesResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateProtectionSettingsResponse updateProtectionSettings(
            UpdateProtectionSettingsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProtectionSettingsDetails(),
                "updateProtectionSettingsDetails is required");

        return clientCall(request, UpdateProtectionSettingsResponse::builder)
                .logger(LOG, "updateProtectionSettings")
                .serviceDetails(
                        "Waas",
                        "UpdateProtectionSettings",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionSettings/UpdateProtectionSettings")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProtectionSettingsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("protectionSettings")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProtectionSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateProtectionSettingsResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateThreatFeedsResponse updateThreatFeeds(UpdateThreatFeedsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(request.getThreatFeeds(), "threatFeeds is required");

        return clientCall(request, UpdateThreatFeedsResponse::builder)
                .logger(LOG, "updateThreatFeeds")
                .serviceDetails(
                        "Waas",
                        "UpdateThreatFeeds",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ThreatFeed/UpdateThreatFeeds")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateThreatFeedsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("threatFeeds")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateThreatFeedsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateThreatFeedsResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateWaasPolicyResponse updateWaasPolicy(UpdateWaasPolicyRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWaasPolicyDetails(), "updateWaasPolicyDetails is required");

        return clientCall(request, UpdateWaasPolicyResponse::builder)
                .logger(LOG, "updateWaasPolicy")
                .serviceDetails(
                        "Waas",
                        "UpdateWaasPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/UpdateWaasPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWaasPolicyRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWaasPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateWaasPolicyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateWaasPolicyCustomProtectionRulesResponse updateWaasPolicyCustomProtectionRules(
            UpdateWaasPolicyCustomProtectionRulesRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCustomProtectionRulesDetails(),
                "updateCustomProtectionRulesDetails is required");

        return clientCall(request, UpdateWaasPolicyCustomProtectionRulesResponse::builder)
                .logger(LOG, "updateWaasPolicyCustomProtectionRules")
                .serviceDetails(
                        "Waas",
                        "UpdateWaasPolicyCustomProtectionRules",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/UpdateWaasPolicyCustomProtectionRules")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWaasPolicyCustomProtectionRulesRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("customProtectionRules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateWaasPolicyCustomProtectionRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateWaasPolicyCustomProtectionRulesResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateWafAddressRateLimitingResponse updateWafAddressRateLimiting(
            UpdateWafAddressRateLimitingRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWafAddressRateLimitingDetails(),
                "updateWafAddressRateLimitingDetails is required");

        return clientCall(request, UpdateWafAddressRateLimitingResponse::builder)
                .logger(LOG, "updateWafAddressRateLimiting")
                .serviceDetails(
                        "Waas",
                        "UpdateWafAddressRateLimiting",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressRateLimiting/UpdateWafAddressRateLimiting")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWafAddressRateLimitingRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("addressRateLimiting")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateWafAddressRateLimitingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateWafAddressRateLimitingResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateWafConfigResponse updateWafConfig(UpdateWafConfigRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWafConfigDetails(), "updateWafConfigDetails is required");

        return clientCall(request, UpdateWafConfigResponse::builder)
                .logger(LOG, "updateWafConfig")
                .serviceDetails(
                        "Waas",
                        "UpdateWafConfig",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafConfig/UpdateWafConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWafConfigRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWafConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateWafConfigResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateWhitelistsResponse updateWhitelists(UpdateWhitelistsRequest request) {

        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");
        Objects.requireNonNull(request.getWhitelists(), "whitelists is required");

        return clientCall(request, UpdateWhitelistsResponse::builder)
                .logger(LOG, "updateWhitelists")
                .serviceDetails(
                        "Waas",
                        "UpdateWhitelists",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Whitelist/UpdateWhitelists")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWhitelistsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("waasPolicies")
                .appendPathParam(request.getWaasPolicyId())
                .appendPathParam("wafConfig")
                .appendPathParam("whitelists")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWhitelistsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateWhitelistsResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public WaasWaiters getWaiters() {
        return waiters;
    }

    @Override
    public WaasPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
