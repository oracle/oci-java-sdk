/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Budget service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class BudgetAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements BudgetAsync {
    /** Service instance for Budget. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("BUDGET")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://usage.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BudgetAsyncClient.class);

    private BudgetAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BudgetAsyncClient> {
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
        public BudgetAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BudgetAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateAlertRuleResponse> createAlertRule(
            CreateAlertRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAlertRuleRequest, CreateAlertRuleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBudgetResponse> createBudget(
            CreateBudgetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBudgetRequest, CreateBudgetResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlertRuleResponse> deleteAlertRule(
            DeleteAlertRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAlertRuleRequest, DeleteAlertRuleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBudgetResponse> deleteBudget(
            DeleteBudgetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBudgetRequest, DeleteBudgetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAlertRuleResponse> getAlertRule(
            GetAlertRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAlertRuleRequest, GetAlertRuleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBudgetResponse> getBudget(
            GetBudgetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBudgetRequest, GetBudgetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAlertRulesResponse> listAlertRules(
            ListAlertRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlertRulesRequest, ListAlertRulesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBudgetsResponse> listBudgets(
            ListBudgetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBudgetsRequest, ListBudgetsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAlertRuleResponse> updateAlertRule(
            UpdateAlertRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAlertRuleRequest, UpdateAlertRuleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBudgetResponse> updateBudget(
            UpdateBudgetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateBudgetRequest, UpdateBudgetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BudgetAsyncClient(
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
    public BudgetAsyncClient(
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
    public BudgetAsyncClient(
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
    public BudgetAsyncClient(
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
    public BudgetAsyncClient(
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
    public BudgetAsyncClient(
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
    public BudgetAsyncClient(
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
