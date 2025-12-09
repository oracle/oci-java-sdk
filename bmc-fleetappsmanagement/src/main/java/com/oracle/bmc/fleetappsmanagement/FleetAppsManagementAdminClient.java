/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class FleetAppsManagementAdminClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements FleetAppsManagementAdmin {
    /** Service instance for FleetAppsManagementAdmin. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(FleetAppsManagementAdminClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementAdminClient.class);

    private final FleetAppsManagementAdminWaiters waiters;

    private final FleetAppsManagementAdminPaginators paginators;

    FleetAppsManagementAdminClient(
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
                                    .nameFormat("FleetAppsManagementAdmin-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new FleetAppsManagementAdminWaiters(executorService, this);

        this.paginators = new FleetAppsManagementAdminPaginators(this);
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
                    Builder, FleetAppsManagementAdminClient> {
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
        public FleetAppsManagementAdminClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementAdminClient(
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
    public ChangePlatformConfigurationCompartmentResponse changePlatformConfigurationCompartment(
            ChangePlatformConfigurationCompartmentRequest request) {

        Validate.notBlank(
                request.getPlatformConfigurationId(), "platformConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getChangePlatformConfigurationCompartmentDetails(),
                "changePlatformConfigurationCompartmentDetails is required");

        return clientCall(request, ChangePlatformConfigurationCompartmentResponse::builder)
                .logger(LOG, "changePlatformConfigurationCompartment")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ChangePlatformConfigurationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/PlatformConfiguration/ChangePlatformConfigurationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePlatformConfigurationCompartmentRequest::builder)
                .basePath("/20250228")
                .appendPathParam("platformConfigurations")
                .appendPathParam(request.getPlatformConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePlatformConfigurationCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePlatformConfigurationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePropertyCompartmentResponse changePropertyCompartment(
            ChangePropertyCompartmentRequest request) {

        Validate.notBlank(request.getPropertyId(), "propertyId must not be blank");
        Objects.requireNonNull(
                request.getChangePropertyCompartmentDetails(),
                "changePropertyCompartmentDetails is required");

        return clientCall(request, ChangePropertyCompartmentResponse::builder)
                .logger(LOG, "changePropertyCompartment")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ChangePropertyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Property/ChangePropertyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePropertyCompartmentRequest::builder)
                .basePath("/20250228")
                .appendPathParam("properties")
                .appendPathParam(request.getPropertyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePropertyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangePropertyCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateCompliancePolicyRuleResponse createCompliancePolicyRule(
            CreateCompliancePolicyRuleRequest request) {
        Objects.requireNonNull(
                request.getCreateCompliancePolicyRuleDetails(),
                "createCompliancePolicyRuleDetails is required");

        return clientCall(request, CreateCompliancePolicyRuleResponse::builder)
                .logger(LOG, "createCompliancePolicyRule")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "CreateCompliancePolicyRule",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CompliancePolicyRule/CreateCompliancePolicyRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCompliancePolicyRuleRequest::builder)
                .basePath("/20250228")
                .appendPathParam("compliancePolicyRules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CompliancePolicyRule.class,
                        CreateCompliancePolicyRuleResponse.Builder::compliancePolicyRule)
                .handleResponseHeaderString(
                        "location", CreateCompliancePolicyRuleResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateCompliancePolicyRuleResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateCompliancePolicyRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateCompliancePolicyRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCompliancePolicyRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOnboardingResponse createOnboarding(CreateOnboardingRequest request) {
        Objects.requireNonNull(
                request.getCreateOnboardingDetails(), "createOnboardingDetails is required");

        return clientCall(request, CreateOnboardingResponse::builder)
                .logger(LOG, "createOnboarding")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "CreateOnboarding",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Onboarding/CreateOnboarding")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOnboardingRequest::builder)
                .basePath("/20250228")
                .appendPathParam("onboardings")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Onboarding.class,
                        CreateOnboardingResponse.Builder::onboarding)
                .handleResponseHeaderString("location", CreateOnboardingResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateOnboardingResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateOnboardingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateOnboardingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOnboardingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePlatformConfigurationResponse createPlatformConfiguration(
            CreatePlatformConfigurationRequest request) {
        Objects.requireNonNull(
                request.getCreatePlatformConfigurationDetails(),
                "createPlatformConfigurationDetails is required");

        return clientCall(request, CreatePlatformConfigurationResponse::builder)
                .logger(LOG, "createPlatformConfiguration")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "CreatePlatformConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/PlatformConfiguration/CreatePlatformConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePlatformConfigurationRequest::builder)
                .basePath("/20250228")
                .appendPathParam("platformConfigurations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.PlatformConfiguration.class,
                        CreatePlatformConfigurationResponse.Builder::platformConfiguration)
                .handleResponseHeaderString(
                        "location", CreatePlatformConfigurationResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreatePlatformConfigurationResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreatePlatformConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePlatformConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePlatformConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePropertyResponse createProperty(CreatePropertyRequest request) {
        Objects.requireNonNull(
                request.getCreatePropertyDetails(), "createPropertyDetails is required");

        return clientCall(request, CreatePropertyResponse::builder)
                .logger(LOG, "createProperty")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "CreateProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Property/CreateProperty")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePropertyRequest::builder)
                .basePath("/20250228")
                .appendPathParam("properties")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Property.class,
                        CreatePropertyResponse.Builder::property)
                .handleResponseHeaderString("etag", CreatePropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCompliancePolicyRuleResponse deleteCompliancePolicyRule(
            DeleteCompliancePolicyRuleRequest request) {

        Validate.notBlank(
                request.getCompliancePolicyRuleId(), "compliancePolicyRuleId must not be blank");

        return clientCall(request, DeleteCompliancePolicyRuleResponse::builder)
                .logger(LOG, "deleteCompliancePolicyRule")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "DeleteCompliancePolicyRule",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CompliancePolicyRule/DeleteCompliancePolicyRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCompliancePolicyRuleRequest::builder)
                .basePath("/20250228")
                .appendPathParam("compliancePolicyRules")
                .appendPathParam(request.getCompliancePolicyRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteCompliancePolicyRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCompliancePolicyRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOnboardingResponse deleteOnboarding(DeleteOnboardingRequest request) {

        Validate.notBlank(request.getOnboardingId(), "onboardingId must not be blank");

        return clientCall(request, DeleteOnboardingResponse::builder)
                .logger(LOG, "deleteOnboarding")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "DeleteOnboarding",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Onboarding/DeleteOnboarding")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOnboardingRequest::builder)
                .basePath("/20250228")
                .appendPathParam("onboardings")
                .appendPathParam(request.getOnboardingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteOnboardingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOnboardingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePlatformConfigurationResponse deletePlatformConfiguration(
            DeletePlatformConfigurationRequest request) {

        Validate.notBlank(
                request.getPlatformConfigurationId(), "platformConfigurationId must not be blank");

        return clientCall(request, DeletePlatformConfigurationResponse::builder)
                .logger(LOG, "deletePlatformConfiguration")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "DeletePlatformConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/PlatformConfiguration/DeletePlatformConfiguration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePlatformConfigurationRequest::builder)
                .basePath("/20250228")
                .appendPathParam("platformConfigurations")
                .appendPathParam(request.getPlatformConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePlatformConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePlatformConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePropertyResponse deleteProperty(DeletePropertyRequest request) {

        Validate.notBlank(request.getPropertyId(), "propertyId must not be blank");

        return clientCall(request, DeletePropertyResponse::builder)
                .logger(LOG, "deleteProperty")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "DeleteProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Property/DeleteProperty")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePropertyRequest::builder)
                .basePath("/20250228")
                .appendPathParam("properties")
                .appendPathParam(request.getPropertyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeletePropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableLatestPolicyResponse enableLatestPolicy(EnableLatestPolicyRequest request) {

        Validate.notBlank(request.getOnboardingId(), "onboardingId must not be blank");
        Objects.requireNonNull(
                request.getEnableLatestPolicyDetails(), "enableLatestPolicyDetails is required");

        return clientCall(request, EnableLatestPolicyResponse::builder)
                .logger(LOG, "enableLatestPolicy")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "EnableLatestPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Onboarding/EnableLatestPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableLatestPolicyRequest::builder)
                .basePath("/20250228")
                .appendPathParam("onboardings")
                .appendPathParam(request.getOnboardingId())
                .appendPathParam("actions")
                .appendPathParam("enableLatestPolicy")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", EnableLatestPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCompliancePolicyResponse getCompliancePolicy(GetCompliancePolicyRequest request) {

        Validate.notBlank(request.getCompliancePolicyId(), "compliancePolicyId must not be blank");

        return clientCall(request, GetCompliancePolicyResponse::builder)
                .logger(LOG, "getCompliancePolicy")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "GetCompliancePolicy",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CompliancePolicy/GetCompliancePolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCompliancePolicyRequest::builder)
                .basePath("/20250228")
                .appendPathParam("compliancePolicies")
                .appendPathParam(request.getCompliancePolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CompliancePolicy.class,
                        GetCompliancePolicyResponse.Builder::compliancePolicy)
                .handleResponseHeaderString("etag", GetCompliancePolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCompliancePolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCompliancePolicyRuleResponse getCompliancePolicyRule(
            GetCompliancePolicyRuleRequest request) {

        Validate.notBlank(
                request.getCompliancePolicyRuleId(), "compliancePolicyRuleId must not be blank");

        return clientCall(request, GetCompliancePolicyRuleResponse::builder)
                .logger(LOG, "getCompliancePolicyRule")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "GetCompliancePolicyRule",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CompliancePolicyRule/GetCompliancePolicyRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCompliancePolicyRuleRequest::builder)
                .basePath("/20250228")
                .appendPathParam("compliancePolicyRules")
                .appendPathParam(request.getCompliancePolicyRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CompliancePolicyRule.class,
                        GetCompliancePolicyRuleResponse.Builder::compliancePolicyRule)
                .handleResponseHeaderString("etag", GetCompliancePolicyRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCompliancePolicyRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOnboardingResponse getOnboarding(GetOnboardingRequest request) {

        Validate.notBlank(request.getOnboardingId(), "onboardingId must not be blank");

        return clientCall(request, GetOnboardingResponse::builder)
                .logger(LOG, "getOnboarding")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "GetOnboarding",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Onboarding/GetOnboarding")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOnboardingRequest::builder)
                .basePath("/20250228")
                .appendPathParam("onboardings")
                .appendPathParam(request.getOnboardingId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Onboarding.class,
                        GetOnboardingResponse.Builder::onboarding)
                .handleResponseHeaderString("etag", GetOnboardingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOnboardingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPlatformConfigurationResponse getPlatformConfiguration(
            GetPlatformConfigurationRequest request) {

        Validate.notBlank(
                request.getPlatformConfigurationId(), "platformConfigurationId must not be blank");

        return clientCall(request, GetPlatformConfigurationResponse::builder)
                .logger(LOG, "getPlatformConfiguration")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "GetPlatformConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/PlatformConfiguration/GetPlatformConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPlatformConfigurationRequest::builder)
                .basePath("/20250228")
                .appendPathParam("platformConfigurations")
                .appendPathParam(request.getPlatformConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.PlatformConfiguration.class,
                        GetPlatformConfigurationResponse.Builder::platformConfiguration)
                .handleResponseHeaderString("etag", GetPlatformConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPlatformConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPropertyResponse getProperty(GetPropertyRequest request) {

        Validate.notBlank(request.getPropertyId(), "propertyId must not be blank");

        return clientCall(request, GetPropertyResponse::builder)
                .logger(LOG, "getProperty")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "GetProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Property/GetProperty")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPropertyRequest::builder)
                .basePath("/20250228")
                .appendPathParam("properties")
                .appendPathParam(request.getPropertyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Property.class,
                        GetPropertyResponse.Builder::property)
                .handleResponseHeaderString("etag", GetPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListCompliancePoliciesResponse listCompliancePolicies(
            ListCompliancePoliciesRequest request) {

        return clientCall(request, ListCompliancePoliciesResponse::builder)
                .logger(LOG, "listCompliancePolicies")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ListCompliancePolicies",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CompliancePolicyCollection/ListCompliancePolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCompliancePoliciesRequest::builder)
                .basePath("/20250228")
                .appendPathParam("compliancePolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CompliancePolicyCollection.class,
                        ListCompliancePoliciesResponse.Builder::compliancePolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCompliancePoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCompliancePoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCompliancePolicyRulesResponse listCompliancePolicyRules(
            ListCompliancePolicyRulesRequest request) {

        return clientCall(request, ListCompliancePolicyRulesResponse::builder)
                .logger(LOG, "listCompliancePolicyRules")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ListCompliancePolicyRules",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CompliancePolicyRuleCollection/ListCompliancePolicyRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCompliancePolicyRulesRequest::builder)
                .basePath("/20250228")
                .appendPathParam("compliancePolicyRules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("patchName", request.getPatchName())
                .appendQueryParam("compliancePolicyId", request.getCompliancePolicyId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CompliancePolicyRuleCollection
                                .class,
                        ListCompliancePolicyRulesResponse.Builder::compliancePolicyRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCompliancePolicyRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCompliancePolicyRulesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOnboardingPoliciesResponse listOnboardingPolicies(
            ListOnboardingPoliciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOnboardingPoliciesResponse::builder)
                .logger(LOG, "listOnboardingPolicies")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ListOnboardingPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/OnboardingPolicyCollection/ListOnboardingPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOnboardingPoliciesRequest::builder)
                .basePath("/20250228")
                .appendPathParam("onboardingPolicies")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.OnboardingPolicyCollection.class,
                        ListOnboardingPoliciesResponse.Builder::onboardingPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOnboardingPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOnboardingPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOnboardingsResponse listOnboardings(ListOnboardingsRequest request) {

        return clientCall(request, ListOnboardingsResponse::builder)
                .logger(LOG, "listOnboardings")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ListOnboardings",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/OnboardingCollection/ListOnboardings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOnboardingsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("onboardings")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.OnboardingCollection.class,
                        ListOnboardingsResponse.Builder::onboardingCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOnboardingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOnboardingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPlatformConfigurationsResponse listPlatformConfigurations(
            ListPlatformConfigurationsRequest request) {

        return clientCall(request, ListPlatformConfigurationsResponse::builder)
                .logger(LOG, "listPlatformConfigurations")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ListPlatformConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/PlatformConfigurationCollection/ListPlatformConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPlatformConfigurationsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("platformConfigurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("configCategory", request.getConfigCategory())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.PlatformConfigurationCollection
                                .class,
                        ListPlatformConfigurationsResponse.Builder::platformConfigurationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPlatformConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPlatformConfigurationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPropertiesResponse listProperties(ListPropertiesRequest request) {

        return clientCall(request, ListPropertiesResponse::builder)
                .logger(LOG, "listProperties")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ListProperties",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/PropertyCollection/ListProperties")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPropertiesRequest::builder)
                .basePath("/20250228")
                .appendPathParam("properties")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.PropertyCollection.class,
                        ListPropertiesResponse.Builder::propertyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPropertiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPropertiesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ManageSettingsResponse manageSettings(ManageSettingsRequest request) {

        Validate.notBlank(request.getOnboardingId(), "onboardingId must not be blank");
        Objects.requireNonNull(
                request.getManageSettingsDetails(), "manageSettingsDetails is required");

        return clientCall(request, ManageSettingsResponse::builder)
                .logger(LOG, "manageSettings")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ManageSettings",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Onboarding/ManageSettings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ManageSettingsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("onboardings")
                .appendPathParam(request.getOnboardingId())
                .appendPathParam("actions")
                .appendPathParam("manageSettings")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ManageSettingsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateCompliancePolicyRuleResponse updateCompliancePolicyRule(
            UpdateCompliancePolicyRuleRequest request) {

        Validate.notBlank(
                request.getCompliancePolicyRuleId(), "compliancePolicyRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCompliancePolicyRuleDetails(),
                "updateCompliancePolicyRuleDetails is required");

        return clientCall(request, UpdateCompliancePolicyRuleResponse::builder)
                .logger(LOG, "updateCompliancePolicyRule")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "UpdateCompliancePolicyRule",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CompliancePolicyRule/UpdateCompliancePolicyRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCompliancePolicyRuleRequest::builder)
                .basePath("/20250228")
                .appendPathParam("compliancePolicyRules")
                .appendPathParam(request.getCompliancePolicyRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateCompliancePolicyRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCompliancePolicyRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateOnboardingResponse updateOnboarding(UpdateOnboardingRequest request) {

        Validate.notBlank(request.getOnboardingId(), "onboardingId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOnboardingDetails(), "updateOnboardingDetails is required");

        return clientCall(request, UpdateOnboardingResponse::builder)
                .logger(LOG, "updateOnboarding")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "UpdateOnboarding",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Onboarding/UpdateOnboarding")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOnboardingRequest::builder)
                .basePath("/20250228")
                .appendPathParam("onboardings")
                .appendPathParam(request.getOnboardingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateOnboardingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOnboardingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePlatformConfigurationResponse updatePlatformConfiguration(
            UpdatePlatformConfigurationRequest request) {

        Validate.notBlank(
                request.getPlatformConfigurationId(), "platformConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePlatformConfigurationDetails(),
                "updatePlatformConfigurationDetails is required");

        return clientCall(request, UpdatePlatformConfigurationResponse::builder)
                .logger(LOG, "updatePlatformConfiguration")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "UpdatePlatformConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/PlatformConfiguration/UpdatePlatformConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePlatformConfigurationRequest::builder)
                .basePath("/20250228")
                .appendPathParam("platformConfigurations")
                .appendPathParam(request.getPlatformConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePlatformConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePlatformConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePropertyResponse updateProperty(UpdatePropertyRequest request) {

        Validate.notBlank(request.getPropertyId(), "propertyId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePropertyDetails(), "updatePropertyDetails is required");

        return clientCall(request, UpdatePropertyResponse::builder)
                .logger(LOG, "updateProperty")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "UpdateProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/Property/UpdateProperty")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePropertyRequest::builder)
                .basePath("/20250228")
                .appendPathParam("properties")
                .appendPathParam(request.getPropertyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Property.class,
                        UpdatePropertyResponse.Builder::property)
                .handleResponseHeaderString("etag", UpdatePropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public FleetAppsManagementAdminWaiters getWaiters() {
        return waiters;
    }

    @Override
    public FleetAppsManagementAdminPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementAdminClient(
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
    public FleetAppsManagementAdminClient(
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
    public FleetAppsManagementAdminClient(
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
    public FleetAppsManagementAdminClient(
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
    public FleetAppsManagementAdminClient(
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
    public FleetAppsManagementAdminClient(
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
    public FleetAppsManagementAdminClient(
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
    public FleetAppsManagementAdminClient(
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
