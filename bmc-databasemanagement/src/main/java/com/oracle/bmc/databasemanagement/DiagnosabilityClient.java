/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class DiagnosabilityClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Diagnosability {
    /** Service instance for Diagnosability. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DIAGNOSABILITY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbmgmt.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DiagnosabilityClient.class);

    private final DiagnosabilityPaginators paginators;

    DiagnosabilityClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new DiagnosabilityPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DiagnosabilityClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "databasemanagement";
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
        public DiagnosabilityClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DiagnosabilityClient(this, authenticationDetailsProvider);
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
    public ListAlertLogsResponse listAlertLogs(ListAlertLogsRequest request) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListAlertLogsResponse::builder)
                .logger(LOG, "listAlertLogs")
                .serviceDetails(
                        "Diagnosability",
                        "ListAlertLogs",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAlertLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAlertLogsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("alertLogs")
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendEnumQueryParam("levelFilter", request.getLevelFilter())
                .appendEnumQueryParam("typeFilter", request.getTypeFilter())
                .appendQueryParam("logSearchText", request.getLogSearchText())
                .appendQueryParam("isRegularExpression", request.getIsRegularExpression())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AlertLogCollection.class,
                        ListAlertLogsResponse.Builder::alertLogCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAlertLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAlertLogsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAttentionLogsResponse listAttentionLogs(ListAttentionLogsRequest request) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListAttentionLogsResponse::builder)
                .logger(LOG, "listAttentionLogs")
                .serviceDetails(
                        "Diagnosability",
                        "ListAttentionLogs",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAttentionLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAttentionLogsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("attentionLogs")
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendEnumQueryParam("urgencyFilter", request.getUrgencyFilter())
                .appendEnumQueryParam("typeFilter", request.getTypeFilter())
                .appendQueryParam("logSearchText", request.getLogSearchText())
                .appendQueryParam("isRegularExpression", request.getIsRegularExpression())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AttentionLogCollection.class,
                        ListAttentionLogsResponse.Builder::attentionLogCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAttentionLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAttentionLogsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeAlertLogCountsResponse summarizeAlertLogCounts(
            SummarizeAlertLogCountsRequest request) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, SummarizeAlertLogCountsResponse::builder)
                .logger(LOG, "summarizeAlertLogCounts")
                .serviceDetails(
                        "Diagnosability",
                        "SummarizeAlertLogCounts",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAlertLogCounts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAlertLogCountsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("alertLogCounts")
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendEnumQueryParam("levelFilter", request.getLevelFilter())
                .appendEnumQueryParam("groupBy", request.getGroupBy())
                .appendEnumQueryParam("typeFilter", request.getTypeFilter())
                .appendQueryParam("logSearchText", request.getLogSearchText())
                .appendQueryParam("isRegularExpression", request.getIsRegularExpression())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AlertLogCountsCollection.class,
                        SummarizeAlertLogCountsResponse.Builder::alertLogCountsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAlertLogCountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAlertLogCountsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeAttentionLogCountsResponse summarizeAttentionLogCounts(
            SummarizeAttentionLogCountsRequest request) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, SummarizeAttentionLogCountsResponse::builder)
                .logger(LOG, "summarizeAttentionLogCounts")
                .serviceDetails(
                        "Diagnosability",
                        "SummarizeAttentionLogCounts",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAttentionLogCounts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAttentionLogCountsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("attentionLogCounts")
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendEnumQueryParam("urgencyFilter", request.getUrgencyFilter())
                .appendEnumQueryParam("groupBy", request.getGroupBy())
                .appendEnumQueryParam("typeFilter", request.getTypeFilter())
                .appendQueryParam("logSearchText", request.getLogSearchText())
                .appendQueryParam("isRegularExpression", request.getIsRegularExpression())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-named-credential-id", request.getOpcNamedCredentialId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.AttentionLogCountsCollection.class,
                        SummarizeAttentionLogCountsResponse.Builder::attentionLogCountsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeAttentionLogCountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAttentionLogCountsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public DiagnosabilityPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DiagnosabilityClient(
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
    public DiagnosabilityClient(
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
    public DiagnosabilityClient(
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
    public DiagnosabilityClient(
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
    public DiagnosabilityClient(
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
    public DiagnosabilityClient(
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
    public DiagnosabilityClient(
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
