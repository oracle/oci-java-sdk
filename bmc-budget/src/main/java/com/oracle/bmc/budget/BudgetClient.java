/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class BudgetClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Budget {
    /** Service instance for Budget. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("BUDGET")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://usage.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BudgetClient.class);

    private final BudgetWaiters waiters;

    private final BudgetPaginators paginators;

    BudgetClient(
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
                                    .nameFormat("Budget-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new BudgetWaiters(executorService, this);

        this.paginators = new BudgetPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BudgetClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "budget";
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
        public BudgetClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BudgetClient(this, authenticationDetailsProvider, executorService);
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
    public CreateAlertRuleResponse createAlertRule(CreateAlertRuleRequest request) {

        Validate.notBlank(request.getBudgetId(), "budgetId must not be blank");
        Objects.requireNonNull(
                request.getCreateAlertRuleDetails(), "createAlertRuleDetails is required");

        return clientCall(request, CreateAlertRuleResponse::builder)
                .logger(LOG, "createAlertRule")
                .serviceDetails(
                        "Budget",
                        "CreateAlertRule",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/AlertRule/CreateAlertRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAlertRuleRequest::builder)
                .basePath("/20190111")
                .appendPathParam("budgets")
                .appendPathParam(request.getBudgetId())
                .appendPathParam("alertRules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.AlertRule.class,
                        CreateAlertRuleResponse.Builder::alertRule)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAlertRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateAlertRuleResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateBudgetResponse createBudget(CreateBudgetRequest request) {
        Objects.requireNonNull(request.getCreateBudgetDetails(), "createBudgetDetails is required");

        return clientCall(request, CreateBudgetResponse::builder)
                .logger(LOG, "createBudget")
                .serviceDetails(
                        "Budget",
                        "CreateBudget",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/Budget/CreateBudget")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBudgetRequest::builder)
                .basePath("/20190111")
                .appendPathParam("budgets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.Budget.class,
                        CreateBudgetResponse.Builder::budget)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBudgetResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateBudgetResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteAlertRuleResponse deleteAlertRule(DeleteAlertRuleRequest request) {

        Validate.notBlank(request.getBudgetId(), "budgetId must not be blank");

        Validate.notBlank(request.getAlertRuleId(), "alertRuleId must not be blank");

        return clientCall(request, DeleteAlertRuleResponse::builder)
                .logger(LOG, "deleteAlertRule")
                .serviceDetails(
                        "Budget",
                        "DeleteAlertRule",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/AlertRule/DeleteAlertRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAlertRuleRequest::builder)
                .basePath("/20190111")
                .appendPathParam("budgets")
                .appendPathParam(request.getBudgetId())
                .appendPathParam("alertRules")
                .appendPathParam(request.getAlertRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAlertRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteBudgetResponse deleteBudget(DeleteBudgetRequest request) {

        Validate.notBlank(request.getBudgetId(), "budgetId must not be blank");

        return clientCall(request, DeleteBudgetResponse::builder)
                .logger(LOG, "deleteBudget")
                .serviceDetails(
                        "Budget",
                        "DeleteBudget",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/Budget/DeleteBudget")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBudgetRequest::builder)
                .basePath("/20190111")
                .appendPathParam("budgets")
                .appendPathParam(request.getBudgetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBudgetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAlertRuleResponse getAlertRule(GetAlertRuleRequest request) {

        Validate.notBlank(request.getBudgetId(), "budgetId must not be blank");

        Validate.notBlank(request.getAlertRuleId(), "alertRuleId must not be blank");

        return clientCall(request, GetAlertRuleResponse::builder)
                .logger(LOG, "getAlertRule")
                .serviceDetails(
                        "Budget",
                        "GetAlertRule",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/AlertRule/GetAlertRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAlertRuleRequest::builder)
                .basePath("/20190111")
                .appendPathParam("budgets")
                .appendPathParam(request.getBudgetId())
                .appendPathParam("alertRules")
                .appendPathParam(request.getAlertRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.budget.model.AlertRule.class,
                        GetAlertRuleResponse.Builder::alertRule)
                .handleResponseHeaderString("etag", GetAlertRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAlertRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetBudgetResponse getBudget(GetBudgetRequest request) {

        Validate.notBlank(request.getBudgetId(), "budgetId must not be blank");

        return clientCall(request, GetBudgetResponse::builder)
                .logger(LOG, "getBudget")
                .serviceDetails(
                        "Budget",
                        "GetBudget",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/Budget/GetBudget")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBudgetRequest::builder)
                .basePath("/20190111")
                .appendPathParam("budgets")
                .appendPathParam(request.getBudgetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.budget.model.Budget.class, GetBudgetResponse.Builder::budget)
                .handleResponseHeaderString("etag", GetBudgetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBudgetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAlertRulesResponse listAlertRules(ListAlertRulesRequest request) {

        Validate.notBlank(request.getBudgetId(), "budgetId must not be blank");

        return clientCall(request, ListAlertRulesResponse::builder)
                .logger(LOG, "listAlertRules")
                .serviceDetails(
                        "Budget",
                        "ListAlertRules",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/AlertRuleSummary/ListAlertRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAlertRulesRequest::builder)
                .basePath("/20190111")
                .appendPathParam("budgets")
                .appendPathParam(request.getBudgetId())
                .appendPathParam("alertRules")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.budget.model.AlertRuleSummary.class,
                        ListAlertRulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAlertRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAlertRulesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListBudgetsResponse listBudgets(ListBudgetsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBudgetsResponse::builder)
                .logger(LOG, "listBudgets")
                .serviceDetails(
                        "Budget",
                        "ListBudgets",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/BudgetSummary/ListBudgets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBudgetsRequest::builder)
                .basePath("/20190111")
                .appendPathParam("budgets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("targetType", request.getTargetType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.budget.model.BudgetSummary.class,
                        ListBudgetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBudgetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBudgetsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateAlertRuleResponse updateAlertRule(UpdateAlertRuleRequest request) {

        Validate.notBlank(request.getBudgetId(), "budgetId must not be blank");

        Validate.notBlank(request.getAlertRuleId(), "alertRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAlertRuleDetails(), "updateAlertRuleDetails is required");

        return clientCall(request, UpdateAlertRuleResponse::builder)
                .logger(LOG, "updateAlertRule")
                .serviceDetails(
                        "Budget",
                        "UpdateAlertRule",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/AlertRule/UpdateAlertRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAlertRuleRequest::builder)
                .basePath("/20190111")
                .appendPathParam("budgets")
                .appendPathParam(request.getBudgetId())
                .appendPathParam("alertRules")
                .appendPathParam(request.getAlertRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.AlertRule.class,
                        UpdateAlertRuleResponse.Builder::alertRule)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAlertRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateAlertRuleResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateBudgetResponse updateBudget(UpdateBudgetRequest request) {

        Validate.notBlank(request.getBudgetId(), "budgetId must not be blank");
        Objects.requireNonNull(request.getUpdateBudgetDetails(), "updateBudgetDetails is required");

        return clientCall(request, UpdateBudgetResponse::builder)
                .logger(LOG, "updateBudget")
                .serviceDetails(
                        "Budget",
                        "UpdateBudget",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/Budget/UpdateBudget")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBudgetRequest::builder)
                .basePath("/20190111")
                .appendPathParam("budgets")
                .appendPathParam(request.getBudgetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.Budget.class,
                        UpdateBudgetResponse.Builder::budget)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBudgetResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateBudgetResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BudgetWaiters getWaiters() {
        return waiters;
    }

    @Override
    public BudgetPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BudgetClient(
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
    public BudgetClient(
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
    public BudgetClient(
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
    public BudgetClient(
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
    public BudgetClient(
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
    public BudgetClient(
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
    public BudgetClient(
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
    public BudgetClient(
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
