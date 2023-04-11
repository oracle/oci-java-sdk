/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class CloudGuardClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements CloudGuard {
    /** Service instance for CloudGuard. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CLOUDGUARD")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://cloudguard-cp-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CloudGuardClient.class);

    private final CloudGuardWaiters waiters;

    private final CloudGuardPaginators paginators;

    CloudGuardClient(
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
                                    .nameFormat("CloudGuard-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new CloudGuardWaiters(executorService, this);

        this.paginators = new CloudGuardPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CloudGuardClient> {
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
        public CloudGuardClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new CloudGuardClient(this, authenticationDetailsProvider, executorService);
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
    public AddCompartmentResponse addCompartment(AddCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeDataSourceCompartmentResponse changeDataSourceCompartment(
            ChangeDataSourceCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeDetectorRecipeCompartmentResponse changeDetectorRecipeCompartment(
            ChangeDetectorRecipeCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeManagedListCompartmentResponse changeManagedListCompartment(
            ChangeManagedListCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeResponderRecipeCompartmentResponse changeResponderRecipeCompartment(
            ChangeResponderRecipeCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeSecurityRecipeCompartmentResponse changeSecurityRecipeCompartment(
            ChangeSecurityRecipeCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeSecurityZoneCompartmentResponse changeSecurityZoneCompartment(
            ChangeSecurityZoneCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public CreateDataMaskRuleResponse createDataMaskRule(CreateDataMaskRuleRequest request) {
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
                .callSync();
    }

    @Override
    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) {
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
                .callSync();
    }

    @Override
    public CreateDetectorRecipeResponse createDetectorRecipe(CreateDetectorRecipeRequest request) {
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
                .callSync();
    }

    @Override
    public CreateDetectorRecipeDetectorRuleResponse createDetectorRecipeDetectorRule(
            CreateDetectorRecipeDetectorRuleRequest request) {

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
                .callSync();
    }

    @Override
    public CreateManagedListResponse createManagedList(CreateManagedListRequest request) {
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
                .callSync();
    }

    @Override
    public CreateResponderRecipeResponse createResponderRecipe(
            CreateResponderRecipeRequest request) {
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
                .callSync();
    }

    @Override
    public CreateSecurityRecipeResponse createSecurityRecipe(CreateSecurityRecipeRequest request) {
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
                .callSync();
    }

    @Override
    public CreateSecurityZoneResponse createSecurityZone(CreateSecurityZoneRequest request) {
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
                .callSync();
    }

    @Override
    public CreateTargetResponse createTarget(CreateTargetRequest request) {
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
                .callSync();
    }

    @Override
    public CreateTargetDetectorRecipeResponse createTargetDetectorRecipe(
            CreateTargetDetectorRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public CreateTargetResponderRecipeResponse createTargetResponderRecipe(
            CreateTargetResponderRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteDataMaskRuleResponse deleteDataMaskRule(DeleteDataMaskRuleRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteDetectorRecipeResponse deleteDetectorRecipe(DeleteDetectorRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteDetectorRecipeDetectorRuleResponse deleteDetectorRecipeDetectorRule(
            DeleteDetectorRecipeDetectorRuleRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteDetectorRecipeDetectorRuleDataSourceResponse
            deleteDetectorRecipeDetectorRuleDataSource(
                    DeleteDetectorRecipeDetectorRuleDataSourceRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteManagedListResponse deleteManagedList(DeleteManagedListRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteResponderRecipeResponse deleteResponderRecipe(
            DeleteResponderRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteSecurityRecipeResponse deleteSecurityRecipe(DeleteSecurityRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteSecurityZoneResponse deleteSecurityZone(DeleteSecurityZoneRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteTargetResponse deleteTarget(DeleteTargetRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteTargetDetectorRecipeResponse deleteTargetDetectorRecipe(
            DeleteTargetDetectorRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteTargetResponderRecipeResponse deleteTargetResponderRecipe(
            DeleteTargetResponderRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public ExecuteResponderExecutionResponse executeResponderExecution(
            ExecuteResponderExecutionRequest request) {

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
                .callSync();
    }

    @Override
    public GetConditionMetadataTypeResponse getConditionMetadataType(
            GetConditionMetadataTypeRequest request) {

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
                .callSync();
    }

    @Override
    public GetConfigurationResponse getConfiguration(GetConfigurationRequest request) {
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
                .callSync();
    }

    @Override
    public GetDataMaskRuleResponse getDataMaskRule(GetDataMaskRuleRequest request) {

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
                .callSync();
    }

    @Override
    public GetDataSourceResponse getDataSource(GetDataSourceRequest request) {

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
                .callSync();
    }

    @Override
    public GetDetectorResponse getDetector(GetDetectorRequest request) {

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
                .callSync();
    }

    @Override
    public GetDetectorRecipeResponse getDetectorRecipe(GetDetectorRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public GetDetectorRecipeDetectorRuleResponse getDetectorRecipeDetectorRule(
            GetDetectorRecipeDetectorRuleRequest request) {

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
                .callSync();
    }

    @Override
    public GetDetectorRuleResponse getDetectorRule(GetDetectorRuleRequest request) {

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
                .callSync();
    }

    @Override
    public GetManagedListResponse getManagedList(GetManagedListRequest request) {

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
                .callSync();
    }

    @Override
    public GetProblemResponse getProblem(GetProblemRequest request) {

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
                .callSync();
    }

    @Override
    public GetResourceProfileResponse getResourceProfile(GetResourceProfileRequest request) {

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
                .callSync();
    }

    @Override
    public GetResponderExecutionResponse getResponderExecution(
            GetResponderExecutionRequest request) {

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
                .callSync();
    }

    @Override
    public GetResponderRecipeResponse getResponderRecipe(GetResponderRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public GetResponderRecipeResponderRuleResponse getResponderRecipeResponderRule(
            GetResponderRecipeResponderRuleRequest request) {

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
                .callSync();
    }

    @Override
    public GetResponderRuleResponse getResponderRule(GetResponderRuleRequest request) {

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
                .callSync();
    }

    @Override
    public GetSecurityPolicyResponse getSecurityPolicy(GetSecurityPolicyRequest request) {

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
                .callSync();
    }

    @Override
    public GetSecurityRecipeResponse getSecurityRecipe(GetSecurityRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public GetSecurityZoneResponse getSecurityZone(GetSecurityZoneRequest request) {

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
                .callSync();
    }

    @Override
    public GetSightingResponse getSighting(GetSightingRequest request) {

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
                .callSync();
    }

    @Override
    public GetTargetResponse getTarget(GetTargetRequest request) {

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
                .callSync();
    }

    @Override
    public GetTargetDetectorRecipeResponse getTargetDetectorRecipe(
            GetTargetDetectorRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public GetTargetDetectorRecipeDetectorRuleResponse getTargetDetectorRecipeDetectorRule(
            GetTargetDetectorRecipeDetectorRuleRequest request) {

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
                .callSync();
    }

    @Override
    public GetTargetResponderRecipeResponse getTargetResponderRecipe(
            GetTargetResponderRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public GetTargetResponderRecipeResponderRuleResponse getTargetResponderRecipeResponderRule(
            GetTargetResponderRecipeResponderRuleRequest request) {

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
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .callSync();
    }

    @Override
    public ListConditionMetadataTypesResponse listConditionMetadataTypes(
            ListConditionMetadataTypesRequest request) {
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
                .callSync();
    }

    @Override
    public ListDataMaskRulesResponse listDataMaskRules(ListDataMaskRulesRequest request) {
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
                .callSync();
    }

    @Override
    public ListDataSourceEventsResponse listDataSourceEvents(ListDataSourceEventsRequest request) {

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
                .callSync();
    }

    @Override
    public ListDataSourcesResponse listDataSources(ListDataSourcesRequest request) {
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
                .callSync();
    }

    @Override
    public ListDetectorRecipeDetectorRulesResponse listDetectorRecipeDetectorRules(
            ListDetectorRecipeDetectorRulesRequest request) {

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
                .callSync();
    }

    @Override
    public ListDetectorRecipesResponse listDetectorRecipes(ListDetectorRecipesRequest request) {
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
                .callSync();
    }

    @Override
    public ListDetectorRulesResponse listDetectorRules(ListDetectorRulesRequest request) {

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
                .callSync();
    }

    @Override
    public ListDetectorsResponse listDetectors(ListDetectorsRequest request) {
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
                .callSync();
    }

    @Override
    public ListImpactedResourcesResponse listImpactedResources(
            ListImpactedResourcesRequest request) {

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
                .callSync();
    }

    @Override
    public ListManagedListTypesResponse listManagedListTypes(ListManagedListTypesRequest request) {
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
                .callSync();
    }

    @Override
    public ListManagedListsResponse listManagedLists(ListManagedListsRequest request) {
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
                .callSync();
    }

    @Override
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
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
                .callSync();
    }

    @Override
    public ListProblemEndpointsResponse listProblemEndpoints(ListProblemEndpointsRequest request) {

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
                .callSync();
    }

    @Override
    public ListProblemEntitiesResponse listProblemEntities(ListProblemEntitiesRequest request) {

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
                .callSync();
    }

    @Override
    public ListProblemHistoriesResponse listProblemHistories(ListProblemHistoriesRequest request) {
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
                .callSync();
    }

    @Override
    public ListProblemsResponse listProblems(ListProblemsRequest request) {
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
                .callSync();
    }

    @Override
    public ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request) {
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
                .callSync();
    }

    @Override
    public ListResourceProfileEndpointsResponse listResourceProfileEndpoints(
            ListResourceProfileEndpointsRequest request) {

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
                .callSync();
    }

    @Override
    public ListResourceProfileImpactedResourcesResponse listResourceProfileImpactedResources(
            ListResourceProfileImpactedResourcesRequest request) {

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
                .callSync();
    }

    @Override
    public ListResourceProfilesResponse listResourceProfiles(ListResourceProfilesRequest request) {
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
                .callSync();
    }

    @Override
    public ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request) {
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
                .callSync();
    }

    @Override
    public ListResponderActivitiesResponse listResponderActivities(
            ListResponderActivitiesRequest request) {

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
                .callSync();
    }

    @Override
    public ListResponderExecutionsResponse listResponderExecutions(
            ListResponderExecutionsRequest request) {
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
                .callSync();
    }

    @Override
    public ListResponderRecipeResponderRulesResponse listResponderRecipeResponderRules(
            ListResponderRecipeResponderRulesRequest request) {

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
                .callSync();
    }

    @Override
    public ListResponderRecipesResponse listResponderRecipes(ListResponderRecipesRequest request) {
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
                .callSync();
    }

    @Override
    public ListResponderRulesResponse listResponderRules(ListResponderRulesRequest request) {
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
                .callSync();
    }

    @Override
    public ListSecurityPoliciesResponse listSecurityPolicies(ListSecurityPoliciesRequest request) {
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
                .callSync();
    }

    @Override
    public ListSecurityRecipesResponse listSecurityRecipes(ListSecurityRecipesRequest request) {
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
                .callSync();
    }

    @Override
    public ListSecurityZonesResponse listSecurityZones(ListSecurityZonesRequest request) {
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
                .callSync();
    }

    @Override
    public ListSightingEndpointsResponse listSightingEndpoints(
            ListSightingEndpointsRequest request) {

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
                .callSync();
    }

    @Override
    public ListSightingImpactedResourcesResponse listSightingImpactedResources(
            ListSightingImpactedResourcesRequest request) {

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
                .callSync();
    }

    @Override
    public ListSightingsResponse listSightings(ListSightingsRequest request) {
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
                .callSync();
    }

    @Override
    public ListTacticsResponse listTactics(ListTacticsRequest request) {
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
                .callSync();
    }

    @Override
    public ListTargetDetectorRecipeDetectorRulesResponse listTargetDetectorRecipeDetectorRules(
            ListTargetDetectorRecipeDetectorRulesRequest request) {

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
                .callSync();
    }

    @Override
    public ListTargetDetectorRecipesResponse listTargetDetectorRecipes(
            ListTargetDetectorRecipesRequest request) {

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
                .callSync();
    }

    @Override
    public ListTargetResponderRecipeResponderRulesResponse listTargetResponderRecipeResponderRules(
            ListTargetResponderRecipeResponderRulesRequest request) {

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
                .callSync();
    }

    @Override
    public ListTargetResponderRecipesResponse listTargetResponderRecipes(
            ListTargetResponderRecipesRequest request) {

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
                .callSync();
    }

    @Override
    public ListTargetsResponse listTargets(ListTargetsRequest request) {
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
                .callSync();
    }

    @Override
    public ListTechniquesResponse listTechniques(ListTechniquesRequest request) {
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
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

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
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
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
                .callSync();
    }

    @Override
    public RemoveCompartmentResponse removeCompartment(RemoveCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public RequestRiskScoresResponse requestRiskScores(RequestRiskScoresRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSecurityScoreSummarizedTrendResponse requestSecurityScoreSummarizedTrend(
            RequestSecurityScoreSummarizedTrendRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSecurityScoresResponse requestSecurityScores(
            RequestSecurityScoresRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSummarizedActivityProblemsResponse requestSummarizedActivityProblems(
            RequestSummarizedActivityProblemsRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSummarizedProblemsResponse requestSummarizedProblems(
            RequestSummarizedProblemsRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSummarizedResponderExecutionsResponse requestSummarizedResponderExecutions(
            RequestSummarizedResponderExecutionsRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSummarizedRiskScoresResponse requestSummarizedRiskScores(
            RequestSummarizedRiskScoresRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSummarizedSecurityScoresResponse requestSummarizedSecurityScores(
            RequestSummarizedSecurityScoresRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSummarizedTopTrendResourceProfileRiskScoresResponse
            requestSummarizedTopTrendResourceProfileRiskScores(
                    RequestSummarizedTopTrendResourceProfileRiskScoresRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSummarizedTrendProblemsResponse requestSummarizedTrendProblems(
            RequestSummarizedTrendProblemsRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSummarizedTrendResourceRiskScoresResponse
            requestSummarizedTrendResourceRiskScores(
                    RequestSummarizedTrendResourceRiskScoresRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSummarizedTrendResponderExecutionsResponse
            requestSummarizedTrendResponderExecutions(
                    RequestSummarizedTrendResponderExecutionsRequest request) {
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
                .callSync();
    }

    @Override
    public RequestSummarizedTrendSecurityScoresResponse requestSummarizedTrendSecurityScores(
            RequestSummarizedTrendSecurityScoresRequest request) {
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
                .callSync();
    }

    @Override
    public SkipBulkResponderExecutionResponse skipBulkResponderExecution(
            SkipBulkResponderExecutionRequest request) {
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
                .callSync();
    }

    @Override
    public SkipResponderExecutionResponse skipResponderExecution(
            SkipResponderExecutionRequest request) {

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
                .callSync();
    }

    @Override
    public TriggerResponderResponse triggerResponder(TriggerResponderRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateBulkProblemStatusResponse updateBulkProblemStatus(
            UpdateBulkProblemStatusRequest request) {
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
                .callSync();
    }

    @Override
    public UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request) {
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
                .callSync();
    }

    @Override
    public UpdateDataMaskRuleResponse updateDataMaskRule(UpdateDataMaskRuleRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateDetectorRecipeResponse updateDetectorRecipe(UpdateDetectorRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateDetectorRecipeDetectorRuleResponse updateDetectorRecipeDetectorRule(
            UpdateDetectorRecipeDetectorRuleRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateManagedListResponse updateManagedList(UpdateManagedListRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateProblemStatusResponse updateProblemStatus(UpdateProblemStatusRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateResponderRecipeResponse updateResponderRecipe(
            UpdateResponderRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateResponderRecipeResponderRuleResponse updateResponderRecipeResponderRule(
            UpdateResponderRecipeResponderRuleRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateSecurityRecipeResponse updateSecurityRecipe(UpdateSecurityRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateSecurityZoneResponse updateSecurityZone(UpdateSecurityZoneRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateTargetResponse updateTarget(UpdateTargetRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateTargetDetectorRecipeResponse updateTargetDetectorRecipe(
            UpdateTargetDetectorRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateTargetDetectorRecipeDetectorRuleResponse updateTargetDetectorRecipeDetectorRule(
            UpdateTargetDetectorRecipeDetectorRuleRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateTargetResponderRecipeResponse updateTargetResponderRecipe(
            UpdateTargetResponderRecipeRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateTargetResponderRecipeResponderRuleResponse
            updateTargetResponderRecipeResponderRule(
                    UpdateTargetResponderRecipeResponderRuleRequest request) {

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
                .callSync();
    }

    @Override
    public CloudGuardWaiters getWaiters() {
        return waiters;
    }

    @Override
    public CloudGuardPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CloudGuardClient(
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
    public CloudGuardClient(
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
    public CloudGuardClient(
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
    public CloudGuardClient(
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
    public CloudGuardClient(
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
    public CloudGuardClient(
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
    public CloudGuardClient(
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
    public CloudGuardClient(
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
