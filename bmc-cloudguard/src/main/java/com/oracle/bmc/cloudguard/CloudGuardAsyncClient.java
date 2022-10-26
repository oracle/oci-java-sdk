/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;

import java.util.Objects;

/**
 * Async client implementation for CloudGuard service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class CloudGuardAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements CloudGuardAsync {
    /** Service instance for CloudGuard. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CLOUDGUARD")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://cloudguard-cp-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CloudGuardAsyncClient.class);

    private CloudGuardAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CloudGuardAsyncClient> {
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
        public CloudGuardAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new CloudGuardAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddCompartmentResponse> addCompartment(
            AddCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddCompartmentRequest, AddCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getSecurityZoneId(), "securityZoneId must not be blank");
        Objects.requireNonNull(
                request.getAddCompartmentDetails(), "addCompartmentDetails is required");

        return clientCall(request, AddCompartmentResponse::builder)
                .logger(LOG, "addCompartment")
                .serviceDetails(
                        "CloudGuard",
                        "AddCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/AddCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddCompartmentRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityZones")
                .appendPathParam(request.getSecurityZoneId())
                .appendPathParam("actions")
                .appendPathParam("addCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityZone.class,
                        AddCompartmentResponse.Builder::securityZone)
                .handleResponseHeaderString("etag", AddCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddCompartmentResponse.Builder::opcRequestId)
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
                        "CloudGuard",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20200131")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDataSourceCompartmentResponse>
            changeDataSourceCompartment(
                    ChangeDataSourceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDataSourceCompartmentRequest,
                                    ChangeDataSourceCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getDataSourceId(), "dataSourceId must not be blank");
        Objects.requireNonNull(
                request.getChangeDataSourceCompartmentDetails(),
                "changeDataSourceCompartmentDetails is required");

        return clientCall(request, ChangeDataSourceCompartmentResponse::builder)
                .logger(LOG, "changeDataSourceCompartment")
                .serviceDetails(
                        "CloudGuard",
                        "ChangeDataSourceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/ChangeDataSourceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDataSourceCompartmentRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataSources")
                .appendPathParam(request.getDataSourceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDataSourceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDataSourceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDetectorRecipeCompartmentResponse>
            changeDetectorRecipeCompartment(
                    ChangeDetectorRecipeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDetectorRecipeCompartmentRequest,
                                    ChangeDetectorRecipeCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getDetectorRecipeId(), "detectorRecipeId must not be blank");
        Objects.requireNonNull(
                request.getChangeDetectorRecipeCompartmentDetails(),
                "changeDetectorRecipeCompartmentDetails is required");

        return clientCall(request, ChangeDetectorRecipeCompartmentResponse::builder)
                .logger(LOG, "changeDetectorRecipeCompartment")
                .serviceDetails(
                        "CloudGuard",
                        "ChangeDetectorRecipeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/ChangeDetectorRecipeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDetectorRecipeCompartmentRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendPathParam(request.getDetectorRecipeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDetectorRecipeCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeManagedListCompartmentResponse>
            changeManagedListCompartment(
                    ChangeManagedListCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedListCompartmentRequest,
                                    ChangeManagedListCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getManagedListId(), "managedListId must not be blank");
        Objects.requireNonNull(
                request.getChangeManagedListCompartmentDetails(),
                "changeManagedListCompartmentDetails is required");

        return clientCall(request, ChangeManagedListCompartmentResponse::builder)
                .logger(LOG, "changeManagedListCompartment")
                .serviceDetails(
                        "CloudGuard",
                        "ChangeManagedListCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/ChangeManagedListCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeManagedListCompartmentRequest::builder)
                .basePath("/20200131")
                .appendPathParam("managedLists")
                .appendPathParam(request.getManagedListId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeManagedListCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeResponderRecipeCompartmentResponse>
            changeResponderRecipeCompartment(
                    ChangeResponderRecipeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeResponderRecipeCompartmentRequest,
                                    ChangeResponderRecipeCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getResponderRecipeId(), "responderRecipeId must not be blank");
        Objects.requireNonNull(
                request.getChangeResponderRecipeCompartmentDetails(),
                "changeResponderRecipeCompartmentDetails is required");

        return clientCall(request, ChangeResponderRecipeCompartmentResponse::builder)
                .logger(LOG, "changeResponderRecipeCompartment")
                .serviceDetails(
                        "CloudGuard",
                        "ChangeResponderRecipeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/ChangeResponderRecipeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeResponderRecipeCompartmentRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRecipes")
                .appendPathParam(request.getResponderRecipeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeResponderRecipeCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityRecipeCompartmentResponse>
            changeSecurityRecipeCompartment(
                    ChangeSecurityRecipeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityRecipeCompartmentRequest,
                                    ChangeSecurityRecipeCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getSecurityRecipeId(), "securityRecipeId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecurityRecipeCompartmentDetails(),
                "changeSecurityRecipeCompartmentDetails is required");

        return clientCall(request, ChangeSecurityRecipeCompartmentResponse::builder)
                .logger(LOG, "changeSecurityRecipeCompartment")
                .serviceDetails(
                        "CloudGuard",
                        "ChangeSecurityRecipeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipe/ChangeSecurityRecipeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSecurityRecipeCompartmentRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityRecipes")
                .appendPathParam(request.getSecurityRecipeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSecurityRecipeCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityZoneCompartmentResponse>
            changeSecurityZoneCompartment(
                    ChangeSecurityZoneCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityZoneCompartmentRequest,
                                    ChangeSecurityZoneCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getSecurityZoneId(), "securityZoneId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecurityZoneCompartmentDetails(),
                "changeSecurityZoneCompartmentDetails is required");

        return clientCall(request, ChangeSecurityZoneCompartmentResponse::builder)
                .logger(LOG, "changeSecurityZoneCompartment")
                .serviceDetails(
                        "CloudGuard",
                        "ChangeSecurityZoneCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/ChangeSecurityZoneCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSecurityZoneCompartmentRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityZones")
                .appendPathParam(request.getSecurityZoneId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSecurityZoneCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataMaskRuleResponse> createDataMaskRule(
            CreateDataMaskRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataMaskRuleRequest, CreateDataMaskRuleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDataMaskRuleDetails(), "createDataMaskRuleDetails is required");

        return clientCall(request, CreateDataMaskRuleResponse::builder)
                .logger(LOG, "createDataMaskRule")
                .serviceDetails(
                        "CloudGuard",
                        "CreateDataMaskRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataMaskRule/CreateDataMaskRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataMaskRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataMaskRules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DataMaskRule.class,
                        CreateDataMaskRuleResponse.Builder::dataMaskRule)
                .handleResponseHeaderString("etag", CreateDataMaskRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataMaskRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResponse> createDataSource(
            CreateDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataSourceRequest, CreateDataSourceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDataSourceDetails(), "createDataSourceDetails is required");

        return clientCall(request, CreateDataSourceResponse::builder)
                .logger(LOG, "createDataSource")
                .serviceDetails(
                        "CloudGuard",
                        "CreateDataSource",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/CreateDataSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataSourceRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataSources")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDataSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDetectorRecipeResponse> createDetectorRecipe(
            CreateDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDetectorRecipeRequest, CreateDetectorRecipeResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDetectorRecipeDetails(),
                "createDetectorRecipeDetails is required");

        return clientCall(request, CreateDetectorRecipeResponse::builder)
                .logger(LOG, "createDetectorRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "CreateDetectorRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/CreateDetectorRecipe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDetectorRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DetectorRecipe.class,
                        CreateDetectorRecipeResponse.Builder::detectorRecipe)
                .handleResponseHeaderString("etag", CreateDetectorRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDetectorRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDetectorRecipeDetectorRuleResponse>
            createDetectorRecipeDetectorRule(
                    CreateDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDetectorRecipeDetectorRuleRequest,
                                    CreateDetectorRecipeDetectorRuleResponse>
                            handler) {

        Validate.notBlank(request.getDetectorRecipeId(), "detectorRecipeId must not be blank");
        Objects.requireNonNull(
                request.getCreateDetectorRecipeDetectorRuleDetails(),
                "createDetectorRecipeDetectorRuleDetails is required");

        return clientCall(request, CreateDetectorRecipeDetectorRuleResponse::builder)
                .logger(LOG, "createDetectorRecipeDetectorRule")
                .serviceDetails(
                        "CloudGuard",
                        "CreateDetectorRecipeDetectorRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/CreateDetectorRecipeDetectorRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDetectorRecipeDetectorRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendPathParam(request.getDetectorRecipeId())
                .appendPathParam("detectorRules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRule.class,
                        CreateDetectorRecipeDetectorRuleResponse.Builder
                                ::detectorRecipeDetectorRule)
                .handleResponseHeaderString(
                        "etag", CreateDetectorRecipeDetectorRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDetectorRecipeDetectorRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateManagedListResponse> createManagedList(
            CreateManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateManagedListRequest, CreateManagedListResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateManagedListDetails(), "createManagedListDetails is required");

        return clientCall(request, CreateManagedListResponse::builder)
                .logger(LOG, "createManagedList")
                .serviceDetails(
                        "CloudGuard",
                        "CreateManagedList",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/CreateManagedList")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateManagedListRequest::builder)
                .basePath("/20200131")
                .appendPathParam("managedLists")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ManagedList.class,
                        CreateManagedListResponse.Builder::managedList)
                .handleResponseHeaderString("etag", CreateManagedListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateManagedListResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateResponderRecipeResponse> createResponderRecipe(
            CreateResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateResponderRecipeRequest, CreateResponderRecipeResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateResponderRecipeDetails(),
                "createResponderRecipeDetails is required");

        return clientCall(request, CreateResponderRecipeResponse::builder)
                .logger(LOG, "createResponderRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "CreateResponderRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/CreateResponderRecipe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateResponderRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRecipes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderRecipe.class,
                        CreateResponderRecipeResponse.Builder::responderRecipe)
                .handleResponseHeaderString("etag", CreateResponderRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateResponderRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityRecipeResponse> createSecurityRecipe(
            CreateSecurityRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityRecipeRequest, CreateSecurityRecipeResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSecurityRecipeDetails(),
                "createSecurityRecipeDetails is required");

        return clientCall(request, CreateSecurityRecipeResponse::builder)
                .logger(LOG, "createSecurityRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "CreateSecurityRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipe/CreateSecurityRecipe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityRecipes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityRecipe.class,
                        CreateSecurityRecipeResponse.Builder::securityRecipe)
                .handleResponseHeaderString("etag", CreateSecurityRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecurityRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityZoneResponse> createSecurityZone(
            CreateSecurityZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityZoneRequest, CreateSecurityZoneResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSecurityZoneDetails(), "createSecurityZoneDetails is required");

        return clientCall(request, CreateSecurityZoneResponse::builder)
                .logger(LOG, "createSecurityZone")
                .serviceDetails(
                        "CloudGuard",
                        "CreateSecurityZone",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/CreateSecurityZone")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityZoneRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityZones")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityZone.class,
                        CreateSecurityZoneResponse.Builder::securityZone)
                .handleResponseHeaderString("etag", CreateSecurityZoneResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecurityZoneResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTargetResponse> createTarget(
            CreateTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTargetRequest, CreateTargetResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateTargetDetails(), "createTargetDetails is required");

        return clientCall(request, CreateTargetResponse::builder)
                .logger(LOG, "createTarget")
                .serviceDetails(
                        "CloudGuard",
                        "CreateTarget",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Target/CreateTarget")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTargetRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.Target.class,
                        CreateTargetResponse.Builder::target)
                .handleResponseHeaderString("etag", CreateTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTargetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTargetDetectorRecipeResponse>
            createTargetDetectorRecipe(
                    CreateTargetDetectorRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTargetDetectorRecipeRequest,
                                    CreateTargetDetectorRecipeResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");
        Objects.requireNonNull(
                request.getAttachTargetDetectorRecipeDetails(),
                "attachTargetDetectorRecipeDetails is required");

        return clientCall(request, CreateTargetDetectorRecipeResponse::builder)
                .logger(LOG, "createTargetDetectorRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "CreateTargetDetectorRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipe/CreateTargetDetectorRecipe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTargetDetectorRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetDetectorRecipes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetDetectorRecipe.class,
                        CreateTargetDetectorRecipeResponse.Builder::targetDetectorRecipe)
                .handleResponseHeaderString(
                        "etag", CreateTargetDetectorRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTargetDetectorRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTargetResponderRecipeResponse>
            createTargetResponderRecipe(
                    CreateTargetResponderRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTargetResponderRecipeRequest,
                                    CreateTargetResponderRecipeResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");
        Objects.requireNonNull(
                request.getAttachTargetResponderRecipeDetails(),
                "attachTargetResponderRecipeDetails is required");

        return clientCall(request, CreateTargetResponderRecipeResponse::builder)
                .logger(LOG, "createTargetResponderRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "CreateTargetResponderRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipe/CreateTargetResponderRecipe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTargetResponderRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetResponderRecipes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetResponderRecipe.class,
                        CreateTargetResponderRecipeResponse.Builder::targetResponderRecipe)
                .handleResponseHeaderString(
                        "etag", CreateTargetResponderRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTargetResponderRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataMaskRuleResponse> deleteDataMaskRule(
            DeleteDataMaskRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataMaskRuleRequest, DeleteDataMaskRuleResponse>
                    handler) {

        Validate.notBlank(request.getDataMaskRuleId(), "dataMaskRuleId must not be blank");

        return clientCall(request, DeleteDataMaskRuleResponse::builder)
                .logger(LOG, "deleteDataMaskRule")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteDataMaskRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataMaskRule/DeleteDataMaskRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataMaskRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataMaskRules")
                .appendPathParam(request.getDataMaskRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDataMaskRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResponse> deleteDataSource(
            DeleteDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataSourceRequest, DeleteDataSourceResponse>
                    handler) {

        Validate.notBlank(request.getDataSourceId(), "dataSourceId must not be blank");

        return clientCall(request, DeleteDataSourceResponse::builder)
                .logger(LOG, "deleteDataSource")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteDataSource",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/DeleteDataSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataSourceRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataSources")
                .appendPathParam(request.getDataSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDataSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDataSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorRecipeResponse> deleteDetectorRecipe(
            DeleteDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDetectorRecipeRequest, DeleteDetectorRecipeResponse>
                    handler) {

        Validate.notBlank(request.getDetectorRecipeId(), "detectorRecipeId must not be blank");

        return clientCall(request, DeleteDetectorRecipeResponse::builder)
                .logger(LOG, "deleteDetectorRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteDetectorRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/DeleteDetectorRecipe")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDetectorRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendPathParam(request.getDetectorRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDetectorRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorRecipeDetectorRuleResponse>
            deleteDetectorRecipeDetectorRule(
                    DeleteDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDetectorRecipeDetectorRuleRequest,
                                    DeleteDetectorRecipeDetectorRuleResponse>
                            handler) {

        Validate.notBlank(request.getDetectorRecipeId(), "detectorRecipeId must not be blank");

        Validate.notBlank(request.getDetectorRuleId(), "detectorRuleId must not be blank");

        return clientCall(request, DeleteDetectorRecipeDetectorRuleResponse::builder)
                .logger(LOG, "deleteDetectorRecipeDetectorRule")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteDetectorRecipeDetectorRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/DeleteDetectorRecipeDetectorRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDetectorRecipeDetectorRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendPathParam(request.getDetectorRecipeId())
                .appendPathParam("detectorRules")
                .appendPathParam(request.getDetectorRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDetectorRecipeDetectorRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorRecipeDetectorRuleDataSourceResponse>
            deleteDetectorRecipeDetectorRuleDataSource(
                    DeleteDetectorRecipeDetectorRuleDataSourceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDetectorRecipeDetectorRuleDataSourceRequest,
                                    DeleteDetectorRecipeDetectorRuleDataSourceResponse>
                            handler) {

        Validate.notBlank(request.getDetectorRecipeId(), "detectorRecipeId must not be blank");

        Validate.notBlank(request.getDetectorRuleId(), "detectorRuleId must not be blank");

        Validate.notBlank(request.getDataSourceId(), "dataSourceId must not be blank");

        return clientCall(request, DeleteDetectorRecipeDetectorRuleDataSourceResponse::builder)
                .logger(LOG, "deleteDetectorRecipeDetectorRuleDataSource")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteDetectorRecipeDetectorRuleDataSource",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/DeleteDetectorRecipeDetectorRuleDataSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDetectorRecipeDetectorRuleDataSourceRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendPathParam(request.getDetectorRecipeId())
                .appendPathParam("detectorRules")
                .appendPathParam(request.getDetectorRuleId())
                .appendPathParam("dataSources")
                .appendPathParam(request.getDataSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDetectorRecipeDetectorRuleDataSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteManagedListResponse> deleteManagedList(
            DeleteManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagedListRequest, DeleteManagedListResponse>
                    handler) {

        Validate.notBlank(request.getManagedListId(), "managedListId must not be blank");

        return clientCall(request, DeleteManagedListResponse::builder)
                .logger(LOG, "deleteManagedList")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteManagedList",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/DeleteManagedList")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteManagedListRequest::builder)
                .basePath("/20200131")
                .appendPathParam("managedLists")
                .appendPathParam(request.getManagedListId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteManagedListResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteResponderRecipeResponse> deleteResponderRecipe(
            DeleteResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteResponderRecipeRequest, DeleteResponderRecipeResponse>
                    handler) {

        Validate.notBlank(request.getResponderRecipeId(), "responderRecipeId must not be blank");

        return clientCall(request, DeleteResponderRecipeResponse::builder)
                .logger(LOG, "deleteResponderRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteResponderRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/DeleteResponderRecipe")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteResponderRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRecipes")
                .appendPathParam(request.getResponderRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteResponderRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityRecipeResponse> deleteSecurityRecipe(
            DeleteSecurityRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityRecipeRequest, DeleteSecurityRecipeResponse>
                    handler) {

        Validate.notBlank(request.getSecurityRecipeId(), "securityRecipeId must not be blank");

        return clientCall(request, DeleteSecurityRecipeResponse::builder)
                .logger(LOG, "deleteSecurityRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteSecurityRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipe/DeleteSecurityRecipe")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityRecipes")
                .appendPathParam(request.getSecurityRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSecurityRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityZoneResponse> deleteSecurityZone(
            DeleteSecurityZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityZoneRequest, DeleteSecurityZoneResponse>
                    handler) {

        Validate.notBlank(request.getSecurityZoneId(), "securityZoneId must not be blank");

        return clientCall(request, DeleteSecurityZoneResponse::builder)
                .logger(LOG, "deleteSecurityZone")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteSecurityZone",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/DeleteSecurityZone")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityZoneRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityZones")
                .appendPathParam(request.getSecurityZoneId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSecurityZoneResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetResponse> deleteTarget(
            DeleteTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTargetRequest, DeleteTargetResponse>
                    handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        return clientCall(request, DeleteTargetResponse::builder)
                .logger(LOG, "deleteTarget")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteTarget",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Target/DeleteTarget")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTargetRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTargetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetDetectorRecipeResponse>
            deleteTargetDetectorRecipe(
                    DeleteTargetDetectorRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTargetDetectorRecipeRequest,
                                    DeleteTargetDetectorRecipeResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetDetectorRecipeId(), "targetDetectorRecipeId must not be blank");

        return clientCall(request, DeleteTargetDetectorRecipeResponse::builder)
                .logger(LOG, "deleteTargetDetectorRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteTargetDetectorRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipe/DeleteTargetDetectorRecipe")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTargetDetectorRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetDetectorRecipes")
                .appendPathParam(request.getTargetDetectorRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTargetDetectorRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetResponderRecipeResponse>
            deleteTargetResponderRecipe(
                    DeleteTargetResponderRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTargetResponderRecipeRequest,
                                    DeleteTargetResponderRecipeResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetResponderRecipeId(), "targetResponderRecipeId must not be blank");

        return clientCall(request, DeleteTargetResponderRecipeResponse::builder)
                .logger(LOG, "deleteTargetResponderRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "DeleteTargetResponderRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipe/DeleteTargetResponderRecipe")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTargetResponderRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetResponderRecipes")
                .appendPathParam(request.getTargetResponderRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTargetResponderRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExecuteResponderExecutionResponse> executeResponderExecution(
            ExecuteResponderExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExecuteResponderExecutionRequest, ExecuteResponderExecutionResponse>
                    handler) {

        Validate.notBlank(
                request.getResponderExecutionId(), "responderExecutionId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ExecuteResponderExecutionResponse::builder)
                .logger(LOG, "executeResponderExecution")
                .serviceDetails(
                        "CloudGuard",
                        "ExecuteResponderExecution",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecution/ExecuteResponderExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExecuteResponderExecutionRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderExecutions")
                .appendPathParam(request.getResponderExecutionId())
                .appendPathParam("actions")
                .appendPathParam("execute")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ExecuteResponderExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConditionMetadataTypeResponse> getConditionMetadataType(
            GetConditionMetadataTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConditionMetadataTypeRequest, GetConditionMetadataTypeResponse>
                    handler) {

        Validate.notBlank(
                request.getConditionMetadataTypeId().getValue(),
                "conditionMetadataTypeId must not be blank");

        return clientCall(request, GetConditionMetadataTypeResponse::builder)
                .logger(LOG, "getConditionMetadataType")
                .serviceDetails(
                        "CloudGuard",
                        "GetConditionMetadataType",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ConditionMetadataType/GetConditionMetadataType")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConditionMetadataTypeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("conditionMetadataTypes")
                .appendPathParam(request.getConditionMetadataTypeId().getValue())
                .appendQueryParam("serviceType", request.getServiceType())
                .appendQueryParam("resourceType", request.getResourceType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ConditionMetadataType.class,
                        GetConditionMetadataTypeResponse.Builder::conditionMetadataType)
                .handleResponseHeaderString("etag", GetConditionMetadataTypeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConditionMetadataTypeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfigurationRequest, GetConfigurationResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetConfigurationResponse::builder)
                .logger(LOG, "getConfiguration")
                .serviceDetails(
                        "CloudGuard",
                        "GetConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Configuration/GetConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigurationRequest::builder)
                .basePath("/20200131")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.Configuration.class,
                        GetConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString("etag", GetConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetConfigurationResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataMaskRuleResponse> getDataMaskRule(
            GetDataMaskRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataMaskRuleRequest, GetDataMaskRuleResponse>
                    handler) {

        Validate.notBlank(request.getDataMaskRuleId(), "dataMaskRuleId must not be blank");

        return clientCall(request, GetDataMaskRuleResponse::builder)
                .logger(LOG, "getDataMaskRule")
                .serviceDetails(
                        "CloudGuard",
                        "GetDataMaskRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataMaskRule/GetDataMaskRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataMaskRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataMaskRules")
                .appendPathParam(request.getDataMaskRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DataMaskRule.class,
                        GetDataMaskRuleResponse.Builder::dataMaskRule)
                .handleResponseHeaderString("etag", GetDataMaskRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataMaskRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResponse> getDataSource(
            GetDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataSourceRequest, GetDataSourceResponse>
                    handler) {

        Validate.notBlank(request.getDataSourceId(), "dataSourceId must not be blank");

        return clientCall(request, GetDataSourceResponse::builder)
                .logger(LOG, "getDataSource")
                .serviceDetails(
                        "CloudGuard",
                        "GetDataSource",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/GetDataSource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataSourceRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataSources")
                .appendPathParam(request.getDataSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DataSource.class,
                        GetDataSourceResponse.Builder::dataSource)
                .handleResponseHeaderString("etag", GetDataSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDetectorResponse> getDetector(
            GetDetectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDetectorRequest, GetDetectorResponse>
                    handler) {

        Validate.notBlank(request.getDetectorId(), "detectorId must not be blank");

        return clientCall(request, GetDetectorResponse::builder)
                .logger(LOG, "getDetector")
                .serviceDetails(
                        "CloudGuard",
                        "GetDetector",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Detector/GetDetector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDetectorRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectors")
                .appendPathParam(request.getDetectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.Detector.class,
                        GetDetectorResponse.Builder::detector)
                .handleResponseHeaderString(
                        "opc-request-id", GetDetectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetDetectorResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDetectorRecipeResponse> getDetectorRecipe(
            GetDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDetectorRecipeRequest, GetDetectorRecipeResponse>
                    handler) {

        Validate.notBlank(request.getDetectorRecipeId(), "detectorRecipeId must not be blank");

        return clientCall(request, GetDetectorRecipeResponse::builder)
                .logger(LOG, "getDetectorRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "GetDetectorRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/GetDetectorRecipe")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDetectorRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendPathParam(request.getDetectorRecipeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DetectorRecipe.class,
                        GetDetectorRecipeResponse.Builder::detectorRecipe)
                .handleResponseHeaderString("etag", GetDetectorRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDetectorRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDetectorRecipeDetectorRuleResponse>
            getDetectorRecipeDetectorRule(
                    GetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDetectorRecipeDetectorRuleRequest,
                                    GetDetectorRecipeDetectorRuleResponse>
                            handler) {

        Validate.notBlank(request.getDetectorRecipeId(), "detectorRecipeId must not be blank");

        Validate.notBlank(request.getDetectorRuleId(), "detectorRuleId must not be blank");

        return clientCall(request, GetDetectorRecipeDetectorRuleResponse::builder)
                .logger(LOG, "getDetectorRecipeDetectorRule")
                .serviceDetails(
                        "CloudGuard",
                        "GetDetectorRecipeDetectorRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/GetDetectorRecipeDetectorRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDetectorRecipeDetectorRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendPathParam(request.getDetectorRecipeId())
                .appendPathParam("detectorRules")
                .appendPathParam(request.getDetectorRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRule.class,
                        GetDetectorRecipeDetectorRuleResponse.Builder::detectorRecipeDetectorRule)
                .handleResponseHeaderString(
                        "etag", GetDetectorRecipeDetectorRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDetectorRecipeDetectorRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDetectorRuleResponse> getDetectorRule(
            GetDetectorRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDetectorRuleRequest, GetDetectorRuleResponse>
                    handler) {

        Validate.notBlank(request.getDetectorId(), "detectorId must not be blank");

        Validate.notBlank(request.getDetectorRuleId(), "detectorRuleId must not be blank");

        return clientCall(request, GetDetectorRuleResponse::builder)
                .logger(LOG, "getDetectorRule")
                .serviceDetails(
                        "CloudGuard",
                        "GetDetectorRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRule/GetDetectorRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDetectorRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectors")
                .appendPathParam(request.getDetectorId())
                .appendPathParam("detectorRules")
                .appendPathParam(request.getDetectorRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DetectorRule.class,
                        GetDetectorRuleResponse.Builder::detectorRule)
                .handleResponseHeaderString("etag", GetDetectorRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDetectorRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetDetectorRuleResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagedListResponse> getManagedList(
            GetManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedListRequest, GetManagedListResponse>
                    handler) {

        Validate.notBlank(request.getManagedListId(), "managedListId must not be blank");

        return clientCall(request, GetManagedListResponse::builder)
                .logger(LOG, "getManagedList")
                .serviceDetails(
                        "CloudGuard",
                        "GetManagedList",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/GetManagedList")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedListRequest::builder)
                .basePath("/20200131")
                .appendPathParam("managedLists")
                .appendPathParam(request.getManagedListId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ManagedList.class,
                        GetManagedListResponse.Builder::managedList)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedListResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetManagedListResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProblemResponse> getProblem(
            GetProblemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProblemRequest, GetProblemResponse>
                    handler) {

        Validate.notBlank(request.getProblemId(), "problemId must not be blank");

        return clientCall(request, GetProblemResponse::builder)
                .logger(LOG, "getProblem")
                .serviceDetails(
                        "CloudGuard",
                        "GetProblem",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/GetProblem")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProblemRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam(request.getProblemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.Problem.class,
                        GetProblemResponse.Builder::problem)
                .handleResponseHeaderString(
                        "opc-request-id", GetProblemResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetProblemResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetResourceProfileResponse> getResourceProfile(
            GetResourceProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResourceProfileRequest, GetResourceProfileResponse>
                    handler) {

        Validate.notBlank(request.getResourceProfileId(), "resourceProfileId must not be blank");

        return clientCall(request, GetResourceProfileResponse::builder)
                .logger(LOG, "getResourceProfile")
                .serviceDetails(
                        "CloudGuard",
                        "GetResourceProfile",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceProfile/GetResourceProfile")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResourceProfileRequest::builder)
                .basePath("/20200131")
                .appendPathParam("resourceProfiles")
                .appendPathParam(request.getResourceProfileId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResourceProfile.class,
                        GetResourceProfileResponse.Builder::resourceProfile)
                .handleResponseHeaderString(
                        "opc-request-id", GetResourceProfileResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetResourceProfileResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetResponderExecutionResponse> getResponderExecution(
            GetResponderExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResponderExecutionRequest, GetResponderExecutionResponse>
                    handler) {

        Validate.notBlank(
                request.getResponderExecutionId(), "responderExecutionId must not be blank");

        return clientCall(request, GetResponderExecutionResponse::builder)
                .logger(LOG, "getResponderExecution")
                .serviceDetails(
                        "CloudGuard",
                        "GetResponderExecution",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecution/GetResponderExecution")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResponderExecutionRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderExecutions")
                .appendPathParam(request.getResponderExecutionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderExecution.class,
                        GetResponderExecutionResponse.Builder::responderExecution)
                .handleResponseHeaderString("etag", GetResponderExecutionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetResponderExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetResponderRecipeResponse> getResponderRecipe(
            GetResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResponderRecipeRequest, GetResponderRecipeResponse>
                    handler) {

        Validate.notBlank(request.getResponderRecipeId(), "responderRecipeId must not be blank");

        return clientCall(request, GetResponderRecipeResponse::builder)
                .logger(LOG, "getResponderRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "GetResponderRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/GetResponderRecipe")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResponderRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRecipes")
                .appendPathParam(request.getResponderRecipeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderRecipe.class,
                        GetResponderRecipeResponse.Builder::responderRecipe)
                .handleResponseHeaderString("etag", GetResponderRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetResponderRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetResponderRecipeResponderRuleResponse>
            getResponderRecipeResponderRule(
                    GetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetResponderRecipeResponderRuleRequest,
                                    GetResponderRecipeResponderRuleResponse>
                            handler) {

        Validate.notBlank(request.getResponderRecipeId(), "responderRecipeId must not be blank");

        Validate.notBlank(request.getResponderRuleId(), "responderRuleId must not be blank");

        return clientCall(request, GetResponderRecipeResponderRuleResponse::builder)
                .logger(LOG, "getResponderRecipeResponderRule")
                .serviceDetails(
                        "CloudGuard",
                        "GetResponderRecipeResponderRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipeResponderRule/GetResponderRecipeResponderRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResponderRecipeResponderRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRecipes")
                .appendPathParam(request.getResponderRecipeId())
                .appendPathParam("responderRules")
                .appendPathParam(request.getResponderRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRule.class,
                        GetResponderRecipeResponderRuleResponse.Builder
                                ::responderRecipeResponderRule)
                .handleResponseHeaderString(
                        "etag", GetResponderRecipeResponderRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetResponderRecipeResponderRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetResponderRuleResponse> getResponderRule(
            GetResponderRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResponderRuleRequest, GetResponderRuleResponse>
                    handler) {

        Validate.notBlank(request.getResponderRuleId(), "responderRuleId must not be blank");

        return clientCall(request, GetResponderRuleResponse::builder)
                .logger(LOG, "getResponderRule")
                .serviceDetails(
                        "CloudGuard",
                        "GetResponderRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRule/GetResponderRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResponderRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRules")
                .appendPathParam(request.getResponderRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderRule.class,
                        GetResponderRuleResponse.Builder::responderRule)
                .handleResponseHeaderString("etag", GetResponderRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetResponderRuleResponse.Builder::opcRequestId)
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
                        "CloudGuard",
                        "GetSecurityPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityPolicy/GetSecurityPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityPolicyRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityPolicies")
                .appendPathParam(request.getSecurityPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityPolicy.class,
                        GetSecurityPolicyResponse.Builder::securityPolicy)
                .handleResponseHeaderString("etag", GetSecurityPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityRecipeResponse> getSecurityRecipe(
            GetSecurityRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityRecipeRequest, GetSecurityRecipeResponse>
                    handler) {

        Validate.notBlank(request.getSecurityRecipeId(), "securityRecipeId must not be blank");

        return clientCall(request, GetSecurityRecipeResponse::builder)
                .logger(LOG, "getSecurityRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "GetSecurityRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipe/GetSecurityRecipe")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityRecipes")
                .appendPathParam(request.getSecurityRecipeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityRecipe.class,
                        GetSecurityRecipeResponse.Builder::securityRecipe)
                .handleResponseHeaderString("etag", GetSecurityRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityZoneResponse> getSecurityZone(
            GetSecurityZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityZoneRequest, GetSecurityZoneResponse>
                    handler) {

        Validate.notBlank(request.getSecurityZoneId(), "securityZoneId must not be blank");

        return clientCall(request, GetSecurityZoneResponse::builder)
                .logger(LOG, "getSecurityZone")
                .serviceDetails(
                        "CloudGuard",
                        "GetSecurityZone",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/GetSecurityZone")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityZoneRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityZones")
                .appendPathParam(request.getSecurityZoneId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityZone.class,
                        GetSecurityZoneResponse.Builder::securityZone)
                .handleResponseHeaderString("etag", GetSecurityZoneResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityZoneResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSightingResponse> getSighting(
            GetSightingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSightingRequest, GetSightingResponse>
                    handler) {

        Validate.notBlank(request.getSightingId(), "sightingId must not be blank");

        return clientCall(request, GetSightingResponse::builder)
                .logger(LOG, "getSighting")
                .serviceDetails(
                        "CloudGuard",
                        "GetSighting",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Sighting/GetSighting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSightingRequest::builder)
                .basePath("/20200131")
                .appendPathParam("sightings")
                .appendPathParam(request.getSightingId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.Sighting.class,
                        GetSightingResponse.Builder::sighting)
                .handleResponseHeaderString(
                        "opc-request-id", GetSightingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetSightingResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTargetResponse> getTarget(
            GetTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTargetRequest, GetTargetResponse>
                    handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        return clientCall(request, GetTargetResponse::builder)
                .logger(LOG, "getTarget")
                .serviceDetails(
                        "CloudGuard",
                        "GetTarget",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Target/GetTarget")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTargetRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.Target.class,
                        GetTargetResponse.Builder::target)
                .handleResponseHeaderString("etag", GetTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTargetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTargetDetectorRecipeResponse> getTargetDetectorRecipe(
            GetTargetDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>
                    handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetDetectorRecipeId(), "targetDetectorRecipeId must not be blank");

        return clientCall(request, GetTargetDetectorRecipeResponse::builder)
                .logger(LOG, "getTargetDetectorRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "GetTargetDetectorRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipe/GetTargetDetectorRecipe")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTargetDetectorRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetDetectorRecipes")
                .appendPathParam(request.getTargetDetectorRecipeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetDetectorRecipe.class,
                        GetTargetDetectorRecipeResponse.Builder::targetDetectorRecipe)
                .handleResponseHeaderString("etag", GetTargetDetectorRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTargetDetectorRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTargetDetectorRecipeDetectorRuleResponse>
            getTargetDetectorRecipeDetectorRule(
                    GetTargetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetDetectorRecipeDetectorRuleRequest,
                                    GetTargetDetectorRecipeDetectorRuleResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetDetectorRecipeId(), "targetDetectorRecipeId must not be blank");

        Validate.notBlank(request.getDetectorRuleId(), "detectorRuleId must not be blank");

        return clientCall(request, GetTargetDetectorRecipeDetectorRuleResponse::builder)
                .logger(LOG, "getTargetDetectorRecipeDetectorRule")
                .serviceDetails(
                        "CloudGuard",
                        "GetTargetDetectorRecipeDetectorRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipeDetectorRule/GetTargetDetectorRecipeDetectorRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTargetDetectorRecipeDetectorRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetDetectorRecipes")
                .appendPathParam(request.getTargetDetectorRecipeId())
                .appendPathParam("detectorRules")
                .appendPathParam(request.getDetectorRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRule.class,
                        GetTargetDetectorRecipeDetectorRuleResponse.Builder
                                ::targetDetectorRecipeDetectorRule)
                .handleResponseHeaderString(
                        "etag", GetTargetDetectorRecipeDetectorRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetTargetDetectorRecipeDetectorRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTargetResponderRecipeResponse> getTargetResponderRecipe(
            GetTargetResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTargetResponderRecipeRequest, GetTargetResponderRecipeResponse>
                    handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetResponderRecipeId(), "targetResponderRecipeId must not be blank");

        return clientCall(request, GetTargetResponderRecipeResponse::builder)
                .logger(LOG, "getTargetResponderRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "GetTargetResponderRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipe/GetTargetResponderRecipe")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTargetResponderRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetResponderRecipes")
                .appendPathParam(request.getTargetResponderRecipeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetResponderRecipe.class,
                        GetTargetResponderRecipeResponse.Builder::targetResponderRecipe)
                .handleResponseHeaderString("etag", GetTargetResponderRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTargetResponderRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTargetResponderRecipeResponderRuleResponse>
            getTargetResponderRecipeResponderRule(
                    GetTargetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetResponderRecipeResponderRuleRequest,
                                    GetTargetResponderRecipeResponderRuleResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetResponderRecipeId(), "targetResponderRecipeId must not be blank");

        Validate.notBlank(request.getResponderRuleId(), "responderRuleId must not be blank");

        return clientCall(request, GetTargetResponderRecipeResponderRuleResponse::builder)
                .logger(LOG, "getTargetResponderRecipeResponderRule")
                .serviceDetails(
                        "CloudGuard",
                        "GetTargetResponderRecipeResponderRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipeResponderRule/GetTargetResponderRecipeResponderRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTargetResponderRecipeResponderRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetResponderRecipes")
                .appendPathParam(request.getTargetResponderRecipeId())
                .appendPathParam("responderRules")
                .appendPathParam(request.getResponderRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRule.class,
                        GetTargetResponderRecipeResponderRuleResponse.Builder
                                ::targetResponderRecipeResponderRule)
                .handleResponseHeaderString(
                        "etag", GetTargetResponderRecipeResponderRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetTargetResponderRecipeResponderRuleResponse.Builder::opcRequestId)
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
                        "CloudGuard",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200131")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConditionMetadataTypesResponse>
            listConditionMetadataTypes(
                    ListConditionMetadataTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListConditionMetadataTypesRequest,
                                    ListConditionMetadataTypesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListConditionMetadataTypesResponse::builder)
                .logger(LOG, "listConditionMetadataTypes")
                .serviceDetails(
                        "CloudGuard",
                        "ListConditionMetadataTypes",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ConditionMetadataType/ListConditionMetadataTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConditionMetadataTypesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("conditionMetadataTypes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ConditionMetadataTypeCollection.class,
                        ListConditionMetadataTypesResponse.Builder::conditionMetadataTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConditionMetadataTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConditionMetadataTypesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataMaskRulesResponse> listDataMaskRules(
            ListDataMaskRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataMaskRulesRequest, ListDataMaskRulesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDataMaskRulesResponse::builder)
                .logger(LOG, "listDataMaskRules")
                .serviceDetails(
                        "CloudGuard",
                        "ListDataMaskRules",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataMaskRule/ListDataMaskRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataMaskRulesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataMaskRules")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("dataMaskRuleStatus", request.getDataMaskRuleStatus())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("iamGroupId", request.getIamGroupId())
                .appendQueryParam("targetType", request.getTargetType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DataMaskRuleCollection.class,
                        ListDataMaskRulesResponse.Builder::dataMaskRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataMaskRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataMaskRulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourceEventsResponse> listDataSourceEvents(
            ListDataSourceEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataSourceEventsRequest, ListDataSourceEventsResponse>
                    handler) {

        Validate.notBlank(request.getDataSourceId(), "dataSourceId must not be blank");

        return clientCall(request, ListDataSourceEventsResponse::builder)
                .logger(LOG, "listDataSourceEvents")
                .serviceDetails(
                        "CloudGuard",
                        "ListDataSourceEvents",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/ListDataSourceEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataSourceEventsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataSources")
                .appendPathParam(request.getDataSourceId())
                .appendPathParam("events")
                .appendQueryParam("region", request.getRegion())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DataSourceEventCollection.class,
                        ListDataSourceEventsResponse.Builder::dataSourceEventCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataSourceEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataSourceEventsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResponse> listDataSources(
            ListDataSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataSourcesRequest, ListDataSourcesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDataSourcesResponse::builder)
                .logger(LOG, "listDataSources")
                .serviceDetails(
                        "CloudGuard",
                        "ListDataSources",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/ListDataSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataSourcesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataSources")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("dataSourceFeedProvider", request.getDataSourceFeedProvider())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("loggingQueryType", request.getLoggingQueryType())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DataSourceCollection.class,
                        ListDataSourcesResponse.Builder::dataSourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataSourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDetectorRecipeDetectorRulesResponse>
            listDetectorRecipeDetectorRules(
                    ListDetectorRecipeDetectorRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDetectorRecipeDetectorRulesRequest,
                                    ListDetectorRecipeDetectorRulesResponse>
                            handler) {

        Validate.notBlank(request.getDetectorRecipeId(), "detectorRecipeId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDetectorRecipeDetectorRulesResponse::builder)
                .logger(LOG, "listDetectorRecipeDetectorRules")
                .serviceDetails(
                        "CloudGuard",
                        "ListDetectorRecipeDetectorRules",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/ListDetectorRecipeDetectorRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDetectorRecipeDetectorRulesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendPathParam(request.getDetectorRecipeId())
                .appendPathParam("detectorRules")
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
                        com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRuleCollection.class,
                        ListDetectorRecipeDetectorRulesResponse.Builder
                                ::detectorRecipeDetectorRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDetectorRecipeDetectorRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDetectorRecipeDetectorRulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDetectorRecipesResponse> listDetectorRecipes(
            ListDetectorRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDetectorRecipesRequest, ListDetectorRecipesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDetectorRecipesResponse::builder)
                .logger(LOG, "listDetectorRecipes")
                .serviceDetails(
                        "CloudGuard",
                        "ListDetectorRecipes",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/ListDetectorRecipes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDetectorRecipesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceMetadataOnly", request.getResourceMetadataOnly())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DetectorRecipeCollection.class,
                        ListDetectorRecipesResponse.Builder::detectorRecipeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDetectorRecipesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDetectorRecipesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDetectorRulesResponse> listDetectorRules(
            ListDetectorRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDetectorRulesRequest, ListDetectorRulesResponse>
                    handler) {

        Validate.notBlank(request.getDetectorId(), "detectorId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDetectorRulesResponse::builder)
                .logger(LOG, "listDetectorRules")
                .serviceDetails(
                        "CloudGuard",
                        "ListDetectorRules",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRule/ListDetectorRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDetectorRulesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectors")
                .appendPathParam(request.getDetectorId())
                .appendPathParam("detectorRules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DetectorRuleCollection.class,
                        ListDetectorRulesResponse.Builder::detectorRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDetectorRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDetectorRulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDetectorsResponse> listDetectors(
            ListDetectorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDetectorsRequest, ListDetectorsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDetectorsResponse::builder)
                .logger(LOG, "listDetectors")
                .serviceDetails(
                        "CloudGuard",
                        "ListDetectors",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Detector/ListDetectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDetectorsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DetectorCollection.class,
                        ListDetectorsResponse.Builder::detectorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDetectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDetectorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListImpactedResourcesResponse> listImpactedResources(
            ListImpactedResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListImpactedResourcesRequest, ListImpactedResourcesResponse>
                    handler) {

        Validate.notBlank(request.getProblemId(), "problemId must not be blank");

        return clientCall(request, ListImpactedResourcesResponse::builder)
                .logger(LOG, "listImpactedResources")
                .serviceDetails(
                        "CloudGuard",
                        "ListImpactedResources",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ImpactedResourceSummary/ListImpactedResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListImpactedResourcesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam(request.getProblemId())
                .appendPathParam("impactedResources")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ImpactedResourceCollection.class,
                        ListImpactedResourcesResponse.Builder::impactedResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListImpactedResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListImpactedResourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedListTypesResponse> listManagedListTypes(
            ListManagedListTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedListTypesRequest, ListManagedListTypesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagedListTypesResponse::builder)
                .logger(LOG, "listManagedListTypes")
                .serviceDetails(
                        "CloudGuard",
                        "ListManagedListTypes",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedListTypeSummary/ListManagedListTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedListTypesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("managedListTypes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ManagedListTypeCollection.class,
                        ListManagedListTypesResponse.Builder::managedListTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedListTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedListTypesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedListsResponse> listManagedLists(
            ListManagedListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedListsRequest, ListManagedListsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagedListsResponse::builder)
                .logger(LOG, "listManagedLists")
                .serviceDetails(
                        "CloudGuard",
                        "ListManagedLists",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/ListManagedLists")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedListsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("managedLists")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceMetadataOnly", request.getResourceMetadataOnly())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("listType", request.getListType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ManagedListCollection.class,
                        ListManagedListsResponse.Builder::managedListCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedListsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedListsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPoliciesResponse::builder)
                .logger(LOG, "listPolicies")
                .serviceDetails(
                        "CloudGuard",
                        "ListPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/PolicySummary/ListPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPoliciesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("policies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.PolicyCollection.class,
                        ListPoliciesResponse.Builder::policyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPoliciesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProblemEndpointsResponse> listProblemEndpoints(
            ListProblemEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProblemEndpointsRequest, ListProblemEndpointsResponse>
                    handler) {

        Validate.notBlank(request.getProblemId(), "problemId must not be blank");

        return clientCall(request, ListProblemEndpointsResponse::builder)
                .logger(LOG, "listProblemEndpoints")
                .serviceDetails(
                        "CloudGuard",
                        "ListProblemEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ProblemEndpointSummary/ListProblemEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProblemEndpointsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam(request.getProblemId())
                .appendPathParam("endpoints")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ProblemEndpointCollection.class,
                        ListProblemEndpointsResponse.Builder::problemEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProblemEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProblemEndpointsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProblemEntitiesResponse> listProblemEntities(
            ListProblemEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProblemEntitiesRequest, ListProblemEntitiesResponse>
                    handler) {

        Validate.notBlank(request.getProblemId(), "problemId must not be blank");

        return clientCall(request, ListProblemEntitiesResponse::builder)
                .logger(LOG, "listProblemEntities")
                .serviceDetails(
                        "CloudGuard",
                        "ListProblemEntities",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/ListProblemEntities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProblemEntitiesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam(request.getProblemId())
                .appendPathParam("entities")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ProblemEntityCollection.class,
                        ListProblemEntitiesResponse.Builder::problemEntityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProblemEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProblemEntitiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProblemHistoriesResponse> listProblemHistories(
            ListProblemHistoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProblemHistoriesRequest, ListProblemHistoriesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getProblemId(), "problemId must not be blank");

        return clientCall(request, ListProblemHistoriesResponse::builder)
                .logger(LOG, "listProblemHistories")
                .serviceDetails(
                        "CloudGuard",
                        "ListProblemHistories",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/ListProblemHistories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProblemHistoriesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam(request.getProblemId())
                .appendPathParam("histories")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ProblemHistoryCollection.class,
                        ListProblemHistoriesResponse.Builder::problemHistoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProblemHistoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProblemHistoriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProblemsResponse> listProblems(
            ListProblemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProblemsRequest, ListProblemsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProblemsResponse::builder)
                .logger(LOG, "listProblems")
                .serviceDetails(
                        "CloudGuard",
                        "ListProblems",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/ListProblems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProblemsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendQueryParam(
                        "timeLastDetectedGreaterThanOrEqualTo",
                        request.getTimeLastDetectedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeLastDetectedLessThanOrEqualTo",
                        request.getTimeLastDetectedLessThanOrEqualTo())
                .appendQueryParam(
                        "timeFirstDetectedGreaterThanOrEqualTo",
                        request.getTimeFirstDetectedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeFirstDetectedLessThanOrEqualTo",
                        request.getTimeFirstDetectedLessThanOrEqualTo())
                .appendEnumQueryParam("lifecycleDetail", request.getLifecycleDetail())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("region", request.getRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("riskLevel", request.getRiskLevel())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("city", request.getCity())
                .appendQueryParam("state", request.getState())
                .appendQueryParam("country", request.getCountry())
                .appendQueryParam("label", request.getLabel())
                .appendListQueryParam(
                        "detectorRuleIdList",
                        request.getDetectorRuleIdList(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("detectorType", request.getDetectorType())
                .appendQueryParam("targetId", request.getTargetId())
                .appendEnumQueryParam("problemCategory", request.getProblemCategory())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ProblemCollection.class,
                        ListProblemsResponse.Builder::problemCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProblemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProblemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResponse> listRecommendations(
            ListRecommendationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRecommendationsRequest, ListRecommendationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRecommendationsResponse::builder)
                .logger(LOG, "listRecommendations")
                .serviceDetails(
                        "CloudGuard",
                        "ListRecommendations",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/RecommendationSummary/ListRecommendations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRecommendationsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("recommendations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("lifecycleDetail", request.getLifecycleDetail())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.RecommendationSummaryCollection.class,
                        ListRecommendationsResponse.Builder::recommendationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecommendationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecommendationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResourceProfileEndpointsResponse>
            listResourceProfileEndpoints(
                    ListResourceProfileEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResourceProfileEndpointsRequest,
                                    ListResourceProfileEndpointsResponse>
                            handler) {

        Validate.notBlank(request.getResourceProfileId(), "resourceProfileId must not be blank");

        return clientCall(request, ListResourceProfileEndpointsResponse::builder)
                .logger(LOG, "listResourceProfileEndpoints")
                .serviceDetails(
                        "CloudGuard",
                        "ListResourceProfileEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceProfileEndpointSummary/ListResourceProfileEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourceProfileEndpointsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("resourceProfiles")
                .appendPathParam(request.getResourceProfileId())
                .appendPathParam("endpoints")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResourceProfileEndpointCollection.class,
                        ListResourceProfileEndpointsResponse.Builder
                                ::resourceProfileEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListResourceProfileEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResourceProfileEndpointsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResourceProfileImpactedResourcesResponse>
            listResourceProfileImpactedResources(
                    ListResourceProfileImpactedResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResourceProfileImpactedResourcesRequest,
                                    ListResourceProfileImpactedResourcesResponse>
                            handler) {

        Validate.notBlank(request.getResourceProfileId(), "resourceProfileId must not be blank");

        return clientCall(request, ListResourceProfileImpactedResourcesResponse::builder)
                .logger(LOG, "listResourceProfileImpactedResources")
                .serviceDetails(
                        "CloudGuard",
                        "ListResourceProfileImpactedResources",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceProfileImpactedResourceSummary/ListResourceProfileImpactedResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourceProfileImpactedResourcesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("resourceProfiles")
                .appendPathParam(request.getResourceProfileId())
                .appendPathParam("impactedResources")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResourceProfileImpactedResourceCollection
                                .class,
                        ListResourceProfileImpactedResourcesResponse.Builder
                                ::resourceProfileImpactedResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListResourceProfileImpactedResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListResourceProfileImpactedResourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResourceProfilesResponse> listResourceProfiles(
            ListResourceProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResourceProfilesRequest, ListResourceProfilesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListResourceProfilesResponse::builder)
                .logger(LOG, "listResourceProfiles")
                .serviceDetails(
                        "CloudGuard",
                        "ListResourceProfiles",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceProfileSummary/ListResourceProfiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourceProfilesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("resourceProfiles")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "timeLastDetectedGreaterThanOrEqualTo",
                        request.getTimeLastDetectedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeLastDetectedLessThanOrEqualTo",
                        request.getTimeLastDetectedLessThanOrEqualTo())
                .appendQueryParam(
                        "timeFirstDetectedGreaterThanOrEqualTo",
                        request.getTimeFirstDetectedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeFirstDetectedLessThanOrEqualTo",
                        request.getTimeFirstDetectedLessThanOrEqualTo())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendListQueryParam(
                        "resourceTypes",
                        request.getResourceTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "riskScoreGreaterThanOrEqualTo", request.getRiskScoreGreaterThanOrEqualTo())
                .appendQueryParam(
                        "riskScoreLessThanOrEqualTo", request.getRiskScoreLessThanOrEqualTo())
                .appendListQueryParam(
                        "techniques",
                        request.getTechniques(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "tactics",
                        request.getTactics(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResourceProfileCollection.class,
                        ListResourceProfilesResponse.Builder::resourceProfileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListResourceProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResourceProfilesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResourceTypesResponse> listResourceTypes(
            ListResourceTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResourceTypesRequest, ListResourceTypesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListResourceTypesResponse::builder)
                .logger(LOG, "listResourceTypes")
                .serviceDetails(
                        "CloudGuard",
                        "ListResourceTypes",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceTypeSummary/ListResourceTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourceTypesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("resourceTypes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("detectorId", request.getDetectorId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResourceTypeCollection.class,
                        ListResourceTypesResponse.Builder::resourceTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListResourceTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResourceTypesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResponderActivitiesResponse> listResponderActivities(
            ListResponderActivitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderActivitiesRequest, ListResponderActivitiesResponse>
                    handler) {

        Validate.notBlank(request.getProblemId(), "problemId must not be blank");

        return clientCall(request, ListResponderActivitiesResponse::builder)
                .logger(LOG, "listResponderActivities")
                .serviceDetails(
                        "CloudGuard",
                        "ListResponderActivities",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderActivitySummary/ListResponderActivities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResponderActivitiesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam(request.getProblemId())
                .appendPathParam("responderActivities")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderActivityCollection.class,
                        ListResponderActivitiesResponse.Builder::responderActivityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListResponderActivitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResponderActivitiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResponderExecutionsResponse> listResponderExecutions(
            ListResponderExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderExecutionsRequest, ListResponderExecutionsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListResponderExecutionsResponse::builder)
                .logger(LOG, "listResponderExecutions")
                .serviceDetails(
                        "CloudGuard",
                        "ListResponderExecutions",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecutionSummary/ListResponderExecutions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResponderExecutionsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderExecutions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendListQueryParam(
                        "responderRuleIds",
                        request.getResponderRuleIds(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeCreatedLessThanOrEqualTo", request.getTimeCreatedLessThanOrEqualTo())
                .appendQueryParam(
                        "timeCompletedGreaterThanOrEqualTo",
                        request.getTimeCompletedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeCompletedLessThanOrEqualTo",
                        request.getTimeCompletedLessThanOrEqualTo())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendEnumQueryParam("responderType", request.getResponderType())
                .appendEnumQueryParam(
                        "responderExecutionStatus", request.getResponderExecutionStatus())
                .appendEnumQueryParam("responderExecutionMode", request.getResponderExecutionMode())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderExecutionCollection.class,
                        ListResponderExecutionsResponse.Builder::responderExecutionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListResponderExecutionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResponderExecutionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResponderRecipeResponderRulesResponse>
            listResponderRecipeResponderRules(
                    ListResponderRecipeResponderRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResponderRecipeResponderRulesRequest,
                                    ListResponderRecipeResponderRulesResponse>
                            handler) {

        Validate.notBlank(request.getResponderRecipeId(), "responderRecipeId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListResponderRecipeResponderRulesResponse::builder)
                .logger(LOG, "listResponderRecipeResponderRules")
                .serviceDetails(
                        "CloudGuard",
                        "ListResponderRecipeResponderRules",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipeResponderRule/ListResponderRecipeResponderRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResponderRecipeResponderRulesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRecipes")
                .appendPathParam(request.getResponderRecipeId())
                .appendPathParam("responderRules")
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
                        com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRuleCollection
                                .class,
                        ListResponderRecipeResponderRulesResponse.Builder
                                ::responderRecipeResponderRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListResponderRecipeResponderRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListResponderRecipeResponderRulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResponderRecipesResponse> listResponderRecipes(
            ListResponderRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderRecipesRequest, ListResponderRecipesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListResponderRecipesResponse::builder)
                .logger(LOG, "listResponderRecipes")
                .serviceDetails(
                        "CloudGuard",
                        "ListResponderRecipes",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/ListResponderRecipes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResponderRecipesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRecipes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceMetadataOnly", request.getResourceMetadataOnly())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderRecipeCollection.class,
                        ListResponderRecipesResponse.Builder::responderRecipeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListResponderRecipesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResponderRecipesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResponderRulesResponse> listResponderRules(
            ListResponderRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderRulesRequest, ListResponderRulesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListResponderRulesResponse::builder)
                .logger(LOG, "listResponderRules")
                .serviceDetails(
                        "CloudGuard",
                        "ListResponderRules",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRule/ListResponderRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResponderRulesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRules")
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
                        com.oracle.bmc.cloudguard.model.ResponderRuleCollection.class,
                        ListResponderRulesResponse.Builder::responderRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListResponderRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResponderRulesResponse.Builder::opcNextPage)
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
                        "CloudGuard",
                        "ListSecurityPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityPolicyCollection/ListSecurityPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityPoliciesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityPolicies")
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
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityPolicyCollection.class,
                        ListSecurityPoliciesResponse.Builder::securityPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityPoliciesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityRecipesResponse> listSecurityRecipes(
            ListSecurityRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityRecipesRequest, ListSecurityRecipesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecurityRecipesResponse::builder)
                .logger(LOG, "listSecurityRecipes")
                .serviceDetails(
                        "CloudGuard",
                        "ListSecurityRecipes",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipeCollection/ListSecurityRecipes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityRecipesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityRecipes")
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
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityRecipeCollection.class,
                        ListSecurityRecipesResponse.Builder::securityRecipeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityRecipesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityRecipesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityZonesResponse> listSecurityZones(
            ListSecurityZonesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityZonesRequest, ListSecurityZonesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecurityZonesResponse::builder)
                .logger(LOG, "listSecurityZones")
                .serviceDetails(
                        "CloudGuard",
                        "ListSecurityZones",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZoneCollection/ListSecurityZones")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityZonesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityZones")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("securityRecipeId", request.getSecurityRecipeId())
                .appendQueryParam(
                        "isRequiredSecurityZonesInSubtree",
                        request.getIsRequiredSecurityZonesInSubtree())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityZoneCollection.class,
                        ListSecurityZonesResponse.Builder::securityZoneCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityZonesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityZonesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSightingEndpointsResponse> listSightingEndpoints(
            ListSightingEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSightingEndpointsRequest, ListSightingEndpointsResponse>
                    handler) {

        Validate.notBlank(request.getSightingId(), "sightingId must not be blank");

        return clientCall(request, ListSightingEndpointsResponse::builder)
                .logger(LOG, "listSightingEndpoints")
                .serviceDetails(
                        "CloudGuard",
                        "ListSightingEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SightingEndpointSummary/ListSightingEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSightingEndpointsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("sightings")
                .appendPathParam(request.getSightingId())
                .appendPathParam("endpoints")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SightingEndpointCollection.class,
                        ListSightingEndpointsResponse.Builder::sightingEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSightingEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSightingEndpointsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSightingImpactedResourcesResponse>
            listSightingImpactedResources(
                    ListSightingImpactedResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSightingImpactedResourcesRequest,
                                    ListSightingImpactedResourcesResponse>
                            handler) {

        Validate.notBlank(request.getSightingId(), "sightingId must not be blank");

        return clientCall(request, ListSightingImpactedResourcesResponse::builder)
                .logger(LOG, "listSightingImpactedResources")
                .serviceDetails(
                        "CloudGuard",
                        "ListSightingImpactedResources",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SightingImpactedResourceSummary/ListSightingImpactedResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSightingImpactedResourcesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("sightings")
                .appendPathParam(request.getSightingId())
                .appendPathParam("impactedResources")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SightingImpactedResourceCollection.class,
                        ListSightingImpactedResourcesResponse.Builder
                                ::sightingImpactedResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSightingImpactedResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSightingImpactedResourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSightingsResponse> listSightings(
            ListSightingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSightingsRequest, ListSightingsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSightingsResponse::builder)
                .logger(LOG, "listSightings")
                .serviceDetails(
                        "CloudGuard",
                        "ListSightings",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SightingSummary/ListSightings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSightingsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("sightings")
                .appendQueryParam("problemId", request.getProblemId())
                .appendQueryParam("resourceProfileId", request.getResourceProfileId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam(
                        "timeLastDetectedGreaterThanOrEqualTo",
                        request.getTimeLastDetectedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeLastDetectedLessThanOrEqualTo",
                        request.getTimeLastDetectedLessThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SightingCollection.class,
                        ListSightingsResponse.Builder::sightingCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSightingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSightingsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTacticsResponse> listTactics(
            ListTacticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTacticsRequest, ListTacticsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTacticsResponse::builder)
                .logger(LOG, "listTactics")
                .serviceDetails(
                        "CloudGuard",
                        "ListTactics",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TacticSummary/ListTactics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTacticsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("tactics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TacticCollection.class,
                        ListTacticsResponse.Builder::tacticCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTacticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTacticsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTargetDetectorRecipeDetectorRulesResponse>
            listTargetDetectorRecipeDetectorRules(
                    ListTargetDetectorRecipeDetectorRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetDetectorRecipeDetectorRulesRequest,
                                    ListTargetDetectorRecipeDetectorRulesResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetDetectorRecipeId(), "targetDetectorRecipeId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTargetDetectorRecipeDetectorRulesResponse::builder)
                .logger(LOG, "listTargetDetectorRecipeDetectorRules")
                .serviceDetails(
                        "CloudGuard",
                        "ListTargetDetectorRecipeDetectorRules",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipeDetectorRule/ListTargetDetectorRecipeDetectorRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetDetectorRecipeDetectorRulesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetDetectorRecipes")
                .appendPathParam(request.getTargetDetectorRecipeId())
                .appendPathParam("detectorRules")
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
                        com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRuleCollection
                                .class,
                        ListTargetDetectorRecipeDetectorRulesResponse.Builder
                                ::targetDetectorRecipeDetectorRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListTargetDetectorRecipeDetectorRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListTargetDetectorRecipeDetectorRulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTargetDetectorRecipesResponse> listTargetDetectorRecipes(
            ListTargetDetectorRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>
                    handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTargetDetectorRecipesResponse::builder)
                .logger(LOG, "listTargetDetectorRecipes")
                .serviceDetails(
                        "CloudGuard",
                        "ListTargetDetectorRecipes",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipe/ListTargetDetectorRecipes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetDetectorRecipesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetDetectorRecipes")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetDetectorRecipeCollection.class,
                        ListTargetDetectorRecipesResponse.Builder::targetDetectorRecipeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTargetDetectorRecipesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTargetDetectorRecipesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTargetResponderRecipeResponderRulesResponse>
            listTargetResponderRecipeResponderRules(
                    ListTargetResponderRecipeResponderRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetResponderRecipeResponderRulesRequest,
                                    ListTargetResponderRecipeResponderRulesResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetResponderRecipeId(), "targetResponderRecipeId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTargetResponderRecipeResponderRulesResponse::builder)
                .logger(LOG, "listTargetResponderRecipeResponderRules")
                .serviceDetails(
                        "CloudGuard",
                        "ListTargetResponderRecipeResponderRules",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipeResponderRule/ListTargetResponderRecipeResponderRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetResponderRecipeResponderRulesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetResponderRecipes")
                .appendPathParam(request.getTargetResponderRecipeId())
                .appendPathParam("responderRules")
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
                        com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleCollection
                                .class,
                        ListTargetResponderRecipeResponderRulesResponse.Builder
                                ::targetResponderRecipeResponderRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListTargetResponderRecipeResponderRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListTargetResponderRecipeResponderRulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTargetResponderRecipesResponse>
            listTargetResponderRecipes(
                    ListTargetResponderRecipesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetResponderRecipesRequest,
                                    ListTargetResponderRecipesResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTargetResponderRecipesResponse::builder)
                .logger(LOG, "listTargetResponderRecipes")
                .serviceDetails(
                        "CloudGuard",
                        "ListTargetResponderRecipes",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipe/ListTargetResponderRecipes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetResponderRecipesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetResponderRecipes")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetResponderRecipeCollection.class,
                        ListTargetResponderRecipesResponse.Builder::targetResponderRecipeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTargetResponderRecipesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTargetResponderRecipesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsResponse> listTargets(
            ListTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTargetsRequest, ListTargetsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTargetsResponse::builder)
                .logger(LOG, "listTargets")
                .serviceDetails(
                        "CloudGuard",
                        "ListTargets",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Target/ListTargets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "isNonSecurityZoneTargetsOnlyQuery",
                        request.getIsNonSecurityZoneTargetsOnlyQuery())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetCollection.class,
                        ListTargetsResponse.Builder::targetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTargetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTargetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTechniquesResponse> listTechniques(
            ListTechniquesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTechniquesRequest, ListTechniquesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTechniquesResponse::builder)
                .logger(LOG, "listTechniques")
                .serviceDetails(
                        "CloudGuard",
                        "ListTechniques",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TechniqueSummary/ListTechniques")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTechniquesRequest::builder)
                .basePath("/20200131")
                .appendPathParam("techniques")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "tactics",
                        request.getTactics(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TechniqueCollection.class,
                        ListTechniquesResponse.Builder::techniqueCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTechniquesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTechniquesResponse.Builder::opcNextPage)
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
                        "CloudGuard",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.WorkRequestErrorCollection.class,
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
                        "CloudGuard",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200131")
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
                        com.oracle.bmc.cloudguard.model.WorkRequestLogEntryCollection.class,
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
                        "CloudGuard",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveCompartmentResponse> removeCompartment(
            RemoveCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveCompartmentRequest, RemoveCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getSecurityZoneId(), "securityZoneId must not be blank");
        Objects.requireNonNull(
                request.getRemoveCompartmentDetails(), "removeCompartmentDetails is required");

        return clientCall(request, RemoveCompartmentResponse::builder)
                .logger(LOG, "removeCompartment")
                .serviceDetails(
                        "CloudGuard",
                        "RemoveCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/RemoveCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveCompartmentRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityZones")
                .appendPathParam(request.getSecurityZoneId())
                .appendPathParam("actions")
                .appendPathParam("removeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityZone.class,
                        RemoveCompartmentResponse.Builder::securityZone)
                .handleResponseHeaderString("etag", RemoveCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestRiskScoresResponse> requestRiskScores(
            RequestRiskScoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestRiskScoresRequest, RequestRiskScoresResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestRiskScoresResponse::builder)
                .logger(LOG, "requestRiskScores")
                .serviceDetails(
                        "CloudGuard",
                        "RequestRiskScores",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/RiskScoreAggregation/RequestRiskScores")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestRiskScoresRequest::builder)
                .basePath("/20200131")
                .appendPathParam("riskScores")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.RiskScoreAggregationCollection.class,
                        RequestRiskScoresResponse.Builder::riskScoreAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RequestRiskScoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", RequestRiskScoresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSecurityScoreSummarizedTrendResponse>
            requestSecurityScoreSummarizedTrend(
                    RequestSecurityScoreSummarizedTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSecurityScoreSummarizedTrendRequest,
                                    RequestSecurityScoreSummarizedTrendResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSecurityScoreSummarizedTrendResponse::builder)
                .logger(LOG, "requestSecurityScoreSummarizedTrend")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSecurityScoreSummarizedTrend",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityScoreTrendAggregation/RequestSecurityScoreSummarizedTrend")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSecurityScoreSummarizedTrendRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityScores")
                .appendPathParam("actions")
                .appendPathParam("summarizeTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "timeScoreComputedGreaterThanOrEqualTo",
                        request.getTimeScoreComputedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeScoreComputedLessThanOrEqualTo",
                        request.getTimeScoreComputedLessThanOrEqualTo())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityScoreTrendAggregationCollection
                                .class,
                        RequestSecurityScoreSummarizedTrendResponse.Builder
                                ::securityScoreTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSecurityScoreSummarizedTrendResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSecurityScoreSummarizedTrendResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSecurityScoresResponse> requestSecurityScores(
            RequestSecurityScoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestSecurityScoresRequest, RequestSecurityScoresResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSecurityScoresResponse::builder)
                .logger(LOG, "requestSecurityScores")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSecurityScores",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityScoreAggregation/RequestSecurityScores")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSecurityScoresRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityScores")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityScoreAggregationCollection.class,
                        RequestSecurityScoresResponse.Builder::securityScoreAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RequestSecurityScoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", RequestSecurityScoresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedActivityProblemsResponse>
            requestSummarizedActivityProblems(
                    RequestSummarizedActivityProblemsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedActivityProblemsRequest,
                                    RequestSummarizedActivityProblemsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSummarizedActivityProblemsResponse::builder)
                .logger(LOG, "requestSummarizedActivityProblems")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSummarizedActivityProblems",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ActivityProblemAggregation/RequestSummarizedActivityProblems")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedActivityProblemsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam("actions")
                .appendPathParam("summarizeActivityProblems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("includeUnknownLocations", request.getIncludeUnknownLocations())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ActivityProblemAggregationCollection.class,
                        RequestSummarizedActivityProblemsResponse.Builder
                                ::activityProblemAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedActivityProblemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedActivityProblemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedProblemsResponse> requestSummarizedProblems(
            RequestSummarizedProblemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestSummarizedProblemsRequest, RequestSummarizedProblemsResponse>
                    handler) {
        Objects.requireNonNull(request.getListDimensions(), "listDimensions is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSummarizedProblemsResponse::builder)
                .logger(LOG, "requestSummarizedProblems")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSummarizedProblems",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ProblemAggregation/RequestSummarizedProblems")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedProblemsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam("actions")
                .appendPathParam("summarize")
                .appendListQueryParam(
                        "listDimensions",
                        request.getListDimensions(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ProblemAggregationCollection.class,
                        RequestSummarizedProblemsResponse.Builder::problemAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RequestSummarizedProblemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", RequestSummarizedProblemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedResponderExecutionsResponse>
            requestSummarizedResponderExecutions(
                    RequestSummarizedResponderExecutionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedResponderExecutionsRequest,
                                    RequestSummarizedResponderExecutionsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getResponderExecutionsDimensions(),
                "responderExecutionsDimensions is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSummarizedResponderExecutionsResponse::builder)
                .logger(LOG, "requestSummarizedResponderExecutions")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSummarizedResponderExecutions",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecutionAggregation/RequestSummarizedResponderExecutions")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedResponderExecutionsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderExecutions")
                .appendPathParam("actions")
                .appendPathParam("summarize")
                .appendListQueryParam(
                        "responderExecutionsDimensions",
                        request.getResponderExecutionsDimensions(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "responderTypeFilter",
                        request.getResponderTypeFilter(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "responderExecutionStatusFilter",
                        request.getResponderExecutionStatusFilter(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderExecutionAggregationCollection
                                .class,
                        RequestSummarizedResponderExecutionsResponse.Builder
                                ::responderExecutionAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedResponderExecutionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedResponderExecutionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedRiskScoresResponse>
            requestSummarizedRiskScores(
                    RequestSummarizedRiskScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedRiskScoresRequest,
                                    RequestSummarizedRiskScoresResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSummarizedRiskScoresResponse::builder)
                .logger(LOG, "requestSummarizedRiskScores")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSummarizedRiskScores",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/RiskScoreAggregation/RequestSummarizedRiskScores")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedRiskScoresRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam("actions")
                .appendPathParam("summarizeRiskScore")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.RiskScoreAggregationCollection.class,
                        RequestSummarizedRiskScoresResponse.Builder::riskScoreAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RequestSummarizedRiskScoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", RequestSummarizedRiskScoresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedSecurityScoresResponse>
            requestSummarizedSecurityScores(
                    RequestSummarizedSecurityScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedSecurityScoresRequest,
                                    RequestSummarizedSecurityScoresResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSummarizedSecurityScoresResponse::builder)
                .logger(LOG, "requestSummarizedSecurityScores")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSummarizedSecurityScores",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityScoreAggregation/RequestSummarizedSecurityScores")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedSecurityScoresRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam("actions")
                .appendPathParam("summarizeSecurityScore")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityScoreAggregationCollection.class,
                        RequestSummarizedSecurityScoresResponse.Builder
                                ::securityScoreAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedSecurityScoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedSecurityScoresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedTopTrendResourceProfileRiskScoresResponse>
            requestSummarizedTopTrendResourceProfileRiskScores(
                    RequestSummarizedTopTrendResourceProfileRiskScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTopTrendResourceProfileRiskScoresRequest,
                                    RequestSummarizedTopTrendResourceProfileRiskScoresResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(
                        request,
                        RequestSummarizedTopTrendResourceProfileRiskScoresResponse::builder)
                .logger(LOG, "requestSummarizedTopTrendResourceProfileRiskScores")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSummarizedTopTrendResourceProfileRiskScores",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceProfileRiskScoreAggregationSummary/RequestSummarizedTopTrendResourceProfileRiskScores")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedTopTrendResourceProfileRiskScoresRequest::builder)
                .basePath("/20200131")
                .appendPathParam("resourceProfileRiskScores")
                .appendPathParam("actions")
                .appendPathParam("summarizeTopTrends")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "timeScoreComputedGreaterThanOrEqualTo",
                        request.getTimeScoreComputedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeScoreComputedLessThanOrEqualTo",
                        request.getTimeScoreComputedLessThanOrEqualTo())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("count", request.getCount())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model
                                .ResourceProfileRiskScoreAggregationSummaryCollection.class,
                        RequestSummarizedTopTrendResourceProfileRiskScoresResponse.Builder
                                ::resourceProfileRiskScoreAggregationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedTopTrendResourceProfileRiskScoresResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedTopTrendResourceProfileRiskScoresResponse.Builder
                                ::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedTrendProblemsResponse>
            requestSummarizedTrendProblems(
                    RequestSummarizedTrendProblemsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendProblemsRequest,
                                    RequestSummarizedTrendProblemsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSummarizedTrendProblemsResponse::builder)
                .logger(LOG, "requestSummarizedTrendProblems")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSummarizedTrendProblems",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ProblemTrendAggregation/RequestSummarizedTrendProblems")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedTrendProblemsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam("actions")
                .appendPathParam("summarizeTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "timeFirstDetectedGreaterThanOrEqualTo",
                        request.getTimeFirstDetectedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeFirstDetectedLessThanOrEqualTo",
                        request.getTimeFirstDetectedLessThanOrEqualTo())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ProblemTrendAggregationCollection.class,
                        RequestSummarizedTrendProblemsResponse.Builder
                                ::problemTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedTrendProblemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedTrendProblemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedTrendResourceRiskScoresResponse>
            requestSummarizedTrendResourceRiskScores(
                    RequestSummarizedTrendResourceRiskScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendResourceRiskScoresRequest,
                                    RequestSummarizedTrendResourceRiskScoresResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRequestSummarizedTrendResourceRiskScoresDetails(),
                "requestSummarizedTrendResourceRiskScoresDetails is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSummarizedTrendResourceRiskScoresResponse::builder)
                .logger(LOG, "requestSummarizedTrendResourceRiskScores")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSummarizedTrendResourceRiskScores",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceRiskScoreAggregation/RequestSummarizedTrendResourceRiskScores")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedTrendResourceRiskScoresRequest::builder)
                .basePath("/20200131")
                .appendPathParam("resourceRiskScores")
                .appendPathParam("actions")
                .appendPathParam("summarizeTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "timeScoreComputedGreaterThanOrEqualTo",
                        request.getTimeScoreComputedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeScoreComputedLessThanOrEqualTo",
                        request.getTimeScoreComputedLessThanOrEqualTo())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResourceRiskScoreAggregationCollection
                                .class,
                        RequestSummarizedTrendResourceRiskScoresResponse.Builder
                                ::resourceRiskScoreAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedTrendResourceRiskScoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedTrendResourceRiskScoresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedTrendResponderExecutionsResponse>
            requestSummarizedTrendResponderExecutions(
                    RequestSummarizedTrendResponderExecutionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendResponderExecutionsRequest,
                                    RequestSummarizedTrendResponderExecutionsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSummarizedTrendResponderExecutionsResponse::builder)
                .logger(LOG, "requestSummarizedTrendResponderExecutions")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSummarizedTrendResponderExecutions",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecutionTrendAggregation/RequestSummarizedTrendResponderExecutions")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedTrendResponderExecutionsRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderExecutions")
                .appendPathParam("actions")
                .appendPathParam("summarizeTrend")
                .appendQueryParam(
                        "timeCompletedGreaterThanOrEqualTo",
                        request.getTimeCompletedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeCompletedLessThanOrEqualTo",
                        request.getTimeCompletedLessThanOrEqualTo())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderExecutionTrendAggregationCollection
                                .class,
                        RequestSummarizedTrendResponderExecutionsResponse.Builder
                                ::responderExecutionTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedTrendResponderExecutionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedTrendResponderExecutionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedTrendSecurityScoresResponse>
            requestSummarizedTrendSecurityScores(
                    RequestSummarizedTrendSecurityScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendSecurityScoresRequest,
                                    RequestSummarizedTrendSecurityScoresResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RequestSummarizedTrendSecurityScoresResponse::builder)
                .logger(LOG, "requestSummarizedTrendSecurityScores")
                .serviceDetails(
                        "CloudGuard",
                        "RequestSummarizedTrendSecurityScores",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityScoreTrendAggregation/RequestSummarizedTrendSecurityScores")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedTrendSecurityScoresRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam("actions")
                .appendPathParam("summarizeSecurityScoreTrend")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "timeScoreComputedGreaterThanOrEqualTo",
                        request.getTimeScoreComputedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeScoreComputedLessThanOrEqualTo",
                        request.getTimeScoreComputedLessThanOrEqualTo())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityScoreTrendAggregationCollection
                                .class,
                        RequestSummarizedTrendSecurityScoresResponse.Builder
                                ::securityScoreTrendAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedTrendSecurityScoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedTrendSecurityScoresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SkipBulkResponderExecutionResponse>
            skipBulkResponderExecution(
                    SkipBulkResponderExecutionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SkipBulkResponderExecutionRequest,
                                    SkipBulkResponderExecutionResponse>
                            handler) {
        Objects.requireNonNull(
                request.getSkipBulkResponderExecutionDetails(),
                "skipBulkResponderExecutionDetails is required");

        return clientCall(request, SkipBulkResponderExecutionResponse::builder)
                .logger(LOG, "skipBulkResponderExecution")
                .serviceDetails(
                        "CloudGuard",
                        "SkipBulkResponderExecution",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecution/SkipBulkResponderExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SkipBulkResponderExecutionRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderExecutions")
                .appendPathParam("actions")
                .appendPathParam("bulkSkip")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", SkipBulkResponderExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SkipResponderExecutionResponse> skipResponderExecution(
            SkipResponderExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SkipResponderExecutionRequest, SkipResponderExecutionResponse>
                    handler) {

        Validate.notBlank(
                request.getResponderExecutionId(), "responderExecutionId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, SkipResponderExecutionResponse::builder)
                .logger(LOG, "skipResponderExecution")
                .serviceDetails(
                        "CloudGuard",
                        "SkipResponderExecution",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecution/SkipResponderExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SkipResponderExecutionRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderExecutions")
                .appendPathParam(request.getResponderExecutionId())
                .appendPathParam("actions")
                .appendPathParam("skip")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", SkipResponderExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TriggerResponderResponse> triggerResponder(
            TriggerResponderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TriggerResponderRequest, TriggerResponderResponse>
                    handler) {

        Validate.notBlank(request.getProblemId(), "problemId must not be blank");
        Objects.requireNonNull(
                request.getTriggerResponderDetails(), "triggerResponderDetails is required");

        return clientCall(request, TriggerResponderResponse::builder)
                .logger(LOG, "triggerResponder")
                .serviceDetails(
                        "CloudGuard",
                        "TriggerResponder",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/TriggerResponder")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TriggerResponderRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam(request.getProblemId())
                .appendPathParam("actions")
                .appendPathParam("triggerResponder")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", TriggerResponderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBulkProblemStatusResponse> updateBulkProblemStatus(
            UpdateBulkProblemStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBulkProblemStatusRequest, UpdateBulkProblemStatusResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateBulkProblemStatusDetails(),
                "updateBulkProblemStatusDetails is required");

        return clientCall(request, UpdateBulkProblemStatusResponse::builder)
                .logger(LOG, "updateBulkProblemStatus")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateBulkProblemStatus",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/UpdateBulkProblemStatus")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateBulkProblemStatusRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam("actions")
                .appendPathParam("bulkUpdateStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBulkProblemStatusResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResponse> updateConfiguration(
            UpdateConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConfigurationRequest, UpdateConfigurationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateConfigurationDetails(), "updateConfigurationDetails is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, UpdateConfigurationResponse::builder)
                .logger(LOG, "updateConfiguration")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Configuration/UpdateConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConfigurationRequest::builder)
                .basePath("/20200131")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.Configuration.class,
                        UpdateConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString("etag", UpdateConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataMaskRuleResponse> updateDataMaskRule(
            UpdateDataMaskRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataMaskRuleRequest, UpdateDataMaskRuleResponse>
                    handler) {

        Validate.notBlank(request.getDataMaskRuleId(), "dataMaskRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataMaskRuleDetails(), "updateDataMaskRuleDetails is required");

        return clientCall(request, UpdateDataMaskRuleResponse::builder)
                .logger(LOG, "updateDataMaskRule")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateDataMaskRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataMaskRule/UpdateDataMaskRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataMaskRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataMaskRules")
                .appendPathParam(request.getDataMaskRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DataMaskRule.class,
                        UpdateDataMaskRuleResponse.Builder::dataMaskRule)
                .handleResponseHeaderString("etag", UpdateDataMaskRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDataMaskRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResponse> updateDataSource(
            UpdateDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataSourceRequest, UpdateDataSourceResponse>
                    handler) {

        Validate.notBlank(request.getDataSourceId(), "dataSourceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataSourceDetails(), "updateDataSourceDetails is required");

        return clientCall(request, UpdateDataSourceResponse::builder)
                .logger(LOG, "updateDataSource")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateDataSource",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/UpdateDataSource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataSourceRequest::builder)
                .basePath("/20200131")
                .appendPathParam("dataSources")
                .appendPathParam(request.getDataSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDataSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDataSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorRecipeResponse> updateDetectorRecipe(
            UpdateDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDetectorRecipeRequest, UpdateDetectorRecipeResponse>
                    handler) {

        Validate.notBlank(request.getDetectorRecipeId(), "detectorRecipeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDetectorRecipeDetails(),
                "updateDetectorRecipeDetails is required");

        return clientCall(request, UpdateDetectorRecipeResponse::builder)
                .logger(LOG, "updateDetectorRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateDetectorRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/UpdateDetectorRecipe")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDetectorRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendPathParam(request.getDetectorRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DetectorRecipe.class,
                        UpdateDetectorRecipeResponse.Builder::detectorRecipe)
                .handleResponseHeaderString("etag", UpdateDetectorRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDetectorRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorRecipeDetectorRuleResponse>
            updateDetectorRecipeDetectorRule(
                    UpdateDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDetectorRecipeDetectorRuleRequest,
                                    UpdateDetectorRecipeDetectorRuleResponse>
                            handler) {

        Validate.notBlank(request.getDetectorRecipeId(), "detectorRecipeId must not be blank");

        Validate.notBlank(request.getDetectorRuleId(), "detectorRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDetectorRecipeDetectorRuleDetails(),
                "updateDetectorRecipeDetectorRuleDetails is required");

        return clientCall(request, UpdateDetectorRecipeDetectorRuleResponse::builder)
                .logger(LOG, "updateDetectorRecipeDetectorRule")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateDetectorRecipeDetectorRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/UpdateDetectorRecipeDetectorRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDetectorRecipeDetectorRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("detectorRecipes")
                .appendPathParam(request.getDetectorRecipeId())
                .appendPathParam("detectorRules")
                .appendPathParam(request.getDetectorRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRule.class,
                        UpdateDetectorRecipeDetectorRuleResponse.Builder
                                ::detectorRecipeDetectorRule)
                .handleResponseHeaderString(
                        "etag", UpdateDetectorRecipeDetectorRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDetectorRecipeDetectorRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateManagedListResponse> updateManagedList(
            UpdateManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedListRequest, UpdateManagedListResponse>
                    handler) {

        Validate.notBlank(request.getManagedListId(), "managedListId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagedListDetails(), "updateManagedListDetails is required");

        return clientCall(request, UpdateManagedListResponse::builder)
                .logger(LOG, "updateManagedList")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateManagedList",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/UpdateManagedList")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagedListRequest::builder)
                .basePath("/20200131")
                .appendPathParam("managedLists")
                .appendPathParam(request.getManagedListId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ManagedList.class,
                        UpdateManagedListResponse.Builder::managedList)
                .handleResponseHeaderString("etag", UpdateManagedListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagedListResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProblemStatusResponse> updateProblemStatus(
            UpdateProblemStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateProblemStatusRequest, UpdateProblemStatusResponse>
                    handler) {

        Validate.notBlank(request.getProblemId(), "problemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProblemStatusDetails(), "updateProblemStatusDetails is required");

        return clientCall(request, UpdateProblemStatusResponse::builder)
                .logger(LOG, "updateProblemStatus")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateProblemStatus",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/UpdateProblemStatus")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateProblemStatusRequest::builder)
                .basePath("/20200131")
                .appendPathParam("problems")
                .appendPathParam(request.getProblemId())
                .appendPathParam("actions")
                .appendPathParam("updateStatus")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.Problem.class,
                        UpdateProblemStatusResponse.Builder::problem)
                .handleResponseHeaderString("etag", UpdateProblemStatusResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProblemStatusResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateResponderRecipeResponse> updateResponderRecipe(
            UpdateResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateResponderRecipeRequest, UpdateResponderRecipeResponse>
                    handler) {

        Validate.notBlank(request.getResponderRecipeId(), "responderRecipeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateResponderRecipeDetails(),
                "updateResponderRecipeDetails is required");

        return clientCall(request, UpdateResponderRecipeResponse::builder)
                .logger(LOG, "updateResponderRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateResponderRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/UpdateResponderRecipe")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateResponderRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRecipes")
                .appendPathParam(request.getResponderRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderRecipe.class,
                        UpdateResponderRecipeResponse.Builder::responderRecipe)
                .handleResponseHeaderString("etag", UpdateResponderRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateResponderRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateResponderRecipeResponderRuleResponse>
            updateResponderRecipeResponderRule(
                    UpdateResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateResponderRecipeResponderRuleRequest,
                                    UpdateResponderRecipeResponderRuleResponse>
                            handler) {

        Validate.notBlank(request.getResponderRecipeId(), "responderRecipeId must not be blank");

        Validate.notBlank(request.getResponderRuleId(), "responderRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateResponderRecipeResponderRuleDetails(),
                "updateResponderRecipeResponderRuleDetails is required");

        return clientCall(request, UpdateResponderRecipeResponderRuleResponse::builder)
                .logger(LOG, "updateResponderRecipeResponderRule")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateResponderRecipeResponderRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipeResponderRule/UpdateResponderRecipeResponderRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateResponderRecipeResponderRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("responderRecipes")
                .appendPathParam(request.getResponderRecipeId())
                .appendPathParam("responderRules")
                .appendPathParam(request.getResponderRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRule.class,
                        UpdateResponderRecipeResponderRuleResponse.Builder
                                ::responderRecipeResponderRule)
                .handleResponseHeaderString(
                        "etag", UpdateResponderRecipeResponderRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateResponderRecipeResponderRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityRecipeResponse> updateSecurityRecipe(
            UpdateSecurityRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityRecipeRequest, UpdateSecurityRecipeResponse>
                    handler) {

        Validate.notBlank(request.getSecurityRecipeId(), "securityRecipeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityRecipeDetails(),
                "updateSecurityRecipeDetails is required");

        return clientCall(request, UpdateSecurityRecipeResponse::builder)
                .logger(LOG, "updateSecurityRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateSecurityRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipe/UpdateSecurityRecipe")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityRecipes")
                .appendPathParam(request.getSecurityRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityRecipe.class,
                        UpdateSecurityRecipeResponse.Builder::securityRecipe)
                .handleResponseHeaderString("etag", UpdateSecurityRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecurityRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityZoneResponse> updateSecurityZone(
            UpdateSecurityZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityZoneRequest, UpdateSecurityZoneResponse>
                    handler) {

        Validate.notBlank(request.getSecurityZoneId(), "securityZoneId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityZoneDetails(), "updateSecurityZoneDetails is required");

        return clientCall(request, UpdateSecurityZoneResponse::builder)
                .logger(LOG, "updateSecurityZone")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateSecurityZone",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/UpdateSecurityZone")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityZoneRequest::builder)
                .basePath("/20200131")
                .appendPathParam("securityZones")
                .appendPathParam(request.getSecurityZoneId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.SecurityZone.class,
                        UpdateSecurityZoneResponse.Builder::securityZone)
                .handleResponseHeaderString("etag", UpdateSecurityZoneResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecurityZoneResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetResponse> updateTarget(
            UpdateTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTargetRequest, UpdateTargetResponse>
                    handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");
        Objects.requireNonNull(request.getUpdateTargetDetails(), "updateTargetDetails is required");

        return clientCall(request, UpdateTargetResponse::builder)
                .logger(LOG, "updateTarget")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateTarget",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Target/UpdateTarget")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTargetRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.Target.class,
                        UpdateTargetResponse.Builder::target)
                .handleResponseHeaderString("etag", UpdateTargetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTargetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetDetectorRecipeResponse>
            updateTargetDetectorRecipe(
                    UpdateTargetDetectorRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetDetectorRecipeRequest,
                                    UpdateTargetDetectorRecipeResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetDetectorRecipeId(), "targetDetectorRecipeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTargetDetectorRecipeDetails(),
                "updateTargetDetectorRecipeDetails is required");

        return clientCall(request, UpdateTargetDetectorRecipeResponse::builder)
                .logger(LOG, "updateTargetDetectorRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateTargetDetectorRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipe/UpdateTargetDetectorRecipe")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTargetDetectorRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetDetectorRecipes")
                .appendPathParam(request.getTargetDetectorRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetDetectorRecipe.class,
                        UpdateTargetDetectorRecipeResponse.Builder::targetDetectorRecipe)
                .handleResponseHeaderString(
                        "etag", UpdateTargetDetectorRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTargetDetectorRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetDetectorRecipeDetectorRuleResponse>
            updateTargetDetectorRecipeDetectorRule(
                    UpdateTargetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetDetectorRecipeDetectorRuleRequest,
                                    UpdateTargetDetectorRecipeDetectorRuleResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetDetectorRecipeId(), "targetDetectorRecipeId must not be blank");

        Validate.notBlank(request.getDetectorRuleId(), "detectorRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTargetDetectorRecipeDetectorRuleDetails(),
                "updateTargetDetectorRecipeDetectorRuleDetails is required");

        return clientCall(request, UpdateTargetDetectorRecipeDetectorRuleResponse::builder)
                .logger(LOG, "updateTargetDetectorRecipeDetectorRule")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateTargetDetectorRecipeDetectorRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipeDetectorRule/UpdateTargetDetectorRecipeDetectorRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTargetDetectorRecipeDetectorRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetDetectorRecipes")
                .appendPathParam(request.getTargetDetectorRecipeId())
                .appendPathParam("detectorRules")
                .appendPathParam(request.getDetectorRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRule.class,
                        UpdateTargetDetectorRecipeDetectorRuleResponse.Builder
                                ::targetDetectorRecipeDetectorRule)
                .handleResponseHeaderString(
                        "etag", UpdateTargetDetectorRecipeDetectorRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateTargetDetectorRecipeDetectorRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetResponderRecipeResponse>
            updateTargetResponderRecipe(
                    UpdateTargetResponderRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetResponderRecipeRequest,
                                    UpdateTargetResponderRecipeResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetResponderRecipeId(), "targetResponderRecipeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTargetResponderRecipeDetails(),
                "updateTargetResponderRecipeDetails is required");

        return clientCall(request, UpdateTargetResponderRecipeResponse::builder)
                .logger(LOG, "updateTargetResponderRecipe")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateTargetResponderRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipe/UpdateTargetResponderRecipe")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTargetResponderRecipeRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetResponderRecipes")
                .appendPathParam(request.getTargetResponderRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetResponderRecipe.class,
                        UpdateTargetResponderRecipeResponse.Builder::targetResponderRecipe)
                .handleResponseHeaderString(
                        "etag", UpdateTargetResponderRecipeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTargetResponderRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetResponderRecipeResponderRuleResponse>
            updateTargetResponderRecipeResponderRule(
                    UpdateTargetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetResponderRecipeResponderRuleRequest,
                                    UpdateTargetResponderRecipeResponderRuleResponse>
                            handler) {

        Validate.notBlank(request.getTargetId(), "targetId must not be blank");

        Validate.notBlank(
                request.getTargetResponderRecipeId(), "targetResponderRecipeId must not be blank");

        Validate.notBlank(request.getResponderRuleId(), "responderRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTargetResponderRecipeResponderRuleDetails(),
                "updateTargetResponderRecipeResponderRuleDetails is required");

        return clientCall(request, UpdateTargetResponderRecipeResponderRuleResponse::builder)
                .logger(LOG, "updateTargetResponderRecipeResponderRule")
                .serviceDetails(
                        "CloudGuard",
                        "UpdateTargetResponderRecipeResponderRule",
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipeResponderRule/UpdateTargetResponderRecipeResponderRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTargetResponderRecipeResponderRuleRequest::builder)
                .basePath("/20200131")
                .appendPathParam("targets")
                .appendPathParam(request.getTargetId())
                .appendPathParam("targetResponderRecipes")
                .appendPathParam(request.getTargetResponderRecipeId())
                .appendPathParam("responderRules")
                .appendPathParam(request.getResponderRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRule.class,
                        UpdateTargetResponderRecipeResponderRuleResponse.Builder
                                ::targetResponderRecipeResponderRule)
                .handleResponseHeaderString(
                        "etag", UpdateTargetResponderRecipeResponderRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateTargetResponderRecipeResponderRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
