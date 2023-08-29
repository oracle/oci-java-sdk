/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Waas service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class WaasAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements WaasAsync {
    /** Service instance for Waas. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("WAAS")
                    .serviceEndpointPrefix("waas")
                    .serviceEndpointTemplate("https://waas.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WaasAsyncClient.class);

    WaasAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WaasAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "waas";
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
        public WaasAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new WaasAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AcceptRecommendationsResponse> acceptRecommendations(
            AcceptRecommendationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AcceptRecommendationsRequest, AcceptRecommendationsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAddressListCompartmentResponse>
            changeAddressListCompartment(
                    ChangeAddressListCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAddressListCompartmentRequest,
                                    ChangeAddressListCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCustomProtectionRuleCompartmentResponse>
            changeCustomProtectionRuleCompartment(
                    ChangeCustomProtectionRuleCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCustomProtectionRuleCompartmentRequest,
                                    ChangeCustomProtectionRuleCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeWaasPolicyCompartmentResponse>
            changeWaasPolicyCompartment(
                    ChangeWaasPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeWaasPolicyCompartmentRequest,
                                    ChangeWaasPolicyCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAddressListResponse> createAddressList(
            CreateAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAddressListRequest, CreateAddressListResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomProtectionRuleResponse>
            createCustomProtectionRule(
                    CreateCustomProtectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCustomProtectionRuleRequest,
                                    CreateCustomProtectionRuleResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateWaasPolicyResponse> createWaasPolicy(
            CreateWaasPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateWaasPolicyRequest, CreateWaasPolicyResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAddressListResponse> deleteAddressList(
            DeleteAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAddressListRequest, DeleteAddressListResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomProtectionRuleResponse>
            deleteCustomProtectionRule(
                    DeleteCustomProtectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCustomProtectionRuleRequest,
                                    DeleteCustomProtectionRuleResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteWaasPolicyResponse> deleteWaasPolicy(
            DeleteWaasPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWaasPolicyRequest, DeleteWaasPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAddressListResponse> getAddressList(
            GetAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAddressListRequest, GetAddressListResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.AddressList.class,
                        GetAddressListResponse.Builder::addressList)
                .handleResponseHeaderString("etag", GetAddressListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAddressListResponse.Builder::opcRequestId)
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
                .handleBody(
                        com.oracle.bmc.waas.model.Certificate.class,
                        GetCertificateResponse.Builder::certificate)
                .handleResponseHeaderString("etag", GetCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCertificateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCustomProtectionRuleResponse> getCustomProtectionRule(
            GetCustomProtectionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCustomProtectionRuleRequest, GetCustomProtectionRuleResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.CustomProtectionRule.class,
                        GetCustomProtectionRuleResponse.Builder::customProtectionRule)
                .handleResponseHeaderString("etag", GetCustomProtectionRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCustomProtectionRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceFingerprintChallengeResponse>
            getDeviceFingerprintChallenge(
                    GetDeviceFingerprintChallengeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDeviceFingerprintChallengeRequest,
                                    GetDeviceFingerprintChallengeResponse>
                            handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.DeviceFingerprintChallenge.class,
                        GetDeviceFingerprintChallengeResponse.Builder::deviceFingerprintChallenge)
                .handleResponseHeaderString(
                        "etag", GetDeviceFingerprintChallengeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDeviceFingerprintChallengeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHumanInteractionChallengeResponse>
            getHumanInteractionChallenge(
                    GetHumanInteractionChallengeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetHumanInteractionChallengeRequest,
                                    GetHumanInteractionChallengeResponse>
                            handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.HumanInteractionChallenge.class,
                        GetHumanInteractionChallengeResponse.Builder::humanInteractionChallenge)
                .handleResponseHeaderString(
                        "etag", GetHumanInteractionChallengeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetHumanInteractionChallengeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJsChallengeResponse> getJsChallenge(
            GetJsChallengeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJsChallengeRequest, GetJsChallengeResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.JsChallenge.class,
                        GetJsChallengeResponse.Builder::jsChallenge)
                .handleResponseHeaderString("etag", GetJsChallengeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJsChallengeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyConfigResponse> getPolicyConfig(
            GetPolicyConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPolicyConfigRequest, GetPolicyConfigResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.PolicyConfig.class,
                        GetPolicyConfigResponse.Builder::policyConfig)
                .handleResponseHeaderString("etag", GetPolicyConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPolicyConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProtectionRuleResponse> getProtectionRule(
            GetProtectionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetProtectionRuleRequest, GetProtectionRuleResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.ProtectionRule.class,
                        GetProtectionRuleResponse.Builder::protectionRule)
                .handleResponseHeaderString("etag", GetProtectionRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProtectionRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProtectionSettingsResponse> getProtectionSettings(
            GetProtectionSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetProtectionSettingsRequest, GetProtectionSettingsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.ProtectionSettings.class,
                        GetProtectionSettingsResponse.Builder::protectionSettings)
                .handleResponseHeaderString("etag", GetProtectionSettingsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProtectionSettingsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWaasPolicyResponse> getWaasPolicy(
            GetWaasPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetWaasPolicyRequest, GetWaasPolicyResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.WaasPolicy.class,
                        GetWaasPolicyResponse.Builder::waasPolicy)
                .handleResponseHeaderString("etag", GetWaasPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWaasPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWafAddressRateLimitingResponse> getWafAddressRateLimiting(
            GetWafAddressRateLimitingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWafAddressRateLimitingRequest, GetWafAddressRateLimitingResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.AddressRateLimiting.class,
                        GetWafAddressRateLimitingResponse.Builder::addressRateLimiting)
                .handleResponseHeaderString("etag", GetWafAddressRateLimitingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWafAddressRateLimitingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWafConfigResponse> getWafConfig(
            GetWafConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetWafConfigRequest, GetWafConfigResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.waas.model.WafConfig.class,
                        GetWafConfigResponse.Builder::wafConfig)
                .handleResponseHeaderString("etag", GetWafConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWafConfigResponse.Builder::opcRequestId)
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
                .handleBody(
                        com.oracle.bmc.waas.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderFloat(
                        "Retry-After", GetWorkRequestResponse.Builder::retryAfter)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAccessRulesResponse> listAccessRules(
            ListAccessRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAccessRulesRequest, ListAccessRulesResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.AccessRule.class,
                        ListAccessRulesResponse.Builder::items)
                .handleResponseHeaderString("etag", ListAccessRulesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListAccessRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAccessRulesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAddressListsResponse> listAddressLists(
            ListAddressListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAddressListsRequest, ListAddressListsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.waas.model.AddressListSummary.class,
                        ListAddressListsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAddressListsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAddressListsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCachingRulesResponse> listCachingRules(
            ListCachingRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCachingRulesRequest, ListCachingRulesResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.CachingRuleSummary.class,
                        ListCachingRulesResponse.Builder::items)
                .handleResponseHeaderString("etag", ListCachingRulesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListCachingRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCachingRulesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCaptchasResponse> listCaptchas(
            ListCaptchasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListCaptchasRequest, ListCaptchasResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.Captcha.class,
                        ListCaptchasResponse.Builder::items)
                .handleResponseHeaderString("etag", ListCaptchasResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListCaptchasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCaptchasResponse.Builder::opcRequestId)
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
                .handleBodyList(
                        com.oracle.bmc.waas.model.CertificateSummary.class,
                        ListCertificatesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListCertificatesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCertificatesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCustomProtectionRulesResponse> listCustomProtectionRules(
            ListCustomProtectionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomProtectionRulesRequest, ListCustomProtectionRulesResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.waas.model.CustomProtectionRuleSummary.class,
                        ListCustomProtectionRulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListCustomProtectionRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCustomProtectionRulesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEdgeSubnetsResponse> listEdgeSubnets(
            ListEdgeSubnetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEdgeSubnetsRequest, ListEdgeSubnetsResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.EdgeSubnet.class,
                        ListEdgeSubnetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListEdgeSubnetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListEdgeSubnetsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGoodBotsResponse> listGoodBots(
            ListGoodBotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGoodBotsRequest, ListGoodBotsResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.GoodBot.class,
                        ListGoodBotsResponse.Builder::items)
                .handleResponseHeaderString("etag", ListGoodBotsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListGoodBotsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGoodBotsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProtectionRulesResponse> listProtectionRules(
            ListProtectionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProtectionRulesRequest, ListProtectionRulesResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.ProtectionRule.class,
                        ListProtectionRulesResponse.Builder::items)
                .handleResponseHeaderString("etag", ListProtectionRulesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListProtectionRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListProtectionRulesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResponse> listRecommendations(
            ListRecommendationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRecommendationsRequest, ListRecommendationsResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.Recommendation.class,
                        ListRecommendationsResponse.Builder::items)
                .handleResponseHeaderString("etag", ListRecommendationsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecommendationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecommendationsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListThreatFeedsResponse> listThreatFeeds(
            ListThreatFeedsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListThreatFeedsRequest, ListThreatFeedsResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.ThreatFeed.class,
                        ListThreatFeedsResponse.Builder::items)
                .handleResponseHeaderString("etag", ListThreatFeedsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListThreatFeedsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListThreatFeedsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWaasPoliciesResponse> listWaasPolicies(
            ListWaasPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWaasPoliciesRequest, ListWaasPoliciesResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.waas.model.WaasPolicySummary.class,
                        ListWaasPoliciesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWaasPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWaasPoliciesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWaasPolicyCustomProtectionRulesResponse>
            listWaasPolicyCustomProtectionRules(
                    ListWaasPolicyCustomProtectionRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListWaasPolicyCustomProtectionRulesRequest,
                                    ListWaasPolicyCustomProtectionRulesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWafBlockedRequestsResponse> listWafBlockedRequests(
            ListWafBlockedRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWafBlockedRequestsRequest, ListWafBlockedRequestsResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.WafBlockedRequest.class,
                        ListWafBlockedRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWafBlockedRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWafBlockedRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWafLogsResponse> listWafLogs(
            ListWafLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListWafLogsRequest, ListWafLogsResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.WafLog.class, ListWafLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWafLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWafLogsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWafRequestsResponse> listWafRequests(
            ListWafRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWafRequestsRequest, ListWafRequestsResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.WafRequest.class,
                        ListWafRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWafRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWafRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWafTrafficResponse> listWafTraffic(
            ListWafTrafficRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWafTrafficRequest, ListWafTrafficResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.WafTrafficDatum.class,
                        ListWafTrafficResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWafTrafficResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWafTrafficResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWhitelistsResponse> listWhitelists(
            ListWhitelistsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWhitelistsRequest, ListWhitelistsResponse>
                    handler) {

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
                .handleBodyList(
                        com.oracle.bmc.waas.model.Whitelist.class,
                        ListWhitelistsResponse.Builder::items)
                .handleResponseHeaderString("etag", ListWhitelistsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListWhitelistsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWhitelistsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.waas.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PurgeCacheResponse> purgeCache(
            PurgeCacheRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PurgeCacheRequest, PurgeCacheResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccessRulesResponse> updateAccessRules(
            UpdateAccessRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAccessRulesRequest, UpdateAccessRulesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAddressListResponse> updateAddressList(
            UpdateAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAddressListRequest, UpdateAddressListResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCachingRulesResponse> updateCachingRules(
            UpdateCachingRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCachingRulesRequest, UpdateCachingRulesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCaptchasResponse> updateCaptchas(
            UpdateCaptchasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCaptchasRequest, UpdateCaptchasResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateResponse> updateCertificate(
            UpdateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCertificateRequest, UpdateCertificateResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomProtectionRuleResponse>
            updateCustomProtectionRule(
                    UpdateCustomProtectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCustomProtectionRuleRequest,
                                    UpdateCustomProtectionRuleResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceFingerprintChallengeResponse>
            updateDeviceFingerprintChallenge(
                    UpdateDeviceFingerprintChallengeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDeviceFingerprintChallengeRequest,
                                    UpdateDeviceFingerprintChallengeResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateGoodBotsResponse> updateGoodBots(
            UpdateGoodBotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateGoodBotsRequest, UpdateGoodBotsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateHumanInteractionChallengeResponse>
            updateHumanInteractionChallenge(
                    UpdateHumanInteractionChallengeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateHumanInteractionChallengeRequest,
                                    UpdateHumanInteractionChallengeResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateJsChallengeResponse> updateJsChallenge(
            UpdateJsChallengeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateJsChallengeRequest, UpdateJsChallengeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyConfigResponse> updatePolicyConfig(
            UpdatePolicyConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePolicyConfigRequest, UpdatePolicyConfigResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProtectionRulesResponse> updateProtectionRules(
            UpdateProtectionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateProtectionRulesRequest, UpdateProtectionRulesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProtectionSettingsResponse> updateProtectionSettings(
            UpdateProtectionSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateProtectionSettingsRequest, UpdateProtectionSettingsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateThreatFeedsResponse> updateThreatFeeds(
            UpdateThreatFeedsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateThreatFeedsRequest, UpdateThreatFeedsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateWaasPolicyResponse> updateWaasPolicy(
            UpdateWaasPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWaasPolicyRequest, UpdateWaasPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateWaasPolicyCustomProtectionRulesResponse>
            updateWaasPolicyCustomProtectionRules(
                    UpdateWaasPolicyCustomProtectionRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateWaasPolicyCustomProtectionRulesRequest,
                                    UpdateWaasPolicyCustomProtectionRulesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateWafAddressRateLimitingResponse>
            updateWafAddressRateLimiting(
                    UpdateWafAddressRateLimitingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateWafAddressRateLimitingRequest,
                                    UpdateWafAddressRateLimitingResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateWafConfigResponse> updateWafConfig(
            UpdateWafConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWafConfigRequest, UpdateWafConfigResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateWhitelistsResponse> updateWhitelists(
            UpdateWhitelistsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWhitelistsRequest, UpdateWhitelistsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
