/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.governancerulescontrolplane.requests.*;
import com.oracle.bmc.governancerulescontrolplane.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
public class GovernanceRuleClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements GovernanceRule {
    /** Service instance for GovernanceRule. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("GOVERNANCERULE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://governance-rules.organizations.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GovernanceRuleAsyncClient.class);

    private final GovernanceRuleWaiters waiters;

    private final GovernanceRulePaginators paginators;

    private GovernanceRuleClient(
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
                                    .nameFormat("GovernanceRule-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new GovernanceRuleWaiters(executorService, this);

        this.paginators = new GovernanceRulePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, GovernanceRuleClient> {
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
        public GovernanceRuleClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GovernanceRuleClient(this, authenticationDetailsProvider, executorService);
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
    public CreateGovernanceRuleResponse createGovernanceRule(CreateGovernanceRuleRequest request) {
        Objects.requireNonNull(
                request.getCreateGovernanceRuleDetails(),
                "createGovernanceRuleDetails is required");

        return clientCall(request, CreateGovernanceRuleResponse::builder)
                .logger(LOG, "createGovernanceRule")
                .serviceDetails("GovernanceRule", "CreateGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.GovernanceRule.class,
                        CreateGovernanceRuleResponse.Builder::governanceRule)
                .handleResponseHeaderString("etag", CreateGovernanceRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateGovernanceRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGovernanceRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateGovernanceRuleResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateInclusionCriterionResponse createInclusionCriterion(
            CreateInclusionCriterionRequest request) {
        Objects.requireNonNull(
                request.getCreateInclusionCriterionDetails(),
                "createInclusionCriterionDetails is required");

        return clientCall(request, CreateInclusionCriterionResponse::builder)
                .logger(LOG, "createInclusionCriterion")
                .serviceDetails("GovernanceRule", "CreateInclusionCriterion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInclusionCriterionRequest::builder)
                .basePath("/20220504")
                .appendPathParam("inclusionCriteria")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion.class,
                        CreateInclusionCriterionResponse.Builder::inclusionCriterion)
                .handleResponseHeaderString("etag", CreateInclusionCriterionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateInclusionCriterionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateInclusionCriterionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateInclusionCriterionResponse.Builder::location)
                .callSync();
    }

    @Override
    public DeleteGovernanceRuleResponse deleteGovernanceRule(DeleteGovernanceRuleRequest request) {

        Validate.notBlank(request.getGovernanceRuleId(), "governanceRuleId must not be blank");

        return clientCall(request, DeleteGovernanceRuleResponse::builder)
                .logger(LOG, "deleteGovernanceRule")
                .serviceDetails("GovernanceRule", "DeleteGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .appendPathParam(request.getGovernanceRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteGovernanceRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGovernanceRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteInclusionCriterionResponse deleteInclusionCriterion(
            DeleteInclusionCriterionRequest request) {

        Validate.notBlank(
                request.getInclusionCriterionId(), "inclusionCriterionId must not be blank");

        return clientCall(request, DeleteInclusionCriterionResponse::builder)
                .logger(LOG, "deleteInclusionCriterion")
                .serviceDetails("GovernanceRule", "DeleteInclusionCriterion", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteInclusionCriterionRequest::builder)
                .basePath("/20220504")
                .appendPathParam("inclusionCriteria")
                .appendPathParam(request.getInclusionCriterionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteInclusionCriterionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteInclusionCriterionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetEnforcedGovernanceRuleResponse getEnforcedGovernanceRule(
            GetEnforcedGovernanceRuleRequest request) {

        Validate.notBlank(
                request.getEnforcedGovernanceRuleId(),
                "enforcedGovernanceRuleId must not be blank");

        return clientCall(request, GetEnforcedGovernanceRuleResponse::builder)
                .logger(LOG, "getEnforcedGovernanceRule")
                .serviceDetails("GovernanceRule", "GetEnforcedGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEnforcedGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("enforcedGovernanceRules")
                .appendPathParam(request.getEnforcedGovernanceRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.EnforcedGovernanceRule
                                .class,
                        GetEnforcedGovernanceRuleResponse.Builder::enforcedGovernanceRule)
                .handleResponseHeaderString("etag", GetEnforcedGovernanceRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEnforcedGovernanceRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetGovernanceRuleResponse getGovernanceRule(GetGovernanceRuleRequest request) {

        Validate.notBlank(request.getGovernanceRuleId(), "governanceRuleId must not be blank");

        return clientCall(request, GetGovernanceRuleResponse::builder)
                .logger(LOG, "getGovernanceRule")
                .serviceDetails("GovernanceRule", "GetGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .appendPathParam(request.getGovernanceRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.GovernanceRule.class,
                        GetGovernanceRuleResponse.Builder::governanceRule)
                .handleResponseHeaderString("etag", GetGovernanceRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGovernanceRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInclusionCriterionResponse getInclusionCriterion(
            GetInclusionCriterionRequest request) {

        Validate.notBlank(
                request.getInclusionCriterionId(), "inclusionCriterionId must not be blank");

        return clientCall(request, GetInclusionCriterionResponse::builder)
                .logger(LOG, "getInclusionCriterion")
                .serviceDetails("GovernanceRule", "GetInclusionCriterion", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInclusionCriterionRequest::builder)
                .basePath("/20220504")
                .appendPathParam("inclusionCriteria")
                .appendPathParam(request.getInclusionCriterionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion.class,
                        GetInclusionCriterionResponse.Builder::inclusionCriterion)
                .handleResponseHeaderString("etag", GetInclusionCriterionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInclusionCriterionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTenancyAttachmentResponse getTenancyAttachment(GetTenancyAttachmentRequest request) {

        Validate.notBlank(
                request.getTenancyAttachmentId(), "tenancyAttachmentId must not be blank");

        return clientCall(request, GetTenancyAttachmentResponse::builder)
                .logger(LOG, "getTenancyAttachment")
                .serviceDetails("GovernanceRule", "GetTenancyAttachment", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTenancyAttachmentRequest::builder)
                .basePath("/20220504")
                .appendPathParam("tenancyAttachments")
                .appendPathParam(request.getTenancyAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachment.class,
                        GetTenancyAttachmentResponse.Builder::tenancyAttachment)
                .handleResponseHeaderString("etag", GetTenancyAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTenancyAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListEnforcedGovernanceRulesResponse listEnforcedGovernanceRules(
            ListEnforcedGovernanceRulesRequest request) {

        return clientCall(request, ListEnforcedGovernanceRulesResponse::builder)
                .logger(LOG, "listEnforcedGovernanceRules")
                .serviceDetails("GovernanceRule", "ListEnforcedGovernanceRules", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEnforcedGovernanceRulesRequest::builder)
                .basePath("/20220504")
                .appendPathParam("enforcedGovernanceRules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("enforcedGovernanceRuleId", request.getEnforcedGovernanceRuleId())
                .appendEnumQueryParam("governanceRuleType", request.getGovernanceRuleType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model
                                .EnforcedGovernanceRuleCollection.class,
                        ListEnforcedGovernanceRulesResponse.Builder
                                ::enforcedGovernanceRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEnforcedGovernanceRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEnforcedGovernanceRulesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListGovernanceRulesResponse listGovernanceRules(ListGovernanceRulesRequest request) {

        return clientCall(request, ListGovernanceRulesResponse::builder)
                .logger(LOG, "listGovernanceRules")
                .serviceDetails("GovernanceRule", "ListGovernanceRules", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGovernanceRulesRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("governanceRuleId", request.getGovernanceRuleId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("governanceRuleType", request.getGovernanceRuleType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleCollection
                                .class,
                        ListGovernanceRulesResponse.Builder::governanceRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGovernanceRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGovernanceRulesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListInclusionCriteriaResponse listInclusionCriteria(
            ListInclusionCriteriaRequest request) {
        Objects.requireNonNull(request.getGovernanceRuleId(), "governanceRuleId is required");

        return clientCall(request, ListInclusionCriteriaResponse::builder)
                .logger(LOG, "listInclusionCriteria")
                .serviceDetails("GovernanceRule", "ListInclusionCriteria", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInclusionCriteriaRequest::builder)
                .basePath("/20220504")
                .appendPathParam("inclusionCriteria")
                .appendQueryParam("governanceRuleId", request.getGovernanceRuleId())
                .appendQueryParam("inclusionCriterionId", request.getInclusionCriterionId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model
                                .InclusionCriterionCollection.class,
                        ListInclusionCriteriaResponse.Builder::inclusionCriterionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInclusionCriteriaResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInclusionCriteriaResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListTenancyAttachmentsResponse listTenancyAttachments(
            ListTenancyAttachmentsRequest request) {

        return clientCall(request, ListTenancyAttachmentsResponse::builder)
                .logger(LOG, "listTenancyAttachments")
                .serviceDetails("GovernanceRule", "ListTenancyAttachments", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTenancyAttachmentsRequest::builder)
                .basePath("/20220504")
                .appendPathParam("tenancyAttachments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("tenancyAttachmentId", request.getTenancyAttachmentId())
                .appendQueryParam("governanceRuleId", request.getGovernanceRuleId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("childTenancyId", request.getChildTenancyId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachmentCollection
                                .class,
                        ListTenancyAttachmentsResponse.Builder::tenancyAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTenancyAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTenancyAttachmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RetryGovernanceRuleResponse retryGovernanceRule(RetryGovernanceRuleRequest request) {

        Validate.notBlank(request.getGovernanceRuleId(), "governanceRuleId must not be blank");

        return clientCall(request, RetryGovernanceRuleResponse::builder)
                .logger(LOG, "retryGovernanceRule")
                .serviceDetails("GovernanceRule", "RetryGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetryGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .appendPathParam(request.getGovernanceRuleId())
                .appendPathParam("actions")
                .appendPathParam("retry")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RetryGovernanceRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RetryGovernanceRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RetryTenancyAttachmentResponse retryTenancyAttachment(
            RetryTenancyAttachmentRequest request) {

        Validate.notBlank(
                request.getTenancyAttachmentId(), "tenancyAttachmentId must not be blank");

        return clientCall(request, RetryTenancyAttachmentResponse::builder)
                .logger(LOG, "retryTenancyAttachment")
                .serviceDetails("GovernanceRule", "RetryTenancyAttachment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetryTenancyAttachmentRequest::builder)
                .basePath("/20220504")
                .appendPathParam("tenancyAttachments")
                .appendPathParam(request.getTenancyAttachmentId())
                .appendPathParam("actions")
                .appendPathParam("retry")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RetryTenancyAttachmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RetryTenancyAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateGovernanceRuleResponse updateGovernanceRule(UpdateGovernanceRuleRequest request) {

        Validate.notBlank(request.getGovernanceRuleId(), "governanceRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateGovernanceRuleDetails(),
                "updateGovernanceRuleDetails is required");

        return clientCall(request, UpdateGovernanceRuleResponse::builder)
                .logger(LOG, "updateGovernanceRule")
                .serviceDetails("GovernanceRule", "UpdateGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .appendPathParam(request.getGovernanceRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateGovernanceRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGovernanceRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GovernanceRuleWaiters getWaiters() {
        return waiters;
    }

    @Override
    public GovernanceRulePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GovernanceRuleClient(
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
    public GovernanceRuleClient(
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
    public GovernanceRuleClient(
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
    public GovernanceRuleClient(
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
    public GovernanceRuleClient(
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
    public GovernanceRuleClient(
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
    public GovernanceRuleClient(
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
    public GovernanceRuleClient(
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
